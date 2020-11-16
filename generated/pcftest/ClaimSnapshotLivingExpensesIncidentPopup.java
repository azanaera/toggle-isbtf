package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.Approx_TotalHeader;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.ClaimSnapshotLivingExpensesIncidentPopup_UpLink;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.CommentsHeader;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.DaysHeader;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.EndDateHeader;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.LocationHeader;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.RateHeader;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.StartDateHeader;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup._ListPaging;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup._Paging;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.__crumb__;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup._msgs;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.entry;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.entry._Select;
import pcftest.ClaimSnapshotLivingExpensesIncidentPopup.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotLivingExpensesIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "91213bf95e3b67d4994ca1d7e260fa3f";
  
  public ClaimSnapshotLivingExpensesIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotLivingExpensesIncidentPopup"));
  }
  
  public Approx_TotalHeader getApprox_TotalHeader() {
    return getOrCreateProperty("Approx_TotalHeader", "Approx_TotalHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.Approx_TotalHeader.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_600 getClaimSnapshotIncidentRelatedExposuresPanelSet_600() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_600", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_600.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_700 getClaimSnapshotIncidentRelatedExposuresPanelSet_700() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_700", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_800 getClaimSnapshotIncidentRelatedExposuresPanelSet_800() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_800", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_800.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_default getClaimSnapshotIncidentRelatedExposuresPanelSet_default() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_default", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_default.class);
  }
  
  public ClaimSnapshotLivingExpensesIncidentPopup_UpLink getClaimSnapshotLivingExpensesIncidentPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotLivingExpensesIncidentPopup_UpLink", "ClaimSnapshotLivingExpensesIncidentPopup_UpLink", null, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.ClaimSnapshotLivingExpensesIncidentPopup_UpLink.class);
  }
  
  public CommentsHeader getCommentsHeader() {
    return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.CommentsHeader.class);
  }
  
  public DaysHeader getDaysHeader() {
    return getOrCreateProperty("DaysHeader", "DaysHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.DaysHeader.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EndDateHeader getEndDateHeader() {
    return getOrCreateProperty("EndDateHeader", "EndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.EndDateHeader.class);
  }
  
  public ValueElement getExpectedDuration() {
    return getOrCreateProperty("ExpectedDuration", "ExpectedDuration", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LocationHeader getLocationHeader() {
    return getOrCreateProperty("LocationHeader", "LocationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.LocationHeader.class);
  }
  
  public ValueElement getMealsDays() {
    return getOrCreateProperty("MealsDays", "MealsDays", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMealsPeople() {
    return getOrCreateProperty("MealsPeople", "MealsPeople", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMealsRate() {
    return getOrCreateProperty("MealsRate", "MealsRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RateHeader getRateHeader() {
    return getOrCreateProperty("RateHeader", "RateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.RateHeader.class);
  }
  
  public StartDateHeader getStartDateHeader() {
    return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.StartDateHeader.class);
  }
  
  public ValueElement getTotalLodgingEstimate() {
    return getOrCreateProperty("TotalLodgingEstimate", "TotalLodgingEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalMealsEstimate() {
    return getOrCreateProperty("TotalMealsEstimate", "TotalMealsEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotLivingExpensesIncidentPopup._ListPaging.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotLivingExpensesIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotLivingExpensesIncidentPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Approx_TotalHeader extends ValueElement {
    public Approx_TotalHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotLivingExpensesIncidentPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotLivingExpensesIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentsHeader extends ValueElement {
    public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DaysHeader extends ValueElement {
    public DaysHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndDateHeader extends ValueElement {
    public EndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationHeader extends ValueElement {
    public LocationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RateHeader extends ValueElement {
    public RateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartDateHeader extends ValueElement {
    public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getApprox_Total() {
      return getOrCreateProperty("Approx_Total", "Approx_Total", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getComments() {
      return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getContact() {
      return getOrCreateProperty("Contact", "Contact", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getContact_Phone() {
      return getOrCreateProperty("Contact_Phone", "Contact_Phone", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getContact_PrimaryAddress() {
      return getOrCreateProperty("Contact_PrimaryAddress", "Contact_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDays() {
      return getOrCreateProperty("Days", "Days", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEndDate() {
      return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRate() {
      return getOrCreateProperty("Rate", "Rate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getStartDate() {
      return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotLivingExpensesIncidentPopup.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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