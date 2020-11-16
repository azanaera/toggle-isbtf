package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OtherServicesLVInputSet.OtherServicesLV_tb;
import pcftest.OtherServicesLVInputSet.OtherServicesLV_tb.Add;
import pcftest.OtherServicesLVInputSet.OtherServicesLV_tb.AddServiceRequest;
import pcftest.OtherServicesLVInputSet.OtherServicesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLVInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherServicesLVInputSet extends PCFElement {
  public final static String CHECKSUM = "173ac21bf96582e231d2e37bc7de46e2";
  
  public OtherServicesLVInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public OtherServicesLV getOtherServicesLV() {
    return getOrCreateProperty("OtherServicesLV", "OtherServicesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OtherServicesLV.class);
  }
  
  public OtherServicesLV_tb getOtherServicesLV_tb() {
    return getOrCreateProperty("OtherServicesLV_tb", "OtherServicesLV_tb", null, pcftest.OtherServicesLVInputSet.OtherServicesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLVInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherServicesLV_tb extends PCFElement {
    public OtherServicesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.OtherServicesLVInputSet.OtherServicesLV_tb.Add.class);
    }
    
    public AddServiceRequest getAddServiceRequest() {
      return getOrCreateProperty("AddServiceRequest", "AddServiceRequest", null, pcftest.OtherServicesLVInputSet.OtherServicesLV_tb.AddServiceRequest.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.OtherServicesLVInputSet.OtherServicesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLVInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLVInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddServiceRequest extends ClickableActionElement {
      public AddServiceRequest(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OtherServiceRequestPopup click() {
        return clickThis(pcftest.OtherServiceRequestPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLVInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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