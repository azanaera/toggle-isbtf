package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PIPDeathBenefitsDV.LostWagesBenefits_PaymentFrequency;
import typekey.PaymentFrequencyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/PIPDeathBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PIPDeathBenefitsDV extends DetailViewElement {
  public final static String CHECKSUM = "61f03fb4eae7de88ed7c7899d059a7d5";
  
  public PIPDeathBenefitsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getLostWagesBenefits_BenefitsBeginDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsBeginDate", "LostWagesBenefits_BenefitsBeginDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getLostWagesBenefits_BenefitsEndDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsEndDate", "LostWagesBenefits_BenefitsEndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getLostWagesBenefits_Description() {
    return getOrCreateProperty("LostWagesBenefits_Description", "LostWagesBenefits_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_MaxBurialRate() {
    return getOrCreateProperty("LostWagesBenefits_MaxBurialRate", "LostWagesBenefits_MaxBurialRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LostWagesBenefits_PaymentFrequency getLostWagesBenefits_PaymentFrequency() {
    return getOrCreateProperty("LostWagesBenefits_PaymentFrequency", "LostWagesBenefits_PaymentFrequency", null, pcftest.PIPDeathBenefitsDV.LostWagesBenefits_PaymentFrequency.class);
  }
  
  public ValueElement getLostWagesBenefits_WeeklyCompRate() {
    return getOrCreateProperty("LostWagesBenefits_WeeklyCompRate", "LostWagesBenefits_WeeklyCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/PIPDeathBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LostWagesBenefits_PaymentFrequency extends SelectElement {
    public LostWagesBenefits_PaymentFrequency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PaymentFrequencyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PaymentFrequencyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentFrequencyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PaymentFrequencyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}