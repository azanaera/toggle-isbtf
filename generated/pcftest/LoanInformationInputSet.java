package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/LoanInformationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoanInformationInputSet extends PCFElement {
  public final static String CHECKSUM = "f4cded989a4854bc4cf99bb260c7ca23";
  
  public LoanInformationInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getLoanInformation_Loan() {
    return getOrCreateProperty("LoanInformation_Loan", "LoanInformation_Loan", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getMonthlyPayment() {
    return getOrCreateProperty("MonthlyPayment", "MonthlyPayment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMonthsRemaining() {
    return getOrCreateProperty("MonthsRemaining", "MonthsRemaining", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPayoffAmount() {
    return getOrCreateProperty("PayoffAmount", "PayoffAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}