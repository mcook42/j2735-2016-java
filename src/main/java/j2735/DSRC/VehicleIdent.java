package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Choice;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1Type;
import asn2pojo.runtime.types.IA5String;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import j2735.ITIS.IncidentResponseEquipment;
import j2735.ITIS.ResponderGroupAffected;
import j2735.ITIS.VehicleGroupAffected;

import java.util.List;
import java.util.Optional;

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
public class VehicleIdent extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private DescriptiveName name;
	@Asn1Property(tag = 1, optional = true)
	private VINstring vin;
	@Asn1Property(tag = 2, optional = true)
	private IA5String ownerCode;
	@Asn1Property(tag = 3, optional = true)
	private VehicleID id;
	@Asn1Property(tag = 4, optional = true)
	private VehicleType vehicleType;
	@Asn1Property(tag = 5, optional = true)
	private VehicleClassChoice vehicleClass;

	public DescriptiveName getName() {
		return name;
	}

	public void setName(DescriptiveName name) {
		this.name = name;
	}

	public VINstring getVin() {
		return vin;
	}

	public void setVin(VINstring vin) {
		this.vin = vin;
	}

	public IA5String getOwnerCode() {
		return ownerCode;
	}

	public void setOwnerCode(IA5String ownerCode) {
		this.ownerCode = ownerCode;
	}

	public VehicleID getId() {
		return id;
	}

	public void setId(VehicleID id) {
		this.id = id;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	@JsonInclude(Include.NON_NULL)
	public static class VehicleClassChoice extends Asn1Choice {
		@Asn1Property(tag = 0)
		private VehicleGroupAffected vGroup;
		@Asn1Property(tag = 1)
		private ResponderGroupAffected rGroup;
		@Asn1Property(tag = 2)
		private IncidentResponseEquipment rEquip;

		VehicleClassChoice() {
			super(false);
		}

		public VehicleGroupAffected getVGroup() {
			return vGroup;
		}

		public void setVGroup(VehicleGroupAffected vGroup) {
			this.vGroup = vGroup;
		}

		public ResponderGroupAffected getRGroup() {
			return rGroup;
		}

		public void setRGroup(ResponderGroupAffected rGroup) {
			this.rGroup = rGroup;
		}

		public IncidentResponseEquipment getREquip() {
			return rEquip;
		}

		public void setREquip(IncidentResponseEquipment rEquip) {
			this.rEquip = rEquip;
		}

		@Override
		protected List<Optional<Asn1Type>> listTypes() {
			return null;
		}
	}

	public VehicleClassChoice getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(VehicleClassChoice vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	VehicleIdent() {
		super(true);
	}
}