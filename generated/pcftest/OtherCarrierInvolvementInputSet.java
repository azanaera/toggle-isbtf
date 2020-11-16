package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OtherCarrierInvolvementInputSet.EditableOtherCoverageDetailsLV_tb;
import pcftest.OtherCarrierInvolvementInputSet.EditableOtherCoverageDetailsLV_tb.Add;
import pcftest.OtherCarrierInvolvementInputSet.EditableOtherCoverageDetailsLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/OtherCarrierInvolvementInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherCarrierInvolvementInputSet extends PCFElement {
  public final static String CHECKSUM = "aa8ea0fac88d951ed77e0cf344694708";
  
  public OtherCarrierInvolvementInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getClaimant_OtherCoverage() {
    return getOrCreateProperty("Claimant_OtherCoverage", "Claimant_OtherCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public EditableOtherCoverageDetailsLV getEditableOtherCoverageDetailsLV() {
    return getOrCreateProperty("EditableOtherCoverageDetailsLV", "EditableOtherCoverageDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOtherCoverageDetailsLV.class);
  }
  
  public EditableOtherCoverageDetailsLV_tb getEditableOtherCoverageDetailsLV_tb() {
    return getOrCreateProperty("EditableOtherCoverageDetailsLV_tb", "EditableOtherCoverageDetailsLV_tb", null, pcftest.OtherCarrierInvolvementInputSet.EditableOtherCoverageDetailsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/OtherCarrierInvolvementInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOtherCoverageDetailsLV_tb extends PCFElement {
    public EditableOtherCoverageDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.OtherCarrierInvolvementInputSet.EditableOtherCoverageDetailsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.OtherCarrierInvolvementInputSet.EditableOtherCoverageDetailsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/OtherCarrierInvolvementInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/OtherCarrierInvolvementInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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