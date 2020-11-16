package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyTripCoverageLDV.EditableTripCoveragesLV_tb;
import pcftest.PolicyTripCoverageLDV.EditableTripCoveragesLV_tb.Add;
import pcftest.PolicyTripCoverageLDV.EditableTripCoveragesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/PolicyTripCoverageLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyTripCoverageLDV extends PCFElement {
  public final static String CHECKSUM = "b787340d8867a94a49dbc1c5c3fdd308";
  
  public PolicyTripCoverageLDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimPolicyCovTermsCV getClaimPolicyCovTermsCV() {
    return getOrCreateProperty("ClaimPolicyCovTermsCV", "ClaimPolicyCovTermsCV", null, pcftest.ClaimPolicyCovTermsCV.class);
  }
  
  public EditableTripCoveragesLV getEditableTripCoveragesLV() {
    return getOrCreateProperty("EditableTripCoveragesLV", "EditableTripCoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableTripCoveragesLV.class);
  }
  
  public EditableTripCoveragesLV_tb getEditableTripCoveragesLV_tb() {
    return getOrCreateProperty("EditableTripCoveragesLV_tb", "EditableTripCoveragesLV_tb", null, pcftest.PolicyTripCoverageLDV.EditableTripCoveragesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicyTripCoverageLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableTripCoveragesLV_tb extends PCFElement {
    public EditableTripCoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.PolicyTripCoverageLDV.EditableTripCoveragesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.PolicyTripCoverageLDV.EditableTripCoveragesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicyTripCoverageLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicyTripCoverageLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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