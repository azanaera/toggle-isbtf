package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.AutoRepairShop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CompanyVendorSpecialtyInputSet_AutoRepairShop extends CompanyVendorSpecialtyInputSet {
  public final static String CHECKSUM = "96ee0850aa23050e35e3e48663aeb362";
  
  public CompanyVendorSpecialtyInputSet_AutoRepairShop(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBusinessLicense() {
    return getOrCreateProperty("BusinessLicense", "BusinessLicense", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}