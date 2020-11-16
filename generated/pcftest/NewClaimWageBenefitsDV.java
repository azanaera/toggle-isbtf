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
import pcftest.NewClaimWageBenefitsDV.CompBenefits_PaymentFrequency;
import typekey.PaymentFrequencyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWageBenefitsDV extends DetailViewElement {
  public final static String CHECKSUM = "933f4f356b4be2afef68ec00caf31020";
  
  public NewClaimWageBenefitsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getCompBenefits_BenefitsBeginDate() {
    return getOrCreateProperty("CompBenefits_BenefitsBeginDate", "CompBenefits_BenefitsBeginDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getCompBenefits_BenefitsEndDate() {
    return getOrCreateProperty("CompBenefits_BenefitsEndDate", "CompBenefits_BenefitsEndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public CompBenefits_PaymentFrequency getCompBenefits_PaymentFrequency() {
    return getOrCreateProperty("CompBenefits_PaymentFrequency", "CompBenefits_PaymentFrequency", null, pcftest.NewClaimWageBenefitsDV.CompBenefits_PaymentFrequency.class);
  }
  
  public ValueElement getCompBenefits_WeeklyCompRate() {
    return getOrCreateProperty("CompBenefits_WeeklyCompRate", "CompBenefits_WeeklyCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PIPEmploymentInputSet getPIPEmploymentInputSet() {
    return getOrCreateProperty("PIPEmploymentInputSet", "PIPEmploymentInputSet", null, pcftest.PIPEmploymentInputSet.class);
  }
  
  public PIPSSBenefitsInputSet getPIPSSBenefitsInputSet() {
    return getOrCreateProperty("PIPSSBenefitsInputSet", "PIPSSBenefitsInputSet", null, pcftest.PIPSSBenefitsInputSet.class);
  }
  
  public PIPWageBenefitsInputSet getPIPWageBenefitsInputSet() {
    return getOrCreateProperty("PIPWageBenefitsInputSet", "PIPWageBenefitsInputSet", null, pcftest.PIPWageBenefitsInputSet.class);
  }
  
  public PIPWorkersCompensationInputSet getPIPWorkersCompensationInputSet() {
    return getOrCreateProperty("PIPWorkersCompensationInputSet", "PIPWorkersCompensationInputSet", null, pcftest.PIPWorkersCompensationInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompBenefits_PaymentFrequency extends SelectElement {
    public CompBenefits_PaymentFrequency(ISmokeTest helper, PCFElementId componentId)  {
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