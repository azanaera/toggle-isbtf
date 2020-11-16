package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.ClaimSnapshotGeneral500DV_Trav.BaggageHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.BaggageTypeHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV;
import pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.MakeHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.SeverityHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.entry.Make;
import pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.entry.Severity;
import pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV_tb;
import pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV;
import pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.MetroReportOrderDateHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.MetroReportStatusHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.MetroReportTypeHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV_tb;
import pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV;
import pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.NameHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.ReportNumberHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.TypeHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV_tb;
import pcftest.ClaimSnapshotGeneral500DV_Trav.PropertyDescriptionHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV;
import pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.TripRUHeader;
import pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.entry.TripRU;
import pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV_tb;
import pcftest.ClaimSnapshotGeneral500DV_Trav.entry.BaggageType;
import pcftest.ClaimSnapshotGeneral500DV_Trav.entry.PropertyDescription;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral500DV_Trav extends ClaimSnapshotGeneral500DV {
  public final static String CHECKSUM = "16a70b33a0a9077815a72df82bc0f3f3";
  
  public ClaimSnapshotGeneral500DV_Trav(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddress1() {
    return getOrCreateProperty("Address1", "Address1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAddress2() {
    return getOrCreateProperty("Address2", "Address2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAtFaultPercentage() {
    return getOrCreateProperty("AtFaultPercentage", "AtFaultPercentage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BaggageHeader getBaggageHeader() {
    return getOrCreateProperty("BaggageHeader", "BaggageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.BaggageHeader.class);
  }
  
  public BaggageTypeHeader getBaggageTypeHeader() {
    return getOrCreateProperty("BaggageTypeHeader", "BaggageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.BaggageTypeHeader.class);
  }
  
  public ValueElement getCatastrophe() {
    return getOrCreateProperty("Catastrophe", "Catastrophe", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCity() {
    return getOrCreateProperty("City", "City", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCountry() {
    return getOrCreateProperty("Country", "Country", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCounty() {
    return getOrCreateProperty("County", "County", null, gw.smoketest.platform.web.ValueElement.class);
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
    return getOrCreateProperty("InjuriesLV", "InjuriesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.class);
  }
  
  public InjuriesLV_tb getInjuriesLV_tb() {
    return getOrCreateProperty("InjuriesLV_tb", "InjuriesLV_tb", null, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV_tb.class);
  }
  
  public ValueElement getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getLossLocation() {
    return getOrCreateProperty("LossLocation", "LossLocation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossLocationCode() {
    return getOrCreateProperty("LossLocationCode", "LossLocationCode", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public MetroReportsLV getMetroReportsLV() {
    return getOrCreateProperty("MetroReportsLV", "MetroReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.class);
  }
  
  public MetroReportsLV_tb getMetroReportsLV_tb() {
    return getOrCreateProperty("MetroReportsLV_tb", "MetroReportsLV_tb", null, pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV_tb.class);
  }
  
  public OfficialsLV getOfficialsLV() {
    return getOrCreateProperty("OfficialsLV", "OfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.class);
  }
  
  public OfficialsLV_tb getOfficialsLV_tb() {
    return getOrCreateProperty("OfficialsLV_tb", "OfficialsLV_tb", null, pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV_tb.class);
  }
  
  public ValueElement getPermissionRequired() {
    return getOrCreateProperty("PermissionRequired", "PermissionRequired", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPostalCode() {
    return getOrCreateProperty("PostalCode", "PostalCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PropertyDescriptionHeader getPropertyDescriptionHeader() {
    return getOrCreateProperty("PropertyDescriptionHeader", "PropertyDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.PropertyDescriptionHeader.class);
  }
  
  public DateElement getReportedDate() {
    return getOrCreateProperty("ReportedDate", "ReportedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getReporter() {
    return getOrCreateProperty("Reporter", "Reporter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getState() {
    return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TripIncidentLV getTripIncidentLV() {
    return getOrCreateProperty("TripIncidentLV", "TripIncidentLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.class);
  }
  
  public TripIncidentLV_tb getTripIncidentLV_tb() {
    return getOrCreateProperty("TripIncidentLV_tb", "TripIncidentLV_tb", null, pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV_tb.class);
  }
  
  public ValueElement getValidationLevel() {
    return getOrCreateProperty("ValidationLevel", "ValidationLevel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWeather() {
    return getOrCreateProperty("Weather", "Weather", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral500DV_Trav.entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral500DV_Trav.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public pcftest.ClaimSnapshotGeneral500DV_Trav._ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral500DV_Trav._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageHeader extends ValueElement {
    public BaggageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageTypeHeader extends ValueElement {
    public BaggageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuriesLV extends PCFElement {
    public InjuriesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.DescriptionHeader.class);
    }
    
    public MakeHeader getMakeHeader() {
      return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.MakeHeader.class);
    }
    
    public SeverityHeader getSeverityHeader() {
      return getOrCreateProperty("SeverityHeader", "SeverityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.SeverityHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MakeHeader extends ValueElement {
      public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SeverityHeader extends ValueElement {
      public SeverityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Make getMake() {
        return getOrCreateProperty("Make", "Make", null, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.entry.Make.class);
      }
      
      public Severity getSeverity() {
        return getOrCreateProperty("Severity", "Severity", null, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.entry.Severity.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral500DV_Trav.InjuriesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Make extends ValueElement {
        public Make(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotInjuryIncidentPopup click() {
          return clickThis(pcftest.ClaimSnapshotInjuryIncidentPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Severity extends ValueElement {
        public Severity(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotInjuryIncidentPopup click() {
          return clickThis(pcftest.ClaimSnapshotInjuryIncidentPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuriesLV_tb extends PCFElement {
    public InjuriesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportsLV extends PCFElement {
    public MetroReportsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MetroReportOrderDateHeader getMetroReportOrderDateHeader() {
      return getOrCreateProperty("MetroReportOrderDateHeader", "MetroReportOrderDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.MetroReportOrderDateHeader.class);
    }
    
    public MetroReportStatusHeader getMetroReportStatusHeader() {
      return getOrCreateProperty("MetroReportStatusHeader", "MetroReportStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.MetroReportStatusHeader.class);
    }
    
    public MetroReportTypeHeader getMetroReportTypeHeader() {
      return getOrCreateProperty("MetroReportTypeHeader", "MetroReportTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.MetroReportTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportOrderDateHeader extends ValueElement {
      public MetroReportOrderDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportStatusHeader extends ValueElement {
      public MetroReportStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportTypeHeader extends ValueElement {
      public MetroReportTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DateElement getMetroReportOrderDate() {
        return getOrCreateProperty("MetroReportOrderDate", "MetroReportOrderDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getMetroReportStatus() {
        return getOrCreateProperty("MetroReportStatus", "MetroReportStatus", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getMetroReportType() {
        return getOrCreateProperty("MetroReportType", "MetroReportType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral500DV_Trav.MetroReportsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportsLV_tb extends PCFElement {
    public MetroReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OfficialsLV extends PCFElement {
    public OfficialsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.NameHeader.class);
    }
    
    public ReportNumberHeader getReportNumberHeader() {
      return getOrCreateProperty("ReportNumberHeader", "ReportNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.ReportNumberHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReportNumberHeader extends ValueElement {
      public ReportNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral500DV_Trav.OfficialsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OfficialsLV_tb extends PCFElement {
    public OfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyDescriptionHeader extends ValueElement {
    public PropertyDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentLV extends PCFElement {
    public TripIncidentLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.DescriptionHeader.class);
    }
    
    public TripRUHeader getTripRUHeader() {
      return getOrCreateProperty("TripRUHeader", "TripRUHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.TripRUHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TripRUHeader extends ValueElement {
      public TripRUHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public TripRU getTripRU() {
        return getOrCreateProperty("TripRU", "TripRU", null, pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.entry.TripRU.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral500DV_Trav.TripIncidentLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TripRU extends ValueElement {
        public TripRU(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotTripIncidentPopup click() {
          return clickThis(pcftest.ClaimSnapshotTripIncidentPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentLV_tb extends PCFElement {
    public TripIncidentLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getBaggage() {
      return getOrCreateProperty("Baggage", "Baggage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BaggageType getBaggageType() {
      return getOrCreateProperty("BaggageType", "BaggageType", null, pcftest.ClaimSnapshotGeneral500DV_Trav.entry.BaggageType.class);
    }
    
    public PropertyDescription getPropertyDescription() {
      return getOrCreateProperty("PropertyDescription", "PropertyDescription", null, pcftest.ClaimSnapshotGeneral500DV_Trav.entry.PropertyDescription.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.ClaimSnapshotGeneral500DV_Trav.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral500DV_Trav.entry._Select.class);
    }
    
    public pcftest.ClaimSnapshotGeneral500DV_Trav.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral500DV_Trav.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BaggageType extends ValueElement {
      public BaggageType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSnapshotBaggageIncidentPopup click() {
        return clickThis(pcftest.ClaimSnapshotBaggageIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertyDescription extends ValueElement {
      public PropertyDescription(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSnapshotBaggageIncidentPopup click() {
        return clickThis(pcftest.ClaimSnapshotBaggageIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotGeneral500DV.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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