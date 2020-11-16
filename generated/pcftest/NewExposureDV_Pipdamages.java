package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewExposureDV_Pipdamages.DeathBenefitsCardTab;
import pcftest.NewExposureDV_Pipdamages.ReplacementServicesCardTab;
import pcftest.NewExposureDV_Pipdamages.SummaryCardTab;
import pcftest.NewExposureDV_Pipdamages.VocationalBenefitsCardTab;
import pcftest.NewExposureDV_Pipdamages.WageBenefitsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureDV_Pipdamages extends NewExposureDV {
  public final static String CHECKSUM = "a03f21f5a8b3a3d7349e93c6c774c779";
  
  public NewExposureDV_Pipdamages(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DeathBenefitsCardTab getDeathBenefitsCardTab() {
    return getOrCreateProperty("DeathBenefitsCardTab", "DeathBenefitsCardTab", null, pcftest.NewExposureDV_Pipdamages.DeathBenefitsCardTab.class);
  }
  
  public NewPIPDeathBenefitsDV getNewPIPDeathBenefitsDV() {
    return getOrCreateProperty("NewPIPDeathBenefitsDV", "NewPIPDeathBenefitsDV", null, pcftest.NewPIPDeathBenefitsDV.class);
  }
  
  public NewPIPSummaryDV getNewPIPSummaryDV() {
    return getOrCreateProperty("NewPIPSummaryDV", "NewPIPSummaryDV", null, pcftest.NewPIPSummaryDV.class);
  }
  
  public NewPIPVocBenefitsDV getNewPIPVocBenefitsDV() {
    return getOrCreateProperty("NewPIPVocBenefitsDV", "NewPIPVocBenefitsDV", null, pcftest.NewPIPVocBenefitsDV.class);
  }
  
  public NewReplacementServicesDV getNewReplacementServicesDV() {
    return getOrCreateProperty("NewReplacementServicesDV", "NewReplacementServicesDV", null, pcftest.NewReplacementServicesDV.class);
  }
  
  public NewWageBenefitsDV getNewWageBenefitsDV() {
    return getOrCreateProperty("NewWageBenefitsDV", "NewWageBenefitsDV", null, pcftest.NewWageBenefitsDV.class);
  }
  
  public ReplacementServicesCardTab getReplacementServicesCardTab() {
    return getOrCreateProperty("ReplacementServicesCardTab", "ReplacementServicesCardTab", null, pcftest.NewExposureDV_Pipdamages.ReplacementServicesCardTab.class);
  }
  
  public SummaryCardTab getSummaryCardTab() {
    return getOrCreateProperty("SummaryCardTab", "SummaryCardTab", null, pcftest.NewExposureDV_Pipdamages.SummaryCardTab.class);
  }
  
  public VocationalBenefitsCardTab getVocationalBenefitsCardTab() {
    return getOrCreateProperty("VocationalBenefitsCardTab", "VocationalBenefitsCardTab", null, pcftest.NewExposureDV_Pipdamages.VocationalBenefitsCardTab.class);
  }
  
  public WageBenefitsCardTab getWageBenefitsCardTab() {
    return getOrCreateProperty("WageBenefitsCardTab", "WageBenefitsCardTab", null, pcftest.NewExposureDV_Pipdamages.WageBenefitsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeathBenefitsCardTab extends ClickableActionElement {
    public DeathBenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReplacementServicesCardTab extends ClickableActionElement {
    public ReplacementServicesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SummaryCardTab extends ClickableActionElement {
    public SummaryCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VocationalBenefitsCardTab extends ClickableActionElement {
    public VocationalBenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WageBenefitsCardTab extends ClickableActionElement {
    public WageBenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}