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
import pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV;
import pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.MetroReportOrderDateHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.MetroReportStatusHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.MetroReportTypeHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV_tb;
import pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV;
import pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.NameHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.ReportNumberHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.TypeHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV_tb;
import pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV;
import pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.DriverHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.LicenseHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.LossPartyHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.MakeHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.ModelHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.StateHeader;
import pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.entry.Make;
import pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.entry.Model;
import pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral400DV_auto extends ClaimSnapshotGeneral400DV {
  public final static String CHECKSUM = "3aa9643326911cd7cdcc6c5e6c97f472";
  
  public ClaimSnapshotGeneral400DV_auto(ISmokeTest helper, PCFElementId componentId)  {
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
    return getOrCreateProperty("MetroReportsLV", "MetroReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.class);
  }
  
  public MetroReportsLV_tb getMetroReportsLV_tb() {
    return getOrCreateProperty("MetroReportsLV_tb", "MetroReportsLV_tb", null, pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV_tb.class);
  }
  
  public OfficialsLV getOfficialsLV() {
    return getOrCreateProperty("OfficialsLV", "OfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.class);
  }
  
  public OfficialsLV_tb getOfficialsLV_tb() {
    return getOrCreateProperty("OfficialsLV_tb", "OfficialsLV_tb", null, pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV_tb.class);
  }
  
  public ValueElement getPermissionRequired() {
    return getOrCreateProperty("PermissionRequired", "PermissionRequired", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPostalCode() {
    return getOrCreateProperty("PostalCode", "PostalCode", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getValidationLevel() {
    return getOrCreateProperty("ValidationLevel", "ValidationLevel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public VehiclesLV getVehiclesLV() {
    return getOrCreateProperty("VehiclesLV", "VehiclesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.class);
  }
  
  public VehiclesLV_tb getVehiclesLV_tb() {
    return getOrCreateProperty("VehiclesLV_tb", "VehiclesLV_tb", null, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV_tb.class);
  }
  
  public ValueElement getWeather() {
    return getOrCreateProperty("Weather", "Weather", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportsLV extends PCFElement {
    public MetroReportsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MetroReportOrderDateHeader getMetroReportOrderDateHeader() {
      return getOrCreateProperty("MetroReportOrderDateHeader", "MetroReportOrderDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.MetroReportOrderDateHeader.class);
    }
    
    public MetroReportStatusHeader getMetroReportStatusHeader() {
      return getOrCreateProperty("MetroReportStatusHeader", "MetroReportStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.MetroReportStatusHeader.class);
    }
    
    public MetroReportTypeHeader getMetroReportTypeHeader() {
      return getOrCreateProperty("MetroReportTypeHeader", "MetroReportTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.MetroReportTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportOrderDateHeader extends ValueElement {
      public MetroReportOrderDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportStatusHeader extends ValueElement {
      public MetroReportStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportTypeHeader extends ValueElement {
      public MetroReportTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral400DV_auto.MetroReportsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportsLV_tb extends PCFElement {
    public MetroReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OfficialsLV extends PCFElement {
    public OfficialsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.NameHeader.class);
    }
    
    public ReportNumberHeader getReportNumberHeader() {
      return getOrCreateProperty("ReportNumberHeader", "ReportNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.ReportNumberHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReportNumberHeader extends ValueElement {
      public ReportNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral400DV_auto.OfficialsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OfficialsLV_tb extends PCFElement {
    public OfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehiclesLV extends PCFElement {
    public VehiclesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DriverHeader getDriverHeader() {
      return getOrCreateProperty("DriverHeader", "DriverHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.DriverHeader.class);
    }
    
    public LicenseHeader getLicenseHeader() {
      return getOrCreateProperty("LicenseHeader", "LicenseHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.LicenseHeader.class);
    }
    
    public LossPartyHeader getLossPartyHeader() {
      return getOrCreateProperty("LossPartyHeader", "LossPartyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.LossPartyHeader.class);
    }
    
    public MakeHeader getMakeHeader() {
      return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.MakeHeader.class);
    }
    
    public ModelHeader getModelHeader() {
      return getOrCreateProperty("ModelHeader", "ModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.ModelHeader.class);
    }
    
    public StateHeader getStateHeader() {
      return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.StateHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DriverHeader extends ValueElement {
      public DriverHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LicenseHeader extends ValueElement {
      public LicenseHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossPartyHeader extends ValueElement {
      public LossPartyHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MakeHeader extends ValueElement {
      public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ModelHeader extends ValueElement {
      public ModelHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StateHeader extends ValueElement {
      public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public Make getMake() {
        return getOrCreateProperty("Make", "Make", null, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.entry.Make.class);
      }
      
      public Model getModel() {
        return getOrCreateProperty("Model", "Model", null, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.entry.Model.class);
      }
      
      public ValueElement getState() {
        return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral400DV_auto.VehiclesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Make extends ValueElement {
        public Make(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotVehicleIncidentPopup click() {
          return clickThis(pcftest.ClaimSnapshotVehicleIncidentPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Model extends ValueElement {
        public Model(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotVehicleIncidentPopup click() {
          return clickThis(pcftest.ClaimSnapshotVehicleIncidentPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotGeneral400DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehiclesLV_tb extends PCFElement {
    public VehiclesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}