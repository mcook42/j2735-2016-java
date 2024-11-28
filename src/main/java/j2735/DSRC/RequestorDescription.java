package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import j2735.REGION.Reg_RequestorDescription;

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
public class RequestorDescription extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private VehicleID id;
	@Asn1Property(tag = 1, optional = true)
	private RequestorType type;
	@Asn1Property(tag = 2, optional = true)
	private RequestorPositionVector position;
	@Asn1Property(tag = 3, optional = true)
	private DescriptiveName name;
	@Asn1Property(tag = 4, optional = true)
	private DescriptiveName routeName;
	@Asn1Property(tag = 5, optional = true)
	private TransitVehicleStatus transitStatus;
	@Asn1Property(tag = 6, optional = true)
	private TransitVehicleOccupancy transitOccupancy;
	@Asn1Property(tag = 7, optional = true)
	private DeltaTime transitSchedule;
	@Asn1Property(tag = 8, optional = true)
	private SequenceOfRegional regional;

	public VehicleID getId() {
		return id;
	}

	public void setId(VehicleID id) {
		this.id = id;
	}

	public RequestorType getType() {
		return type;
	}

	public void setType(RequestorType type) {
		this.type = type;
	}

	public RequestorPositionVector getPosition() {
		return position;
	}

	public void setPosition(RequestorPositionVector position) {
		this.position = position;
	}

	public DescriptiveName getName() {
		return name;
	}

	public void setName(DescriptiveName name) {
		this.name = name;
	}

	public DescriptiveName getRouteName() {
		return routeName;
	}

	public void setRouteName(DescriptiveName routeName) {
		this.routeName = routeName;
	}

	public TransitVehicleStatus getTransitStatus() {
		return transitStatus;
	}

	public void setTransitStatus(TransitVehicleStatus transitStatus) {
		this.transitStatus = transitStatus;
	}

	public TransitVehicleOccupancy getTransitOccupancy() {
		return transitOccupancy;
	}

	public void setTransitOccupancy(TransitVehicleOccupancy transitOccupancy) {
		this.transitOccupancy = transitOccupancy;
	}

	public DeltaTime getTransitSchedule() {
		return transitSchedule;
	}

	public void setTransitSchedule(DeltaTime transitSchedule) {
		this.transitSchedule = transitSchedule;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_RequestorDescription> {
		SequenceOfRegional() {
			super(Reg_RequestorDescription.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	RequestorDescription() {
		super(true);
	}
}