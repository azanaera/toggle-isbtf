package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewDocumentExistsWorksheet.ClaimNewDocumentExistsWorksheet_UpLink;
import pcftest.ClaimNewDocumentExistsWorksheet._Paging;
import pcftest.ClaimNewDocumentExistsWorksheet.__crumb__;
import pcftest.ClaimNewDocumentExistsWorksheet.wsTabBar;
import pcftest.ClaimNewDocumentExistsWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewDocumentExistsWorksheet extends PCFLocation {
  public final static String CHECKSUM = "8fa078d347871ee5714ddf6212cf4eaf";
  
  public ClaimNewDocumentExistsWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimNewDocumentExistsWorksheet"));
  }
  
  public ClaimNewDocumentExistsWorksheet_UpLink getClaimNewDocumentExistsWorksheet_UpLink() {
    return getOrCreateProperty("ClaimNewDocumentExistsWorksheet_UpLink", "ClaimNewDocumentExistsWorksheet_UpLink", null, pcftest.ClaimNewDocumentExistsWorksheet.ClaimNewDocumentExistsWorksheet_UpLink.class);
  }
  
  public NewDocumentExistsScreen getNewDocumentExistsScreen() {
    return getOrCreateProperty("NewDocumentExistsScreen", "NewDocumentExistsScreen", null, pcftest.NewDocumentExistsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimNewDocumentExistsWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimNewDocumentExistsWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.ClaimNewDocumentExistsWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentExistsWorksheet_UpLink extends ClickableActionElement {
    public ClaimNewDocumentExistsWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.ClaimNewDocumentExistsWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentExistsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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