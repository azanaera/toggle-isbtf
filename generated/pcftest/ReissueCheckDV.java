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
import pcftest.ReissueCheckDV.AddJointPayees;
import pcftest.ReissueCheckDV.CheckSummaryPaymentsLV_tb;
import pcftest.ReissueCheckDV.Check_DeductionType;
import pcftest.ReissueCheckDV.Check_DeliveryMethod;
import pcftest.ReissueCheckDV.MailingAddressInputSet;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.PayeeNameHeader;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.PayeeTypeHeader;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV._ListPaging;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry.PayeeName;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry.PayeeType;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry._Select;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry._ViewDetail;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV_tb;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV_tb.Add;
import pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV_tb.Remove;
import pcftest.ReissueCheckDV.PrimaryPayee_Name;
import typekey.ContactRole;
import typekey.DeductionType;
import typekey.DeliveryMethod;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReissueCheckDV extends DetailViewElement {
  public final static String CHECKSUM = "34c780a6c1ac669ff8125f4147df0c39";
  
  public ReissueCheckDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddJointPayees getAddJointPayees() {
    return getOrCreateProperty("AddJointPayees", "AddJointPayees", null, pcftest.ReissueCheckDV.AddJointPayees.class);
  }
  
  public CheckSummaryPaymentsLV getCheckSummaryPaymentsLV() {
    return getOrCreateProperty("CheckSummaryPaymentsLV", "CheckSummaryPaymentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckSummaryPaymentsLV.class);
  }
  
  public CheckSummaryPaymentsLV_tb getCheckSummaryPaymentsLV_tb() {
    return getOrCreateProperty("CheckSummaryPaymentsLV_tb", "CheckSummaryPaymentsLV_tb", null, pcftest.ReissueCheckDV.CheckSummaryPaymentsLV_tb.class);
  }
  
  public ValueElement getCheck_Comments() {
    return getOrCreateProperty("Check_Comments", "Check_Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Check_DeductionType getCheck_DeductionType() {
    return getOrCreateProperty("Check_DeductionType", "Check_DeductionType", null, pcftest.ReissueCheckDV.Check_DeductionType.class);
  }
  
  public Check_DeliveryMethod getCheck_DeliveryMethod() {
    return getOrCreateProperty("Check_DeliveryMethod", "Check_DeliveryMethod", null, pcftest.ReissueCheckDV.Check_DeliveryMethod.class);
  }
  
  public ValueElement getCheck_MailToContact() {
    return getOrCreateProperty("Check_MailToContact", "Check_MailToContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_MailingAddress() {
    return getOrCreateProperty("Check_MailingAddress", "Check_MailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_NetAmount() {
    return getOrCreateProperty("Check_NetAmount", "Check_NetAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_PayTo() {
    return getOrCreateProperty("Check_PayTo", "Check_PayTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MailingAddressInputSet getMailingAddressInputSet() {
    return getOrCreateProperty("MailingAddressInputSet", "MailingAddressInputSet", null, pcftest.ReissueCheckDV.MailingAddressInputSet.class);
  }
  
  public NewCheckPayeeDVPayeesLV getNewCheckPayeeDVPayeesLV() {
    return getOrCreateProperty("NewCheckPayeeDVPayeesLV", "NewCheckPayeeDVPayeesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.class);
  }
  
  public NewCheckPayeeDVPayeesLV_tb getNewCheckPayeeDVPayeesLV_tb() {
    return getOrCreateProperty("NewCheckPayeeDVPayeesLV_tb", "NewCheckPayeeDVPayeesLV_tb", null, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV_tb.class);
  }
  
  public PrimaryPayee_Name getPrimaryPayee_Name() {
    return getOrCreateProperty("PrimaryPayee_Name", "PrimaryPayee_Name", null, pcftest.ReissueCheckDV.PrimaryPayee_Name.class);
  }
  
  public SelectElement getPrimaryPayee_Type() {
    return getOrCreateProperty("PrimaryPayee_Type", "PrimaryPayee_Type", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public CheckboxValueElement getToggleAddressEdit() {
    return getOrCreateProperty("ToggleAddressEdit", "ToggleAddressEdit", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddJointPayees extends ValueElement {
    public AddJointPayees(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckSummaryPaymentsLV_tb extends PCFElement {
    public CheckSummaryPaymentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MailingAddressInputSet extends PCFElement {
    public MailingAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDVPayeesLV extends PCFElement {
    public NewCheckPayeeDVPayeesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PayeeNameHeader getPayeeNameHeader() {
      return getOrCreateProperty("PayeeNameHeader", "PayeeNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.PayeeNameHeader.class);
    }
    
    public PayeeTypeHeader getPayeeTypeHeader() {
      return getOrCreateProperty("PayeeTypeHeader", "PayeeTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.PayeeTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeNameHeader extends ValueElement {
      public PayeeNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayeeTypeHeader extends ValueElement {
      public PayeeTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PayeeName getPayeeName() {
        return getOrCreateProperty("PayeeName", "PayeeName", null, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.class);
      }
      
      public PayeeType getPayeeType() {
        return getOrCreateProperty("PayeeType", "PayeeType", null, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry.PayeeType.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry._ViewDetail.class);
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
        
        public pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_Search getMenuItem_Search() {
          return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_Search.class);
        }
        
        public pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_ViewDetails getMenuItem_ViewDetails() {
          return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV.entry.PayeeName.MenuItem_ViewDetails.class);
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
      @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckPayeeDVPayeesLV_tb extends PCFElement {
    public NewCheckPayeeDVPayeesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ReissueCheckDV.NewCheckPayeeDVPayeesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public pcftest.ReissueCheckDV.PrimaryPayee_Name.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ReissueCheckDV.PrimaryPayee_Name.MenuItem_Search.class);
    }
    
    public pcftest.ReissueCheckDV.PrimaryPayee_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ReissueCheckDV.PrimaryPayee_Name.MenuItem_ViewDetails.class);
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