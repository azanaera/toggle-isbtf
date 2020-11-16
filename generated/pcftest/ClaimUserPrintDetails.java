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
import pcftest.ClaimUserPrintDetails.ClaimUserPrintDetailScreen;
import pcftest.ClaimUserPrintDetails.ClaimUserPrintDetailScreen.ClaimUserDetailDV_tb;
import pcftest.ClaimUserPrintDetails.ClaimUserPrintDetailScreen._msgs;
import pcftest.ClaimUserPrintDetails.ClaimUserPrintDetails_UpLink;
import pcftest.ClaimUserPrintDetails._Paging;
import pcftest.ClaimUserPrintDetails.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimUserPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimUserPrintDetails extends PCFLocation {
  public final static String CHECKSUM = "6c3fce7d6de1a86a2d20dc6f613800fd";
  
  public ClaimUserPrintDetails(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimUserPrintDetails"));
  }
  
  public ClaimUserPrintDetailScreen getClaimUserPrintDetailScreen() {
    return getOrCreateProperty("ClaimUserPrintDetailScreen", "ClaimUserPrintDetailScreen", null, pcftest.ClaimUserPrintDetails.ClaimUserPrintDetailScreen.class);
  }
  
  public ClaimUserPrintDetails_UpLink getClaimUserPrintDetails_UpLink() {
    return getOrCreateProperty("ClaimUserPrintDetails_UpLink", "ClaimUserPrintDetails_UpLink", null, pcftest.ClaimUserPrintDetails.ClaimUserPrintDetails_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimUserPrintDetails._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimUserPrintDetails.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimUserPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimUserPrintDetailScreen extends PCFElement {
    public ClaimUserPrintDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimUserDetailDV getClaimUserDetailDV() {
      return getOrCreateProperty("ClaimUserDetailDV", "ClaimUserDetailDV", null, pcftest.ClaimUserDetailDV.class);
    }
    
    public ClaimUserDetailDV_tb getClaimUserDetailDV_tb() {
      return getOrCreateProperty("ClaimUserDetailDV_tb", "ClaimUserDetailDV_tb", null, pcftest.ClaimUserPrintDetails.ClaimUserPrintDetailScreen.ClaimUserDetailDV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimUserPrintDetails.ClaimUserPrintDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimUserPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimUserDetailDV_tb extends PCFElement {
      public ClaimUserDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimUserPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimUserPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimUserPrintDetails_UpLink extends ClickableActionElement {
    public ClaimUserPrintDetails_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimUserPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimUserPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}