package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import j2735.REGION.Reg_IntersectionGeometry;

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
public class IntersectionGeometry extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private DescriptiveName name;
	@Asn1Property(tag = 1)
	private IntersectionReferenceID id;
	@Asn1Property(tag = 2)
	private MsgCount revision;
	@Asn1Property(tag = 3)
	private Position3D refPoint;
	@Asn1Property(tag = 4, optional = true)
	private LaneWidth laneWidth;
	@Asn1Property(tag = 5, optional = true)
	@JacksonXmlElementWrapper(localName = "speedLimits")
	@JacksonXmlProperty(localName = "RegulatorySpeedLimit")
	private SpeedLimitList speedLimits;
	@Asn1Property(tag = 6)
	@JacksonXmlElementWrapper(localName = "laneSet")
	@JacksonXmlProperty(localName = "GenericLane")
	private LaneList laneSet;
	@Asn1Property(tag = 7, optional = true)
	@JacksonXmlElementWrapper(localName = "preemptPriorityData")
	@JacksonXmlProperty(localName = "SignalControlZone")
	private PreemptPriorityList preemptPriorityData;
	@Asn1Property(tag = 8, optional = true)
	private SequenceOfRegional regional;

	public DescriptiveName getName() {
		return name;
	}

	public void setName(DescriptiveName name) {
		this.name = name;
	}

	public IntersectionReferenceID getId() {
		return id;
	}

	public void setId(IntersectionReferenceID id) {
		this.id = id;
	}

	public MsgCount getRevision() {
		return revision;
	}

	public void setRevision(MsgCount revision) {
		this.revision = revision;
	}

	public Position3D getRefPoint() {
		return refPoint;
	}

	public void setRefPoint(Position3D refPoint) {
		this.refPoint = refPoint;
	}

	public LaneWidth getLaneWidth() {
		return laneWidth;
	}

	public void setLaneWidth(LaneWidth laneWidth) {
		this.laneWidth = laneWidth;
	}

	public SpeedLimitList getSpeedLimits() {
		return speedLimits;
	}

	public void setSpeedLimits(SpeedLimitList speedLimits) {
		this.speedLimits = speedLimits;
	}

	public LaneList getLaneSet() {
		return laneSet;
	}

	public void setLaneSet(LaneList laneSet) {
		this.laneSet = laneSet;
	}

	public PreemptPriorityList getPreemptPriorityData() {
		return preemptPriorityData;
	}

	public void setPreemptPriorityData(PreemptPriorityList preemptPriorityData) {
		this.preemptPriorityData = preemptPriorityData;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_IntersectionGeometry> {
		SequenceOfRegional() {
			super(Reg_IntersectionGeometry.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	IntersectionGeometry() {
		super(true);
	}
}