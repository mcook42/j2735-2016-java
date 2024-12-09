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

@JsonDeserialize(using = GNSSstatusDeserializer.class)
public class GNSSstatus extends Asn1Bitstring {

	public boolean isUnavailable() {
		return get(0);
	}

	public void setUnavailable(boolean unavailable) {
		set(0, unavailable);
	}

	public boolean isIsHealthy() {
		return get(1);
	}

	public void setIsHealthy(boolean isHealthy) {
		set(1, isHealthy);
	}

	public boolean isIsMonitored() {
		return get(2);
	}

	public void setIsMonitored(boolean isMonitored) {
		set(2, isMonitored);
	}

	public boolean isBaseStationType() {
		return get(3);
	}

	public void setBaseStationType(boolean baseStationType) {
		set(3, baseStationType);
	}

	public boolean isAPDOPofUnder5() {
		return get(4);
	}

	public void setAPDOPofUnder5(boolean aPDOPofUnder5) {
		set(4, aPDOPofUnder5);
	}

	public boolean isInViewOfUnder5() {
		return get(5);
	}

	public void setInViewOfUnder5(boolean inViewOfUnder5) {
		set(5, inViewOfUnder5);
	}

	public boolean isLocalCorrectionsPresent() {
		return get(6);
	}

	public void setLocalCorrectionsPresent(boolean localCorrectionsPresent) {
		set(6, localCorrectionsPresent);
	}

	public boolean isNetworkCorrectionsPresent() {
		return get(7);
	}

	public void setNetworkCorrectionsPresent(boolean networkCorrectionsPresent) {
		set(7, networkCorrectionsPresent);
	}

	public GNSSstatus() {
		super(8, false, new String[]{"unavailable", "isHealthy", "isMonitored", "baseStationType", "aPDOPofUnder5",
				"inViewOfUnder5", "localCorrectionsPresent", "networkCorrectionsPresent"});
	}
}