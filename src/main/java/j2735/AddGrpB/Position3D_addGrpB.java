package j2735.AddGrpB;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

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
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Position3D_addGrpB extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private LatitudeDMS2 latitude;
	@Asn1Property(tag = 1)
	private LongitudeDMS2 longitude;
	@Asn1Property(tag = 2)
	private Elevation elevation;

	public LatitudeDMS2 getLatitude() {
		return latitude;
	}

	public void setLatitude(LatitudeDMS2 latitude) {
		this.latitude = latitude;
	}

	public LongitudeDMS2 getLongitude() {
		return longitude;
	}

	public void setLongitude(LongitudeDMS2 longitude) {
		this.longitude = longitude;
	}

	public Elevation getElevation() {
		return elevation;
	}

	public void setElevation(Elevation elevation) {
		this.elevation = elevation;
	}

	Position3D_addGrpB() {
		super(true);
	}
}