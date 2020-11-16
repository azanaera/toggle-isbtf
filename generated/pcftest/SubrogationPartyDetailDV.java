package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SubrogationPartyDetailDV.Adverse;
import pcftest.SubrogationPartyDetailDV.Classification;
import pcftest.SubrogationPartyDetailDV.ExpectedRecoveryHeader;
import pcftest.SubrogationPartyDetailDV.ExposureHeader;
import pcftest.SubrogationPartyDetailDV.GovInvolved;
import pcftest.SubrogationPartyDetailDV.Insurer;
import pcftest.SubrogationPartyDetailDV.InsurerContact;
import pcftest.SubrogationPartyDetailDV.LiabilityHeader;
import pcftest.SubrogationPartyDetailDV.PaymentPlan_ScheduledPayments;
import pcftest.SubrogationPartyDetailDV.PaymentPlan_ScheduledPayments.EditablePaymentScheduleLV_tb;
import pcftest.SubrogationPartyDetailDV.PaymentPlan_ScheduledPayments.EditablePaymentScheduleLV_tb.Add;
import pcftest.SubrogationPartyDetailDV.PaymentPlan_ScheduledPayments.EditablePaymentScheduleLV_tb.Remove;
import pcftest.SubrogationPartyDetailDV.RelationToAdverse;
import pcftest.SubrogationPartyDetailDV.ScheduleRecoveryType;
import pcftest.SubrogationPartyDetailDV.Strategy;
import pcftest.SubrogationPartyDetailDV.SubroKeyContact;
import pcftest.SubrogationPartyDetailDV._ListPaging;
import pcftest.SubrogationPartyDetailDV.collectionagency;
import pcftest.SubrogationPartyDetailDV.entry;
import pcftest.SubrogationPartyDetailDV.entry.Exposure;
import pcftest.SubrogationPartyDetailDV.entry._Select;
import pcftest.SubrogationPartyDetailDV.entry._ViewDetail;
import typekey.PersonRelationType;
import typekey.SubroClassification;
import typekey.SubroGovernmentInvolved;
import typekey.SubroSchedRecoveryType;
import typekey.SubroStrategy;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationPartyDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "6309f25605dc623d9a187c23eacc9611";
  
  public SubrogationPartyDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Adverse getAdverse() {
    return getOrCreateProperty("Adverse", "Adverse", null, pcftest.SubrogationPartyDetailDV.Adverse.class);
  }
  
  public ValueElement getAdverseParty_Address() {
    return getOrCreateProperty("AdverseParty_Address", "AdverseParty_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAdverseParty_PrimaryPhone() {
    return getOrCreateProperty("AdverseParty_PrimaryPhone", "AdverseParty_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCalcExpectedOSFromPayee() {
    return getOrCreateProperty("CalcExpectedOSFromPayee", "CalcExpectedOSFromPayee", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCalcOSForPayee() {
    return getOrCreateProperty("CalcOSForPayee", "CalcOSForPayee", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCalcRecovFromPayee() {
    return getOrCreateProperty("CalcRecovFromPayee", "CalcRecovFromPayee", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimNumber() {
    return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Classification getClassification() {
    return getOrCreateProperty("Classification", "Classification", null, pcftest.SubrogationPartyDetailDV.Classification.class);
  }
  
  public ValueElement getExpectedRecovery() {
    return getOrCreateProperty("ExpectedRecovery", "ExpectedRecovery", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ExpectedRecoveryHeader getExpectedRecoveryHeader() {
    return getOrCreateProperty("ExpectedRecoveryHeader", "ExpectedRecoveryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationPartyDetailDV.ExpectedRecoveryHeader.class);
  }
  
  public ExposureHeader getExposureHeader() {
    return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationPartyDetailDV.ExposureHeader.class);
  }
  
  public GovInvolved getGovInvolved() {
    return getOrCreateProperty("GovInvolved", "GovInvolved", null, pcftest.SubrogationPartyDetailDV.GovInvolved.class);
  }
  
  public Insurer getInsurer() {
    return getOrCreateProperty("Insurer", "Insurer", null, pcftest.SubrogationPartyDetailDV.Insurer.class);
  }
  
  public InsurerContact getInsurerContact() {
    return getOrCreateProperty("InsurerContact", "InsurerContact", null, pcftest.SubrogationPartyDetailDV.InsurerContact.class);
  }
  
  public ValueElement getInsurer_PrimaryPhone() {
    return getOrCreateProperty("Insurer_PrimaryPhone", "Insurer_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getKeyContact_Address() {
    return getOrCreateProperty("KeyContact_Address", "KeyContact_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getKeyContact_PrimaryPhone() {
    return getOrCreateProperty("KeyContact_PrimaryPhone", "KeyContact_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LiabilityHeader getLiabilityHeader() {
    return getOrCreateProperty("LiabilityHeader", "LiabilityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SubrogationPartyDetailDV.LiabilityHeader.class);
  }
  
  public ValueElement getLiabilityPercentage() {
    return getOrCreateProperty("LiabilityPercentage", "LiabilityPercentage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getNoteReceived() {
    return getOrCreateProperty("NoteReceived", "NoteReceived", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getNoteSent() {
    return getOrCreateProperty("NoteSent", "NoteSent", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public PaymentPlan_ScheduledPayments getPaymentPlan_ScheduledPayments() {
    return getOrCreateProperty("PaymentPlan_ScheduledPayments", "PaymentPlan_ScheduledPayments", null, pcftest.SubrogationPartyDetailDV.PaymentPlan_ScheduledPayments.class);
  }
  
  public ValueElement getPolicyNumber() {
    return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RelationToAdverse getRelationToAdverse() {
    return getOrCreateProperty("RelationToAdverse", "RelationToAdverse", null, pcftest.SubrogationPartyDetailDV.RelationToAdverse.class);
  }
  
  public BooleanValueElement getScheduleRecovery() {
    return getOrCreateProperty("ScheduleRecovery", "ScheduleRecovery", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ScheduleRecoveryType getScheduleRecoveryType() {
    return getOrCreateProperty("ScheduleRecoveryType", "ScheduleRecoveryType", null, pcftest.SubrogationPartyDetailDV.ScheduleRecoveryType.class);
  }
  
  public Strategy getStrategy() {
    return getOrCreateProperty("Strategy", "Strategy", null, pcftest.SubrogationPartyDetailDV.Strategy.class);
  }
  
  public SubroKeyContact getSubroKeyContact() {
    return getOrCreateProperty("SubroKeyContact", "SubroKeyContact", null, pcftest.SubrogationPartyDetailDV.SubroKeyContact.class);
  }
  
  public ValueElement getTotClaimCostSubroRecoveryForParty() {
    return getOrCreateProperty("TotClaimCostSubroRecoveryForParty", "TotClaimCostSubroRecoveryForParty", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalAmount() {
    return getOrCreateProperty("TotalAmount", "TotalAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SubrogationPartyDetailDV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SubrogationPartyDetailDV._ListPaging.class);
  }
  
  public collectionagency getcollectionagency() {
    return getOrCreateProperty("collectionagency", "collectionagency", null, pcftest.SubrogationPartyDetailDV.collectionagency.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Adverse extends SelectElement {
    public Adverse(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.SubrogationPartyDetailDV.Adverse.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.SubrogationPartyDetailDV.Adverse.MenuItem_Search.class);
    }
    
    public pcftest.SubrogationPartyDetailDV.Adverse.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.SubrogationPartyDetailDV.Adverse.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Classification extends SelectElement {
    public Classification(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SubroClassification arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SubroClassification getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubroClassification.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SubroClassification arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpectedRecoveryHeader extends ValueElement {
    public ExpectedRecoveryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureHeader extends ValueElement {
    public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GovInvolved extends SelectElement {
    public GovInvolved(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SubroGovernmentInvolved arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SubroGovernmentInvolved getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubroGovernmentInvolved.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SubroGovernmentInvolved arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Insurer extends SelectElement {
    public Insurer(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.SubrogationPartyDetailDV.Insurer.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.SubrogationPartyDetailDV.Insurer.MenuItem_Search.class);
    }
    
    public pcftest.SubrogationPartyDetailDV.Insurer.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.SubrogationPartyDetailDV.Insurer.MenuItem_ViewDetails.class);
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
  public static class InsurerContact extends SelectElement {
    public InsurerContact(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.SubrogationPartyDetailDV.InsurerContact.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.SubrogationPartyDetailDV.InsurerContact.MenuItem_Search.class);
    }
    
    public pcftest.SubrogationPartyDetailDV.InsurerContact.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.SubrogationPartyDetailDV.InsurerContact.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LiabilityHeader extends ValueElement {
    public LiabilityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentPlan_ScheduledPayments extends PCFElement {
    public PaymentPlan_ScheduledPayments(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditablePaymentScheduleLV getEditablePaymentScheduleLV() {
      return getOrCreateProperty("EditablePaymentScheduleLV", "EditablePaymentScheduleLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditablePaymentScheduleLV.class);
    }
    
    public EditablePaymentScheduleLV_tb getEditablePaymentScheduleLV_tb() {
      return getOrCreateProperty("EditablePaymentScheduleLV_tb", "EditablePaymentScheduleLV_tb", null, pcftest.SubrogationPartyDetailDV.PaymentPlan_ScheduledPayments.EditablePaymentScheduleLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditablePaymentScheduleLV_tb extends PCFElement {
      public EditablePaymentScheduleLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.SubrogationPartyDetailDV.PaymentPlan_ScheduledPayments.EditablePaymentScheduleLV_tb.Add.class);
      }
      
      public Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.SubrogationPartyDetailDV.PaymentPlan_ScheduledPayments.EditablePaymentScheduleLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelationToAdverse extends SelectElement {
    public RelationToAdverse(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PersonRelationType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PersonRelationType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PersonRelationType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PersonRelationType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScheduleRecoveryType extends SelectElement {
    public ScheduleRecoveryType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SubroSchedRecoveryType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SubroSchedRecoveryType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubroSchedRecoveryType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SubroSchedRecoveryType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Strategy extends SelectElement {
    public Strategy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SubroStrategy arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SubroStrategy getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubroStrategy.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SubroStrategy arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubroKeyContact extends SelectElement {
    public SubroKeyContact(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.SubrogationPartyDetailDV.SubroKeyContact.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.SubrogationPartyDetailDV.SubroKeyContact.MenuItem_Search.class);
    }
    
    public pcftest.SubrogationPartyDetailDV.SubroKeyContact.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.SubrogationPartyDetailDV.SubroKeyContact.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class collectionagency extends SelectElement {
    public collectionagency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.SubrogationPartyDetailDV.collectionagency.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.SubrogationPartyDetailDV.collectionagency.MenuItem_Search.class);
    }
    
    public pcftest.SubrogationPartyDetailDV.collectionagency.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.SubrogationPartyDetailDV.collectionagency.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getExpectedRecovery() {
      return getOrCreateProperty("ExpectedRecovery", "ExpectedRecovery", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Exposure getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, pcftest.SubrogationPartyDetailDV.entry.Exposure.class);
    }
    
    public ValueElement getLiability() {
      return getOrCreateProperty("Liability", "Liability", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.SubrogationPartyDetailDV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SubrogationPartyDetailDV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposure extends ValueElement {
      public Exposure(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SubrogationDetail click() {
        return clickThis(pcftest.SubrogationDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}