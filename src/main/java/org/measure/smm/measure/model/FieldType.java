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

import java.util.Date;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum(String.class)	
public enum FieldType {
    u_text("Text"),
    u_keyword("Text"),
    u_long("0"), 
    u_integer("0"),
    u_short("0"),
    u_byte("0"), 
    u_double("0"), 
    u_float("0"),
    u_half_float("0"), 
    u_scaled_float("0"),
    u_date(new Date()),
    u_boolean(true),
    u_binary("0"),
    u_integer_range("0"),
    u_float_range("0"), 
    u_long_range("0"), 
    u_double_range("0"), 
    u_date_range("0"),
    u_geo_point("41.12,-71.34"),
    u_geo_shape("1m"),
    u_ip("0.0.0.0"),
    u_completion("Text"),
    u_token_count("0"),
    u_murmur3("Text");

	private Object instance;
	
	private FieldType(Object instance){
		this.instance = instance;
	}
	
	public Object getInstance() {
		return instance;
	} 
}
