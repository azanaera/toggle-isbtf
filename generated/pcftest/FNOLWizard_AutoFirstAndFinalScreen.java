package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_AutoFirstAndFinalScreen.AutoFirstAndFinalReportedPanelSet;
import pcftest.FNOLWizard_AutoFirstAndFinalScreen.Claim_LossCause_Ext;
import pcftest.FNOLWizard_AutoFirstAndFinalScreen.Claimant_Picker;
import pcftest.FNOLWizard_AutoFirstAndFinalScreen.Exposure_PrimaryCoverage;
import pcftest.FNOLWizard_AutoFirstAndFinalScreen.FirstFinalReportedAgencyRadioButton;
import pcftest.FNOLWizard_AutoFirstAndFinalScreen.GlassRepairAndReplaceRadioButton_Ext;
import pcftest.FNOLWizard_AutoFirstAndFinalScreen.NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton;
import pcftest.FNOLWizard_AutoFirstAndFinalScreen.RepairShop_Picker;
import pcftest.FNOLWizard_AutoFirstAndFinalScreen._msgs;
import typekey.CoverageType;
import typekey.FirstFinalReportedAgency;
import typekey.GlassRepairAndReplace_Ext;
import typekey.LossCause;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AutoFirstAndFinalScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_AutoFirstAndFinalScreen extends PCFElement {
  public final static String CHECKSUM = "a28079aab54ea78f4837618a3a6c0c1e";
  
  public FNOLWizard_AutoFirstAndFinalScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AutoFirstAndFinalReportedPanelSet getAutoFirstAndFinalReportedPanelSet() {
    return getOrCreateProperty("AutoFirstAndFinalReportedPanelSet", "AutoFirstAndFinalReportedPanelSet", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.AutoFirstAndFinalReportedPanelSet.class);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public Claim_LossCause_Ext getClaim_LossCause_Ext() {
    return getOrCreateProperty("Claim_LossCause_Ext", "Claim_LossCause_Ext", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.Claim_LossCause_Ext.class);
  }
  
  public DateElement getClaim_LossDate() {
    return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getClaim_lossTime() {
    return getOrCreateProperty("Claim_lossTime", "Claim_lossTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getClaimant_Address() {
    return getOrCreateProperty("Claimant_Address", "Claimant_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getClaimant_OtherCoverage() {
    return getOrCreateProperty("Claimant_OtherCoverage", "Claimant_OtherCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Claimant_Picker getClaimant_Picker() {
    return getOrCreateProperty("Claimant_Picker", "Claimant_Picker", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.Claimant_Picker.class);
  }
  
  public SelectElement getClaimant_Type() {
    return getOrCreateProperty("Claimant_Type", "Claimant_Type", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getClaimant_Workphone() {
    return getOrCreateProperty("Claimant_Workphone", "Claimant_Workphone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposure_PrimaryCoverage getExposure_PrimaryCoverage() {
    return getOrCreateProperty("Exposure_PrimaryCoverage", "Exposure_PrimaryCoverage", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.Exposure_PrimaryCoverage.class);
  }
  
  public FNOLWizardCheckDV_notready getFNOLWizardCheckDV_notready() {
    return getOrCreateProperty("FNOLWizardCheckDV_notready", "FNOLWizardCheckDV", null, pcftest.FNOLWizardCheckDV_notready.class);
  }
  
  public FNOLWizardCheckDV_ready getFNOLWizardCheckDV_ready() {
    return getOrCreateProperty("FNOLWizardCheckDV_ready", "FNOLWizardCheckDV", null, pcftest.FNOLWizardCheckDV_ready.class);
  }
  
  public FirstFinalReportedAgencyRadioButton getFirstFinalReportedAgencyRadioButton() {
    return getOrCreateProperty("FirstFinalReportedAgencyRadioButton", "FirstFinalReportedAgencyRadioButton", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.FirstFinalReportedAgencyRadioButton.class);
  }
  
  public GlassRepairAndReplaceRadioButton_Ext getGlassRepairAndReplaceRadioButton_Ext() {
    return getOrCreateProperty("GlassRepairAndReplaceRadioButton_Ext", "GlassRepairAndReplaceRadioButton_Ext", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.GlassRepairAndReplaceRadioButton_Ext.class);
  }
  
  public NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton getNewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton() {
    return getOrCreateProperty("NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton", "NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton.class);
  }
  
  public BooleanValueElement getReadyToPay() {
    return getOrCreateProperty("ReadyToPay", "ReadyToPay", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public RepairShop_Picker getRepairShop_Picker() {
    return getOrCreateProperty("RepairShop_Picker", "RepairShop_Picker", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.RepairShop_Picker.class);
  }
  
  public ValueElement getServiceRequest_InstructionText() {
    return getOrCreateProperty("ServiceRequest_InstructionText", "ServiceRequest_InstructionText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getVehicle_Name() {
    return getOrCreateProperty("Vehicle_Name", "Vehicle_Name", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AutoFirstAndFinalScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutoFirstAndFinalReportedPanelSet extends PCFElement {
    public AutoFirstAndFinalReportedPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizardAutoFirstAndFinalPanelSet_INSURED getFNOLWizardAutoFirstAndFinalPanelSet_INSURED() {
      return getOrCreateProperty("FNOLWizardAutoFirstAndFinalPanelSet_INSURED", "FNOLWizardAutoFirstAndFinalPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizardAutoFirstAndFinalPanelSet_INSURED.class);
    }
    
    public FNOLWizardAutoFirstAndFinalPanelSet_VENDOR getFNOLWizardAutoFirstAndFinalPanelSet_VENDOR() {
      return getOrCreateProperty("FNOLWizardAutoFirstAndFinalPanelSet_VENDOR", "FNOLWizardAutoFirstAndFinalPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizardAutoFirstAndFinalPanelSet_VENDOR.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AutoFirstAndFinalScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_LossCause_Ext extends SelectElement {
    public Claim_LossCause_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossCause arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossCause getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossCause.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossCause arg) {
      setValue(arg == null ? null : arg.getCode());
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
    
    public pcftest.FNOLWizard_AutoFirstAndFinalScreen.Claimant_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.Claimant_Picker.MenuItem_Search.class);
    }
    
    public pcftest.FNOLWizard_AutoFirstAndFinalScreen.Claimant_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.Claimant_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AutoFirstAndFinalScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AutoFirstAndFinalScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FirstFinalReportedAgencyRadioButton extends SelectElement {
    public FirstFinalReportedAgencyRadioButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(FirstFinalReportedAgency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public FirstFinalReportedAgency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FirstFinalReportedAgency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(FirstFinalReportedAgency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AutoFirstAndFinalScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlassRepairAndReplaceRadioButton_Ext extends SelectElement {
    public GlassRepairAndReplaceRadioButton_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(GlassRepairAndReplace_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public GlassRepairAndReplace_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.GlassRepairAndReplace_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(GlassRepairAndReplace_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AutoFirstAndFinalScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton extends ClickableActionElement {
    public NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RepairShop_Picker extends SelectElement {
    public RepairShop_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewRepairShopOnlyPickerMenuItemSet getClaimNewRepairShopOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewRepairShopOnlyPickerMenuItemSet", "ClaimNewRepairShopOnlyPickerMenuItemSet", null, pcftest.ClaimNewRepairShopOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.FNOLWizard_AutoFirstAndFinalScreen.RepairShop_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.RepairShop_Picker.MenuItem_Search.class);
    }
    
    public pcftest.FNOLWizard_AutoFirstAndFinalScreen.RepairShop_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizard_AutoFirstAndFinalScreen.RepairShop_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AutoFirstAndFinalScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}