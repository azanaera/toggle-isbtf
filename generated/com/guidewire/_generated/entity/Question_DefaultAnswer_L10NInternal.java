package com.guidewire._generated.entity;

@javax.annotation.processing.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Question_DefaultAnswer_L10N.eti;Question_DefaultAnswer_L10N.eix;Question_DefaultAnswer_L10N.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface Question_DefaultAnswer_L10NInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Language field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Owner field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Question getOwner();
  
  
  public gw.pl.persistence.core.Key getOwnerID();
  
  
  /**
   * Gets the value of the Value field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValue();
  
  
  /**
   * Sets the value of the Language field.
   */
  public void setLanguage(typekey.LanguageType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Owner field.
   */
  public void setOwner(entity.Question value);
  
  
  public void setOwnerID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(java.lang.String value);
  
  
  
}