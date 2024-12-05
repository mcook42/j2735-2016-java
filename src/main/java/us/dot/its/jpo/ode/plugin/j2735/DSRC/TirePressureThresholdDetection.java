package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import lombok.Getter;
import us.dot.its.jpo.ode.plugin.types.Asn1Enumerated;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 
 *******************************************************************************
 *
 * This source file was generated by a tool. Beware manual edits might be
 * overwritten in future releases. asn1jvm v1.0-SNAPSHOT
 *
 *******************************************************************************
 * Copyright 2024 USDOT
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************
 * 
 */
@Getter
@JsonSerialize(using = TirePressureThresholdDetectionSerializer.class)
@JsonDeserialize(using = TirePressureThresholdDetectionDeserializer.class)
public enum TirePressureThresholdDetection implements Asn1Enumerated {
	NODATA(0, "noData"), OVERPRESSURE(1, "overPressure"), NOWARNINGPRESSURE(2, "noWarningPressure"), UNDERPRESSURE(3,
			"underPressure"), EXTREMEUNDERPRESSURE(4, "extremeUnderPressure"), UNDEFINED(5,
					"undefined"), ERRORINDICATOR(6, "errorIndicator"), NOTAVAILABLE(7, "notAvailable");

	private final int index;
	private final String name;

	public boolean hasExtensionMarker() {
		return false;
	}

	private TirePressureThresholdDetection(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 7;
	}
}