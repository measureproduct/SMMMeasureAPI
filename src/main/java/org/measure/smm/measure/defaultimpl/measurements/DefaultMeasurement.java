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
package org.measure.smm.measure.defaultimpl.measurements;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.measure.smm.measure.api.IMeasurement;

public class DefaultMeasurement implements IMeasurement {
	
	protected Map<String, Object> valueMap;
	
	public DefaultMeasurement(){
		this.valueMap = new HashMap<>();
		this.valueMap.put("postDate", new Date());
	}

	public void addValue(String property,Object value){
		this.valueMap.put(property,value);
	}

	@Override
	public Map<String, Object> getValues() {
		return valueMap;
	}


	@Override
	public String getLabel() {
		return valueMap.toString();
	}
}
