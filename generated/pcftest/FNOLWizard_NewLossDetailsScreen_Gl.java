package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.EditableOfficialsLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.IncidentPanelRef;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb.AddInjuryButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb.AddPropertyDamageButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.AddressDetailInputSetRef;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.Claim_LossCause;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.Claim_LossType;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.Notification_HowReported;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.OtherLocationChoice_Choice;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.PrimaryLocationChoice_Choice;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.Notification_Fault;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.PoliceReportLV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.PoliceReportLV.MetroReportsLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.WitnessLV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl.WitnessLV.EditableWitnessesLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_Gl._msgs;
import typekey.FaultRating;
import typekey.HowReportedType;
import typekey.LossCause;
import typekey.LossType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewLossDetailsScreen_Gl extends FNOLWizard_NewLossDetailsScreen {
  public final static String CHECKSUM = "179cdd231aa98c2db213fd807d4bccb1";
  
  public FNOLWizard_NewLossDetailsScreen_Gl(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getClaimPermissionRequired() {
    return getOrCreateProperty("ClaimPermissionRequired", "ClaimPermissionRequired", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public EditableOfficialsLV getEditableOfficialsLV() {
    return getOrCreateProperty("EditableOfficialsLV", "EditableOfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOfficialsLV.class);
  }
  
  public EditableOfficialsLV_tb getEditableOfficialsLV_tb() {
    return getOrCreateProperty("EditableOfficialsLV_tb", "EditableOfficialsLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.EditableOfficialsLV_tb.class);
  }
  
  public pcftest.FNOLWizard_NewLossDetailsScreen_Gl.FireDamageQuestionsPanelSet getFireDamageQuestionsPanelSet() {
    return getOrCreateProperty("FireDamageQuestionsPanelSet", "FireDamageQuestionsPanelSet", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.FireDamageQuestionsPanelSet.class);
  }
  
  public IncidentPanelRef getIncidentPanelRef() {
    return getOrCreateProperty("IncidentPanelRef", "IncidentPanelRef", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.IncidentPanelRef.class);
  }
  
  public NewLossDetailsGeneralLiabilityDV getNewLossDetailsGeneralLiabilityDV() {
    return getOrCreateProperty("NewLossDetailsGeneralLiabilityDV", "NewLossDetailsGeneralLiabilityDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.class);
  }
  
  public Notification_Fault getNotification_Fault() {
    return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.Notification_Fault.class);
  }
  
  public PoliceReportLV getPoliceReportLV() {
    return getOrCreateProperty("PoliceReportLV", "PoliceReportLV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.PoliceReportLV.class);
  }
  
  public WitnessLV getWitnessLV() {
    return getOrCreateProperty("WitnessLV", "WitnessLV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.WitnessLV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOfficialsLV_tb extends PCFElement {
    public EditableOfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_Gl.EditableOfficialsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.EditableOfficialsLV_tb.Add.class);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_Gl.EditableOfficialsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.EditableOfficialsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FireDamageQuestionsPanelSet extends PCFElement {
    public FireDamageQuestionsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FireDamageQuestionsPanelSet getFireDamageQuestionsPanelSet() {
      return getOrCreateProperty("FireDamageQuestionsPanelSet", "FireDamageQuestionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FireDamageQuestionsPanelSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentPanelRef extends PCFElement {
    public IncidentPanelRef(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public InjuryAndFixedPropertyIncidentsPanelSet getInjuryAndFixedPropertyIncidentsPanelSet() {
      return getOrCreateProperty("InjuryAndFixedPropertyIncidentsPanelSet", "InjuryAndFixedPropertyIncidentsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.class);
    }
    
    public InjuryAndFixedPropertyIncidentsPanelSet_tb getInjuryAndFixedPropertyIncidentsPanelSet_tb() {
      return getOrCreateProperty("InjuryAndFixedPropertyIncidentsPanelSet_tb", "InjuryAndFixedPropertyIncidentsPanelSet_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InjuryAndFixedPropertyIncidentsPanelSet_tb extends PCFElement {
      public InjuryAndFixedPropertyIncidentsPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddInjuryButton getAddInjuryButton() {
        return getOrCreateProperty("AddInjuryButton", "AddInjuryButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb.AddInjuryButton.class);
      }
      
      public AddPropertyDamageButton getAddPropertyDamageButton() {
        return getOrCreateProperty("AddPropertyDamageButton", "AddPropertyDamageButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.IncidentPanelRef.InjuryAndFixedPropertyIncidentsPanelSet_tb.AddPropertyDamageButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddInjuryButton extends ClickableActionElement {
        public AddInjuryButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public FNOLInjuryIncidentPopup click() {
          return clickThis(pcftest.FNOLInjuryIncidentPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewLossDetailsGeneralLiabilityDV extends DetailViewElement {
    public NewLossDetailsGeneralLiabilityDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressDetailInputSetRef getAddressDetailInputSetRef() {
      return getOrCreateProperty("AddressDetailInputSetRef", "AddressDetailInputSetRef", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.AddressDetailInputSetRef.class);
    }
    
    public SelectElement getCatastrophe_CatastropheNumber() {
      return getOrCreateProperty("Catastrophe_CatastropheNumber", "Catastrophe_CatastropheNumber", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public Claim_LossCause getClaim_LossCause() {
      return getOrCreateProperty("Claim_LossCause", "Claim_LossCause", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.Claim_LossCause.class);
    }
    
    public DateElement getClaim_LossDate() {
      return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public Claim_LossType getClaim_LossType() {
      return getOrCreateProperty("Claim_LossType", "Claim_LossType", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.Claim_LossType.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getNotification_FirstNoticeSuit() {
      return getOrCreateProperty("Notification_FirstNoticeSuit", "Notification_FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public Notification_HowReported getNotification_HowReported() {
      return getOrCreateProperty("Notification_HowReported", "Notification_HowReported", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.Notification_HowReported.class);
    }
    
    public OtherLocationChoice_Choice getOtherLocationChoice_Choice() {
      return getOrCreateProperty("OtherLocationChoice_Choice", "OtherLocationChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.OtherLocationChoice_Choice.class);
    }
    
    public ValueElement getOtherLocationLabel() {
      return getOrCreateProperty("OtherLocationLabel", "OtherLocationLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPrimaryLocationChoiceLabel() {
      return getOrCreateProperty("PrimaryLocationChoiceLabel", "PrimaryLocationChoiceLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PrimaryLocationChoice_Choice getPrimaryLocationChoice_Choice() {
      return getOrCreateProperty("PrimaryLocationChoice_Choice", "PrimaryLocationChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.NewLossDetailsGeneralLiabilityDV.PrimaryLocationChoice_Choice.class);
    }
    
    public ValueElement getPropertyAddress() {
      return getOrCreateProperty("PropertyAddress", "PropertyAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getStatus_CoverageQuestion() {
      return getOrCreateProperty("Status_CoverageQuestion", "Status_CoverageQuestion", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public CheckboxValueElement getStatus_IncidentReport() {
      return getOrCreateProperty("Status_IncidentReport", "Status_IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public BooleanValueElement getWeatherRelated() {
      return getOrCreateProperty("WeatherRelated", "WeatherRelated", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressDetailInputSetRef extends PCFElement {
      public AddressDetailInputSetRef(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CCAddressInputSet getCCAddressInputSet() {
        return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_LossType extends SelectElement {
      public Claim_LossType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Notification_HowReported extends SelectElement {
      public Notification_HowReported(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(HowReportedType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public HowReportedType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.HowReportedType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(HowReportedType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherLocationChoice_Choice extends RadioButtonValueElement {
      public OtherLocationChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PoliceReportLV extends PCFElement {
    public PoliceReportLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MetroReportsLV getMetroReportsLV() {
      return getOrCreateProperty("MetroReportsLV", "MetroReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MetroReportsLV.class);
    }
    
    public MetroReportsLV_tb getMetroReportsLV_tb() {
      return getOrCreateProperty("MetroReportsLV_tb", "MetroReportsLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.PoliceReportLV.MetroReportsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportsLV_tb extends PCFElement {
      public MetroReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsScreen_Gl.PoliceReportLV.MetroReportsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.PoliceReportLV.MetroReportsLV_tb.Add.class);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsScreen_Gl.PoliceReportLV.MetroReportsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.PoliceReportLV.MetroReportsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WitnessLV extends PCFElement {
    public WitnessLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableWitnessesLV getEditableWitnessesLV() {
      return getOrCreateProperty("EditableWitnessesLV", "EditableWitnessesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableWitnessesLV.class);
    }
    
    public EditableWitnessesLV_tb getEditableWitnessesLV_tb() {
      return getOrCreateProperty("EditableWitnessesLV_tb", "EditableWitnessesLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.WitnessLV.EditableWitnessesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableWitnessesLV_tb extends PCFElement {
      public EditableWitnessesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsScreen_Gl.WitnessLV.EditableWitnessesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.WitnessLV.EditableWitnessesLV_tb.Add.class);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsScreen_Gl.WitnessLV.EditableWitnessesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsScreen_Gl.WitnessLV.EditableWitnessesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}