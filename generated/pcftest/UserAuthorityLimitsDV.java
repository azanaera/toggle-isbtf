package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserAuthorityLimitsDV.EditableAuthorityLimitsLV_tb;
import pcftest.UserAuthorityLimitsDV.EditableAuthorityLimitsLV_tb.Add;
import pcftest.UserAuthorityLimitsDV.EditableAuthorityLimitsLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserAuthorityLimitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAuthorityLimitsDV extends DetailViewElement {
  public final static String CHECKSUM = "d0faca91d3ffab8bae1a447456d1cbef";
  
  public UserAuthorityLimitsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getAuthorityLimitsProfile() {
    return getOrCreateProperty("AuthorityLimitsProfile", "AuthorityLimitsProfile", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public pcftest.UserAuthorityLimitsDV.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.UserAuthorityLimitsDV.Currency.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditableAuthorityLimitsLV getEditableAuthorityLimitsLV() {
    return getOrCreateProperty("EditableAuthorityLimitsLV", "EditableAuthorityLimitsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableAuthorityLimitsLV.class);
  }
  
  public EditableAuthorityLimitsLV_tb getEditableAuthorityLimitsLV_tb() {
    return getOrCreateProperty("EditableAuthorityLimitsLV_tb", "EditableAuthorityLimitsLV_tb", null, pcftest.UserAuthorityLimitsDV.EditableAuthorityLimitsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserAuthorityLimitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Currency extends SelectElement {
    public Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserAuthorityLimitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableAuthorityLimitsLV_tb extends PCFElement {
    public EditableAuthorityLimitsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.UserAuthorityLimitsDV.EditableAuthorityLimitsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.UserAuthorityLimitsDV.EditableAuthorityLimitsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserAuthorityLimitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserAuthorityLimitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}