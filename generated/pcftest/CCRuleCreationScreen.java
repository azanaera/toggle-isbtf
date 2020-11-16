package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCRuleCreationScreen.Cancel;
import pcftest.CCRuleCreationScreen.DuplicatedNameAlertBar;
import pcftest.CCRuleCreationScreen.DuplicatedNameAlertBar.CloseBtn;
import pcftest.CCRuleCreationScreen.Edit;
import pcftest.CCRuleCreationScreen.Update;
import pcftest.CCRuleCreationScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CCRuleCreationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCRuleCreationScreen extends PCFElement {
  public final static String CHECKSUM = "39cd8c1fa465cbfffbd12f5300fd965f";
  
  public CCRuleCreationScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CCRuleCreationScreen.Cancel.class);
  }
  
  public ConditionValidationToolbarButtonSet getConditionValidationToolbarButtonSet() {
    return getOrCreateProperty("ConditionValidationToolbarButtonSet", "ConditionValidationToolbarButtonSet", null, pcftest.ConditionValidationToolbarButtonSet.class);
  }
  
  public DuplicatedNameAlertBar getDuplicatedNameAlertBar() {
    return getOrCreateProperty("DuplicatedNameAlertBar", "DuplicatedNameAlertBar", null, pcftest.CCRuleCreationScreen.DuplicatedNameAlertBar.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.CCRuleCreationScreen.Edit.class);
  }
  
  public RuleDetailPanelSet_default getRuleDetailPanelSet_default() {
    return getOrCreateProperty("RuleDetailPanelSet_default", "RuleDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleDetailPanelSet_default.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.CCRuleCreationScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CCRuleCreationScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleCreationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleCreationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicatedNameAlertBar extends ClickableActionElement {
    public DuplicatedNameAlertBar(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CCRuleCreationScreen.DuplicatedNameAlertBar.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRuleCreationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/CCRuleCreationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleCreationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleCreationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}