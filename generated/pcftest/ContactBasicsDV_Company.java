package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContactBasicsDV_Company.ContactEFTLV_tb;
import pcftest.ContactBasicsDV_Company.ContactEFTLV_tb.Add;
import pcftest.ContactBasicsDV_Company.ContactEFTLV_tb.Remove;
import pcftest.ContactBasicsDV_Company.OrganizationName;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactBasicsDV_Company extends ContactBasicsDV {
  public final static String CHECKSUM = "57fffeee99d65daebfcca4240482d0f4";
  
  public ContactBasicsDV_Company(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.ContactBasicsDV_Company.BLOCode_Ext getBLOCode_Ext() {
    return getOrCreateProperty("BLOCode_Ext", "BLOCode_Ext", null, pcftest.ContactBasicsDV_Company.BLOCode_Ext.class);
  }
  
  public BooleanValueElement getBackupwithholding_Ext() {
    return getOrCreateProperty("Backupwithholding_Ext", "Backupwithholding_Ext", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BusinessContactInfoInputSet getBusinessContactInfoInputSet() {
    return getOrCreateProperty("BusinessContactInfoInputSet", "BusinessContactInfoInputSet", null, pcftest.BusinessContactInfoInputSet.class);
  }
  
  public CompanyVendorAdditionalInfoInputSet_CompanyVendor getCompanyVendorAdditionalInfoInputSet_CompanyVendor() {
    return getOrCreateProperty("CompanyVendorAdditionalInfoInputSet_CompanyVendor", "CompanyVendorAdditionalInfoInputSet", null, pcftest.CompanyVendorAdditionalInfoInputSet_CompanyVendor.class);
  }
  
  public DateElement getCompanyVendorValidFrom() {
    return getOrCreateProperty("CompanyVendorValidFrom", "CompanyVendorValidFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getCompanyVendorValidTo() {
    return getOrCreateProperty("CompanyVendorValidTo", "CompanyVendorValidTo", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ContactBasicsHeaderInputSet getContactBasicsHeaderInputSet() {
    return getOrCreateProperty("ContactBasicsHeaderInputSet", "ContactBasicsHeaderInputSet", null, pcftest.ContactBasicsHeaderInputSet.class);
  }
  
  public ContactEFTLV getContactEFTLV() {
    return getOrCreateProperty("ContactEFTLV", "ContactEFTLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ContactEFTLV.class);
  }
  
  public ContactEFTLV_tb getContactEFTLV_tb() {
    return getOrCreateProperty("ContactEFTLV_tb", "ContactEFTLV_tb", null, pcftest.ContactBasicsDV_Company.ContactEFTLV_tb.class);
  }
  
  public pcftest.ContactBasicsDV_Company.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.ContactBasicsDV_Company.Currency.class);
  }
  
  public ValueElement getDoingBusinessAs_Ext() {
    return getOrCreateProperty("DoingBusinessAs_Ext", "DoingBusinessAs_Ext", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OrganizationName getOrganizationName() {
    return getOrCreateProperty("OrganizationName", "OrganizationName", null, pcftest.ContactBasicsDV_Company.OrganizationName.class);
  }
  
  public PrimaryAddressInputSet getPrimaryAddressInputSet() {
    return getOrCreateProperty("PrimaryAddressInputSet", "PrimaryAddressInputSet", null, pcftest.PrimaryAddressInputSet.class);
  }
  
  public ValueElement getV_EIN() {
    return getOrCreateProperty("V_EIN", "V_EIN", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public VendorW9InfoInputSet getVendorW9InfoInputSet() {
    return getOrCreateProperty("VendorW9InfoInputSet", "VendorW9InfoInputSet", null, pcftest.VendorW9InfoInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BLOCode_Ext extends SelectElement {
    public BLOCode_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.BLOCode_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.BLOCode_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BLOCode_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.BLOCode_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactEFTLV_tb extends PCFElement {
    public ContactEFTLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ContactBasicsDV_Company.ContactEFTLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ContactBasicsDV_Company.ContactEFTLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationName extends PCFElement {
    public OrganizationName(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalContactNameInputSet_Japan getGlobalContactNameInputSet_Japan() {
      return getOrCreateProperty("GlobalContactNameInputSet_Japan", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_Japan.class);
    }
    
    public GlobalContactNameInputSet_default getGlobalContactNameInputSet_default() {
      return getOrCreateProperty("GlobalContactNameInputSet_default", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_default.class);
    }
    
    
  }
  
  
}