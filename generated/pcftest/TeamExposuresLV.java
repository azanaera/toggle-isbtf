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
import pcftest.TeamExposuresLV.Claims_ClaimantHeader;
import pcftest.TeamExposuresLV.Exposures_AssigneeHeader;
import pcftest.TeamExposuresLV.Exposures_CaseIDHeader;
import pcftest.TeamExposuresLV.Exposures_CoverageHeader;
import pcftest.TeamExposuresLV.Exposures_OrderHeader;
import pcftest.TeamExposuresLV.Exposures_TotalIncurredNetHeader;
import pcftest.TeamExposuresLV.Exposures_TypeHeader;
import pcftest.TeamExposuresLV.Exposures_WorkloadWeightHeader;
import pcftest.TeamExposuresLV._ListPaging;
import pcftest.TeamExposuresLV.entry;
import pcftest.TeamExposuresLV.entry.Claims_Claimant;
import pcftest.TeamExposuresLV.entry.Exposures_CaseID;
import pcftest.TeamExposuresLV.entry.Exposures_Coverage;
import pcftest.TeamExposuresLV.entry.Exposures_Order;
import pcftest.TeamExposuresLV.entry.Exposures_Type;
import pcftest.TeamExposuresLV.entry._Select;
import pcftest.TeamExposuresLV.entry._ViewDetail;
import typekey.CoverageType;
import typekey.ExposureType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamExposuresLV extends PCFElement {
  public final static String CHECKSUM = "4840ff5d3902601a6e518c7ddb2cf34f";
  
  public TeamExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Claims_ClaimantHeader getClaims_ClaimantHeader() {
    return getOrCreateProperty("Claims_ClaimantHeader", "Claims_ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamExposuresLV.Claims_ClaimantHeader.class);
  }
  
  public Exposures_AssigneeHeader getExposures_AssigneeHeader() {
    return getOrCreateProperty("Exposures_AssigneeHeader", "Exposures_AssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamExposuresLV.Exposures_AssigneeHeader.class);
  }
  
  public Exposures_CaseIDHeader getExposures_CaseIDHeader() {
    return getOrCreateProperty("Exposures_CaseIDHeader", "Exposures_CaseIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamExposuresLV.Exposures_CaseIDHeader.class);
  }
  
  public Exposures_CoverageHeader getExposures_CoverageHeader() {
    return getOrCreateProperty("Exposures_CoverageHeader", "Exposures_CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamExposuresLV.Exposures_CoverageHeader.class);
  }
  
  public Exposures_OrderHeader getExposures_OrderHeader() {
    return getOrCreateProperty("Exposures_OrderHeader", "Exposures_OrderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamExposuresLV.Exposures_OrderHeader.class);
  }
  
  public Exposures_TotalIncurredNetHeader getExposures_TotalIncurredNetHeader() {
    return getOrCreateProperty("Exposures_TotalIncurredNetHeader", "Exposures_TotalIncurredNetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamExposuresLV.Exposures_TotalIncurredNetHeader.class);
  }
  
  public Exposures_TypeHeader getExposures_TypeHeader() {
    return getOrCreateProperty("Exposures_TypeHeader", "Exposures_TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamExposuresLV.Exposures_TypeHeader.class);
  }
  
  public Exposures_WorkloadWeightHeader getExposures_WorkloadWeightHeader() {
    return getOrCreateProperty("Exposures_WorkloadWeightHeader", "Exposures_WorkloadWeightHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamExposuresLV.Exposures_WorkloadWeightHeader.class);
  }
  
  public SelectElement getTeamExposuresFilter() {
    return getOrCreateProperty("TeamExposuresFilter", "TeamExposuresFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.TeamExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.TeamExposuresLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claims_ClaimantHeader extends ValueElement {
    public Claims_ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_AssigneeHeader extends ValueElement {
    public Exposures_AssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_CaseIDHeader extends ValueElement {
    public Exposures_CaseIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_CoverageHeader extends ValueElement {
    public Exposures_CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_OrderHeader extends ValueElement {
    public Exposures_OrderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_TotalIncurredNetHeader extends ValueElement {
    public Exposures_TotalIncurredNetHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_TypeHeader extends ValueElement {
    public Exposures_TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_WorkloadWeightHeader extends ValueElement {
    public Exposures_WorkloadWeightHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Claims_Claimant getClaims_Claimant() {
      return getOrCreateProperty("Claims_Claimant", "Claims_Claimant", null, pcftest.TeamExposuresLV.entry.Claims_Claimant.class);
    }
    
    public ValueElement getExposures_Assignee() {
      return getOrCreateProperty("Exposures_Assignee", "Exposures_Assignee", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Exposures_CaseID getExposures_CaseID() {
      return getOrCreateProperty("Exposures_CaseID", "Exposures_CaseID", null, pcftest.TeamExposuresLV.entry.Exposures_CaseID.class);
    }
    
    public Exposures_Coverage getExposures_Coverage() {
      return getOrCreateProperty("Exposures_Coverage", "Exposures_Coverage", null, pcftest.TeamExposuresLV.entry.Exposures_Coverage.class);
    }
    
    public Exposures_Order getExposures_Order() {
      return getOrCreateProperty("Exposures_Order", "Exposures_Order", null, pcftest.TeamExposuresLV.entry.Exposures_Order.class);
    }
    
    public ValueElement getExposures_TotalIncurredNet() {
      return getOrCreateProperty("Exposures_TotalIncurredNet", "Exposures_TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Exposures_Type getExposures_Type() {
      return getOrCreateProperty("Exposures_Type", "Exposures_Type", null, pcftest.TeamExposuresLV.entry.Exposures_Type.class);
    }
    
    public ValueElement getExposures_WorkloadWeight() {
      return getOrCreateProperty("Exposures_WorkloadWeight", "Exposures_WorkloadWeight", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.TeamExposuresLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.TeamExposuresLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claims_Claimant extends ValueElement {
      public Claims_Claimant(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_CaseID extends ValueElement {
      public Exposures_CaseID(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_Coverage extends SelectElement {
      public Exposures_Coverage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(CoverageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CoverageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CoverageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_Order extends ValueElement {
      public Exposures_Order(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_Type extends SelectElement {
      public Exposures_Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public OptionElement getOptionByTypeKey(ExposureType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ExposureType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ExposureType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/exposures/TeamExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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