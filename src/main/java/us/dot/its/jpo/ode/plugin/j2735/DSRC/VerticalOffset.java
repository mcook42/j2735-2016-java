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

import us.dot.its.jpo.ode.plugin.annotations.Asn1Property;
import us.dot.its.jpo.ode.plugin.types.Asn1Choice;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import us.dot.its.jpo.ode.plugin.j2735.region.Reg_VerticalOffset;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class VerticalOffset extends Asn1Choice {

	@Asn1Property(tag = 0, name = "offset1")
	@JsonProperty("offset1")
	private VertOffset_B07 offset1;
	@Asn1Property(tag = 1, name = "offset2")
	@JsonProperty("offset2")
	private VertOffset_B08 offset2;
	@Asn1Property(tag = 2, name = "offset3")
	@JsonProperty("offset3")
	private VertOffset_B09 offset3;
	@Asn1Property(tag = 3, name = "offset4")
	@JsonProperty("offset4")
	private VertOffset_B10 offset4;
	@Asn1Property(tag = 4, name = "offset5")
	@JsonProperty("offset5")
	private VertOffset_B11 offset5;
	@Asn1Property(tag = 5, name = "offset6")
	@JsonProperty("offset6")
	private VertOffset_B12 offset6;
	@Asn1Property(tag = 6, name = "elevation")
	@JsonProperty("elevation")
	private Elevation elevation;
	@Asn1Property(tag = 7, name = "regional")
	@JsonProperty("regional")
	private Reg_VerticalOffset regional;

	VerticalOffset() {
		super(false);
	}
}