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
import pcftest.ClaimSummaryAssociatedPrint.ClaimSummaryAssociatedPrintScreen;
import pcftest.ClaimSummaryAssociatedPrint.ClaimSummaryAssociatedPrintScreen.ClaimSummaryAssociatedClaimsLV_tb;
import pcftest.ClaimSummaryAssociatedPrint.ClaimSummaryAssociatedPrintScreen._msgs;
import pcftest.ClaimSummaryAssociatedPrint.ClaimSummaryAssociatedPrint_UpLink;
import pcftest.ClaimSummaryAssociatedPrint._Paging;
import pcftest.ClaimSummaryAssociatedPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryAssociatedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryAssociatedPrint extends PCFLocation {
  public final static String CHECKSUM = "49f771934fd5bcbb1c2893437689ea6d";
  
  public ClaimSummaryAssociatedPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummaryAssociatedPrint"));
  }
  
  public ClaimSummaryAssociatedPrintScreen getClaimSummaryAssociatedPrintScreen() {
    return getOrCreateProperty("ClaimSummaryAssociatedPrintScreen", "ClaimSummaryAssociatedPrintScreen", null, pcftest.ClaimSummaryAssociatedPrint.ClaimSummaryAssociatedPrintScreen.class);
  }
  
  public ClaimSummaryAssociatedPrint_UpLink getClaimSummaryAssociatedPrint_UpLink() {
    return getOrCreateProperty("ClaimSummaryAssociatedPrint_UpLink", "ClaimSummaryAssociatedPrint_UpLink", null, pcftest.ClaimSummaryAssociatedPrint.ClaimSummaryAssociatedPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummaryAssociatedPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummaryAssociatedPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryAssociatedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryAssociatedPrintScreen extends PCFElement {
    public ClaimSummaryAssociatedPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSummaryAssociatedClaimsLV getClaimSummaryAssociatedClaimsLV() {
      return getOrCreateProperty("ClaimSummaryAssociatedClaimsLV", "ClaimSummaryAssociatedClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSummaryAssociatedClaimsLV.class);
    }
    
    public ClaimSummaryAssociatedClaimsLV_tb getClaimSummaryAssociatedClaimsLV_tb() {
      return getOrCreateProperty("ClaimSummaryAssociatedClaimsLV_tb", "ClaimSummaryAssociatedClaimsLV_tb", null, pcftest.ClaimSummaryAssociatedPrint.ClaimSummaryAssociatedPrintScreen.ClaimSummaryAssociatedClaimsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSummaryAssociatedPrint.ClaimSummaryAssociatedPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryAssociatedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSummaryAssociatedClaimsLV_tb extends PCFElement {
      public ClaimSummaryAssociatedClaimsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryAssociatedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryAssociatedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryAssociatedPrint_UpLink extends ClickableActionElement {
    public ClaimSummaryAssociatedPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryAssociatedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryAssociatedPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}