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
@JsonSerialize(using = BrakeAppliedPressureSerializer.class)
@JsonDeserialize(using = BrakeAppliedPressureDeserializer.class)
public enum BrakeAppliedPressure implements Asn1Enumerated {
	UNAVAILABLE(0, "unavailable"), MINPRESSURE(1, "minPressure"), BKLVL_2(2, "bkLvl-2"), BKLVL_3(3, "bkLvl-3"), BKLVL_4(
			4, "bkLvl-4"), BKLVL_5(5, "bkLvl-5"), BKLVL_6(6, "bkLvl-6"), BKLVL_7(7, "bkLvl-7"), BKLVL_8(8,
					"bkLvl-8"), BKLVL_9(9, "bkLvl-9"), BKLVL_10(10, "bkLvl-10"), BKLVL_11(11, "bkLvl-11"), BKLVL_12(12,
							"bkLvl-12"), BKLVL_13(13,
									"bkLvl-13"), BKLVL_14(14, "bkLvl-14"), MAXPRESSURE(15, "maxPressure");

	private final int index;
	private final String name;

	public boolean hasExtensionMarker() {
		return false;
	}

	private BrakeAppliedPressure(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 15;
	}
}