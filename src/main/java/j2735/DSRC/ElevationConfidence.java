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
@JsonSerialize(using = ElevationConfidenceSerializer.class)
@JsonDeserialize(using = ElevationConfidenceDeserializer.class)
public enum ElevationConfidence implements Asn1Enumerated {
	unavailable(0, "unavailable"), elev_500_00(1, "elev-500-00"), elev_200_00(2, "elev-200-00"), elev_100_00(3,
			"elev-100-00"), elev_050_00(4, "elev-050-00"), elev_020_00(5, "elev-020-00"), elev_010_00(6,
					"elev-010-00"), elev_005_00(7, "elev-005-00"), elev_002_00(8, "elev-002-00"), elev_001_00(9,
							"elev-001-00"), elev_000_50(10, "elev-000-50"), elev_000_20(11, "elev-000-20"), elev_000_10(
									12, "elev-000-10"), elev_000_05(13, "elev-000-05"), elev_000_02(14,
											"elev-000-02"), elev_000_01(15, "elev-000-01");

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

	private ElevationConfidence(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 15;
	}
}