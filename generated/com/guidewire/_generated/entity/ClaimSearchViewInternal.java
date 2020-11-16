package com.guidewire._generated.entity;

@javax.annotation.processing.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimSearchView.eti;ClaimSearchView.eix;ClaimSearchView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimSearchViewInternal extends com.guidewire._generated.entity.ClaimAssignmentViewInternal, com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.claim.ArchivedClaimCompatible, gw.cc.claim.entity.ClaimSearchView {
  /**
   * Gets the value of the AssignedGroup field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssignedGroup();
  
  
  /**
   * Gets the value of the ClaimPublicId field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimPublicId();
  
  
  /**
   * Gets the value of the FuturePayments field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFuturePayments();
  
  
  /**
   * Gets the value of the RemainingReserves field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRemainingReserves();
  
  
  /**
   * Gets the value of the ReportedDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReportedDate();
  
  
  /**
   * Gets the value of the TotalPayments field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalPayments();
  
  
  /**
   * Sets the value of the AssignedGroup field.
   */
  public void setAssignedGroup(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimPublicId field.
   */
  public void setClaimPublicId(java.lang.String value);
  
  
  /**
   * Sets the value of the FuturePayments field.
   */
  public void setFuturePayments(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the RemainingReserves field.
   */
  public void setRemainingReserves(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReportedDate field.
   */
  public void setReportedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the TotalPayments field.
   */
  public void setTotalPayments(gw.api.financials.CurrencyAmount value);
  
  
  
}