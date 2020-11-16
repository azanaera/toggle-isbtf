package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContactDetailToolbarButtonSet.Cancel;
import pcftest.ContactDetailToolbarButtonSet.CheckDuplicatesButton;
import pcftest.ContactDetailToolbarButtonSet.CustomUpdateButton;
import pcftest.ContactDetailToolbarButtonSet.Edit;
import pcftest.ContactDetailToolbarButtonSet.Update;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactDetailToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "06ed40873c7bad5052b006bb947d008b";
  
  public ContactDetailToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ContactDetailToolbarButtonSet.Cancel.class);
  }
  
  public CheckDuplicatesButton getCheckDuplicatesButton() {
    return getOrCreateProperty("CheckDuplicatesButton", "CheckDuplicatesButton", null, pcftest.ContactDetailToolbarButtonSet.CheckDuplicatesButton.class);
  }
  
  public CustomUpdateButton getCustomUpdateButton() {
    return getOrCreateProperty("CustomUpdateButton", "CustomUpdateButton", null, pcftest.ContactDetailToolbarButtonSet.CustomUpdateButton.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.ContactDetailToolbarButtonSet.Edit.class);
  }
  
  public LinkContactToolbarButtonSet getLinkContactToolbarButtonSet() {
    return getOrCreateProperty("LinkContactToolbarButtonSet", "LinkContactToolbarButtonSet", null, pcftest.LinkContactToolbarButtonSet.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.ContactDetailToolbarButtonSet.Update.class);
  }
  
  public ViewAddressBookToolbarButtonSet getViewAddressBookToolbarButtonSet() {
    return getOrCreateProperty("ViewAddressBookToolbarButtonSet", "ViewAddressBookToolbarButtonSet", null, pcftest.ViewAddressBookToolbarButtonSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckDuplicatesButton extends ClickableActionElement {
    public CheckDuplicatesButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomUpdateButton extends ClickableActionElement {
    public CustomUpdateButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}