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
import pcftest.FixedPropertyIncidentPrint.FixedPropertyIncidentPrintScreen;
import pcftest.FixedPropertyIncidentPrint.FixedPropertyIncidentPrintScreen._msgs;
import pcftest.FixedPropertyIncidentPrint.FixedPropertyIncidentPrint_UpLink;
import pcftest.FixedPropertyIncidentPrint._Paging;
import pcftest.FixedPropertyIncidentPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixedPropertyIncidentPrint extends PCFLocation {
  public final static String CHECKSUM = "621de7e333e9a1b15009dd8d1d13c4bc";
  
  public FixedPropertyIncidentPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FixedPropertyIncidentPrint"));
  }
  
  public FixedPropertyIncidentPrintScreen getFixedPropertyIncidentPrintScreen() {
    return getOrCreateProperty("FixedPropertyIncidentPrintScreen", "FixedPropertyIncidentPrintScreen", null, pcftest.FixedPropertyIncidentPrint.FixedPropertyIncidentPrintScreen.class);
  }
  
  public FixedPropertyIncidentPrint_UpLink getFixedPropertyIncidentPrint_UpLink() {
    return getOrCreateProperty("FixedPropertyIncidentPrint_UpLink", "FixedPropertyIncidentPrint_UpLink", null, pcftest.FixedPropertyIncidentPrint.FixedPropertyIncidentPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FixedPropertyIncidentPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FixedPropertyIncidentPrint.__crumb__.class);
  }
  
  public ClaimLossDetails get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetails.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixedPropertyIncidentPrintScreen extends PCFElement {
    public FixedPropertyIncidentPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableFixedPropertyIncidentsLV getEditableFixedPropertyIncidentsLV() {
      return getOrCreateProperty("EditableFixedPropertyIncidentsLV", "EditableFixedPropertyIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableFixedPropertyIncidentsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FixedPropertyIncidentPrint.FixedPropertyIncidentPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixedPropertyIncidentPrint_UpLink extends ClickableActionElement {
    public FixedPropertyIncidentPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}