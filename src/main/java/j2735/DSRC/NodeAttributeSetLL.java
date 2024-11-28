package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.serialization.NestedSequenceOfDeserializer;
import asn2pojo.runtime.serialization.NestedSequenceOfSerializer;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import j2735.REGION.Reg_NodeAttributeSetLL;

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
public class NodeAttributeSetLL extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	@JacksonXmlElementWrapper(localName = "localNode")
	@JacksonXmlProperty(localName = "NodeAttributeLL")
	private NodeAttributeLLList localNode;
	@Asn1Property(tag = 1, optional = true)
	@JsonDeserialize(using = DisabledDeserializer.class)
	@JsonSerialize(using = DisabledSerializer.class)
	private SegmentAttributeLLList disabled;
	@Asn1Property(tag = 2, optional = true)
	@JsonDeserialize(using = EnabledDeserializer.class)
	@JsonSerialize(using = EnabledSerializer.class)
	private SegmentAttributeLLList enabled;
	@Asn1Property(tag = 3, optional = true)
	@JacksonXmlElementWrapper(localName = "data")
	@JacksonXmlProperty(localName = "LaneDataAttribute")
	private LaneDataAttributeList data;
	@Asn1Property(tag = 4, optional = true)
	private Offset_B10 dWidth;
	@Asn1Property(tag = 5, optional = true)
	private Offset_B10 dElevation;
	@Asn1Property(tag = 6, optional = true)
	private SequenceOfRegional regional;

	public NodeAttributeLLList getLocalNode() {
		return localNode;
	}

	public void setLocalNode(NodeAttributeLLList localNode) {
		this.localNode = localNode;
	}

	public SegmentAttributeLLList getDisabled() {
		return disabled;
	}

	public void setDisabled(SegmentAttributeLLList disabled) {
		this.disabled = disabled;
	}

	public SegmentAttributeLLList getEnabled() {
		return enabled;
	}

	public void setEnabled(SegmentAttributeLLList enabled) {
		this.enabled = enabled;
	}

	public LaneDataAttributeList getData() {
		return data;
	}

	public void setData(LaneDataAttributeList data) {
		this.data = data;
	}

	public Offset_B10 getDWidth() {
		return dWidth;
	}

	public void setDWidth(Offset_B10 dWidth) {
		this.dWidth = dWidth;
	}

	public Offset_B10 getDElevation() {
		return dElevation;
	}

	public void setDElevation(Offset_B10 dElevation) {
		this.dElevation = dElevation;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_NodeAttributeSetLL> {
		SequenceOfRegional() {
			super(Reg_NodeAttributeSetLL.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	NodeAttributeSetLL() {
		super(true);
	}

	public static class DisabledDeserializer extends NestedSequenceOfDeserializer<SegmentAttributeLLList> {
		public DisabledDeserializer() {
			super(SegmentAttributeLLList.class, "SegmentAttributeLL");
		}
	}

	public static class DisabledSerializer extends NestedSequenceOfSerializer<SegmentAttributeLLList> {
		public DisabledSerializer() {
			super(SegmentAttributeLLList.class, "SegmentAttributeLL");
		}
	}

	public static class EnabledDeserializer extends NestedSequenceOfDeserializer<SegmentAttributeLLList> {
		public EnabledDeserializer() {
			super(SegmentAttributeLLList.class, "SegmentAttributeLL");
		}
	}

	public static class EnabledSerializer extends NestedSequenceOfSerializer<SegmentAttributeLLList> {
		public EnabledSerializer() {
			super(SegmentAttributeLLList.class, "SegmentAttributeLL");
		}
	}
}