package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdditionalInfoInputSet_PersonVendor.IsVendorAvailable_Ext;
import typekey.VendorAvailabilityType_Ext;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.PersonVendor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalInfoInputSet_PersonVendor extends AdditionalInfoInputSet {
  public final static String CHECKSUM = "fc61e57efd1d8a3f5f95f9141a3453d1";
  
  public AdditionalInfoInputSet_PersonVendor(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AttorneyAdditionalInfoInputSet_Attorney getAttorneyAdditionalInfoInputSet_Attorney() {
    return getOrCreateProperty("AttorneyAdditionalInfoInputSet_Attorney", "AttorneyAdditionalInfoInputSet", null, pcftest.AttorneyAdditionalInfoInputSet_Attorney.class);
  }
  
  public BooleanValueElement getBackupwithholding_Ext() {
    return getOrCreateProperty("Backupwithholding_Ext", "Backupwithholding_Ext", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BusinessContactInfoInputSet getBusinessContactInfoInputSet() {
    return getOrCreateProperty("BusinessContactInfoInputSet", "BusinessContactInfoInputSet", null, pcftest.BusinessContactInfoInputSet.class);
  }
  
  public pcftest.AdditionalInfoInputSet_PersonVendor.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AdditionalInfoInputSet_PersonVendor.Currency.class);
  }
  
  public DoctorAdditionalInfoInputSet_Doctor getDoctorAdditionalInfoInputSet_Doctor() {
    return getOrCreateProperty("DoctorAdditionalInfoInputSet_Doctor", "DoctorAdditionalInfoInputSet", null, pcftest.DoctorAdditionalInfoInputSet_Doctor.class);
  }
  
  public BooleanValueElement getIsPreferredVendor() {
    return getOrCreateProperty("IsPreferredVendor", "IsPreferredVendor", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public IsVendorAvailable_Ext getIsVendorAvailable_Ext() {
    return getOrCreateProperty("IsVendorAvailable_Ext", "IsVendorAvailable_Ext", null, pcftest.AdditionalInfoInputSet_PersonVendor.IsVendorAvailable_Ext.class);
  }
  
  public ValueElement getOverallReviewScore() {
    return getOrCreateProperty("OverallReviewScore", "OverallReviewScore", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getPersonVendorValidFrom() {
    return getOrCreateProperty("PersonVendorValidFrom", "PersonVendorValidFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getPersonVendorValidTo() {
    return getOrCreateProperty("PersonVendorValidTo", "PersonVendorValidTo", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getSSN() {
    return getOrCreateProperty("SSN", "SSN", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVendorID_Ext() {
    return getOrCreateProperty("VendorID_Ext", "VendorID_Ext", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public VendorW9InfoInputSet getVendorW9InfoInputSet() {
    return getOrCreateProperty("VendorW9InfoInputSet", "VendorW9InfoInputSet", null, pcftest.VendorW9InfoInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.PersonVendor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Currency extends SelectElement {
    public Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.PersonVendor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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