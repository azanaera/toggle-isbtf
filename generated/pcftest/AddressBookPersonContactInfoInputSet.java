package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookPersonContactInfoInputSet.AltPhone_Ext;
import pcftest.AddressBookPersonContactInfoInputSet.Cell;
import pcftest.AddressBookPersonContactInfoInputSet.Fax;
import pcftest.AddressBookPersonContactInfoInputSet.Home;
import pcftest.AddressBookPersonContactInfoInputSet.PrimaryPhone;
import pcftest.AddressBookPersonContactInfoInputSet.Work;
import typekey.PrimaryPhoneType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookPersonContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookPersonContactInfoInputSet extends PCFElement {
  public final static String CHECKSUM = "73640ac26dccfaffdffdfc3dc9de1f16";
  
  public AddressBookPersonContactInfoInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AltPhone_Ext getAltPhone_Ext() {
    return getOrCreateProperty("AltPhone_Ext", "AltPhone_Ext", null, pcftest.AddressBookPersonContactInfoInputSet.AltPhone_Ext.class);
  }
  
  public Cell getCell() {
    return getOrCreateProperty("Cell", "Cell", null, pcftest.AddressBookPersonContactInfoInputSet.Cell.class);
  }
  
  public BooleanValueElement getContactProhibited() {
    return getOrCreateProperty("ContactProhibited", "ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Fax getFax() {
    return getOrCreateProperty("Fax", "Fax", null, pcftest.AddressBookPersonContactInfoInputSet.Fax.class);
  }
  
  public Home getHome() {
    return getOrCreateProperty("Home", "Home", null, pcftest.AddressBookPersonContactInfoInputSet.Home.class);
  }
  
  public ValueElement getPrimary() {
    return getOrCreateProperty("Primary", "Primary", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PrimaryPhone getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, pcftest.AddressBookPersonContactInfoInputSet.PrimaryPhone.class);
  }
  
  public ValueElement getSecondary() {
    return getOrCreateProperty("Secondary", "Secondary", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Work getWork() {
    return getOrCreateProperty("Work", "Work", null, pcftest.AddressBookPersonContactInfoInputSet.Work.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookPersonContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AltPhone_Ext extends PCFElement {
    public AltPhone_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookPersonContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cell extends PCFElement {
    public Cell(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookPersonContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Fax extends PCFElement {
    public Fax(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookPersonContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Home extends PCFElement {
    public Home(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookPersonContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/addressbook/AddressBookPersonContactInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Work extends PCFElement {
    public Work(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  
}