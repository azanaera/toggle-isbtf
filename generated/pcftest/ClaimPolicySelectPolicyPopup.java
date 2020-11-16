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
import pcftest.ClaimPolicySelectPolicyPopup.ClaimPolicySelectPolicyPopup_UpLink;
import pcftest.ClaimPolicySelectPolicyPopup.ClaimPolicySelectPolicyScreen;
import pcftest.ClaimPolicySelectPolicyPopup.ClaimPolicySelectPolicyScreen.PolicySearchResultLV_tb;
import pcftest.ClaimPolicySelectPolicyPopup.ClaimPolicySelectPolicyScreen._msgs;
import pcftest.ClaimPolicySelectPolicyPopup._Paging;
import pcftest.ClaimPolicySelectPolicyPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicySelectPolicyPopup extends PCFLocation {
  public final static String CHECKSUM = "6e732e9233f62e5e89691bd0cd74be40";
  
  public ClaimPolicySelectPolicyPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicySelectPolicyPopup"));
  }
  
  public ClaimPolicySelectPolicyPopup_UpLink getClaimPolicySelectPolicyPopup_UpLink() {
    return getOrCreateProperty("ClaimPolicySelectPolicyPopup_UpLink", "ClaimPolicySelectPolicyPopup_UpLink", null, pcftest.ClaimPolicySelectPolicyPopup.ClaimPolicySelectPolicyPopup_UpLink.class);
  }
  
  public ClaimPolicySelectPolicyScreen getClaimPolicySelectPolicyScreen() {
    return getOrCreateProperty("ClaimPolicySelectPolicyScreen", "ClaimPolicySelectPolicyScreen", null, pcftest.ClaimPolicySelectPolicyPopup.ClaimPolicySelectPolicyScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicySelectPolicyPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicySelectPolicyPopup.__crumb__.class);
  }
  
  public ClaimPolicyGeneral get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyGeneral.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicySelectPolicyPopup_UpLink extends ClickableActionElement {
    public ClaimPolicySelectPolicyPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicySelectPolicyScreen extends PCFElement {
    public ClaimPolicySelectPolicyScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PolicySearchDV getPolicySearchDV() {
      return getOrCreateProperty("PolicySearchDV", "PolicySearchDV", null, pcftest.PolicySearchDV.class);
    }
    
    public PolicySearchResultLV getPolicySearchResultLV() {
      return getOrCreateProperty("PolicySearchResultLV", "PolicySearchResultLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicySearchResultLV.class);
    }
    
    public PolicySearchResultLV_tb getPolicySearchResultLV_tb() {
      return getOrCreateProperty("PolicySearchResultLV_tb", "PolicySearchResultLV_tb", null, pcftest.ClaimPolicySelectPolicyPopup.ClaimPolicySelectPolicyScreen.PolicySearchResultLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicySelectPolicyPopup.ClaimPolicySelectPolicyScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicySearchResultLV_tb extends PCFElement {
      public PolicySearchResultLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicySelectPolicyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}