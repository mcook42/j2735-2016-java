package j2735.DSRC;

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
@JsonSerialize(using = RequestImportanceLevelSerializer.class)
@JsonDeserialize(using = RequestImportanceLevelDeserializer.class)
public enum RequestImportanceLevel implements Asn1Enumerated {
	requestImportanceLevelUnKnown(0, "requestImportanceLevelUnKnown"), requestImportanceLevel1(1,
			"requestImportanceLevel1"), requestImportanceLevel2(2, "requestImportanceLevel2"), requestImportanceLevel3(
					3, "requestImportanceLevel3"), requestImportanceLevel4(4,
							"requestImportanceLevel4"), requestImportanceLevel5(5,
									"requestImportanceLevel5"), requestImportanceLevel6(6,
											"requestImportanceLevel6"), requestImportanceLevel7(7,
													"requestImportanceLevel7"), requestImportanceLevel8(8,
															"requestImportanceLevel8"), requestImportanceLevel9(9,
																	"requestImportanceLevel9"), requestImportanceLevel10(
																			10,
																			"requestImportanceLevel10"), requestImportanceLevel11(
																					11,
																					"requestImportanceLevel11"), requestImportanceLevel12(
																							12,
																							"requestImportanceLevel12"), requestImportanceLevel13(
																									13,
																									"requestImportanceLevel13"), requestImportanceLevel14(
																											14,
																											"requestImportanceLevel14"), requestImportanceReserved(
																													15,
																													"requestImportanceReserved");

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

	private RequestImportanceLevel(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 15;
	}
}