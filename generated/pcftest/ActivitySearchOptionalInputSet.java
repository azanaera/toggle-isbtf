package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivitySearchOptionalInputSet.DateSearch;
import pcftest.ActivitySearchOptionalInputSet.DateSearch.DateSearchDirectChoice_Choice;
import pcftest.ActivitySearchOptionalInputSet.DateSearch.DateSearchRangeChoice_Choice;
import pcftest.ActivitySearchOptionalInputSet.DateSearch.DateSearchRangeValue;
import pcftest.ActivitySearchOptionalInputSet.Status;
import pcftest.ActivitySearchOptionalInputSet.SubjectPatternChoiceRadioButton_Choice;
import pcftest.ActivitySearchOptionalInputSet.SubjectSubjectChoiceWidget_Choice;
import typekey.ActivityStatus;
import typekey.DateRangeChoiceType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/activities/ActivitySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivitySearchOptionalInputSet extends PCFElement {
  public final static String CHECKSUM = "80f23a5991f2a4bded625c87d5cd94fe";
  
  public ActivitySearchOptionalInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getCompletedLate() {
    return getOrCreateProperty("CompletedLate", "CompletedLate", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateSearch getDateSearch() {
    return getOrCreateProperty("DateSearch", "DateSearch", null, pcftest.ActivitySearchOptionalInputSet.DateSearch.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getOverdueNow() {
    return getOrCreateProperty("OverdueNow", "OverdueNow", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getPendingAssignment() {
    return getOrCreateProperty("PendingAssignment", "PendingAssignment", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public pcftest.ActivitySearchOptionalInputSet.Priority getPriority() {
    return getOrCreateProperty("Priority", "Priority", null, pcftest.ActivitySearchOptionalInputSet.Priority.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.ActivitySearchOptionalInputSet.Status.class);
  }
  
  public SubjectPatternChoiceRadioButton_Choice getSubjectPatternChoiceRadioButton_Choice() {
    return getOrCreateProperty("SubjectPatternChoiceRadioButton_Choice", "SubjectPatternChoiceRadioButton_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ActivitySearchOptionalInputSet.SubjectPatternChoiceRadioButton_Choice.class);
  }
  
  public SelectElement getSubjectPatternValueWidget() {
    return getOrCreateProperty("SubjectPatternValueWidget", "SubjectPatternValueWidget", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SubjectSubjectChoiceWidget_Choice getSubjectSubjectChoiceWidget_Choice() {
    return getOrCreateProperty("SubjectSubjectChoiceWidget_Choice", "SubjectSubjectChoiceWidget_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ActivitySearchOptionalInputSet.SubjectSubjectChoiceWidget_Choice.class);
  }
  
  public ValueElement getSubjectSubjectWidget() {
    return getOrCreateProperty("SubjectSubjectWidget", "SubjectSubjectWidget", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/activities/ActivitySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateSearch extends ValueElement {
    public DateSearch(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getDateSearchChosenOption() {
      return getOrCreateProperty("DateSearchChosenOption", "DateSearchChosenOption", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public DateSearchDirectChoice_Choice getDateSearchDirectChoice_Choice() {
      return getOrCreateProperty("DateSearchDirectChoice_Choice", "DateSearchDirectChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ActivitySearchOptionalInputSet.DateSearch.DateSearchDirectChoice_Choice.class);
    }
    
    public DateElement getDateSearchEndDate() {
      return getOrCreateProperty("DateSearchEndDate", "DateSearchEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateSearchRangeChoice_Choice getDateSearchRangeChoice_Choice() {
      return getOrCreateProperty("DateSearchRangeChoice_Choice", "DateSearchRangeChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ActivitySearchOptionalInputSet.DateSearch.DateSearchRangeChoice_Choice.class);
    }
    
    public DateSearchRangeValue getDateSearchRangeValue() {
      return getOrCreateProperty("DateSearchRangeValue", "DateSearchRangeValue", null, pcftest.ActivitySearchOptionalInputSet.DateSearch.DateSearchRangeValue.class);
    }
    
    public DateElement getDateSearchStartDate() {
      return getOrCreateProperty("DateSearchStartDate", "DateSearchStartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/activities/ActivitySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchDirectChoice_Choice extends RadioButtonValueElement {
      public DateSearchDirectChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/activities/ActivitySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchRangeChoice_Choice extends RadioButtonValueElement {
      public DateSearchRangeChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/activities/ActivitySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchRangeValue extends SelectElement {
      public DateSearchRangeValue(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(DateRangeChoiceType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public DateRangeChoiceType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DateRangeChoiceType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(DateRangeChoiceType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/activities/ActivitySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Priority extends SelectElement {
    public Priority(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Priority arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Priority getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Priority.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Priority arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/activities/ActivitySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ActivityStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ActivityStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ActivityStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ActivityStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ActivitySubjectSearchWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubjectPatternChoiceRadioButton_Choice extends RadioButtonValueElement {
    public SubjectPatternChoiceRadioButton_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ActivitySubjectSearchWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubjectSubjectChoiceWidget_Choice extends RadioButtonValueElement {
    public SubjectSubjectChoiceWidget_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}