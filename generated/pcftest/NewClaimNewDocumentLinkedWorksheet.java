package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimNewDocumentLinkedWorksheet.NewClaimNewDocumentLinkedWorksheet_UpLink;
import pcftest.NewClaimNewDocumentLinkedWorksheet._Paging;
import pcftest.NewClaimNewDocumentLinkedWorksheet.__crumb__;
import pcftest.NewClaimNewDocumentLinkedWorksheet.wsTabBar;
import pcftest.NewClaimNewDocumentLinkedWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentLinkedWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimNewDocumentLinkedWorksheet extends PCFLocation {
  public final static String CHECKSUM = "d02397ee6777f775c57ae01ca6899060";
  
  public NewClaimNewDocumentLinkedWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimNewDocumentLinkedWorksheet"));
  }
  
  public NewClaimNewDocumentLinkedWorksheet_UpLink getNewClaimNewDocumentLinkedWorksheet_UpLink() {
    return getOrCreateProperty("NewClaimNewDocumentLinkedWorksheet_UpLink", "NewClaimNewDocumentLinkedWorksheet_UpLink", null, pcftest.NewClaimNewDocumentLinkedWorksheet.NewClaimNewDocumentLinkedWorksheet_UpLink.class);
  }
  
  public UploadDocumentScreen getUploadDocumentScreen() {
    return getOrCreateProperty("UploadDocumentScreen", "UploadDocumentScreen", null, pcftest.UploadDocumentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimNewDocumentLinkedWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimNewDocumentLinkedWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.NewClaimNewDocumentLinkedWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentLinkedWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimNewDocumentLinkedWorksheet_UpLink extends ClickableActionElement {
    public NewClaimNewDocumentLinkedWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentLinkedWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentLinkedWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentLinkedWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.NewClaimNewDocumentLinkedWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentLinkedWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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