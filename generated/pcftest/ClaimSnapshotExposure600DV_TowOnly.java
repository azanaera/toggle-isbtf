package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.ContactNameHeader;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.ContactPhoneHeader;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.InsurerHeader;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.NotesHeader;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.PolicyNumberHeader;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV._ListPaging;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.entry;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.entry._Select;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV_tb;
import pcftest.ClaimSnapshotExposure600DV_TowOnly.Vehicle_Incident;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure600DV_TowOnly extends ClaimSnapshotExposure600DV {
  public final static String CHECKSUM = "ed274e636e1b813d478c5142a157bce2";
  
  public ClaimSnapshotExposure600DV_TowOnly(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimantAddress() {
    return getOrCreateProperty("ClaimantAddress", "ClaimantAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimantType() {
    return getOrCreateProperty("ClaimantType", "ClaimantType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getContactProhibited() {
    return getOrCreateProperty("ContactProhibited", "ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getCoverage() {
    return getOrCreateProperty("Coverage", "Coverage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCoverageSubType() {
    return getOrCreateProperty("CoverageSubType", "CoverageSubType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getIncident_Description() {
    return getOrCreateProperty("Incident_Description", "Incident_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getIncident_Driver() {
    return getOrCreateProperty("Incident_Driver", "Incident_Driver", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getIncident_LossEstimate() {
    return getOrCreateProperty("Incident_LossEstimate", "Incident_LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getIncident_VehicleOperable() {
    return getOrCreateProperty("Incident_VehicleOperable", "Incident_VehicleOperable", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getOtherCoverage() {
    return getOrCreateProperty("OtherCoverage", "OtherCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public OtherCoverageDetLV getOtherCoverageDetLV() {
    return getOrCreateProperty("OtherCoverageDetLV", "OtherCoverageDetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.class);
  }
  
  public OtherCoverageDetLV_tb getOtherCoverageDetLV_tb() {
    return getOrCreateProperty("OtherCoverageDetLV_tb", "OtherCoverageDetLV_tb", null, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV_tb.class);
  }
  
  public ValueElement getPrimaryCoverage() {
    return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStatLine() {
    return getOrCreateProperty("StatLine", "StatLine", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Vehicle_Incident getVehicle_Incident() {
    return getOrCreateProperty("Vehicle_Incident", "Vehicle_Incident", null, pcftest.ClaimSnapshotExposure600DV_TowOnly.Vehicle_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherCoverageDetLV extends PCFElement {
    public OtherCoverageDetLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ContactNameHeader getContactNameHeader() {
      return getOrCreateProperty("ContactNameHeader", "ContactNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.ContactNameHeader.class);
    }
    
    public ContactPhoneHeader getContactPhoneHeader() {
      return getOrCreateProperty("ContactPhoneHeader", "ContactPhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.ContactPhoneHeader.class);
    }
    
    public InsurerHeader getInsurerHeader() {
      return getOrCreateProperty("InsurerHeader", "InsurerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.InsurerHeader.class);
    }
    
    public NotesHeader getNotesHeader() {
      return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.NotesHeader.class);
    }
    
    public PolicyNumberHeader getPolicyNumberHeader() {
      return getOrCreateProperty("PolicyNumberHeader", "PolicyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.PolicyNumberHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactNameHeader extends ValueElement {
      public ContactNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactPhoneHeader extends ValueElement {
      public ContactPhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InsurerHeader extends ValueElement {
      public InsurerHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesHeader extends ValueElement {
      public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyNumberHeader extends ValueElement {
      public PolicyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getContactName() {
        return getOrCreateProperty("ContactName", "ContactName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getContactPhone() {
        return getOrCreateProperty("ContactPhone", "ContactPhone", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInsurer() {
        return getOrCreateProperty("Insurer", "Insurer", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNotes() {
        return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPolicyNumber() {
        return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposure600DV_TowOnly.OtherCoverageDetLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherCoverageDetLV_tb extends PCFElement {
    public OtherCoverageDetLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Vehicle_Incident extends ValueElement {
    public Vehicle_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSnapshotVehicleIncidentPopup click() {
      return clickThis(pcftest.ClaimSnapshotVehicleIncidentPopup.class);
    }
    
    
  }
  
  
}