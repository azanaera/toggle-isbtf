package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/DeductibleInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DeductibleInfoInputSet extends PCFElement {
  public final static String CHECKSUM = "26af8a87a546668c34a97079a1bdec5e";
  
  public DeductibleInfoInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDeductibleAmount() {
    return getOrCreateProperty("DeductibleAmount", "DeductibleAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDeductibleAmountApplied() {
    return getOrCreateProperty("DeductibleAmountApplied", "DeductibleAmountApplied", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDeductibleAmountRemaining() {
    return getOrCreateProperty("DeductibleAmountRemaining", "DeductibleAmountRemaining", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDeductibleEditReason() {
    return getOrCreateProperty("DeductibleEditReason", "DeductibleEditReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getDeductibleOverridden() {
    return getOrCreateProperty("DeductibleOverridden", "DeductibleOverridden", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getDeductibleWaived() {
    return getOrCreateProperty("DeductibleWaived", "DeductibleWaived", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  
}