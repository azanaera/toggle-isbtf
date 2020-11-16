package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimitsScreen;
import pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimitsScreen.ClaimPolicyAggregateLimits_AddButton;
import pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimitsScreen.ClaimPolicyAggregateLimits_DeleteButton;
import pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimitsScreen._msgs;
import pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimitsScreen.someInvalidLabelID;
import pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimits_UpLink;
import pcftest.ClaimPolicyAggregateLimits._Paging;
import pcftest.ClaimPolicyAggregateLimits.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyAggregateLimits extends PCFLocation {
  public final static String CHECKSUM = "250e9df85113a1fc074e9c80774f9fba";
  
  public ClaimPolicyAggregateLimits(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyAggregateLimits"));
  }
  
  public ClaimPolicyAggregateLimitsScreen getClaimPolicyAggregateLimitsScreen() {
    return getOrCreateProperty("ClaimPolicyAggregateLimitsScreen", "ClaimPolicyAggregateLimitsScreen", null, pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimitsScreen.class);
  }
  
  public ClaimPolicyAggregateLimits_UpLink getClaimPolicyAggregateLimits_UpLink() {
    return getOrCreateProperty("ClaimPolicyAggregateLimits_UpLink", "ClaimPolicyAggregateLimits_UpLink", null, pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimits_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyAggregateLimits._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyAggregateLimits.__crumb__.class);
  }
  
  public ClaimPolicyGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyAggregateLimitsScreen extends PCFElement {
    public ClaimPolicyAggregateLimitsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AggregateLimitsLV getAggregateLimitsLV() {
      return getOrCreateProperty("AggregateLimitsLV", "AggregateLimitsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AggregateLimitsLV.class);
    }
    
    public ClaimPolicyAggregateLimits_AddButton getClaimPolicyAggregateLimits_AddButton() {
      return getOrCreateProperty("ClaimPolicyAggregateLimits_AddButton", "ClaimPolicyAggregateLimits_AddButton", null, pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimitsScreen.ClaimPolicyAggregateLimits_AddButton.class);
    }
    
    public ClaimPolicyAggregateLimits_DeleteButton getClaimPolicyAggregateLimits_DeleteButton() {
      return getOrCreateProperty("ClaimPolicyAggregateLimits_DeleteButton", "ClaimPolicyAggregateLimits_DeleteButton", null, pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimitsScreen.ClaimPolicyAggregateLimits_DeleteButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimitsScreen._msgs.class);
    }
    
    public someInvalidLabelID getsomeInvalidLabelID() {
      return getOrCreateProperty("someInvalidLabelID", "someInvalidLabelID", null, pcftest.ClaimPolicyAggregateLimits.ClaimPolicyAggregateLimitsScreen.someInvalidLabelID.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyAggregateLimits_AddButton extends ClickableActionElement {
      public ClaimPolicyAggregateLimits_AddButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyNewAggregateLimit click() {
        return clickThis(pcftest.ClaimPolicyNewAggregateLimit.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyAggregateLimits_DeleteButton extends ClickableActionElement {
      public ClaimPolicyAggregateLimits_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class someInvalidLabelID extends ValueElement {
      public someInvalidLabelID(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyAggregateLimits_UpLink extends ClickableActionElement {
    public ClaimPolicyAggregateLimits_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}