package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkStatusDV.Status;
import pcftest.WorkStatusDV.Status_InputSet;
import typekey.WorkCapacity;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/WorkStatusDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkStatusDV extends DetailViewElement {
  public final static String CHECKSUM = "53f182d6af8971270ae093a1bacf2496";
  
  public WorkStatusDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.WorkStatusDV.Status.class);
  }
  
  public ValueElement getStatusComments() {
    return getOrCreateProperty("StatusComments", "StatusComments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getStatusDate() {
    return getOrCreateProperty("StatusDate", "StatusDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getStatusEndDate() {
    return getOrCreateProperty("StatusEndDate", "StatusEndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Status_InputSet getStatus_InputSet() {
    return getOrCreateProperty("Status_InputSet", "Status_InputSet", null, pcftest.WorkStatusDV.Status_InputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/WorkStatusDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(WorkCapacity arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public WorkCapacity getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WorkCapacity.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(WorkCapacity arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/WorkStatusDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status_InputSet extends PCFElement {
    public Status_InputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDaysWorked() {
      return getOrCreateProperty("DaysWorked", "DaysWorked", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getHoursWorked() {
      return getOrCreateProperty("HoursWorked", "HoursWorked", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLastWorkedDate() {
      return getOrCreateProperty("LastWorkedDate", "LastWorkedDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getPaidFullForLastWorked() {
      return getOrCreateProperty("PaidFullForLastWorked", "PaidFullForLastWorked", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getWeeklyWage() {
      return getOrCreateProperty("WeeklyWage", "WeeklyWage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  
}