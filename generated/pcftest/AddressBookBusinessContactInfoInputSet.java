package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookBusinessContactInfoInputSet.AletPhone_Ext;
import pcftest.AddressBookBusinessContactInfoInputSet.Cell;
import pcftest.AddressBookBusinessContactInfoInputSet.Fax;
import pcftest.AddressBookBusinessContactInfoInputSet.Home;
import pcftest.AddressBookBusinessContactInfoInputSet.PrimaryContact;
import pcftest.AddressBookBusinessContactInfoInputSet.PrimaryContact.MenuItem_NoneSelected;
import pcftest.AddressBookBusinessContactInfoInputSet.PrimaryContact.MenuItem_Search;
import pcftest.AddressBookBusinessContactInfoInputSet.PrimaryPhone;
import pcftest.AddressBookBusinessContactInfoInputSet.Work;
import typekey.PrimaryPhoneType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookBusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookBusinessContactInfoInputSet extends PCFElement {
  public final static String CHECKSUM = "6a18ad7cab303064a372d5a8951a7e72";
  
  public AddressBookBusinessContactInfoInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AletPhone_Ext getAletPhone_Ext() {
    return getOrCreateProperty("AletPhone_Ext", "AletPhone_Ext", null, pcftest.AddressBookBusinessContactInfoInputSet.AletPhone_Ext.class);
  }
  
  public Cell getCell() {
    return getOrCreateProperty("Cell", "Cell", null, pcftest.AddressBookBusinessContactInfoInputSet.Cell.class);
  }
  
  public ValueElement getEmail1() {
    return getOrCreateProperty("Email1", "Email1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmail2() {
    return getOrCreateProperty("Email2", "Email2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Fax getFax() {
    return getOrCreateProperty("Fax", "Fax", null, pcftest.AddressBookBusinessContactInfoInputSet.Fax.class);
  }
  
  public Home getHome() {
    return getOrCreateProperty("Home", "Home", null, pcftest.AddressBookBusinessContactInfoInputSet.Home.class);
  }
  
  public PrimaryContact getPrimaryContact() {
    return getOrCreateProperty("PrimaryContact", "PrimaryContact", null, pcftest.AddressBookBusinessContactInfoInputSet.PrimaryContact.class);
  }
  
  public PrimaryPhone getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, pcftest.AddressBookBusinessContactInfoInputSet.PrimaryPhone.class);
  }
  
  public Work getWork() {
    return getOrCreateProperty("Work", "Work", null, pcftest.AddressBookBusinessContactInfoInputSet.Work.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookBusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AletPhone_Ext extends PCFElement {
    public AletPhone_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookBusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cell extends PCFElement {
    public Cell(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookBusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Fax extends PCFElement {
    public Fax(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookBusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Home extends PCFElement {
    public Home(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryContact extends ValueElement {
    public PrimaryContact(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookContactDetailPopup click() {
      return clickThis(pcftest.AddressBookContactDetailPopup.class);
    }
    
    public MenuItem_NoneSelected getMenuItem_NoneSelected() {
      return getOrCreateProperty("MenuItem_NoneSelected", "MenuItem_NoneSelected", null, pcftest.AddressBookBusinessContactInfoInputSet.PrimaryContact.MenuItem_NoneSelected.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.AddressBookBusinessContactInfoInputSet.PrimaryContact.MenuItem_Search.class);
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
  @Generated(comments = "config/web/pcf/addressbook/AddressBookBusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryPhone extends SelectElement {
    public PrimaryPhone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PrimaryPhoneType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PrimaryPhoneType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PrimaryPhoneType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PrimaryPhoneType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookBusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Work extends PCFElement {
    public Work(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  
}