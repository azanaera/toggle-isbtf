package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DuplicateContactsWorksheet.DuplicateContactsScreen;
import pcftest.DuplicateContactsWorksheet.DuplicateContactsScreen.DuplicateContactsWorksheet_CloseButton;
import pcftest.DuplicateContactsWorksheet.DuplicateContactsScreen._msgs;
import pcftest.DuplicateContactsWorksheet.DuplicateContactsWorksheet_UpLink;
import pcftest.DuplicateContactsWorksheet._Paging;
import pcftest.DuplicateContactsWorksheet.__crumb__;
import pcftest.DuplicateContactsWorksheet.wsTabBar;
import pcftest.DuplicateContactsWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DuplicateContactsWorksheet extends PCFLocation {
  public final static String CHECKSUM = "a1427be633f43161f387347ea8d9d2d6";
  
  public DuplicateContactsWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DuplicateContactsWorksheet"));
  }
  
  public DuplicateContactsScreen getDuplicateContactsScreen() {
    return getOrCreateProperty("DuplicateContactsScreen", "DuplicateContactsScreen", null, pcftest.DuplicateContactsWorksheet.DuplicateContactsScreen.class);
  }
  
  public DuplicateContactsWorksheet_UpLink getDuplicateContactsWorksheet_UpLink() {
    return getOrCreateProperty("DuplicateContactsWorksheet_UpLink", "DuplicateContactsWorksheet_UpLink", null, pcftest.DuplicateContactsWorksheet.DuplicateContactsWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DuplicateContactsWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DuplicateContactsWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.DuplicateContactsWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateContactsScreen extends PCFElement {
    public DuplicateContactsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckDuplicateContactsLV getCheckDuplicateContactsLV() {
      return getOrCreateProperty("CheckDuplicateContactsLV", "CheckDuplicateContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckDuplicateContactsLV.class);
    }
    
    public DuplicateContactsWorksheet_CloseButton getDuplicateContactsWorksheet_CloseButton() {
      return getOrCreateProperty("DuplicateContactsWorksheet_CloseButton", "DuplicateContactsWorksheet_CloseButton", null, pcftest.DuplicateContactsWorksheet.DuplicateContactsScreen.DuplicateContactsWorksheet_CloseButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DuplicateContactsWorksheet.DuplicateContactsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DuplicateContactsWorksheet_CloseButton extends ClickableActionElement {
      public DuplicateContactsWorksheet_CloseButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateContactsWorksheet_UpLink extends ClickableActionElement {
    public DuplicateContactsWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.DuplicateContactsWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/workspace/DuplicateContactsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class wsTab extends ClickableActionElement {
      public wsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}