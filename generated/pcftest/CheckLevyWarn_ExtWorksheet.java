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
import pcftest.CheckLevyWarn_ExtWorksheet.CheckLevyWarn_ExtWorksheet_UpLink;
import pcftest.CheckLevyWarn_ExtWorksheet.Levywar_ExtScreen;
import pcftest.CheckLevyWarn_ExtWorksheet.Levywar_ExtScreen.CheckDuplicatesWorksheet_CloseButton;
import pcftest.CheckLevyWarn_ExtWorksheet.Levywar_ExtScreen._msgs;
import pcftest.CheckLevyWarn_ExtWorksheet._Paging;
import pcftest.CheckLevyWarn_ExtWorksheet.__crumb__;
import pcftest.CheckLevyWarn_ExtWorksheet.wsTabBar;
import pcftest.CheckLevyWarn_ExtWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/CheckLevyWarn_ExtWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckLevyWarn_ExtWorksheet extends PCFLocation {
  public final static String CHECKSUM = "cc0799c49c52e6ef64c8a4e6e081840a";
  
  public CheckLevyWarn_ExtWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CheckLevyWarn_ExtWorksheet"));
  }
  
  public CheckLevyWarn_ExtWorksheet_UpLink getCheckLevyWarn_ExtWorksheet_UpLink() {
    return getOrCreateProperty("CheckLevyWarn_ExtWorksheet_UpLink", "CheckLevyWarn_ExtWorksheet_UpLink", null, pcftest.CheckLevyWarn_ExtWorksheet.CheckLevyWarn_ExtWorksheet_UpLink.class);
  }
  
  public Levywar_ExtScreen getLevywar_ExtScreen() {
    return getOrCreateProperty("Levywar_ExtScreen", "Levywar_ExtScreen", null, pcftest.CheckLevyWarn_ExtWorksheet.Levywar_ExtScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CheckLevyWarn_ExtWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CheckLevyWarn_ExtWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.CheckLevyWarn_ExtWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckLevyWarn_ExtWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckLevyWarn_ExtWorksheet_UpLink extends ClickableActionElement {
    public CheckLevyWarn_ExtWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckLevyWarn_ExtWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Levywar_ExtScreen extends PCFElement {
    public Levywar_ExtScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckDuplicatesWorksheet_CloseButton getCheckDuplicatesWorksheet_CloseButton() {
      return getOrCreateProperty("CheckDuplicatesWorksheet_CloseButton", "CheckDuplicatesWorksheet_CloseButton", null, pcftest.CheckLevyWarn_ExtWorksheet.Levywar_ExtScreen.CheckDuplicatesWorksheet_CloseButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CheckLevyWarn_ExtWorksheet.Levywar_ExtScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckLevyWarn_ExtWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckDuplicatesWorksheet_CloseButton extends ClickableActionElement {
      public CheckDuplicatesWorksheet_CloseButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckLevyWarn_ExtWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckLevyWarn_ExtWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckLevyWarn_ExtWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckLevyWarn_ExtWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.CheckLevyWarn_ExtWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckLevyWarn_ExtWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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