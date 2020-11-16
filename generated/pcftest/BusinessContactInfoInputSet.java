package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BusinessContactInfoInputSet.AltPhone_Ext;
import pcftest.BusinessContactInfoInputSet.Cell;
import pcftest.BusinessContactInfoInputSet.Fax;
import pcftest.BusinessContactInfoInputSet.Home;
import pcftest.BusinessContactInfoInputSet.PrimaryContact;
import pcftest.BusinessContactInfoInputSet.PrimaryContact.MenuItem_Search;
import pcftest.BusinessContactInfoInputSet.PrimaryContact.MenuItem_ViewDetails;
import pcftest.BusinessContactInfoInputSet.PrimaryPhone;
import pcftest.BusinessContactInfoInputSet.Work;
import typekey.PrimaryPhoneType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/BusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessContactInfoInputSet extends PCFElement {
  public final static String CHECKSUM = "5f90767f297a2461886e77d8ddd9edc6";
  
  public BusinessContactInfoInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AltPhone_Ext getAltPhone_Ext() {
    return getOrCreateProperty("AltPhone_Ext", "AltPhone_Ext", null, pcftest.BusinessContactInfoInputSet.AltPhone_Ext.class);
  }
  
  public Cell getCell() {
    return getOrCreateProperty("Cell", "Cell", null, pcftest.BusinessContactInfoInputSet.Cell.class);
  }
  
  public BooleanValueElement getContactProhibited() {
    return getOrCreateProperty("ContactProhibited", "ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getEmail1() {
    return getOrCreateProperty("Email1", "Email1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmail2() {
    return getOrCreateProperty("Email2", "Email2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Fax getFax() {
    return getOrCreateProperty("Fax", "Fax", null, pcftest.BusinessContactInfoInputSet.Fax.class);
  }
  
  public Home getHome() {
    return getOrCreateProperty("Home", "Home", null, pcftest.BusinessContactInfoInputSet.Home.class);
  }
  
  public PrimaryContact getPrimaryContact() {
    return getOrCreateProperty("PrimaryContact", "PrimaryContact", null, pcftest.BusinessContactInfoInputSet.PrimaryContact.class);
  }
  
  public PrimaryPhone getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, pcftest.BusinessContactInfoInputSet.PrimaryPhone.class);
  }
  
  public Work getWork() {
    return getOrCreateProperty("Work", "Work", null, pcftest.BusinessContactInfoInputSet.Work.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/BusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AltPhone_Ext extends PCFElement {
    public AltPhone_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/BusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cell extends PCFElement {
    public Cell(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/BusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Fax extends PCFElement {
    public Fax(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/BusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Home extends PCFElement {
    public Home(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryContact extends SelectElement {
    public PrimaryContact(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.BusinessContactInfoInputSet.PrimaryContact.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.BusinessContactInfoInputSet.PrimaryContact.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/shared/contacts/BusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/contacts/BusinessContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Work extends PCFElement {
    public Work(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  
}