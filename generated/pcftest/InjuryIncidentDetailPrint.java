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
import pcftest.InjuryIncidentDetailPrint.InjuryIncidentDetailPrint_UpLink;
import pcftest.InjuryIncidentDetailPrint.InjuryIncidentDetailScreen;
import pcftest.InjuryIncidentDetailPrint.InjuryIncidentDetailScreen._msgs;
import pcftest.InjuryIncidentDetailPrint._Paging;
import pcftest.InjuryIncidentDetailPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InjuryIncidentDetailPrint extends PCFLocation {
  public final static String CHECKSUM = "613c127ff545aebf894752ae95c9a53b";
  
  public InjuryIncidentDetailPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InjuryIncidentDetailPrint"));
  }
  
  public InjuryIncidentDetailPrint_UpLink getInjuryIncidentDetailPrint_UpLink() {
    return getOrCreateProperty("InjuryIncidentDetailPrint_UpLink", "InjuryIncidentDetailPrint_UpLink", null, pcftest.InjuryIncidentDetailPrint.InjuryIncidentDetailPrint_UpLink.class);
  }
  
  public InjuryIncidentDetailScreen getInjuryIncidentDetailScreen() {
    return getOrCreateProperty("InjuryIncidentDetailScreen", "InjuryIncidentDetailScreen", null, pcftest.InjuryIncidentDetailPrint.InjuryIncidentDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InjuryIncidentDetailPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InjuryIncidentDetailPrint.__crumb__.class);
  }
  
  public ClaimLossDetails get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetails.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentDetailPrint_UpLink extends ClickableActionElement {
    public InjuryIncidentDetailPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentDetailScreen extends PCFElement {
    public InjuryIncidentDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public InjuryIncidentDV getInjuryIncidentDV() {
      return getOrCreateProperty("InjuryIncidentDV", "InjuryIncidentDV", null, pcftest.InjuryIncidentDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InjuryIncidentDetailPrint.InjuryIncidentDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/InjuryIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}