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
import pcftest.ActivityDocumentsLV.ActionsHeader;
import pcftest.ActivityDocumentsLV.AuthorHeader;
import pcftest.ActivityDocumentsLV.DateModifiedHeader;
import pcftest.ActivityDocumentsLV.NameHeader;
import pcftest.ActivityDocumentsLV.StatusHeader;
import pcftest.ActivityDocumentsLV.TypeHeader;
import pcftest.ActivityDocumentsLV._ListPaging;
import pcftest.ActivityDocumentsLV.entry;
import pcftest.ActivityDocumentsLV.entry.DocumentsLV_RemoveLink;
import pcftest.ActivityDocumentsLV.entry.DownloadLink;
import pcftest.ActivityDocumentsLV.entry.NameLink;
import pcftest.ActivityDocumentsLV.entry.Status;
import pcftest.ActivityDocumentsLV.entry.Type;
import pcftest.ActivityDocumentsLV.entry.UploadLink;
import pcftest.ActivityDocumentsLV.entry.ViewPropertiesLink;
import pcftest.ActivityDocumentsLV.entry._Select;
import pcftest.ActivityDocumentsLV.entry._ViewDetail;
import typekey.DocumentStatusType;
import typekey.DocumentType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDocumentsLV extends PCFElement {
  public final static String CHECKSUM = "98aa2aded510caa28f609b6246386e64";
  
  public ActivityDocumentsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActionsHeader getActionsHeader() {
    return getOrCreateProperty("ActionsHeader", "ActionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityDocumentsLV.ActionsHeader.class);
  }
  
  public AuthorHeader getAuthorHeader() {
    return getOrCreateProperty("AuthorHeader", "AuthorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityDocumentsLV.AuthorHeader.class);
  }
  
  public DateModifiedHeader getDateModifiedHeader() {
    return getOrCreateProperty("DateModifiedHeader", "DateModifiedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityDocumentsLV.DateModifiedHeader.class);
  }
  
  public ValueElement getIconHeader() {
    return getOrCreateProperty("IconHeader", "IconHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityDocumentsLV.NameHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityDocumentsLV.StatusHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ActivityDocumentsLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ActivityDocumentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ActivityDocumentsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionsHeader extends ValueElement {
    public ActionsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorHeader extends ValueElement {
    public AuthorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateModifiedHeader extends ValueElement {
    public DateModifiedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public DocumentsLV_RemoveLink getDocumentsLV_RemoveLink() {
      return getOrCreateProperty("DocumentsLV_RemoveLink", "DocumentsLV_RemoveLink", null, pcftest.ActivityDocumentsLV.entry.DocumentsLV_RemoveLink.class);
    }
    
    public DownloadLink getDownloadLink() {
      return getOrCreateProperty("DownloadLink", "DownloadLink", null, pcftest.ActivityDocumentsLV.entry.DownloadLink.class);
    }
    
    public BooleanValueElement getIcon() {
      return getOrCreateProperty("Icon", "Icon", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public NameLink getNameLink() {
      return getOrCreateProperty("NameLink", "NameLink", null, pcftest.ActivityDocumentsLV.entry.NameLink.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.ActivityDocumentsLV.entry.Status.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.ActivityDocumentsLV.entry.Type.class);
    }
    
    public UploadLink getUploadLink() {
      return getOrCreateProperty("UploadLink", "UploadLink", null, pcftest.ActivityDocumentsLV.entry.UploadLink.class);
    }
    
    public ViewPropertiesLink getViewPropertiesLink() {
      return getOrCreateProperty("ViewPropertiesLink", "ViewPropertiesLink", null, pcftest.ActivityDocumentsLV.entry.ViewPropertiesLink.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ActivityDocumentsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ActivityDocumentsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DocumentsLV_RemoveLink extends ClickableActionElement {
      public DocumentsLV_RemoveLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DownloadLink extends ClickableActionElement {
      public DownloadLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameLink extends ClickableActionElement {
      public NameLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UploadLink extends ClickableActionElement {
      public UploadLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UploadDocumentContentPopup click() {
        return clickThis(pcftest.UploadDocumentContentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewPropertiesLink extends ClickableActionElement {
      public ViewPropertiesLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DocumentDetailsPopup click() {
        return clickThis(pcftest.DocumentDetailsPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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