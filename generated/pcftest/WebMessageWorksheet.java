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
import pcftest.WebMessageWorksheet.WebMessageWorksheetScreen;
import pcftest.WebMessageWorksheet.WebMessageWorksheetScreen.WebMessageWorksheet_ClearButton;
import pcftest.WebMessageWorksheet.WebMessageWorksheetScreen._msgs;
import pcftest.WebMessageWorksheet.WebMessageWorksheetScreen.grpMsgs;
import pcftest.WebMessageWorksheet.WebMessageWorksheet_UpLink;
import pcftest.WebMessageWorksheet._Paging;
import pcftest.WebMessageWorksheet.__crumb__;
import pcftest.WebMessageWorksheet.wsTabBar;
import pcftest.WebMessageWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/WebMessageWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WebMessageWorksheet extends PCFLocation {
  public final static String CHECKSUM = "a433eaa53f1c011d1b1bd5024d740e6e";
  
  public WebMessageWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WebMessageWorksheet"));
  }
  
  public WebMessageWorksheetScreen getWebMessageWorksheetScreen() {
    return getOrCreateProperty("WebMessageWorksheetScreen", "WebMessageWorksheetScreen", null, pcftest.WebMessageWorksheet.WebMessageWorksheetScreen.class);
  }
  
  public WebMessageWorksheet_UpLink getWebMessageWorksheet_UpLink() {
    return getOrCreateProperty("WebMessageWorksheet_UpLink", "WebMessageWorksheet_UpLink", null, pcftest.WebMessageWorksheet.WebMessageWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WebMessageWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WebMessageWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.WebMessageWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/WebMessageWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WebMessageWorksheetScreen extends PCFElement {
    public WebMessageWorksheetScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WebMessageWorksheet_ClearButton getWebMessageWorksheet_ClearButton() {
      return getOrCreateProperty("WebMessageWorksheet_ClearButton", "WebMessageWorksheet_ClearButton", null, pcftest.WebMessageWorksheet.WebMessageWorksheetScreen.WebMessageWorksheet_ClearButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WebMessageWorksheet.WebMessageWorksheetScreen._msgs.class);
    }
    
    public grpMsgs getgrpMsgs() {
      return getOrCreateProperty("grpMsgs", "grpMsgs", null, pcftest.WebMessageWorksheet.WebMessageWorksheetScreen.grpMsgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/util/WebMessageWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WebMessageWorksheet_ClearButton extends ClickableActionElement {
      public WebMessageWorksheet_ClearButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/util/WebMessageWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/util/WebMessageWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class grpMsgs extends MessagesElement {
      public grpMsgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/WebMessageWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WebMessageWorksheet_UpLink extends ClickableActionElement {
    public WebMessageWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/WebMessageWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/WebMessageWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/WebMessageWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.WebMessageWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/util/WebMessageWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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