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
import pcftest.InjuryIncidentsPrint.InjuryIncidentsPrintScreen;
import pcftest.InjuryIncidentsPrint.InjuryIncidentsPrintScreen._msgs;
import pcftest.InjuryIncidentsPrint.InjuryIncidentsPrint_UpLink;
import pcftest.InjuryIncidentsPrint._Paging;
import pcftest.InjuryIncidentsPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InjuryIncidentsPrint extends PCFLocation {
  public final static String CHECKSUM = "6c10466c4d5f6c27c610de90e23ce785";
  
  public InjuryIncidentsPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InjuryIncidentsPrint"));
  }
  
  public InjuryIncidentsPrintScreen getInjuryIncidentsPrintScreen() {
    return getOrCreateProperty("InjuryIncidentsPrintScreen", "InjuryIncidentsPrintScreen", null, pcftest.InjuryIncidentsPrint.InjuryIncidentsPrintScreen.class);
  }
  
  public InjuryIncidentsPrint_UpLink getInjuryIncidentsPrint_UpLink() {
    return getOrCreateProperty("InjuryIncidentsPrint_UpLink", "InjuryIncidentsPrint_UpLink", null, pcftest.InjuryIncidentsPrint.InjuryIncidentsPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InjuryIncidentsPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InjuryIncidentsPrint.__crumb__.class);
  }
  
  public ClaimLossDetails get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetails.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentsPrintScreen extends PCFElement {
    public InjuryIncidentsPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableInjuryIncidentsLV getEditableInjuryIncidentsLV() {
      return getOrCreateProperty("EditableInjuryIncidentsLV", "EditableInjuryIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableInjuryIncidentsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InjuryIncidentsPrint.InjuryIncidentsPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentsPrint_UpLink extends ClickableActionElement {
    public InjuryIncidentsPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}