package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.RowElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.QuestionSetLV.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/question/QuestionSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuestionSetLV extends PCFElement {
  public final static String CHECKSUM = "9ee08f5183b4a52f4eb3b6d7a42af4a7";
  
  public QuestionSetLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionSetLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/question/QuestionSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public QuestionRowSet_BooleanCheckbox getQuestionRowSet_BooleanCheckbox() {
      return getOrCreateProperty("QuestionRowSet_BooleanCheckbox", "QuestionRowSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionRowSet_BooleanCheckbox.class);
    }
    
    public QuestionRowSet_BooleanSelect getQuestionRowSet_BooleanSelect() {
      return getOrCreateProperty("QuestionRowSet_BooleanSelect", "QuestionRowSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionRowSet_BooleanSelect.class);
    }
    
    public QuestionRowSet_ChoiceRadio getQuestionRowSet_ChoiceRadio() {
      return getOrCreateProperty("QuestionRowSet_ChoiceRadio", "QuestionRowSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionRowSet_ChoiceRadio.class);
    }
    
    public QuestionRowSet_ChoiceSelect getQuestionRowSet_ChoiceSelect() {
      return getOrCreateProperty("QuestionRowSet_ChoiceSelect", "QuestionRowSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionRowSet_ChoiceSelect.class);
    }
    
    public QuestionRowSet_DateField getQuestionRowSet_DateField() {
      return getOrCreateProperty("QuestionRowSet_DateField", "QuestionRowSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionRowSet_DateField.class);
    }
    
    public QuestionRowSet_IntegerField getQuestionRowSet_IntegerField() {
      return getOrCreateProperty("QuestionRowSet_IntegerField", "QuestionRowSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionRowSet_IntegerField.class);
    }
    
    public QuestionRowSet_StringField getQuestionRowSet_StringField() {
      return getOrCreateProperty("QuestionRowSet_StringField", "QuestionRowSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionRowSet_StringField.class);
    }
    
    public QuestionRowSet_StringTextArea getQuestionRowSet_StringTextArea() {
      return getOrCreateProperty("QuestionRowSet_StringTextArea", "QuestionRowSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuestionRowSet_StringTextArea.class);
    }
    
    
  }
  
  
}