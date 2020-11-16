package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_Lostwages.BenefitsCardTab;
import pcftest.ExposureDetailDV_Lostwages.SummaryCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Lostwages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_Lostwages extends ExposureDetailDV {
  public final static String CHECKSUM = "7603741ccea8d2c78f1d58e28fe0b27e";
  
  public ExposureDetailDV_Lostwages(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BenefitsCardTab getBenefitsCardTab() {
    return getOrCreateProperty("BenefitsCardTab", "BenefitsCardTab", null, pcftest.ExposureDetailDV_Lostwages.BenefitsCardTab.class);
  }
  
  public LostWagesBenefitsDV getLostWagesBenefitsDV() {
    return getOrCreateProperty("LostWagesBenefitsDV", "LostWagesBenefitsDV", null, pcftest.LostWagesBenefitsDV.class);
  }
  
  public LostWagesSummaryDV getLostWagesSummaryDV() {
    return getOrCreateProperty("LostWagesSummaryDV", "LostWagesSummaryDV", null, pcftest.LostWagesSummaryDV.class);
  }
  
  public SummaryCardTab getSummaryCardTab() {
    return getOrCreateProperty("SummaryCardTab", "SummaryCardTab", null, pcftest.ExposureDetailDV_Lostwages.SummaryCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Lostwages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BenefitsCardTab extends ClickableActionElement {
    public BenefitsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Lostwages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SummaryCardTab extends ClickableActionElement {
    public SummaryCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}