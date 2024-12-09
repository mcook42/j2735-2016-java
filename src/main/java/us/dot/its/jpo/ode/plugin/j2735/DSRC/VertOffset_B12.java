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

import us.dot.its.jpo.ode.plugin.serialization.IntegerDeserializer;
import us.dot.its.jpo.ode.plugin.types.Asn1Integer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = VertOffset_B12.VertOffset_B12Deserializer.class)
public class VertOffset_B12 extends Asn1Integer {

	public VertOffset_B12() {
		super(-2048L, 2047L);
	}

	@JsonCreator
	public VertOffset_B12(long value) {
		this();
		this.value = value;
	}

	public static class VertOffset_B12Deserializer extends IntegerDeserializer<VertOffset_B12> {
		public VertOffset_B12Deserializer() {
			super(VertOffset_B12.class);
		}

		@Override
		protected VertOffset_B12 construct() {
			return new VertOffset_B12();
		}
	}
}