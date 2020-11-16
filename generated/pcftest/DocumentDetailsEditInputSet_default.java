package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import pcftest.DocumentDetailsEditInputSet_default.NameLink;
import pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV;
import pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV.ServiceRequestDisplayNameHeader;
import pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV._ListPaging;
import pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV.entry;
import pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV.entry._Select;
import pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV.entry._ViewDetail;
import pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV_tb;
import pcftest.DocumentDetailsEditInputSet_default.Section;
import pcftest.DocumentDetailsEditInputSet_default.SecurityType;
import pcftest.DocumentDetailsEditInputSet_default.Status;
import typekey.DocumentSection;
import typekey.DocumentSecurityType;
import typekey.DocumentStatusType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsEditInputSet_default extends DocumentDetailsEditInputSet {
  public final static String CHECKSUM = "d6f23fafa4ec739f4ae414a7f2f1cc86";
  
  public DocumentDetailsEditInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAuthor() {
    return getOrCreateProperty("Author", "Author", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getInBound() {
    return getOrCreateProperty("InBound", "InBound", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public SelectElement getLanguage() {
    return getOrCreateProperty("Language", "Language", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getMimeType() {
    return getOrCreateProperty("MimeType", "MimeType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NameLink getNameLink() {
    return getOrCreateProperty("NameLink", "NameLink", null, pcftest.DocumentDetailsEditInputSet_default.NameLink.class);
  }
  
  public DateElement getReceivedDate_Ext() {
    return getOrCreateProperty("ReceivedDate_Ext", "ReceivedDate_Ext", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getRecipient() {
    return getOrCreateProperty("Recipient", "Recipient", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RelatedServiceRequestsLV getRelatedServiceRequestsLV() {
    return getOrCreateProperty("RelatedServiceRequestsLV", "RelatedServiceRequestsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV.class);
  }
  
  public RelatedServiceRequestsLV_tb getRelatedServiceRequestsLV_tb() {
    return getOrCreateProperty("RelatedServiceRequestsLV_tb", "RelatedServiceRequestsLV_tb", null, pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV_tb.class);
  }
  
  public SelectElement getRelatedTo() {
    return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Section getSection() {
    return getOrCreateProperty("Section", "Section", null, pcftest.DocumentDetailsEditInputSet_default.Section.class);
  }
  
  public SecurityType getSecurityType() {
    return getOrCreateProperty("SecurityType", "SecurityType", null, pcftest.DocumentDetailsEditInputSet_default.SecurityType.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.DocumentDetailsEditInputSet_default.Status.class);
  }
  
  public SelectElement getType_Ext() {
    return getOrCreateProperty("Type_Ext", "Type_Ext", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public CheckboxValueElement getallEnabled() {
    return getOrCreateProperty("allEnabled", "allEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getauthorEnabled() {
    return getOrCreateProperty("authorEnabled", "authorEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getdescriptionEnabled() {
    return getOrCreateProperty("descriptionEnabled", "descriptionEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getinboundEnabled() {
    return getOrCreateProperty("inboundEnabled", "inboundEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getlanguageEnabled() {
    return getOrCreateProperty("languageEnabled", "languageEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getmimeTypeEnabled() {
    return getOrCreateProperty("mimeTypeEnabled", "mimeTypeEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getnameEnabled() {
    return getOrCreateProperty("nameEnabled", "nameEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getrecipientEnabled() {
    return getOrCreateProperty("recipientEnabled", "recipientEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getrelatedToEnabled() {
    return getOrCreateProperty("relatedToEnabled", "relatedToEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getsectionEnabled() {
    return getOrCreateProperty("sectionEnabled", "sectionEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getsecurityTypeEnabled() {
    return getOrCreateProperty("securityTypeEnabled", "securityTypeEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getstatusEnabled() {
    return getOrCreateProperty("statusEnabled", "statusEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement gettypeEnabled() {
    return getOrCreateProperty("typeEnabled", "typeEnabled", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameLink extends ClickableActionElement {
    public NameLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedServiceRequestsLV extends PCFElement {
    public RelatedServiceRequestsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ServiceRequestDisplayNameHeader getServiceRequestDisplayNameHeader() {
      return getOrCreateProperty("ServiceRequestDisplayNameHeader", "ServiceRequestDisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV.ServiceRequestDisplayNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServiceRequestDisplayNameHeader extends ValueElement {
      public ServiceRequestDisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getServiceRequestDisplayName() {
        return getOrCreateProperty("ServiceRequestDisplayName", "ServiceRequestDisplayName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DocumentDetailsEditInputSet_default.RelatedServiceRequestsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedServiceRequestsLV_tb extends PCFElement {
    public RelatedServiceRequestsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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