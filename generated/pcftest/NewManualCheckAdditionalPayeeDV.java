package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewManualCheckAdditionalPayeeDV.AddJointPayees;
import pcftest.NewManualCheckAdditionalPayeeDV.Check_BankAccount;
import pcftest.NewManualCheckAdditionalPayeeDV.Check_CheckPortion;
import pcftest.NewManualCheckAdditionalPayeeDV.Check_CheckPortion.PortionFixedAmountChoice_Choice;
import pcftest.NewManualCheckAdditionalPayeeDV.Check_CheckPortion.PortionPercentageChoice_Choice;
import pcftest.NewManualCheckAdditionalPayeeDV.Check_DeductionType;
import pcftest.NewManualCheckAdditionalPayeeDV.MailingAddressInputSet;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.PayeeNameHeader;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.PayeeTypeHeader;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV._ListPaging;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeType;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry._Select;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry._ViewDetail;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb.Add;
import pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb.Remove;
import pcftest.NewManualCheckAdditionalPayeeDV.PrimaryPayee_Name;
import typekey.BankAccount;
import typekey.ContactRole;
import typekey.DeductionType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewManualCheckAdditionalPayeeDV extends DetailViewElement {
  public final static String CHECKSUM = "80f0f60fab0ec12c60f0f276bdcb1024";
  
  public NewManualCheckAdditionalPayeeDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddJointPayees getAddJointPayees() {
    return getOrCreateProperty("AddJointPayees", "AddJointPayees", null, pcftest.NewManualCheckAdditionalPayeeDV.AddJointPayees.class);
  }
  
  public Check_BankAccount getCheck_BankAccount() {
    return getOrCreateProperty("Check_BankAccount", "Check_BankAccount", null, pcftest.NewManualCheckAdditionalPayeeDV.Check_BankAccount.class);
  }
  
  public ValueElement getCheck_CheckNumber() {
    return getOrCreateProperty("Check_CheckNumber", "Check_CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Check_CheckPortion getCheck_CheckPortion() {
    return getOrCreateProperty("Check_CheckPortion", "Check_CheckPortion", null, pcftest.NewManualCheckAdditionalPayeeDV.Check_CheckPortion.class);
  }
  
  public Check_DeductionType getCheck_DeductionType() {
    return getOrCreateProperty("Check_DeductionType", "Check_DeductionType", null, pcftest.NewManualCheckAdditionalPayeeDV.Check_DeductionType.class);
  }
  
  public SelectElement getCheck_DeliveryMethod() {
    return getOrCreateProperty("Check_DeliveryMethod", "Check_DeliveryMethod", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public DateElement getCheck_IssueDate() {
    return getOrCreateProperty("Check_IssueDate", "Check_IssueDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getCheck_MailToContact() {
    return getOrCreateProperty("Check_MailToContact", "Check_MailToContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_MailingAddress() {
    return getOrCreateProperty("Check_MailingAddress", "Check_MailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_PayTo() {
    return getOrCreateProperty("Check_PayTo", "Check_PayTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MailingAddressInputSet getMailingAddressInputSet() {
    return getOrCreateProperty("MailingAddressInputSet", "MailingAddressInputSet", null, pcftest.NewManualCheckAdditionalPayeeDV.MailingAddressInputSet.class);
  }
  
  public NewCheckPayeeDVPayeesLV getNewCheckPayeeDVPayeesLV() {
    return getOrCreateProperty("NewCheckPayeeDVPayeesLV", "NewCheckPayeeDVPayeesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.class);
  }
  
  public NewCheckPayeeDVPayeesLV_tb getNewCheckPayeeDVPayeesLV_tb() {
    return getOrCreateProperty("NewCheckPayeeDVPayeesLV_tb", "NewCheckPayeeDVPayeesLV_tb", null, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb.class);
  }
  
  public ValueElement getOldMailingAddress() {
    return getOrCreateProperty("OldMailingAddress", "OldMailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PrimaryPayee_Name getPrimaryPayee_Name() {
    return getOrCreateProperty("PrimaryPayee_Name", "PrimaryPayee_Name", null, pcftest.NewManualCheckAdditionalPayeeDV.PrimaryPayee_Name.class);
  }
  
  public SelectElement getPrimaryPayee_Type() {
    return getOrCreateProperty("PrimaryPayee_Type", "PrimaryPayee_Type", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public CheckboxValueElement getToggleAddressEdit() {
    return getOrCreateProperty("ToggleAddressEdit", "ToggleAddressEdit", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddJointPayees extends ValueElement {
    public AddJointPayees(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_BankAccount extends SelectElement {
    public Check_BankAccount(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(BankAccount arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public BankAccount getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BankAccount.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(BankAccount arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_CheckPortion extends PCFElement {
    public Check_CheckPortion(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getPortionFixedAmount() {
      return getOrCreateProperty("PortionFixedAmount", "PortionFixedAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PortionFixedAmountChoice_Choice getPortionFixedAmountChoice_Choice() {
      return getOrCreateProperty("PortionFixedAmountChoice_Choice", "PortionFixedAmountChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.NewManualCheckAdditionalPayeeDV.Check_CheckPortion.PortionFixedAmountChoice_Choice.class);
    }
    
    public ValueElement getPortionPercentage() {
      return getOrCreateProperty("PortionPercentage", "PortionPercentage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PortionPercentageChoice_Choice getPortionPercentageChoice_Choice() {
      return getOrCreateProperty("PortionPercentageChoice_Choice", "PortionPercentageChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.NewManualCheckAdditionalPayeeDV.Check_CheckPortion.PortionPercentageChoice_Choice.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PortionFixedAmountChoice_Choice extends RadioButtonValueElement {
      public PortionFixedAmountChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PortionPercentageChoice_Choice extends RadioButtonValueElement {
      public PortionPercentageChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_DeductionType extends SelectElement {
    public Check_DeductionType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DeductionType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DeductionType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DeductionType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DeductionType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MailingAddressInputSet extends PCFElement {
    public MailingAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDVPayeesLV extends PCFElement {
    public NewCheckPayeeDVPayeesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PayeeNameHeader getPayeeNameHeader() {
      return getOrCreateProperty("PayeeNameHeader", "PayeeNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.PayeeNameHeader.class);
    }
    
    public PayeeTypeHeader getPayeeTypeHeader() {
      return getOrCreateProperty("PayeeTypeHeader", "PayeeTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.PayeeTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeNameHeader extends ValueElement {
      public PayeeNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeTypeHeader extends ValueElement {
      public PayeeTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PayeeName getPayeeName() {
        return getOrCreateProperty("PayeeName", "PayeeName", null, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.class);
      }
      
      public PayeeType getPayeeType() {
        return getOrCreateProperty("PayeeType", "PayeeType", null, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeType.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PayeeName extends SelectElement {
        public PayeeName(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimContactDetailPopup click() {
          return clickThis(pcftest.ClaimContactDetailPopup.class);
        }
        
        public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
          return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
        }
        
        public pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_Search getMenuItem_Search() {
          return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_Search.class);
        }
        
        public pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_ViewDetails getMenuItem_ViewDetails() {
          return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_ViewDetails.class);
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
      @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PayeeType extends SelectElement {
        public PayeeType(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(ContactRole arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public ContactRole getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ContactRole.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(ContactRole arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDVPayeesLV_tb extends PCFElement {
    public NewCheckPayeeDVPayeesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewManualCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  public static class PrimaryPayee_Name extends SelectElement {
    public PrimaryPayee_Name(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewManualCheckAdditionalPayeeDV.PrimaryPayee_Name.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewManualCheckAdditionalPayeeDV.PrimaryPayee_Name.MenuItem_Search.class);
    }
    
    public pcftest.NewManualCheckAdditionalPayeeDV.PrimaryPayee_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewManualCheckAdditionalPayeeDV.PrimaryPayee_Name.MenuItem_ViewDetails.class);
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