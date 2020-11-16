package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresCardTab;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.ClaimantHeader;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.CoverageHeader;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.FuturePaymentsHeader;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.NumberHeader;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.ReservesHeader;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.TotalPaymentsHeader;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.TypeHeader;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV._ListPaging;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.entry;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.entry._Select;
import pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposuresScreen_400._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposuresScreen_400 extends ClaimSnapshotExposuresScreen {
  public final static String CHECKSUM = "5aba7d33e88ea1cb2aee89054ed0e763";
  
  public ClaimSnapshotExposuresScreen_400(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotExposure400DV_BodilyInjuryDamage getClaimSnapshotExposure400DV_BodilyInjuryDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_BodilyInjuryDamage", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure400DV_GeneralDamage getClaimSnapshotExposure400DV_EmployerLiability() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_EmployerLiability", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure400DV_GeneralDamage getClaimSnapshotExposure400DV_GeneralDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_GeneralDamage", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure400DV_LossOfUseDamage getClaimSnapshotExposure400DV_LossOfUseDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_LossOfUseDamage", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_LossOfUseDamage.class);
  }
  
  public ClaimSnapshotExposure400DV_BodilyInjuryDamage getClaimSnapshotExposure400DV_MedPay() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_MedPay", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure400DV_PIPDamages getClaimSnapshotExposure400DV_PIPDamages() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_PIPDamages", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_PIPDamages.class);
  }
  
  public ClaimSnapshotExposure400DV_PersonalPropertyDamage getClaimSnapshotExposure400DV_PersonalPropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_PersonalPropertyDamage", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_PersonalPropertyDamage.class);
  }
  
  public ClaimSnapshotExposure400DV_PropertyDamage getClaimSnapshotExposure400DV_PropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_PropertyDamage", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_PropertyDamage.class);
  }
  
  public ClaimSnapshotExposure400DV_Theft getClaimSnapshotExposure400DV_Theft() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_Theft", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_Theft.class);
  }
  
  public ClaimSnapshotExposure400DV_TowOnly getClaimSnapshotExposure400DV_TowOnly() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_TowOnly", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_TowOnly.class);
  }
  
  public ClaimSnapshotExposure400DV_VehicleDamage getClaimSnapshotExposure400DV_VehicleDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_VehicleDamage", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_VehicleDamage.class);
  }
  
  public ClaimSnapshotExposure400DV_GeneralDamage getClaimSnapshotExposure400DV_default() {
    return getOrCreateProperty("ClaimSnapshotExposure400DV_default", "ClaimSnapshotExposure400DV", null, pcftest.ClaimSnapshotExposure400DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposuresCardTab getClaimSnapshotExposuresCardTab() {
    return getOrCreateProperty("ClaimSnapshotExposuresCardTab", "ClaimSnapshotExposuresCardTab", null, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresCardTab.class);
  }
  
  public ClaimSnapshotExposuresLV getClaimSnapshotExposuresLV() {
    return getOrCreateProperty("ClaimSnapshotExposuresLV", "ClaimSnapshotExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotExposuresScreen_400._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresCardTab extends ClickableActionElement {
    public ClaimSnapshotExposuresCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresLV extends PCFElement {
    public ClaimSnapshotExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimantHeader getClaimantHeader() {
      return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.ClaimantHeader.class);
    }
    
    public CoverageHeader getCoverageHeader() {
      return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.CoverageHeader.class);
    }
    
    public FuturePaymentsHeader getFuturePaymentsHeader() {
      return getOrCreateProperty("FuturePaymentsHeader", "FuturePaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.FuturePaymentsHeader.class);
    }
    
    public NumberHeader getNumberHeader() {
      return getOrCreateProperty("NumberHeader", "NumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.NumberHeader.class);
    }
    
    public ReservesHeader getReservesHeader() {
      return getOrCreateProperty("ReservesHeader", "ReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.ReservesHeader.class);
    }
    
    public TotalPaymentsHeader getTotalPaymentsHeader() {
      return getOrCreateProperty("TotalPaymentsHeader", "TotalPaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.TotalPaymentsHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimantHeader extends ValueElement {
      public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageHeader extends ValueElement {
      public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FuturePaymentsHeader extends ValueElement {
      public FuturePaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberHeader extends ValueElement {
      public NumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReservesHeader extends ValueElement {
      public ReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalPaymentsHeader extends ValueElement {
      public TotalPaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getClaimant() {
        return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCoverage() {
        return getOrCreateProperty("Coverage", "Coverage", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getFuturePayments() {
        return getOrCreateProperty("FuturePayments", "FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNumber() {
        return getOrCreateProperty("Number", "Number", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getReserves() {
        return getOrCreateProperty("Reserves", "Reserves", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTotalPayments() {
        return getOrCreateProperty("TotalPayments", "TotalPayments", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getType() {
        return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposuresScreen_400.ClaimSnapshotExposuresLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}