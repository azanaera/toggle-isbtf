package com.guidewire._generated.entity;

@javax.annotation.processing.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AppCritPolicyType.eti;AppCritPolicyType.eix;AppCritPolicyType.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AppCritPolicyTypeInternal extends com.guidewire._generated.entity.RuleVersionDependentInternal, com.guidewire._generated.entity.VersionableInternal, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Gets the value of the PolicyType field.
   * Policy Type in a rule availability criteria
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Gets the value of the Rule field.
   * The associated rule
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CCRule getRule();
  
  
  public gw.pl.persistence.core.Key getRuleID();
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the Rule field.
   */
  public void setRule(entity.CCRule value);
  
  
  public void setRuleID(gw.pl.persistence.core.Key value);
  
  
  
}