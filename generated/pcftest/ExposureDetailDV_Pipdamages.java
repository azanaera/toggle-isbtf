package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_Pipdamages.DeathBenefitsCardTab;
import pcftest.ExposureDetailDV_Pipdamages.ReplacementServicesCardTab;
import pcftest.ExposureDetailDV_Pipdamages.SummaryCardTab;
import pcftest.ExposureDetailDV_Pipdamages.VocationalBenefitsCardTab;
import pcftest.ExposureDetailDV_Pipdamages.WageBenefitsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_Pipdamages extends ExposureDetailDV {
  public final static String CHECKSUM = "7003b65e46a93d673de566429e5efe88";
  
  public ExposureDetailDV_Pipdamages(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DeathBenefitsCardTab getDeathBenefitsCardTab() {
    return getOrCreateProperty("DeathBenefitsCardTab", "DeathBenefitsCardTab", null, pcftest.ExposureDetailDV_Pipdamages.DeathBenefitsCardTab.class);
  }
  
  public PIPDeathBenefitsDV getPIPDeathBenefitsDV() {
    return getOrCreateProperty("PIPDeathBenefitsDV", "PIPDeathBenefitsDV", null, pcftest.PIPDeathBenefitsDV.class);
  }
  
  public PIPSummaryDV getPIPSummaryDV() {
    return getOrCreateProperty("PIPSummaryDV", "PIPSummaryDV", null, pcftest.PIPSummaryDV.class);
  }
  
  public PIPVocBenefitsDV getPIPVocBenefitsDV() {
    return getOrCreateProperty("PIPVocBenefitsDV", "PIPVocBenefitsDV", null, pcftest.PIPVocBenefitsDV.class);
  }
  
  public ReplacementServicesCardTab getReplacementServicesCardTab() {
    return getOrCreateProperty("ReplacementServicesCardTab", "ReplacementServicesCardTab", null, pcftest.ExposureDetailDV_Pipdamages.ReplacementServicesCardTab.class);
  }
  
  public ReplacementServicesDV getReplacementServicesDV() {
    return getOrCreateProperty("ReplacementServicesDV", "ReplacementServicesDV", null, pcftest.ReplacementServicesDV.class);
  }
  
  public SummaryCardTab getSummaryCardTab() {
    return getOrCreateProperty("SummaryCardTab", "SummaryCardTab", null, pcftest.ExposureDetailDV_Pipdamages.SummaryCardTab.class);
  }
  
  public VocationalBenefitsCardTab getVocationalBenefitsCardTab() {
    return getOrCreateProperty("VocationalBenefitsCardTab", "VocationalBenefitsCardTab", null, pcftest.ExposureDetailDV_Pipdamages.VocationalBenefitsCardTab.class);
  }
  
  public WageBenefitsCardTab getWageBenefitsCardTab() {
    return getOrCreateProperty("WageBenefitsCardTab", "WageBenefitsCardTab", null, pcftest.ExposureDetailDV_Pipdamages.WageBenefitsCardTab.class);
  }
  
  public WageBenefitsDV getWageBenefitsDV() {
    return getOrCreateProperty("WageBenefitsDV", "WageBenefitsDV", null, pcftest.WageBenefitsDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeathBenefitsCardTab extends ClickableActionElement {
    public DeathBenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReplacementServicesCardTab extends ClickableActionElement {
    public ReplacementServicesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SummaryCardTab extends ClickableActionElement {
    public SummaryCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VocationalBenefitsCardTab extends ClickableActionElement {
    public VocationalBenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Pipdamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WageBenefitsCardTab extends ClickableActionElement {
    public WageBenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}