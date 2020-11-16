package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PIPEmploymentInputSet.EditableWorkStatusChangesLV_tb;
import pcftest.PIPEmploymentInputSet.EditableWorkStatusChangesLV_tb.Add;
import pcftest.PIPEmploymentInputSet.EditableWorkStatusChangesLV_tb.Remove;
import pcftest.PIPEmploymentInputSet.EmploymentData_EmploymentStatus;
import pcftest.PIPEmploymentInputSet.EmploymentData_PayPeriod;
import pcftest.PIPEmploymentInputSet.PIPDamages_Claimant;
import pcftest.PIPEmploymentInputSet.PIPDamages_Claimant.MenuItem_Search;
import pcftest.PIPEmploymentInputSet.PIPDamages_Claimant.MenuItem_ViewDetails;
import typekey.EmploymentStatusType;
import typekey.PayPeriodType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/PIPEmploymentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PIPEmploymentInputSet extends PCFElement {
  public final static String CHECKSUM = "f6821fef75d910258fc9ef94d0eb2f43";
  
  public PIPEmploymentInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCompany_PrimaryContact() {
    return getOrCreateProperty("Company_PrimaryContact", "Company_PrimaryContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditableWorkStatusChangesLV getEditableWorkStatusChangesLV() {
    return getOrCreateProperty("EditableWorkStatusChangesLV", "EditableWorkStatusChangesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableWorkStatusChangesLV.class);
  }
  
  public EditableWorkStatusChangesLV_tb getEditableWorkStatusChangesLV_tb() {
    return getOrCreateProperty("EditableWorkStatusChangesLV_tb", "EditableWorkStatusChangesLV_tb", null, pcftest.PIPEmploymentInputSet.EditableWorkStatusChangesLV_tb.class);
  }
  
  public ValueElement getEmploymentData_DaysWorkedWeek() {
    return getOrCreateProperty("EmploymentData_DaysWorkedWeek", "EmploymentData_DaysWorkedWeek", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EmploymentData_EmploymentStatus getEmploymentData_EmploymentStatus() {
    return getOrCreateProperty("EmploymentData_EmploymentStatus", "EmploymentData_EmploymentStatus", null, pcftest.PIPEmploymentInputSet.EmploymentData_EmploymentStatus.class);
  }
  
  public DateElement getEmploymentData_HireDate() {
    return getOrCreateProperty("EmploymentData_HireDate", "EmploymentData_HireDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getEmploymentData_InjuryStartDate() {
    return getOrCreateProperty("EmploymentData_InjuryStartDate", "EmploymentData_InjuryStartDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getEmploymentData_InjuryStartTime() {
    return getOrCreateProperty("EmploymentData_InjuryStartTime", "EmploymentData_InjuryStartTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getEmploymentData_LastYearIncome() {
    return getOrCreateProperty("EmploymentData_LastYearIncome", "EmploymentData_LastYearIncome", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_NumDaysWorkedPerWeek() {
    return getOrCreateProperty("EmploymentData_NumDaysWorkedPerWeek", "EmploymentData_NumDaysWorkedPerWeek", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_NumHoursWorkedPerDay() {
    return getOrCreateProperty("EmploymentData_NumHoursWorkedPerDay", "EmploymentData_NumHoursWorkedPerDay", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_OvertimeRate() {
    return getOrCreateProperty("EmploymentData_OvertimeRate", "EmploymentData_OvertimeRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EmploymentData_PayPeriod getEmploymentData_PayPeriod() {
    return getOrCreateProperty("EmploymentData_PayPeriod", "EmploymentData_PayPeriod", null, pcftest.PIPEmploymentInputSet.EmploymentData_PayPeriod.class);
  }
  
  public ValueElement getEmploymentData_WageAmount() {
    return getOrCreateProperty("EmploymentData_WageAmount", "EmploymentData_WageAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getEmploymentData_WagePaymentCont() {
    return getOrCreateProperty("EmploymentData_WagePaymentCont", "EmploymentData_WagePaymentCont", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public PIPDamages_Claimant getPIPDamages_Claimant() {
    return getOrCreateProperty("PIPDamages_Claimant", "PIPDamages_Claimant", null, pcftest.PIPEmploymentInputSet.PIPDamages_Claimant.class);
  }
  
  public ValueElement getPerson_Employer() {
    return getOrCreateProperty("Person_Employer", "Person_Employer", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPerson_Occupation() {
    return getOrCreateProperty("Person_Occupation", "Person_Occupation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/PIPEmploymentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableWorkStatusChangesLV_tb extends PCFElement {
    public EditableWorkStatusChangesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.PIPEmploymentInputSet.EditableWorkStatusChangesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.PIPEmploymentInputSet.EditableWorkStatusChangesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/PIPEmploymentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/PIPEmploymentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/shared/exposures/PIPEmploymentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmploymentData_EmploymentStatus extends SelectElement {
    public EmploymentData_EmploymentStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(EmploymentStatusType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public EmploymentStatusType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.EmploymentStatusType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(EmploymentStatusType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/PIPEmploymentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmploymentData_PayPeriod extends SelectElement {
    public EmploymentData_PayPeriod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PayPeriodType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PayPeriodType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PayPeriodType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PayPeriodType arg) {
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
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.PIPEmploymentInputSet.PIPDamages_Claimant.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.PIPEmploymentInputSet.PIPDamages_Claimant.MenuItem_ViewDetails.class);
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