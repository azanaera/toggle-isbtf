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
import pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresCardTab;
import pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV;
import pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.ClaimantHeader;
import pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.CoverageHeader;
import pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.NumberHeader;
import pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.TypeHeader;
import pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV._ListPaging;
import pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.entry;
import pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.entry._Select;
import pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposuresScreen_800.DeathBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_800.ReplacementServicesTab;
import pcftest.ClaimSnapshotExposuresScreen_800.VocationalBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_800.WageBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_800._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposuresScreen_800 extends ClaimSnapshotExposuresScreen {
  public final static String CHECKSUM = "8e73c3425d3b7553862550d6f75ee72e";
  
  public ClaimSnapshotExposuresScreen_800(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotExposure800DV_Baggage getClaimSnapshotExposure800DV_Baggage() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_Baggage", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_Baggage.class);
  }
  
  public ClaimSnapshotExposure800DV_BodilyInjuryDamage getClaimSnapshotExposure800DV_BodilyInjuryDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_BodilyInjuryDamage", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure800DV_Content getClaimSnapshotExposure800DV_Content() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_Content", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_Content.class);
  }
  
  public ClaimSnapshotExposure800DV_Dwelling getClaimSnapshotExposure800DV_Dwelling() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_Dwelling", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_Dwelling.class);
  }
  
  public ClaimSnapshotExposure800DV_GeneralDamage getClaimSnapshotExposure800DV_EmployerLiability() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_EmployerLiability", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure800DV_GeneralDamage getClaimSnapshotExposure800DV_GeneralDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_GeneralDamage", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure800DV_LivingExpenses getClaimSnapshotExposure800DV_LivingExpenses() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_LivingExpenses", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_LivingExpenses.class);
  }
  
  public ClaimSnapshotExposure800DV_LossOfUseDamage getClaimSnapshotExposure800DV_LossOfUseDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_LossOfUseDamage", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_LossOfUseDamage.class);
  }
  
  public ClaimSnapshotExposure800DV_BodilyInjuryDamage getClaimSnapshotExposure800DV_MedPay() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_MedPay", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure800DV_OtherStructure getClaimSnapshotExposure800DV_OtherStructure() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_OtherStructure", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_OtherStructure.class);
  }
  
  public ClaimSnapshotExposure800DV_PIPDamages getClaimSnapshotExposure800DV_PIPDamages() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_PIPDamages", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_PIPDamages.class);
  }
  
  public ClaimSnapshotExposure800DV_PersonalPropertyDamage getClaimSnapshotExposure800DV_PersonalPropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_PersonalPropertyDamage", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_PersonalPropertyDamage.class);
  }
  
  public ClaimSnapshotExposure800DV_PropertyDamage getClaimSnapshotExposure800DV_PropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_PropertyDamage", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_PropertyDamage.class);
  }
  
  public ClaimSnapshotExposure800DV_TowOnly getClaimSnapshotExposure800DV_TowOnly() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_TowOnly", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_TowOnly.class);
  }
  
  public ClaimSnapshotExposure800DV_TripCancellationDelay getClaimSnapshotExposure800DV_TripCancellationDelay() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_TripCancellationDelay", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_TripCancellationDelay.class);
  }
  
  public ClaimSnapshotExposure800DV_VehicleDamage getClaimSnapshotExposure800DV_VehicleDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_VehicleDamage", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_VehicleDamage.class);
  }
  
  public ClaimSnapshotExposure800DV_GeneralDamage getClaimSnapshotExposure800DV_default() {
    return getOrCreateProperty("ClaimSnapshotExposure800DV_default", "ClaimSnapshotExposure800DV", null, pcftest.ClaimSnapshotExposure800DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposureDeathBenefits800DV getClaimSnapshotExposureDeathBenefits800DV() {
    return getOrCreateProperty("ClaimSnapshotExposureDeathBenefits800DV", "ClaimSnapshotExposureDeathBenefits800DV", null, pcftest.ClaimSnapshotExposureDeathBenefits800DV.class);
  }
  
  public ClaimSnapshotExposureReplacementServices800DV getClaimSnapshotExposureReplacementServices800DV() {
    return getOrCreateProperty("ClaimSnapshotExposureReplacementServices800DV", "ClaimSnapshotExposureReplacementServices800DV", null, pcftest.ClaimSnapshotExposureReplacementServices800DV.class);
  }
  
  public ClaimSnapshotExposureWageBenefits800DV getClaimSnapshotExposureWageBenefits800DV() {
    return getOrCreateProperty("ClaimSnapshotExposureWageBenefits800DV", "ClaimSnapshotExposureWageBenefits800DV", null, pcftest.ClaimSnapshotExposureWageBenefits800DV.class);
  }
  
  public ClaimSnapshotExposuresCardTab getClaimSnapshotExposuresCardTab() {
    return getOrCreateProperty("ClaimSnapshotExposuresCardTab", "ClaimSnapshotExposuresCardTab", null, pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresCardTab.class);
  }
  
  public ClaimSnapshotExposuresLV getClaimSnapshotExposuresLV() {
    return getOrCreateProperty("ClaimSnapshotExposuresLV", "ClaimSnapshotExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.class);
  }
  
  public ClaimSnapshotExposuresVocationalBenefits800DV getClaimSnapshotExposuresVocationalBenefits800DV() {
    return getOrCreateProperty("ClaimSnapshotExposuresVocationalBenefits800DV", "ClaimSnapshotExposuresVocationalBenefits800DV", null, pcftest.ClaimSnapshotExposuresVocationalBenefits800DV.class);
  }
  
  public DeathBenefitsTab getDeathBenefitsTab() {
    return getOrCreateProperty("DeathBenefitsTab", "DeathBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_800.DeathBenefitsTab.class);
  }
  
  public ReplacementServicesTab getReplacementServicesTab() {
    return getOrCreateProperty("ReplacementServicesTab", "ReplacementServicesTab", null, pcftest.ClaimSnapshotExposuresScreen_800.ReplacementServicesTab.class);
  }
  
  public VocationalBenefitsTab getVocationalBenefitsTab() {
    return getOrCreateProperty("VocationalBenefitsTab", "VocationalBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_800.VocationalBenefitsTab.class);
  }
  
  public WageBenefitsTab getWageBenefitsTab() {
    return getOrCreateProperty("WageBenefitsTab", "WageBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_800.WageBenefitsTab.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotExposuresScreen_800._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresCardTab extends ClickableActionElement {
    public ClaimSnapshotExposuresCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresLV extends PCFElement {
    public ClaimSnapshotExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimantHeader getClaimantHeader() {
      return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.ClaimantHeader.class);
    }
    
    public CoverageHeader getCoverageHeader() {
      return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.CoverageHeader.class);
    }
    
    public NumberHeader getNumberHeader() {
      return getOrCreateProperty("NumberHeader", "NumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.NumberHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimantHeader extends ValueElement {
      public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageHeader extends ValueElement {
      public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberHeader extends ValueElement {
      public NumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposuresScreen_800.ClaimSnapshotExposuresLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeathBenefitsTab extends ClickableActionElement {
    public DeathBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReplacementServicesTab extends ClickableActionElement {
    public ReplacementServicesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VocationalBenefitsTab extends ClickableActionElement {
    public VocationalBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WageBenefitsTab extends ClickableActionElement {
    public WageBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposuresScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}