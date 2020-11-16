package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BusinessWeekDayDetailDV.BusinessWeekEndInput;
import pcftest.BusinessWeekDayDetailDV.Friday;
import pcftest.BusinessWeekDayDetailDV.Monday;
import pcftest.BusinessWeekDayDetailDV.Saturday;
import pcftest.BusinessWeekDayDetailDV.Sunday;
import pcftest.BusinessWeekDayDetailDV.Thursday;
import pcftest.BusinessWeekDayDetailDV.Tuesday;
import pcftest.BusinessWeekDayDetailDV.Wednesday;
import typekey.Weekdays;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessWeekDayDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "29193ad15ee5d31d713c80e441399126";
  
  public BusinessWeekDayDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getBusinessDayDemarcation() {
    return getOrCreateProperty("BusinessDayDemarcation", "BusinessDayDemarcation", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BusinessWeekEndInput getBusinessWeekEndInput() {
    return getOrCreateProperty("BusinessWeekEndInput", "BusinessWeekEndInput", null, pcftest.BusinessWeekDayDetailDV.BusinessWeekEndInput.class);
  }
  
  public Friday getFriday() {
    return getOrCreateProperty("Friday", "Friday", null, pcftest.BusinessWeekDayDetailDV.Friday.class);
  }
  
  public BooleanValueElement getFridayBusinessDay() {
    return getOrCreateProperty("FridayBusinessDay", "FridayBusinessDay", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getFridayBusinessEnd() {
    return getOrCreateProperty("FridayBusinessEnd", "FridayBusinessEnd", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getFridayBusinessStart() {
    return getOrCreateProperty("FridayBusinessStart", "FridayBusinessStart", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Monday getMonday() {
    return getOrCreateProperty("Monday", "Monday", null, pcftest.BusinessWeekDayDetailDV.Monday.class);
  }
  
  public BooleanValueElement getMondayBusinessDay() {
    return getOrCreateProperty("MondayBusinessDay", "MondayBusinessDay", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getMondayBusinessEnd() {
    return getOrCreateProperty("MondayBusinessEnd", "MondayBusinessEnd", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getMondayBusinessStart() {
    return getOrCreateProperty("MondayBusinessStart", "MondayBusinessStart", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Saturday getSaturday() {
    return getOrCreateProperty("Saturday", "Saturday", null, pcftest.BusinessWeekDayDetailDV.Saturday.class);
  }
  
  public BooleanValueElement getSaturdayBusinessDay() {
    return getOrCreateProperty("SaturdayBusinessDay", "SaturdayBusinessDay", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getSaturdayBusinessEnd() {
    return getOrCreateProperty("SaturdayBusinessEnd", "SaturdayBusinessEnd", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getSaturdayBusinessStart() {
    return getOrCreateProperty("SaturdayBusinessStart", "SaturdayBusinessStart", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Sunday getSunday() {
    return getOrCreateProperty("Sunday", "Sunday", null, pcftest.BusinessWeekDayDetailDV.Sunday.class);
  }
  
  public BooleanValueElement getSundayBusinessDay() {
    return getOrCreateProperty("SundayBusinessDay", "SundayBusinessDay", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getSundayBusinessEnd() {
    return getOrCreateProperty("SundayBusinessEnd", "SundayBusinessEnd", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getSundayBusinessStart() {
    return getOrCreateProperty("SundayBusinessStart", "SundayBusinessStart", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Thursday getThursday() {
    return getOrCreateProperty("Thursday", "Thursday", null, pcftest.BusinessWeekDayDetailDV.Thursday.class);
  }
  
  public BooleanValueElement getThursdayBusinessDay() {
    return getOrCreateProperty("ThursdayBusinessDay", "ThursdayBusinessDay", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getThursdayBusinessEnd() {
    return getOrCreateProperty("ThursdayBusinessEnd", "ThursdayBusinessEnd", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getThursdayBusinessStart() {
    return getOrCreateProperty("ThursdayBusinessStart", "ThursdayBusinessStart", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Tuesday getTuesday() {
    return getOrCreateProperty("Tuesday", "Tuesday", null, pcftest.BusinessWeekDayDetailDV.Tuesday.class);
  }
  
  public BooleanValueElement getTuesdayBusinessDay() {
    return getOrCreateProperty("TuesdayBusinessDay", "TuesdayBusinessDay", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getTuesdayBusinessEnd() {
    return getOrCreateProperty("TuesdayBusinessEnd", "TuesdayBusinessEnd", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getTuesdayBusinessStart() {
    return getOrCreateProperty("TuesdayBusinessStart", "TuesdayBusinessStart", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Wednesday getWednesday() {
    return getOrCreateProperty("Wednesday", "Wednesday", null, pcftest.BusinessWeekDayDetailDV.Wednesday.class);
  }
  
  public BooleanValueElement getWednesdayBusinessDay() {
    return getOrCreateProperty("WednesdayBusinessDay", "WednesdayBusinessDay", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getWednesdayBusinessEnd() {
    return getOrCreateProperty("WednesdayBusinessEnd", "WednesdayBusinessEnd", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getWednesdayBusinessStart() {
    return getOrCreateProperty("WednesdayBusinessStart", "WednesdayBusinessStart", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekEndInput extends SelectElement {
    public BusinessWeekEndInput(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Weekdays arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Weekdays getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Weekdays.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Weekdays arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Friday extends ValueElement {
    public Friday(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Monday extends ValueElement {
    public Monday(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Saturday extends ValueElement {
    public Saturday(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Sunday extends ValueElement {
    public Sunday(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Thursday extends ValueElement {
    public Thursday(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Tuesday extends ValueElement {
    public Tuesday(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Wednesday extends ValueElement {
    public Wednesday(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}