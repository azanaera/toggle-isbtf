package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.TeamClaimsLV.AssigneeHeader;
import pcftest.TeamClaimsLV.ClaimNumberHeader;
import pcftest.TeamClaimsLV.ClaimantHeader;
import pcftest.TeamClaimsLV.FlaggedHeader;
import pcftest.TeamClaimsLV.InsuredHeader;
import pcftest.TeamClaimsLV.LossDateHeader;
import pcftest.TeamClaimsLV.PolicyIDHeader;
import pcftest.TeamClaimsLV.TotalIncurredNetHeader;
import pcftest.TeamClaimsLV.WorkloadWeightHeader;
import pcftest.TeamClaimsLV._ListPaging;
import pcftest.TeamClaimsLV.entry;
import pcftest.TeamClaimsLV.entry.ClaimNumber;
import pcftest.TeamClaimsLV.entry.Insured;
import pcftest.TeamClaimsLV.entry._Select;
import pcftest.TeamClaimsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamClaimsLV extends PCFElement {
  public final static String CHECKSUM = "8794ba445426a2dc9d12f256f489cbf8";
  
  public TeamClaimsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssigneeHeader getAssigneeHeader() {
    return getOrCreateProperty("AssigneeHeader", "AssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamClaimsLV.AssigneeHeader.class);
  }
  
  public ClaimNumberHeader getClaimNumberHeader() {
    return getOrCreateProperty("ClaimNumberHeader", "ClaimNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamClaimsLV.ClaimNumberHeader.class);
  }
  
  public ClaimantHeader getClaimantHeader() {
    return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamClaimsLV.ClaimantHeader.class);
  }
  
  public FlaggedHeader getFlaggedHeader() {
    return getOrCreateProperty("FlaggedHeader", "FlaggedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamClaimsLV.FlaggedHeader.class);
  }
  
  public InsuredHeader getInsuredHeader() {
    return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamClaimsLV.InsuredHeader.class);
  }
  
  public LossDateHeader getLossDateHeader() {
    return getOrCreateProperty("LossDateHeader", "LossDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamClaimsLV.LossDateHeader.class);
  }
  
  public PolicyIDHeader getPolicyIDHeader() {
    return getOrCreateProperty("PolicyIDHeader", "PolicyIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamClaimsLV.PolicyIDHeader.class);
  }
  
  public SelectElement getTeamClaimsFilter() {
    return getOrCreateProperty("TeamClaimsFilter", "TeamClaimsFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public TotalIncurredNetHeader getTotalIncurredNetHeader() {
    return getOrCreateProperty("TotalIncurredNetHeader", "TotalIncurredNetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamClaimsLV.TotalIncurredNetHeader.class);
  }
  
  public WorkloadWeightHeader getWorkloadWeightHeader() {
    return getOrCreateProperty("WorkloadWeightHeader", "WorkloadWeightHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamClaimsLV.WorkloadWeightHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.TeamClaimsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.TeamClaimsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssigneeHeader extends ValueElement {
    public AssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNumberHeader extends ValueElement {
    public ClaimNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimantHeader extends ValueElement {
    public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FlaggedHeader extends ValueElement {
    public FlaggedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuredHeader extends ValueElement {
    public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDateHeader extends ValueElement {
    public LossDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyIDHeader extends ValueElement {
    public PolicyIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalIncurredNetHeader extends ValueElement {
    public TotalIncurredNetHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkloadWeightHeader extends ValueElement {
    public WorkloadWeightHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAssignee() {
      return getOrCreateProperty("Assignee", "Assignee", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ClaimNumber getClaimNumber() {
      return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, pcftest.TeamClaimsLV.entry.ClaimNumber.class);
    }
    
    public ValueElement getClaimant() {
      return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getFlagged() {
      return getOrCreateProperty("Flagged", "Flagged", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public Insured getInsured() {
      return getOrCreateProperty("Insured", "Insured", null, pcftest.TeamClaimsLV.entry.Insured.class);
    }
    
    public DateElement getLossDate() {
      return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getPolicyID() {
      return getOrCreateProperty("PolicyID", "PolicyID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalIncurredNet() {
      return getOrCreateProperty("TotalIncurredNet", "TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getWorkloadWeight() {
      return getOrCreateProperty("WorkloadWeight", "WorkloadWeight", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.TeamClaimsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.TeamClaimsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimNumber extends ValueElement {
      public ClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Insured extends ValueElement {
      public Insured(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/claims/TeamClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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