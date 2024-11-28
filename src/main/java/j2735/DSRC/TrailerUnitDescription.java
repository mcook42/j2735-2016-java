package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
public class TrailerUnitDescription extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private IsDolly isDolly;
	@Asn1Property(tag = 1)
	private VehicleWidth width;
	@Asn1Property(tag = 2)
	private VehicleLength length;
	@Asn1Property(tag = 3, optional = true)
	private VehicleHeight height;
	@Asn1Property(tag = 4, optional = true)
	private TrailerMass mass;
	@Asn1Property(tag = 5, optional = true)
	private BumperHeights bumperHeights;
	@Asn1Property(tag = 6, optional = true)
	private VehicleHeight centerOfGravity;
	@Asn1Property(tag = 7)
	private PivotPointDescription frontPivot;
	@Asn1Property(tag = 8, optional = true)
	private PivotPointDescription rearPivot;
	@Asn1Property(tag = 9, optional = true)
	private Offset_B12 rearWheelOffset;
	@Asn1Property(tag = 10)
	private Node_XY_24b positionOffset;
	@Asn1Property(tag = 11, optional = true)
	private VertOffset_B07 elevationOffset;
	@Asn1Property(tag = 12, optional = true)
	@JacksonXmlElementWrapper(localName = "crumbData")
	@JacksonXmlProperty(localName = "TrailerHistoryPoint")
	private TrailerHistoryPointList crumbData;

	public IsDolly getIsDolly() {
		return isDolly;
	}

	public void setIsDolly(IsDolly isDolly) {
		this.isDolly = isDolly;
	}

	public VehicleWidth getWidth() {
		return width;
	}

	public void setWidth(VehicleWidth width) {
		this.width = width;
	}

	public VehicleLength getLength() {
		return length;
	}

	public void setLength(VehicleLength length) {
		this.length = length;
	}

	public VehicleHeight getHeight() {
		return height;
	}

	public void setHeight(VehicleHeight height) {
		this.height = height;
	}

	public TrailerMass getMass() {
		return mass;
	}

	public void setMass(TrailerMass mass) {
		this.mass = mass;
	}

	public BumperHeights getBumperHeights() {
		return bumperHeights;
	}

	public void setBumperHeights(BumperHeights bumperHeights) {
		this.bumperHeights = bumperHeights;
	}

	public VehicleHeight getCenterOfGravity() {
		return centerOfGravity;
	}

	public void setCenterOfGravity(VehicleHeight centerOfGravity) {
		this.centerOfGravity = centerOfGravity;
	}

	public PivotPointDescription getFrontPivot() {
		return frontPivot;
	}

	public void setFrontPivot(PivotPointDescription frontPivot) {
		this.frontPivot = frontPivot;
	}

	public PivotPointDescription getRearPivot() {
		return rearPivot;
	}

	public void setRearPivot(PivotPointDescription rearPivot) {
		this.rearPivot = rearPivot;
	}

	public Offset_B12 getRearWheelOffset() {
		return rearWheelOffset;
	}

	public void setRearWheelOffset(Offset_B12 rearWheelOffset) {
		this.rearWheelOffset = rearWheelOffset;
	}

	public Node_XY_24b getPositionOffset() {
		return positionOffset;
	}

	public void setPositionOffset(Node_XY_24b positionOffset) {
		this.positionOffset = positionOffset;
	}

	public VertOffset_B07 getElevationOffset() {
		return elevationOffset;
	}

	public void setElevationOffset(VertOffset_B07 elevationOffset) {
		this.elevationOffset = elevationOffset;
	}

	public TrailerHistoryPointList getCrumbData() {
		return crumbData;
	}

	public void setCrumbData(TrailerHistoryPointList crumbData) {
		this.crumbData = crumbData;
	}

	TrailerUnitDescription() {
		super(true);
	}
}