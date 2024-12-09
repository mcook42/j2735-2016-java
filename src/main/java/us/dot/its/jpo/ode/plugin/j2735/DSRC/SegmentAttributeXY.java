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
@JsonSerialize(using = SegmentAttributeXYSerializer.class)
@JsonDeserialize(using = SegmentAttributeXYDeserializer.class)
public enum SegmentAttributeXY implements Asn1Enumerated {
	RESERVED(0, "reserved"), DONOTBLOCK(1, "doNotBlock"), WHITELINE(2, "whiteLine"), MERGINGLANELEFT(3,
			"mergingLaneLeft"), MERGINGLANERIGHT(4, "mergingLaneRight"), CURBONLEFT(5, "curbOnLeft"), CURBONRIGHT(6,
					"curbOnRight"), LOADINGZONEONLEFT(7, "loadingzoneOnLeft"), LOADINGZONEONRIGHT(8,
							"loadingzoneOnRight"), TURNOUTPOINTONLEFT(9, "turnOutPointOnLeft"), TURNOUTPOINTONRIGHT(10,
									"turnOutPointOnRight"), ADJACENTPARKINGONLEFT(11,
											"adjacentParkingOnLeft"), ADJACENTPARKINGONRIGHT(12,
													"adjacentParkingOnRight"), ADJACENTBIKELANEONLEFT(13,
															"adjacentBikeLaneOnLeft"), ADJACENTBIKELANEONRIGHT(14,
																	"adjacentBikeLaneOnRight"), SHAREDBIKELANE(15,
																			"sharedBikeLane"), BIKEBOXINFRONT(16,
																					"bikeBoxInFront"), TRANSITSTOPONLEFT(
																							17,
																							"transitStopOnLeft"), TRANSITSTOPONRIGHT(
																									18,
																									"transitStopOnRight"), TRANSITSTOPINLANE(
																											19,
																											"transitStopInLane"), SHAREDWITHTRACKEDVEHICLE(
																													20,
																													"sharedWithTrackedVehicle"), SAFEISLAND(
																															21,
																															"safeIsland"), LOWCURBSPRESENT(
																																	22,
																																	"lowCurbsPresent"), RUMBLESTRIPPRESENT(
																																			23,
																																			"rumbleStripPresent"), AUDIBLESIGNALINGPRESENT(
																																					24,
																																					"audibleSignalingPresent"), ADAPTIVETIMINGPRESENT(
																																							25,
																																							"adaptiveTimingPresent"), RFSIGNALREQUESTPRESENT(
																																									26,
																																									"rfSignalRequestPresent"), PARTIALCURBINTRUSION(
																																											27,
																																											"partialCurbIntrusion"), TAPERTOLEFT(
																																													28,
																																													"taperToLeft"), TAPERTORIGHT(
																																															29,
																																															"taperToRight"), TAPERTOCENTERLINE(
																																																	30,
																																																	"taperToCenterLine"), PARALLELPARKING(
																																																			31,
																																																			"parallelParking"), HEADINPARKING(
																																																					32,
																																																					"headInParking"), FREEPARKING(
																																																							33,
																																																							"freeParking"), TIMERESTRICTIONSONPARKING(
																																																									34,
																																																									"timeRestrictionsOnParking"), COSTTOPARK(
																																																											35,
																																																											"costToPark"), MIDBLOCKCURBPRESENT(
																																																													36,
																																																													"midBlockCurbPresent"), UNEVENPAVEMENTPRESENT(
																																																															37,
																																																															"unEvenPavementPresent");

	private final int index;
	private final String name;

	public boolean hasExtensionMarker() {
		return false;
	}

	private SegmentAttributeXY(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 37;
	}
}