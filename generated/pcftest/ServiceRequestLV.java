package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
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
import pcftest.ServiceRequestLV.ActionOwnerHeader;
import pcftest.ServiceRequestLV.ExpectedCompletionDateHeader;
import pcftest.ServiceRequestLV.KindHeader;
import pcftest.ServiceRequestLV.NextActionHeader;
import pcftest.ServiceRequestLV.QuoteAmountHeader;
import pcftest.ServiceRequestLV.RelatedToHeader;
import pcftest.ServiceRequestLV.ServiceRequestAssigneeHeader;
import pcftest.ServiceRequestLV.ServiceRequestNumberHeader;
import pcftest.ServiceRequestLV.ServiceRequestReferenceNumberHeader;
import pcftest.ServiceRequestLV.ServicesHeader;
import pcftest.ServiceRequestLV.SpecialistHeader;
import pcftest.ServiceRequestLV._ListPaging;
import pcftest.ServiceRequestLV.entry;
import pcftest.ServiceRequestLV.entry.ActionRequired;
import pcftest.ServiceRequestLV.entry.NextActionLink;
import pcftest.ServiceRequestLV.entry.ServiceRequestAssignee;
import pcftest.ServiceRequestLV.entry.ServiceRequestAssignee.ServiceRequestAssigneeUserSearchMenuItem;
import pcftest.ServiceRequestLV.entry.ServiceRequestAssignee.ServiceRequestAssigneeUserSelectMenuItem;
import pcftest.ServiceRequestLV.entry.ServiceRequestNumber;
import pcftest.ServiceRequestLV.entry.Specialist;
import pcftest.ServiceRequestLV.entry.Status;
import pcftest.ServiceRequestLV.entry._Select;
import pcftest.ServiceRequestLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestLV extends PCFElement {
  public final static String CHECKSUM = "12dedfe25b41121a39b34c88ef2631b9";
  
  public ServiceRequestLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActionOwnerHeader getActionOwnerHeader() {
    return getOrCreateProperty("ActionOwnerHeader", "ActionOwnerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.ActionOwnerHeader.class);
  }
  
  public ExpectedCompletionDateHeader getExpectedCompletionDateHeader() {
    return getOrCreateProperty("ExpectedCompletionDateHeader", "ExpectedCompletionDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.ExpectedCompletionDateHeader.class);
  }
  
  public KindHeader getKindHeader() {
    return getOrCreateProperty("KindHeader", "KindHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.KindHeader.class);
  }
  
  public NextActionHeader getNextActionHeader() {
    return getOrCreateProperty("NextActionHeader", "NextActionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.NextActionHeader.class);
  }
  
  public QuoteAmountHeader getQuoteAmountHeader() {
    return getOrCreateProperty("QuoteAmountHeader", "QuoteAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.QuoteAmountHeader.class);
  }
  
  public RelatedToHeader getRelatedToHeader() {
    return getOrCreateProperty("RelatedToHeader", "RelatedToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.RelatedToHeader.class);
  }
  
  public ServiceRequestAssigneeHeader getServiceRequestAssigneeHeader() {
    return getOrCreateProperty("ServiceRequestAssigneeHeader", "ServiceRequestAssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.ServiceRequestAssigneeHeader.class);
  }
  
  public ServiceRequestNumberHeader getServiceRequestNumberHeader() {
    return getOrCreateProperty("ServiceRequestNumberHeader", "ServiceRequestNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.ServiceRequestNumberHeader.class);
  }
  
  public ServiceRequestReferenceNumberHeader getServiceRequestReferenceNumberHeader() {
    return getOrCreateProperty("ServiceRequestReferenceNumberHeader", "ServiceRequestReferenceNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.ServiceRequestReferenceNumberHeader.class);
  }
  
  public ServicesHeader getServicesHeader() {
    return getOrCreateProperty("ServicesHeader", "ServicesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.ServicesHeader.class);
  }
  
  public SpecialistHeader getSpecialistHeader() {
    return getOrCreateProperty("SpecialistHeader", "SpecialistHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestLV.SpecialistHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ServiceRequestLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ServiceRequestLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionOwnerHeader extends ValueElement {
    public ActionOwnerHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpectedCompletionDateHeader extends ValueElement {
    public ExpectedCompletionDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class KindHeader extends ValueElement {
    public KindHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NextActionHeader extends ValueElement {
    public NextActionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuoteAmountHeader extends ValueElement {
    public QuoteAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedToHeader extends ValueElement {
    public RelatedToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestAssigneeHeader extends ValueElement {
    public ServiceRequestAssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestNumberHeader extends ValueElement {
    public ServiceRequestNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestReferenceNumberHeader extends ValueElement {
    public ServiceRequestReferenceNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServicesHeader extends ValueElement {
    public ServicesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialistHeader extends ValueElement {
    public SpecialistHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getActionOwner() {
      return getOrCreateProperty("ActionOwner", "ActionOwner", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ActionRequired getActionRequired() {
      return getOrCreateProperty("ActionRequired", "ActionRequired", null, pcftest.ServiceRequestLV.entry.ActionRequired.class);
    }
    
    public DateElement getExpectedCompletionDate() {
      return getOrCreateProperty("ExpectedCompletionDate", "ExpectedCompletionDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getKind() {
      return getOrCreateProperty("Kind", "Kind", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public NextActionLink getNextActionLink() {
      return getOrCreateProperty("NextActionLink", "NextActionLink", null, pcftest.ServiceRequestLV.entry.NextActionLink.class);
    }
    
    public ValueElement getQuoteAmount() {
      return getOrCreateProperty("QuoteAmount", "QuoteAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRelatedTo() {
      return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ServiceRequestAssignee getServiceRequestAssignee() {
      return getOrCreateProperty("ServiceRequestAssignee", "ServiceRequestAssignee", null, pcftest.ServiceRequestLV.entry.ServiceRequestAssignee.class);
    }
    
    public ServiceRequestNumber getServiceRequestNumber() {
      return getOrCreateProperty("ServiceRequestNumber", "ServiceRequestNumber", null, pcftest.ServiceRequestLV.entry.ServiceRequestNumber.class);
    }
    
    public ValueElement getServiceRequestReferenceNumber() {
      return getOrCreateProperty("ServiceRequestReferenceNumber", "ServiceRequestReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getServices() {
      return getOrCreateProperty("Services", "Services", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Specialist getSpecialist() {
      return getOrCreateProperty("Specialist", "Specialist", null, pcftest.ServiceRequestLV.entry.Specialist.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.ServiceRequestLV.entry.Status.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ServiceRequestLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ServiceRequestLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActionRequired extends ClickableActionElement {
      public ActionRequired(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NextActionLink extends ClickableActionElement {
      public NextActionLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServiceRequestAssignee extends SelectElement {
      public ServiceRequestAssignee(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ServiceRequestAssigneeUserSearchMenuItem getServiceRequestAssigneeUserSearchMenuItem() {
        return getOrCreateProperty("ServiceRequestAssigneeUserSearchMenuItem", "ServiceRequestAssigneeUserSearchMenuItem", null, pcftest.ServiceRequestLV.entry.ServiceRequestAssignee.ServiceRequestAssigneeUserSearchMenuItem.class);
      }
      
      public ServiceRequestAssigneeUserSelectMenuItem getServiceRequestAssigneeUserSelectMenuItem() {
        return getOrCreateProperty("ServiceRequestAssigneeUserSelectMenuItem", "ServiceRequestAssigneeUserSelectMenuItem", null, pcftest.ServiceRequestLV.entry.ServiceRequestAssignee.ServiceRequestAssigneeUserSelectMenuItem.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServiceRequestAssigneeUserSearchMenuItem extends ClickableActionElement {
        public ServiceRequestAssigneeUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UserSearchPopup click() {
          return clickThis(pcftest.UserSearchPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServiceRequestAssigneeUserSelectMenuItem extends ClickableActionElement {
        public ServiceRequestAssigneeUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UserSelectPopup click() {
          return clickThis(pcftest.UserSelectPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServiceRequestNumber extends ValueElement {
      public ServiceRequestNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimServiceRequests click() {
        return clickThis(pcftest.ClaimServiceRequests.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Specialist extends ValueElement {
      public Specialist(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends ClickableActionElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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