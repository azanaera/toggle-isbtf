package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CheckRecurrenceDetailInputSet_monthly.SubsequentChecks;
import pcftest.CheckRecurrenceDetailInputSet_monthly.SubsequentChecks.DayOfWeek;
import pcftest.CheckRecurrenceDetailInputSet_monthly.SubsequentChecks.WeekOfMonth;
import typekey.RecurrenceDay;
import typekey.RecurrenceWeek;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.monthly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckRecurrenceDetailInputSet_monthly extends CheckRecurrenceDetailInputSet {
  public final static String CHECKSUM = "1ff3bc97875d82b23f421f9f15561fc1";
  
  public CheckRecurrenceDetailInputSet_monthly(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckRecurrenceAdditionalInfoInputSet getCheckRecurrenceAdditionalInfoInputSet() {
    return getOrCreateProperty("CheckRecurrenceAdditionalInfoInputSet", "CheckRecurrenceAdditionalInfoInputSet", null, pcftest.CheckRecurrenceAdditionalInfoInputSet.class);
  }
  
  public DateElement getScheduledSendDate() {
    return getOrCreateProperty("ScheduledSendDate", "ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public SubsequentChecks getSubsequentChecks() {
    return getOrCreateProperty("SubsequentChecks", "SubsequentChecks", null, pcftest.CheckRecurrenceDetailInputSet_monthly.SubsequentChecks.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.monthly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubsequentChecks extends PCFElement {
    public SubsequentChecks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDayOfMonth() {
      return getOrCreateProperty("DayOfMonth", "DayOfMonth", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DayOfWeek getDayOfWeek() {
      return getOrCreateProperty("DayOfWeek", "DayOfWeek", null, pcftest.CheckRecurrenceDetailInputSet_monthly.SubsequentChecks.DayOfWeek.class);
    }
    
    public ValueElement getDaysInAdvance() {
      return getOrCreateProperty("DaysInAdvance", "DaysInAdvance", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEveryXMonth() {
      return getOrCreateProperty("EveryXMonth", "EveryXMonth", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getFrequency() {
      return getOrCreateProperty("Frequency", "Frequency", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public CheckboxValueElement getIssueCheckInAdvance() {
      return getOrCreateProperty("IssueCheckInAdvance", "IssueCheckInAdvance", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public SelectElement getTypeOfDueDate() {
      return getOrCreateProperty("TypeOfDueDate", "TypeOfDueDate", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public WeekOfMonth getWeekOfMonth() {
      return getOrCreateProperty("WeekOfMonth", "WeekOfMonth", null, pcftest.CheckRecurrenceDetailInputSet_monthly.SubsequentChecks.WeekOfMonth.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.monthly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DayOfWeek extends SelectElement {
      public DayOfWeek(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(RecurrenceDay arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public RecurrenceDay getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RecurrenceDay.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(RecurrenceDay arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.monthly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WeekOfMonth extends SelectElement {
      public WeekOfMonth(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(RecurrenceWeek arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public RecurrenceWeek getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RecurrenceWeek.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(RecurrenceWeek arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  
}