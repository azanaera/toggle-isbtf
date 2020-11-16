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
import pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresCardTab;
import pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV;
import pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.ClaimantHeader;
import pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.CoverageHeader;
import pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.NumberHeader;
import pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.TypeHeader;
import pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV._ListPaging;
import pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.entry;
import pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.entry._Select;
import pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposuresScreen_600.DeathBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_600.ReplacementServicesTab;
import pcftest.ClaimSnapshotExposuresScreen_600.VocationalBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_600.WageBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_600._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposuresScreen_600 extends ClaimSnapshotExposuresScreen {
  public final static String CHECKSUM = "1536f3a3397156bd71769406fd37d6ec";
  
  public ClaimSnapshotExposuresScreen_600(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotExposure600DV_Baggage getClaimSnapshotExposure600DV_Baggage() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_Baggage", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_Baggage.class);
  }
  
  public ClaimSnapshotExposure600DV_BodilyInjuryDamage getClaimSnapshotExposure600DV_BodilyInjuryDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_BodilyInjuryDamage", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure600DV_Content getClaimSnapshotExposure600DV_Content() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_Content", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_Content.class);
  }
  
  public ClaimSnapshotExposure600DV_Dwelling getClaimSnapshotExposure600DV_Dwelling() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_Dwelling", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_Dwelling.class);
  }
  
  public ClaimSnapshotExposure600DV_GeneralDamage getClaimSnapshotExposure600DV_EmployerLiability() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_EmployerLiability", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure600DV_GeneralDamage getClaimSnapshotExposure600DV_GeneralDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_GeneralDamage", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure600DV_LivingExpenses getClaimSnapshotExposure600DV_LivingExpenses() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_LivingExpenses", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_LivingExpenses.class);
  }
  
  public ClaimSnapshotExposure600DV_LossOfUseDamage getClaimSnapshotExposure600DV_LossOfUseDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_LossOfUseDamage", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_LossOfUseDamage.class);
  }
  
  public ClaimSnapshotExposure600DV_BodilyInjuryDamage getClaimSnapshotExposure600DV_MedPay() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_MedPay", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure600DV_OtherStructure getClaimSnapshotExposure600DV_OtherStructure() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_OtherStructure", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_OtherStructure.class);
  }
  
  public ClaimSnapshotExposure600DV_PIPDamages getClaimSnapshotExposure600DV_PIPDamages() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_PIPDamages", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_PIPDamages.class);
  }
  
  public ClaimSnapshotExposure600DV_PersonalPropertyDamage getClaimSnapshotExposure600DV_PersonalPropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_PersonalPropertyDamage", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_PersonalPropertyDamage.class);
  }
  
  public ClaimSnapshotExposure600DV_PropertyDamage getClaimSnapshotExposure600DV_PropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_PropertyDamage", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_PropertyDamage.class);
  }
  
  public ClaimSnapshotExposure600DV_TowOnly getClaimSnapshotExposure600DV_TowOnly() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_TowOnly", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_TowOnly.class);
  }
  
  public ClaimSnapshotExposure600DV_TripCancellationDelay getClaimSnapshotExposure600DV_TripCancellationDelay() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_TripCancellationDelay", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_TripCancellationDelay.class);
  }
  
  public ClaimSnapshotExposure600DV_VehicleDamage getClaimSnapshotExposure600DV_VehicleDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_VehicleDamage", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_VehicleDamage.class);
  }
  
  public ClaimSnapshotExposure600DV_GeneralDamage getClaimSnapshotExposure600DV_default() {
    return getOrCreateProperty("ClaimSnapshotExposure600DV_default", "ClaimSnapshotExposure600DV", null, pcftest.ClaimSnapshotExposure600DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposureDeathBenefits600DV getClaimSnapshotExposureDeathBenefits600DV() {
    return getOrCreateProperty("ClaimSnapshotExposureDeathBenefits600DV", "ClaimSnapshotExposureDeathBenefits600DV", null, pcftest.ClaimSnapshotExposureDeathBenefits600DV.class);
  }
  
  public ClaimSnapshotExposureReplacementServices600DV getClaimSnapshotExposureReplacementServices600DV() {
    return getOrCreateProperty("ClaimSnapshotExposureReplacementServices600DV", "ClaimSnapshotExposureReplacementServices600DV", null, pcftest.ClaimSnapshotExposureReplacementServices600DV.class);
  }
  
  public ClaimSnapshotExposureWageBenefits600DV getClaimSnapshotExposureWageBenefits600DV() {
    return getOrCreateProperty("ClaimSnapshotExposureWageBenefits600DV", "ClaimSnapshotExposureWageBenefits600DV", null, pcftest.ClaimSnapshotExposureWageBenefits600DV.class);
  }
  
  public ClaimSnapshotExposuresCardTab getClaimSnapshotExposuresCardTab() {
    return getOrCreateProperty("ClaimSnapshotExposuresCardTab", "ClaimSnapshotExposuresCardTab", null, pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresCardTab.class);
  }
  
  public ClaimSnapshotExposuresLV getClaimSnapshotExposuresLV() {
    return getOrCreateProperty("ClaimSnapshotExposuresLV", "ClaimSnapshotExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.class);
  }
  
  public ClaimSnapshotExposuresVocationalBenefits600DV getClaimSnapshotExposuresVocationalBenefits600DV() {
    return getOrCreateProperty("ClaimSnapshotExposuresVocationalBenefits600DV", "ClaimSnapshotExposuresVocationalBenefits600DV", null, pcftest.ClaimSnapshotExposuresVocationalBenefits600DV.class);
  }
  
  public DeathBenefitsTab getDeathBenefitsTab() {
    return getOrCreateProperty("DeathBenefitsTab", "DeathBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_600.DeathBenefitsTab.class);
  }
  
  public ReplacementServicesTab getReplacementServicesTab() {
    return getOrCreateProperty("ReplacementServicesTab", "ReplacementServicesTab", null, pcftest.ClaimSnapshotExposuresScreen_600.ReplacementServicesTab.class);
  }
  
  public VocationalBenefitsTab getVocationalBenefitsTab() {
    return getOrCreateProperty("VocationalBenefitsTab", "VocationalBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_600.VocationalBenefitsTab.class);
  }
  
  public WageBenefitsTab getWageBenefitsTab() {
    return getOrCreateProperty("WageBenefitsTab", "WageBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_600.WageBenefitsTab.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotExposuresScreen_600._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresCardTab extends ClickableActionElement {
    public ClaimSnapshotExposuresCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresLV extends PCFElement {
    public ClaimSnapshotExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimantHeader getClaimantHeader() {
      return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.ClaimantHeader.class);
    }
    
    public CoverageHeader getCoverageHeader() {
      return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.CoverageHeader.class);
    }
    
    public NumberHeader getNumberHeader() {
      return getOrCreateProperty("NumberHeader", "NumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.NumberHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimantHeader extends ValueElement {
      public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageHeader extends ValueElement {
      public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberHeader extends ValueElement {
      public NumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public ValueElement getNumber() {
        return getOrCreateProperty("Number", "Number", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getType() {
        return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposuresScreen_600.ClaimSnapshotExposuresLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeathBenefitsTab extends ClickableActionElement {
    public DeathBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReplacementServicesTab extends ClickableActionElement {
    public ReplacementServicesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VocationalBenefitsTab extends ClickableActionElement {
    public VocationalBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WageBenefitsTab extends ClickableActionElement {
    public WageBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotExposuresScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}