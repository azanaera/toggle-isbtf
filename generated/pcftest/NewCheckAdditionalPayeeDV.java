package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.NewCheckAdditionalPayeeDV.AddJointPayees;
import pcftest.NewCheckAdditionalPayeeDV.CheckPortion;
import pcftest.NewCheckAdditionalPayeeDV.CheckPortion.PortionFixedAmountChoice_Choice;
import pcftest.NewCheckAdditionalPayeeDV.CheckPortion.PortionPercentageChoice_Choice;
import pcftest.NewCheckAdditionalPayeeDV.CheckPortion.TransactionPortion;
import pcftest.NewCheckAdditionalPayeeDV.EFTDataInputSet;
import pcftest.NewCheckAdditionalPayeeDV.MailingAddressInputSet;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.PayeeNameHeader;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.PayeeTypeHeader;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV._ListPaging;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeType;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry._Select;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry._ViewDetail;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb.Add;
import pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb.Remove;
import pcftest.NewCheckAdditionalPayeeDV.PrimaryPayee_Name;
import typekey.ContactRole;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckAdditionalPayeeDV extends DetailViewElement {
  public final static String CHECKSUM = "15f0928b3dad79a689eafee40d532dd0";
  
  public NewCheckAdditionalPayeeDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddJointPayees getAddJointPayees() {
    return getOrCreateProperty("AddJointPayees", "AddJointPayees", null, pcftest.NewCheckAdditionalPayeeDV.AddJointPayees.class);
  }
  
  public CheckPortion getCheckPortion() {
    return getOrCreateProperty("CheckPortion", "CheckPortion", null, pcftest.NewCheckAdditionalPayeeDV.CheckPortion.class);
  }
  
  public pcftest.NewCheckAdditionalPayeeDV.DeductionType getDeductionType() {
    return getOrCreateProperty("DeductionType", "DeductionType", null, pcftest.NewCheckAdditionalPayeeDV.DeductionType.class);
  }
  
  public pcftest.NewCheckAdditionalPayeeDV.DeliveryMethod getDeliveryMethod() {
    return getOrCreateProperty("DeliveryMethod", "DeliveryMethod", null, pcftest.NewCheckAdditionalPayeeDV.DeliveryMethod.class);
  }
  
  public EFTDataInputSet getEFTDataInputSet() {
    return getOrCreateProperty("EFTDataInputSet", "EFTDataInputSet", null, pcftest.NewCheckAdditionalPayeeDV.EFTDataInputSet.class);
  }
  
  public ValueElement getMailToContact() {
    return getOrCreateProperty("MailToContact", "MailToContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMailingAddress() {
    return getOrCreateProperty("MailingAddress", "MailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MailingAddressInputSet getMailingAddressInputSet() {
    return getOrCreateProperty("MailingAddressInputSet", "MailingAddressInputSet", null, pcftest.NewCheckAdditionalPayeeDV.MailingAddressInputSet.class);
  }
  
  public NewCheckPayeeDVPayeesLV getNewCheckPayeeDVPayeesLV() {
    return getOrCreateProperty("NewCheckPayeeDVPayeesLV", "NewCheckPayeeDVPayeesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.class);
  }
  
  public NewCheckPayeeDVPayeesLV_tb getNewCheckPayeeDVPayeesLV_tb() {
    return getOrCreateProperty("NewCheckPayeeDVPayeesLV_tb", "NewCheckPayeeDVPayeesLV_tb", null, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb.class);
  }
  
  public ValueElement getOldMailingAddress() {
    return getOrCreateProperty("OldMailingAddress", "OldMailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPayTo() {
    return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getPaymentMethod() {
    return getOrCreateProperty("PaymentMethod", "PaymentMethod", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public PrimaryPayee_Name getPrimaryPayee_Name() {
    return getOrCreateProperty("PrimaryPayee_Name", "PrimaryPayee_Name", null, pcftest.NewCheckAdditionalPayeeDV.PrimaryPayee_Name.class);
  }
  
  public SelectElement getPrimaryPayee_Type() {
    return getOrCreateProperty("PrimaryPayee_Type", "PrimaryPayee_Type", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public CheckboxValueElement getToggleAddressEdit() {
    return getOrCreateProperty("ToggleAddressEdit", "ToggleAddressEdit", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddJointPayees extends ValueElement {
    public AddJointPayees(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckPortion extends PCFElement {
    public CheckPortion(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getPortionFixedAmount() {
      return getOrCreateProperty("PortionFixedAmount", "PortionFixedAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PortionFixedAmountChoice_Choice getPortionFixedAmountChoice_Choice() {
      return getOrCreateProperty("PortionFixedAmountChoice_Choice", "PortionFixedAmountChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.NewCheckAdditionalPayeeDV.CheckPortion.PortionFixedAmountChoice_Choice.class);
    }
    
    public ValueElement getPortionPercentage() {
      return getOrCreateProperty("PortionPercentage", "PortionPercentage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PortionPercentageChoice_Choice getPortionPercentageChoice_Choice() {
      return getOrCreateProperty("PortionPercentageChoice_Choice", "PortionPercentageChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.NewCheckAdditionalPayeeDV.CheckPortion.PortionPercentageChoice_Choice.class);
    }
    
    public TransactionPortion getTransactionPortion() {
      return getOrCreateProperty("TransactionPortion", "TransactionPortion", null, pcftest.NewCheckAdditionalPayeeDV.CheckPortion.TransactionPortion.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PortionFixedAmountChoice_Choice extends RadioButtonValueElement {
      public PortionFixedAmountChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PortionPercentageChoice_Choice extends RadioButtonValueElement {
      public PortionPercentageChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TransactionPortion extends ValueElement {
      public TransactionPortion(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeductionType extends SelectElement {
    public DeductionType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.DeductionType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.DeductionType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DeductionType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.DeductionType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeliveryMethod extends SelectElement {
    public DeliveryMethod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.DeliveryMethod arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.DeliveryMethod getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DeliveryMethod.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.DeliveryMethod arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EFTDataInputSet extends PCFElement {
    public EFTDataInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getBankAccountNumber() {
      return getOrCreateProperty("BankAccountNumber", "BankAccountNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getBankAccountType() {
      return getOrCreateProperty("BankAccountType", "BankAccountType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getBankName() {
      return getOrCreateProperty("BankName", "BankName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBankRoutingNumber() {
      return getOrCreateProperty("BankRoutingNumber", "BankRoutingNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getEFTRecords() {
      return getOrCreateProperty("EFTRecords", "EFTRecords", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getPayTo() {
      return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MailingAddressInputSet extends PCFElement {
    public MailingAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDVPayeesLV extends PCFElement {
    public NewCheckPayeeDVPayeesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PayeeNameHeader getPayeeNameHeader() {
      return getOrCreateProperty("PayeeNameHeader", "PayeeNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.PayeeNameHeader.class);
    }
    
    public PayeeTypeHeader getPayeeTypeHeader() {
      return getOrCreateProperty("PayeeTypeHeader", "PayeeTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.PayeeTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeNameHeader extends ValueElement {
      public PayeeNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeTypeHeader extends ValueElement {
      public PayeeTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PayeeName getPayeeName() {
        return getOrCreateProperty("PayeeName", "PayeeName", null, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.class);
      }
      
      public PayeeType getPayeeType() {
        return getOrCreateProperty("PayeeType", "PayeeType", null, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeType.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry._ViewDetail.class);
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
        
        public pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_Search getMenuItem_Search() {
          return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_Search.class);
        }
        
        public pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_ViewDetails getMenuItem_ViewDetails() {
          return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_ViewDetails.class);
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
      @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDVPayeesLV_tb extends PCFElement {
    public NewCheckPayeeDVPayeesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewCheckAdditionalPayeeDV.NewCheckPayeeDVPayeesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewCheckAdditionalPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public pcftest.NewCheckAdditionalPayeeDV.PrimaryPayee_Name.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewCheckAdditionalPayeeDV.PrimaryPayee_Name.MenuItem_Search.class);
    }
    
    public pcftest.NewCheckAdditionalPayeeDV.PrimaryPayee_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewCheckAdditionalPayeeDV.PrimaryPayee_Name.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewCheckWizardAddressBookPickerPopup click() {
        return clickThis(pcftest.NewCheckWizardAddressBookPickerPopup.class);
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