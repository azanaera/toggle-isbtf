package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewExposureDV_Lostwages.BenefitsCardTab;
import pcftest.NewExposureDV_Lostwages.SummaryCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Lostwages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureDV_Lostwages extends NewExposureDV {
  public final static String CHECKSUM = "bf0e32af0889852b4209df34f8e13c78";
  
  public NewExposureDV_Lostwages(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BenefitsCardTab getBenefitsCardTab() {
    return getOrCreateProperty("BenefitsCardTab", "BenefitsCardTab", null, pcftest.NewExposureDV_Lostwages.BenefitsCardTab.class);
  }
  
  public NewLostWagesBenefitsDV getNewLostWagesBenefitsDV() {
    return getOrCreateProperty("NewLostWagesBenefitsDV", "NewLostWagesBenefitsDV", null, pcftest.NewLostWagesBenefitsDV.class);
  }
  
  public NewLostWagesSummaryDV getNewLostWagesSummaryDV() {
    return getOrCreateProperty("NewLostWagesSummaryDV", "NewLostWagesSummaryDV", null, pcftest.NewLostWagesSummaryDV.class);
  }
  
  public SummaryCardTab getSummaryCardTab() {
    return getOrCreateProperty("SummaryCardTab", "SummaryCardTab", null, pcftest.NewExposureDV_Lostwages.SummaryCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Lostwages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BenefitsCardTab extends ClickableActionElement {
    public BenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Lostwages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SummaryCardTab extends ClickableActionElement {
    public SummaryCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}