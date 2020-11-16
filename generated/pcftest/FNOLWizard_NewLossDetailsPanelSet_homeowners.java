package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxGroupElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.DwellingInputGroup;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.DwellingInputGroup.EditableRoomsLV_tb;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.EditableOfficialsLV_tb;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.IncidentPanelRef;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb.AddInjuryButton;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb.AddPropertyDamageButton;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.LivingExpensesInputGroup;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.AddressDetailInputSetRef;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.Claim_LossCause;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.OtherLocationChoice_Choice;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.PrimaryLocationChoice_Choice;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.Notification_Fault;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.OtherStructureInputGroup;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.PoliceReportLV;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.PoliceReportLV.MetroReportsLV_tb;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.PropertyContentsInputGroup;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.WitnessLV;
import pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.WitnessLV.EditableWitnessesLV_tb;
import typekey.FaultRating;
import typekey.LossCause;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewLossDetailsPanelSet_homeowners extends FNOLWizard_NewLossDetailsPanelSet {
  public final static String CHECKSUM = "d601d586a2eaf32d71e709bb0ce3b634";
  
  public FNOLWizard_NewLossDetailsPanelSet_homeowners(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getClaimPermissionRequired() {
    return getOrCreateProperty("ClaimPermissionRequired", "ClaimPermissionRequired", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public DwellingInputGroup getDwellingInputGroup() {
    return getOrCreateProperty("DwellingInputGroup", "DwellingInputGroup", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.DwellingInputGroup.class);
  }
  
  public EditableOfficialsLV getEditableOfficialsLV() {
    return getOrCreateProperty("EditableOfficialsLV", "EditableOfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOfficialsLV.class);
  }
  
  public EditableOfficialsLV_tb getEditableOfficialsLV_tb() {
    return getOrCreateProperty("EditableOfficialsLV_tb", "EditableOfficialsLV_tb", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.EditableOfficialsLV_tb.class);
  }
  
  public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.FireDamageQuestionsPanelSet getFireDamageQuestionsPanelSet() {
    return getOrCreateProperty("FireDamageQuestionsPanelSet", "FireDamageQuestionsPanelSet", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.FireDamageQuestionsPanelSet.class);
  }
  
  public IncidentPanelRef getIncidentPanelRef() {
    return getOrCreateProperty("IncidentPanelRef", "IncidentPanelRef", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.IncidentPanelRef.class);
  }
  
  public LivingExpensesInputGroup getLivingExpensesInputGroup() {
    return getOrCreateProperty("LivingExpensesInputGroup", "LivingExpensesInputGroup", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.LivingExpensesInputGroup.class);
  }
  
  public NewLossDetailsHomeownersDV getNewLossDetailsHomeownersDV() {
    return getOrCreateProperty("NewLossDetailsHomeownersDV", "NewLossDetailsHomeownersDV", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.class);
  }
  
  public Notification_Fault getNotification_Fault() {
    return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.Notification_Fault.class);
  }
  
  public OtherStructureInputGroup getOtherStructureInputGroup() {
    return getOrCreateProperty("OtherStructureInputGroup", "OtherStructureInputGroup", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.OtherStructureInputGroup.class);
  }
  
  public PoliceReportLV getPoliceReportLV() {
    return getOrCreateProperty("PoliceReportLV", "PoliceReportLV", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.PoliceReportLV.class);
  }
  
  public PropertyContentsInputGroup getPropertyContentsInputGroup() {
    return getOrCreateProperty("PropertyContentsInputGroup", "PropertyContentsInputGroup", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.PropertyContentsInputGroup.class);
  }
  
  public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.WaterDamageQuestionsPanelSet getWaterDamageQuestionsPanelSet() {
    return getOrCreateProperty("WaterDamageQuestionsPanelSet", "WaterDamageQuestionsPanelSet", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.WaterDamageQuestionsPanelSet.class);
  }
  
  public WitnessLV getWitnessLV() {
    return getOrCreateProperty("WitnessLV", "WitnessLV", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.WitnessLV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingInputGroup extends PCFElement {
    public DwellingInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getDwellingAlreadyRepaired() {
      return getOrCreateProperty("DwellingAlreadyRepaired", "DwellingAlreadyRepaired", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getDwellingDamageDescription() {
      return getOrCreateProperty("DwellingDamageDescription", "DwellingDamageDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getDwellingEstimateReceived() {
      return getOrCreateProperty("DwellingEstimateReceived", "DwellingEstimateReceived", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getDwellingLimit() {
      return getOrCreateProperty("DwellingLimit", "DwellingLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDwellingMaterialsDamaged() {
      return getOrCreateProperty("DwellingMaterialsDamaged", "DwellingMaterialsDamaged", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EditableRoomsLV getEditableRoomsLV() {
      return getOrCreateProperty("EditableRoomsLV", "EditableRoomsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableRoomsLV.class);
    }
    
    public EditableRoomsLV_tb getEditableRoomsLV_tb() {
      return getOrCreateProperty("EditableRoomsLV_tb", "EditableRoomsLV_tb", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.DwellingInputGroup.EditableRoomsLV_tb.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableRoomsLV_tb extends PCFElement {
      public EditableRoomsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.DwellingInputGroup.EditableRoomsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.DwellingInputGroup.EditableRoomsLV_tb.Add.class);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.DwellingInputGroup.EditableRoomsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.DwellingInputGroup.EditableRoomsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOfficialsLV_tb extends PCFElement {
    public EditableOfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.EditableOfficialsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.EditableOfficialsLV_tb.Add.class);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.EditableOfficialsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.EditableOfficialsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FireDamageQuestionsPanelSet extends PCFElement {
    public FireDamageQuestionsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FireDamageQuestionsPanelSet getFireDamageQuestionsPanelSet() {
      return getOrCreateProperty("FireDamageQuestionsPanelSet", "FireDamageQuestionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FireDamageQuestionsPanelSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentPanelRef extends PCFElement {
    public IncidentPanelRef(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public InjuryAndFixedPropertyIncidentsPanelSet getInjuryAndFixedPropertyIncidentsPanelSet() {
      return getOrCreateProperty("InjuryAndFixedPropertyIncidentsPanelSet", "InjuryAndFixedPropertyIncidentsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.class);
    }
    
    public InjuryAndFixedPropertyIncidentsPanelSet_tb getInjuryAndFixedPropertyIncidentsPanelSet_tb() {
      return getOrCreateProperty("InjuryAndFixedPropertyIncidentsPanelSet_tb", "InjuryAndFixedPropertyIncidentsPanelSet_tb", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InjuryAndFixedPropertyIncidentsPanelSet_tb extends PCFElement {
      public InjuryAndFixedPropertyIncidentsPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddInjuryButton getAddInjuryButton() {
        return getOrCreateProperty("AddInjuryButton", "AddInjuryButton", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb.AddInjuryButton.class);
      }
      
      public AddPropertyDamageButton getAddPropertyDamageButton() {
        return getOrCreateProperty("AddPropertyDamageButton", "AddPropertyDamageButton", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb.AddPropertyDamageButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddInjuryButton extends ClickableActionElement {
        public AddInjuryButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public FNOLInjuryIncidentPopup click() {
          return clickThis(pcftest.FNOLInjuryIncidentPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddPropertyDamageButton extends ClickableActionElement {
        public AddPropertyDamageButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewFixedPropertyIncidentPopup click() {
          return clickThis(pcftest.NewFixedPropertyIncidentPopup.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LivingExpensesInputGroup extends PCFElement {
    public LivingExpensesInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getLivingExpensesDescription() {
      return getOrCreateProperty("LivingExpensesDescription", "LivingExpensesDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLivingExpensesLimit() {
      return getOrCreateProperty("LivingExpensesLimit", "LivingExpensesLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewLossDetailsHomeownersDV extends DetailViewElement {
    public NewLossDetailsHomeownersDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressDetailInputSetRef getAddressDetailInputSetRef() {
      return getOrCreateProperty("AddressDetailInputSetRef", "AddressDetailInputSetRef", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.AddressDetailInputSetRef.class);
    }
    
    public SelectElement getCatastrophe_CatastropheNumber() {
      return getOrCreateProperty("Catastrophe_CatastropheNumber", "Catastrophe_CatastropheNumber", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public Claim_LossCause getClaim_LossCause() {
      return getOrCreateProperty("Claim_LossCause", "Claim_LossCause", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.Claim_LossCause.class);
    }
    
    public DateElement getClaim_LossDate() {
      return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public CheckboxGroupElement getDamageTypeChooser() {
      return getOrCreateProperty("DamageTypeChooser", "DamageTypeChooser", null, gw.smoketest.platform.web.CheckboxGroupElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.LocationOfTheft getLocationOfTheft() {
      return getOrCreateProperty("LocationOfTheft", "LocationOfTheft", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.LocationOfTheft.class);
    }
    
    public OtherLocationChoice_Choice getOtherLocationChoice_Choice() {
      return getOrCreateProperty("OtherLocationChoice_Choice", "OtherLocationChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.OtherLocationChoice_Choice.class);
    }
    
    public ValueElement getOtherLocationLabel() {
      return getOrCreateProperty("OtherLocationLabel", "OtherLocationLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPrimaryLocationChoiceLabel() {
      return getOrCreateProperty("PrimaryLocationChoiceLabel", "PrimaryLocationChoiceLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PrimaryLocationChoice_Choice getPrimaryLocationChoice_Choice() {
      return getOrCreateProperty("PrimaryLocationChoice_Choice", "PrimaryLocationChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.NewLossDetailsHomeownersDV.PrimaryLocationChoice_Choice.class);
    }
    
    public ValueElement getPropertyAddress() {
      return getOrCreateProperty("PropertyAddress", "PropertyAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement getStatus_IncidentReport() {
      return getOrCreateProperty("Status_IncidentReport", "Status_IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public BooleanValueElement getWeatherRelated() {
      return getOrCreateProperty("WeatherRelated", "WeatherRelated", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressDetailInputSetRef extends PCFElement {
      public AddressDetailInputSetRef(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CCAddressInputSet getCCAddressInputSet() {
        return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_LossCause extends SelectElement {
      public Claim_LossCause(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LocationOfTheft extends SelectElement {
      public LocationOfTheft(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LocationOfTheft arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LocationOfTheft getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LocationOfTheft.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LocationOfTheft arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherLocationChoice_Choice extends RadioButtonValueElement {
      public OtherLocationChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrimaryLocationChoice_Choice extends RadioButtonValueElement {
      public PrimaryLocationChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notification_Fault extends SelectElement {
    public Notification_Fault(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(FaultRating arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public FaultRating getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FaultRating.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(FaultRating arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherStructureInputGroup extends PCFElement {
    public OtherStructureInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getOtherStructureAlreadyRepaired() {
      return getOrCreateProperty("OtherStructureAlreadyRepaired", "OtherStructureAlreadyRepaired", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getOtherStructureDamageDescription() {
      return getOrCreateProperty("OtherStructureDamageDescription", "OtherStructureDamageDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getOtherStructureEstimateReceived() {
      return getOrCreateProperty("OtherStructureEstimateReceived", "OtherStructureEstimateReceived", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getOtherStructureFencesDamaged() {
      return getOrCreateProperty("OtherStructureFencesDamaged", "OtherStructureFencesDamaged", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getOtherStructureLimit() {
      return getOrCreateProperty("OtherStructureLimit", "OtherStructureLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PoliceReportLV extends PCFElement {
    public PoliceReportLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MetroReportsLV getMetroReportsLV() {
      return getOrCreateProperty("MetroReportsLV", "MetroReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MetroReportsLV.class);
    }
    
    public MetroReportsLV_tb getMetroReportsLV_tb() {
      return getOrCreateProperty("MetroReportsLV_tb", "MetroReportsLV_tb", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.PoliceReportLV.MetroReportsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportsLV_tb extends PCFElement {
      public MetroReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.PoliceReportLV.MetroReportsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.PoliceReportLV.MetroReportsLV_tb.Add.class);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.PoliceReportLV.MetroReportsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.PoliceReportLV.MetroReportsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsInputGroup extends PCFElement {
    public PropertyContentsInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getPropertyContentsDamageDescription() {
      return getOrCreateProperty("PropertyContentsDamageDescription", "PropertyContentsDamageDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPropertyContentsLimit() {
      return getOrCreateProperty("PropertyContentsLimit", "PropertyContentsLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getStorageLocation() {
      return getOrCreateProperty("StorageLocation", "StorageLocation", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WaterDamageQuestionsPanelSet extends PCFElement {
    public WaterDamageQuestionsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.WaterDamageQuestionsPanelSet getWaterDamageQuestionsPanelSet() {
      return getOrCreateProperty("WaterDamageQuestionsPanelSet", "WaterDamageQuestionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.WaterDamageQuestionsPanelSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WitnessLV extends PCFElement {
    public WitnessLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableWitnessesLV getEditableWitnessesLV() {
      return getOrCreateProperty("EditableWitnessesLV", "EditableWitnessesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableWitnessesLV.class);
    }
    
    public EditableWitnessesLV_tb getEditableWitnessesLV_tb() {
      return getOrCreateProperty("EditableWitnessesLV_tb", "EditableWitnessesLV_tb", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.WitnessLV.EditableWitnessesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableWitnessesLV_tb extends PCFElement {
      public EditableWitnessesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.WitnessLV.EditableWitnessesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.WitnessLV.EditableWitnessesLV_tb.Add.class);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.WitnessLV.EditableWitnessesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.WitnessLV.EditableWitnessesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}