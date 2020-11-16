package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Agent_Name;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.DBA;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Insured_Name;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.PolicyHolder;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Status;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Type;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Underwriter_Name;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Underwriting_Company;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Underwriting_Group;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.WorkersComp_PolicyRatingPlan;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.PolicyCoverageListDetail;
import pcftest.NewClaimPolicyGeneralPanelSet_Wc.PolicyCoverageListDetail.EditableWorkersCompPolicyCoveragesLV_tb;
import typekey.PolicyRatingPlan;
import typekey.PolicyStatus;
import typekey.PolicyType;
import typekey.UnderwritingCompanyType;
import typekey.UnderwritingGroupType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimPolicyGeneralPanelSet_Wc extends NewClaimPolicyGeneralPanelSet {
  public final static String CHECKSUM = "774be25514dd88fb5ee2287b863cc7b8";
  
  public NewClaimPolicyGeneralPanelSet_Wc(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimPolicyGeneralDV getNewClaimPolicyGeneralDV() {
    return getOrCreateProperty("NewClaimPolicyGeneralDV", "NewClaimPolicyGeneralDV", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.class);
  }
  
  public PolicyCoverageListDetail getPolicyCoverageListDetail() {
    return getOrCreateProperty("PolicyCoverageListDetail", "PolicyCoverageListDetail", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.PolicyCoverageListDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimPolicyGeneralDV extends DetailViewElement {
    public NewClaimPolicyGeneralDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAccountName() {
      return getOrCreateProperty("AccountName", "AccountName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getAccountNumber() {
      return getOrCreateProperty("AccountNumber", "AccountNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Agent_Name getAgent_Name() {
      return getOrCreateProperty("Agent_Name", "Agent_Name", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Agent_Name.class);
    }
    
    public DateElement getCancellationDate() {
      return getOrCreateProperty("CancellationDate", "CancellationDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Currency getCurrency() {
      return getOrCreateProperty("Currency", "Currency", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Currency.class);
    }
    
    public DBA getDBA() {
      return getOrCreateProperty("DBA", "DBA", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.DBA.class);
    }
    
    public EditableAdditionalInsuredLV getEditableAdditionalInsuredLV() {
      return getOrCreateProperty("EditableAdditionalInsuredLV", "EditableAdditionalInsuredLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableAdditionalInsuredLV.class);
    }
    
    public EditableAdditionalInsuredLV_tb getEditableAdditionalInsuredLV_tb() {
      return getOrCreateProperty("EditableAdditionalInsuredLV_tb", "EditableAdditionalInsuredLV_tb", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb.class);
    }
    
    public EditableExcludedPartiesLV getEditableExcludedPartiesLV() {
      return getOrCreateProperty("EditableExcludedPartiesLV", "EditableExcludedPartiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableExcludedPartiesLV.class);
    }
    
    public EditableExcludedPartiesLV_tb getEditableExcludedPartiesLV_tb() {
      return getOrCreateProperty("EditableExcludedPartiesLV_tb", "EditableExcludedPartiesLV_tb", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb.class);
    }
    
    public DateElement getEffectiveDate() {
      return getOrCreateProperty("EffectiveDate", "EffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getExpirationDate() {
      return getOrCreateProperty("ExpirationDate", "ExpirationDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getInsured_Address() {
      return getOrCreateProperty("Insured_Address", "Insured_Address", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Insured_Name getInsured_Name() {
      return getOrCreateProperty("Insured_Name", "Insured_Name", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Insured_Name.class);
    }
    
    public DateElement getOrigEffectiveDate() {
      return getOrCreateProperty("OrigEffectiveDate", "OrigEffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getOther_AssignedRisk() {
      return getOrCreateProperty("Other_AssignedRisk", "Other_AssignedRisk", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getOther_ForeignCoverage() {
      return getOrCreateProperty("Other_ForeignCoverage", "Other_ForeignCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getOther_Notes() {
      return getOrCreateProperty("Other_Notes", "Other_Notes", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOther_OtherFinancialInterests() {
      return getOrCreateProperty("Other_OtherFinancialInterests", "Other_OtherFinancialInterests", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getOther_VerifiedPolicy() {
      return getOrCreateProperty("Other_VerifiedPolicy", "Other_VerifiedPolicy", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public PolicyHolder getPolicyHolder() {
      return getOrCreateProperty("PolicyHolder", "PolicyHolder", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.PolicyHolder.class);
    }
    
    public ValueElement getPolicyNumber() {
      return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getProducerCode() {
      return getOrCreateProperty("ProducerCode", "ProducerCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Status.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Type.class);
    }
    
    public Underwriter_Name getUnderwriter_Name() {
      return getOrCreateProperty("Underwriter_Name", "Underwriter_Name", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Underwriter_Name.class);
    }
    
    public Underwriting_Company getUnderwriting_Company() {
      return getOrCreateProperty("Underwriting_Company", "Underwriting_Company", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Underwriting_Company.class);
    }
    
    public Underwriting_Group getUnderwriting_Group() {
      return getOrCreateProperty("Underwriting_Group", "Underwriting_Group", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Underwriting_Group.class);
    }
    
    public ValueElement getWorkersComp_InsuredSicCode() {
      return getOrCreateProperty("WorkersComp_InsuredSicCode", "WorkersComp_InsuredSicCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getWorkersComp_OtherStates() {
      return getOrCreateProperty("WorkersComp_OtherStates", "WorkersComp_OtherStates", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public WorkersComp_PolicyRatingPlan getWorkersComp_PolicyRatingPlan() {
      return getOrCreateProperty("WorkersComp_PolicyRatingPlan", "WorkersComp_PolicyRatingPlan", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.WorkersComp_PolicyRatingPlan.class);
    }
    
    public BooleanValueElement getWorkersComp_ReturnToWorkPrgm() {
      return getOrCreateProperty("WorkersComp_ReturnToWorkPrgm", "WorkersComp_ReturnToWorkPrgm", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getWorkersComp_States() {
      return getOrCreateProperty("WorkersComp_States", "WorkersComp_States", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Agent_Name extends SelectElement {
      public Agent_Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Agent_Name.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Agent_Name.MenuItem_Search.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Agent_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Agent_Name.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Currency extends SelectElement {
      public Currency(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.Currency arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.Currency getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.Currency arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DBA extends SelectElement {
      public DBA(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.DBA.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.DBA.MenuItem_Search.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.DBA.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.DBA.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableAdditionalInsuredLV_tb extends PCFElement {
      public EditableAdditionalInsuredLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb.Add.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableExcludedPartiesLV_tb extends PCFElement {
      public EditableExcludedPartiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb.Add.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Insured_Name extends SelectElement {
      public Insured_Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Insured_Name.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Insured_Name.MenuItem_Search.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Insured_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Insured_Name.MenuItem_ViewDetails.class);
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
    public static class PolicyHolder extends SelectElement {
      public PolicyHolder(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.PolicyHolder.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.PolicyHolder.MenuItem_Search.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.PolicyHolder.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.PolicyHolder.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends SelectElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(PolicyStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public PolicyStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(PolicyStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Type extends SelectElement {
      public Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(PolicyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public PolicyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(PolicyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Underwriter_Name extends SelectElement {
      public Underwriter_Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Underwriter_Name.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Underwriter_Name.MenuItem_Search.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Underwriter_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.NewClaimPolicyGeneralDV.Underwriter_Name.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Underwriting_Company extends SelectElement {
      public Underwriting_Company(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(UnderwritingCompanyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public UnderwritingCompanyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.UnderwritingCompanyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(UnderwritingCompanyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Underwriting_Group extends SelectElement {
      public Underwriting_Group(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(UnderwritingGroupType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public UnderwritingGroupType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.UnderwritingGroupType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(UnderwritingGroupType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkersComp_PolicyRatingPlan extends SelectElement {
      public WorkersComp_PolicyRatingPlan(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(PolicyRatingPlan arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public PolicyRatingPlan getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyRatingPlan.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(PolicyRatingPlan arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyCoverageListDetail extends PCFElement {
    public PolicyCoverageListDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyCovTermsCV getClaimPolicyCovTermsCV() {
      return getOrCreateProperty("ClaimPolicyCovTermsCV", "ClaimPolicyCovTermsCV", null, pcftest.ClaimPolicyCovTermsCV.class);
    }
    
    public EditableWorkersCompPolicyCoveragesLV getEditableWorkersCompPolicyCoveragesLV() {
      return getOrCreateProperty("EditableWorkersCompPolicyCoveragesLV", "EditableWorkersCompPolicyCoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableWorkersCompPolicyCoveragesLV.class);
    }
    
    public EditableWorkersCompPolicyCoveragesLV_tb getEditableWorkersCompPolicyCoveragesLV_tb() {
      return getOrCreateProperty("EditableWorkersCompPolicyCoveragesLV_tb", "EditableWorkersCompPolicyCoveragesLV_tb", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.PolicyCoverageListDetail.EditableWorkersCompPolicyCoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableWorkersCompPolicyCoveragesLV_tb extends PCFElement {
      public EditableWorkersCompPolicyCoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.PolicyCoverageListDetail.EditableWorkersCompPolicyCoveragesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.PolicyCoverageListDetail.EditableWorkersCompPolicyCoveragesLV_tb.Add.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Wc.PolicyCoverageListDetail.EditableWorkersCompPolicyCoveragesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimPolicyGeneralPanelSet_Wc.PolicyCoverageListDetail.EditableWorkersCompPolicyCoveragesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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