package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentTemplateSearchDV.JurisdictionState;
import pcftest.DocumentTemplateSearchDV.Language;
import pcftest.DocumentTemplateSearchDV.LossType;
import pcftest.DocumentTemplateSearchDV.Section;
import pcftest.DocumentTemplateSearchDV.TemplateType;
import typekey.DocumentSection;
import typekey.DocumentType;
import typekey.Jurisdiction;
import typekey.LOBCode;
import typekey.LanguageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "7e65fc0f253769b7f89b74584f0961db";
  
  public DocumentTemplateSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getEffectiveDate() {
    return getOrCreateProperty("EffectiveDate", "EffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getIdentifier() {
    return getOrCreateProperty("Identifier", "Identifier", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public JurisdictionState getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.DocumentTemplateSearchDV.JurisdictionState.class);
  }
  
  public ValueElement getKeywords() {
    return getOrCreateProperty("Keywords", "Keywords", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Language getLanguage() {
    return getOrCreateProperty("Language", "Language", null, pcftest.DocumentTemplateSearchDV.Language.class);
  }
  
  public LossType getLossType() {
    return getOrCreateProperty("LossType", "LossType", null, pcftest.DocumentTemplateSearchDV.LossType.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public Section getSection() {
    return getOrCreateProperty("Section", "Section", null, pcftest.DocumentTemplateSearchDV.Section.class);
  }
  
  public TemplateType getTemplateType() {
    return getOrCreateProperty("TemplateType", "TemplateType", null, pcftest.DocumentTemplateSearchDV.TemplateType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionState extends SelectElement {
    public JurisdictionState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Jurisdiction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Jurisdiction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Jurisdiction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossType extends SelectElement {
    public LossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LOBCode arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LOBCode getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LOBCode arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Section extends SelectElement {
    public Section(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DocumentSection arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DocumentSection getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DocumentSection.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DocumentSection arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TemplateType extends SelectElement {
    public TemplateType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DocumentType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DocumentType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DocumentType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DocumentType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}