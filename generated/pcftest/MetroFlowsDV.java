package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MetroFlowsDV.State;
import typekey.WorkflowState;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlowsDV extends DetailViewElement {
  public final static String CHECKSUM = "44db0ceaf14e1c7cb76b0ba65dd1edaa";
  
  public MetroFlowsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCurrentStep() {
    return getOrCreateProperty("CurrentStep", "CurrentStep", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public DateElement getStartDateFrom() {
    return getOrCreateProperty("StartDateFrom", "StartDateFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getStartDateTo() {
    return getOrCreateProperty("StartDateTo", "StartDateTo", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public State getState() {
    return getOrCreateProperty("State", "State", null, pcftest.MetroFlowsDV.State.class);
  }
  
  public DateElement getUpdateDateFrom() {
    return getOrCreateProperty("UpdateDateFrom", "UpdateDateFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getUpdateDateTo() {
    return getOrCreateProperty("UpdateDateTo", "UpdateDateTo", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class State extends SelectElement {
    public State(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(WorkflowState arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public WorkflowState getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WorkflowState.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(WorkflowState arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}