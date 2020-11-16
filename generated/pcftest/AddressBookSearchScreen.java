package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookSearchScreen.AddressBookSearchLV_tb;
import pcftest.AddressBookSearchScreen.AddressBookSearchLV_tb.ClaimSearchScreen_PrintButton;
import pcftest.AddressBookSearchScreen.AddressBookSearchLV_tb.RetrieveRequested;
import pcftest.AddressBookSearchScreen.LaunchAB;
import pcftest.AddressBookSearchScreen._msgs;
import pcftest.AddressBookSearchScreen.cancel;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchScreen extends PCFElement {
  public final static String CHECKSUM = "7f9c7bf4d7de5c79980e9fdf21dc1b2e";
  
  public AddressBookSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookContactSearchPopupDV getAddressBookContactSearchPopupDV() {
    return getOrCreateProperty("AddressBookContactSearchPopupDV", "AddressBookContactSearchPopupDV", null, pcftest.AddressBookContactSearchPopupDV.class);
  }
  
  public AddressBookSearchDV getAddressBookSearchDV() {
    return getOrCreateProperty("AddressBookSearchDV", "AddressBookSearchDV", null, pcftest.AddressBookSearchDV.class);
  }
  
  public AddressBookSearchLV getAddressBookSearchLV() {
    return getOrCreateProperty("AddressBookSearchLV", "AddressBookSearchLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookSearchLV.class);
  }
  
  public AddressBookSearchLV_tb getAddressBookSearchLV_tb() {
    return getOrCreateProperty("AddressBookSearchLV_tb", "AddressBookSearchLV_tb", null, pcftest.AddressBookSearchScreen.AddressBookSearchLV_tb.class);
  }
  
  public LaunchAB getLaunchAB() {
    return getOrCreateProperty("LaunchAB", "LaunchAB", null, pcftest.AddressBookSearchScreen.LaunchAB.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AddressBookSearchScreen._msgs.class);
  }
  
  public cancel getcancel() {
    return getOrCreateProperty("cancel", "cancel", null, pcftest.AddressBookSearchScreen.cancel.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookSearchLV_tb extends PCFElement {
    public AddressBookSearchLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSearchScreen_PrintButton getClaimSearchScreen_PrintButton() {
      return getOrCreateProperty("ClaimSearchScreen_PrintButton", "ClaimSearchScreen_PrintButton", null, pcftest.AddressBookSearchScreen.AddressBookSearchLV_tb.ClaimSearchScreen_PrintButton.class);
    }
    
    public RetrieveRequested getRetrieveRequested() {
      return getOrCreateProperty("RetrieveRequested", "RetrieveRequested", null, pcftest.AddressBookSearchScreen.AddressBookSearchLV_tb.RetrieveRequested.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchScreen_PrintButton extends ClickableActionElement {
      public ClaimSearchScreen_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RetrieveRequested extends ClickableActionElement {
      public RetrieveRequested(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LaunchAB extends ClickableActionElement {
    public LaunchAB(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class cancel extends ClickableActionElement {
    public cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}