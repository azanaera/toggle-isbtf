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
import pcftest.CognosReportPage.CognosReportPage_UpLink;
import pcftest.CognosReportPage.CognosReportScreen;
import pcftest.CognosReportPage.CognosReportScreen._msgs;
import pcftest.CognosReportPage._Paging;
import pcftest.CognosReportPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/cognos/CognosReportPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CognosReportPage extends PCFLocation {
  public final static String CHECKSUM = "e3316466c428af80fc43dda876854b7b";
  
  public CognosReportPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CognosReportPage"));
  }
  
  public CognosReportPage_UpLink getCognosReportPage_UpLink() {
    return getOrCreateProperty("CognosReportPage_UpLink", "CognosReportPage_UpLink", null, pcftest.CognosReportPage.CognosReportPage_UpLink.class);
  }
  
  public CognosReportScreen getCognosReportScreen() {
    return getOrCreateProperty("CognosReportScreen", "CognosReportScreen", null, pcftest.CognosReportPage.CognosReportScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CognosReportPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CognosReportPage.__crumb__.class);
  }
  
  public CognosReport get_parent() {
    return getOrCreateProperty("_parent", pcftest.CognosReport.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/cognos/CognosReportPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CognosReportPage_UpLink extends ClickableActionElement {
    public CognosReportPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/cognos/CognosReportPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CognosReportScreen extends PCFElement {
    public CognosReportScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CognosReportPage.CognosReportScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/cognos/CognosReportPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/cognos/CognosReportPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/cognos/CognosReportPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}