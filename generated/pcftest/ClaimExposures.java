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
import pcftest.ClaimExposures.ClaimExposuresScreen;
import pcftest.ClaimExposures.ClaimExposuresScreen.ClaimExposures_Assign;
import pcftest.ClaimExposures.ClaimExposuresScreen.ClaimExposures_CloseExposure;
import pcftest.ClaimExposures.ClaimExposuresScreen.ClaimExposures_CreateReserve;
import pcftest.ClaimExposures.ClaimExposuresScreen.ClaimExposures_Print;
import pcftest.ClaimExposures.ClaimExposuresScreen.ClaimExposures_Refresh;
import pcftest.ClaimExposures.ClaimExposuresScreen._msgs;
import pcftest.ClaimExposures.ClaimExposures_UpLink;
import pcftest.ClaimExposures._Paging;
import pcftest.ClaimExposures.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimExposures extends PCFLocation {
  public final static String CHECKSUM = "4c0e70d6a9ae613a7e898055bfdac508";
  
  public ClaimExposures(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimExposures"));
  }
  
  public ClaimExposuresScreen getClaimExposuresScreen() {
    return getOrCreateProperty("ClaimExposuresScreen", "ClaimExposuresScreen", null, pcftest.ClaimExposures.ClaimExposuresScreen.class);
  }
  
  public ClaimExposures_UpLink getClaimExposures_UpLink() {
    return getOrCreateProperty("ClaimExposures_UpLink", "ClaimExposures_UpLink", null, pcftest.ClaimExposures.ClaimExposures_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimExposures._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimExposures.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimExposuresScreen extends PCFElement {
    public ClaimExposuresScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimExposures_Assign getClaimExposures_Assign() {
      return getOrCreateProperty("ClaimExposures_Assign", "ClaimExposures_Assign", null, pcftest.ClaimExposures.ClaimExposuresScreen.ClaimExposures_Assign.class);
    }
    
    public ClaimExposures_CloseExposure getClaimExposures_CloseExposure() {
      return getOrCreateProperty("ClaimExposures_CloseExposure", "ClaimExposures_CloseExposure", null, pcftest.ClaimExposures.ClaimExposuresScreen.ClaimExposures_CloseExposure.class);
    }
    
    public ClaimExposures_CreateReserve getClaimExposures_CreateReserve() {
      return getOrCreateProperty("ClaimExposures_CreateReserve", "ClaimExposures_CreateReserve", null, pcftest.ClaimExposures.ClaimExposuresScreen.ClaimExposures_CreateReserve.class);
    }
    
    public ClaimExposures_Print getClaimExposures_Print() {
      return getOrCreateProperty("ClaimExposures_Print", "ClaimExposures_Print", null, pcftest.ClaimExposures.ClaimExposuresScreen.ClaimExposures_Print.class);
    }
    
    public ClaimExposures_Refresh getClaimExposures_Refresh() {
      return getOrCreateProperty("ClaimExposures_Refresh", "ClaimExposures_Refresh", null, pcftest.ClaimExposures.ClaimExposuresScreen.ClaimExposures_Refresh.class);
    }
    
    public ExposuresLV getExposuresLV() {
      return getOrCreateProperty("ExposuresLV", "ExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ExposuresLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimExposures.ClaimExposuresScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimExposures_Assign extends ClickableActionElement {
      public ClaimExposures_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimExposures_CloseExposure extends ClickableActionElement {
      public ClaimExposures_CloseExposure(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimExposures_CreateReserve extends ClickableActionElement {
      public ClaimExposures_CreateReserve(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimExposures_Print extends ClickableActionElement {
      public ClaimExposures_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimExposures_Refresh extends ClickableActionElement {
      public ClaimExposures_Refresh(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimExposures_UpLink extends ClickableActionElement {
    public ClaimExposures_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ClaimExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}