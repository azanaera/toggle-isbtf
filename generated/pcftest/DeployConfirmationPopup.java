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
import pcftest.DeployConfirmationPopup.AlreadyDeployedVersions;
import pcftest.DeployConfirmationPopup.Cancel;
import pcftest.DeployConfirmationPopup.Continue;
import pcftest.DeployConfirmationPopup.DeployConfirmationPopup_UpLink;
import pcftest.DeployConfirmationPopup.InvalidVersions;
import pcftest.DeployConfirmationPopup.OutdatedVersions;
import pcftest.DeployConfirmationPopup.ReadyVersions;
import pcftest.DeployConfirmationPopup.RollingUpgradeAlertbar;
import pcftest.DeployConfirmationPopup.RollingUpgradeAlertbar.CloseBtn;
import pcftest.DeployConfirmationPopup.UnapprovedVersions;
import pcftest.DeployConfirmationPopup._Paging;
import pcftest.DeployConfirmationPopup.__crumb__;
import pcftest.DeployConfirmationPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DeployConfirmationPopup extends PCFLocation {
  public final static String CHECKSUM = "7f702b085cde145f744b7dc1ffac36fd";
  
  public DeployConfirmationPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DeployConfirmationPopup"));
  }
  
  public AlreadyDeployedVersions getAlreadyDeployedVersions() {
    return getOrCreateProperty("AlreadyDeployedVersions", "AlreadyDeployedVersions", null, pcftest.DeployConfirmationPopup.AlreadyDeployedVersions.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.DeployConfirmationPopup.Cancel.class);
  }
  
  public Continue getContinue() {
    return getOrCreateProperty("Continue", "Continue", null, pcftest.DeployConfirmationPopup.Continue.class);
  }
  
  public DeployConfirmationPopup_UpLink getDeployConfirmationPopup_UpLink() {
    return getOrCreateProperty("DeployConfirmationPopup_UpLink", "DeployConfirmationPopup_UpLink", null, pcftest.DeployConfirmationPopup.DeployConfirmationPopup_UpLink.class);
  }
  
  public InvalidVersions getInvalidVersions() {
    return getOrCreateProperty("InvalidVersions", "InvalidVersions", null, pcftest.DeployConfirmationPopup.InvalidVersions.class);
  }
  
  public OutdatedVersions getOutdatedVersions() {
    return getOrCreateProperty("OutdatedVersions", "OutdatedVersions", null, pcftest.DeployConfirmationPopup.OutdatedVersions.class);
  }
  
  public ReadyVersions getReadyVersions() {
    return getOrCreateProperty("ReadyVersions", "ReadyVersions", null, pcftest.DeployConfirmationPopup.ReadyVersions.class);
  }
  
  public RollingUpgradeAlertbar getRollingUpgradeAlertbar() {
    return getOrCreateProperty("RollingUpgradeAlertbar", "RollingUpgradeAlertbar", null, pcftest.DeployConfirmationPopup.RollingUpgradeAlertbar.class);
  }
  
  public UnapprovedVersions getUnapprovedVersions() {
    return getOrCreateProperty("UnapprovedVersions", "UnapprovedVersions", null, pcftest.DeployConfirmationPopup.UnapprovedVersions.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DeployConfirmationPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DeployConfirmationPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DeployConfirmationPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AlreadyDeployedVersions extends PCFElement {
    public AlreadyDeployedVersions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleListPanelSet getRuleListPanelSet() {
      return getOrCreateProperty("RuleListPanelSet", "RuleListPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleListPanelSet.class);
    }
    
    public pcftest.DeployConfirmationPopup.AlreadyDeployedVersions.RuleListPanelSet_tb getRuleListPanelSet_tb() {
      return getOrCreateProperty("RuleListPanelSet_tb", "RuleListPanelSet_tb", null, pcftest.DeployConfirmationPopup.AlreadyDeployedVersions.RuleListPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleListPanelSet_tb extends PCFElement {
      public RuleListPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Continue extends ClickableActionElement {
    public Continue(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeployConfirmationPopup_UpLink extends ClickableActionElement {
    public DeployConfirmationPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvalidVersions extends PCFElement {
    public InvalidVersions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleListPanelSet getRuleListPanelSet() {
      return getOrCreateProperty("RuleListPanelSet", "RuleListPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleListPanelSet.class);
    }
    
    public pcftest.DeployConfirmationPopup.InvalidVersions.RuleListPanelSet_tb getRuleListPanelSet_tb() {
      return getOrCreateProperty("RuleListPanelSet_tb", "RuleListPanelSet_tb", null, pcftest.DeployConfirmationPopup.InvalidVersions.RuleListPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleListPanelSet_tb extends PCFElement {
      public RuleListPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OutdatedVersions extends PCFElement {
    public OutdatedVersions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleListPanelSet getRuleListPanelSet() {
      return getOrCreateProperty("RuleListPanelSet", "RuleListPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleListPanelSet.class);
    }
    
    public pcftest.DeployConfirmationPopup.OutdatedVersions.RuleListPanelSet_tb getRuleListPanelSet_tb() {
      return getOrCreateProperty("RuleListPanelSet_tb", "RuleListPanelSet_tb", null, pcftest.DeployConfirmationPopup.OutdatedVersions.RuleListPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleListPanelSet_tb extends PCFElement {
      public RuleListPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReadyVersions extends PCFElement {
    public ReadyVersions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleListPanelSet getRuleListPanelSet() {
      return getOrCreateProperty("RuleListPanelSet", "RuleListPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleListPanelSet.class);
    }
    
    public pcftest.DeployConfirmationPopup.ReadyVersions.RuleListPanelSet_tb getRuleListPanelSet_tb() {
      return getOrCreateProperty("RuleListPanelSet_tb", "RuleListPanelSet_tb", null, pcftest.DeployConfirmationPopup.ReadyVersions.RuleListPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleListPanelSet_tb extends PCFElement {
      public RuleListPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RollingUpgradeAlertbar extends ClickableActionElement {
    public RollingUpgradeAlertbar(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.DeployConfirmationPopup.RollingUpgradeAlertbar.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnapprovedVersions extends PCFElement {
    public UnapprovedVersions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleListPanelSet getRuleListPanelSet() {
      return getOrCreateProperty("RuleListPanelSet", "RuleListPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleListPanelSet.class);
    }
    
    public pcftest.DeployConfirmationPopup.UnapprovedVersions.RuleListPanelSet_tb getRuleListPanelSet_tb() {
      return getOrCreateProperty("RuleListPanelSet_tb", "RuleListPanelSet_tb", null, pcftest.DeployConfirmationPopup.UnapprovedVersions.RuleListPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleListPanelSet_tb extends PCFElement {
      public RuleListPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/DeployConfirmationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}