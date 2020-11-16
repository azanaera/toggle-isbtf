package com.guidewire._generated.entity;

@javax.annotation.processing.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimInfoAccess.eti;ClaimInfoAccess.eix;ClaimInfoAccess.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimInfoAccessInternal extends com.guidewire._generated.entity.ClaimAccessDataInternal, com.guidewire._generated.entity.VersionableInternal, gw.cc.claim.archiving.entity.ClaimInfoAccess {
  /**
   * Gets the value of the ClaimInfo field.
   * A foreign key to the claim info.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo();
  
  
  public gw.pl.persistence.core.Key getClaimInfoID();
  
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value);
  
  
  public void setClaimInfoID(gw.pl.persistence.core.Key value);
  
  
  
}