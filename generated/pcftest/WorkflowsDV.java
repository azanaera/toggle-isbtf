package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkflowsDV.Handler;
import pcftest.WorkflowsDV.State;
import typekey.WorkflowHandler;
import typekey.WorkflowState;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workflow/WorkflowsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowsDV extends DetailViewElement {
  public final static String CHECKSUM = "2eafac44e0158eebe79682551ee03d1a";
  
  public WorkflowsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getCurrentStep() {
    return getOrCreateProperty("CurrentStep", "CurrentStep", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Handler getHandler() {
    return getOrCreateProperty("Handler", "Handler", null, pcftest.WorkflowsDV.Handler.class);
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
    return getOrCreateProperty("State", "State", null, pcftest.WorkflowsDV.State.class);
  }
  
  public SelectElement getType() {
    return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public DateElement getUpdateDateFrom() {
    return getOrCreateProperty("UpdateDateFrom", "UpdateDateFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getUpdateDateTo() {
    return getOrCreateProperty("UpdateDateTo", "UpdateDateTo", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public SelectElement getVersion() {
    return getOrCreateProperty("Version", "Version", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Handler extends SelectElement {
    public Handler(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(WorkflowHandler arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public WorkflowHandler getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WorkflowHandler.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(WorkflowHandler arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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