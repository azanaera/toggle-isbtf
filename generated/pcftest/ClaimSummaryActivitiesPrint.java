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
import pcftest.ClaimSummaryActivitiesPrint.ClaimSummaryActivitiesPrintScreen;
import pcftest.ClaimSummaryActivitiesPrint.ClaimSummaryActivitiesPrintScreen.ClaimSummaryActivitiesLV_tb;
import pcftest.ClaimSummaryActivitiesPrint.ClaimSummaryActivitiesPrintScreen._msgs;
import pcftest.ClaimSummaryActivitiesPrint.ClaimSummaryActivitiesPrint_UpLink;
import pcftest.ClaimSummaryActivitiesPrint._Paging;
import pcftest.ClaimSummaryActivitiesPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryActivitiesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryActivitiesPrint extends PCFLocation {
  public final static String CHECKSUM = "6941d55ee7374924e5f46f0e508d669b";
  
  public ClaimSummaryActivitiesPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummaryActivitiesPrint"));
  }
  
  public ClaimSummaryActivitiesPrintScreen getClaimSummaryActivitiesPrintScreen() {
    return getOrCreateProperty("ClaimSummaryActivitiesPrintScreen", "ClaimSummaryActivitiesPrintScreen", null, pcftest.ClaimSummaryActivitiesPrint.ClaimSummaryActivitiesPrintScreen.class);
  }
  
  public ClaimSummaryActivitiesPrint_UpLink getClaimSummaryActivitiesPrint_UpLink() {
    return getOrCreateProperty("ClaimSummaryActivitiesPrint_UpLink", "ClaimSummaryActivitiesPrint_UpLink", null, pcftest.ClaimSummaryActivitiesPrint.ClaimSummaryActivitiesPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummaryActivitiesPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummaryActivitiesPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryActivitiesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryActivitiesPrintScreen extends PCFElement {
    public ClaimSummaryActivitiesPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSummaryActivitiesLV getClaimSummaryActivitiesLV() {
      return getOrCreateProperty("ClaimSummaryActivitiesLV", "ClaimSummaryActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSummaryActivitiesLV.class);
    }
    
    public ClaimSummaryActivitiesLV_tb getClaimSummaryActivitiesLV_tb() {
      return getOrCreateProperty("ClaimSummaryActivitiesLV_tb", "ClaimSummaryActivitiesLV_tb", null, pcftest.ClaimSummaryActivitiesPrint.ClaimSummaryActivitiesPrintScreen.ClaimSummaryActivitiesLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSummaryActivitiesPrint.ClaimSummaryActivitiesPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryActivitiesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSummaryActivitiesLV_tb extends PCFElement {
      public ClaimSummaryActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryActivitiesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryActivitiesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryActivitiesPrint_UpLink extends ClickableActionElement {
    public ClaimSummaryActivitiesPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryActivitiesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryActivitiesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}