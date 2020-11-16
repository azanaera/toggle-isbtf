package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimNewDocumentExistsWorksheet.NewClaimNewDocumentExistsWorksheet_UpLink;
import pcftest.NewClaimNewDocumentExistsWorksheet._Paging;
import pcftest.NewClaimNewDocumentExistsWorksheet.__crumb__;
import pcftest.NewClaimNewDocumentExistsWorksheet.wsTabBar;
import pcftest.NewClaimNewDocumentExistsWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimNewDocumentExistsWorksheet extends PCFLocation {
  public final static String CHECKSUM = "9217f017e9df0288f9fc78c08ca00a4a";
  
  public NewClaimNewDocumentExistsWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimNewDocumentExistsWorksheet"));
  }
  
  public NewClaimNewDocumentExistsWorksheet_UpLink getNewClaimNewDocumentExistsWorksheet_UpLink() {
    return getOrCreateProperty("NewClaimNewDocumentExistsWorksheet_UpLink", "NewClaimNewDocumentExistsWorksheet_UpLink", null, pcftest.NewClaimNewDocumentExistsWorksheet.NewClaimNewDocumentExistsWorksheet_UpLink.class);
  }
  
  public NewDocumentExistsScreen getNewDocumentExistsScreen() {
    return getOrCreateProperty("NewDocumentExistsScreen", "NewDocumentExistsScreen", null, pcftest.NewDocumentExistsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimNewDocumentExistsWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimNewDocumentExistsWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.NewClaimNewDocumentExistsWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimNewDocumentExistsWorksheet_UpLink extends ClickableActionElement {
    public NewClaimNewDocumentExistsWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.NewClaimNewDocumentExistsWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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