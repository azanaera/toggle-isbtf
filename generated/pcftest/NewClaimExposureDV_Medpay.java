package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimExposureDV_Medpay.AltContact_Name;
import pcftest.NewClaimExposureDV_Medpay.Claimant_Picker;
import pcftest.NewClaimExposureDV_Medpay.Claimant_Type;
import pcftest.NewClaimExposureDV_Medpay.CoverageSubType;
import pcftest.NewClaimExposureDV_Medpay.EditableOtherCoverageDetailsLV_tb;
import pcftest.NewClaimExposureDV_Medpay.EditableOtherCoverageDetailsLV_tb.Add;
import pcftest.NewClaimExposureDV_Medpay.EditableOtherCoverageDetailsLV_tb.Remove;
import pcftest.NewClaimExposureDV_Medpay.JurisdictionState;
import pcftest.NewClaimExposureDV_Medpay.LossParty;
import pcftest.NewClaimExposureDV_Medpay.PrimaryCoverage;
import pcftest.NewClaimExposureDV_Medpay.StatLine;
import pcftest.NewClaimExposureDV_Medpay.StatLine.StatLine_PickerButton;
import typekey.ClaimantType;
import typekey.CoverageSubtype;
import typekey.CoverageType;
import typekey.Jurisdiction;
import typekey.LossPartyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposureDV_Medpay extends NewClaimExposureDV {
  public final static String CHECKSUM = "f2beb824070ddd2fd7d5f2eb1b265f67";
  
  public NewClaimExposureDV_Medpay(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AltContact_Name getAltContact_Name() {
    return getOrCreateProperty("AltContact_Name", "AltContact_Name", null, pcftest.NewClaimExposureDV_Medpay.AltContact_Name.class);
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
    return getOrCreateProperty("Claimant_Picker", "Claimant_Picker", null, pcftest.NewClaimExposureDV_Medpay.Claimant_Picker.class);
  }
  
  public ValueElement getClaimant_PrimaryPhone() {
    return getOrCreateProperty("Claimant_PrimaryPhone", "Claimant_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claimant_Type getClaimant_Type() {
    return getOrCreateProperty("Claimant_Type", "Claimant_Type", null, pcftest.NewClaimExposureDV_Medpay.Claimant_Type.class);
  }
  
  public SelectElement getCoverage() {
    return getOrCreateProperty("Coverage", "Coverage", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public CoverageSubType getCoverageSubType() {
    return getOrCreateProperty("CoverageSubType", "CoverageSubType", null, pcftest.NewClaimExposureDV_Medpay.CoverageSubType.class);
  }
  
  public EditableOtherCoverageDetailsLV getEditableOtherCoverageDetailsLV() {
    return getOrCreateProperty("EditableOtherCoverageDetailsLV", "EditableOtherCoverageDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOtherCoverageDetailsLV.class);
  }
  
  public EditableOtherCoverageDetailsLV_tb getEditableOtherCoverageDetailsLV_tb() {
    return getOrCreateProperty("EditableOtherCoverageDetailsLV_tb", "EditableOtherCoverageDetailsLV_tb", null, pcftest.NewClaimExposureDV_Medpay.EditableOtherCoverageDetailsLV_tb.class);
  }
  
  public JurisdictionState getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.NewClaimExposureDV_Medpay.JurisdictionState.class);
  }
  
  public LossParty getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, pcftest.NewClaimExposureDV_Medpay.LossParty.class);
  }
  
  public PrimaryCoverage getPrimaryCoverage() {
    return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, pcftest.NewClaimExposureDV_Medpay.PrimaryCoverage.class);
  }
  
  public StatLine getStatLine() {
    return getOrCreateProperty("StatLine", "StatLine", null, pcftest.NewClaimExposureDV_Medpay.StatLine.class);
  }
  
  public ValueElement getStatLine_Warning() {
    return getOrCreateProperty("StatLine_Warning", "StatLine_Warning", null, gw.smoketest.platform.web.ValueElement.class);
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
    
    public pcftest.NewClaimExposureDV_Medpay.AltContact_Name.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimExposureDV_Medpay.AltContact_Name.MenuItem_Search.class);
    }
    
    public pcftest.NewClaimExposureDV_Medpay.AltContact_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimExposureDV_Medpay.AltContact_Name.MenuItem_ViewDetails.class);
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
    
    public pcftest.NewClaimExposureDV_Medpay.Claimant_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimExposureDV_Medpay.Claimant_Picker.MenuItem_Search.class);
    }
    
    public pcftest.NewClaimExposureDV_Medpay.Claimant_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimExposureDV_Medpay.Claimant_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOtherCoverageDetailsLV_tb extends PCFElement {
    public EditableOtherCoverageDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimExposureDV_Medpay.EditableOtherCoverageDetailsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimExposureDV_Medpay.EditableOtherCoverageDetailsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Medpay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatLine extends SelectElement {
    public StatLine(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyStatCodePickerPopup click() {
      return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
    }
    
    public StatLine_PickerButton getStatLine_PickerButton() {
      return getOrCreateProperty("StatLine_PickerButton", "StatLine_PickerButton", null, pcftest.NewClaimExposureDV_Medpay.StatLine.StatLine_PickerButton.class);
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
  
  
}