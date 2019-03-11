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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.measure.smm.measure.api.IDerivedMeasure;
import org.measure.smm.measure.api.IMeasurement;

public abstract class DerivedMeasure implements IDerivedMeasure {

	protected Map<String, String> properties = new HashMap<>();;
	protected Map<String, List<IMeasurement>> referenceMap = new HashMap<>();
	protected Map<String, List<IMeasurement>> roleMap = new HashMap<>();;

	@Override
	public Map<String, String> getProperties() {
		return this.properties;
	}

	public String getProperty(String property) {
		String result = properties.get(property);
		if (result != null) {
			return result;
		}
		return "";
	}

	public List<IMeasurement> getMeasureInputByName(String name) {
		return referenceMap.get(name);
	}

	public List<IMeasurement> getMeasureInputByRole(String role) {
		return roleMap.get(role);
	}

	@Override
	public void addMeasureInput(String reference, String role, IMeasurement value) {
		List<IMeasurement> references = referenceMap.get(reference);
		if (references == null) {
			references = new ArrayList<>();
			referenceMap.put(reference, references);
		}
		references.add(value);

		List<IMeasurement> roles = roleMap.get(role);
		if (roles == null) {
			roles = new ArrayList<>();
			roleMap.put(role, roles);
		}
		roles.add(value);
	}

	@Override
	public void cleanMeasureInput() {
		this.referenceMap = new HashMap<>();
		this.roleMap = new HashMap<>();
	}

	@Override
	public abstract List<IMeasurement> calculateMeasurement() throws Exception;

}
