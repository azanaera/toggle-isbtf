package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.ClaimOrderHeader;
import pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.FinancialsHeader;
import pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.OverviewHeader;
import pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700._ListPaging;
import pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.entry;
import pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.entry.CoverageLink;
import pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.entry._Select;
import pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentRelatedExposuresPanelSet.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotIncidentRelatedExposuresPanelSet_700 extends ClaimSnapshotIncidentRelatedExposuresPanelSet {
  public final static String CHECKSUM = "a7477202adc5e4dc134a9e5946f3c720";
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_700(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimOrderHeader getClaimOrderHeader() {
    return getOrCreateProperty("ClaimOrderHeader", "ClaimOrderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.ClaimOrderHeader.class);
  }
  
  public FinancialsHeader getFinancialsHeader() {
    return getOrCreateProperty("FinancialsHeader", "FinancialsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.FinancialsHeader.class);
  }
  
  public OverviewHeader getOverviewHeader() {
    return getOrCreateProperty("OverviewHeader", "OverviewHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.OverviewHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentRelatedExposuresPanelSet.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimOrderHeader extends ValueElement {
    public ClaimOrderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentRelatedExposuresPanelSet.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsHeader extends ValueElement {
    public FinancialsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentRelatedExposuresPanelSet.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OverviewHeader extends ValueElement {
    public OverviewHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentRelatedExposuresPanelSet.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentRelatedExposuresPanelSet.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAssignee() {
      return getOrCreateProperty("Assignee", "Assignee", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimOrder() {
      return getOrCreateProperty("ClaimOrder", "ClaimOrder", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CoverageLink getCoverageLink() {
      return getOrCreateProperty("CoverageLink", "CoverageLink", null, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.entry.CoverageLink.class);
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
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentRelatedExposuresPanelSet.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageLink extends ClickableActionElement {
      public CoverageLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentRelatedExposuresPanelSet.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotIncidentRelatedExposuresPanelSet.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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