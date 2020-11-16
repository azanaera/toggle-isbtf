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
import pcftest.InjuryIncidentInputSet.EditableBodyPartDetailsLV_tb;
import pcftest.InjuryIncidentInputSet.EditableBodyPartDetailsLV_tb.MakeFirstButton;
import pcftest.InjuryIncidentInputSet.LossParty;
import pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput;
import pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb;
import pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Make_Primary;
import pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Reconfirmed_Diagnosis;
import pcftest.InjuryIncidentInputSet.NotesLVInput;
import pcftest.InjuryIncidentInputSet.NotesLVInput.NotesLV_tb;
import pcftest.InjuryIncidentInputSet.PrimaryInjuryType;
import pcftest.InjuryIncidentInputSet.TreatmentType;
import pcftest.InjuryIncidentInputSet.doctor;
import pcftest.InjuryIncidentInputSet.doctor.MenuItem_Search;
import pcftest.InjuryIncidentInputSet.doctor.MenuItem_ViewDetails;
import typekey.InjuryType;
import typekey.LossPartyType;
import typekey.MedicalTreatmentType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InjuryIncidentInputSet extends PCFElement {
  public final static String CHECKSUM = "128b85bff7f2ae2d39c8528383ff5788";
  
  public InjuryIncidentInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getAmbulanceUsed() {
    return getOrCreateProperty("AmbulanceUsed", "AmbulanceUsed", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public pcftest.InjuryIncidentInputSet.DetailedInjuryType getDetailedInjuryType() {
    return getOrCreateProperty("DetailedInjuryType", "DetailedInjuryType", null, pcftest.InjuryIncidentInputSet.DetailedInjuryType.class);
  }
  
  public EditableBodyPartDetailsLV getEditableBodyPartDetailsLV() {
    return getOrCreateProperty("EditableBodyPartDetailsLV", "EditableBodyPartDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableBodyPartDetailsLV.class);
  }
  
  public EditableBodyPartDetailsLV_tb getEditableBodyPartDetailsLV_tb() {
    return getOrCreateProperty("EditableBodyPartDetailsLV_tb", "EditableBodyPartDetailsLV_tb", null, pcftest.InjuryIncidentInputSet.EditableBodyPartDetailsLV_tb.class);
  }
  
  public ValueElement getInjuryDescription() {
    return getOrCreateProperty("InjuryDescription", "InjuryDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LossParty getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, pcftest.InjuryIncidentInputSet.LossParty.class);
  }
  
  public BooleanValueElement getLostWages() {
    return getOrCreateProperty("LostWages", "LostWages", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public MedicalDiagnosisLVInput getMedicalDiagnosisLVInput() {
    return getOrCreateProperty("MedicalDiagnosisLVInput", "MedicalDiagnosisLVInput", null, pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.class);
  }
  
  public NotesLVInput getNotesLVInput() {
    return getOrCreateProperty("NotesLVInput", "NotesLVInput", null, pcftest.InjuryIncidentInputSet.NotesLVInput.class);
  }
  
  public OtherServicesLVInputSet getOtherServicesLVInputSet() {
    return getOrCreateProperty("OtherServicesLVInputSet", "OtherServicesLVInputSet", null, pcftest.OtherServicesLVInputSet.class);
  }
  
  public PrimaryInjuryType getPrimaryInjuryType() {
    return getOrCreateProperty("PrimaryInjuryType", "PrimaryInjuryType", null, pcftest.InjuryIncidentInputSet.PrimaryInjuryType.class);
  }
  
  public BooleanValueElement getReceivedTreatment() {
    return getOrCreateProperty("ReceivedTreatment", "ReceivedTreatment", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessage() {
    return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessageFNOL() {
    return getOrCreateProperty("ServiceRequestSubmitMessageFNOL", "ServiceRequestSubmitMessageFNOL", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TreatmentType getTreatmentType() {
    return getOrCreateProperty("TreatmentType", "TreatmentType", null, pcftest.InjuryIncidentInputSet.TreatmentType.class);
  }
  
  public doctor getdoctor() {
    return getOrCreateProperty("doctor", "doctor", null, pcftest.InjuryIncidentInputSet.doctor.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailedInjuryType extends SelectElement {
    public DetailedInjuryType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.DetailedInjuryType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.DetailedInjuryType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DetailedInjuryType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.DetailedInjuryType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableBodyPartDetailsLV_tb extends PCFElement {
    public EditableBodyPartDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.InjuryIncidentInputSet.EditableBodyPartDetailsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.InjuryIncidentInputSet.EditableBodyPartDetailsLV_tb.Add.class);
    }
    
    public MakeFirstButton getMakeFirstButton() {
      return getOrCreateProperty("MakeFirstButton", "MakeFirstButton", null, pcftest.InjuryIncidentInputSet.EditableBodyPartDetailsLV_tb.MakeFirstButton.class);
    }
    
    public pcftest.InjuryIncidentInputSet.EditableBodyPartDetailsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.InjuryIncidentInputSet.EditableBodyPartDetailsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MakeFirstButton extends ClickableActionElement {
      public MakeFirstButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalDiagnosisLVInput extends PCFElement {
    public MedicalDiagnosisLVInput(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MedicalDiagnosisLV getMedicalDiagnosisLV() {
      return getOrCreateProperty("MedicalDiagnosisLV", "MedicalDiagnosisLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MedicalDiagnosisLV.class);
    }
    
    public MedicalDiagnosisLV_tb getMedicalDiagnosisLV_tb() {
      return getOrCreateProperty("MedicalDiagnosisLV_tb", "MedicalDiagnosisLV_tb", null, pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedicalDiagnosisLV_tb extends PCFElement {
      public MedicalDiagnosisLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Add.class);
      }
      
      public Make_Primary getMake_Primary() {
        return getOrCreateProperty("Make_Primary", "Make_Primary", null, pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Make_Primary.class);
      }
      
      public Reconfirmed_Diagnosis getReconfirmed_Diagnosis() {
        return getOrCreateProperty("Reconfirmed_Diagnosis", "Reconfirmed_Diagnosis", null, pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Reconfirmed_Diagnosis.class);
      }
      
      public pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.InjuryIncidentInputSet.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Make_Primary extends ClickableActionElement {
        public Make_Primary(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Reconfirmed_Diagnosis extends ClickableActionElement {
        public Reconfirmed_Diagnosis(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesLVInput extends PCFElement {
    public NotesLVInput(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NotesLV getNotesLV() {
      return getOrCreateProperty("NotesLV", "NotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NotesLV.class);
    }
    
    public NotesLV_tb getNotesLV_tb() {
      return getOrCreateProperty("NotesLV_tb", "NotesLV_tb", null, pcftest.InjuryIncidentInputSet.NotesLVInput.NotesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesLV_tb extends PCFElement {
      public NotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryInjuryType extends SelectElement {
    public PrimaryInjuryType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(InjuryType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public InjuryType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InjuryType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(InjuryType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/InjuryIncidentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TreatmentType extends SelectElement {
    public TreatmentType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(MedicalTreatmentType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public MedicalTreatmentType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MedicalTreatmentType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(MedicalTreatmentType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class doctor extends SelectElement {
    public doctor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewDoctorOnlyPickerMenuItemSet getClaimNewDoctorOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewDoctorOnlyPickerMenuItemSet", "ClaimNewDoctorOnlyPickerMenuItemSet", null, pcftest.ClaimNewDoctorOnlyPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.InjuryIncidentInputSet.doctor.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.InjuryIncidentInputSet.doctor.MenuItem_ViewDetails.class);
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
  
  
}