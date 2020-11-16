package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssignmentPopupDV.AssignmentPopupScreen_ButtonButton;
import pcftest.AssignmentPopupDV.FromList_Choice;
import pcftest.AssignmentPopupDV.FromProximitySearch_Choice;
import pcftest.AssignmentPopupDV.FromSearch_Choice;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentPopupDV extends DetailViewElement {
  public final static String CHECKSUM = "1ee3693e62879659b0ce0bdf9de7bfb2";
  
  public AssignmentPopupDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignmentPopupScreen_ButtonButton getAssignmentPopupScreen_ButtonButton() {
    return getOrCreateProperty("AssignmentPopupScreen_ButtonButton", "AssignmentPopupScreen_ButtonButton", null, pcftest.AssignmentPopupDV.AssignmentPopupScreen_ButtonButton.class);
  }
  
  public FromList_Choice getFromList_Choice() {
    return getOrCreateProperty("FromList_Choice", "FromList_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.AssignmentPopupDV.FromList_Choice.class);
  }
  
  public FromProximitySearch_Choice getFromProximitySearch_Choice() {
    return getOrCreateProperty("FromProximitySearch_Choice", "FromProximitySearch_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.AssignmentPopupDV.FromProximitySearch_Choice.class);
  }
  
  public FromSearch_Choice getFromSearch_Choice() {
    return getOrCreateProperty("FromSearch_Choice", "FromSearch_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.AssignmentPopupDV.FromSearch_Choice.class);
  }
  
  public SelectElement getSelectFromList() {
    return getOrCreateProperty("SelectFromList", "SelectFromList", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getSelectFromProximitySearch() {
    return getOrCreateProperty("SelectFromProximitySearch", "SelectFromProximitySearch", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSelectFromSearch() {
    return getOrCreateProperty("SelectFromSearch", "SelectFromSearch", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentPopupScreen_ButtonButton extends ValueElement {
    public AssignmentPopupScreen_ButtonButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FromList_Choice extends RadioButtonValueElement {
    public FromList_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FromProximitySearch_Choice extends RadioButtonValueElement {
    public FromProximitySearch_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FromSearch_Choice extends RadioButtonValueElement {
    public FromSearch_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}