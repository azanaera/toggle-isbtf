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
import pcftest.PolicySummaryInfoPopup.PolicySummaryInfoPopup_UpLink;
import pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen;
import pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.PolicySummaryInfoPopup_CloseButton;
import pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.PolicySummaryPropertyPanel;
import pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.PolicySummaryPropertyPanel.PolicySummaryPropertyLV_tb;
import pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.PolicySummaryRiskUnitPanel;
import pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.PolicySummaryRiskUnitPanel.PolicySummaryVehicleLV_tb;
import pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen._msgs;
import pcftest.PolicySummaryInfoPopup._Paging;
import pcftest.PolicySummaryInfoPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySummaryInfoPopup extends PCFLocation {
  public final static String CHECKSUM = "90002d467173ba31b72351680403cbce";
  
  public PolicySummaryInfoPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PolicySummaryInfoPopup"));
  }
  
  public PolicySummaryInfoPopup_UpLink getPolicySummaryInfoPopup_UpLink() {
    return getOrCreateProperty("PolicySummaryInfoPopup_UpLink", "PolicySummaryInfoPopup_UpLink", null, pcftest.PolicySummaryInfoPopup.PolicySummaryInfoPopup_UpLink.class);
  }
  
  public PolicySummaryInfoScreen getPolicySummaryInfoScreen() {
    return getOrCreateProperty("PolicySummaryInfoScreen", "PolicySummaryInfoScreen", null, pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PolicySummaryInfoPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PolicySummaryInfoPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySummaryInfoPopup_UpLink extends ClickableActionElement {
    public PolicySummaryInfoPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySummaryInfoScreen extends PCFElement {
    public PolicySummaryInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PolicySummaryGeneralDV_Auto getPolicySummaryGeneralDV_Auto() {
      return getOrCreateProperty("PolicySummaryGeneralDV_Auto", "PolicySummaryGeneralDV", null, pcftest.PolicySummaryGeneralDV_Auto.class);
    }
    
    public PolicySummaryGeneralDV_Gl getPolicySummaryGeneralDV_Gl() {
      return getOrCreateProperty("PolicySummaryGeneralDV_Gl", "PolicySummaryGeneralDV", null, pcftest.PolicySummaryGeneralDV_Gl.class);
    }
    
    public PolicySummaryGeneralDV_Pr getPolicySummaryGeneralDV_Pr() {
      return getOrCreateProperty("PolicySummaryGeneralDV_Pr", "PolicySummaryGeneralDV", null, pcftest.PolicySummaryGeneralDV_Pr.class);
    }
    
    public PolicySummaryGeneralDV_Trav getPolicySummaryGeneralDV_Trav() {
      return getOrCreateProperty("PolicySummaryGeneralDV_Trav", "PolicySummaryGeneralDV", null, pcftest.PolicySummaryGeneralDV_Trav.class);
    }
    
    public PolicySummaryGeneralDV_Wc getPolicySummaryGeneralDV_Wc() {
      return getOrCreateProperty("PolicySummaryGeneralDV_Wc", "PolicySummaryGeneralDV", null, pcftest.PolicySummaryGeneralDV_Wc.class);
    }
    
    public PolicySummaryInfoPopup_CloseButton getPolicySummaryInfoPopup_CloseButton() {
      return getOrCreateProperty("PolicySummaryInfoPopup_CloseButton", "PolicySummaryInfoPopup_CloseButton", null, pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.PolicySummaryInfoPopup_CloseButton.class);
    }
    
    public PolicySummaryPropertyPanel getPolicySummaryPropertyPanel() {
      return getOrCreateProperty("PolicySummaryPropertyPanel", "PolicySummaryPropertyPanel", null, pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.PolicySummaryPropertyPanel.class);
    }
    
    public PolicySummaryRiskUnitPanel getPolicySummaryRiskUnitPanel() {
      return getOrCreateProperty("PolicySummaryRiskUnitPanel", "PolicySummaryRiskUnitPanel", null, pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.PolicySummaryRiskUnitPanel.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicySummaryInfoPopup_CloseButton extends ClickableActionElement {
      public PolicySummaryInfoPopup_CloseButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicySummaryPropertyPanel extends PCFElement {
      public PolicySummaryPropertyPanel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PolicySummaryPropertyLV getPolicySummaryPropertyLV() {
        return getOrCreateProperty("PolicySummaryPropertyLV", "PolicySummaryPropertyLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicySummaryPropertyLV.class);
      }
      
      public PolicySummaryPropertyLV_tb getPolicySummaryPropertyLV_tb() {
        return getOrCreateProperty("PolicySummaryPropertyLV_tb", "PolicySummaryPropertyLV_tb", null, pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.PolicySummaryPropertyPanel.PolicySummaryPropertyLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PolicySummaryPropertyLV_tb extends PCFElement {
        public PolicySummaryPropertyLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicySummaryRiskUnitPanel extends PCFElement {
      public PolicySummaryRiskUnitPanel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PolicySummaryVehicleLV getPolicySummaryVehicleLV() {
        return getOrCreateProperty("PolicySummaryVehicleLV", "PolicySummaryVehicleLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicySummaryVehicleLV.class);
      }
      
      public PolicySummaryVehicleLV_tb getPolicySummaryVehicleLV_tb() {
        return getOrCreateProperty("PolicySummaryVehicleLV_tb", "PolicySummaryVehicleLV_tb", null, pcftest.PolicySummaryInfoPopup.PolicySummaryInfoScreen.PolicySummaryRiskUnitPanel.PolicySummaryVehicleLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PolicySummaryVehicleLV_tb extends PCFElement {
        public PolicySummaryVehicleLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryInfoPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}