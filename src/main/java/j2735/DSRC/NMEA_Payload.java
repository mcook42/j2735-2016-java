package j2735.DSRC;

import asn2pojo.runtime.types.Asn1OctetString;
import com.fasterxml.jackson.annotation.JsonCreator;

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
public class NMEA_Payload extends Asn1OctetString {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	public NMEA_Payload() {
		super(1, 1023);
	}

	@JsonCreator
	public NMEA_Payload(String value) {
		this();
		this.value = value;
	}
}