package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserAttributesSearchDV.Type;
import typekey.UserAttributeType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserAttributesSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAttributesSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "9d1813746bcb6478e9099041a5a6e05b";
  
  public UserAttributesSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.UserAttributesSearchDV.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserAttributesSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(UserAttributeType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public UserAttributeType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.UserAttributeType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(UserAttributeType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}