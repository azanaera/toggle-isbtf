package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AttributeDetailDV.Type;
import typekey.UserAttributeType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/attributes/AttributeDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AttributeDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "99cdf466abe17c2524836172e5ac8121";
  
  public AttributeDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.AttributeDetailDV.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/attributes/AttributeDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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