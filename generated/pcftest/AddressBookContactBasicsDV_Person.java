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
import pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV;
import pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.CategoryHeader;
import pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.ScoreHeader;
import pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.entry;
import pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.entry.Category;
import pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.entry._Select;
import pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.entry._ViewDetail;
import pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV_tb;
import pcftest.AddressBookContactBasicsDV_Person.ContactEFTLV_tb;
import pcftest.AddressBookContactBasicsDV_Person.ContactEFTLV_tb.Add;
import pcftest.AddressBookContactBasicsDV_Person.ContactEFTLV_tb.Remove;
import typekey.ReviewCategory;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactBasicsDV_Person extends AddressBookContactBasicsDV {
  public final static String CHECKSUM = "132a76daa115e1d41fb08143c87ca01f";
  
  public AddressBookContactBasicsDV_Person(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookAdditionalInfoInputSet_Adjudicator getAddressBookAdditionalInfoInputSet_Adjudicator() {
    return getOrCreateProperty("AddressBookAdditionalInfoInputSet_Adjudicator", "AddressBookAdditionalInfoInputSet", null, pcftest.AddressBookAdditionalInfoInputSet_Adjudicator.class);
  }
  
  public AddressBookAdditionalInfoInputSet_PersonVendor getAddressBookAdditionalInfoInputSet_Attorney() {
    return getOrCreateProperty("AddressBookAdditionalInfoInputSet_Attorney", "AddressBookAdditionalInfoInputSet", null, pcftest.AddressBookAdditionalInfoInputSet_PersonVendor.class);
  }
  
  public AddressBookAdditionalInfoInputSet_PersonVendor getAddressBookAdditionalInfoInputSet_Doctor() {
    return getOrCreateProperty("AddressBookAdditionalInfoInputSet_Doctor", "AddressBookAdditionalInfoInputSet", null, pcftest.AddressBookAdditionalInfoInputSet_PersonVendor.class);
  }
  
  public AddressBookAdditionalInfoInputSet_Person getAddressBookAdditionalInfoInputSet_Person() {
    return getOrCreateProperty("AddressBookAdditionalInfoInputSet_Person", "AddressBookAdditionalInfoInputSet", null, pcftest.AddressBookAdditionalInfoInputSet_Person.class);
  }
  
  public AddressBookAdditionalInfoInputSet_PersonVendor getAddressBookAdditionalInfoInputSet_PersonVendor() {
    return getOrCreateProperty("AddressBookAdditionalInfoInputSet_PersonVendor", "AddressBookAdditionalInfoInputSet", null, pcftest.AddressBookAdditionalInfoInputSet_PersonVendor.class);
  }
  
  public AddressBookAdditionalInfoInputSet_UserContact getAddressBookAdditionalInfoInputSet_UserContact() {
    return getOrCreateProperty("AddressBookAdditionalInfoInputSet_UserContact", "AddressBookAdditionalInfoInputSet", null, pcftest.AddressBookAdditionalInfoInputSet_UserContact.class);
  }
  
  public AddressBookDriversLicenseInfoInputSet getAddressBookDriversLicenseInfoInputSet() {
    return getOrCreateProperty("AddressBookDriversLicenseInfoInputSet", "AddressBookDriversLicenseInfoInputSet", null, pcftest.AddressBookDriversLicenseInfoInputSet.class);
  }
  
  public AddressBookPersonContactInfoInputSet getAddressBookPersonContactInfoInputSet() {
    return getOrCreateProperty("AddressBookPersonContactInfoInputSet", "AddressBookPersonContactInfoInputSet", null, pcftest.AddressBookPersonContactInfoInputSet.class);
  }
  
  public AddressBookPersonNameInputSet getAddressBookPersonNameInputSet() {
    return getOrCreateProperty("AddressBookPersonNameInputSet", "AddressBookPersonNameInputSet", null, pcftest.AddressBookPersonNameInputSet.class);
  }
  
  public AddressBookPrimaryAddressInputSet getAddressBookPrimaryAddressInputSet() {
    return getOrCreateProperty("AddressBookPrimaryAddressInputSet", "AddressBookPrimaryAddressInputSet", null, pcftest.AddressBookPrimaryAddressInputSet.class);
  }
  
  public CategoryScoresLV getCategoryScoresLV() {
    return getOrCreateProperty("CategoryScoresLV", "CategoryScoresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.class);
  }
  
  public CategoryScoresLV_tb getCategoryScoresLV_tb() {
    return getOrCreateProperty("CategoryScoresLV_tb", "CategoryScoresLV_tb", null, pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV_tb.class);
  }
  
  public ContactEFTLV getContactEFTLV() {
    return getOrCreateProperty("ContactEFTLV", "ContactEFTLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ContactEFTLV.class);
  }
  
  public ContactEFTLV_tb getContactEFTLV_tb() {
    return getOrCreateProperty("ContactEFTLV_tb", "ContactEFTLV_tb", null, pcftest.AddressBookContactBasicsDV_Person.ContactEFTLV_tb.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getscore() {
    return getOrCreateProperty("score", "score", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategoryScoresLV extends PCFElement {
    public CategoryScoresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CategoryHeader getCategoryHeader() {
      return getOrCreateProperty("CategoryHeader", "CategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.CategoryHeader.class);
    }
    
    public ScoreHeader getScoreHeader() {
      return getOrCreateProperty("ScoreHeader", "ScoreHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.ScoreHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CategoryHeader extends ValueElement {
      public CategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScoreHeader extends ValueElement {
      public ScoreHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Category getCategory() {
        return getOrCreateProperty("Category", "Category", null, pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.entry.Category.class);
      }
      
      public ValueElement getScore() {
        return getOrCreateProperty("Score", "Score", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AddressBookContactBasicsDV_Person.CategoryScoresLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategoryScoresLV_tb extends PCFElement {
    public CategoryScoresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactEFTLV_tb extends PCFElement {
    public ContactEFTLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.AddressBookContactBasicsDV_Person.ContactEFTLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.AddressBookContactBasicsDV_Person.ContactEFTLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}