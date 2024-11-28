package j2735.DSRC;

import com.fasterxml.jackson.annotation.JsonRootName;
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
@JsonRootName("MessageFrame")
public class TestMessage07MessageFrame extends MessageFrame<TestMessage07> {

	public TestMessage07MessageFrame() {
		super(247, "TestMessage07");
	}

	@Override
	@JsonSerialize(using = TestMessage07MessageFrameValueSerializer.class)
	public TestMessage07 getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = TestMessage07MessageFrameValueDeserializer.class)
	public void setValue(TestMessage07 value) {
		super.setValue(value);
	}
}