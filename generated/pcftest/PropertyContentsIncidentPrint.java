package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PropertyContentsIncidentPrint.PropertyContentsIncidentPrint_UpLink;
import pcftest.PropertyContentsIncidentPrint._Paging;
import pcftest.PropertyContentsIncidentPrint.__crumb__;
import pcftest.PropertyContentsIncidentPrint._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/PropertyContentsIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyContentsIncidentPrint extends PCFLocation {
  public final static String CHECKSUM = "67d7f9b584e7e0a717a44c0ff506575b";
  
  public PropertyContentsIncidentPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PropertyContentsIncidentPrint"));
  }
  
  public PropertyContentsIncidentPanelSet getPropertyContentsIncidentPanelSet() {
    return getOrCreateProperty("PropertyContentsIncidentPanelSet", "PropertyContentsIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PropertyContentsIncidentPanelSet.class);
  }
  
  public PropertyContentsIncidentPrint_UpLink getPropertyContentsIncidentPrint_UpLink() {
    return getOrCreateProperty("PropertyContentsIncidentPrint_UpLink", "PropertyContentsIncidentPrint_UpLink", null, pcftest.PropertyContentsIncidentPrint.PropertyContentsIncidentPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PropertyContentsIncidentPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PropertyContentsIncidentPrint.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PropertyContentsIncidentPrint._msgs.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/PropertyContentsIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsIncidentPrint_UpLink extends ClickableActionElement {
    public PropertyContentsIncidentPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/PropertyContentsIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/PropertyContentsIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/PropertyContentsIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}