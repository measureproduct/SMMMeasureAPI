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
package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class MeasureReference {
	
	private String measureRef;
	
	private FieldType fieldType; 
	
	private String role;
	
	private int number;
	
	private String filter;
	
	@XmlAttribute
	public String getMeasureRef() {
		return measureRef;
	}

	public void setMeasureRef(String measureRef) {
		this.measureRef = measureRef;
	}


	@XmlAttribute
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@XmlAttribute
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@XmlAttribute
	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}
	
	@XmlAttribute
	public FieldType getFieldType() {
		return fieldType;
	}
	
	public void setFieldType(FieldType fieldType) {
		this.fieldType = fieldType;
	}
	
	
}
