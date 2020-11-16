package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookAdditionalInfoInputSet_Person.Gender;
import pcftest.AddressBookAdditionalInfoInputSet_Person.Guardian;
import pcftest.AddressBookAdditionalInfoInputSet_Person.Organization;
import pcftest.AddressBookAdditionalInfoInputSet_Person.TaxFilingStatus;
import typekey.GenderType;
import typekey.TaxFilingStatusType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookAdditionalInfoInputSet_Person extends AddressBookAdditionalInfoInputSet {
  public final static String CHECKSUM = "310f672e2213732ea25621f45c657d1a";
  
  public AddressBookAdditionalInfoInputSet_Person(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.AddressBookAdditionalInfoInputSet_Person.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AddressBookAdditionalInfoInputSet_Person.Currency.class);
  }
  
  public DateElement getDateOfBirth() {
    return getOrCreateProperty("DateOfBirth", "DateOfBirth", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Gender getGender() {
    return getOrCreateProperty("Gender", "Gender", null, pcftest.AddressBookAdditionalInfoInputSet_Person.Gender.class);
  }
  
  public Guardian getGuardian() {
    return getOrCreateProperty("Guardian", "Guardian", null, pcftest.AddressBookAdditionalInfoInputSet_Person.Guardian.class);
  }
  
  public pcftest.AddressBookAdditionalInfoInputSet_Person.MaritalStatus getMaritalStatus() {
    return getOrCreateProperty("MaritalStatus", "MaritalStatus", null, pcftest.AddressBookAdditionalInfoInputSet_Person.MaritalStatus.class);
  }
  
  public ValueElement getOccupation() {
    return getOrCreateProperty("Occupation", "Occupation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Organization getOrganization() {
    return getOrCreateProperty("Organization", "Organization", null, pcftest.AddressBookAdditionalInfoInputSet_Person.Organization.class);
  }
  
  public TaxFilingStatus getTaxFilingStatus() {
    return getOrCreateProperty("TaxFilingStatus", "TaxFilingStatus", null, pcftest.AddressBookAdditionalInfoInputSet_Person.TaxFilingStatus.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Guardian extends ValueElement {
    public Guardian(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookContactDetailPopup click() {
      return clickThis(pcftest.AddressBookContactDetailPopup.class);
    }
    
    public pcftest.AddressBookAdditionalInfoInputSet_Person.Guardian.MenuItem_NoneSelected getMenuItem_NoneSelected() {
      return getOrCreateProperty("MenuItem_NoneSelected", "MenuItem_NoneSelected", null, pcftest.AddressBookAdditionalInfoInputSet_Person.Guardian.MenuItem_NoneSelected.class);
    }
    
    public pcftest.AddressBookAdditionalInfoInputSet_Person.Guardian.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.AddressBookAdditionalInfoInputSet_Person.Guardian.MenuItem_Search.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_NoneSelected extends ClickableActionElement {
      public MenuItem_NoneSelected(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Organization extends ValueElement {
    public Organization(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookContactDetailPopup click() {
      return clickThis(pcftest.AddressBookContactDetailPopup.class);
    }
    
    public pcftest.AddressBookAdditionalInfoInputSet_Person.Organization.MenuItem_NoneSelected getMenuItem_NoneSelected() {
      return getOrCreateProperty("MenuItem_NoneSelected", "MenuItem_NoneSelected", null, pcftest.AddressBookAdditionalInfoInputSet_Person.Organization.MenuItem_NoneSelected.class);
    }
    
    public pcftest.AddressBookAdditionalInfoInputSet_Person.Organization.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.AddressBookAdditionalInfoInputSet_Person.Organization.MenuItem_Search.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_NoneSelected extends ClickableActionElement {
      public MenuItem_NoneSelected(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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