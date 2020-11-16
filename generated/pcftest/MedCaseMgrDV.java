package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MedCaseMgrDV.DrugsPrescribedLV_tb;
import pcftest.MedCaseMgrDV.EditableMedicalActionsLV_tb;
import pcftest.MedCaseMgrDV.MedicalContactStatusLV_tb;
import pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput;
import pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb;
import pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Make_Primary;
import pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Reconfirmed_Diagnosis;
import pcftest.MedCaseMgrDV.MedicalPersonnelLV_tb;
import pcftest.MedCaseMgrDV.MedicalTreatmentsLV_tb;
import pcftest.MedCaseMgrDV.NotesLVInput;
import pcftest.MedCaseMgrDV.NotesLVInput.NotesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MedCaseMgrDV extends DetailViewElement {
  public final static String CHECKSUM = "85cda4696d9d56546d61da34ca833f26";
  
  public MedCaseMgrDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DrugsPrescribedLV getDrugsPrescribedLV() {
    return getOrCreateProperty("DrugsPrescribedLV", "DrugsPrescribedLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DrugsPrescribedLV.class);
  }
  
  public DrugsPrescribedLV_tb getDrugsPrescribedLV_tb() {
    return getOrCreateProperty("DrugsPrescribedLV_tb", "DrugsPrescribedLV_tb", null, pcftest.MedCaseMgrDV.DrugsPrescribedLV_tb.class);
  }
  
  public EditableMedicalActionsLV getEditableMedicalActionsLV() {
    return getOrCreateProperty("EditableMedicalActionsLV", "EditableMedicalActionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableMedicalActionsLV.class);
  }
  
  public EditableMedicalActionsLV_tb getEditableMedicalActionsLV_tb() {
    return getOrCreateProperty("EditableMedicalActionsLV_tb", "EditableMedicalActionsLV_tb", null, pcftest.MedCaseMgrDV.EditableMedicalActionsLV_tb.class);
  }
  
  public MedicalContactStatusLV getMedicalContactStatusLV() {
    return getOrCreateProperty("MedicalContactStatusLV", "MedicalContactStatusLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MedicalContactStatusLV.class);
  }
  
  public MedicalContactStatusLV_tb getMedicalContactStatusLV_tb() {
    return getOrCreateProperty("MedicalContactStatusLV_tb", "MedicalContactStatusLV_tb", null, pcftest.MedCaseMgrDV.MedicalContactStatusLV_tb.class);
  }
  
  public MedicalDiagnosisLVInput getMedicalDiagnosisLVInput() {
    return getOrCreateProperty("MedicalDiagnosisLVInput", "MedicalDiagnosisLVInput", null, pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.class);
  }
  
  public MedicalPersonnelLV getMedicalPersonnelLV() {
    return getOrCreateProperty("MedicalPersonnelLV", "MedicalPersonnelLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MedicalPersonnelLV.class);
  }
  
  public MedicalPersonnelLV_tb getMedicalPersonnelLV_tb() {
    return getOrCreateProperty("MedicalPersonnelLV_tb", "MedicalPersonnelLV_tb", null, pcftest.MedCaseMgrDV.MedicalPersonnelLV_tb.class);
  }
  
  public MedicalTreatmentsLV getMedicalTreatmentsLV() {
    return getOrCreateProperty("MedicalTreatmentsLV", "MedicalTreatmentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MedicalTreatmentsLV.class);
  }
  
  public MedicalTreatmentsLV_tb getMedicalTreatmentsLV_tb() {
    return getOrCreateProperty("MedicalTreatmentsLV_tb", "MedicalTreatmentsLV_tb", null, pcftest.MedCaseMgrDV.MedicalTreatmentsLV_tb.class);
  }
  
  public NotesLVInput getNotesLVInput() {
    return getOrCreateProperty("NotesLVInput", "NotesLVInput", null, pcftest.MedCaseMgrDV.NotesLVInput.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrugsPrescribedLV_tb extends PCFElement {
    public DrugsPrescribedLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.MedCaseMgrDV.DrugsPrescribedLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.MedCaseMgrDV.DrugsPrescribedLV_tb.Add.class);
    }
    
    public pcftest.MedCaseMgrDV.DrugsPrescribedLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.MedCaseMgrDV.DrugsPrescribedLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableMedicalActionsLV_tb extends PCFElement {
    public EditableMedicalActionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.MedCaseMgrDV.EditableMedicalActionsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.MedCaseMgrDV.EditableMedicalActionsLV_tb.Add.class);
    }
    
    public pcftest.MedCaseMgrDV.EditableMedicalActionsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.MedCaseMgrDV.EditableMedicalActionsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalContactStatusLV_tb extends PCFElement {
    public MedicalContactStatusLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.MedCaseMgrDV.MedicalContactStatusLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.MedCaseMgrDV.MedicalContactStatusLV_tb.Add.class);
    }
    
    public pcftest.MedCaseMgrDV.MedicalContactStatusLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.MedCaseMgrDV.MedicalContactStatusLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalDiagnosisLVInput extends PCFElement {
    public MedicalDiagnosisLVInput(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MedicalDiagnosisLV getMedicalDiagnosisLV() {
      return getOrCreateProperty("MedicalDiagnosisLV", "MedicalDiagnosisLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MedicalDiagnosisLV.class);
    }
    
    public MedicalDiagnosisLV_tb getMedicalDiagnosisLV_tb() {
      return getOrCreateProperty("MedicalDiagnosisLV_tb", "MedicalDiagnosisLV_tb", null, pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedicalDiagnosisLV_tb extends PCFElement {
      public MedicalDiagnosisLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Add.class);
      }
      
      public Make_Primary getMake_Primary() {
        return getOrCreateProperty("Make_Primary", "Make_Primary", null, pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Make_Primary.class);
      }
      
      public Reconfirmed_Diagnosis getReconfirmed_Diagnosis() {
        return getOrCreateProperty("Reconfirmed_Diagnosis", "Reconfirmed_Diagnosis", null, pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Reconfirmed_Diagnosis.class);
      }
      
      public pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.MedCaseMgrDV.MedicalDiagnosisLVInput.MedicalDiagnosisLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Make_Primary extends ClickableActionElement {
        public Make_Primary(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Reconfirmed_Diagnosis extends ClickableActionElement {
        public Reconfirmed_Diagnosis(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalPersonnelLV_tb extends PCFElement {
    public MedicalPersonnelLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.MedCaseMgrDV.MedicalPersonnelLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.MedCaseMgrDV.MedicalPersonnelLV_tb.Add.class);
    }
    
    public pcftest.MedCaseMgrDV.MedicalPersonnelLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.MedCaseMgrDV.MedicalPersonnelLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatmentsLV_tb extends PCFElement {
    public MedicalTreatmentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.MedCaseMgrDV.MedicalTreatmentsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.MedCaseMgrDV.MedicalTreatmentsLV_tb.Add.class);
    }
    
    public pcftest.MedCaseMgrDV.MedicalTreatmentsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.MedCaseMgrDV.MedicalTreatmentsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesLVInput extends PCFElement {
    public NotesLVInput(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NotesLV getNotesLV() {
      return getOrCreateProperty("NotesLV", "NotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NotesLV.class);
    }
    
    public NotesLV_tb getNotesLV_tb() {
      return getOrCreateProperty("NotesLV_tb", "NotesLV_tb", null, pcftest.MedCaseMgrDV.NotesLVInput.NotesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedCaseMgrDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesLV_tb extends PCFElement {
      public NotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}