package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PropertyDV.PropertyDVGroup;
import typekey.RuntimePropertyGroup;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/properties/PropertyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyDV extends DetailViewElement {
  public final static String CHECKSUM = "b376ff77f98f5708b5a0f305334fec0f";
  
  public PropertyDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getPropertyDVDescription() {
    return getOrCreateProperty("PropertyDVDescription", "PropertyDVDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PropertyDVGroup getPropertyDVGroup() {
    return getOrCreateProperty("PropertyDVGroup", "PropertyDVGroup", null, pcftest.PropertyDV.PropertyDVGroup.class);
  }
  
  public ValueElement getPropertyDVName() {
    return getOrCreateProperty("PropertyDVName", "PropertyDVName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyDVValue() {
    return getOrCreateProperty("PropertyDVValue", "PropertyDVValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/PropertyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyDVGroup extends SelectElement {
    public PropertyDVGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(RuntimePropertyGroup arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public RuntimePropertyGroup getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RuntimePropertyGroup.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(RuntimePropertyGroup arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}