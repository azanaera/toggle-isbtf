package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.Organization;
import pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.Organization.MenuItem_NoneSelected;
import pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.Organization.MenuItem_Search;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Adjudicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookAdditionalInfoInputSet_Adjudicator extends AddressBookAdditionalInfoInputSet {
  public final static String CHECKSUM = "c1934108cea69b5797ea2cd22f76970d";
  
  public AddressBookAdditionalInfoInputSet_Adjudicator(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.AdjudicativeDomain getAdjudicativeDomain() {
    return getOrCreateProperty("AdjudicativeDomain", "AdjudicativeDomain", null, pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.AdjudicativeDomain.class);
  }
  
  public ValueElement getAdjudicatorLicense() {
    return getOrCreateProperty("AdjudicatorLicense", "AdjudicatorLicense", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.Currency.class);
  }
  
  public Organization getOrganization() {
    return getOrCreateProperty("Organization", "Organization", null, pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.Organization.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Adjudicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdjudicativeDomain extends SelectElement {
    public AdjudicativeDomain(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.AdjudicativeDomain arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.AdjudicativeDomain getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AdjudicativeDomain.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.AdjudicativeDomain arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.Adjudicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Organization extends ValueElement {
    public Organization(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookContactDetailPopup click() {
      return clickThis(pcftest.AddressBookContactDetailPopup.class);
    }
    
    public MenuItem_NoneSelected getMenuItem_NoneSelected() {
      return getOrCreateProperty("MenuItem_NoneSelected", "MenuItem_NoneSelected", null, pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.Organization.MenuItem_NoneSelected.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.Organization.MenuItem_Search.class);
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
  
  
}