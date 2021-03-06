package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AgreementDetailsDV_SurplusRITreaty.AgreementCurrency;
import typekey.Currency;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/AgreementDetailsDV.SurplusRITreaty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AgreementDetailsDV_SurplusRITreaty extends AgreementDetailsDV {
  public final static String CHECKSUM = "f27293ae3adbcd7cb9a55a62fd7dfffd";
  
  public AgreementDetailsDV_SurplusRITreaty(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AgreementCurrency getAgreementCurrency() {
    return getOrCreateProperty("AgreementCurrency", "AgreementCurrency", null, pcftest.AgreementDetailsDV_SurplusRITreaty.AgreementCurrency.class);
  }
  
  public ValueElement getAgreementName() {
    return getOrCreateProperty("AgreementName", "AgreementName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAgreementNumber() {
    return getOrCreateProperty("AgreementNumber", "AgreementNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAttachmentPoint() {
    return getOrCreateProperty("AttachmentPoint", "AttachmentPoint", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getExceedsNotificationThreshold() {
    return getOrCreateProperty("ExceedsNotificationThreshold", "ExceedsNotificationThreshold", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getNotificationThreshold() {
    return getOrCreateProperty("NotificationThreshold", "NotificationThreshold", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getProportionalShare() {
    return getOrCreateProperty("ProportionalShare", "ProportionalShare", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RISubtypeAndGroupInputSet getRISubtypeAndGroupInputSet() {
    return getOrCreateProperty("RISubtypeAndGroupInputSet", "RISubtypeAndGroupInputSet", null, pcftest.RISubtypeAndGroupInputSet.class);
  }
  
  public ValueElement getRecoveryLimit() {
    return getOrCreateProperty("RecoveryLimit", "RecoveryLimit", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTopOfLayer() {
    return getOrCreateProperty("TopOfLayer", "TopOfLayer", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/AgreementDetailsDV.SurplusRITreaty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AgreementCurrency extends SelectElement {
    public AgreementCurrency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}