package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimExposureDV_Lostwages.BenefitsCardTab;
import pcftest.NewClaimExposureDV_Lostwages.SummaryCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Lostwages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposureDV_Lostwages extends NewClaimExposureDV {
  public final static String CHECKSUM = "8d14e6ebcb243190e2bd4193ca06115f";
  
  public NewClaimExposureDV_Lostwages(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BenefitsCardTab getBenefitsCardTab() {
    return getOrCreateProperty("BenefitsCardTab", "BenefitsCardTab", null, pcftest.NewClaimExposureDV_Lostwages.BenefitsCardTab.class);
  }
  
  public NewClaimLostWagesBenefitsDV getNewClaimLostWagesBenefitsDV() {
    return getOrCreateProperty("NewClaimLostWagesBenefitsDV", "NewClaimLostWagesBenefitsDV", null, pcftest.NewClaimLostWagesBenefitsDV.class);
  }
  
  public NewClaimLostWagesSummaryDV getNewClaimLostWagesSummaryDV() {
    return getOrCreateProperty("NewClaimLostWagesSummaryDV", "NewClaimLostWagesSummaryDV", null, pcftest.NewClaimLostWagesSummaryDV.class);
  }
  
  public SummaryCardTab getSummaryCardTab() {
    return getOrCreateProperty("SummaryCardTab", "SummaryCardTab", null, pcftest.NewClaimExposureDV_Lostwages.SummaryCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Lostwages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BenefitsCardTab extends ClickableActionElement {
    public BenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Lostwages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SummaryCardTab extends ClickableActionElement {
    public SummaryCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}