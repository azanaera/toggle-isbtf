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
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV;
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.ContactNameHeader;
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.ContactPhoneHeader;
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.InsurerHeader;
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.NotesHeader;
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.PolicyNumberHeader;
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV._ListPaging;
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.entry;
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.entry._Select;
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure400DV_GeneralDamage extends ClaimSnapshotExposure400DV {
  public final static String CHECKSUM = "13321a915eaf9048c995ae2c70b2aa0d";
  
  public ClaimSnapshotExposure400DV_GeneralDamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossEstimate() {
    return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getOtherCoverage() {
    return getOrCreateProperty("OtherCoverage", "OtherCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public OtherCoverageDetLV getOtherCoverageDetLV() {
    return getOrCreateProperty("OtherCoverageDetLV", "OtherCoverageDetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.class);
  }
  
  public OtherCoverageDetLV_tb getOtherCoverageDetLV_tb() {
    return getOrCreateProperty("OtherCoverageDetLV_tb", "OtherCoverageDetLV_tb", null, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV_tb.class);
  }
  
  public ValueElement getPrimaryAddress() {
    return getOrCreateProperty("PrimaryAddress", "PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryCoverage() {
    return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSeverity() {
    return getOrCreateProperty("Severity", "Severity", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStatLine() {
    return getOrCreateProperty("StatLine", "StatLine", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherCoverageDetLV extends PCFElement {
    public OtherCoverageDetLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ContactNameHeader getContactNameHeader() {
      return getOrCreateProperty("ContactNameHeader", "ContactNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.ContactNameHeader.class);
    }
    
    public ContactPhoneHeader getContactPhoneHeader() {
      return getOrCreateProperty("ContactPhoneHeader", "ContactPhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.ContactPhoneHeader.class);
    }
    
    public InsurerHeader getInsurerHeader() {
      return getOrCreateProperty("InsurerHeader", "InsurerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.InsurerHeader.class);
    }
    
    public NotesHeader getNotesHeader() {
      return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.NotesHeader.class);
    }
    
    public PolicyNumberHeader getPolicyNumberHeader() {
      return getOrCreateProperty("PolicyNumberHeader", "PolicyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.PolicyNumberHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactNameHeader extends ValueElement {
      public ContactNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactPhoneHeader extends ValueElement {
      public ContactPhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InsurerHeader extends ValueElement {
      public InsurerHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesHeader extends ValueElement {
      public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyNumberHeader extends ValueElement {
      public PolicyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.OtherCoverageDetLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.GeneralDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherCoverageDetLV_tb extends PCFElement {
    public OtherCoverageDetLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}