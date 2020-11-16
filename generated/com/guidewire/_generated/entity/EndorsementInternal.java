package com.guidewire._generated.entity;

@javax.annotation.processing.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Endorsement.eti;Endorsement.eix;Endorsement.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface EndorsementInternal extends com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.RetireableInternal, gw.cc.policy.entity.Endorsement {
  /**
   * Gets the value of the Comments field.
   * Other notes on the endorsement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the endorsement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Edition_Ext field.
   * Edition number of endorsement from Sure system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEdition_Ext();
  
  
  /**
   * Gets the value of the EffectiveDate field.
   * Date on which the endorsement is effective.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEffectiveDate();
  
  
  /**
   * Gets the value of the ExpirationDate field.
   * Date on which the endorsement expires.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpirationDate();
  
  
  /**
   * Gets the value of the FormNumber field.
   * Date and version of the legal document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFormNumber();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Policy field.
   * Policy with which the endorsement is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy();
  
  
  public gw.pl.persistence.core.Key getPolicyID();
  
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the endorsement in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId();
  
  
  /**
   * Gets the value of the Vehicle_Ext field.
   * The Vehicle the Endorsement is associated with
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Vehicle getVehicle_Ext();
  
  
  public gw.pl.persistence.core.Key getVehicle_ExtID();
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Edition_Ext field.
   */
  public void setEdition_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExpirationDate field.
   */
  public void setExpirationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the FormNumber field.
   */
  public void setFormNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Policy field.
   */
  public void setPolicy(entity.Policy value);
  
  
  public void setPolicyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PolicySystemId field.
   */
  public void setPolicySystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the Vehicle_Ext field.
   */
  public void setVehicle_Ext(entity.Vehicle value);
  
  
  public void setVehicle_ExtID(gw.pl.persistence.core.Key value);
  
  
  
}