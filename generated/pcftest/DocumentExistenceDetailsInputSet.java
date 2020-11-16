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
import pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV;
import pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV.ServiceRequestDisplayNameHeader;
import pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV._ListPaging;
import pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV.entry;
import pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV.entry._Select;
import pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV.entry._ViewDetail;
import pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV_tb;
import pcftest.DocumentExistenceDetailsInputSet.Section;
import pcftest.DocumentExistenceDetailsInputSet.SecurityType;
import pcftest.DocumentExistenceDetailsInputSet.Status;
import pcftest.DocumentExistenceDetailsInputSet.Type;
import typekey.DocumentSection;
import typekey.DocumentSecurityType;
import typekey.DocumentStatusType;
import typekey.DocumentType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentExistenceDetailsInputSet extends PCFElement {
  public final static String CHECKSUM = "e7efeefe004b2379301632b476af091e";
  
  public DocumentExistenceDetailsInputSet(ISmokeTest helper, PCFElementId componentId)  {
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
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRecipient() {
    return getOrCreateProperty("Recipient", "Recipient", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RelatedServiceRequestsLV getRelatedServiceRequestsLV() {
    return getOrCreateProperty("RelatedServiceRequestsLV", "RelatedServiceRequestsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV.class);
  }
  
  public RelatedServiceRequestsLV_tb getRelatedServiceRequestsLV_tb() {
    return getOrCreateProperty("RelatedServiceRequestsLV_tb", "RelatedServiceRequestsLV_tb", null, pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV_tb.class);
  }
  
  public SelectElement getRelatedTo() {
    return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Section getSection() {
    return getOrCreateProperty("Section", "Section", null, pcftest.DocumentExistenceDetailsInputSet.Section.class);
  }
  
  public SecurityType getSecurityType() {
    return getOrCreateProperty("SecurityType", "SecurityType", null, pcftest.DocumentExistenceDetailsInputSet.SecurityType.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.DocumentExistenceDetailsInputSet.Status.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.DocumentExistenceDetailsInputSet.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedServiceRequestsLV extends PCFElement {
    public RelatedServiceRequestsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ServiceRequestDisplayNameHeader getServiceRequestDisplayNameHeader() {
      return getOrCreateProperty("ServiceRequestDisplayNameHeader", "ServiceRequestDisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV.ServiceRequestDisplayNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServiceRequestDisplayNameHeader extends ValueElement {
      public ServiceRequestDisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DocumentExistenceDetailsInputSet.RelatedServiceRequestsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedServiceRequestsLV_tb extends PCFElement {
    public RelatedServiceRequestsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/documents/DocumentExistenceDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}