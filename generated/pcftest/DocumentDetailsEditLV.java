package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentDetailsEditLV.AuthorHeader;
import pcftest.DocumentDetailsEditLV.DescriptionHeader;
import pcftest.DocumentDetailsEditLV.DocTypeHeader;
import pcftest.DocumentDetailsEditLV.InBoundHeader;
import pcftest.DocumentDetailsEditLV.LanguageHeader;
import pcftest.DocumentDetailsEditLV.NameHeader;
import pcftest.DocumentDetailsEditLV.ReceivedDate_ExtHeader;
import pcftest.DocumentDetailsEditLV.RecipientHeader;
import pcftest.DocumentDetailsEditLV.RelatedToHeader;
import pcftest.DocumentDetailsEditLV.SectionHeader;
import pcftest.DocumentDetailsEditLV.SecurityTypeHeader;
import pcftest.DocumentDetailsEditLV.StatusHeader;
import pcftest.DocumentDetailsEditLV.Type_ExtHeader;
import pcftest.DocumentDetailsEditLV.entry;
import pcftest.DocumentDetailsEditLV.entry.Language;
import pcftest.DocumentDetailsEditLV.entry.Section;
import pcftest.DocumentDetailsEditLV.entry.SecurityType;
import pcftest.DocumentDetailsEditLV.entry.Status;
import pcftest.DocumentDetailsEditLV.entry._Select;
import pcftest.DocumentDetailsEditLV.entry._ViewDetail;
import typekey.DocumentSection;
import typekey.DocumentSecurityType;
import typekey.DocumentStatusType;
import typekey.LanguageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsEditLV extends PCFElement {
  public final static String CHECKSUM = "326e14f6062b5c1924c8808fd3b0ee3a";
  
  public DocumentDetailsEditLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AuthorHeader getAuthorHeader() {
    return getOrCreateProperty("AuthorHeader", "AuthorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.AuthorHeader.class);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.DescriptionHeader.class);
  }
  
  public DocTypeHeader getDocTypeHeader() {
    return getOrCreateProperty("DocTypeHeader", "DocTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.DocTypeHeader.class);
  }
  
  public ValueElement getIconHeader() {
    return getOrCreateProperty("IconHeader", "IconHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public InBoundHeader getInBoundHeader() {
    return getOrCreateProperty("InBoundHeader", "InBoundHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.InBoundHeader.class);
  }
  
  public LanguageHeader getLanguageHeader() {
    return getOrCreateProperty("LanguageHeader", "LanguageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.LanguageHeader.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.NameHeader.class);
  }
  
  public ReceivedDate_ExtHeader getReceivedDate_ExtHeader() {
    return getOrCreateProperty("ReceivedDate_ExtHeader", "ReceivedDate_ExtHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.ReceivedDate_ExtHeader.class);
  }
  
  public RecipientHeader getRecipientHeader() {
    return getOrCreateProperty("RecipientHeader", "RecipientHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.RecipientHeader.class);
  }
  
  public RelatedToHeader getRelatedToHeader() {
    return getOrCreateProperty("RelatedToHeader", "RelatedToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.RelatedToHeader.class);
  }
  
  public SectionHeader getSectionHeader() {
    return getOrCreateProperty("SectionHeader", "SectionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.SectionHeader.class);
  }
  
  public SecurityTypeHeader getSecurityTypeHeader() {
    return getOrCreateProperty("SecurityTypeHeader", "SecurityTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.SecurityTypeHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.StatusHeader.class);
  }
  
  public Type_ExtHeader getType_ExtHeader() {
    return getOrCreateProperty("Type_ExtHeader", "Type_ExtHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditLV.Type_ExtHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DocumentDetailsEditLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorHeader extends ValueElement {
    public AuthorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocTypeHeader extends ValueElement {
    public DocTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InBoundHeader extends ValueElement {
    public InBoundHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LanguageHeader extends ValueElement {
    public LanguageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReceivedDate_ExtHeader extends ValueElement {
    public ReceivedDate_ExtHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecipientHeader extends ValueElement {
    public RecipientHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedToHeader extends ValueElement {
    public RelatedToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SectionHeader extends ValueElement {
    public SectionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityTypeHeader extends ValueElement {
    public SecurityTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type_ExtHeader extends ValueElement {
    public Type_ExtHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAuthor() {
      return getOrCreateProperty("Author", "Author", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getDocType() {
      return getOrCreateProperty("DocType", "DocType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public BooleanValueElement getIcon() {
      return getOrCreateProperty("Icon", "Icon", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getInBound() {
      return getOrCreateProperty("InBound", "InBound", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public Language getLanguage() {
      return getOrCreateProperty("Language", "Language", null, pcftest.DocumentDetailsEditLV.entry.Language.class);
    }
    
    public ValueElement getName() {
      return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getReceivedDate_Ext() {
      return getOrCreateProperty("ReceivedDate_Ext", "ReceivedDate_Ext", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getRecipient() {
      return getOrCreateProperty("Recipient", "Recipient", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getRelatedTo() {
      return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public Section getSection() {
      return getOrCreateProperty("Section", "Section", null, pcftest.DocumentDetailsEditLV.entry.Section.class);
    }
    
    public SecurityType getSecurityType() {
      return getOrCreateProperty("SecurityType", "SecurityType", null, pcftest.DocumentDetailsEditLV.entry.SecurityType.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.DocumentDetailsEditLV.entry.Status.class);
    }
    
    public SelectElement getType_Ext() {
      return getOrCreateProperty("Type_Ext", "Type_Ext", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.DocumentDetailsEditLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DocumentDetailsEditLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SecurityType extends SelectElement {
      public SecurityType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(DocumentSecurityType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public DocumentSecurityType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DocumentSecurityType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(DocumentSecurityType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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