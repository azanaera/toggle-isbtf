package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OrganizationSearchDV.ContactState;
import pcftest.OrganizationSearchDV.Type;
import typekey.BusinessType;
import typekey.State;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/groups/OrganizationSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "b429b06b08fc1e08d92c142f2dfd2dd1";
  
  public OrganizationSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getContactCity() {
    return getOrCreateProperty("ContactCity", "ContactCity", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getContactName() {
    return getOrCreateProperty("ContactName", "ContactName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getContactPostal() {
    return getOrCreateProperty("ContactPostal", "ContactPostal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ContactState getContactState() {
    return getOrCreateProperty("ContactState", "ContactState", null, pcftest.OrganizationSearchDV.ContactState.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.OrganizationSearchDV.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/OrganizationSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactState extends SelectElement {
    public ContactState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(State arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public State getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(State arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/OrganizationSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}