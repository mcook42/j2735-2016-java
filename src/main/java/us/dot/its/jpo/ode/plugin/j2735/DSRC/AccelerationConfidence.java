/*==============================================================================
 *
 * This source file was generated by a tool.
 * Beware manual edits might be overwritten in future releases.
 * asn1jvm v1.0-SNAPSHOT
 *
 *------------------------------------------------------------------------------
 * Copyright 2024 USDOT
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
 *============================================================================*/

package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.types.Asn1Enumerated;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;

@Getter
@JsonSerialize(using = AccelerationConfidenceSerializer.class)
@JsonDeserialize(using = AccelerationConfidenceDeserializer.class)
public enum AccelerationConfidence implements Asn1Enumerated {
	UNAVAILABLE(0, "unavailable"), ACCL_100_00(1, "accl-100-00"), ACCL_010_00(2, "accl-010-00"), ACCL_005_00(3,
			"accl-005-00"), ACCL_001_00(4, "accl-001-00"), ACCL_000_10(5,
					"accl-000-10"), ACCL_000_05(6, "accl-000-05"), ACCL_000_01(7, "accl-000-01");

	private final int index;
	private final String name;

	public boolean hasExtensionMarker() {
		return false;
	}

	private AccelerationConfidence(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 7;
	}
}