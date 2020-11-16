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
import pcftest.PIPWageBenefitsInputSet.EmploymentData_PayPeriod;
import pcftest.PIPWageBenefitsInputSet.PIPDamages_Employer;
import pcftest.PIPWageBenefitsInputSet.PIPDamages_Employer.MenuItem_Search;
import pcftest.PIPWageBenefitsInputSet.PIPDamages_Employer.MenuItem_ViewDetails;
import typekey.PayPeriodType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/PIPWageBenefitsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PIPWageBenefitsInputSet extends PCFElement {
  public final static String CHECKSUM = "46675836bc27a8f93a624e9019c5056b";
  
  public PIPWageBenefitsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getEmployer_PrimaryAddress() {
    return getOrCreateProperty("Employer_PrimaryAddress", "Employer_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmployer_PrimaryContact() {
    return getOrCreateProperty("Employer_PrimaryContact", "Employer_PrimaryContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmployer_PrimaryPhone() {
    return getOrCreateProperty("Employer_PrimaryPhone", "Employer_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_NumDaysWorkedPerWeek() {
    return getOrCreateProperty("EmploymentData_NumDaysWorkedPerWeek", "EmploymentData_NumDaysWorkedPerWeek", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_NumHoursWorkedPerDay() {
    return getOrCreateProperty("EmploymentData_NumHoursWorkedPerDay", "EmploymentData_NumHoursWorkedPerDay", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EmploymentData_PayPeriod getEmploymentData_PayPeriod() {
    return getOrCreateProperty("EmploymentData_PayPeriod", "EmploymentData_PayPeriod", null, pcftest.PIPWageBenefitsInputSet.EmploymentData_PayPeriod.class);
  }
  
  public ValueElement getEmploymentData_WageAmount() {
    return getOrCreateProperty("EmploymentData_WageAmount", "EmploymentData_WageAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PIPDamages_Employer getPIPDamages_Employer() {
    return getOrCreateProperty("PIPDamages_Employer", "PIPDamages_Employer", null, pcftest.PIPWageBenefitsInputSet.PIPDamages_Employer.class);
  }
  
  public BooleanValueElement getWageBenefitCollected_Question() {
    return getOrCreateProperty("WageBenefitCollected_Question", "WageBenefitCollected_Question", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/PIPWageBenefitsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  public static class PIPDamages_Employer extends SelectElement {
    public PIPDamages_Employer(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.PIPWageBenefitsInputSet.PIPDamages_Employer.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.PIPWageBenefitsInputSet.PIPDamages_Employer.MenuItem_ViewDetails.class);
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