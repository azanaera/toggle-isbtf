package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyLocationRUDetailsDV.AddBuilding;
import pcftest.PolicyLocationRUDetailsDV.ClassCodeInputGroup;
import pcftest.PolicyLocationRUDetailsDV.EditableRULienholdersLV_tb;
import pcftest.PolicyLocationRUDetailsDV.EditableRULienholdersLV_tb.Add;
import pcftest.PolicyLocationRUDetailsDV.EditableRULienholdersLV_tb.Remove;
import pcftest.PolicyLocationRUDetailsDV.MiscRUType;
import pcftest.PolicyLocationRUDetailsDV.RemoveBuilding;
import typekey.OtherRiskType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationRUDetailsDV extends DetailViewElement {
  public final static String CHECKSUM = "0364cb6384fd272f39aabc275123699d";
  
  public PolicyLocationRUDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddBuilding getAddBuilding() {
    return getOrCreateProperty("AddBuilding", "AddBuilding", null, pcftest.PolicyLocationRUDetailsDV.AddBuilding.class);
  }
  
  public ValueElement getBuildingNotes() {
    return getOrCreateProperty("BuildingNotes", "BuildingNotes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getBuildingNumber() {
    return getOrCreateProperty("BuildingNumber", "BuildingNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClassCodeInputGroup getClassCodeInputGroup() {
    return getOrCreateProperty("ClassCodeInputGroup", "ClassCodeInputGroup", null, pcftest.PolicyLocationRUDetailsDV.ClassCodeInputGroup.class);
  }
  
  public EditableRULienholdersLV getEditableRULienholdersLV() {
    return getOrCreateProperty("EditableRULienholdersLV", "EditableRULienholdersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableRULienholdersLV.class);
  }
  
  public EditableRULienholdersLV_tb getEditableRULienholdersLV_tb() {
    return getOrCreateProperty("EditableRULienholdersLV_tb", "EditableRULienholdersLV_tb", null, pcftest.PolicyLocationRUDetailsDV.EditableRULienholdersLV_tb.class);
  }
  
  public MiscRUType getMiscRUType() {
    return getOrCreateProperty("MiscRUType", "MiscRUType", null, pcftest.PolicyLocationRUDetailsDV.MiscRUType.class);
  }
  
  public ValueElement getRUCoverageForm() {
    return getOrCreateProperty("RUCoverageForm", "RUCoverageForm", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRUCoveragePartTypes() {
    return getOrCreateProperty("RUCoveragePartTypes", "RUCoveragePartTypes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRUDescription() {
    return getOrCreateProperty("RUDescription", "RUDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRUNumber() {
    return getOrCreateProperty("RUNumber", "RUNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RemoveBuilding getRemoveBuilding() {
    return getOrCreateProperty("RemoveBuilding", "RemoveBuilding", null, pcftest.PolicyLocationRUDetailsDV.RemoveBuilding.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddBuilding extends ClickableActionElement {
    public AddBuilding(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClassCodeInputGroup extends PCFElement {
    public ClassCodeInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClassCodeInputSet getClassCodeInputSet() {
      return getOrCreateProperty("ClassCodeInputSet", "ClassCodeInputSet", null, pcftest.ClassCodeInputSet.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRULienholdersLV_tb extends PCFElement {
    public EditableRULienholdersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.PolicyLocationRUDetailsDV.EditableRULienholdersLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.PolicyLocationRUDetailsDV.EditableRULienholdersLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MiscRUType extends SelectElement {
    public MiscRUType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(OtherRiskType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public OtherRiskType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.OtherRiskType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(OtherRiskType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRUDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RemoveBuilding extends ClickableActionElement {
    public RemoveBuilding(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}