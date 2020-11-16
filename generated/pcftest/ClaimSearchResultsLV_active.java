package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSearchResultsLV_active.AssignedGroupHeader;
import pcftest.ClaimSearchResultsLV_active.AssigneeHeader;
import pcftest.ClaimSearchResultsLV_active.ClaimNumberHeader;
import pcftest.ClaimSearchResultsLV_active.ClaimantHeader;
import pcftest.ClaimSearchResultsLV_active.FlaggedHeader;
import pcftest.ClaimSearchResultsLV_active.FuturePaymentsHeader;
import pcftest.ClaimSearchResultsLV_active.InjuredWorkerHeader;
import pcftest.ClaimSearchResultsLV_active.InsuredHeader;
import pcftest.ClaimSearchResultsLV_active.LOBCodeHeader;
import pcftest.ClaimSearchResultsLV_active.LossDateHeader;
import pcftest.ClaimSearchResultsLV_active.NoticeDateHeader;
import pcftest.ClaimSearchResultsLV_active.PolicyIDHeader;
import pcftest.ClaimSearchResultsLV_active.RemainingReservesHeader;
import pcftest.ClaimSearchResultsLV_active.StateOfJurisdictionHeader;
import pcftest.ClaimSearchResultsLV_active.StatusHeader;
import pcftest.ClaimSearchResultsLV_active.TotalPaymentsHeader;
import pcftest.ClaimSearchResultsLV_active._ListPaging;
import pcftest.ClaimSearchResultsLV_active.entry;
import pcftest.ClaimSearchResultsLV_active.entry.ClaimNumber;
import pcftest.ClaimSearchResultsLV_active.entry.StateOfJurisdiction;
import pcftest.ClaimSearchResultsLV_active.entry.Status;
import pcftest.ClaimSearchResultsLV_active.entry._Select;
import pcftest.ClaimSearchResultsLV_active.entry._ViewDetail;
import typekey.ClaimState;
import typekey.Jurisdiction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchResultsLV_active extends ClaimSearchResultsLV {
  public final static String CHECKSUM = "2dbb0a51db823a66e86cf150eec9c33d";
  
  public ClaimSearchResultsLV_active(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignedGroupHeader getAssignedGroupHeader() {
    return getOrCreateProperty("AssignedGroupHeader", "AssignedGroupHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.AssignedGroupHeader.class);
  }
  
  public AssigneeHeader getAssigneeHeader() {
    return getOrCreateProperty("AssigneeHeader", "AssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.AssigneeHeader.class);
  }
  
  public ClaimNumberHeader getClaimNumberHeader() {
    return getOrCreateProperty("ClaimNumberHeader", "ClaimNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.ClaimNumberHeader.class);
  }
  
  public ClaimantHeader getClaimantHeader() {
    return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.ClaimantHeader.class);
  }
  
  public FlaggedHeader getFlaggedHeader() {
    return getOrCreateProperty("FlaggedHeader", "FlaggedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.FlaggedHeader.class);
  }
  
  public FuturePaymentsHeader getFuturePaymentsHeader() {
    return getOrCreateProperty("FuturePaymentsHeader", "FuturePaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.FuturePaymentsHeader.class);
  }
  
  public InjuredWorkerHeader getInjuredWorkerHeader() {
    return getOrCreateProperty("InjuredWorkerHeader", "InjuredWorkerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.InjuredWorkerHeader.class);
  }
  
  public InsuredHeader getInsuredHeader() {
    return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.InsuredHeader.class);
  }
  
  public LOBCodeHeader getLOBCodeHeader() {
    return getOrCreateProperty("LOBCodeHeader", "LOBCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.LOBCodeHeader.class);
  }
  
  public LossDateHeader getLossDateHeader() {
    return getOrCreateProperty("LossDateHeader", "LossDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.LossDateHeader.class);
  }
  
  public NoticeDateHeader getNoticeDateHeader() {
    return getOrCreateProperty("NoticeDateHeader", "NoticeDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.NoticeDateHeader.class);
  }
  
  public PolicyIDHeader getPolicyIDHeader() {
    return getOrCreateProperty("PolicyIDHeader", "PolicyIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.PolicyIDHeader.class);
  }
  
  public RemainingReservesHeader getRemainingReservesHeader() {
    return getOrCreateProperty("RemainingReservesHeader", "RemainingReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.RemainingReservesHeader.class);
  }
  
  public StateOfJurisdictionHeader getStateOfJurisdictionHeader() {
    return getOrCreateProperty("StateOfJurisdictionHeader", "StateOfJurisdictionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.StateOfJurisdictionHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.StatusHeader.class);
  }
  
  public TotalPaymentsHeader getTotalPaymentsHeader() {
    return getOrCreateProperty("TotalPaymentsHeader", "TotalPaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSearchResultsLV_active.TotalPaymentsHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSearchResultsLV_active.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSearchResultsLV_active._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedGroupHeader extends ValueElement {
    public AssignedGroupHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssigneeHeader extends ValueElement {
    public AssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNumberHeader extends ValueElement {
    public ClaimNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimantHeader extends ValueElement {
    public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FlaggedHeader extends ValueElement {
    public FlaggedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FuturePaymentsHeader extends ValueElement {
    public FuturePaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuredWorkerHeader extends ValueElement {
    public InjuredWorkerHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuredHeader extends ValueElement {
    public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LOBCodeHeader extends ValueElement {
    public LOBCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDateHeader extends ValueElement {
    public LossDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoticeDateHeader extends ValueElement {
    public NoticeDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyIDHeader extends ValueElement {
    public PolicyIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RemainingReservesHeader extends ValueElement {
    public RemainingReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateOfJurisdictionHeader extends ValueElement {
    public StateOfJurisdictionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalPaymentsHeader extends ValueElement {
    public TotalPaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAssignedGroup() {
      return getOrCreateProperty("AssignedGroup", "AssignedGroup", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getAssignee() {
      return getOrCreateProperty("Assignee", "Assignee", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ClaimNumber getClaimNumber() {
      return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, pcftest.ClaimSearchResultsLV_active.entry.ClaimNumber.class);
    }
    
    public ValueElement getClaimant() {
      return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getFlagged() {
      return getOrCreateProperty("Flagged", "Flagged", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getFuturePayments() {
      return getOrCreateProperty("FuturePayments", "FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInjuredWorker() {
      return getOrCreateProperty("InjuredWorker", "InjuredWorker", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInsured() {
      return getOrCreateProperty("Insured", "Insured", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.ClaimSearchResultsLV_active.entry.LOBCode getLOBCode() {
      return getOrCreateProperty("LOBCode", "LOBCode", null, pcftest.ClaimSearchResultsLV_active.entry.LOBCode.class);
    }
    
    public DateElement getLossDate() {
      return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getNoticeDate() {
      return getOrCreateProperty("NoticeDate", "NoticeDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getPolicyID() {
      return getOrCreateProperty("PolicyID", "PolicyID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRemainingReserves() {
      return getOrCreateProperty("RemainingReserves", "RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public StateOfJurisdiction getStateOfJurisdiction() {
      return getOrCreateProperty("StateOfJurisdiction", "StateOfJurisdiction", null, pcftest.ClaimSearchResultsLV_active.entry.StateOfJurisdiction.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.ClaimSearchResultsLV_active.entry.Status.class);
    }
    
    public ValueElement getTotalPayments() {
      return getOrCreateProperty("TotalPayments", "TotalPayments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSearchResultsLV_active.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSearchResultsLV_active.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimNumber extends ValueElement {
      public ClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LOBCode extends SelectElement {
      public LOBCode(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LOBCode arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LOBCode getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LOBCode arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StateOfJurisdiction extends SelectElement {
      public StateOfJurisdiction(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Jurisdiction arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Jurisdiction getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Jurisdiction arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends SelectElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ClaimState arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ClaimState getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimState.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ClaimState arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchResultsLV.active.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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