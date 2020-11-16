package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LossDetailsPanelSet_default.LossDetailsCardCV;
import pcftest.LossDetailsPanelSet_default.LossDetailsCardCV.Claim_DetailsCardTab;
import pcftest.LossDetailsPanelSet_default.LossDetailsCardCV.Claim_ISOCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsPanelSet_default extends LossDetailsPanelSet {
  public final static String CHECKSUM = "f299cbe7c81795c501daa3db0c218a20";
  
  public LossDetailsPanelSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LossDetailsCardCV getLossDetailsCardCV() {
    return getOrCreateProperty("LossDetailsCardCV", "LossDetailsCardCV", null, pcftest.LossDetailsPanelSet_default.LossDetailsCardCV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsCardCV extends PCFElement {
    public LossDetailsCardCV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Claim_DetailsCardTab getClaim_DetailsCardTab() {
      return getOrCreateProperty("Claim_DetailsCardTab", "Claim_DetailsCardTab", null, pcftest.LossDetailsPanelSet_default.LossDetailsCardCV.Claim_DetailsCardTab.class);
    }
    
    public Claim_ISOCardTab getClaim_ISOCardTab() {
      return getOrCreateProperty("Claim_ISOCardTab", "Claim_ISOCardTab", null, pcftest.LossDetailsPanelSet_default.LossDetailsCardCV.Claim_ISOCardTab.class);
    }
    
    public ISODetailsDV getISODetailsDV() {
      return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
    }
    
    public LossDetailsDV_Auto getLossDetailsDV_Auto() {
      return getOrCreateProperty("LossDetailsDV_Auto", "LossDetailsDV", null, pcftest.LossDetailsDV_Auto.class);
    }
    
    public LossDetailsDV_Gl getLossDetailsDV_Gl() {
      return getOrCreateProperty("LossDetailsDV_Gl", "LossDetailsDV", null, pcftest.LossDetailsDV_Gl.class);
    }
    
    public LossDetailsDV_Pr getLossDetailsDV_Pr() {
      return getOrCreateProperty("LossDetailsDV_Pr", "LossDetailsDV", null, pcftest.LossDetailsDV_Pr.class);
    }
    
    public LossDetailsDV_Trav getLossDetailsDV_Trav() {
      return getOrCreateProperty("LossDetailsDV_Trav", "LossDetailsDV", null, pcftest.LossDetailsDV_Trav.class);
    }
    
    public LossDetailsDV_Wc getLossDetailsDV_Wc() {
      return getOrCreateProperty("LossDetailsDV_Wc", "LossDetailsDV", null, pcftest.LossDetailsDV_Wc.class);
    }
    
    public LossDetailsDV_default getLossDetailsDV_default() {
      return getOrCreateProperty("LossDetailsDV_default", "LossDetailsDV", null, pcftest.LossDetailsDV_default.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_DetailsCardTab extends ClickableActionElement {
      public Claim_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ISOCardTab extends ClickableActionElement {
      public Claim_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}