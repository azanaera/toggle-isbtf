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
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresCardTab;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.ClaimantHeader;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.CoverageHeader;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.FuturePaymentsHeader;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.NumberHeader;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.ReservesHeader;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.TotalPaymentsHeader;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.TypeHeader;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV._ListPaging;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.entry;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.entry._Select;
import pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposuresScreen_300._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposuresScreen_300 extends ClaimSnapshotExposuresScreen {
  public final static String CHECKSUM = "060ea81ad5b2cef062d7c09aa1b57b86";
  
  public ClaimSnapshotExposuresScreen_300(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotExposure300DV_BodilyInjuryDamage getClaimSnapshotExposure300DV_BodilyInjuryDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure300DV_BodilyInjuryDamage", "ClaimSnapshotExposure300DV", null, pcftest.ClaimSnapshotExposure300DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure300DV_GeneralDamage getClaimSnapshotExposure300DV_EmployerLiability() {
    return getOrCreateProperty("ClaimSnapshotExposure300DV_EmployerLiability", "ClaimSnapshotExposure300DV", null, pcftest.ClaimSnapshotExposure300DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure300DV_GeneralDamage getClaimSnapshotExposure300DV_GeneralDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure300DV_GeneralDamage", "ClaimSnapshotExposure300DV", null, pcftest.ClaimSnapshotExposure300DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure300DV_LossOfUseDamage getClaimSnapshotExposure300DV_LossOfUseDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure300DV_LossOfUseDamage", "ClaimSnapshotExposure300DV", null, pcftest.ClaimSnapshotExposure300DV_LossOfUseDamage.class);
  }
  
  public ClaimSnapshotExposure300DV_PIPDamages getClaimSnapshotExposure300DV_PIPDamages() {
    return getOrCreateProperty("ClaimSnapshotExposure300DV_PIPDamages", "ClaimSnapshotExposure300DV", null, pcftest.ClaimSnapshotExposure300DV_PIPDamages.class);
  }
  
  public ClaimSnapshotExposure300DV_PersonalPropertyDamage getClaimSnapshotExposure300DV_PersonalPropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure300DV_PersonalPropertyDamage", "ClaimSnapshotExposure300DV", null, pcftest.ClaimSnapshotExposure300DV_PersonalPropertyDamage.class);
  }
  
  public ClaimSnapshotExposure300DV_PropertyDamage getClaimSnapshotExposure300DV_PropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure300DV_PropertyDamage", "ClaimSnapshotExposure300DV", null, pcftest.ClaimSnapshotExposure300DV_PropertyDamage.class);
  }
  
  public ClaimSnapshotExposure300DV_VehicleDamage getClaimSnapshotExposure300DV_VehicleDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure300DV_VehicleDamage", "ClaimSnapshotExposure300DV", null, pcftest.ClaimSnapshotExposure300DV_VehicleDamage.class);
  }
  
  public ClaimSnapshotExposure300DV_GeneralDamage getClaimSnapshotExposure300DV_default() {
    return getOrCreateProperty("ClaimSnapshotExposure300DV_default", "ClaimSnapshotExposure300DV", null, pcftest.ClaimSnapshotExposure300DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposuresCardTab getClaimSnapshotExposuresCardTab() {
    return getOrCreateProperty("ClaimSnapshotExposuresCardTab", "ClaimSnapshotExposuresCardTab", null, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresCardTab.class);
  }
  
  public ClaimSnapshotExposuresLV getClaimSnapshotExposuresLV() {
    return getOrCreateProperty("ClaimSnapshotExposuresLV", "ClaimSnapshotExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotExposuresScreen_300._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresCardTab extends ClickableActionElement {
    public ClaimSnapshotExposuresCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresLV extends PCFElement {
    public ClaimSnapshotExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimantHeader getClaimantHeader() {
      return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.ClaimantHeader.class);
    }
    
    public CoverageHeader getCoverageHeader() {
      return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.CoverageHeader.class);
    }
    
    public FuturePaymentsHeader getFuturePaymentsHeader() {
      return getOrCreateProperty("FuturePaymentsHeader", "FuturePaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.FuturePaymentsHeader.class);
    }
    
    public NumberHeader getNumberHeader() {
      return getOrCreateProperty("NumberHeader", "NumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.NumberHeader.class);
    }
    
    public ReservesHeader getReservesHeader() {
      return getOrCreateProperty("ReservesHeader", "ReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.ReservesHeader.class);
    }
    
    public TotalPaymentsHeader getTotalPaymentsHeader() {
      return getOrCreateProperty("TotalPaymentsHeader", "TotalPaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.TotalPaymentsHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimantHeader extends ValueElement {
      public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageHeader extends ValueElement {
      public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FuturePaymentsHeader extends ValueElement {
      public FuturePaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberHeader extends ValueElement {
      public NumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReservesHeader extends ValueElement {
      public ReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalPaymentsHeader extends ValueElement {
      public TotalPaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposuresScreen_300.ClaimSnapshotExposuresLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}