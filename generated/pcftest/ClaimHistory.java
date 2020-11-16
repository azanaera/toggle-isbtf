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
import pcftest.ClaimHistory.ClaimHistoryScreen;
import pcftest.ClaimHistory.ClaimHistoryScreen.ClaimHistory_RefreshButton;
import pcftest.ClaimHistory.ClaimHistoryScreen._msgs;
import pcftest.ClaimHistory.ClaimHistory_UpLink;
import pcftest.ClaimHistory._Paging;
import pcftest.ClaimHistory.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/history/ClaimHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimHistory extends PCFLocation {
  public final static String CHECKSUM = "c2ce292b4c20355363bca703e877c5a4";
  
  public ClaimHistory(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimHistory"));
  }
  
  public ClaimHistoryScreen getClaimHistoryScreen() {
    return getOrCreateProperty("ClaimHistoryScreen", "ClaimHistoryScreen", null, pcftest.ClaimHistory.ClaimHistoryScreen.class);
  }
  
  public ClaimHistory_UpLink getClaimHistory_UpLink() {
    return getOrCreateProperty("ClaimHistory_UpLink", "ClaimHistory_UpLink", null, pcftest.ClaimHistory.ClaimHistory_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimHistory._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimHistory.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/history/ClaimHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimHistoryScreen extends PCFElement {
    public ClaimHistoryScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimHistory_RefreshButton getClaimHistory_RefreshButton() {
      return getOrCreateProperty("ClaimHistory_RefreshButton", "ClaimHistory_RefreshButton", null, pcftest.ClaimHistory.ClaimHistoryScreen.ClaimHistory_RefreshButton.class);
    }
    
    public HistoryLV getHistoryLV() {
      return getOrCreateProperty("HistoryLV", "HistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.HistoryLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimHistory.ClaimHistoryScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/history/ClaimHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimHistory_RefreshButton extends ClickableActionElement {
      public ClaimHistory_RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/history/ClaimHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/history/ClaimHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimHistory_UpLink extends ClickableActionElement {
    public ClaimHistory_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/history/ClaimHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/history/ClaimHistory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}