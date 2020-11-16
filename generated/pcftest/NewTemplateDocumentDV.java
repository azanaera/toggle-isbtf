package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewTemplateDocumentDV.Language;
import pcftest.NewTemplateDocumentDV.TemplatePicker;
import pcftest.NewTemplateDocumentDV.TemplatePicker.SelectTemplatePicker;
import typekey.LanguageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newdocument/NewTemplateDocumentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewTemplateDocumentDV extends DetailViewElement {
  public final static String CHECKSUM = "3ca5152fd00bf2f2f0278496807678db";
  
  public NewTemplateDocumentDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DocumentCreationInputSet getDocumentCreationInputSet() {
    return getOrCreateProperty("DocumentCreationInputSet", "DocumentCreationInputSet", null, pcftest.DocumentCreationInputSet.class);
  }
  
  public DocumentTemplateContextObjectIteratorInputSet_default getDocumentTemplateContextObjectIteratorInputSet_default() {
    return getOrCreateProperty("DocumentTemplateContextObjectIteratorInputSet_default", "DocumentTemplateContextObjectIteratorInputSet", null, pcftest.DocumentTemplateContextObjectIteratorInputSet_default.class);
  }
  
  public DocumentTemplateContextObjectIteratorInputSet_noticeofofferofmodoraltworkdwcad1013353pdf getDocumentTemplateContextObjectIteratorInputSet_noticeofofferofmodoraltworkdwcad1013353pdf() {
    return getOrCreateProperty("DocumentTemplateContextObjectIteratorInputSet_noticeofofferofmodoraltworkdwcad1013353pdf", "DocumentTemplateContextObjectIteratorInputSet", null, pcftest.DocumentTemplateContextObjectIteratorInputSet_noticeofofferofmodoraltworkdwcad1013353pdf.class);
  }
  
  public Language getLanguage() {
    return getOrCreateProperty("Language", "Language", null, pcftest.NewTemplateDocumentDV.Language.class);
  }
  
  public SelectElement getRelatedTo() {
    return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public TemplatePicker getTemplatePicker() {
    return getOrCreateProperty("TemplatePicker", "TemplatePicker", null, pcftest.NewTemplateDocumentDV.TemplatePicker.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewTemplateDocumentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newdocument/NewTemplateDocumentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TemplatePicker extends BasePickerValueElement {
    public TemplatePicker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectTemplatePicker getSelectTemplatePicker() {
      return getOrCreateProperty("SelectTemplatePicker", "SelectTemplatePicker", null, pcftest.NewTemplateDocumentDV.TemplatePicker.SelectTemplatePicker.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newdocument/NewTemplateDocumentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectTemplatePicker extends ClickableActionElement {
      public SelectTemplatePicker(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DocumentTemplateSearchPopup click() {
        return clickThis(pcftest.DocumentTemplateSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  
}