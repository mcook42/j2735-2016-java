package j2735.REGION;

import asn2pojo.runtime.annotations.Asn1ParameterizedTypes;
import asn2pojo.runtime.annotations.Asn1ParameterizedTypes.IdType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import j2735.DSRC.RegionalExtension;

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
@JsonTypeInfo(use = Id.NAME, include = As.EXISTING_PROPERTY, property = "regionId")
@JsonSubTypes({@JsonSubTypes.Type(value = j2735.AddGrpC.MapData_addGrpCReg_MapData.class, name = "3")})
@Asn1ParameterizedTypes(idProperty = "regionId", idType = IdType.INTEGER, valueProperty = "regExtValue", value = {
		@Asn1ParameterizedTypes.Type(value = j2735.AddGrpC.MapData_addGrpCReg_MapData.class, intId = 3)})
abstract public class Reg_MapData<TValue> extends RegionalExtension<TValue> {

	public Reg_MapData(int id, String name) {
		super(id, name);
	}
}