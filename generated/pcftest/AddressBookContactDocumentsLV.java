package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.AddressBookContactDocumentsLV.ActionsHeader;
import pcftest.AddressBookContactDocumentsLV.AuthorHeader;
import pcftest.AddressBookContactDocumentsLV.DateModifiedHeader;
import pcftest.AddressBookContactDocumentsLV.HiddenDocumentHeader;
import pcftest.AddressBookContactDocumentsLV.NameHeader;
import pcftest.AddressBookContactDocumentsLV.StatusHeader;
import pcftest.AddressBookContactDocumentsLV.TypeHeader;
import pcftest.AddressBookContactDocumentsLV._ListPaging;
import pcftest.AddressBookContactDocumentsLV.entry;
import pcftest.AddressBookContactDocumentsLV.entry.DownloadLink;
import pcftest.AddressBookContactDocumentsLV.entry.Hidden;
import pcftest.AddressBookContactDocumentsLV.entry.NameLink;
import pcftest.AddressBookContactDocumentsLV.entry.Status;
import pcftest.AddressBookContactDocumentsLV.entry.Type;
import pcftest.AddressBookContactDocumentsLV.entry.ViewPropertiesLink;
import pcftest.AddressBookContactDocumentsLV.entry._Select;
import pcftest.AddressBookContactDocumentsLV.entry._ViewDetail;
import typekey.DocumentStatusType;
import typekey.DocumentType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactDocumentsLV extends PCFElement {
  public final static String CHECKSUM = "ce3a66556d5c584c0ab4aaf76960f719";
  
  public AddressBookContactDocumentsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActionsHeader getActionsHeader() {
    return getOrCreateProperty("ActionsHeader", "ActionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactDocumentsLV.ActionsHeader.class);
  }
  
  public AuthorHeader getAuthorHeader() {
    return getOrCreateProperty("AuthorHeader", "AuthorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactDocumentsLV.AuthorHeader.class);
  }
  
  public DateModifiedHeader getDateModifiedHeader() {
    return getOrCreateProperty("DateModifiedHeader", "DateModifiedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactDocumentsLV.DateModifiedHeader.class);
  }
  
  public HiddenDocumentHeader getHiddenDocumentHeader() {
    return getOrCreateProperty("HiddenDocumentHeader", "HiddenDocumentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactDocumentsLV.HiddenDocumentHeader.class);
  }
  
  public ValueElement getIconHeader() {
    return getOrCreateProperty("IconHeader", "IconHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactDocumentsLV.NameHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactDocumentsLV.StatusHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookContactDocumentsLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AddressBookContactDocumentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AddressBookContactDocumentsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionsHeader extends ValueElement {
    public ActionsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorHeader extends ValueElement {
    public AuthorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateModifiedHeader extends ValueElement {
    public DateModifiedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HiddenDocumentHeader extends ValueElement {
    public HiddenDocumentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAuthor() {
      return getOrCreateProperty("Author", "Author", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getDateModified() {
      return getOrCreateProperty("DateModified", "DateModified", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DownloadLink getDownloadLink() {
      return getOrCreateProperty("DownloadLink", "DownloadLink", null, pcftest.AddressBookContactDocumentsLV.entry.DownloadLink.class);
    }
    
    public Hidden getHidden() {
      return getOrCreateProperty("Hidden", "Hidden", null, pcftest.AddressBookContactDocumentsLV.entry.Hidden.class);
    }
    
    public BooleanValueElement getIcon() {
      return getOrCreateProperty("Icon", "Icon", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public NameLink getNameLink() {
      return getOrCreateProperty("NameLink", "NameLink", null, pcftest.AddressBookContactDocumentsLV.entry.NameLink.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.AddressBookContactDocumentsLV.entry.Status.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.AddressBookContactDocumentsLV.entry.Type.class);
    }
    
    public ViewPropertiesLink getViewPropertiesLink() {
      return getOrCreateProperty("ViewPropertiesLink", "ViewPropertiesLink", null, pcftest.AddressBookContactDocumentsLV.entry.ViewPropertiesLink.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AddressBookContactDocumentsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AddressBookContactDocumentsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DownloadLink extends ClickableActionElement {
      public DownloadLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Hidden extends ClickableActionElement {
      public Hidden(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameLink extends ClickableActionElement {
      public NameLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewPropertiesLink extends ClickableActionElement {
      public ViewPropertiesLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ContactDocumentDetailsPopup click() {
        return clickThis(pcftest.ContactDocumentDetailsPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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