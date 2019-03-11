/*******************************************************************************
 * Copyright 2019 Softeam
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.measure.smm.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.measure.smm.application.model.SMMApplication;
import org.measure.smm.measure.model.SMMMeasure;

public class ApplicationPackager {

	public static final String MEATADATAFILE = "ApplicationMetadata.xml";

	public static SMMApplication getApplicationData(Path metadataPath) throws JAXBException, ZipException, IOException {
		if(metadataPath.toFile().exists()){
			JAXBContext context = JAXBContext.newInstance(SMMApplication.class);
			Unmarshaller um = context.createUnmarshaller();
			SMMApplication  application = (SMMApplication) um.unmarshal(new FileReader(metadataPath.toFile()));
			
			return application;
		}
		throw new FileNotFoundException();
	}
	
	
	public static SMMApplication getApplicationDataFromZip(Path zipPath) throws JAXBException, ZipException, IOException {
		try (ZipFile zipFile = new ZipFile(zipPath.toFile())) {
			Enumeration<? extends ZipEntry> entries = zipFile.entries();
			while (entries.hasMoreElements()) {
				ZipEntry entry = entries.nextElement();
				if (entry.getName().equals(MEATADATAFILE)) {
					InputStream stream = zipFile.getInputStream(entry);
					JAXBContext context = JAXBContext.newInstance(SMMApplication.class);
					Unmarshaller um = context.createUnmarshaller();
					return (SMMApplication) um.unmarshal(stream);
				}
			}
		}
		return null;
	}
	
}
