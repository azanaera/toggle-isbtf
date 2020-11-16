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
import pcftest.BaggageIncidentsPrint.BaggageIncidentsPrintScreen;
import pcftest.BaggageIncidentsPrint.BaggageIncidentsPrintScreen._msgs;
import pcftest.BaggageIncidentsPrint.BaggageIncidentsPrint_UpLink;
import pcftest.BaggageIncidentsPrint._Paging;
import pcftest.BaggageIncidentsPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BaggageIncidentsPrint extends PCFLocation {
  public final static String CHECKSUM = "02542087ed60aae36de7fba3fe082bbe";
  
  public BaggageIncidentsPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BaggageIncidentsPrint"));
  }
  
  public BaggageIncidentsPrintScreen getBaggageIncidentsPrintScreen() {
    return getOrCreateProperty("BaggageIncidentsPrintScreen", "BaggageIncidentsPrintScreen", null, pcftest.BaggageIncidentsPrint.BaggageIncidentsPrintScreen.class);
  }
  
  public BaggageIncidentsPrint_UpLink getBaggageIncidentsPrint_UpLink() {
    return getOrCreateProperty("BaggageIncidentsPrint_UpLink", "BaggageIncidentsPrint_UpLink", null, pcftest.BaggageIncidentsPrint.BaggageIncidentsPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BaggageIncidentsPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BaggageIncidentsPrint.__crumb__.class);
  }
  
  public ClaimLossDetails get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetails.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncidentsPrintScreen extends PCFElement {
    public BaggageIncidentsPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableBaggageIncidentsLV getEditableBaggageIncidentsLV() {
      return getOrCreateProperty("EditableBaggageIncidentsLV", "EditableBaggageIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableBaggageIncidentsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BaggageIncidentsPrint.BaggageIncidentsPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncidentsPrint_UpLink extends ClickableActionElement {
    public BaggageIncidentsPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/BaggageIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}