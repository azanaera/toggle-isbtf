package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.BaggageHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.BaggageTypeHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.PropertyDescriptionHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.entry.BaggageType;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.entry.PropertyDescription;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV_tb;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV_tb;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.NameHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.ReportNumberHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.TypeHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV_tb;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV_tb;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.TripRUHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.entry.TripRU;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV_tb;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.DriverHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.LicenseHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.LossPartyHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.ModelHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.StateHeader;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.entry.Model;
import pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral800PanelSet_Trav extends ClaimSnapshotGeneral800PanelSet {
  public final static String CHECKSUM = "13a743f1e4fe67ba42ff5b88075a2c2f";
  
  public ClaimSnapshotGeneral800PanelSet_Trav(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneral800DV getClaimSnapshotGeneral800DV() {
    return getOrCreateProperty("ClaimSnapshotGeneral800DV", "ClaimSnapshotGeneral800DV", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral800DV extends DetailViewElement {
    public ClaimSnapshotGeneral800DV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressSnapshot800InputSet getAddressSnapshot800InputSet() {
      return getOrCreateProperty("AddressSnapshot800InputSet", "AddressSnapshot800InputSet", null, pcftest.AddressSnapshot800InputSet.class);
    }
    
    public ValueElement getAtFaultPercentage() {
      return getOrCreateProperty("AtFaultPercentage", "AtFaultPercentage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BaggageIncidentLV getBaggageIncidentLV() {
      return getOrCreateProperty("BaggageIncidentLV", "BaggageIncidentLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.class);
    }
    
    public BaggageIncidentLV_tb getBaggageIncidentLV_tb() {
      return getOrCreateProperty("BaggageIncidentLV_tb", "BaggageIncidentLV_tb", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV_tb.class);
    }
    
    public ValueElement getCatastrophe() {
      return getOrCreateProperty("Catastrophe", "Catastrophe", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getCoverageInQuestion() {
      return getOrCreateProperty("CoverageInQuestion", "CoverageInQuestion", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public DateElement getCreateTime() {
      return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getEmploymentCourse() {
      return getOrCreateProperty("EmploymentCourse", "EmploymentCourse", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getFault() {
      return getOrCreateProperty("Fault", "Fault", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getFirstNoticeSuit() {
      return getOrCreateProperty("FirstNoticeSuit", "FirstNoticeSuit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getHowReported() {
      return getOrCreateProperty("HowReported", "HowReported", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement getIncidentReport() {
      return getOrCreateProperty("IncidentReport", "IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public InjuriesLV getInjuriesLV() {
      return getOrCreateProperty("InjuriesLV", "InjuriesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.class);
    }
    
    public InjuriesLV_tb getInjuriesLV_tb() {
      return getOrCreateProperty("InjuriesLV_tb", "InjuriesLV_tb", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV_tb.class);
    }
    
    public ValueElement getLOBCode() {
      return getOrCreateProperty("LOBCode", "LOBCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLossCause() {
      return getOrCreateProperty("LossCause", "LossCause", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLossDate() {
      return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getLossType() {
      return getOrCreateProperty("LossType", "LossType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMainContact() {
      return getOrCreateProperty("MainContact", "MainContact", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMainContactType() {
      return getOrCreateProperty("MainContactType", "MainContactType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public OfficialsLV getOfficialsLV() {
      return getOrCreateProperty("OfficialsLV", "OfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.class);
    }
    
    public OfficialsLV_tb getOfficialsLV_tb() {
      return getOrCreateProperty("OfficialsLV_tb", "OfficialsLV_tb", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV_tb.class);
    }
    
    public ValueElement getPermissionRequired() {
      return getOrCreateProperty("PermissionRequired", "PermissionRequired", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PropertiesLV getPropertiesLV() {
      return getOrCreateProperty("PropertiesLV", "PropertiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.class);
    }
    
    public PropertiesLV_tb getPropertiesLV_tb() {
      return getOrCreateProperty("PropertiesLV_tb", "PropertiesLV_tb", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV_tb.class);
    }
    
    public DateElement getReportedDate() {
      return getOrCreateProperty("ReportedDate", "ReportedDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getReporter() {
      return getOrCreateProperty("Reporter", "Reporter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TripIncidentLV getTripIncidentLV() {
      return getOrCreateProperty("TripIncidentLV", "TripIncidentLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.class);
    }
    
    public TripIncidentLV_tb getTripIncidentLV_tb() {
      return getOrCreateProperty("TripIncidentLV_tb", "TripIncidentLV_tb", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV_tb.class);
    }
    
    public ValueElement getValidationLevel() {
      return getOrCreateProperty("ValidationLevel", "ValidationLevel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public VehiclesLV getVehiclesLV() {
      return getOrCreateProperty("VehiclesLV", "VehiclesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.class);
    }
    
    public VehiclesLV_tb getVehiclesLV_tb() {
      return getOrCreateProperty("VehiclesLV_tb", "VehiclesLV_tb", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV_tb.class);
    }
    
    public ValueElement getWeather() {
      return getOrCreateProperty("Weather", "Weather", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BaggageIncidentLV extends PCFElement {
      public BaggageIncidentLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BaggageHeader getBaggageHeader() {
        return getOrCreateProperty("BaggageHeader", "BaggageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.BaggageHeader.class);
      }
      
      public BaggageTypeHeader getBaggageTypeHeader() {
        return getOrCreateProperty("BaggageTypeHeader", "BaggageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.BaggageTypeHeader.class);
      }
      
      public PropertyDescriptionHeader getPropertyDescriptionHeader() {
        return getOrCreateProperty("PropertyDescriptionHeader", "PropertyDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.PropertyDescriptionHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class BaggageHeader extends ValueElement {
        public BaggageHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class BaggageTypeHeader extends ValueElement {
        public BaggageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PropertyDescriptionHeader extends ValueElement {
        public PropertyDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getBaggage() {
          return getOrCreateProperty("Baggage", "Baggage", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public BaggageType getBaggageType() {
          return getOrCreateProperty("BaggageType", "BaggageType", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.entry.BaggageType.class);
        }
        
        public PropertyDescription getPropertyDescription() {
          return getOrCreateProperty("PropertyDescription", "PropertyDescription", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.entry.PropertyDescription.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.BaggageIncidentLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class BaggageType extends ValueElement {
          public BaggageType(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotBaggageIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotBaggageIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PropertyDescription extends ValueElement {
          public PropertyDescription(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotBaggageIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotBaggageIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BaggageIncidentLV_tb extends PCFElement {
      public BaggageIncidentLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InjuriesLV extends PCFElement {
      public InjuriesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.DescriptionHeader getDescriptionHeader() {
        return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.DescriptionHeader.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.MakeHeader getMakeHeader() {
        return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.MakeHeader.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.SeverityHeader getSeverityHeader() {
        return getOrCreateProperty("SeverityHeader", "SeverityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.SeverityHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DescriptionHeader extends ValueElement {
        public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MakeHeader extends ValueElement {
        public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SeverityHeader extends ValueElement {
        public SeverityHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.entry.Make getMake() {
          return getOrCreateProperty("Make", "Make", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.entry.Make.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.entry.Severity getSeverity() {
          return getOrCreateProperty("Severity", "Severity", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.entry.Severity.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.InjuriesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Make extends ValueElement {
          public Make(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotInjuryIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotInjuryIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Severity extends ValueElement {
          public Severity(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotInjuryIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotInjuryIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InjuriesLV_tb extends PCFElement {
      public InjuriesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OfficialsLV extends PCFElement {
      public OfficialsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NameHeader getNameHeader() {
        return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.NameHeader.class);
      }
      
      public ReportNumberHeader getReportNumberHeader() {
        return getOrCreateProperty("ReportNumberHeader", "ReportNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.ReportNumberHeader.class);
      }
      
      public TypeHeader getTypeHeader() {
        return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.TypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameHeader extends ValueElement {
        public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReportNumberHeader extends ValueElement {
        public ReportNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TypeHeader extends ValueElement {
        public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getName() {
          return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getReportNumber() {
          return getOrCreateProperty("ReportNumber", "ReportNumber", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getType() {
          return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.OfficialsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OfficialsLV_tb extends PCFElement {
      public OfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertiesLV extends PCFElement {
      public PropertiesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.DescriptionHeader getDescriptionHeader() {
        return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.DescriptionHeader.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.MakeHeader getMakeHeader() {
        return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.MakeHeader.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.SeverityHeader getSeverityHeader() {
        return getOrCreateProperty("SeverityHeader", "SeverityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.SeverityHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DescriptionHeader extends ValueElement {
        public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MakeHeader extends ValueElement {
        public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SeverityHeader extends ValueElement {
        public SeverityHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.entry.Make getMake() {
          return getOrCreateProperty("Make", "Make", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.entry.Make.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.entry.Severity getSeverity() {
          return getOrCreateProperty("Severity", "Severity", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.entry.Severity.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.PropertiesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Make extends ValueElement {
          public Make(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotFixedPropertyIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotFixedPropertyIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Severity extends ValueElement {
          public Severity(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotFixedPropertyIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotFixedPropertyIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertiesLV_tb extends PCFElement {
      public PropertiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TripIncidentLV extends PCFElement {
      public TripIncidentLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.DescriptionHeader getDescriptionHeader() {
        return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.DescriptionHeader.class);
      }
      
      public TripRUHeader getTripRUHeader() {
        return getOrCreateProperty("TripRUHeader", "TripRUHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.TripRUHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DescriptionHeader extends ValueElement {
        public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TripRUHeader extends ValueElement {
        public TripRUHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public TripRU getTripRU() {
          return getOrCreateProperty("TripRU", "TripRU", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.entry.TripRU.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.TripIncidentLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class TripRU extends ValueElement {
          public TripRU(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotTripIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotTripIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TripIncidentLV_tb extends PCFElement {
      public TripIncidentLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VehiclesLV extends PCFElement {
      public VehiclesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DriverHeader getDriverHeader() {
        return getOrCreateProperty("DriverHeader", "DriverHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.DriverHeader.class);
      }
      
      public LicenseHeader getLicenseHeader() {
        return getOrCreateProperty("LicenseHeader", "LicenseHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.LicenseHeader.class);
      }
      
      public LossPartyHeader getLossPartyHeader() {
        return getOrCreateProperty("LossPartyHeader", "LossPartyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.LossPartyHeader.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.MakeHeader getMakeHeader() {
        return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.MakeHeader.class);
      }
      
      public ModelHeader getModelHeader() {
        return getOrCreateProperty("ModelHeader", "ModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.ModelHeader.class);
      }
      
      public StateHeader getStateHeader() {
        return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.StateHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DriverHeader extends ValueElement {
        public DriverHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LicenseHeader extends ValueElement {
        public LicenseHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LossPartyHeader extends ValueElement {
        public LossPartyHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MakeHeader extends ValueElement {
        public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ModelHeader extends ValueElement {
        public ModelHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StateHeader extends ValueElement {
        public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDriver() {
          return getOrCreateProperty("Driver", "Driver", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getLicense() {
          return getOrCreateProperty("License", "License", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getLossParty() {
          return getOrCreateProperty("LossParty", "LossParty", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.entry.Make getMake() {
          return getOrCreateProperty("Make", "Make", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.entry.Make.class);
        }
        
        public Model getModel() {
          return getOrCreateProperty("Model", "Model", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.entry.Model.class);
        }
        
        public ValueElement getState() {
          return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.ClaimSnapshotGeneral800DV.VehiclesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Make extends ValueElement {
          public Make(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotVehicleIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotVehicleIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Model extends ValueElement {
          public Model(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotVehicleIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotVehicleIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VehiclesLV_tb extends PCFElement {
      public VehiclesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}