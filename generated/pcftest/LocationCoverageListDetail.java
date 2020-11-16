package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LocationCoverageListDetail.EditablePropertyCoveragesLV_tb;
import pcftest.LocationCoverageListDetail.EditablePropertyCoveragesLV_tb.Add;
import pcftest.LocationCoverageListDetail.EditablePropertyCoveragesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/LocationCoverageListDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LocationCoverageListDetail extends PCFElement {
  public final static String CHECKSUM = "68a2a15fb3a7bc40e80ca9f8a1fb70a8";
  
  public LocationCoverageListDetail(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimPolicyCovTermsCV getClaimPolicyCovTermsCV() {
    return getOrCreateProperty("ClaimPolicyCovTermsCV", "ClaimPolicyCovTermsCV", null, pcftest.ClaimPolicyCovTermsCV.class);
  }
  
  public EditablePropertyCoveragesLV getEditablePropertyCoveragesLV() {
    return getOrCreateProperty("EditablePropertyCoveragesLV", "EditablePropertyCoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditablePropertyCoveragesLV.class);
  }
  
  public EditablePropertyCoveragesLV_tb getEditablePropertyCoveragesLV_tb() {
    return getOrCreateProperty("EditablePropertyCoveragesLV_tb", "EditablePropertyCoveragesLV_tb", null, pcftest.LocationCoverageListDetail.EditablePropertyCoveragesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/LocationCoverageListDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditablePropertyCoveragesLV_tb extends PCFElement {
    public EditablePropertyCoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LocationCoverageListDetail.EditablePropertyCoveragesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LocationCoverageListDetail.EditablePropertyCoveragesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/LocationCoverageListDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/LocationCoverageListDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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