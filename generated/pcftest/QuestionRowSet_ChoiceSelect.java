package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.QuestionRowSet_ChoiceSelect.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.ChoiceSelect.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuestionRowSet_ChoiceSelect extends QuestionRowSet {
  public final static String CHECKSUM = "b7cc95f7d49758aed708d8eea768ea7e";
  
  public QuestionRowSet_ChoiceSelect(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionRowSet_ChoiceSelect.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public pcftest.QuestionRowSet_ChoiceSelect._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.QuestionRowSet_ChoiceSelect._Select.class);
  }
  
  public pcftest.QuestionRowSet_ChoiceSelect._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.QuestionRowSet_ChoiceSelect._ViewDetail.class);
  }
  
  public SelectElement getquestionChoiceAnswer() {
    return getOrCreateProperty("questionChoiceAnswer", "questionChoiceAnswer", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getquestionText() {
    return getOrCreateProperty("questionText", "questionText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.ChoiceSelect.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.ChoiceSelect.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.ChoiceSelect.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.QuestionRowSet_ChoiceSelect.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.QuestionRowSet_ChoiceSelect.entry._Select.class);
    }
    
    public pcftest.QuestionRowSet_ChoiceSelect.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.QuestionRowSet_ChoiceSelect.entry._ViewDetail.class);
    }
    
    public ValueElement getsubQuestionText() {
      return getOrCreateProperty("subQuestionText", "subQuestionText", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.ChoiceSelect.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.ChoiceSelect.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}