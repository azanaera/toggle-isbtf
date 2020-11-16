package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CompanyVendorAdditionalInfoInputSet_CompanyVendor.IsVendorAvailable_Ext;
import typekey.VendorAvailabilityType_Ext;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CompanyVendorAdditionalInfoInputSet_CompanyVendor extends CompanyVendorAdditionalInfoInputSet {
  public final static String CHECKSUM = "789416d6bd9d8ac4529340f97d27a6f2";
  
  public CompanyVendorAdditionalInfoInputSet_CompanyVendor(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CompanyVendorSpecialtyInputSet_AutoRepairShop getCompanyVendorSpecialtyInputSet_AutoRepairShop() {
    return getOrCreateProperty("CompanyVendorSpecialtyInputSet_AutoRepairShop", "CompanyVendorSpecialtyInputSet", null, pcftest.CompanyVendorSpecialtyInputSet_AutoRepairShop.class);
  }
  
  public CompanyVendorSpecialtyInputSet_AutoTowingAgcy getCompanyVendorSpecialtyInputSet_AutoTowingAgcy() {
    return getOrCreateProperty("CompanyVendorSpecialtyInputSet_AutoTowingAgcy", "CompanyVendorSpecialtyInputSet", null, pcftest.CompanyVendorSpecialtyInputSet_AutoTowingAgcy.class);
  }
  
  public CompanyVendorSpecialtyInputSet_LawFirm getCompanyVendorSpecialtyInputSet_LawFirm() {
    return getOrCreateProperty("CompanyVendorSpecialtyInputSet_LawFirm", "CompanyVendorSpecialtyInputSet", null, pcftest.CompanyVendorSpecialtyInputSet_LawFirm.class);
  }
  
  public CompanyVendorSpecialtyInputSet_MedicalCareOrg getCompanyVendorSpecialtyInputSet_MedicalCareOrg() {
    return getOrCreateProperty("CompanyVendorSpecialtyInputSet_MedicalCareOrg", "CompanyVendorSpecialtyInputSet", null, pcftest.CompanyVendorSpecialtyInputSet_MedicalCareOrg.class);
  }
  
  public CompanyVendorSpecialtyInputSet_default getCompanyVendorSpecialtyInputSet_default() {
    return getOrCreateProperty("CompanyVendorSpecialtyInputSet_default", "CompanyVendorSpecialtyInputSet", null, pcftest.CompanyVendorSpecialtyInputSet_default.class);
  }
  
  public BooleanValueElement getIsPreferredVendor() {
    return getOrCreateProperty("IsPreferredVendor", "IsPreferredVendor", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public IsVendorAvailable_Ext getIsVendorAvailable_Ext() {
    return getOrCreateProperty("IsVendorAvailable_Ext", "IsVendorAvailable_Ext", null, pcftest.CompanyVendorAdditionalInfoInputSet_CompanyVendor.IsVendorAvailable_Ext.class);
  }
  
  public ValueElement getOverallReviewScore() {
    return getOrCreateProperty("OverallReviewScore", "OverallReviewScore", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVendorID_Ext() {
    return getOrCreateProperty("VendorID_Ext", "VendorID_Ext", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IsVendorAvailable_Ext extends SelectElement {
    public IsVendorAvailable_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(VendorAvailabilityType_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public VendorAvailabilityType_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VendorAvailabilityType_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(VendorAvailabilityType_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}