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
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresCardTab;
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV;
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.ClaimantHeader;
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.CoverageHeader;
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.CreatedViaHeader;
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.NumberHeader;
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.TypeHeader;
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV._ListPaging;
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.entry;
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.entry._Select;
import pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposuresScreen_default.DeathBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_default.ReplacementServicesTab;
import pcftest.ClaimSnapshotExposuresScreen_default.VocationalBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_default.WageBenefitsTab;
import pcftest.ClaimSnapshotExposuresScreen_default._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposuresScreen_default extends ClaimSnapshotExposuresScreen {
  public final static String CHECKSUM = "20e7e6dbe9ad10c03157472da06f4247";
  
  public ClaimSnapshotExposuresScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotExposureDV_Baggage getClaimSnapshotExposureDV_Baggage() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_Baggage", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_Baggage.class);
  }
  
  public ClaimSnapshotExposureDV_BodilyInjuryDamage getClaimSnapshotExposureDV_BodilyInjuryDamage() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_BodilyInjuryDamage", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposureDV_Content getClaimSnapshotExposureDV_Content() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_Content", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_Content.class);
  }
  
  public ClaimSnapshotExposureDV_Dwelling getClaimSnapshotExposureDV_Dwelling() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_Dwelling", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_Dwelling.class);
  }
  
  public ClaimSnapshotExposureDV_GeneralDamage getClaimSnapshotExposureDV_EmployerLiability() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_EmployerLiability", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposureDV_GeneralDamage getClaimSnapshotExposureDV_GeneralDamage() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_GeneralDamage", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposureDV_LivingExpenses getClaimSnapshotExposureDV_LivingExpenses() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_LivingExpenses", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_LivingExpenses.class);
  }
  
  public ClaimSnapshotExposureDV_LossOfUseDamage getClaimSnapshotExposureDV_LossOfUseDamage() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_LossOfUseDamage", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_LossOfUseDamage.class);
  }
  
  public ClaimSnapshotExposureDV_BodilyInjuryDamage getClaimSnapshotExposureDV_MedPay() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_MedPay", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_BodilyInjuryDamage.class);
  }
  
  public ClaimSnapshotExposureDV_OtherStructure getClaimSnapshotExposureDV_OtherStructure() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_OtherStructure", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_OtherStructure.class);
  }
  
  public ClaimSnapshotExposureDV_PIPDamages getClaimSnapshotExposureDV_PIPDamages() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_PIPDamages", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_PIPDamages.class);
  }
  
  public ClaimSnapshotExposureDV_PersonalPropertyDamage getClaimSnapshotExposureDV_PersonalPropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_PersonalPropertyDamage", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_PersonalPropertyDamage.class);
  }
  
  public ClaimSnapshotExposureDV_PropertyDamage getClaimSnapshotExposureDV_PropertyDamage() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_PropertyDamage", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_PropertyDamage.class);
  }
  
  public ClaimSnapshotExposureDV_TowOnly getClaimSnapshotExposureDV_TowOnly() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_TowOnly", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_TowOnly.class);
  }
  
  public ClaimSnapshotExposureDV_TripCancellationDelay getClaimSnapshotExposureDV_TripCancellationDelay() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_TripCancellationDelay", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_TripCancellationDelay.class);
  }
  
  public ClaimSnapshotExposureDV_VehicleDamage getClaimSnapshotExposureDV_VehicleDamage() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_VehicleDamage", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_VehicleDamage.class);
  }
  
  public ClaimSnapshotExposureDV_GeneralDamage getClaimSnapshotExposureDV_default() {
    return getOrCreateProperty("ClaimSnapshotExposureDV_default", "ClaimSnapshotExposureDV", null, pcftest.ClaimSnapshotExposureDV_GeneralDamage.class);
  }
  
  public ClaimSnapshotExposureDeathBenefitsDV getClaimSnapshotExposureDeathBenefitsDV() {
    return getOrCreateProperty("ClaimSnapshotExposureDeathBenefitsDV", "ClaimSnapshotExposureDeathBenefitsDV", null, pcftest.ClaimSnapshotExposureDeathBenefitsDV.class);
  }
  
  public ClaimSnapshotExposureReplacementServicesDV getClaimSnapshotExposureReplacementServicesDV() {
    return getOrCreateProperty("ClaimSnapshotExposureReplacementServicesDV", "ClaimSnapshotExposureReplacementServicesDV", null, pcftest.ClaimSnapshotExposureReplacementServicesDV.class);
  }
  
  public ClaimSnapshotExposureWageBenefitsDV getClaimSnapshotExposureWageBenefitsDV() {
    return getOrCreateProperty("ClaimSnapshotExposureWageBenefitsDV", "ClaimSnapshotExposureWageBenefitsDV", null, pcftest.ClaimSnapshotExposureWageBenefitsDV.class);
  }
  
  public ClaimSnapshotExposuresCardTab getClaimSnapshotExposuresCardTab() {
    return getOrCreateProperty("ClaimSnapshotExposuresCardTab", "ClaimSnapshotExposuresCardTab", null, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresCardTab.class);
  }
  
  public ClaimSnapshotExposuresLV getClaimSnapshotExposuresLV() {
    return getOrCreateProperty("ClaimSnapshotExposuresLV", "ClaimSnapshotExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.class);
  }
  
  public ClaimSnapshotExposuresVocationalBenefitsDV getClaimSnapshotExposuresVocationalBenefitsDV() {
    return getOrCreateProperty("ClaimSnapshotExposuresVocationalBenefitsDV", "ClaimSnapshotExposuresVocationalBenefitsDV", null, pcftest.ClaimSnapshotExposuresVocationalBenefitsDV.class);
  }
  
  public DeathBenefitsTab getDeathBenefitsTab() {
    return getOrCreateProperty("DeathBenefitsTab", "DeathBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_default.DeathBenefitsTab.class);
  }
  
  public ReplacementServicesTab getReplacementServicesTab() {
    return getOrCreateProperty("ReplacementServicesTab", "ReplacementServicesTab", null, pcftest.ClaimSnapshotExposuresScreen_default.ReplacementServicesTab.class);
  }
  
  public VocationalBenefitsTab getVocationalBenefitsTab() {
    return getOrCreateProperty("VocationalBenefitsTab", "VocationalBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_default.VocationalBenefitsTab.class);
  }
  
  public WageBenefitsTab getWageBenefitsTab() {
    return getOrCreateProperty("WageBenefitsTab", "WageBenefitsTab", null, pcftest.ClaimSnapshotExposuresScreen_default.WageBenefitsTab.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotExposuresScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresCardTab extends ClickableActionElement {
    public ClaimSnapshotExposuresCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresLV extends PCFElement {
    public ClaimSnapshotExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimantHeader getClaimantHeader() {
      return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.ClaimantHeader.class);
    }
    
    public CoverageHeader getCoverageHeader() {
      return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.CoverageHeader.class);
    }
    
    public CreatedViaHeader getCreatedViaHeader() {
      return getOrCreateProperty("CreatedViaHeader", "CreatedViaHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.CreatedViaHeader.class);
    }
    
    public NumberHeader getNumberHeader() {
      return getOrCreateProperty("NumberHeader", "NumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.NumberHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimantHeader extends ValueElement {
      public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageHeader extends ValueElement {
      public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedViaHeader extends ValueElement {
      public CreatedViaHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberHeader extends ValueElement {
      public NumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public ValueElement getCreatedVia() {
        return getOrCreateProperty("CreatedVia", "CreatedVia", null, gw.smoketest.platform.web.ValueElement.class);
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposuresScreen_default.ClaimSnapshotExposuresLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeathBenefitsTab extends ClickableActionElement {
    public DeathBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReplacementServicesTab extends ClickableActionElement {
    public ReplacementServicesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VocationalBenefitsTab extends ClickableActionElement {
    public VocationalBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WageBenefitsTab extends ClickableActionElement {
    public WageBenefitsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}