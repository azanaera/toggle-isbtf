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
import pcftest.ClaimSyncStatusPopup.ClaimSyncStatusPopup_UpLink;
import pcftest.ClaimSyncStatusPopup.ClaimSyncStatusScreen;
import pcftest.ClaimSyncStatusPopup.ClaimSyncStatusScreen.ClaimSyncStatusPopup_ResyncButton;
import pcftest.ClaimSyncStatusPopup.ClaimSyncStatusScreen.ClaimSyncStatusPopup_RetryButton;
import pcftest.ClaimSyncStatusPopup.ClaimSyncStatusScreen._msgs;
import pcftest.ClaimSyncStatusPopup._Paging;
import pcftest.ClaimSyncStatusPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSyncStatusPopup extends PCFLocation {
  public final static String CHECKSUM = "b46ef4ba7826da6b0100eaadd0e396f7";
  
  public ClaimSyncStatusPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSyncStatusPopup"));
  }
  
  public ClaimSyncStatusPopup_UpLink getClaimSyncStatusPopup_UpLink() {
    return getOrCreateProperty("ClaimSyncStatusPopup_UpLink", "ClaimSyncStatusPopup_UpLink", null, pcftest.ClaimSyncStatusPopup.ClaimSyncStatusPopup_UpLink.class);
  }
  
  public ClaimSyncStatusScreen getClaimSyncStatusScreen() {
    return getOrCreateProperty("ClaimSyncStatusScreen", "ClaimSyncStatusScreen", null, pcftest.ClaimSyncStatusPopup.ClaimSyncStatusScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSyncStatusPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSyncStatusPopup.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSyncStatusPopup_UpLink extends ClickableActionElement {
    public ClaimSyncStatusPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSyncStatusScreen extends PCFElement {
    public ClaimSyncStatusScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSyncStatusPopup_ResyncButton getClaimSyncStatusPopup_ResyncButton() {
      return getOrCreateProperty("ClaimSyncStatusPopup_ResyncButton", "ClaimSyncStatusPopup_ResyncButton", null, pcftest.ClaimSyncStatusPopup.ClaimSyncStatusScreen.ClaimSyncStatusPopup_ResyncButton.class);
    }
    
    public ClaimSyncStatusPopup_RetryButton getClaimSyncStatusPopup_RetryButton() {
      return getOrCreateProperty("ClaimSyncStatusPopup_RetryButton", "ClaimSyncStatusPopup_RetryButton", null, pcftest.ClaimSyncStatusPopup.ClaimSyncStatusScreen.ClaimSyncStatusPopup_RetryButton.class);
    }
    
    public SyncStatusLV getSyncStatusLV() {
      return getOrCreateProperty("SyncStatusLV", "SyncStatusLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SyncStatusLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSyncStatusPopup.ClaimSyncStatusScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSyncStatusPopup_ResyncButton extends ClickableActionElement {
      public ClaimSyncStatusPopup_ResyncButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSyncStatusPopup_RetryButton extends ClickableActionElement {
      public ClaimSyncStatusPopup_RetryButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}