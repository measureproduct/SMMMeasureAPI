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

public class ScopeProperty {
	
	private String name;

	private String defaultValue;
	
	private String description;
	
	private ScopePropertyType type;
	
	private ScopePropertyEnum enumType;
	
	@XmlAttribute	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlAttribute
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	@XmlAttribute
	public ScopePropertyType getType() {
		return type;
	}
	public void setType(ScopePropertyType type) {
		this.type = type;
	}
	
	public ScopePropertyEnum getEnumType() {
		return enumType;
	}
	public void setEnumType(ScopePropertyEnum enumType) {
		this.enumType = enumType;
	}
}
