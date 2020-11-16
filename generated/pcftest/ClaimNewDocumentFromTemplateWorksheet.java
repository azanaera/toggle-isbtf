package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewDocumentFromTemplateWorksheet.ClaimNewDocumentFromTemplateWorksheet_UpLink;
import pcftest.ClaimNewDocumentFromTemplateWorksheet._Paging;
import pcftest.ClaimNewDocumentFromTemplateWorksheet.__crumb__;
import pcftest.ClaimNewDocumentFromTemplateWorksheet.wsTabBar;
import pcftest.ClaimNewDocumentFromTemplateWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewDocumentFromTemplateWorksheet extends PCFLocation {
  public final static String CHECKSUM = "6730d900b7ad14e5b75a278119da2053";
  
  public ClaimNewDocumentFromTemplateWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimNewDocumentFromTemplateWorksheet"));
  }
  
  public ClaimNewDocumentFromTemplateWorksheet_UpLink getClaimNewDocumentFromTemplateWorksheet_UpLink() {
    return getOrCreateProperty("ClaimNewDocumentFromTemplateWorksheet_UpLink", "ClaimNewDocumentFromTemplateWorksheet_UpLink", null, pcftest.ClaimNewDocumentFromTemplateWorksheet.ClaimNewDocumentFromTemplateWorksheet_UpLink.class);
  }
  
  public NewDocumentFromTemplateScreen getNewDocumentFromTemplateScreen() {
    return getOrCreateProperty("NewDocumentFromTemplateScreen", "NewDocumentFromTemplateScreen", null, pcftest.NewDocumentFromTemplateScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimNewDocumentFromTemplateWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimNewDocumentFromTemplateWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.ClaimNewDocumentFromTemplateWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentFromTemplateWorksheet_UpLink extends ClickableActionElement {
    public ClaimNewDocumentFromTemplateWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.ClaimNewDocumentFromTemplateWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentFromTemplateWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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