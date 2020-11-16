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
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.QuickCheckBasicsDV.AddJointPayees;
import pcftest.QuickCheckBasicsDV.Check_DeliveryMethod;
import pcftest.QuickCheckBasicsDV.Check_Reportability;
import pcftest.QuickCheckBasicsDV.EFTDataInputSet;
import pcftest.QuickCheckBasicsDV.EditablePaymentLineItemsLV_tb;
import pcftest.QuickCheckBasicsDV.EditablePaymentLineItemsLV_tb.ApplyDeductibleButton;
import pcftest.QuickCheckBasicsDV.MailingAddressInputSet;
import pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV;
import pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.PayeeNameHeader;
import pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.PayeeTypeHeader;
import pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV._ListPaging;
import pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry;
import pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry.PayeeName;
import pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry.PayeeType;
import pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry._Select;
import pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry._ViewDetail;
import pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV_tb;
import pcftest.QuickCheckBasicsDV.Payment_Currency;
import pcftest.QuickCheckBasicsDV.Payment_PaymentType;
import pcftest.QuickCheckBasicsDV.PrimaryPayee_Name;
import typekey.ContactRole;
import typekey.Currency;
import typekey.DeliveryMethod;
import typekey.PaymentType;
import typekey.ReportabilityType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickCheckBasicsDV extends DetailViewElement {
  public final static String CHECKSUM = "081b3bfce377813d78982f503107471e";
  
  public QuickCheckBasicsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddJointPayees getAddJointPayees() {
    return getOrCreateProperty("AddJointPayees", "AddJointPayees", null, pcftest.QuickCheckBasicsDV.AddJointPayees.class);
  }
  
  public CheckExchangeRateInputSet getCheckExchangeRateInputSet() {
    return getOrCreateProperty("CheckExchangeRateInputSet", "CheckExchangeRateInputSet", null, pcftest.CheckExchangeRateInputSet.class);
  }
  
  public Check_DeliveryMethod getCheck_DeliveryMethod() {
    return getOrCreateProperty("Check_DeliveryMethod", "Check_DeliveryMethod", null, pcftest.QuickCheckBasicsDV.Check_DeliveryMethod.class);
  }
  
  public ValueElement getCheck_MailToContact() {
    return getOrCreateProperty("Check_MailToContact", "Check_MailToContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_MailingAddress() {
    return getOrCreateProperty("Check_MailingAddress", "Check_MailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Check_Reportability getCheck_Reportability() {
    return getOrCreateProperty("Check_Reportability", "Check_Reportability", null, pcftest.QuickCheckBasicsDV.Check_Reportability.class);
  }
  
  public EFTDataInputSet getEFTDataInputSet() {
    return getOrCreateProperty("EFTDataInputSet", "EFTDataInputSet", null, pcftest.QuickCheckBasicsDV.EFTDataInputSet.class);
  }
  
  public EditablePaymentLineItemsLV_default getEditablePaymentLineItemsLV_default() {
    return getOrCreateProperty("EditablePaymentLineItemsLV_default", "EditablePaymentLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditablePaymentLineItemsLV_default.class);
  }
  
  public EditablePaymentLineItemsLV_tb getEditablePaymentLineItemsLV_tb() {
    return getOrCreateProperty("EditablePaymentLineItemsLV_tb", "EditablePaymentLineItemsLV_tb", null, pcftest.QuickCheckBasicsDV.EditablePaymentLineItemsLV_tb.class);
  }
  
  public MailingAddressInputSet getMailingAddressInputSet() {
    return getOrCreateProperty("MailingAddressInputSet", "MailingAddressInputSet", null, pcftest.QuickCheckBasicsDV.MailingAddressInputSet.class);
  }
  
  public NewCheckPayeeDVPayeesLV getNewCheckPayeeDVPayeesLV() {
    return getOrCreateProperty("NewCheckPayeeDVPayeesLV", "NewCheckPayeeDVPayeesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.class);
  }
  
  public NewCheckPayeeDVPayeesLV_tb getNewCheckPayeeDVPayeesLV_tb() {
    return getOrCreateProperty("NewCheckPayeeDVPayeesLV_tb", "NewCheckPayeeDVPayeesLV_tb", null, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV_tb.class);
  }
  
  public ValueElement getPayTo() {
    return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getPaymentMethod() {
    return getOrCreateProperty("PaymentMethod", "PaymentMethod", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Payment_Currency getPayment_Currency() {
    return getOrCreateProperty("Payment_Currency", "Payment_Currency", null, pcftest.QuickCheckBasicsDV.Payment_Currency.class);
  }
  
  public BooleanValueElement getPayment_Eroding() {
    return getOrCreateProperty("Payment_Eroding", "Payment_Eroding", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Payment_PaymentType getPayment_PaymentType() {
    return getOrCreateProperty("Payment_PaymentType", "Payment_PaymentType", null, pcftest.QuickCheckBasicsDV.Payment_PaymentType.class);
  }
  
  public PrimaryPayee_Name getPrimaryPayee_Name() {
    return getOrCreateProperty("PrimaryPayee_Name", "PrimaryPayee_Name", null, pcftest.QuickCheckBasicsDV.PrimaryPayee_Name.class);
  }
  
  public SelectElement getPrimaryPayee_Type() {
    return getOrCreateProperty("PrimaryPayee_Type", "PrimaryPayee_Type", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ReserveLineInputSet getReserveLineInputSet() {
    return getOrCreateProperty("ReserveLineInputSet", "ReserveLineInputSet", null, pcftest.ReserveLineInputSet.class);
  }
  
  public CheckboxValueElement getToggleAddressEdit() {
    return getOrCreateProperty("ToggleAddressEdit", "ToggleAddressEdit", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ValueElement getTransaction_AvailableReserves() {
    return getOrCreateProperty("Transaction_AvailableReserves", "Transaction_AvailableReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTransaction_Comments() {
    return getOrCreateProperty("Transaction_Comments", "Transaction_Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddJointPayees extends ValueElement {
    public AddJointPayees(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_DeliveryMethod extends SelectElement {
    public Check_DeliveryMethod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DeliveryMethod arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DeliveryMethod getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DeliveryMethod.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DeliveryMethod arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_Reportability extends SelectElement {
    public Check_Reportability(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ReportabilityType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ReportabilityType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ReportabilityType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ReportabilityType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditablePaymentLineItemsLV_tb extends PCFElement {
    public EditablePaymentLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.QuickCheckBasicsDV.EditablePaymentLineItemsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.QuickCheckBasicsDV.EditablePaymentLineItemsLV_tb.Add.class);
    }
    
    public ApplyDeductibleButton getApplyDeductibleButton() {
      return getOrCreateProperty("ApplyDeductibleButton", "ApplyDeductibleButton", null, pcftest.QuickCheckBasicsDV.EditablePaymentLineItemsLV_tb.ApplyDeductibleButton.class);
    }
    
    public pcftest.QuickCheckBasicsDV.EditablePaymentLineItemsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.QuickCheckBasicsDV.EditablePaymentLineItemsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApplyDeductibleButton extends ClickableActionElement {
      public ApplyDeductibleButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MailingAddressInputSet extends PCFElement {
    public MailingAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDVPayeesLV extends PCFElement {
    public NewCheckPayeeDVPayeesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PayeeNameHeader getPayeeNameHeader() {
      return getOrCreateProperty("PayeeNameHeader", "PayeeNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.PayeeNameHeader.class);
    }
    
    public PayeeTypeHeader getPayeeTypeHeader() {
      return getOrCreateProperty("PayeeTypeHeader", "PayeeTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.PayeeTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeNameHeader extends ValueElement {
      public PayeeNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeTypeHeader extends ValueElement {
      public PayeeTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PayeeName getPayeeName() {
        return getOrCreateProperty("PayeeName", "PayeeName", null, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.class);
      }
      
      public PayeeType getPayeeType() {
        return getOrCreateProperty("PayeeType", "PayeeType", null, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry.PayeeType.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry._ViewDetail.class);
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
        
        public pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_Search getMenuItem_Search() {
          return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_Search.class);
        }
        
        public pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_ViewDetails getMenuItem_ViewDetails() {
          return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_ViewDetails.class);
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
      @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDVPayeesLV_tb extends PCFElement {
    public NewCheckPayeeDVPayeesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV_tb.Add.class);
    }
    
    public pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.QuickCheckBasicsDV.NewCheckPayeeDVPayeesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Payment_Currency extends SelectElement {
    public Payment_Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Payment_PaymentType extends SelectElement {
    public Payment_PaymentType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PaymentType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PaymentType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PaymentType arg) {
      setValue(arg == null ? null : arg.getCode());
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
    
    public pcftest.QuickCheckBasicsDV.PrimaryPayee_Name.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.QuickCheckBasicsDV.PrimaryPayee_Name.MenuItem_Search.class);
    }
    
    public pcftest.QuickCheckBasicsDV.PrimaryPayee_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.QuickCheckBasicsDV.PrimaryPayee_Name.MenuItem_ViewDetails.class);
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