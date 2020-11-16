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
import pcftest.ClaimFinancialsChecksDetailPrint.ClaimFinancialsChecksDetailPrintScreen;
import pcftest.ClaimFinancialsChecksDetailPrint.ClaimFinancialsChecksDetailPrintScreen._msgs;
import pcftest.ClaimFinancialsChecksDetailPrint.ClaimFinancialsChecksDetailPrint_UpLink;
import pcftest.ClaimFinancialsChecksDetailPrint._Paging;
import pcftest.ClaimFinancialsChecksDetailPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/print/ClaimFinancialsChecksDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFinancialsChecksDetailPrint extends PCFLocation {
  public final static String CHECKSUM = "df18607e13d6336ab34b92628882661f";
  
  public ClaimFinancialsChecksDetailPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimFinancialsChecksDetailPrint"));
  }
  
  public ClaimFinancialsChecksDetailPrintScreen getClaimFinancialsChecksDetailPrintScreen() {
    return getOrCreateProperty("ClaimFinancialsChecksDetailPrintScreen", "ClaimFinancialsChecksDetailPrintScreen", null, pcftest.ClaimFinancialsChecksDetailPrint.ClaimFinancialsChecksDetailPrintScreen.class);
  }
  
  public ClaimFinancialsChecksDetailPrint_UpLink getClaimFinancialsChecksDetailPrint_UpLink() {
    return getOrCreateProperty("ClaimFinancialsChecksDetailPrint_UpLink", "ClaimFinancialsChecksDetailPrint_UpLink", null, pcftest.ClaimFinancialsChecksDetailPrint.ClaimFinancialsChecksDetailPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimFinancialsChecksDetailPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimFinancialsChecksDetailPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/print/ClaimFinancialsChecksDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsChecksDetailPrintScreen extends PCFElement {
    public ClaimFinancialsChecksDetailPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckDV getCheckDV() {
      return getOrCreateProperty("CheckDV", "CheckDV", null, pcftest.CheckDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimFinancialsChecksDetailPrint.ClaimFinancialsChecksDetailPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/print/ClaimFinancialsChecksDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/print/ClaimFinancialsChecksDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsChecksDetailPrint_UpLink extends ClickableActionElement {
    public ClaimFinancialsChecksDetailPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/print/ClaimFinancialsChecksDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/print/ClaimFinancialsChecksDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}