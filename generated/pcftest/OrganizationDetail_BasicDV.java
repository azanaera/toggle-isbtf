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
import pcftest.OrganizationDetail_BasicDV.Fax;
import pcftest.OrganizationDetail_BasicDV.GroupUsersLV_tb;
import pcftest.OrganizationDetail_BasicDV.GroupUsersLV_tb.Add;
import pcftest.OrganizationDetail_BasicDV.GroupUsersLV_tb.Remove;
import pcftest.OrganizationDetail_BasicDV.Type;
import pcftest.OrganizationDetail_BasicDV.Work;
import typekey.BusinessType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/groups/OrganizationDetail_BasicDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationDetail_BasicDV extends DetailViewElement {
  public final static String CHECKSUM = "543bf1e811fee1999abc84246d18842a";
  
  public OrganizationDetail_BasicDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public ValueElement getEmail() {
    return getOrCreateProperty("Email", "Email", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Fax getFax() {
    return getOrCreateProperty("Fax", "Fax", null, pcftest.OrganizationDetail_BasicDV.Fax.class);
  }
  
  public GroupUsersLV getGroupUsersLV() {
    return getOrCreateProperty("GroupUsersLV", "GroupUsersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.GroupUsersLV.class);
  }
  
  public GroupUsersLV_tb getGroupUsersLV_tb() {
    return getOrCreateProperty("GroupUsersLV_tb", "GroupUsersLV_tb", null, pcftest.OrganizationDetail_BasicDV.GroupUsersLV_tb.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.OrganizationDetail_BasicDV.Type.class);
  }
  
  public Work getWork() {
    return getOrCreateProperty("Work", "Work", null, pcftest.OrganizationDetail_BasicDV.Work.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/OrganizationDetail_BasicDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Fax extends PCFElement {
    public Fax(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/OrganizationDetail_BasicDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUsersLV_tb extends PCFElement {
    public GroupUsersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.OrganizationDetail_BasicDV.GroupUsersLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.OrganizationDetail_BasicDV.GroupUsersLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/groups/OrganizationDetail_BasicDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/groups/OrganizationDetail_BasicDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/OrganizationDetail_BasicDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(BusinessType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public BusinessType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BusinessType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(BusinessType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/OrganizationDetail_BasicDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Work extends PCFElement {
    public Work(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  
}