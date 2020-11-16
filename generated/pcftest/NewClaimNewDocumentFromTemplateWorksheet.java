package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimNewDocumentFromTemplateWorksheet.NewClaimNewDocumentFromTemplateWorksheet_UpLink;
import pcftest.NewClaimNewDocumentFromTemplateWorksheet._Paging;
import pcftest.NewClaimNewDocumentFromTemplateWorksheet.__crumb__;
import pcftest.NewClaimNewDocumentFromTemplateWorksheet.wsTabBar;
import pcftest.NewClaimNewDocumentFromTemplateWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimNewDocumentFromTemplateWorksheet extends PCFLocation {
  public final static String CHECKSUM = "080fa81c10d840830911198efa9b28b2";
  
  public NewClaimNewDocumentFromTemplateWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimNewDocumentFromTemplateWorksheet"));
  }
  
  public NewClaimNewDocumentFromTemplateWorksheet_UpLink getNewClaimNewDocumentFromTemplateWorksheet_UpLink() {
    return getOrCreateProperty("NewClaimNewDocumentFromTemplateWorksheet_UpLink", "NewClaimNewDocumentFromTemplateWorksheet_UpLink", null, pcftest.NewClaimNewDocumentFromTemplateWorksheet.NewClaimNewDocumentFromTemplateWorksheet_UpLink.class);
  }
  
  public NewDocumentFromTemplateScreen getNewDocumentFromTemplateScreen() {
    return getOrCreateProperty("NewDocumentFromTemplateScreen", "NewDocumentFromTemplateScreen", null, pcftest.NewDocumentFromTemplateScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimNewDocumentFromTemplateWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimNewDocumentFromTemplateWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.NewClaimNewDocumentFromTemplateWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimNewDocumentFromTemplateWorksheet_UpLink extends ClickableActionElement {
    public NewClaimNewDocumentFromTemplateWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.NewClaimNewDocumentFromTemplateWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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