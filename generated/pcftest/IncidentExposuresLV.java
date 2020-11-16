package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.IncidentExposuresLV.ClaimOrderHeader;
import pcftest.IncidentExposuresLV.FinancialsHeader;
import pcftest.IncidentExposuresLV.OverviewHeader;
import pcftest.IncidentExposuresLV._ListPaging;
import pcftest.IncidentExposuresLV.entry;
import pcftest.IncidentExposuresLV.entry.ClaimOrder;
import pcftest.IncidentExposuresLV.entry.CoverageLink;
import pcftest.IncidentExposuresLV.entry._Select;
import pcftest.IncidentExposuresLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class IncidentExposuresLV extends PCFElement {
  public final static String CHECKSUM = "193cd14e9307410dd8ecc25fffb6b856";
  
  public IncidentExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimOrderHeader getClaimOrderHeader() {
    return getOrCreateProperty("ClaimOrderHeader", "ClaimOrderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IncidentExposuresLV.ClaimOrderHeader.class);
  }
  
  public FinancialsHeader getFinancialsHeader() {
    return getOrCreateProperty("FinancialsHeader", "FinancialsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IncidentExposuresLV.FinancialsHeader.class);
  }
  
  public OverviewHeader getOverviewHeader() {
    return getOrCreateProperty("OverviewHeader", "OverviewHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IncidentExposuresLV.OverviewHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.IncidentExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.IncidentExposuresLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimOrderHeader extends ValueElement {
    public ClaimOrderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsHeader extends ValueElement {
    public FinancialsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OverviewHeader extends ValueElement {
    public OverviewHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAssignee() {
      return getOrCreateProperty("Assignee", "Assignee", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ClaimOrder getClaimOrder() {
      return getOrCreateProperty("ClaimOrder", "ClaimOrder", null, pcftest.IncidentExposuresLV.entry.ClaimOrder.class);
    }
    
    public CoverageLink getCoverageLink() {
      return getOrCreateProperty("CoverageLink", "CoverageLink", null, pcftest.IncidentExposuresLV.entry.CoverageLink.class);
    }
    
    public ValueElement getPaid() {
      return getOrCreateProperty("Paid", "Paid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRemainingReserves() {
      return getOrCreateProperty("RemainingReserves", "RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.IncidentExposuresLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.IncidentExposuresLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimOrder extends ValueElement {
      public ClaimOrder(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageLink extends ClickableActionElement {
      public CoverageLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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