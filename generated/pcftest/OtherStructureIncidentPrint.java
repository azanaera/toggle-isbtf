package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OtherStructureIncidentPrint.OtherStructureIncidentPrint_UpLink;
import pcftest.OtherStructureIncidentPrint._Paging;
import pcftest.OtherStructureIncidentPrint.__crumb__;
import pcftest.OtherStructureIncidentPrint._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/OtherStructureIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherStructureIncidentPrint extends PCFLocation {
  public final static String CHECKSUM = "a08c6866f9582bf52f1042285d897f8c";
  
  public OtherStructureIncidentPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OtherStructureIncidentPrint"));
  }
  
  public OtherStructureIncidentPanelSet getOtherStructureIncidentPanelSet() {
    return getOrCreateProperty("OtherStructureIncidentPanelSet", "OtherStructureIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.OtherStructureIncidentPanelSet.class);
  }
  
  public OtherStructureIncidentPrint_UpLink getOtherStructureIncidentPrint_UpLink() {
    return getOrCreateProperty("OtherStructureIncidentPrint_UpLink", "OtherStructureIncidentPrint_UpLink", null, pcftest.OtherStructureIncidentPrint.OtherStructureIncidentPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OtherStructureIncidentPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OtherStructureIncidentPrint.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OtherStructureIncidentPrint._msgs.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/OtherStructureIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherStructureIncidentPrint_UpLink extends ClickableActionElement {
    public OtherStructureIncidentPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/OtherStructureIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/OtherStructureIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/OtherStructureIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}