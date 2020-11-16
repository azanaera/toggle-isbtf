package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimDocumentSearchDV.Language;
import pcftest.ClaimDocumentSearchDV.Section;
import pcftest.ClaimDocumentSearchDV.Status;
import typekey.DocumentSection;
import typekey.DocumentStatusType;
import typekey.LanguageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documents/ClaimDocumentSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimDocumentSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "525f34f919ad38caefc31f87f8152b41";
  
  public ClaimDocumentSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAuthor() {
    return getOrCreateProperty("Author", "Author", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getIncludeObsoletes() {
    return getOrCreateProperty("IncludeObsoletes", "IncludeObsoletes", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Language getLanguage() {
    return getOrCreateProperty("Language", "Language", null, pcftest.ClaimDocumentSearchDV.Language.class);
  }
  
  public ValueElement getNameOrID() {
    return getOrCreateProperty("NameOrID", "NameOrID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getRelatedTo() {
    return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public Section getSection() {
    return getOrCreateProperty("Section", "Section", null, pcftest.ClaimDocumentSearchDV.Section.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.ClaimDocumentSearchDV.Status.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ClaimDocumentSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/documents/ClaimDocumentSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/documents/ClaimDocumentSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DocumentStatusType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DocumentStatusType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DocumentStatusType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DocumentStatusType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}