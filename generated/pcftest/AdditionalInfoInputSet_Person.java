package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdditionalInfoInputSet_Person.Gender;
import pcftest.AdditionalInfoInputSet_Person.Guardian;
import pcftest.AdditionalInfoInputSet_Person.IDType;
import pcftest.AdditionalInfoInputSet_Person.Organization;
import pcftest.AdditionalInfoInputSet_Person.TaxFilingStatus;
import typekey.ClaimantIDType;
import typekey.GenderType;
import typekey.TaxFilingStatusType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalInfoInputSet_Person extends AdditionalInfoInputSet {
  public final static String CHECKSUM = "b0681ff571d0f2a741c76b1e2112d5d1";
  
  public AdditionalInfoInputSet_Person(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.AdditionalInfoInputSet_Person.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AdditionalInfoInputSet_Person.Currency.class);
  }
  
  public DateElement getDateOfBirth() {
    return getOrCreateProperty("DateOfBirth", "DateOfBirth", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getDateOfDeath_Ext() {
    return getOrCreateProperty("DateOfDeath_Ext", "DateOfDeath_Ext", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getEducationLevel() {
    return getOrCreateProperty("EducationLevel", "EducationLevel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmployeeSecurityID() {
    return getOrCreateProperty("EmployeeSecurityID", "EmployeeSecurityID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Gender getGender() {
    return getOrCreateProperty("Gender", "Gender", null, pcftest.AdditionalInfoInputSet_Person.Gender.class);
  }
  
  public ValueElement getGreenCardNumber() {
    return getOrCreateProperty("GreenCardNumber", "GreenCardNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Guardian getGuardian() {
    return getOrCreateProperty("Guardian", "Guardian", null, pcftest.AdditionalInfoInputSet_Person.Guardian.class);
  }
  
  public IDType getIDType() {
    return getOrCreateProperty("IDType", "IDType", null, pcftest.AdditionalInfoInputSet_Person.IDType.class);
  }
  
  public ValueElement getJurisdictionAssignedID() {
    return getOrCreateProperty("JurisdictionAssignedID", "JurisdictionAssignedID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.AdditionalInfoInputSet_Person.MaritalStatus getMaritalStatus() {
    return getOrCreateProperty("MaritalStatus", "MaritalStatus", null, pcftest.AdditionalInfoInputSet_Person.MaritalStatus.class);
  }
  
  public BooleanValueElement getMedicareBeneficiary_Ext() {
    return getOrCreateProperty("MedicareBeneficiary_Ext", "MedicareBeneficiary_Ext", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getOccupation() {
    return getOrCreateProperty("Occupation", "Occupation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Organization getOrganization() {
    return getOrCreateProperty("Organization", "Organization", null, pcftest.AdditionalInfoInputSet_Person.Organization.class);
  }
  
  public ValueElement getPassportNumber() {
    return getOrCreateProperty("PassportNumber", "PassportNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getSSNReleaseAuthorized() {
    return getOrCreateProperty("SSNReleaseAuthorized", "SSNReleaseAuthorized", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getTaxExemptionsEntitled() {
    return getOrCreateProperty("TaxExemptionsEntitled", "TaxExemptionsEntitled", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TaxFilingStatus getTaxFilingStatus() {
    return getOrCreateProperty("TaxFilingStatus", "TaxFilingStatus", null, pcftest.AdditionalInfoInputSet_Person.TaxFilingStatus.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVisaNumber() {
    return getOrCreateProperty("VisaNumber", "VisaNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Gender extends SelectElement {
    public Gender(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(GenderType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public GenderType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.GenderType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(GenderType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Guardian extends SelectElement {
    public Guardian(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.AdditionalInfoInputSet_Person.Guardian.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.AdditionalInfoInputSet_Person.Guardian.MenuItem_Search.class);
    }
    
    public pcftest.AdditionalInfoInputSet_Person.Guardian.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.AdditionalInfoInputSet_Person.Guardian.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDType extends SelectElement {
    public IDType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimantIDType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimantIDType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimantIDType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimantIDType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MaritalStatus extends SelectElement {
    public MaritalStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.MaritalStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.MaritalStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MaritalStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.MaritalStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Organization extends SelectElement {
    public Organization(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.AdditionalInfoInputSet_Person.Organization.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.AdditionalInfoInputSet_Person.Organization.MenuItem_Search.class);
    }
    
    public pcftest.AdditionalInfoInputSet_Person.Organization.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.AdditionalInfoInputSet_Person.Organization.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TaxFilingStatus extends SelectElement {
    public TaxFilingStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(TaxFilingStatusType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public TaxFilingStatusType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TaxFilingStatusType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(TaxFilingStatusType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}