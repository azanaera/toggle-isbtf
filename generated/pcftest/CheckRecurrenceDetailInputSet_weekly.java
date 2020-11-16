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
import pcftest.CheckRecurrenceDetailInputSet_weekly.SubsequentChecks;
import pcftest.CheckRecurrenceDetailInputSet_weekly.SubsequentChecks.DayOfWeek;
import typekey.RecurrenceDay;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.weekly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckRecurrenceDetailInputSet_weekly extends CheckRecurrenceDetailInputSet {
  public final static String CHECKSUM = "fb8a35e11dcc8ab2a205419c01a60a5b";
  
  public CheckRecurrenceDetailInputSet_weekly(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckRecurrenceAdditionalInfoInputSet getCheckRecurrenceAdditionalInfoInputSet() {
    return getOrCreateProperty("CheckRecurrenceAdditionalInfoInputSet", "CheckRecurrenceAdditionalInfoInputSet", null, pcftest.CheckRecurrenceAdditionalInfoInputSet.class);
  }
  
  public DateElement getScheduledSendDate() {
    return getOrCreateProperty("ScheduledSendDate", "ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public SubsequentChecks getSubsequentChecks() {
    return getOrCreateProperty("SubsequentChecks", "SubsequentChecks", null, pcftest.CheckRecurrenceDetailInputSet_weekly.SubsequentChecks.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.weekly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubsequentChecks extends PCFElement {
    public SubsequentChecks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DayOfWeek getDayOfWeek() {
      return getOrCreateProperty("DayOfWeek", "DayOfWeek", null, pcftest.CheckRecurrenceDetailInputSet_weekly.SubsequentChecks.DayOfWeek.class);
    }
    
    public ValueElement getDaysInAdvance() {
      return getOrCreateProperty("DaysInAdvance", "DaysInAdvance", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEveryXWeek() {
      return getOrCreateProperty("EveryXWeek", "EveryXWeek", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getFrequency() {
      return getOrCreateProperty("Frequency", "Frequency", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public CheckboxValueElement getIssueCheckInAdvance() {
      return getOrCreateProperty("IssueCheckInAdvance", "IssueCheckInAdvance", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.weekly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    
  }
  
  
}