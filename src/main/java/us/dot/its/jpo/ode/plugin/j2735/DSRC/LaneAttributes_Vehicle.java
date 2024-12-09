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

import us.dot.its.jpo.ode.plugin.types.Asn1Bitstring;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = LaneAttributes_VehicleDeserializer.class)
public class LaneAttributes_Vehicle extends Asn1Bitstring {

	public boolean isIsVehicleRevocableLane() {
		return get(0);
	}

	public void setIsVehicleRevocableLane(boolean isVehicleRevocableLane) {
		set(0, isVehicleRevocableLane);
	}

	public boolean isIsVehicleFlyOverLane() {
		return get(1);
	}

	public void setIsVehicleFlyOverLane(boolean isVehicleFlyOverLane) {
		set(1, isVehicleFlyOverLane);
	}

	public boolean isHovLaneUseOnly() {
		return get(2);
	}

	public void setHovLaneUseOnly(boolean hovLaneUseOnly) {
		set(2, hovLaneUseOnly);
	}

	public boolean isRestrictedToBusUse() {
		return get(3);
	}

	public void setRestrictedToBusUse(boolean restrictedToBusUse) {
		set(3, restrictedToBusUse);
	}

	public boolean isRestrictedToTaxiUse() {
		return get(4);
	}

	public void setRestrictedToTaxiUse(boolean restrictedToTaxiUse) {
		set(4, restrictedToTaxiUse);
	}

	public boolean isRestrictedFromPublicUse() {
		return get(5);
	}

	public void setRestrictedFromPublicUse(boolean restrictedFromPublicUse) {
		set(5, restrictedFromPublicUse);
	}

	public boolean isHasIRbeaconCoverage() {
		return get(6);
	}

	public void setHasIRbeaconCoverage(boolean hasIRbeaconCoverage) {
		set(6, hasIRbeaconCoverage);
	}

	public boolean isPermissionOnRequest() {
		return get(7);
	}

	public void setPermissionOnRequest(boolean permissionOnRequest) {
		set(7, permissionOnRequest);
	}

	public LaneAttributes_Vehicle() {
		super(8, false,
				new String[]{"isVehicleRevocableLane", "isVehicleFlyOverLane", "hovLaneUseOnly", "restrictedToBusUse",
						"restrictedToTaxiUse", "restrictedFromPublicUse", "hasIRbeaconCoverage",
						"permissionOnRequest"});
	}
}