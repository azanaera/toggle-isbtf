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
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresCardTab;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.ClaimantHeader;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.CoverageHeader;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.FuturePaymentsHeader;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.NumberHeader;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.ReservesHeader;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.TotalPaymentsHeader;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.TypeHeader;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV._ListPaging;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.entry;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.entry._Select;
import pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposuresScreen_500.DeathBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_500.ReplacementServicesTab;
import pcftest.ClaimSnapshotExposuresScreen_500.VocationalBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_500.WageBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_500._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposuresScreen_500 extends ClaimSnapshotExposuresScreen {
  public final static String CHECKSUM = "9b3a97af0e4c3c247bfaa70fb2145627";
  
  public ClaimSnapshotExposuresScreen_500(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotExposure500DV_Baggage getClaimSnapshotExposure500DV_Baggage() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_Baggage", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_Baggage.class);
  }
  
  public ClaimSnapshotExposure500DV_BodilyInjuryDamage getClaimSnapshotExposure500DV_BodilyInjuryDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_BodilyInjuryDamage", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure500DV_GeneralDamage getClaimSnapshotExposure500DV_EmployerLiability() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_EmployerLiability", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure500DV_GeneralDamage getClaimSnapshotExposure500DV_GeneralDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_GeneralDamage", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure500DV_LossOfUseDamage getClaimSnapshotExposure500DV_LossOfUseDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_LossOfUseDamage", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_LossOfUseDamage.class);
  }
  
  public ClaimSnapshotExposure500DV_BodilyInjuryDamage getClaimSnapshotExposure500DV_MedPay() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_MedPay", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure500DV_PIPDamages getClaimSnapshotExposure500DV_PIPDamages() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_PIPDamages", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_PIPDamages.class);
  }
  
  public ClaimSnapshotExposure500DV_PersonalPropertyDamage getClaimSnapshotExposure500DV_PersonalPropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_PersonalPropertyDamage", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_PersonalPropertyDamage.class);
  }
  
  public ClaimSnapshotExposure500DV_PropertyDamage getClaimSnapshotExposure500DV_PropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_PropertyDamage", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_PropertyDamage.class);
  }
  
  public ClaimSnapshotExposure500DV_TowOnly getClaimSnapshotExposure500DV_TowOnly() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_TowOnly", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_TowOnly.class);
  }
  
  public ClaimSnapshotExposure500DV_VehicleDamage getClaimSnapshotExposure500DV_VehicleDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_VehicleDamage", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_VehicleDamage.class);
  }
  
  public ClaimSnapshotExposure500DV_GeneralDamage getClaimSnapshotExposure500DV_default() {
    return getOrCreateProperty("ClaimSnapshotExposure500DV_default", "ClaimSnapshotExposure500DV", null, pcftest.ClaimSnapshotExposure500DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposureDeathBenefits500DV getClaimSnapshotExposureDeathBenefits500DV() {
    return getOrCreateProperty("ClaimSnapshotExposureDeathBenefits500DV", "ClaimSnapshotExposureDeathBenefits500DV", null, pcftest.ClaimSnapshotExposureDeathBenefits500DV.class);
  }
  
  public ClaimSnapshotExposureReplacementServices500DV getClaimSnapshotExposureReplacementServices500DV() {
    return getOrCreateProperty("ClaimSnapshotExposureReplacementServices500DV", "ClaimSnapshotExposureReplacementServices500DV", null, pcftest.ClaimSnapshotExposureReplacementServices500DV.class);
  }
  
  public ClaimSnapshotExposureWageBenefits500DV getClaimSnapshotExposureWageBenefits500DV() {
    return getOrCreateProperty("ClaimSnapshotExposureWageBenefits500DV", "ClaimSnapshotExposureWageBenefits500DV", null, pcftest.ClaimSnapshotExposureWageBenefits500DV.class);
  }
  
  public ClaimSnapshotExposuresCardTab getClaimSnapshotExposuresCardTab() {
    return getOrCreateProperty("ClaimSnapshotExposuresCardTab", "ClaimSnapshotExposuresCardTab", null, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresCardTab.class);
  }
  
  public ClaimSnapshotExposuresLV getClaimSnapshotExposuresLV() {
    return getOrCreateProperty("ClaimSnapshotExposuresLV", "ClaimSnapshotExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.class);
  }
  
  public ClaimSnapshotExposuresVocationalBenefits500DV getClaimSnapshotExposuresVocationalBenefits500DV() {
    return getOrCreateProperty("ClaimSnapshotExposuresVocationalBenefits500DV", "ClaimSnapshotExposuresVocationalBenefits500DV", null, pcftest.ClaimSnapshotExposuresVocationalBenefits500DV.class);
  }
  
  public DeathBenefitsTab getDeathBenefitsTab() {
    return getOrCreateProperty("DeathBenefitsTab", "DeathBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_500.DeathBenefitsTab.class);
  }
  
  public ReplacementServicesTab getReplacementServicesTab() {
    return getOrCreateProperty("ReplacementServicesTab", "ReplacementServicesTab", null, pcftest.ClaimSnapshotExposuresScreen_500.ReplacementServicesTab.class);
  }
  
  public VocationalBenefitsTab getVocationalBenefitsTab() {
    return getOrCreateProperty("VocationalBenefitsTab", "VocationalBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_500.VocationalBenefitsTab.class);
  }
  
  public WageBenefitsTab getWageBenefitsTab() {
    return getOrCreateProperty("WageBenefitsTab", "WageBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_500.WageBenefitsTab.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotExposuresScreen_500._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresCardTab extends ClickableActionElement {
    public ClaimSnapshotExposuresCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresLV extends PCFElement {
    public ClaimSnapshotExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimantHeader getClaimantHeader() {
      return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.ClaimantHeader.class);
    }
    
    public CoverageHeader getCoverageHeader() {
      return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.CoverageHeader.class);
    }
    
    public FuturePaymentsHeader getFuturePaymentsHeader() {
      return getOrCreateProperty("FuturePaymentsHeader", "FuturePaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.FuturePaymentsHeader.class);
    }
    
    public NumberHeader getNumberHeader() {
      return getOrCreateProperty("NumberHeader", "NumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.NumberHeader.class);
    }
    
    public ReservesHeader getReservesHeader() {
      return getOrCreateProperty("ReservesHeader", "ReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.ReservesHeader.class);
    }
    
    public TotalPaymentsHeader getTotalPaymentsHeader() {
      return getOrCreateProperty("TotalPaymentsHeader", "TotalPaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.TotalPaymentsHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimantHeader extends ValueElement {
      public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageHeader extends ValueElement {
      public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FuturePaymentsHeader extends ValueElement {
      public FuturePaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberHeader extends ValueElement {
      public NumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReservesHeader extends ValueElement {
      public ReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalPaymentsHeader extends ValueElement {
      public TotalPaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposuresScreen_500.ClaimSnapshotExposuresLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeathBenefitsTab extends ClickableActionElement {
    public DeathBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReplacementServicesTab extends ClickableActionElement {
    public ReplacementServicesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VocationalBenefitsTab extends ClickableActionElement {
    public VocationalBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WageBenefitsTab extends ClickableActionElement {
    public WageBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExposuresScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}