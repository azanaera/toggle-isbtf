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
import pcftest.CheckDuplicatesWorksheet.CheckDuplicatesWorksheet_UpLink;
import pcftest.CheckDuplicatesWorksheet.NewCheckDuplicatesScreen;
import pcftest.CheckDuplicatesWorksheet.NewCheckDuplicatesScreen.CheckDuplicatesWorksheet_CloseButton;
import pcftest.CheckDuplicatesWorksheet.NewCheckDuplicatesScreen.CheckDuplicatesWorksheet_RefreshButton;
import pcftest.CheckDuplicatesWorksheet.NewCheckDuplicatesScreen._msgs;
import pcftest.CheckDuplicatesWorksheet._Paging;
import pcftest.CheckDuplicatesWorksheet.__crumb__;
import pcftest.CheckDuplicatesWorksheet.wsTabBar;
import pcftest.CheckDuplicatesWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckDuplicatesWorksheet extends PCFLocation {
  public final static String CHECKSUM = "a236b0f796c19df10d492b2fb65cbcbd";
  
  public CheckDuplicatesWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CheckDuplicatesWorksheet"));
  }
  
  public CheckDuplicatesWorksheet_UpLink getCheckDuplicatesWorksheet_UpLink() {
    return getOrCreateProperty("CheckDuplicatesWorksheet_UpLink", "CheckDuplicatesWorksheet_UpLink", null, pcftest.CheckDuplicatesWorksheet.CheckDuplicatesWorksheet_UpLink.class);
  }
  
  public NewCheckDuplicatesScreen getNewCheckDuplicatesScreen() {
    return getOrCreateProperty("NewCheckDuplicatesScreen", "NewCheckDuplicatesScreen", null, pcftest.CheckDuplicatesWorksheet.NewCheckDuplicatesScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CheckDuplicatesWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CheckDuplicatesWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.CheckDuplicatesWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckDuplicatesWorksheet_UpLink extends ClickableActionElement {
    public CheckDuplicatesWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckDuplicatesScreen extends PCFElement {
    public NewCheckDuplicatesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckDuplicatesWorksheet_CloseButton getCheckDuplicatesWorksheet_CloseButton() {
      return getOrCreateProperty("CheckDuplicatesWorksheet_CloseButton", "CheckDuplicatesWorksheet_CloseButton", null, pcftest.CheckDuplicatesWorksheet.NewCheckDuplicatesScreen.CheckDuplicatesWorksheet_CloseButton.class);
    }
    
    public CheckDuplicatesWorksheet_RefreshButton getCheckDuplicatesWorksheet_RefreshButton() {
      return getOrCreateProperty("CheckDuplicatesWorksheet_RefreshButton", "CheckDuplicatesWorksheet_RefreshButton", null, pcftest.CheckDuplicatesWorksheet.NewCheckDuplicatesScreen.CheckDuplicatesWorksheet_RefreshButton.class);
    }
    
    public DuplicateCheckResultsLV getDuplicateCheckResultsLV() {
      return getOrCreateProperty("DuplicateCheckResultsLV", "DuplicateCheckResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DuplicateCheckResultsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CheckDuplicatesWorksheet.NewCheckDuplicatesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckDuplicatesWorksheet_CloseButton extends ClickableActionElement {
      public CheckDuplicatesWorksheet_CloseButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckDuplicatesWorksheet_RefreshButton extends ClickableActionElement {
      public CheckDuplicatesWorksheet_RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.CheckDuplicatesWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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