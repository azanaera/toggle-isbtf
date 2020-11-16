package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.AltContact_Name;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.AssignedUser_Name;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Claimant_Picker;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Claimant_Type;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.ClosedOutcome;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.CoverageSubType;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.EditableOtherCoverageDetailsLV_tb;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.JurisdictionState;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.LossParty;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.PrimaryCoverage;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.ReopenedReason;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Segment;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.SettlementInformation_ExtLV_tb;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.StatLine;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.StatLine.StatLine_PickerButton;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.State;
import pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Strategy;
import pcftest.ExposureDetailDV_Medpay.Exposure_ISOCardTab;
import pcftest.ExposureDetailDV_Medpay.MedPay_DetailsCardTab;
import typekey.ClaimSegment;
import typekey.ClaimStrategy;
import typekey.ClaimantType;
import typekey.CoverageSubtype;
import typekey.CoverageType;
import typekey.ExposureClosedOutcomeType;
import typekey.ExposureReopenedReason;
import typekey.ExposureState;
import typekey.Jurisdiction;
import typekey.LossPartyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_Medpay extends pcftest.ExposureDetailDV {
  public final static String CHECKSUM = "68dabf70629837e9cf373bf742f3794a";
  
  public ExposureDetailDV_Medpay(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV getExposureDetailDV() {
    return getOrCreateProperty("ExposureDetailDV", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.class);
  }
  
  public Exposure_ISOCardTab getExposure_ISOCardTab() {
    return getOrCreateProperty("Exposure_ISOCardTab", "Exposure_ISOCardTab", null, pcftest.ExposureDetailDV_Medpay.Exposure_ISOCardTab.class);
  }
  
  public ISODetailsDV getISODetailsDV() {
    return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
  }
  
  public MedPay_DetailsCardTab getMedPay_DetailsCardTab() {
    return getOrCreateProperty("MedPay_DetailsCardTab", "MedPay_DetailsCardTab", null, pcftest.ExposureDetailDV_Medpay.MedPay_DetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailDV extends DetailViewElement {
    public ExposureDetailDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AltContact_Name getAltContact_Name() {
      return getOrCreateProperty("AltContact_Name", "AltContact_Name", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.AltContact_Name.class);
    }
    
    public ValueElement getAssignedGroup_Name() {
      return getOrCreateProperty("AssignedGroup_Name", "AssignedGroup_Name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public AssignedUser_Name getAssignedUser_Name() {
      return getOrCreateProperty("AssignedUser_Name", "AssignedUser_Name", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.AssignedUser_Name.class);
    }
    
    public BIDamageInputSet getBIDamageInputSet() {
      return getOrCreateProperty("BIDamageInputSet", "BIDamageInputSet", null, pcftest.BIDamageInputSet.class);
    }
    
    public ValueElement getClaimant_Address() {
      return getOrCreateProperty("Claimant_Address", "Claimant_Address", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getClaimant_ContactProhibited() {
      return getOrCreateProperty("Claimant_ContactProhibited", "Claimant_ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getClaimant_OtherCoverage() {
      return getOrCreateProperty("Claimant_OtherCoverage", "Claimant_OtherCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public Claimant_Picker getClaimant_Picker() {
      return getOrCreateProperty("Claimant_Picker", "Claimant_Picker", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Claimant_Picker.class);
    }
    
    public ValueElement getClaimant_PrimaryPhone() {
      return getOrCreateProperty("Claimant_PrimaryPhone", "Claimant_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Claimant_Type getClaimant_Type() {
      return getOrCreateProperty("Claimant_Type", "Claimant_Type", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Claimant_Type.class);
    }
    
    public DateElement getClosedDate() {
      return getOrCreateProperty("ClosedDate", "ClosedDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ClosedOutcome getClosedOutcome() {
      return getOrCreateProperty("ClosedOutcome", "ClosedOutcome", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.ClosedOutcome.class);
    }
    
    public SelectElement getCoverage() {
      return getOrCreateProperty("Coverage", "Coverage", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public CoverageSubType getCoverageSubType() {
      return getOrCreateProperty("CoverageSubType", "CoverageSubType", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.CoverageSubType.class);
    }
    
    public DateElement getCreateTime() {
      return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.CreatedVia getCreatedVia() {
      return getOrCreateProperty("CreatedVia", "CreatedVia", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.CreatedVia.class);
    }
    
    public DeductibleInfoInputSet getDeductibleInfoInputSet() {
      return getOrCreateProperty("DeductibleInfoInputSet", "DeductibleInfoInputSet", null, pcftest.DeductibleInfoInputSet.class);
    }
    
    public EditableOtherCoverageDetailsLV getEditableOtherCoverageDetailsLV() {
      return getOrCreateProperty("EditableOtherCoverageDetailsLV", "EditableOtherCoverageDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOtherCoverageDetailsLV.class);
    }
    
    public EditableOtherCoverageDetailsLV_tb getEditableOtherCoverageDetailsLV_tb() {
      return getOrCreateProperty("EditableOtherCoverageDetailsLV_tb", "EditableOtherCoverageDetailsLV_tb", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.EditableOtherCoverageDetailsLV_tb.class);
    }
    
    public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.EscalationLevel_Ext getEscalationLevel_Ext() {
      return getOrCreateProperty("EscalationLevel_Ext", "EscalationLevel_Ext", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.EscalationLevel_Ext.class);
    }
    
    public ExposureWorkloadInputSet getExposureWorkloadInputSet() {
      return getOrCreateProperty("ExposureWorkloadInputSet", "ExposureWorkloadInputSet", null, pcftest.ExposureWorkloadInputSet.class);
    }
    
    public ValueElement getFuturePayments() {
      return getOrCreateProperty("FuturePayments", "FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public JurisdictionState getJurisdictionState() {
      return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.JurisdictionState.class);
    }
    
    public LossParty getLossParty() {
      return getOrCreateProperty("LossParty", "LossParty", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.LossParty.class);
    }
    
    public Medicare_ExtInputSet getMedicare_ExtInputSet() {
      return getOrCreateProperty("Medicare_ExtInputSet", "Medicare_ExtInputSet", null, pcftest.Medicare_ExtInputSet.class);
    }
    
    public PrimaryCoverage getPrimaryCoverage() {
      return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.PrimaryCoverage.class);
    }
    
    public DateElement getReOpenDate() {
      return getOrCreateProperty("ReOpenDate", "ReOpenDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getRemainingReserves() {
      return getOrCreateProperty("RemainingReserves", "RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ReopenedReason getReopenedReason() {
      return getOrCreateProperty("ReopenedReason", "ReopenedReason", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.ReopenedReason.class);
    }
    
    public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.RepresentationLevel_Ext getRepresentationLevel_Ext() {
      return getOrCreateProperty("RepresentationLevel_Ext", "RepresentationLevel_Ext", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.RepresentationLevel_Ext.class);
    }
    
    public Segment getSegment() {
      return getOrCreateProperty("Segment", "Segment", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Segment.class);
    }
    
    public SettlementInformation_ExtLV getSettlementInformation_ExtLV() {
      return getOrCreateProperty("SettlementInformation_ExtLV", "SettlementInformation_ExtLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SettlementInformation_ExtLV.class);
    }
    
    public SettlementInformation_ExtLV_tb getSettlementInformation_ExtLV_tb() {
      return getOrCreateProperty("SettlementInformation_ExtLV_tb", "SettlementInformation_ExtLV_tb", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.SettlementInformation_ExtLV_tb.class);
    }
    
    public StatLine getStatLine() {
      return getOrCreateProperty("StatLine", "StatLine", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.StatLine.class);
    }
    
    public ValueElement getStatLine_Warning() {
      return getOrCreateProperty("StatLine_Warning", "StatLine_Warning", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.State.class);
    }
    
    public Strategy getStrategy() {
      return getOrCreateProperty("Strategy", "Strategy", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Strategy.class);
    }
    
    public ValueElement getTotalIncurredNet() {
      return getOrCreateProperty("TotalIncurredNet", "TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalPayments() {
      return getOrCreateProperty("TotalPayments", "TotalPayments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalRecoveries() {
      return getOrCreateProperty("TotalRecoveries", "TotalRecoveries", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.ValidationLevel getValidationLevel() {
      return getOrCreateProperty("ValidationLevel", "ValidationLevel", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.ValidationLevel.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AltContact_Name extends SelectElement {
      public AltContact_Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.AltContact_Name.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.AltContact_Name.MenuItem_Search.class);
      }
      
      public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.AltContact_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.AltContact_Name.MenuItem_ViewDetails.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MenuItem_Search extends ClickableActionElement {
        public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddressBookPickerPopup click() {
          return clickThis(pcftest.AddressBookPickerPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MenuItem_ViewDetails extends ClickableActionElement {
        public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignedUser_Name extends ValueElement {
      public AssignedUser_Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserContactDetailPopup click() {
        return clickThis(pcftest.UserContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claimant_Picker extends SelectElement {
      public Claimant_Picker(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Claimant_Picker.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Claimant_Picker.MenuItem_Search.class);
      }
      
      public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Claimant_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.Claimant_Picker.MenuItem_ViewDetails.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MenuItem_Search extends ClickableActionElement {
        public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddressBookPickerPopup click() {
          return clickThis(pcftest.AddressBookPickerPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MenuItem_ViewDetails extends ClickableActionElement {
        public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claimant_Type extends SelectElement {
      public Claimant_Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ClaimantType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ClaimantType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimantType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ClaimantType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClosedOutcome extends SelectElement {
      public ClosedOutcome(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ExposureClosedOutcomeType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ExposureClosedOutcomeType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureClosedOutcomeType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ExposureClosedOutcomeType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageSubType extends SelectElement {
      public CoverageSubType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(CoverageSubtype arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CoverageSubtype getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageSubtype.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CoverageSubtype arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedVia extends SelectElement {
      public CreatedVia(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.CreatedVia arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.CreatedVia getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CreatedVia.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.CreatedVia arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableOtherCoverageDetailsLV_tb extends PCFElement {
      public EditableOtherCoverageDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.EditableOtherCoverageDetailsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.EditableOtherCoverageDetailsLV_tb.Add.class);
      }
      
      public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.EditableOtherCoverageDetailsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.EditableOtherCoverageDetailsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EscalationLevel_Ext extends SelectElement {
      public EscalationLevel_Ext(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.EscalationLevel_Ext arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.EscalationLevel_Ext getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.EscalationLevel_Ext.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.EscalationLevel_Ext arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class JurisdictionState extends SelectElement {
      public JurisdictionState(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Jurisdiction arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Jurisdiction getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Jurisdiction arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossParty extends SelectElement {
      public LossParty(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossPartyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossPartyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossPartyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossPartyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrimaryCoverage extends SelectElement {
      public PrimaryCoverage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(CoverageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CoverageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CoverageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReopenedReason extends SelectElement {
      public ReopenedReason(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ExposureReopenedReason arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ExposureReopenedReason getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureReopenedReason.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ExposureReopenedReason arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RepresentationLevel_Ext extends SelectElement {
      public RepresentationLevel_Ext(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.RepresentationLevel_Ext arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.RepresentationLevel_Ext getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RepresentationLevel_Ext.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.RepresentationLevel_Ext arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Segment extends SelectElement {
      public Segment(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ClaimSegment arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ClaimSegment getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimSegment.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ClaimSegment arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SettlementInformation_ExtLV_tb extends PCFElement {
      public SettlementInformation_ExtLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.SettlementInformation_ExtLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.SettlementInformation_ExtLV_tb.Add.class);
      }
      
      public pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.SettlementInformation_ExtLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.SettlementInformation_ExtLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatLine extends SelectElement {
      public StatLine(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyStatCodePickerPopup click() {
        return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
      }
      
      public StatLine_PickerButton getStatLine_PickerButton() {
        return getOrCreateProperty("StatLine_PickerButton", "StatLine_PickerButton", null, pcftest.ExposureDetailDV_Medpay.ExposureDetailDV.StatLine.StatLine_PickerButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StatLine_PickerButton extends ClickableActionElement {
        public StatLine_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimPolicyStatCodePickerPopup click() {
          return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class State extends SelectElement {
      public State(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ExposureState arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ExposureState getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureState.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ExposureState arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Strategy extends SelectElement {
      public Strategy(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ClaimStrategy arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ClaimStrategy getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimStrategy.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ClaimStrategy arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ValidationLevel extends SelectElement {
      public ValidationLevel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.ValidationLevel arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.ValidationLevel getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ValidationLevel.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.ValidationLevel arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ISOCardTab extends ClickableActionElement {
    public Exposure_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedPay_DetailsCardTab extends ClickableActionElement {
    public MedPay_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}