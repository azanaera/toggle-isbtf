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
import pcftest.NewExposureDV_Generaldamage.Claimant_Picker;
import pcftest.NewExposureDV_Generaldamage.Claimant_Picker.MenuItem_Search;
import pcftest.NewExposureDV_Generaldamage.Claimant_Picker.MenuItem_ViewDetails;
import pcftest.NewExposureDV_Generaldamage.Claimant_Type;
import pcftest.NewExposureDV_Generaldamage.EditableOtherCoverageDetailsLV_tb;
import pcftest.NewExposureDV_Generaldamage.EditableOtherCoverageDetailsLV_tb.Add;
import pcftest.NewExposureDV_Generaldamage.EditableOtherCoverageDetailsLV_tb.Remove;
import pcftest.NewExposureDV_Generaldamage.Exposure_CoverageSubType;
import pcftest.NewExposureDV_Generaldamage.Exposure_JurisdictionState;
import pcftest.NewExposureDV_Generaldamage.Exposure_LossParty;
import pcftest.NewExposureDV_Generaldamage.Exposure_PrimaryCoverage;
import pcftest.NewExposureDV_Generaldamage.Exposure_StatLine;
import pcftest.NewExposureDV_Generaldamage.Exposure_StatLine.Exposure_StatLine_PickerButton;
import pcftest.NewExposureDV_Generaldamage.Severity;
import typekey.ClaimantType;
import typekey.CoverageSubtype;
import typekey.CoverageType;
import typekey.Jurisdiction;
import typekey.LossPartyType;
import typekey.SeverityType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Generaldamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureDV_Generaldamage extends NewExposureDV {
  public final static String CHECKSUM = "d4cb7cba90f8094f4edfd997ebed371e";
  
  public NewExposureDV_Generaldamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
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
    return getOrCreateProperty("Claimant_Picker", "Claimant_Picker", null, pcftest.NewExposureDV_Generaldamage.Claimant_Picker.class);
  }
  
  public ValueElement getClaimant_PrimaryPhone() {
    return getOrCreateProperty("Claimant_PrimaryPhone", "Claimant_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claimant_Type getClaimant_Type() {
    return getOrCreateProperty("Claimant_Type", "Claimant_Type", null, pcftest.NewExposureDV_Generaldamage.Claimant_Type.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditableOtherCoverageDetailsLV getEditableOtherCoverageDetailsLV() {
    return getOrCreateProperty("EditableOtherCoverageDetailsLV", "EditableOtherCoverageDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOtherCoverageDetailsLV.class);
  }
  
  public EditableOtherCoverageDetailsLV_tb getEditableOtherCoverageDetailsLV_tb() {
    return getOrCreateProperty("EditableOtherCoverageDetailsLV_tb", "EditableOtherCoverageDetailsLV_tb", null, pcftest.NewExposureDV_Generaldamage.EditableOtherCoverageDetailsLV_tb.class);
  }
  
  public SelectElement getExposure_Coverage() {
    return getOrCreateProperty("Exposure_Coverage", "Exposure_Coverage", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Exposure_CoverageSubType getExposure_CoverageSubType() {
    return getOrCreateProperty("Exposure_CoverageSubType", "Exposure_CoverageSubType", null, pcftest.NewExposureDV_Generaldamage.Exposure_CoverageSubType.class);
  }
  
  public Exposure_JurisdictionState getExposure_JurisdictionState() {
    return getOrCreateProperty("Exposure_JurisdictionState", "Exposure_JurisdictionState", null, pcftest.NewExposureDV_Generaldamage.Exposure_JurisdictionState.class);
  }
  
  public Exposure_LossParty getExposure_LossParty() {
    return getOrCreateProperty("Exposure_LossParty", "Exposure_LossParty", null, pcftest.NewExposureDV_Generaldamage.Exposure_LossParty.class);
  }
  
  public Exposure_PrimaryCoverage getExposure_PrimaryCoverage() {
    return getOrCreateProperty("Exposure_PrimaryCoverage", "Exposure_PrimaryCoverage", null, pcftest.NewExposureDV_Generaldamage.Exposure_PrimaryCoverage.class);
  }
  
  public Exposure_StatLine getExposure_StatLine() {
    return getOrCreateProperty("Exposure_StatLine", "Exposure_StatLine", null, pcftest.NewExposureDV_Generaldamage.Exposure_StatLine.class);
  }
  
  public ValueElement getLossEstimate() {
    return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OtherServicesLVInputSet getOtherServicesLVInputSet() {
    return getOrCreateProperty("OtherServicesLVInputSet", "OtherServicesLVInputSet", null, pcftest.OtherServicesLVInputSet.class);
  }
  
  public ValueElement getServiceRequestSubmitMessage() {
    return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessageFNOL() {
    return getOrCreateProperty("ServiceRequestSubmitMessageFNOL", "ServiceRequestSubmitMessageFNOL", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Severity getSeverity() {
    return getOrCreateProperty("Severity", "Severity", null, pcftest.NewExposureDV_Generaldamage.Severity.class);
  }
  
  public ValueElement getStatLine_Warning() {
    return getOrCreateProperty("StatLine_Warning", "StatLine_Warning", null, gw.smoketest.platform.web.ValueElement.class);
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
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewExposureDV_Generaldamage.Claimant_Picker.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewExposureDV_Generaldamage.Claimant_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Generaldamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Generaldamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOtherCoverageDetailsLV_tb extends PCFElement {
    public EditableOtherCoverageDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewExposureDV_Generaldamage.EditableOtherCoverageDetailsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewExposureDV_Generaldamage.EditableOtherCoverageDetailsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Generaldamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Generaldamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Generaldamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_CoverageSubType extends SelectElement {
    public Exposure_CoverageSubType(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Generaldamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_JurisdictionState extends SelectElement {
    public Exposure_JurisdictionState(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Generaldamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_LossParty extends SelectElement {
    public Exposure_LossParty(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Generaldamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_PrimaryCoverage extends SelectElement {
    public Exposure_PrimaryCoverage(ISmokeTest helper, PCFElementId componentId)  {
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
  public static class Exposure_StatLine extends SelectElement {
    public Exposure_StatLine(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyStatCodePickerPopup click() {
      return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
    }
    
    public Exposure_StatLine_PickerButton getExposure_StatLine_PickerButton() {
      return getOrCreateProperty("Exposure_StatLine_PickerButton", "Exposure_StatLine_PickerButton", null, pcftest.NewExposureDV_Generaldamage.Exposure_StatLine.Exposure_StatLine_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposure_StatLine_PickerButton extends ClickableActionElement {
      public Exposure_StatLine_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyStatCodePickerPopup click() {
        return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Generaldamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Severity extends SelectElement {
    public Severity(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SeverityType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SeverityType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SeverityType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SeverityType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}