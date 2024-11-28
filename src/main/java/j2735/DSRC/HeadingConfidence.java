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
@JsonSerialize(using = HeadingConfidenceSerializer.class)
@JsonDeserialize(using = HeadingConfidenceDeserializer.class)
public enum HeadingConfidence implements Asn1Enumerated {
	unavailable(0, "unavailable"), prec10deg(1, "prec10deg"), prec05deg(2, "prec05deg"), prec01deg(3,
			"prec01deg"), prec0_1deg(4, "prec0-1deg"), prec0_05deg(5,
					"prec0-05deg"), prec0_01deg(6, "prec0-01deg"), prec0_0125deg(7, "prec0-0125deg");

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

	private HeadingConfidence(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 7;
	}
}