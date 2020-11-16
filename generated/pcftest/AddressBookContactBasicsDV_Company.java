package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV;
import pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.CategoryHeader;
import pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.ScoreHeader;
import pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.entry;
import pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.entry.Category;
import pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.entry._Select;
import pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.entry._ViewDetail;
import pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV_tb;
import pcftest.AddressBookContactBasicsDV_Company.ContactEFTLV_tb;
import pcftest.AddressBookContactBasicsDV_Company.ContactEFTLV_tb.Add;
import pcftest.AddressBookContactBasicsDV_Company.ContactEFTLV_tb.Remove;
import pcftest.AddressBookContactBasicsDV_Company.IsVendorAvailable_Ext;
import pcftest.AddressBookContactBasicsDV_Company.OrganizationName;
import typekey.ReviewCategory;
import typekey.VendorAvailabilityType_Ext;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactBasicsDV_Company extends AddressBookContactBasicsDV {
  public final static String CHECKSUM = "d286963bca2c357867e9e1fb69b94014";
  
  public AddressBookContactBasicsDV_Company(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookBusinessContactInfoInputSet getAddressBookBusinessContactInfoInputSet() {
    return getOrCreateProperty("AddressBookBusinessContactInfoInputSet", "AddressBookBusinessContactInfoInputSet", null, pcftest.AddressBookBusinessContactInfoInputSet.class);
  }
  
  public AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor getAddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor() {
    return getOrCreateProperty("AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor", "AddressBookCompanyVendorAdditionalInfoInputSet", null, pcftest.AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor.class);
  }
  
  public AddressBookPrimaryAddressInputSet getAddressBookPrimaryAddressInputSet() {
    return getOrCreateProperty("AddressBookPrimaryAddressInputSet", "AddressBookPrimaryAddressInputSet", null, pcftest.AddressBookPrimaryAddressInputSet.class);
  }
  
  public AddressBookVendorW9InfoInputSet getAddressBookVendorW9InfoInputSet() {
    return getOrCreateProperty("AddressBookVendorW9InfoInputSet", "AddressBookVendorW9InfoInputSet", null, pcftest.AddressBookVendorW9InfoInputSet.class);
  }
  
  public BooleanValueElement getBackupwithholding_Ext() {
    return getOrCreateProperty("Backupwithholding_Ext", "Backupwithholding_Ext", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public CategoryScoresLV getCategoryScoresLV() {
    return getOrCreateProperty("CategoryScoresLV", "CategoryScoresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.class);
  }
  
  public CategoryScoresLV_tb getCategoryScoresLV_tb() {
    return getOrCreateProperty("CategoryScoresLV_tb", "CategoryScoresLV_tb", null, pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV_tb.class);
  }
  
  public ContactEFTLV getContactEFTLV() {
    return getOrCreateProperty("ContactEFTLV", "ContactEFTLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ContactEFTLV.class);
  }
  
  public ContactEFTLV_tb getContactEFTLV_tb() {
    return getOrCreateProperty("ContactEFTLV_tb", "ContactEFTLV_tb", null, pcftest.AddressBookContactBasicsDV_Company.ContactEFTLV_tb.class);
  }
  
  public pcftest.AddressBookContactBasicsDV_Company.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AddressBookContactBasicsDV_Company.Currency.class);
  }
  
  public ValueElement getDoingBusinessAs_Ext() {
    return getOrCreateProperty("DoingBusinessAs_Ext", "DoingBusinessAs_Ext", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEIN() {
    return getOrCreateProperty("EIN", "EIN", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IsVendorAvailable_Ext getIsVendorAvailable_Ext() {
    return getOrCreateProperty("IsVendorAvailable_Ext", "IsVendorAvailable_Ext", null, pcftest.AddressBookContactBasicsDV_Company.IsVendorAvailable_Ext.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OrganizationName getOrganizationName() {
    return getOrCreateProperty("OrganizationName", "OrganizationName", null, pcftest.AddressBookContactBasicsDV_Company.OrganizationName.class);
  }
  
  public ValueElement getV_EIN() {
    return getOrCreateProperty("V_EIN", "V_EIN", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getscore() {
    return getOrCreateProperty("score", "score", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategoryScoresLV extends PCFElement {
    public CategoryScoresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CategoryHeader getCategoryHeader() {
      return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.CategoryHeader.class);
    }
    
    public ScoreHeader getScoreHeader() {
      return getOrCreateProperty("ScoreHeader", "ScoreHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.ScoreHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CategoryHeader extends ValueElement {
      public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScoreHeader extends ValueElement {
      public ScoreHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Category getCategory() {
        return getOrCreateProperty("Category", "Category", null, pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.entry.Category.class);
      }
      
      public ValueElement getScore() {
        return getOrCreateProperty("Score", "Score", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AddressBookContactBasicsDV_Company.CategoryScoresLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Category extends SelectElement {
        public Category(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(ReviewCategory arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public ReviewCategory getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ReviewCategory.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(ReviewCategory arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategoryScoresLV_tb extends PCFElement {
    public CategoryScoresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactEFTLV_tb extends PCFElement {
    public ContactEFTLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.AddressBookContactBasicsDV_Company.ContactEFTLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.AddressBookContactBasicsDV_Company.ContactEFTLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Company.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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