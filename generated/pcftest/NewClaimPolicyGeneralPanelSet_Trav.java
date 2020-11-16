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
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Agent_Name;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.DBA;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Insured_Name;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.PolicyHolder;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Status;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Type;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Underwriter_Name;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Underwriting_Company;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Underwriting_Group;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.PolicyCoverageListDetail;
import pcftest.NewClaimPolicyGeneralPanelSet_Trav.PolicyCoverageListDetail.EditableTravelPolicyCoveragesLV_tb;
import typekey.PolicyStatus;
import typekey.PolicyType;
import typekey.UnderwritingCompanyType;
import typekey.UnderwritingGroupType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimPolicyGeneralPanelSet_Trav extends NewClaimPolicyGeneralPanelSet {
  public final static String CHECKSUM = "040cceb75c49199282d1f230cd40bd22";
  
  public NewClaimPolicyGeneralPanelSet_Trav(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimPolicyGeneralDV getNewClaimPolicyGeneralDV() {
    return getOrCreateProperty("NewClaimPolicyGeneralDV", "NewClaimPolicyGeneralDV", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.class);
  }
  
  public PolicyCoverageListDetail getPolicyCoverageListDetail() {
    return getOrCreateProperty("PolicyCoverageListDetail", "PolicyCoverageListDetail", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.PolicyCoverageListDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("Agent_Name", "Agent_Name", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Agent_Name.class);
    }
    
    public DateElement getCancellationDate() {
      return getOrCreateProperty("CancellationDate", "CancellationDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Currency getCurrency() {
      return getOrCreateProperty("Currency", "Currency", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Currency.class);
    }
    
    public DBA getDBA() {
      return getOrCreateProperty("DBA", "DBA", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.DBA.class);
    }
    
    public EditableAdditionalInsuredLV getEditableAdditionalInsuredLV() {
      return getOrCreateProperty("EditableAdditionalInsuredLV", "EditableAdditionalInsuredLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableAdditionalInsuredLV.class);
    }
    
    public EditableAdditionalInsuredLV_tb getEditableAdditionalInsuredLV_tb() {
      return getOrCreateProperty("EditableAdditionalInsuredLV_tb", "EditableAdditionalInsuredLV_tb", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb.class);
    }
    
    public EditableExcludedPartiesLV getEditableExcludedPartiesLV() {
      return getOrCreateProperty("EditableExcludedPartiesLV", "EditableExcludedPartiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableExcludedPartiesLV.class);
    }
    
    public EditableExcludedPartiesLV_tb getEditableExcludedPartiesLV_tb() {
      return getOrCreateProperty("EditableExcludedPartiesLV_tb", "EditableExcludedPartiesLV_tb", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb.class);
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
      return getOrCreateProperty("Insured_Name", "Insured_Name", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Insured_Name.class);
    }
    
    public DateElement getOrigEffectiveDate() {
      return getOrCreateProperty("OrigEffectiveDate", "OrigEffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
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
      return getOrCreateProperty("PolicyHolder", "PolicyHolder", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.PolicyHolder.class);
    }
    
    public ValueElement getPolicyNumber() {
      return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getProducerCode() {
      return getOrCreateProperty("ProducerCode", "ProducerCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Status.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Type.class);
    }
    
    public Underwriter_Name getUnderwriter_Name() {
      return getOrCreateProperty("Underwriter_Name", "Underwriter_Name", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Underwriter_Name.class);
    }
    
    public Underwriting_Company getUnderwriting_Company() {
      return getOrCreateProperty("Underwriting_Company", "Underwriting_Company", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Underwriting_Company.class);
    }
    
    public Underwriting_Group getUnderwriting_Group() {
      return getOrCreateProperty("Underwriting_Group", "Underwriting_Group", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Underwriting_Group.class);
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
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Agent_Name.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Agent_Name.MenuItem_Search.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Agent_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Agent_Name.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.DBA.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.DBA.MenuItem_Search.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.DBA.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.DBA.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableAdditionalInsuredLV_tb extends PCFElement {
      public EditableAdditionalInsuredLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb.Add.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableAdditionalInsuredLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableExcludedPartiesLV_tb extends PCFElement {
      public EditableExcludedPartiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb.Add.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.EditableExcludedPartiesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Insured_Name.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Insured_Name.MenuItem_Search.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Insured_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Insured_Name.MenuItem_ViewDetails.class);
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
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.PolicyHolder.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.PolicyHolder.MenuItem_Search.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.PolicyHolder.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.PolicyHolder.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Underwriter_Name.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Underwriter_Name.MenuItem_Search.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Underwriter_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.NewClaimPolicyGeneralDV.Underwriter_Name.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyCoverageListDetail extends PCFElement {
    public PolicyCoverageListDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyCovTermsCV getClaimPolicyCovTermsCV() {
      return getOrCreateProperty("ClaimPolicyCovTermsCV", "ClaimPolicyCovTermsCV", null, pcftest.ClaimPolicyCovTermsCV.class);
    }
    
    public EditableTravelPolicyCoveragesLV getEditableTravelPolicyCoveragesLV() {
      return getOrCreateProperty("EditableTravelPolicyCoveragesLV", "EditableTravelPolicyCoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableTravelPolicyCoveragesLV.class);
    }
    
    public EditableTravelPolicyCoveragesLV_tb getEditableTravelPolicyCoveragesLV_tb() {
      return getOrCreateProperty("EditableTravelPolicyCoveragesLV_tb", "EditableTravelPolicyCoveragesLV_tb", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.PolicyCoverageListDetail.EditableTravelPolicyCoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableTravelPolicyCoveragesLV_tb extends PCFElement {
      public EditableTravelPolicyCoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.PolicyCoverageListDetail.EditableTravelPolicyCoveragesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.PolicyCoverageListDetail.EditableTravelPolicyCoveragesLV_tb.Add.class);
      }
      
      public pcftest.NewClaimPolicyGeneralPanelSet_Trav.PolicyCoverageListDetail.EditableTravelPolicyCoveragesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimPolicyGeneralPanelSet_Trav.PolicyCoverageListDetail.EditableTravelPolicyCoveragesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPolicyGeneralPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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