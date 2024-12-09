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
import us.dot.its.jpo.ode.plugin.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class FullPositionVector extends Asn1Sequence {

	@Asn1Property(tag = 0, name = "utcTime", optional = true)
	@JsonProperty("utcTime")
	private DDateTime utcTime;
	@Asn1Property(tag = 1, name = "long")
	@JsonProperty("long")
	private Longitude long_;
	@Asn1Property(tag = 2, name = "lat")
	@JsonProperty("lat")
	private Latitude lat;
	@Asn1Property(tag = 3, name = "elevation", optional = true)
	@JsonProperty("elevation")
	private Elevation elevation;
	@Asn1Property(tag = 4, name = "heading", optional = true)
	@JsonProperty("heading")
	private Heading heading;
	@Asn1Property(tag = 5, name = "speed", optional = true)
	@JsonProperty("speed")
	private TransmissionAndSpeed speed;
	@Asn1Property(tag = 6, name = "posAccuracy", optional = true)
	@JsonProperty("posAccuracy")
	private PositionalAccuracy posAccuracy;
	@Asn1Property(tag = 7, name = "timeConfidence", optional = true)
	@JsonProperty("timeConfidence")
	private TimeConfidence timeConfidence;
	@Asn1Property(tag = 8, name = "posConfidence", optional = true)
	@JsonProperty("posConfidence")
	private PositionConfidenceSet posConfidence;
	@Asn1Property(tag = 9, name = "speedConfidence", optional = true)
	@JsonProperty("speedConfidence")
	private SpeedandHeadingandThrottleConfidence speedConfidence;

	FullPositionVector() {
		super(true);
	}
}