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
import pcftest.FixedPropertyIncidentDetailPrint.FixedPropertyIncidentDetailPrint_UpLink;
import pcftest.FixedPropertyIncidentDetailPrint.FixedPropertyIncidentDetailScreen;
import pcftest.FixedPropertyIncidentDetailPrint.FixedPropertyIncidentDetailScreen._msgs;
import pcftest.FixedPropertyIncidentDetailPrint._Paging;
import pcftest.FixedPropertyIncidentDetailPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixedPropertyIncidentDetailPrint extends PCFLocation {
  public final static String CHECKSUM = "a8cff800aab36d3a2b5c3e13cc8d3761";
  
  public FixedPropertyIncidentDetailPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FixedPropertyIncidentDetailPrint"));
  }
  
  public FixedPropertyIncidentDetailPrint_UpLink getFixedPropertyIncidentDetailPrint_UpLink() {
    return getOrCreateProperty("FixedPropertyIncidentDetailPrint_UpLink", "FixedPropertyIncidentDetailPrint_UpLink", null, pcftest.FixedPropertyIncidentDetailPrint.FixedPropertyIncidentDetailPrint_UpLink.class);
  }
  
  public FixedPropertyIncidentDetailScreen getFixedPropertyIncidentDetailScreen() {
    return getOrCreateProperty("FixedPropertyIncidentDetailScreen", "FixedPropertyIncidentDetailScreen", null, pcftest.FixedPropertyIncidentDetailPrint.FixedPropertyIncidentDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FixedPropertyIncidentDetailPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FixedPropertyIncidentDetailPrint.__crumb__.class);
  }
  
  public ClaimLossDetails get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetails.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixedPropertyIncidentDetailPrint_UpLink extends ClickableActionElement {
    public FixedPropertyIncidentDetailPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixedPropertyIncidentDetailScreen extends PCFElement {
    public FixedPropertyIncidentDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FixPropIncidentDetailDV getFixPropIncidentDetailDV() {
      return getOrCreateProperty("FixPropIncidentDetailDV", "FixPropIncidentDetailDV", null, pcftest.FixPropIncidentDetailDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FixedPropertyIncidentDetailPrint.FixedPropertyIncidentDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}