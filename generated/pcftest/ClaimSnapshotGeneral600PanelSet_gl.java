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
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV_tb;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.MetroReportOrderDateHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.MetroReportStatusHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.MetroReportTypeHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV_tb;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.NameHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.ReportNumberHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.TypeHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV_tb;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV_tb;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.DriverHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.LicenseHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.LossPartyHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.ModelHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.StateHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.entry.Model;
import pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral600PanelSet_gl extends ClaimSnapshotGeneral600PanelSet {
  public final static String CHECKSUM = "ada9ce43c73390bb1a8061186caa580f";
  
  public ClaimSnapshotGeneral600PanelSet_gl(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneral600DV getClaimSnapshotGeneral600DV() {
    return getOrCreateProperty("ClaimSnapshotGeneral600DV", "ClaimSnapshotGeneral600DV", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral600DV extends DetailViewElement {
    public ClaimSnapshotGeneral600DV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressSnapshot600InputSet getAddressSnapshot600InputSet() {
      return getOrCreateProperty("AddressSnapshot600InputSet", "AddressSnapshot600InputSet", null, pcftest.AddressSnapshot600InputSet.class);
    }
    
    public ValueElement getAtFaultPercentage() {
      return getOrCreateProperty("AtFaultPercentage", "AtFaultPercentage", null, gw.smoketest.platform.web.ValueElement.class);
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
      return getOrCreateProperty("InjuriesLV", "InjuriesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.class);
    }
    
    public InjuriesLV_tb getInjuriesLV_tb() {
      return getOrCreateProperty("InjuriesLV_tb", "InjuriesLV_tb", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV_tb.class);
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
    
    public ValueElement getManifestationDate() {
      return getOrCreateProperty("ManifestationDate", "ManifestationDate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MetroReportsLV getMetroReportsLV() {
      return getOrCreateProperty("MetroReportsLV", "MetroReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.class);
    }
    
    public MetroReportsLV_tb getMetroReportsLV_tb() {
      return getOrCreateProperty("MetroReportsLV_tb", "MetroReportsLV_tb", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV_tb.class);
    }
    
    public OfficialsLV getOfficialsLV() {
      return getOrCreateProperty("OfficialsLV", "OfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.class);
    }
    
    public OfficialsLV_tb getOfficialsLV_tb() {
      return getOrCreateProperty("OfficialsLV_tb", "OfficialsLV_tb", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV_tb.class);
    }
    
    public ValueElement getPermissionRequired() {
      return getOrCreateProperty("PermissionRequired", "PermissionRequired", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PropertiesLV getPropertiesLV() {
      return getOrCreateProperty("PropertiesLV", "PropertiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.class);
    }
    
    public PropertiesLV_tb getPropertiesLV_tb() {
      return getOrCreateProperty("PropertiesLV_tb", "PropertiesLV_tb", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV_tb.class);
    }
    
    public DateElement getReportedDate() {
      return getOrCreateProperty("ReportedDate", "ReportedDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getReporter() {
      return getOrCreateProperty("Reporter", "Reporter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getValidationLevel() {
      return getOrCreateProperty("ValidationLevel", "ValidationLevel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public VehiclesLV getVehiclesLV() {
      return getOrCreateProperty("VehiclesLV", "VehiclesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.class);
    }
    
    public VehiclesLV_tb getVehiclesLV_tb() {
      return getOrCreateProperty("VehiclesLV_tb", "VehiclesLV_tb", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InjuriesLV extends PCFElement {
      public InjuriesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.DescriptionHeader getDescriptionHeader() {
        return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.DescriptionHeader.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.MakeHeader getMakeHeader() {
        return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.MakeHeader.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.SeverityHeader getSeverityHeader() {
        return getOrCreateProperty("SeverityHeader", "SeverityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.SeverityHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DescriptionHeader extends ValueElement {
        public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MakeHeader extends ValueElement {
        public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SeverityHeader extends ValueElement {
        public SeverityHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.entry.Make getMake() {
          return getOrCreateProperty("Make", "Make", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.entry.Make.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.entry.Severity getSeverity() {
          return getOrCreateProperty("Severity", "Severity", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.entry.Severity.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.InjuriesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Make extends ValueElement {
          public Make(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotInjuryIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotInjuryIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Severity extends ValueElement {
          public Severity(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotInjuryIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotInjuryIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InjuriesLV_tb extends PCFElement {
      public InjuriesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportsLV extends PCFElement {
      public MetroReportsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MetroReportOrderDateHeader getMetroReportOrderDateHeader() {
        return getOrCreateProperty("MetroReportOrderDateHeader", "MetroReportOrderDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.MetroReportOrderDateHeader.class);
      }
      
      public MetroReportStatusHeader getMetroReportStatusHeader() {
        return getOrCreateProperty("MetroReportStatusHeader", "MetroReportStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.MetroReportStatusHeader.class);
      }
      
      public MetroReportTypeHeader getMetroReportTypeHeader() {
        return getOrCreateProperty("MetroReportTypeHeader", "MetroReportTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.MetroReportTypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MetroReportOrderDateHeader extends ValueElement {
        public MetroReportOrderDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MetroReportStatusHeader extends ValueElement {
        public MetroReportStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MetroReportTypeHeader extends ValueElement {
        public MetroReportTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.MetroReportsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportsLV_tb extends PCFElement {
      public MetroReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OfficialsLV extends PCFElement {
      public OfficialsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NameHeader getNameHeader() {
        return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.NameHeader.class);
      }
      
      public ReportNumberHeader getReportNumberHeader() {
        return getOrCreateProperty("ReportNumberHeader", "ReportNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.ReportNumberHeader.class);
      }
      
      public TypeHeader getTypeHeader() {
        return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.TypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameHeader extends ValueElement {
        public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReportNumberHeader extends ValueElement {
        public ReportNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TypeHeader extends ValueElement {
        public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.OfficialsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OfficialsLV_tb extends PCFElement {
      public OfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertiesLV extends PCFElement {
      public PropertiesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.DescriptionHeader getDescriptionHeader() {
        return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.DescriptionHeader.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.MakeHeader getMakeHeader() {
        return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.MakeHeader.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.SeverityHeader getSeverityHeader() {
        return getOrCreateProperty("SeverityHeader", "SeverityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.SeverityHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DescriptionHeader extends ValueElement {
        public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MakeHeader extends ValueElement {
        public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SeverityHeader extends ValueElement {
        public SeverityHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.entry.Make getMake() {
          return getOrCreateProperty("Make", "Make", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.entry.Make.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.entry.Severity getSeverity() {
          return getOrCreateProperty("Severity", "Severity", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.entry.Severity.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.PropertiesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Make extends ValueElement {
          public Make(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotFixedPropertyIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotFixedPropertyIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Severity extends ValueElement {
          public Severity(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotFixedPropertyIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotFixedPropertyIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertiesLV_tb extends PCFElement {
      public PropertiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VehiclesLV extends PCFElement {
      public VehiclesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DriverHeader getDriverHeader() {
        return getOrCreateProperty("DriverHeader", "DriverHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.DriverHeader.class);
      }
      
      public LicenseHeader getLicenseHeader() {
        return getOrCreateProperty("LicenseHeader", "LicenseHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.LicenseHeader.class);
      }
      
      public LossPartyHeader getLossPartyHeader() {
        return getOrCreateProperty("LossPartyHeader", "LossPartyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.LossPartyHeader.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.MakeHeader getMakeHeader() {
        return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.MakeHeader.class);
      }
      
      public ModelHeader getModelHeader() {
        return getOrCreateProperty("ModelHeader", "ModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.ModelHeader.class);
      }
      
      public StateHeader getStateHeader() {
        return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.StateHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DriverHeader extends ValueElement {
        public DriverHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LicenseHeader extends ValueElement {
        public LicenseHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LossPartyHeader extends ValueElement {
        public LossPartyHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MakeHeader extends ValueElement {
        public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ModelHeader extends ValueElement {
        public ModelHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StateHeader extends ValueElement {
        public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.entry.Make getMake() {
          return getOrCreateProperty("Make", "Make", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.entry.Make.class);
        }
        
        public Model getModel() {
          return getOrCreateProperty("Model", "Model", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.entry.Model.class);
        }
        
        public ValueElement getState() {
          return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral600PanelSet_gl.ClaimSnapshotGeneral600DV.VehiclesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Make extends ValueElement {
          public Make(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotVehicleIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotVehicleIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Model extends ValueElement {
          public Model(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSnapshotVehicleIncidentPopup click() {
            return clickThis(pcftest.ClaimSnapshotVehicleIncidentPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VehiclesLV_tb extends PCFElement {
      public VehiclesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}