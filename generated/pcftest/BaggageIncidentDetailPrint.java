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
import pcftest.BaggageIncidentDetailPrint.BaggageIncidentDetailPrint_UpLink;
import pcftest.BaggageIncidentDetailPrint.EditBaggageIncidentScreen;
import pcftest.BaggageIncidentDetailPrint.EditBaggageIncidentScreen._msgs;
import pcftest.BaggageIncidentDetailPrint._Paging;
import pcftest.BaggageIncidentDetailPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BaggageIncidentDetailPrint extends PCFLocation {
  public final static String CHECKSUM = "5befe2bc7a2d9b41ea1e91294173b8df";
  
  public BaggageIncidentDetailPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BaggageIncidentDetailPrint"));
  }
  
  public BaggageIncidentDetailPrint_UpLink getBaggageIncidentDetailPrint_UpLink() {
    return getOrCreateProperty("BaggageIncidentDetailPrint_UpLink", "BaggageIncidentDetailPrint_UpLink", null, pcftest.BaggageIncidentDetailPrint.BaggageIncidentDetailPrint_UpLink.class);
  }
  
  public EditBaggageIncidentScreen getEditBaggageIncidentScreen() {
    return getOrCreateProperty("EditBaggageIncidentScreen", "EditBaggageIncidentScreen", null, pcftest.BaggageIncidentDetailPrint.EditBaggageIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BaggageIncidentDetailPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BaggageIncidentDetailPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncidentDetailPrint_UpLink extends ClickableActionElement {
    public BaggageIncidentDetailPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditBaggageIncidentScreen extends PCFElement {
    public EditBaggageIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BaggageIncidentDetailDV getBaggageIncidentDetailDV() {
      return getOrCreateProperty("BaggageIncidentDetailDV", "BaggageIncidentDetailDV", null, pcftest.BaggageIncidentDetailDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BaggageIncidentDetailPrint.EditBaggageIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}