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
import pcftest.ClaimSummaryExposuresPrint.ClaimSummaryExposuresPrintScreen;
import pcftest.ClaimSummaryExposuresPrint.ClaimSummaryExposuresPrintScreen.ClaimSummaryExposuresLV_tb;
import pcftest.ClaimSummaryExposuresPrint.ClaimSummaryExposuresPrintScreen._msgs;
import pcftest.ClaimSummaryExposuresPrint.ClaimSummaryExposuresPrint_UpLink;
import pcftest.ClaimSummaryExposuresPrint._Paging;
import pcftest.ClaimSummaryExposuresPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryExposuresPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryExposuresPrint extends PCFLocation {
  public final static String CHECKSUM = "a00dd7a47e41e6dba4c5acf3117a5e60";
  
  public ClaimSummaryExposuresPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummaryExposuresPrint"));
  }
  
  public ClaimSummaryExposuresPrintScreen getClaimSummaryExposuresPrintScreen() {
    return getOrCreateProperty("ClaimSummaryExposuresPrintScreen", "ClaimSummaryExposuresPrintScreen", null, pcftest.ClaimSummaryExposuresPrint.ClaimSummaryExposuresPrintScreen.class);
  }
  
  public ClaimSummaryExposuresPrint_UpLink getClaimSummaryExposuresPrint_UpLink() {
    return getOrCreateProperty("ClaimSummaryExposuresPrint_UpLink", "ClaimSummaryExposuresPrint_UpLink", null, pcftest.ClaimSummaryExposuresPrint.ClaimSummaryExposuresPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummaryExposuresPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummaryExposuresPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryExposuresPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryExposuresPrintScreen extends PCFElement {
    public ClaimSummaryExposuresPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSummaryExposuresLV getClaimSummaryExposuresLV() {
      return getOrCreateProperty("ClaimSummaryExposuresLV", "ClaimSummaryExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSummaryExposuresLV.class);
    }
    
    public ClaimSummaryExposuresLV_tb getClaimSummaryExposuresLV_tb() {
      return getOrCreateProperty("ClaimSummaryExposuresLV_tb", "ClaimSummaryExposuresLV_tb", null, pcftest.ClaimSummaryExposuresPrint.ClaimSummaryExposuresPrintScreen.ClaimSummaryExposuresLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSummaryExposuresPrint.ClaimSummaryExposuresPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryExposuresPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSummaryExposuresLV_tb extends PCFElement {
      public ClaimSummaryExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryExposuresPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryExposuresPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryExposuresPrint_UpLink extends ClickableActionElement {
    public ClaimSummaryExposuresPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryExposuresPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryExposuresPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}