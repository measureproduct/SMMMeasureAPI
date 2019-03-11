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
package org.measure.smm.remote;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RemoteMeasureInstance{
		private Long measureId;

		private String instanceName;

		private String measureName;

		private String measureVersion;
		
		private String shedulingExpression;
		
		private Map<String, String>  properties = new HashMap<>();

		public String getInstanceName() {
			return instanceName;
		}
		
		public Long getMeasureId() {
			return measureId;
		}


		public void setMeasureId(Long measureId) {
			this.measureId = measureId;
		}


		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getMeasureName() {
			return measureName;
		}

		public void setMeasureName(String measureName) {
			this.measureName = measureName;
		}

		public String getMeasureVersion() {
			return measureVersion;
		}

		public void setMeasureVersion(String measureVersion) {
			this.measureVersion = measureVersion;
		}

		public Map<String, String> getProperties() {
			return properties;
		}

		public void setProperties(Map<String, String> properties) {
			this.properties = properties;
		}

		public String getShedulingExpression() {
			return shedulingExpression;
		}

		public void setShedulingExpression(String shedulingExpression) {
			this.shedulingExpression = shedulingExpression;
		}
	}
