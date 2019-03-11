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

public class DataSource {

	private String dataIndex;
	private String dateIndex;
	private String timePeriode;
	private String timeAggregation;

	@XmlAttribute
	public String getDataIndex() {
		return dataIndex;
	}

	public void setDataIndex(String dataIndex) {
		this.dataIndex = dataIndex;
	}

	@XmlAttribute
	public String getDateIndex() {
		return dateIndex;
	}

	public void setDateIndex(String dateIndex) {
		this.dateIndex = dateIndex;
	}

	@XmlAttribute
	public String getTimePeriode() {
		return timePeriode;
	}

	public void setTimePeriode(String timePeriode) {
		this.timePeriode = timePeriode;
	}

	@XmlAttribute
	public String getTimeAggregation() {
		return timeAggregation;
	}

	public void setTimeAggregation(String timeAggreation) {
		this.timeAggregation = timeAggreation;

	}

}
