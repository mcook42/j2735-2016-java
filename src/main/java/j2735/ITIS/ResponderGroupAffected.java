package j2735.ITIS;

import asn2pojo.runtime.types.Asn1Enumerated;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * <p>
 * This source code was generated by a tool. Manual edits are futile.
 * </p>
 * <p>
 * asn1jvm v1.0-SNAPSHOT
 * </p>
 * <p>
 * ASN.1 source files:
 * </p>
 * 
 * <pre>
 * J2735_201603DA.ASN
 * </pre>
 * 
 */
@JsonSerialize(using = ResponderGroupAffectedSerializer.class)
@JsonDeserialize(using = ResponderGroupAffectedDeserializer.class)
public enum ResponderGroupAffected implements Asn1Enumerated {
	emergency_vehicle_units(9729, "emergency-vehicle-units"), federal_law_enforcement_units(9730,
			"federal-law-enforcement-units"), state_police_units(9731, "state-police-units"), county_police_units(9732,
					"county-police-units"), local_police_units(9733, "local-police-units"), ambulance_units(9734,
							"ambulance-units"), rescue_units(9735, "rescue-units"), fire_units(9736,
									"fire-units"), hAZMAT_units(9737, "hAZMAT-units"), light_tow_unit(9738,
											"light-tow-unit"), heavy_tow_unit(9739,
													"heavy-tow-unit"), freeway_service_patrols(9740,
															"freeway-service-patrols"), transportation_response_units(
																	9741,
																	"transportation-response-units"), private_contractor_response_units(
																			9742, "private-contractor-response-units");

	private final int index;
	private final String name;

	public int getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}

	public boolean hasExtensionMarker() {
		return false;
	}

	private ResponderGroupAffected(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return -1;
	}
}