package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookMatchWorksheetScreen.AddressBookMatchWorksheet_CancelButton;
import pcftest.AddressBookMatchWorksheetScreen.AddressBookMatchWorksheet_CreateNewContactButton;
import pcftest.AddressBookMatchWorksheetScreen._msgs;
import pcftest.AddressBookMatchWorksheetScreen.matchMessage;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookMatchWorksheetScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookMatchWorksheetScreen extends PCFElement {
  public final static String CHECKSUM = "fdaee92e61e377cdfd3deba0e680ad30";
  
  public AddressBookMatchWorksheetScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookMatchWorksheet_CancelButton getAddressBookMatchWorksheet_CancelButton() {
    return getOrCreateProperty("AddressBookMatchWorksheet_CancelButton", "AddressBookMatchWorksheet_CancelButton", null, pcftest.AddressBookMatchWorksheetScreen.AddressBookMatchWorksheet_CancelButton.class);
  }
  
  public AddressBookMatchWorksheet_CreateNewContactButton getAddressBookMatchWorksheet_CreateNewContactButton() {
    return getOrCreateProperty("AddressBookMatchWorksheet_CreateNewContactButton", "AddressBookMatchWorksheet_CreateNewContactButton", null, pcftest.AddressBookMatchWorksheetScreen.AddressBookMatchWorksheet_CreateNewContactButton.class);
  }
  
  public CheckDuplicateContactsLV getCheckDuplicateContactsLV() {
    return getOrCreateProperty("CheckDuplicateContactsLV", "CheckDuplicateContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckDuplicateContactsLV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AddressBookMatchWorksheetScreen._msgs.class);
  }
  
  public matchMessage getmatchMessage() {
    return getOrCreateProperty("matchMessage", "matchMessage", null, pcftest.AddressBookMatchWorksheetScreen.matchMessage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookMatchWorksheetScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookMatchWorksheet_CancelButton extends ClickableActionElement {
    public AddressBookMatchWorksheet_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookMatchWorksheetScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookMatchWorksheet_CreateNewContactButton extends ClickableActionElement {
    public AddressBookMatchWorksheet_CreateNewContactButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookMatchWorksheetScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookMatchWorksheetScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class matchMessage extends ValueElement {
    public matchMessage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}