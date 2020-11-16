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
import pcftest.NoteTemplateSearchResultLV.LanguageHeader;
import pcftest.NoteTemplateSearchResultLV.LossTypeHeader;
import pcftest.NoteTemplateSearchResultLV.TemplateHeader;
import pcftest.NoteTemplateSearchResultLV.TopicHeader;
import pcftest.NoteTemplateSearchResultLV.TypeHeader;
import pcftest.NoteTemplateSearchResultLV._ListPaging;
import pcftest.NoteTemplateSearchResultLV.entry;
import pcftest.NoteTemplateSearchResultLV.entry.Language;
import pcftest.NoteTemplateSearchResultLV.entry.Topic;
import pcftest.NoteTemplateSearchResultLV.entry.Type;
import pcftest.NoteTemplateSearchResultLV.entry._Select;
import pcftest.NoteTemplateSearchResultLV.entry._ViewDetail;
import typekey.LanguageType;
import typekey.NoteTopicType;
import typekey.NoteType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NoteTemplateSearchResultLV extends PCFElement {
  public final static String CHECKSUM = "6553b2df807fbdd0990df352b8893e20";
  
  public NoteTemplateSearchResultLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LanguageHeader getLanguageHeader() {
    return getOrCreateProperty("LanguageHeader", "LanguageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NoteTemplateSearchResultLV.LanguageHeader.class);
  }
  
  public LossTypeHeader getLossTypeHeader() {
    return getOrCreateProperty("LossTypeHeader", "LossTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NoteTemplateSearchResultLV.LossTypeHeader.class);
  }
  
  public TemplateHeader getTemplateHeader() {
    return getOrCreateProperty("TemplateHeader", "TemplateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NoteTemplateSearchResultLV.TemplateHeader.class);
  }
  
  public TopicHeader getTopicHeader() {
    return getOrCreateProperty("TopicHeader", "TopicHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NoteTemplateSearchResultLV.TopicHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NoteTemplateSearchResultLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NoteTemplateSearchResultLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NoteTemplateSearchResultLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LanguageHeader extends ValueElement {
    public LanguageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossTypeHeader extends ValueElement {
    public LossTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TemplateHeader extends ValueElement {
    public TemplateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TopicHeader extends ValueElement {
    public TopicHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Language getLanguage() {
      return getOrCreateProperty("Language", "Language", null, pcftest.NoteTemplateSearchResultLV.entry.Language.class);
    }
    
    public ValueElement getLossType() {
      return getOrCreateProperty("LossType", "LossType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTemplate() {
      return getOrCreateProperty("Template", "Template", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Topic getTopic() {
      return getOrCreateProperty("Topic", "Topic", null, pcftest.NoteTemplateSearchResultLV.entry.Topic.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.NoteTemplateSearchResultLV.entry.Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NoteTemplateSearchResultLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NoteTemplateSearchResultLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/NoteTemplateSearchResultLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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