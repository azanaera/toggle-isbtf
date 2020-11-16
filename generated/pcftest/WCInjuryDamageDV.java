package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WCInjuryDamageDV.FirstNotice_FirstIntakeDoctor;
import pcftest.WCInjuryDamageDV.FirstNotice_InitialTreatment;
import pcftest.WCInjuryDamageDV.FirstNotice_MedicalTreatment;
import pcftest.WCInjuryDamageDV.FirstProviderContact;
import pcftest.WCInjuryDamageDV.Hospital_Hospital;
import pcftest.WCInjuryDamageDV.SettlementMethod;
import typekey.InitialTreatment;
import typekey.MedicalTreatmentType;
import typekey.SettleMethod;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/WCInjuryDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCInjuryDamageDV extends DetailViewElement {
  public final static String CHECKSUM = "bd017ad5616374c7a35337efe9598203";
  
  public WCInjuryDamageDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getFirstNotice_CurrentConditions() {
    return getOrCreateProperty("FirstNotice_CurrentConditions", "FirstNotice_CurrentConditions", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getFirstNotice_DiagnosticConsistent() {
    return getOrCreateProperty("FirstNotice_DiagnosticConsistent", "FirstNotice_DiagnosticConsistent", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getFirstNotice_EmployeeAuthorizationToReleaseMedicalRecords() {
    return getOrCreateProperty("FirstNotice_EmployeeAuthorizationToReleaseMedicalRecords", "FirstNotice_EmployeeAuthorizationToReleaseMedicalRecords", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getFirstNotice_ExaminationDate() {
    return getOrCreateProperty("FirstNotice_ExaminationDate", "FirstNotice_ExaminationDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public FirstNotice_FirstIntakeDoctor getFirstNotice_FirstIntakeDoctor() {
    return getOrCreateProperty("FirstNotice_FirstIntakeDoctor", "FirstNotice_FirstIntakeDoctor", null, pcftest.WCInjuryDamageDV.FirstNotice_FirstIntakeDoctor.class);
  }
  
  public BooleanValueElement getFirstNotice_FurtherTreatment() {
    return getOrCreateProperty("FirstNotice_FurtherTreatment", "FirstNotice_FurtherTreatment", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public FirstNotice_InitialTreatment getFirstNotice_InitialTreatment() {
    return getOrCreateProperty("FirstNotice_InitialTreatment", "FirstNotice_InitialTreatment", null, pcftest.WCInjuryDamageDV.FirstNotice_InitialTreatment.class);
  }
  
  public ValueElement getFirstNotice_MedicalDiagnosis() {
    return getOrCreateProperty("FirstNotice_MedicalDiagnosis", "FirstNotice_MedicalDiagnosis", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public FirstNotice_MedicalTreatment getFirstNotice_MedicalTreatment() {
    return getOrCreateProperty("FirstNotice_MedicalTreatment", "FirstNotice_MedicalTreatment", null, pcftest.WCInjuryDamageDV.FirstNotice_MedicalTreatment.class);
  }
  
  public ValueElement getFirstNotice_ObjFindings() {
    return getOrCreateProperty("FirstNotice_ObjFindings", "FirstNotice_ObjFindings", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFirstNotice_SubjComplaints() {
    return getOrCreateProperty("FirstNotice_SubjComplaints", "FirstNotice_SubjComplaints", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getFirstNotice_TreatedPatientBefore() {
    return getOrCreateProperty("FirstNotice_TreatedPatientBefore", "FirstNotice_TreatedPatientBefore", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getFirstNotice_TreatmentRend() {
    return getOrCreateProperty("FirstNotice_TreatmentRend", "FirstNotice_TreatmentRend", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public FirstProviderContact getFirstProviderContact() {
    return getOrCreateProperty("FirstProviderContact", "FirstProviderContact", null, pcftest.WCInjuryDamageDV.FirstProviderContact.class);
  }
  
  public Hospital_Hospital getHospital_Hospital() {
    return getOrCreateProperty("Hospital_Hospital", "Hospital_Hospital", null, pcftest.WCInjuryDamageDV.Hospital_Hospital.class);
  }
  
  public DateElement getHospital_HospitalDate() {
    return getOrCreateProperty("Hospital_HospitalDate", "Hospital_HospitalDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getHospital_HospitalDays() {
    return getOrCreateProperty("Hospital_HospitalDays", "Hospital_HospitalDays", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getHospital_PreexDisability() {
    return getOrCreateProperty("Hospital_PreexDisability", "Hospital_PreexDisability", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getHospital_PreexDisabilityInfo() {
    return getOrCreateProperty("Hospital_PreexDisabilityInfo", "Hospital_PreexDisabilityInfo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getMMI_MMIdate() {
    return getOrCreateProperty("MMI_MMIdate", "MMI_MMIdate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getMMI_MMInote() {
    return getOrCreateProperty("MMI_MMInote", "MMI_MMInote", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getMPN_EmpSentMPNNotice() {
    return getOrCreateProperty("MPN_EmpSentMPNNotice", "MPN_EmpSentMPNNotice", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getMPN_InjWkrInMPN() {
    return getOrCreateProperty("MPN_InjWkrInMPN", "MPN_InjWkrInMPN", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getMPN_InsurerSentMPNNotice() {
    return getOrCreateProperty("MPN_InsurerSentMPNNotice", "MPN_InsurerSentMPNNotice", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BooleanValueElement getMPN_PTPinMPN() {
    return getOrCreateProperty("MPN_PTPinMPN", "MPN_PTPinMPN", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getSettlementDate() {
    return getOrCreateProperty("SettlementDate", "SettlementDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public SettlementMethod getSettlementMethod() {
    return getOrCreateProperty("SettlementMethod", "SettlementMethod", null, pcftest.WCInjuryDamageDV.SettlementMethod.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FirstNotice_FirstIntakeDoctor extends SelectElement {
    public FirstNotice_FirstIntakeDoctor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.WCInjuryDamageDV.FirstNotice_FirstIntakeDoctor.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.WCInjuryDamageDV.FirstNotice_FirstIntakeDoctor.MenuItem_Search.class);
    }
    
    public pcftest.WCInjuryDamageDV.FirstNotice_FirstIntakeDoctor.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.WCInjuryDamageDV.FirstNotice_FirstIntakeDoctor.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/exposures/WCInjuryDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FirstNotice_InitialTreatment extends SelectElement {
    public FirstNotice_InitialTreatment(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(InitialTreatment arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public InitialTreatment getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InitialTreatment.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(InitialTreatment arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/WCInjuryDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FirstNotice_MedicalTreatment extends SelectElement {
    public FirstNotice_MedicalTreatment(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/exposures/WCInjuryDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FirstProviderContact extends ValueElement {
    public FirstProviderContact(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Hospital_Hospital extends SelectElement {
    public Hospital_Hospital(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.WCInjuryDamageDV.Hospital_Hospital.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.WCInjuryDamageDV.Hospital_Hospital.MenuItem_Search.class);
    }
    
    public pcftest.WCInjuryDamageDV.Hospital_Hospital.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.WCInjuryDamageDV.Hospital_Hospital.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/exposures/WCInjuryDamageDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SettlementMethod extends SelectElement {
    public SettlementMethod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SettleMethod arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SettleMethod getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SettleMethod.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SettleMethod arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}