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
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewManualCheckPayeeDV.AddJointPayees;
import pcftest.NewManualCheckPayeeDV.Check_BankAccount;
import pcftest.NewManualCheckPayeeDV.Check_Reportability;
import pcftest.NewManualCheckPayeeDV.MailingAddressInputSet;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.PayeeNameHeader;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.PayeeTypeHeader;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV._ListPaging;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeType;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry._Select;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry._ViewDetail;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV_tb;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV_tb.Add;
import pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV_tb.Remove;
import pcftest.NewManualCheckPayeeDV.PrimaryPayee_Name;
import typekey.BankAccount;
import typekey.ContactRole;
import typekey.ReportabilityType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewManualCheckPayeeDV extends DetailViewElement {
  public final static String CHECKSUM = "535a26615d231b4396cbf08d77fca003";
  
  public NewManualCheckPayeeDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddJointPayees getAddJointPayees() {
    return getOrCreateProperty("AddJointPayees", "AddJointPayees", null, pcftest.NewManualCheckPayeeDV.AddJointPayees.class);
  }
  
  public Check_BankAccount getCheck_BankAccount() {
    return getOrCreateProperty("Check_BankAccount", "Check_BankAccount", null, pcftest.NewManualCheckPayeeDV.Check_BankAccount.class);
  }
  
  public ValueElement getCheck_CheckNumber() {
    return getOrCreateProperty("Check_CheckNumber", "Check_CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public Check_Reportability getCheck_Reportability() {
    return getOrCreateProperty("Check_Reportability", "Check_Reportability", null, pcftest.NewManualCheckPayeeDV.Check_Reportability.class);
  }
  
  public MailingAddressInputSet getMailingAddressInputSet() {
    return getOrCreateProperty("MailingAddressInputSet", "MailingAddressInputSet", null, pcftest.NewManualCheckPayeeDV.MailingAddressInputSet.class);
  }
  
  public NewCheckPayeeDVPayeesLV getNewCheckPayeeDVPayeesLV() {
    return getOrCreateProperty("NewCheckPayeeDVPayeesLV", "NewCheckPayeeDVPayeesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.class);
  }
  
  public NewCheckPayeeDVPayeesLV_tb getNewCheckPayeeDVPayeesLV_tb() {
    return getOrCreateProperty("NewCheckPayeeDVPayeesLV_tb", "NewCheckPayeeDVPayeesLV_tb", null, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV_tb.class);
  }
  
  public ValueElement getOldMailingAddress() {
    return getOrCreateProperty("OldMailingAddress", "OldMailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PrimaryPayee_Name getPrimaryPayee_Name() {
    return getOrCreateProperty("PrimaryPayee_Name", "PrimaryPayee_Name", null, pcftest.NewManualCheckPayeeDV.PrimaryPayee_Name.class);
  }
  
  public SelectElement getPrimaryPayee_Type() {
    return getOrCreateProperty("PrimaryPayee_Type", "PrimaryPayee_Type", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public CheckboxValueElement getToggleAddressEdit() {
    return getOrCreateProperty("ToggleAddressEdit", "ToggleAddressEdit", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddJointPayees extends ValueElement {
    public AddJointPayees(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MailingAddressInputSet extends PCFElement {
    public MailingAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDVPayeesLV extends PCFElement {
    public NewCheckPayeeDVPayeesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PayeeNameHeader getPayeeNameHeader() {
      return getOrCreateProperty("PayeeNameHeader", "PayeeNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.PayeeNameHeader.class);
    }
    
    public PayeeTypeHeader getPayeeTypeHeader() {
      return getOrCreateProperty("PayeeTypeHeader", "PayeeTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.PayeeTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeNameHeader extends ValueElement {
      public PayeeNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeTypeHeader extends ValueElement {
      public PayeeTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PayeeName getPayeeName() {
        return getOrCreateProperty("PayeeName", "PayeeName", null, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.class);
      }
      
      public PayeeType getPayeeType() {
        return getOrCreateProperty("PayeeType", "PayeeType", null, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeType.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry._ViewDetail.class);
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
        
        public pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_Search getMenuItem_Search() {
          return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_Search.class);
        }
        
        public pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_ViewDetails getMenuItem_ViewDetails() {
          return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_ViewDetails.class);
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
      @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDVPayeesLV_tb extends PCFElement {
    public NewCheckPayeeDVPayeesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewManualCheckPayeeDV.NewCheckPayeeDVPayeesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public pcftest.NewManualCheckPayeeDV.PrimaryPayee_Name.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewManualCheckPayeeDV.PrimaryPayee_Name.MenuItem_Search.class);
    }
    
    public pcftest.NewManualCheckPayeeDV.PrimaryPayee_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewManualCheckPayeeDV.PrimaryPayee_Name.MenuItem_ViewDetails.class);
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