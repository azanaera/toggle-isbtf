package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NoteTemplateSearchDV.Language;
import pcftest.NoteTemplateSearchDV.Topic;
import pcftest.NoteTemplateSearchDV.Type;
import typekey.LanguageType;
import typekey.NoteTopicType;
import typekey.NoteType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NoteTemplateSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "fbe13c6ce015c789efebe13f0e72077f";
  
  public NoteTemplateSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getKeywords() {
    return getOrCreateProperty("Keywords", "Keywords", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Language getLanguage() {
    return getOrCreateProperty("Language", "Language", null, pcftest.NoteTemplateSearchDV.Language.class);
  }
  
  public pcftest.NoteTemplateSearchDV.LossType getLossType() {
    return getOrCreateProperty("LossType", "LossType", null, pcftest.NoteTemplateSearchDV.LossType.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public Topic getTopic() {
    return getOrCreateProperty("Topic", "Topic", null, pcftest.NoteTemplateSearchDV.Topic.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.NoteTemplateSearchDV.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Language extends SelectElement {
    public Language(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LanguageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LanguageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LanguageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LanguageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossType extends SelectElement {
    public LossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.LossType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.LossType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.LossType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Topic extends SelectElement {
    public Topic(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(NoteTopicType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public NoteTopicType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.NoteTopicType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(NoteTopicType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(NoteType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public NoteType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.NoteType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(NoteType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}