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
package org.measure.smm.measure.defaultimpl.measures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.measure.smm.measure.api.IDirectMeasure;
import org.measure.smm.measure.api.IMeasurement;

public abstract class DirectMeasure implements IDirectMeasure {

	private  Map<String, String> properties = new HashMap<>();
	
	@Override
	public Map<String,String> getProperties(){
		return this.properties;
	}
	
	public String getProperty(String property){
		String result =  properties.get(property);		
		if(result != null){
			return result;
		}		
		return "";
	}

	@Override
	public abstract List<IMeasurement> getMeasurement() throws Exception;

}
