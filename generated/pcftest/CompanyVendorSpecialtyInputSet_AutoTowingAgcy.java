package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.AutoTowingAgcy.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CompanyVendorSpecialtyInputSet_AutoTowingAgcy extends CompanyVendorSpecialtyInputSet {
  public final static String CHECKSUM = "522cdf9af5bca7e9cf94ee4d057e18d3";
  
  public CompanyVendorSpecialtyInputSet_AutoTowingAgcy(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBusinessLicense() {
    return getOrCreateProperty("BusinessLicense", "BusinessLicense", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}