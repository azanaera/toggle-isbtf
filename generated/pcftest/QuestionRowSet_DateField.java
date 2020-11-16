package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.QuestionRowSet_DateField.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.DateField.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuestionRowSet_DateField extends QuestionRowSet {
  public final static String CHECKSUM = "ad93d49d1fcc90b28b376cb87a01bb2d";
  
  public QuestionRowSet_DateField(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionRowSet_DateField.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public pcftest.QuestionRowSet_DateField._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.QuestionRowSet_DateField._Select.class);
  }
  
  public pcftest.QuestionRowSet_DateField._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.QuestionRowSet_DateField._ViewDetail.class);
  }
  
  public DateElement getquestionDateAnswer() {
    return getOrCreateProperty("questionDateAnswer", "questionDateAnswer", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getquestionText() {
    return getOrCreateProperty("questionText", "questionText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.DateField.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.DateField.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.DateField.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.QuestionRowSet_DateField.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.QuestionRowSet_DateField.entry._Select.class);
    }
    
    public pcftest.QuestionRowSet_DateField.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.QuestionRowSet_DateField.entry._ViewDetail.class);
    }
    
    public ValueElement getsubQuestionText() {
      return getOrCreateProperty("subQuestionText", "subQuestionText", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.DateField.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/question/QuestionRowSet.DateField.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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