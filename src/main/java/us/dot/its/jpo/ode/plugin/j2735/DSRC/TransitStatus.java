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

@JsonDeserialize(using = TransitStatusDeserializer.class)
public class TransitStatus extends Asn1Bitstring {

	public boolean isNone() {
		return get(0);
	}

	public void setNone(boolean none) {
		set(0, none);
	}

	public boolean isAnADAuse() {
		return get(1);
	}

	public void setAnADAuse(boolean anADAuse) {
		set(1, anADAuse);
	}

	public boolean isABikeLoad() {
		return get(2);
	}

	public void setABikeLoad(boolean aBikeLoad) {
		set(2, aBikeLoad);
	}

	public boolean isDoorOpen() {
		return get(3);
	}

	public void setDoorOpen(boolean doorOpen) {
		set(3, doorOpen);
	}

	public boolean isOccM() {
		return get(4);
	}

	public void setOccM(boolean occM) {
		set(4, occM);
	}

	public boolean isOccL() {
		return get(5);
	}

	public void setOccL(boolean occL) {
		set(5, occL);
	}

	public TransitStatus() {
		super(6, false, new String[]{"none", "anADAuse", "aBikeLoad", "doorOpen", "occM", "occL"});
	}
}