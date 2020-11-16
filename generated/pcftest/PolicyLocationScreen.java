package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyLocationScreen.Cancel;
import pcftest.PolicyLocationScreen.Edit;
import pcftest.PolicyLocationScreen.EditableLocationItemsLV_tb;
import pcftest.PolicyLocationScreen.EditablePropertyLienholdersLV_tb;
import pcftest.PolicyLocationScreen.PolicyLocationRiskDetailPanelSet_tb;
import pcftest.PolicyLocationScreen.Update;
import pcftest.PolicyLocationScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationScreen extends PCFElement {
  public final static String CHECKSUM = "29caa09afba6bd9d202374ab02892738";
  
  public PolicyLocationScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.PolicyLocationScreen.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.PolicyLocationScreen.Edit.class);
  }
  
  public EditableLocationItemsLV getEditableLocationItemsLV() {
    return getOrCreateProperty("EditableLocationItemsLV", "EditableLocationItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableLocationItemsLV.class);
  }
  
  public EditableLocationItemsLV_tb getEditableLocationItemsLV_tb() {
    return getOrCreateProperty("EditableLocationItemsLV_tb", "EditableLocationItemsLV_tb", null, pcftest.PolicyLocationScreen.EditableLocationItemsLV_tb.class);
  }
  
  public EditablePropertyLienholdersLV getEditablePropertyLienholdersLV() {
    return getOrCreateProperty("EditablePropertyLienholdersLV", "EditablePropertyLienholdersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditablePropertyLienholdersLV.class);
  }
  
  public EditablePropertyLienholdersLV_tb getEditablePropertyLienholdersLV_tb() {
    return getOrCreateProperty("EditablePropertyLienholdersLV_tb", "EditablePropertyLienholdersLV_tb", null, pcftest.PolicyLocationScreen.EditablePropertyLienholdersLV_tb.class);
  }
  
  public ValueElement getLocationNumber() {
    return getOrCreateProperty("LocationNumber", "LocationNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PolicyLocationRiskDetailPanelSet getPolicyLocationRiskDetailPanelSet() {
    return getOrCreateProperty("PolicyLocationRiskDetailPanelSet", "PolicyLocationRiskDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyLocationRiskDetailPanelSet.class);
  }
  
  public PolicyLocationRiskDetailPanelSet_tb getPolicyLocationRiskDetailPanelSet_tb() {
    return getOrCreateProperty("PolicyLocationRiskDetailPanelSet_tb", "PolicyLocationRiskDetailPanelSet_tb", null, pcftest.PolicyLocationScreen.PolicyLocationRiskDetailPanelSet_tb.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.PolicyLocationScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PolicyLocationScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableLocationItemsLV_tb extends PCFElement {
    public EditableLocationItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.PolicyLocationScreen.EditableLocationItemsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.PolicyLocationScreen.EditableLocationItemsLV_tb.Add.class);
    }
    
    public pcftest.PolicyLocationScreen.EditableLocationItemsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.PolicyLocationScreen.EditableLocationItemsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditablePropertyLienholdersLV_tb extends PCFElement {
    public EditablePropertyLienholdersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.PolicyLocationScreen.EditablePropertyLienholdersLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.PolicyLocationScreen.EditablePropertyLienholdersLV_tb.Add.class);
    }
    
    public pcftest.PolicyLocationScreen.EditablePropertyLienholdersLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.PolicyLocationScreen.EditablePropertyLienholdersLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationRiskDetailPanelSet_tb extends PCFElement {
    public PolicyLocationRiskDetailPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}