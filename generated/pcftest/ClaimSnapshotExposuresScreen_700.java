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
import pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresCardTab;
import pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV;
import pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.ClaimantHeader;
import pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.CoverageHeader;
import pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.NumberHeader;
import pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.TypeHeader;
import pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV._ListPaging;
import pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.entry;
import pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.entry._Select;
import pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposuresScreen_700.DeathBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_700.ReplacementServicesTab;
import pcftest.ClaimSnapshotExposuresScreen_700.VocationalBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_700.WageBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_700._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposuresScreen_700 extends ClaimSnapshotExposuresScreen {
  public final static String CHECKSUM = "ab1de77216ecef4452cfc688070d71ec";
  
  public ClaimSnapshotExposuresScreen_700(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotExposure700DV_Baggage getClaimSnapshotExposure700DV_Baggage() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_Baggage", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_Baggage.class);
  }
  
  public ClaimSnapshotExposure700DV_BodilyInjuryDamage getClaimSnapshotExposure700DV_BodilyInjuryDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_BodilyInjuryDamage", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure700DV_Content getClaimSnapshotExposure700DV_Content() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_Content", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_Content.class);
  }
  
  public ClaimSnapshotExposure700DV_Dwelling getClaimSnapshotExposure700DV_Dwelling() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_Dwelling", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_Dwelling.class);
  }
  
  public ClaimSnapshotExposure700DV_GeneralDamage getClaimSnapshotExposure700DV_EmployerLiability() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_EmployerLiability", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure700DV_GeneralDamage getClaimSnapshotExposure700DV_GeneralDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_GeneralDamage", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposure700DV_LivingExpenses getClaimSnapshotExposure700DV_LivingExpenses() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_LivingExpenses", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_LivingExpenses.class);
  }
  
  public ClaimSnapshotExposure700DV_LossOfUseDamage getClaimSnapshotExposure700DV_LossOfUseDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_LossOfUseDamage", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_LossOfUseDamage.class);
  }
  
  public ClaimSnapshotExposure700DV_BodilyInjuryDamage getClaimSnapshotExposure700DV_MedPay() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_MedPay", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposure700DV_OtherStructure getClaimSnapshotExposure700DV_OtherStructure() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_OtherStructure", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_OtherStructure.class);
  }
  
  public ClaimSnapshotExposure700DV_PIPDamages getClaimSnapshotExposure700DV_PIPDamages() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_PIPDamages", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_PIPDamages.class);
  }
  
  public ClaimSnapshotExposure700DV_PersonalPropertyDamage getClaimSnapshotExposure700DV_PersonalPropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_PersonalPropertyDamage", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_PersonalPropertyDamage.class);
  }
  
  public ClaimSnapshotExposure700DV_PropertyDamage getClaimSnapshotExposure700DV_PropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_PropertyDamage", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_PropertyDamage.class);
  }
  
  public ClaimSnapshotExposure700DV_TowOnly getClaimSnapshotExposure700DV_TowOnly() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_TowOnly", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_TowOnly.class);
  }
  
  public ClaimSnapshotExposure700DV_TripCancellationDelay getClaimSnapshotExposure700DV_TripCancellationDelay() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_TripCancellationDelay", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_TripCancellationDelay.class);
  }
  
  public ClaimSnapshotExposure700DV_VehicleDamage getClaimSnapshotExposure700DV_VehicleDamage() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_VehicleDamage", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_VehicleDamage.class);
  }
  
  public ClaimSnapshotExposure700DV_GeneralDamage getClaimSnapshotExposure700DV_default() {
    return getOrCreateProperty("ClaimSnapshotExposure700DV_default", "ClaimSnapshotExposure700DV", null, pcftest.ClaimSnapshotExposure700DV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposureDeathBenefits700DV getClaimSnapshotExposureDeathBenefits700DV() {
    return getOrCreateProperty("ClaimSnapshotExposureDeathBenefits700DV", "ClaimSnapshotExposureDeathBenefits700DV", null, pcftest.ClaimSnapshotExposureDeathBenefits700DV.class);
  }
  
  public ClaimSnapshotExposureReplacementServices700DV getClaimSnapshotExposureReplacementServices700DV() {
    return getOrCreateProperty("ClaimSnapshotExposureReplacementServices700DV", "ClaimSnapshotExposureReplacementServices700DV", null, pcftest.ClaimSnapshotExposureReplacementServices700DV.class);
  }
  
  public ClaimSnapshotExposureWageBenefits700DV getClaimSnapshotExposureWageBenefits700DV() {
    return getOrCreateProperty("ClaimSnapshotExposureWageBenefits700DV", "ClaimSnapshotExposureWageBenefits700DV", null, pcftest.ClaimSnapshotExposureWageBenefits700DV.class);
  }
  
  public ClaimSnapshotExposuresCardTab getClaimSnapshotExposuresCardTab() {
    return getOrCreateProperty("ClaimSnapshotExposuresCardTab", "ClaimSnapshotExposuresCardTab", null, pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresCardTab.class);
  }
  
  public ClaimSnapshotExposuresLV getClaimSnapshotExposuresLV() {
    return getOrCreateProperty("ClaimSnapshotExposuresLV", "ClaimSnapshotExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.class);
  }
  
  public ClaimSnapshotExposuresVocationalBenefits700DV getClaimSnapshotExposuresVocationalBenefits700DV() {
    return getOrCreateProperty("ClaimSnapshotExposuresVocationalBenefits700DV", "ClaimSnapshotExposuresVocationalBenefits700DV", null, pcftest.ClaimSnapshotExposuresVocationalBenefits700DV.class);
  }
  
  public DeathBenefitsTab getDeathBenefitsTab() {
    return getOrCreateProperty("DeathBenefitsTab", "DeathBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_700.DeathBenefitsTab.class);
  }
  
  public ReplacementServicesTab getReplacementServicesTab() {
    return getOrCreateProperty("ReplacementServicesTab", "ReplacementServicesTab", null, pcftest.ClaimSnapshotExposuresScreen_700.ReplacementServicesTab.class);
  }
  
  public VocationalBenefitsTab getVocationalBenefitsTab() {
    return getOrCreateProperty("VocationalBenefitsTab", "VocationalBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_700.VocationalBenefitsTab.class);
  }
  
  public WageBenefitsTab getWageBenefitsTab() {
    return getOrCreateProperty("WageBenefitsTab", "WageBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_700.WageBenefitsTab.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotExposuresScreen_700._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresCardTab extends ClickableActionElement {
    public ClaimSnapshotExposuresCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresLV extends PCFElement {
    public ClaimSnapshotExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimantHeader getClaimantHeader() {
      return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.ClaimantHeader.class);
    }
    
    public CoverageHeader getCoverageHeader() {
      return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.CoverageHeader.class);
    }
    
    public NumberHeader getNumberHeader() {
      return getOrCreateProperty("NumberHeader", "NumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.NumberHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimantHeader extends ValueElement {
      public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageHeader extends ValueElement {
      public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberHeader extends ValueElement {
      public NumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposuresScreen_700.ClaimSnapshotExposuresLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeathBenefitsTab extends ClickableActionElement {
    public DeathBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReplacementServicesTab extends ClickableActionElement {
    public ReplacementServicesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VocationalBenefitsTab extends ClickableActionElement {
    public VocationalBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WageBenefitsTab extends ClickableActionElement {
    public WageBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposuresScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}