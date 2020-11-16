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
import pcftest.ClaimPolicyStatCodePickerPopup.ClaimPolicyStatCodePickerPopup_UpLink;
import pcftest.ClaimPolicyStatCodePickerPopup.ClaimPolicyStatCodesScreen;
import pcftest.ClaimPolicyStatCodePickerPopup.ClaimPolicyStatCodesScreen.ClaimPolicyStatCodePickerPopup_CancelButton;
import pcftest.ClaimPolicyStatCodePickerPopup.ClaimPolicyStatCodesScreen.StatCodePickerLV_tb;
import pcftest.ClaimPolicyStatCodePickerPopup.ClaimPolicyStatCodesScreen._msgs;
import pcftest.ClaimPolicyStatCodePickerPopup._Paging;
import pcftest.ClaimPolicyStatCodePickerPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyStatCodePickerPopup extends PCFLocation {
  public final static String CHECKSUM = "34181cd2e03a1c71df49d598547aad9e";
  
  public ClaimPolicyStatCodePickerPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyStatCodePickerPopup"));
  }
  
  public ClaimPolicyStatCodePickerPopup_UpLink getClaimPolicyStatCodePickerPopup_UpLink() {
    return getOrCreateProperty("ClaimPolicyStatCodePickerPopup_UpLink", "ClaimPolicyStatCodePickerPopup_UpLink", null, pcftest.ClaimPolicyStatCodePickerPopup.ClaimPolicyStatCodePickerPopup_UpLink.class);
  }
  
  public ClaimPolicyStatCodesScreen getClaimPolicyStatCodesScreen() {
    return getOrCreateProperty("ClaimPolicyStatCodesScreen", "ClaimPolicyStatCodesScreen", null, pcftest.ClaimPolicyStatCodePickerPopup.ClaimPolicyStatCodesScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyStatCodePickerPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyStatCodePickerPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodePickerPopup_UpLink extends ClickableActionElement {
    public ClaimPolicyStatCodePickerPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodesScreen extends PCFElement {
    public ClaimPolicyStatCodesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyStatCodePickerPopup_CancelButton getClaimPolicyStatCodePickerPopup_CancelButton() {
      return getOrCreateProperty("ClaimPolicyStatCodePickerPopup_CancelButton", "ClaimPolicyStatCodePickerPopup_CancelButton", null, pcftest.ClaimPolicyStatCodePickerPopup.ClaimPolicyStatCodesScreen.ClaimPolicyStatCodePickerPopup_CancelButton.class);
    }
    
    public StatCodeFilterDV getStatCodeFilterDV() {
      return getOrCreateProperty("StatCodeFilterDV", "StatCodeFilterDV", null, pcftest.StatCodeFilterDV.class);
    }
    
    public StatCodePickerLV getStatCodePickerLV() {
      return getOrCreateProperty("StatCodePickerLV", "StatCodePickerLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatCodePickerLV.class);
    }
    
    public StatCodePickerLV_tb getStatCodePickerLV_tb() {
      return getOrCreateProperty("StatCodePickerLV_tb", "StatCodePickerLV_tb", null, pcftest.ClaimPolicyStatCodePickerPopup.ClaimPolicyStatCodesScreen.StatCodePickerLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyStatCodePickerPopup.ClaimPolicyStatCodesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyStatCodePickerPopup_CancelButton extends ClickableActionElement {
      public ClaimPolicyStatCodePickerPopup_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatCodePickerLV_tb extends PCFElement {
      public StatCodePickerLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/ClaimPolicyStatCodePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}