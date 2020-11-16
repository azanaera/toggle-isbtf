package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentTemplateSearchResultLV.DateModifiedHeader;
import pcftest.DocumentTemplateSearchResultLV.EffectiveHeader;
import pcftest.DocumentTemplateSearchResultLV.ExpiresHeader;
import pcftest.DocumentTemplateSearchResultLV.IdentifierHeader;
import pcftest.DocumentTemplateSearchResultLV.JurisdictionStateHeader;
import pcftest.DocumentTemplateSearchResultLV.LanguageHeader;
import pcftest.DocumentTemplateSearchResultLV.LossTypeHeader;
import pcftest.DocumentTemplateSearchResultLV.SectionHeader;
import pcftest.DocumentTemplateSearchResultLV.TemplateHeader;
import pcftest.DocumentTemplateSearchResultLV.TypeHeader;
import pcftest.DocumentTemplateSearchResultLV._ListPaging;
import pcftest.DocumentTemplateSearchResultLV.entry;
import pcftest.DocumentTemplateSearchResultLV.entry.Language;
import pcftest.DocumentTemplateSearchResultLV.entry.Type;
import pcftest.DocumentTemplateSearchResultLV.entry._Select;
import pcftest.DocumentTemplateSearchResultLV.entry._ViewDetail;
import typekey.DocumentType;
import typekey.LanguageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateSearchResultLV extends PCFElement {
  public final static String CHECKSUM = "4e8e407fa1229122adc53f4b9be5f078";
  
  public DocumentTemplateSearchResultLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateModifiedHeader getDateModifiedHeader() {
    return getOrCreateProperty("DateModifiedHeader", "DateModifiedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentTemplateSearchResultLV.DateModifiedHeader.class);
  }
  
  public EffectiveHeader getEffectiveHeader() {
    return getOrCreateProperty("EffectiveHeader", "EffectiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentTemplateSearchResultLV.EffectiveHeader.class);
  }
  
  public ExpiresHeader getExpiresHeader() {
    return getOrCreateProperty("ExpiresHeader", "ExpiresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentTemplateSearchResultLV.ExpiresHeader.class);
  }
  
  public IdentifierHeader getIdentifierHeader() {
    return getOrCreateProperty("IdentifierHeader", "IdentifierHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentTemplateSearchResultLV.IdentifierHeader.class);
  }
  
  public JurisdictionStateHeader getJurisdictionStateHeader() {
    return getOrCreateProperty("JurisdictionStateHeader", "JurisdictionStateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentTemplateSearchResultLV.JurisdictionStateHeader.class);
  }
  
  public LanguageHeader getLanguageHeader() {
    return getOrCreateProperty("LanguageHeader", "LanguageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentTemplateSearchResultLV.LanguageHeader.class);
  }
  
  public LossTypeHeader getLossTypeHeader() {
    return getOrCreateProperty("LossTypeHeader", "LossTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentTemplateSearchResultLV.LossTypeHeader.class);
  }
  
  public SectionHeader getSectionHeader() {
    return getOrCreateProperty("SectionHeader", "SectionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentTemplateSearchResultLV.SectionHeader.class);
  }
  
  public TemplateHeader getTemplateHeader() {
    return getOrCreateProperty("TemplateHeader", "TemplateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentTemplateSearchResultLV.TemplateHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentTemplateSearchResultLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DocumentTemplateSearchResultLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DocumentTemplateSearchResultLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateModifiedHeader extends ValueElement {
    public DateModifiedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EffectiveHeader extends ValueElement {
    public EffectiveHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpiresHeader extends ValueElement {
    public ExpiresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IdentifierHeader extends ValueElement {
    public IdentifierHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionStateHeader extends ValueElement {
    public JurisdictionStateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LanguageHeader extends ValueElement {
    public LanguageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossTypeHeader extends ValueElement {
    public LossTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SectionHeader extends ValueElement {
    public SectionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TemplateHeader extends ValueElement {
    public TemplateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getDateModified() {
      return getOrCreateProperty("DateModified", "DateModified", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getEffective() {
      return getOrCreateProperty("Effective", "Effective", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getExpires() {
      return getOrCreateProperty("Expires", "Expires", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getIdentifier() {
      return getOrCreateProperty("Identifier", "Identifier", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getJurisdictionState() {
      return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Language getLanguage() {
      return getOrCreateProperty("Language", "Language", null, pcftest.DocumentTemplateSearchResultLV.entry.Language.class);
    }
    
    public ValueElement getLossType() {
      return getOrCreateProperty("LossType", "LossType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSection() {
      return getOrCreateProperty("Section", "Section", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTemplate() {
      return getOrCreateProperty("Template", "Template", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.DocumentTemplateSearchResultLV.entry.Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.DocumentTemplateSearchResultLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DocumentTemplateSearchResultLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Type extends SelectElement {
      public Type(ISmokeTest helper, PCFElementId componentId)  {
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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