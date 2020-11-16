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
import pcftest.ClaimSummaryTopPrint.ClaimSummaryTopPrintScreen;
import pcftest.ClaimSummaryTopPrint.ClaimSummaryTopPrintScreen._msgs;
import pcftest.ClaimSummaryTopPrint.ClaimSummaryTopPrint_UpLink;
import pcftest.ClaimSummaryTopPrint._Paging;
import pcftest.ClaimSummaryTopPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryTopPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryTopPrint extends PCFLocation {
  public final static String CHECKSUM = "1ba1021a253cc134bf5f3db2a2f245d8";
  
  public ClaimSummaryTopPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummaryTopPrint"));
  }
  
  public ClaimSummaryTopPrintScreen getClaimSummaryTopPrintScreen() {
    return getOrCreateProperty("ClaimSummaryTopPrintScreen", "ClaimSummaryTopPrintScreen", null, pcftest.ClaimSummaryTopPrint.ClaimSummaryTopPrintScreen.class);
  }
  
  public ClaimSummaryTopPrint_UpLink getClaimSummaryTopPrint_UpLink() {
    return getOrCreateProperty("ClaimSummaryTopPrint_UpLink", "ClaimSummaryTopPrint_UpLink", null, pcftest.ClaimSummaryTopPrint.ClaimSummaryTopPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummaryTopPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummaryTopPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryTopPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryTopPrintScreen extends PCFElement {
    public ClaimSummaryTopPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSummaryDV getClaimSummaryDV() {
      return getOrCreateProperty("ClaimSummaryDV", "ClaimSummaryDV", null, pcftest.ClaimSummaryDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSummaryTopPrint.ClaimSummaryTopPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryTopPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryTopPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryTopPrint_UpLink extends ClickableActionElement {
    public ClaimSummaryTopPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryTopPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryTopPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}