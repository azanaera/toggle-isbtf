package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator;
import pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator.AddnlTripAccommodation_DisplayNameHeader;
import pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator;
import pcftest.ClaimSnapshotTripIncidentScreen_default.AffectedTripAccommodationCardTab;
import pcftest.ClaimSnapshotTripIncidentScreen_default.AffectedTripSegmentCardTab;
import pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator;
import pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.AccommodationStatusHeader;
import pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.AffectedAccommodationNameHeader;
import pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.ReasonForCancellationHeader;
import pcftest.ClaimSnapshotTripIncidentScreen_default.TripIncidentDV;
import pcftest.ClaimSnapshotTripIncidentScreen_default.TripIncident_AccommodationCardTab;
import pcftest.ClaimSnapshotTripIncidentScreen_default.TripIncident_TripCardTab;
import pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator;
import pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.SegmentStatusHeader;
import pcftest.ClaimSnapshotTripIncidentScreen_default._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotTripIncidentScreen_default extends ClaimSnapshotTripIncidentScreen {
  public final static String CHECKSUM = "2f99eb21b698f5a8b23fbc2792b13b98";
  
  public ClaimSnapshotTripIncidentScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddnlTripAccommodationIterator getAddnlTripAccommodationIterator() {
    return getOrCreateProperty("AddnlTripAccommodationIterator", "AddnlTripAccommodationIterator", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator.class);
  }
  
  public AddnlTripSegmentIterator getAddnlTripSegmentIterator() {
    return getOrCreateProperty("AddnlTripSegmentIterator", "AddnlTripSegmentIterator", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.class);
  }
  
  public AffectedTripAccommodationCardTab getAffectedTripAccommodationCardTab() {
    return getOrCreateProperty("AffectedTripAccommodationCardTab", "AffectedTripAccommodationCardTab", null, pcftest.ClaimSnapshotTripIncidentScreen_default.AffectedTripAccommodationCardTab.class);
  }
  
  public AffectedTripSegmentCardTab getAffectedTripSegmentCardTab() {
    return getOrCreateProperty("AffectedTripSegmentCardTab", "AffectedTripSegmentCardTab", null, pcftest.ClaimSnapshotTripIncidentScreen_default.AffectedTripSegmentCardTab.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TripAccommodationIterator getTripAccommodationIterator() {
    return getOrCreateProperty("TripAccommodationIterator", "TripAccommodationIterator", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.class);
  }
  
  public TripIncidentDV getTripIncidentDV() {
    return getOrCreateProperty("TripIncidentDV", "TripIncidentDV", null, pcftest.ClaimSnapshotTripIncidentScreen_default.TripIncidentDV.class);
  }
  
  public TripIncident_AccommodationCardTab getTripIncident_AccommodationCardTab() {
    return getOrCreateProperty("TripIncident_AccommodationCardTab", "TripIncident_AccommodationCardTab", null, pcftest.ClaimSnapshotTripIncidentScreen_default.TripIncident_AccommodationCardTab.class);
  }
  
  public TripIncident_TripCardTab getTripIncident_TripCardTab() {
    return getOrCreateProperty("TripIncident_TripCardTab", "TripIncident_TripCardTab", null, pcftest.ClaimSnapshotTripIncidentScreen_default.TripIncident_TripCardTab.class);
  }
  
  public TripSegmentIterator getTripSegmentIterator() {
    return getOrCreateProperty("TripSegmentIterator", "TripSegmentIterator", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotTripIncidentScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddnlTripAccommodationIterator extends PCFElement {
    public AddnlTripAccommodationIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddnlTripAccommodation_DisplayNameHeader getAddnlTripAccommodation_DisplayNameHeader() {
      return getOrCreateProperty("AddnlTripAccommodation_DisplayNameHeader", "AddnlTripAccommodation_DisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator.AddnlTripAccommodation_DisplayNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddnlTripAccommodation_DisplayNameHeader extends ValueElement {
      public AddnlTripAccommodation_DisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAddnlTripAccommodation_DisplayName() {
        return getOrCreateProperty("AddnlTripAccommodation_DisplayName", "AddnlTripAccommodation_DisplayName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripAccommodationIterator.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddnlTripSegmentIterator extends PCFElement {
    public AddnlTripSegmentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.CarrierNameHeader getCarrierNameHeader() {
      return getOrCreateProperty("CarrierNameHeader", "CarrierNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.CarrierNameHeader.class);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.CarrierNumberHeader getCarrierNumberHeader() {
      return getOrCreateProperty("CarrierNumberHeader", "CarrierNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.CarrierNumberHeader.class);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.StartedOnHeader getStartedOnHeader() {
      return getOrCreateProperty("StartedOnHeader", "StartedOnHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.StartedOnHeader.class);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.TransportTypeHeader getTransportTypeHeader() {
      return getOrCreateProperty("TransportTypeHeader", "TransportTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.TransportTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CarrierNameHeader extends ValueElement {
      public CarrierNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CarrierNumberHeader extends ValueElement {
      public CarrierNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartedOnHeader extends ValueElement {
      public StartedOnHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TransportTypeHeader extends ValueElement {
      public TransportTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getCarrierName() {
        return getOrCreateProperty("CarrierName", "CarrierName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement getCarrierNameCB() {
        return getOrCreateProperty("CarrierNameCB", "CarrierNameCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public ValueElement getCarrierNumber() {
        return getOrCreateProperty("CarrierNumber", "CarrierNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement getCarrierNumberCB() {
        return getOrCreateProperty("CarrierNumberCB", "CarrierNumberCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public ValueElement getStartedOn() {
        return getOrCreateProperty("StartedOn", "StartedOn", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTransportType() {
        return getOrCreateProperty("TransportType", "TransportType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement getTransportTypeCB() {
        return getOrCreateProperty("TransportTypeCB", "TransportTypeCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotTripIncidentScreen_default.AddnlTripSegmentIterator.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AffectedTripAccommodationCardTab extends ClickableActionElement {
    public AffectedTripAccommodationCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AffectedTripSegmentCardTab extends ClickableActionElement {
    public AffectedTripSegmentCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripAccommodationIterator extends PCFElement {
    public TripAccommodationIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AccommodationStatusHeader getAccommodationStatusHeader() {
      return getOrCreateProperty("AccommodationStatusHeader", "AccommodationStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.AccommodationStatusHeader.class);
    }
    
    public AffectedAccommodationNameHeader getAffectedAccommodationNameHeader() {
      return getOrCreateProperty("AffectedAccommodationNameHeader", "AffectedAccommodationNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.AffectedAccommodationNameHeader.class);
    }
    
    public ReasonForCancellationHeader getReasonForCancellationHeader() {
      return getOrCreateProperty("ReasonForCancellationHeader", "ReasonForCancellationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.ReasonForCancellationHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AccommodationStatusHeader extends ValueElement {
      public AccommodationStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AffectedAccommodationNameHeader extends ValueElement {
      public AffectedAccommodationNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReasonForCancellationHeader extends ValueElement {
      public ReasonForCancellationHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAccommodationStatus() {
        return getOrCreateProperty("AccommodationStatus", "AccommodationStatus", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement getAccommodationStatusCB() {
        return getOrCreateProperty("AccommodationStatusCB", "AccommodationStatusCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public ValueElement getAffectedAccommodationName() {
        return getOrCreateProperty("AffectedAccommodationName", "AffectedAccommodationName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement getAffectedAccommodationNameCB() {
        return getOrCreateProperty("AffectedAccommodationNameCB", "AffectedAccommodationNameCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public ValueElement getReasonForCancellation() {
        return getOrCreateProperty("ReasonForCancellation", "ReasonForCancellation", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement getReasonForCancellationCB() {
        return getOrCreateProperty("ReasonForCancellationCB", "ReasonForCancellationCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotTripIncidentScreen_default.TripAccommodationIterator.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentDV extends DetailViewElement {
    public TripIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getEndDate() {
      return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getGeographicalRegion() {
      return getOrCreateProperty("GeographicalRegion", "GeographicalRegion", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartDate() {
      return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getTripRU() {
      return getOrCreateProperty("TripRU", "TripRU", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncident_AccommodationCardTab extends ClickableActionElement {
    public TripIncident_AccommodationCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncident_TripCardTab extends ClickableActionElement {
    public TripIncident_TripCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripSegmentIterator extends PCFElement {
    public TripSegmentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.CarrierNameHeader getCarrierNameHeader() {
      return getOrCreateProperty("CarrierNameHeader", "CarrierNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.CarrierNameHeader.class);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.CarrierNumberHeader getCarrierNumberHeader() {
      return getOrCreateProperty("CarrierNumberHeader", "CarrierNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.CarrierNumberHeader.class);
    }
    
    public SegmentStatusHeader getSegmentStatusHeader() {
      return getOrCreateProperty("SegmentStatusHeader", "SegmentStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.SegmentStatusHeader.class);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.StartedOnHeader getStartedOnHeader() {
      return getOrCreateProperty("StartedOnHeader", "StartedOnHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.StartedOnHeader.class);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.TransportTypeHeader getTransportTypeHeader() {
      return getOrCreateProperty("TransportTypeHeader", "TransportTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.TransportTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CarrierNameHeader extends ValueElement {
      public CarrierNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CarrierNumberHeader extends ValueElement {
      public CarrierNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SegmentStatusHeader extends ValueElement {
      public SegmentStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartedOnHeader extends ValueElement {
      public StartedOnHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TransportTypeHeader extends ValueElement {
      public TransportTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getCarrierName() {
        return getOrCreateProperty("CarrierName", "CarrierName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement getCarrierNameCB() {
        return getOrCreateProperty("CarrierNameCB", "CarrierNameCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public ValueElement getCarrierNumber() {
        return getOrCreateProperty("CarrierNumber", "CarrierNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement getCarrierNumberCB() {
        return getOrCreateProperty("CarrierNumberCB", "CarrierNumberCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public ValueElement getSegmentStatus() {
        return getOrCreateProperty("SegmentStatus", "SegmentStatus", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement getSegmentStatusCB() {
        return getOrCreateProperty("SegmentStatusCB", "SegmentStatusCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public ValueElement getStartedOn() {
        return getOrCreateProperty("StartedOn", "StartedOn", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTransportType() {
        return getOrCreateProperty("TransportType", "TransportType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement getTransportTypeCB() {
        return getOrCreateProperty("TransportTypeCB", "TransportTypeCB", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewEntryCheckbox, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotTripIncidentScreen_default.TripSegmentIterator.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotTripIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}