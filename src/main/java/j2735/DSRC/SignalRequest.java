package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import j2735.REGION.Reg_SignalRequest;

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
public class SignalRequest extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private IntersectionReferenceID id;
	@Asn1Property(tag = 1)
	private RequestID requestID;
	@Asn1Property(tag = 2)
	private PriorityRequestType requestType;
	@Asn1Property(tag = 3)
	private IntersectionAccessPoint inBoundLane;
	@Asn1Property(tag = 4, optional = true)
	private IntersectionAccessPoint outBoundLane;
	@Asn1Property(tag = 5, optional = true)
	private SequenceOfRegional regional;

	public IntersectionReferenceID getId() {
		return id;
	}

	public void setId(IntersectionReferenceID id) {
		this.id = id;
	}

	public RequestID getRequestID() {
		return requestID;
	}

	public void setRequestID(RequestID requestID) {
		this.requestID = requestID;
	}

	public PriorityRequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(PriorityRequestType requestType) {
		this.requestType = requestType;
	}

	public IntersectionAccessPoint getInBoundLane() {
		return inBoundLane;
	}

	public void setInBoundLane(IntersectionAccessPoint inBoundLane) {
		this.inBoundLane = inBoundLane;
	}

	public IntersectionAccessPoint getOutBoundLane() {
		return outBoundLane;
	}

	public void setOutBoundLane(IntersectionAccessPoint outBoundLane) {
		this.outBoundLane = outBoundLane;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_SignalRequest> {
		SequenceOfRegional() {
			super(Reg_SignalRequest.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	SignalRequest() {
		super(true);
	}
}