package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewPIPSummaryDV.DisBenefits_Provider;
import pcftest.NewPIPSummaryDV.Exposure_ClaimantType;
import pcftest.NewPIPSummaryDV.IMEPerformedLV_tb;
import pcftest.NewPIPSummaryDV.IMEPerformedLV_tb.Add;
import pcftest.NewPIPSummaryDV.IMEPerformedLV_tb.Remove;
import pcftest.NewPIPSummaryDV.LossParty;
import pcftest.NewPIPSummaryDV.PIPDamages_Claimant;
import pcftest.NewPIPSummaryDV.PrimaryCoverage;
import pcftest.NewPIPSummaryDV.StatLine;
import pcftest.NewPIPSummaryDV.StatLine.StatLine_PickerButton;
import pcftest.NewPIPSummaryDV.Title_CoverageSubType;
import typekey.ClaimantType;
import typekey.CoverageSubtype;
import typekey.CoverageType;
import typekey.LossPartyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewPIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewPIPSummaryDV extends DetailViewElement {
  public final static String CHECKSUM = "5f415700bd8a94ff4f081363be3d848e";
  
  public NewPIPSummaryDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BIDamageInputSet getBIDamageInputSet() {
    return getOrCreateProperty("BIDamageInputSet", "BIDamageInputSet", null, pcftest.BIDamageInputSet.class);
  }
  
  public BooleanValueElement getClaimant_ContactPermitted() {
    return getOrCreateProperty("Claimant_ContactPermitted", "Claimant_ContactPermitted", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getClaimant_PrimaryAddress() {
    return getOrCreateProperty("Claimant_PrimaryAddress", "Claimant_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimant_PrimaryPhone() {
    return getOrCreateProperty("Claimant_PrimaryPhone", "Claimant_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DisBenefits_Provider getDisBenefits_Provider() {
    return getOrCreateProperty("DisBenefits_Provider", "DisBenefits_Provider", null, pcftest.NewPIPSummaryDV.DisBenefits_Provider.class);
  }
  
  public pcftest.NewPIPSummaryDV.EscalationLevel_Ext getEscalationLevel_Ext() {
    return getOrCreateProperty("EscalationLevel_Ext", "EscalationLevel_Ext", null, pcftest.NewPIPSummaryDV.EscalationLevel_Ext.class);
  }
  
  public Exposure_ClaimantType getExposure_ClaimantType() {
    return getOrCreateProperty("Exposure_ClaimantType", "Exposure_ClaimantType", null, pcftest.NewPIPSummaryDV.Exposure_ClaimantType.class);
  }
  
  public IMEPerformedLV getIMEPerformedLV() {
    return getOrCreateProperty("IMEPerformedLV", "IMEPerformedLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IMEPerformedLV.class);
  }
  
  public IMEPerformedLV_tb getIMEPerformedLV_tb() {
    return getOrCreateProperty("IMEPerformedLV_tb", "IMEPerformedLV_tb", null, pcftest.NewPIPSummaryDV.IMEPerformedLV_tb.class);
  }
  
  public LossParty getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, pcftest.NewPIPSummaryDV.LossParty.class);
  }
  
  public ValueElement getLostWagesBenefits_Description() {
    return getOrCreateProperty("LostWagesBenefits_Description", "LostWagesBenefits_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_WeeklyCompRate() {
    return getOrCreateProperty("LostWagesBenefits_WeeklyCompRate", "LostWagesBenefits_WeeklyCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PIPDamages_Claimant getPIPDamages_Claimant() {
    return getOrCreateProperty("PIPDamages_Claimant", "PIPDamages_Claimant", null, pcftest.NewPIPSummaryDV.PIPDamages_Claimant.class);
  }
  
  public BooleanValueElement getPIPDamages_SSDIEligible() {
    return getOrCreateProperty("PIPDamages_SSDIEligible", "PIPDamages_SSDIEligible", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public PrimaryCoverage getPrimaryCoverage() {
    return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, pcftest.NewPIPSummaryDV.PrimaryCoverage.class);
  }
  
  public ValueElement getProvider_PrimaryAddress() {
    return getOrCreateProperty("Provider_PrimaryAddress", "Provider_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getProvider_PrimaryContact() {
    return getOrCreateProperty("Provider_PrimaryContact", "Provider_PrimaryContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getProvider_PrimaryPhone() {
    return getOrCreateProperty("Provider_PrimaryPhone", "Provider_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.NewPIPSummaryDV.RepresentationLevel_Ext getRepresentationLevel_Ext() {
    return getOrCreateProperty("RepresentationLevel_Ext", "RepresentationLevel_Ext", null, pcftest.NewPIPSummaryDV.RepresentationLevel_Ext.class);
  }
  
  public StatLine getStatLine() {
    return getOrCreateProperty("StatLine", "StatLine", null, pcftest.NewPIPSummaryDV.StatLine.class);
  }
  
  public ValueElement getStatLine_Warning() {
    return getOrCreateProperty("StatLine_Warning", "StatLine_Warning", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getTitle_Coverage() {
    return getOrCreateProperty("Title_Coverage", "Title_Coverage", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Title_CoverageSubType getTitle_CoverageSubType() {
    return getOrCreateProperty("Title_CoverageSubType", "Title_CoverageSubType", null, pcftest.NewPIPSummaryDV.Title_CoverageSubType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisBenefits_Provider extends SelectElement {
    public DisBenefits_Provider(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewPIPSummaryDV.DisBenefits_Provider.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewPIPSummaryDV.DisBenefits_Provider.MenuItem_Search.class);
    }
    
    public pcftest.NewPIPSummaryDV.DisBenefits_Provider.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewPIPSummaryDV.DisBenefits_Provider.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewPIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewPIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ClaimantType extends SelectElement {
    public Exposure_ClaimantType(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewPIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IMEPerformedLV_tb extends PCFElement {
    public IMEPerformedLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewPIPSummaryDV.IMEPerformedLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewPIPSummaryDV.IMEPerformedLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewPIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewPIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewPIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PIPDamages_Claimant extends SelectElement {
    public PIPDamages_Claimant(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewPIPSummaryDV.PIPDamages_Claimant.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewPIPSummaryDV.PIPDamages_Claimant.MenuItem_Search.class);
    }
    
    public pcftest.NewPIPSummaryDV.PIPDamages_Claimant.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewPIPSummaryDV.PIPDamages_Claimant.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewPIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewPIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatLine extends SelectElement {
    public StatLine(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyStatCodePickerPopup click() {
      return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
    }
    
    public StatLine_PickerButton getStatLine_PickerButton() {
      return getOrCreateProperty("StatLine_PickerButton", "StatLine_PickerButton", null, pcftest.NewPIPSummaryDV.StatLine.StatLine_PickerButton.class);
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewPIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Title_CoverageSubType extends SelectElement {
    public Title_CoverageSubType(ISmokeTest helper, PCFElementId componentId)  {
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
  
  
}