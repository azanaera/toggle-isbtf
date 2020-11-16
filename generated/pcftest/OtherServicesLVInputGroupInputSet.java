package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OtherServicesLVInputGroupInputSet.OtherServicesInputGroup;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLVInputGroupInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherServicesLVInputGroupInputSet extends PCFElement {
  public final static String CHECKSUM = "a8eef0c7b5adbae0b4595024685ae863";
  
  public OtherServicesLVInputGroupInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public OtherServicesInputGroup getOtherServicesInputGroup() {
    return getOrCreateProperty("OtherServicesInputGroup", "OtherServicesInputGroup", null, pcftest.OtherServicesLVInputGroupInputSet.OtherServicesInputGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLVInputGroupInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherServicesInputGroup extends PCFElement {
    public OtherServicesInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OtherServicesLVInputSet getOtherServicesLVInputSet() {
      return getOrCreateProperty("OtherServicesLVInputSet", "OtherServicesLVInputSet", null, pcftest.OtherServicesLVInputSet.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    
  }
  
  
}