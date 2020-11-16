package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.EmailTemplateSearchResultLV.LanguageHeader;
import pcftest.EmailTemplateSearchResultLV.TemplateHeader;
import pcftest.EmailTemplateSearchResultLV.TopicHeader;
import pcftest.EmailTemplateSearchResultLV._ListPaging;
import pcftest.EmailTemplateSearchResultLV.entry;
import pcftest.EmailTemplateSearchResultLV.entry.Language;
import pcftest.EmailTemplateSearchResultLV.entry._Select;
import pcftest.EmailTemplateSearchResultLV.entry._ViewDetail;
import typekey.LanguageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EmailTemplateSearchResultLV extends PCFElement {
  public final static String CHECKSUM = "cd2db3a197c4beb66f6e6643dc2a28cf";
  
  public EmailTemplateSearchResultLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LanguageHeader getLanguageHeader() {
    return getOrCreateProperty("LanguageHeader", "LanguageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EmailTemplateSearchResultLV.LanguageHeader.class);
  }
  
  public TemplateHeader getTemplateHeader() {
    return getOrCreateProperty("TemplateHeader", "TemplateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EmailTemplateSearchResultLV.TemplateHeader.class);
  }
  
  public TopicHeader getTopicHeader() {
    return getOrCreateProperty("TopicHeader", "TopicHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EmailTemplateSearchResultLV.TopicHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EmailTemplateSearchResultLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EmailTemplateSearchResultLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LanguageHeader extends ValueElement {
    public LanguageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TemplateHeader extends ValueElement {
    public TemplateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TopicHeader extends ValueElement {
    public TopicHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Language getLanguage() {
      return getOrCreateProperty("Language", "Language", null, pcftest.EmailTemplateSearchResultLV.entry.Language.class);
    }
    
    public ValueElement getTemplate() {
      return getOrCreateProperty("Template", "Template", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTopic() {
      return getOrCreateProperty("Topic", "Topic", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EmailTemplateSearchResultLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EmailTemplateSearchResultLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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