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
import pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesScreen;
import pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesScreen.DuplicateClaimSearchResultsLV_tb;
import pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesScreen.NewClaimDuplicatesWorksheet_CloseButton;
import pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesScreen.NewClaimDuplicatesWorksheet_RefreshButton;
import pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesScreen._msgs;
import pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesWorksheet_UpLink;
import pcftest.NewClaimDuplicatesWorksheet._Paging;
import pcftest.NewClaimDuplicatesWorksheet.__crumb__;
import pcftest.NewClaimDuplicatesWorksheet.wsTabBar;
import pcftest.NewClaimDuplicatesWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimDuplicatesWorksheet extends PCFLocation {
  public final static String CHECKSUM = "1f2511d5698e22e1672978d408e62e46";
  
  public NewClaimDuplicatesWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimDuplicatesWorksheet"));
  }
  
  public NewClaimDuplicatesScreen getNewClaimDuplicatesScreen() {
    return getOrCreateProperty("NewClaimDuplicatesScreen", "NewClaimDuplicatesScreen", null, pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesScreen.class);
  }
  
  public NewClaimDuplicatesWorksheet_UpLink getNewClaimDuplicatesWorksheet_UpLink() {
    return getOrCreateProperty("NewClaimDuplicatesWorksheet_UpLink", "NewClaimDuplicatesWorksheet_UpLink", null, pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimDuplicatesWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimDuplicatesWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.NewClaimDuplicatesWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimDuplicatesScreen extends PCFElement {
    public NewClaimDuplicatesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DuplicateClaimSearchResultsLV getDuplicateClaimSearchResultsLV() {
      return getOrCreateProperty("DuplicateClaimSearchResultsLV", "DuplicateClaimSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DuplicateClaimSearchResultsLV.class);
    }
    
    public DuplicateClaimSearchResultsLV_tb getDuplicateClaimSearchResultsLV_tb() {
      return getOrCreateProperty("DuplicateClaimSearchResultsLV_tb", "DuplicateClaimSearchResultsLV_tb", null, pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesScreen.DuplicateClaimSearchResultsLV_tb.class);
    }
    
    public NewClaimDuplicatesWorksheet_CloseButton getNewClaimDuplicatesWorksheet_CloseButton() {
      return getOrCreateProperty("NewClaimDuplicatesWorksheet_CloseButton", "NewClaimDuplicatesWorksheet_CloseButton", null, pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesScreen.NewClaimDuplicatesWorksheet_CloseButton.class);
    }
    
    public NewClaimDuplicatesWorksheet_RefreshButton getNewClaimDuplicatesWorksheet_RefreshButton() {
      return getOrCreateProperty("NewClaimDuplicatesWorksheet_RefreshButton", "NewClaimDuplicatesWorksheet_RefreshButton", null, pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesScreen.NewClaimDuplicatesWorksheet_RefreshButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimDuplicatesWorksheet.NewClaimDuplicatesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DuplicateClaimSearchResultsLV_tb extends PCFElement {
      public DuplicateClaimSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimDuplicatesWorksheet_CloseButton extends ClickableActionElement {
      public NewClaimDuplicatesWorksheet_CloseButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimDuplicatesWorksheet_RefreshButton extends ClickableActionElement {
      public NewClaimDuplicatesWorksheet_RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimDuplicatesWorksheet_UpLink extends ClickableActionElement {
    public NewClaimDuplicatesWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.NewClaimDuplicatesWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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