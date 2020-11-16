package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimExposureDV_Pipdamages.DeathBenefitsCardTab;
import pcftest.NewClaimExposureDV_Pipdamages.ReplacementServicesCardTab;
import pcftest.NewClaimExposureDV_Pipdamages.SummaryCardTab;
import pcftest.NewClaimExposureDV_Pipdamages.VocationalBenefitsCardTab;
import pcftest.NewClaimExposureDV_Pipdamages.WageBenefitsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposureDV_Pipdamages extends NewClaimExposureDV {
  public final static String CHECKSUM = "47348541923353c93c5774a3dced4f8b";
  
  public NewClaimExposureDV_Pipdamages(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DeathBenefitsCardTab getDeathBenefitsCardTab() {
    return getOrCreateProperty("DeathBenefitsCardTab", "DeathBenefitsCardTab", null, pcftest.NewClaimExposureDV_Pipdamages.DeathBenefitsCardTab.class);
  }
  
  public NewClaimPIPDeathBenefitsDV getNewClaimPIPDeathBenefitsDV() {
    return getOrCreateProperty("NewClaimPIPDeathBenefitsDV", "NewClaimPIPDeathBenefitsDV", null, pcftest.NewClaimPIPDeathBenefitsDV.class);
  }
  
  public NewClaimPIPSummaryDV getNewClaimPIPSummaryDV() {
    return getOrCreateProperty("NewClaimPIPSummaryDV", "NewClaimPIPSummaryDV", null, pcftest.NewClaimPIPSummaryDV.class);
  }
  
  public NewClaimPIPVocBenefitsDV getNewClaimPIPVocBenefitsDV() {
    return getOrCreateProperty("NewClaimPIPVocBenefitsDV", "NewClaimPIPVocBenefitsDV", null, pcftest.NewClaimPIPVocBenefitsDV.class);
  }
  
  public NewClaimReplacementServicesDV getNewClaimReplacementServicesDV() {
    return getOrCreateProperty("NewClaimReplacementServicesDV", "NewClaimReplacementServicesDV", null, pcftest.NewClaimReplacementServicesDV.class);
  }
  
  public NewClaimWageBenefitsDV getNewClaimWageBenefitsDV() {
    return getOrCreateProperty("NewClaimWageBenefitsDV", "NewClaimWageBenefitsDV", null, pcftest.NewClaimWageBenefitsDV.class);
  }
  
  public ReplacementServicesCardTab getReplacementServicesCardTab() {
    return getOrCreateProperty("ReplacementServicesCardTab", "ReplacementServicesCardTab", null, pcftest.NewClaimExposureDV_Pipdamages.ReplacementServicesCardTab.class);
  }
  
  public SummaryCardTab getSummaryCardTab() {
    return getOrCreateProperty("SummaryCardTab", "SummaryCardTab", null, pcftest.NewClaimExposureDV_Pipdamages.SummaryCardTab.class);
  }
  
  public VocationalBenefitsCardTab getVocationalBenefitsCardTab() {
    return getOrCreateProperty("VocationalBenefitsCardTab", "VocationalBenefitsCardTab", null, pcftest.NewClaimExposureDV_Pipdamages.VocationalBenefitsCardTab.class);
  }
  
  public WageBenefitsCardTab getWageBenefitsCardTab() {
    return getOrCreateProperty("WageBenefitsCardTab", "WageBenefitsCardTab", null, pcftest.NewClaimExposureDV_Pipdamages.WageBenefitsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeathBenefitsCardTab extends ClickableActionElement {
    public DeathBenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReplacementServicesCardTab extends ClickableActionElement {
    public ReplacementServicesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SummaryCardTab extends ClickableActionElement {
    public SummaryCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VocationalBenefitsCardTab extends ClickableActionElement {
    public VocationalBenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WageBenefitsCardTab extends ClickableActionElement {
    public WageBenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}