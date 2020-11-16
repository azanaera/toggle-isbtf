package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleDetailScreen.DuplicatedNameAlertBar;
import pcftest.RuleDetailScreen.NotLatestAlert;
import pcftest.RuleDetailScreen.PendingImportAlert;
import pcftest.RuleDetailScreen.RollingUpgradeAlert;
import pcftest.RuleDetailScreen.RuleDeletedByAnotherUserAlert;
import pcftest.RuleDetailScreen.UnavailableToRunAlert;
import pcftest.RuleDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleDetailScreen extends PCFElement {
  public final static String CHECKSUM = "52c31efdc5cb161a134f6cc2577b14f2";
  
  public RuleDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ConditionValidationToolbarButtonSet getConditionValidationToolbarButtonSet() {
    return getOrCreateProperty("ConditionValidationToolbarButtonSet", "ConditionValidationToolbarButtonSet", null, pcftest.ConditionValidationToolbarButtonSet.class);
  }
  
  public DuplicatedNameAlertBar getDuplicatedNameAlertBar() {
    return getOrCreateProperty("DuplicatedNameAlertBar", "DuplicatedNameAlertBar", null, pcftest.RuleDetailScreen.DuplicatedNameAlertBar.class);
  }
  
  public NotLatestAlert getNotLatestAlert() {
    return getOrCreateProperty("NotLatestAlert", "NotLatestAlert", null, pcftest.RuleDetailScreen.NotLatestAlert.class);
  }
  
  public PendingImportAlert getPendingImportAlert() {
    return getOrCreateProperty("PendingImportAlert", "PendingImportAlert", null, pcftest.RuleDetailScreen.PendingImportAlert.class);
  }
  
  public RollingUpgradeAlert getRollingUpgradeAlert() {
    return getOrCreateProperty("RollingUpgradeAlert", "RollingUpgradeAlert", null, pcftest.RuleDetailScreen.RollingUpgradeAlert.class);
  }
  
  public RuleDeletedByAnotherUserAlert getRuleDeletedByAnotherUserAlert() {
    return getOrCreateProperty("RuleDeletedByAnotherUserAlert", "RuleDeletedByAnotherUserAlert", null, pcftest.RuleDetailScreen.RuleDeletedByAnotherUserAlert.class);
  }
  
  public RuleDetailPanelSet_default getRuleDetailPanelSet_default() {
    return getOrCreateProperty("RuleDetailPanelSet_default", "RuleDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleDetailPanelSet_default.class);
  }
  
  public StatusTransitionToolbarButtonSet getStatusTransitionToolbarButtonSet() {
    return getOrCreateProperty("StatusTransitionToolbarButtonSet", "StatusTransitionToolbarButtonSet", null, pcftest.StatusTransitionToolbarButtonSet.class);
  }
  
  public UnavailableToRunAlert getUnavailableToRunAlert() {
    return getOrCreateProperty("UnavailableToRunAlert", "UnavailableToRunAlert", null, pcftest.RuleDetailScreen.UnavailableToRunAlert.class);
  }
  
  public SelectElement getVersion() {
    return getOrCreateProperty("Version", "Version", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RuleDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicatedNameAlertBar extends ClickableActionElement {
    public DuplicatedNameAlertBar(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public pcftest.RuleDetailScreen.DuplicatedNameAlertBar.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.RuleDetailScreen.DuplicatedNameAlertBar.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotLatestAlert extends ClickableActionElement {
    public NotLatestAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public pcftest.RuleDetailScreen.NotLatestAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.RuleDetailScreen.NotLatestAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PendingImportAlert extends ClickableActionElement {
    public PendingImportAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleImportDetailsPopup click() {
      return clickThis(pcftest.RuleImportDetailsPopup.class);
    }
    
    public pcftest.RuleDetailScreen.PendingImportAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.RuleDetailScreen.PendingImportAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RollingUpgradeAlert extends ClickableActionElement {
    public RollingUpgradeAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.RuleDetailScreen.RollingUpgradeAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.RuleDetailScreen.RollingUpgradeAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleDeletedByAnotherUserAlert extends ClickableActionElement {
    public RuleDeletedByAnotherUserAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public pcftest.RuleDetailScreen.RuleDeletedByAnotherUserAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.RuleDetailScreen.RuleDeletedByAnotherUserAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnavailableToRunAlert extends ClickableActionElement {
    public UnavailableToRunAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.RuleDetailScreen.UnavailableToRunAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.RuleDetailScreen.UnavailableToRunAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/RuleDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}