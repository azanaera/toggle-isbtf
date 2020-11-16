package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FailedAssignmentsLV_ServiceRequest.ExpectedCompletionDateHeader;
import pcftest.FailedAssignmentsLV_ServiceRequest.KindHeader;
import pcftest.FailedAssignmentsLV_ServiceRequest.QuoteAmountHeader;
import pcftest.FailedAssignmentsLV_ServiceRequest.ServiceRequestNumberHeader;
import pcftest.FailedAssignmentsLV_ServiceRequest.ServiceRequestReferenceNumberHeader;
import pcftest.FailedAssignmentsLV_ServiceRequest.ServicesHeader;
import pcftest.FailedAssignmentsLV_ServiceRequest.SpecialistHeader;
import pcftest.FailedAssignmentsLV_ServiceRequest._ListPaging;
import pcftest.FailedAssignmentsLV_ServiceRequest.entry;
import pcftest.FailedAssignmentsLV_ServiceRequest.entry.Specialist;
import pcftest.FailedAssignmentsLV_ServiceRequest.entry._Select;
import pcftest.FailedAssignmentsLV_ServiceRequest.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FailedAssignmentsLV_ServiceRequest extends FailedAssignmentsLV {
  public final static String CHECKSUM = "d59e7fc85e06f0427e930ef5317bbfd2";
  
  public FailedAssignmentsLV_ServiceRequest(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ExpectedCompletionDateHeader getExpectedCompletionDateHeader() {
    return getOrCreateProperty("ExpectedCompletionDateHeader", "ExpectedCompletionDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_ServiceRequest.ExpectedCompletionDateHeader.class);
  }
  
  public KindHeader getKindHeader() {
    return getOrCreateProperty("KindHeader", "KindHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_ServiceRequest.KindHeader.class);
  }
  
  public QuoteAmountHeader getQuoteAmountHeader() {
    return getOrCreateProperty("QuoteAmountHeader", "QuoteAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_ServiceRequest.QuoteAmountHeader.class);
  }
  
  public ServiceRequestNumberHeader getServiceRequestNumberHeader() {
    return getOrCreateProperty("ServiceRequestNumberHeader", "ServiceRequestNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_ServiceRequest.ServiceRequestNumberHeader.class);
  }
  
  public ServiceRequestReferenceNumberHeader getServiceRequestReferenceNumberHeader() {
    return getOrCreateProperty("ServiceRequestReferenceNumberHeader", "ServiceRequestReferenceNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_ServiceRequest.ServiceRequestReferenceNumberHeader.class);
  }
  
  public ServicesHeader getServicesHeader() {
    return getOrCreateProperty("ServicesHeader", "ServicesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_ServiceRequest.ServicesHeader.class);
  }
  
  public SpecialistHeader getSpecialistHeader() {
    return getOrCreateProperty("SpecialistHeader", "SpecialistHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_ServiceRequest.SpecialistHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FailedAssignmentsLV_ServiceRequest.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FailedAssignmentsLV_ServiceRequest._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpectedCompletionDateHeader extends ValueElement {
    public ExpectedCompletionDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class KindHeader extends ValueElement {
    public KindHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuoteAmountHeader extends ValueElement {
    public QuoteAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestNumberHeader extends ValueElement {
    public ServiceRequestNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestReferenceNumberHeader extends ValueElement {
    public ServiceRequestReferenceNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServicesHeader extends ValueElement {
    public ServicesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialistHeader extends ValueElement {
    public SpecialistHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getExpectedCompletionDate() {
      return getOrCreateProperty("ExpectedCompletionDate", "ExpectedCompletionDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getKind() {
      return getOrCreateProperty("Kind", "Kind", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getQuoteAmount() {
      return getOrCreateProperty("QuoteAmount", "QuoteAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getServiceRequestNumber() {
      return getOrCreateProperty("ServiceRequestNumber", "ServiceRequestNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getServiceRequestReferenceNumber() {
      return getOrCreateProperty("ServiceRequestReferenceNumber", "ServiceRequestReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getServices() {
      return getOrCreateProperty("Services", "Services", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Specialist getSpecialist() {
      return getOrCreateProperty("Specialist", "Specialist", null, pcftest.FailedAssignmentsLV_ServiceRequest.entry.Specialist.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.FailedAssignmentsLV_ServiceRequest.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FailedAssignmentsLV_ServiceRequest.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Specialist extends ValueElement {
      public Specialist(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.ServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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