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
import pcftest.SafePersistingOrderInfo.SafePersistingOrderInfoScreen;
import pcftest.SafePersistingOrderInfo.SafePersistingOrderInfoScreen._msgs;
import pcftest.SafePersistingOrderInfo.SafePersistingOrderInfoScreen.spotb;
import pcftest.SafePersistingOrderInfo.SafePersistingOrderInfo_UpLink;
import pcftest.SafePersistingOrderInfo._Paging;
import pcftest.SafePersistingOrderInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SafePersistingOrderInfo extends PCFLocation {
  public final static String CHECKSUM = "0893155386317b73991e86f0599336ba";
  
  public SafePersistingOrderInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SafePersistingOrderInfo"));
  }
  
  public SafePersistingOrderInfoScreen getSafePersistingOrderInfoScreen() {
    return getOrCreateProperty("SafePersistingOrderInfoScreen", "SafePersistingOrderInfoScreen", null, pcftest.SafePersistingOrderInfo.SafePersistingOrderInfoScreen.class);
  }
  
  public SafePersistingOrderInfo_UpLink getSafePersistingOrderInfo_UpLink() {
    return getOrCreateProperty("SafePersistingOrderInfo_UpLink", "SafePersistingOrderInfo_UpLink", null, pcftest.SafePersistingOrderInfo.SafePersistingOrderInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SafePersistingOrderInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SafePersistingOrderInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SafePersistingOrderInfoScreen extends PCFElement {
    public SafePersistingOrderInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SafePersistingOrderInfoLV getSafePersistingOrderInfoLV() {
      return getOrCreateProperty("SafePersistingOrderInfoLV", "SafePersistingOrderInfoLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SafePersistingOrderInfoLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SafePersistingOrderInfo.SafePersistingOrderInfoScreen._msgs.class);
    }
    
    public spotb getspotb() {
      return getOrCreateProperty("spotb", "spotb", null, pcftest.SafePersistingOrderInfo.SafePersistingOrderInfoScreen.spotb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class spotb extends PCFElement {
      public spotb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SafePersistingOrderInfo_UpLink extends ClickableActionElement {
    public SafePersistingOrderInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}