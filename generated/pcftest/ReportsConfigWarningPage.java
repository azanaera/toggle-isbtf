package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReportsConfigWarningPage.ReportsConfigWarningPageScreen;
import pcftest.ReportsConfigWarningPage.ReportsConfigWarningPageScreen._msgs;
import pcftest.ReportsConfigWarningPage.ReportsConfigWarningPage_UpLink;
import pcftest.ReportsConfigWarningPage._Paging;
import pcftest.ReportsConfigWarningPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/reports/ReportsConfigWarningPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReportsConfigWarningPage extends PCFLocation {
  public final static String CHECKSUM = "87f034e309935753e2475a41cf40babb";
  
  public ReportsConfigWarningPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReportsConfigWarningPage"));
  }
  
  public ReportsConfigWarningPageScreen getReportsConfigWarningPageScreen() {
    return getOrCreateProperty("ReportsConfigWarningPageScreen", "ReportsConfigWarningPageScreen", null, pcftest.ReportsConfigWarningPage.ReportsConfigWarningPageScreen.class);
  }
  
  public ReportsConfigWarningPage_UpLink getReportsConfigWarningPage_UpLink() {
    return getOrCreateProperty("ReportsConfigWarningPage_UpLink", "ReportsConfigWarningPage_UpLink", null, pcftest.ReportsConfigWarningPage.ReportsConfigWarningPage_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReportsConfigWarningPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReportsConfigWarningPage.__crumb__.class);
  }
  
  public Reports get_parent() {
    return getOrCreateProperty("_parent", pcftest.Reports.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/reports/ReportsConfigWarningPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportsConfigWarningPageScreen extends PCFElement {
    public ReportsConfigWarningPageScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ReportsConfigWarningPage.ReportsConfigWarningPageScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/reports/ReportsConfigWarningPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/reports/ReportsConfigWarningPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportsConfigWarningPage_UpLink extends ClickableActionElement {
    public ReportsConfigWarningPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/reports/ReportsConfigWarningPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/reports/ReportsConfigWarningPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}