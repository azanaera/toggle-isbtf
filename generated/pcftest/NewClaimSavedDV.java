package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.NewClaimSavedDV.CreateNewClaim;
import pcftest.NewClaimSavedDV.CreatePayment;
import pcftest.NewClaimSavedDV.CreateReserve;
import pcftest.NewClaimSavedDV.GoToClaim;
import pcftest.NewClaimSavedDV.Header;
import pcftest.NewClaimSavedDV.KindHeader;
import pcftest.NewClaimSavedDV.RelatedToHeader;
import pcftest.NewClaimSavedDV.RequestedCompletionDateHeader;
import pcftest.NewClaimSavedDV.ServiceRequestNumberHeader;
import pcftest.NewClaimSavedDV.ServicesHeader;
import pcftest.NewClaimSavedDV.SpecialistHeader;
import pcftest.NewClaimSavedDV.YouCan;
import pcftest.NewClaimSavedDV._ListPaging;
import pcftest.NewClaimSavedDV.entry;
import pcftest.NewClaimSavedDV.entry.ServiceRequestNumber;
import pcftest.NewClaimSavedDV.entry._Select;
import pcftest.NewClaimSavedDV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimSavedDV extends DetailViewElement {
  public final static String CHECKSUM = "35e66caa064c11bfc81e1d082d41c801";
  
  public NewClaimSavedDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAssignedGroup() {
    return getOrCreateProperty("AssignedGroup", "AssignedGroup", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAssignedUser() {
    return getOrCreateProperty("AssignedUser", "AssignedUser", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CreateNewClaim getCreateNewClaim() {
    return getOrCreateProperty("CreateNewClaim", "CreateNewClaim", null, pcftest.NewClaimSavedDV.CreateNewClaim.class);
  }
  
  public CreatePayment getCreatePayment() {
    return getOrCreateProperty("CreatePayment", "CreatePayment", null, pcftest.NewClaimSavedDV.CreatePayment.class);
  }
  
  public CreateReserve getCreateReserve() {
    return getOrCreateProperty("CreateReserve", "CreateReserve", null, pcftest.NewClaimSavedDV.CreateReserve.class);
  }
  
  public GoToClaim getGoToClaim() {
    return getOrCreateProperty("GoToClaim", "GoToClaim", null, pcftest.NewClaimSavedDV.GoToClaim.class);
  }
  
  public Header getHeader() {
    return getOrCreateProperty("Header", "Header", null, pcftest.NewClaimSavedDV.Header.class);
  }
  
  public KindHeader getKindHeader() {
    return getOrCreateProperty("KindHeader", "KindHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSavedDV.KindHeader.class);
  }
  
  public ValueElement getPendingAssignment() {
    return getOrCreateProperty("PendingAssignment", "PendingAssignment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RelatedToHeader getRelatedToHeader() {
    return getOrCreateProperty("RelatedToHeader", "RelatedToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSavedDV.RelatedToHeader.class);
  }
  
  public RequestedCompletionDateHeader getRequestedCompletionDateHeader() {
    return getOrCreateProperty("RequestedCompletionDateHeader", "RequestedCompletionDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSavedDV.RequestedCompletionDateHeader.class);
  }
  
  public ServiceRequestNumberHeader getServiceRequestNumberHeader() {
    return getOrCreateProperty("ServiceRequestNumberHeader", "ServiceRequestNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSavedDV.ServiceRequestNumberHeader.class);
  }
  
  public ServicesHeader getServicesHeader() {
    return getOrCreateProperty("ServicesHeader", "ServicesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSavedDV.ServicesHeader.class);
  }
  
  public SpecialistHeader getSpecialistHeader() {
    return getOrCreateProperty("SpecialistHeader", "SpecialistHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSavedDV.SpecialistHeader.class);
  }
  
  public YouCan getYouCan() {
    return getOrCreateProperty("YouCan", "YouCan", null, pcftest.NewClaimSavedDV.YouCan.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewClaimSavedDV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewClaimSavedDV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateNewClaim extends ValueElement {
    public CreateNewClaim(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard click() {
      return clickThis(pcftest.FNOLWizard.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreatePayment extends ValueElement {
    public CreatePayment(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateReserve extends ValueElement {
    public CreateReserve(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewReserveSet click() {
      return clickThis(pcftest.NewReserveSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GoToClaim extends ValueElement {
    public GoToClaim(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Header extends ValueElement {
    public Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class KindHeader extends ValueElement {
    public KindHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedToHeader extends ValueElement {
    public RelatedToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RequestedCompletionDateHeader extends ValueElement {
    public RequestedCompletionDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestNumberHeader extends ValueElement {
    public ServiceRequestNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServicesHeader extends ValueElement {
    public ServicesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialistHeader extends ValueElement {
    public SpecialistHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class YouCan extends ValueElement {
    public YouCan(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getKind() {
      return getOrCreateProperty("Kind", "Kind", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getRelatedTo() {
      return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getRequestedCompletionDate() {
      return getOrCreateProperty("RequestedCompletionDate", "RequestedCompletionDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ServiceRequestNumber getServiceRequestNumber() {
      return getOrCreateProperty("ServiceRequestNumber", "ServiceRequestNumber", null, pcftest.NewClaimSavedDV.entry.ServiceRequestNumber.class);
    }
    
    public ValueElement getServices() {
      return getOrCreateProperty("Services", "Services", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSpecialist() {
      return getOrCreateProperty("Specialist", "Specialist", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NewClaimSavedDV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewClaimSavedDV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServiceRequestNumber extends ValueElement {
      public ServiceRequestNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimServiceRequests click() {
        return clickThis(pcftest.ClaimServiceRequests.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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