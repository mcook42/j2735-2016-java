package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
abstract public class RegionalExtension<TValue> extends Asn1Sequence {

	@JsonIgnore
	final protected RegionId regionId;
	@JsonIgnore
	final protected String name;
	private TValue regExtValue;
	public final static String INFORMATION_OBJECT_CLASS = "REG_EXT_ID_AND_TYPE";

	public RegionId getRegionId() {
		return regionId;
	}

	public String getName() {
		return name;
	}

	@JsonProperty("regionId")
	public String getIdString() {
		return regionId.toString();
	}

	public TValue getRegExtValue() {
		return regExtValue;
	}

	public void setRegExtValue(TValue regExtValue) {
		this.regExtValue = regExtValue;
	}

	public RegionalExtension(int id, String name) {
		super(true);
		var theId = new RegionId();
		theId.setValue(id);
		this.regionId = theId;
		this.name = name;
	}
}