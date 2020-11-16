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
import pcftest.BulkInvoiceApprovalDetailDV.ApprovalHistoryLV_tb;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemAmountHeader;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemClaimNumHeader;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemDescriptionHeader;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemExplanationHeader;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemPaymentTypeHeader;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemReserveLineHeader;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemStatusHeader;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV._ListPaging;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.entry;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.entry._Select;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.entry._ViewDetail;
import pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV_tb;
import pcftest.BulkInvoiceApprovalDetailDV.CheckInstructions;
import pcftest.BulkInvoiceApprovalDetailDV.Details_CreateUser;
import pcftest.BulkInvoiceApprovalDetailDV.Payee;
import pcftest.BulkInvoiceApprovalDetailDV.Status;
import typekey.BulkInvoiceStatus;
import typekey.CheckHandlingInstructions;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceApprovalDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "337671960c477607c41200cff965dc7e";
  
  public BulkInvoiceApprovalDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApprovalHistoryLV getApprovalHistoryLV() {
    return getOrCreateProperty("ApprovalHistoryLV", "ApprovalHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ApprovalHistoryLV.class);
  }
  
  public ApprovalHistoryLV_tb getApprovalHistoryLV_tb() {
    return getOrCreateProperty("ApprovalHistoryLV_tb", "ApprovalHistoryLV_tb", null, pcftest.BulkInvoiceApprovalDetailDV.ApprovalHistoryLV_tb.class);
  }
  
  public ValueElement getApprovalRationale() {
    return getOrCreateProperty("ApprovalRationale", "ApprovalRationale", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getArchivedClaimsWarning() {
    return getOrCreateProperty("ArchivedClaimsWarning", "ArchivedClaimsWarning", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BulkInvoiceItemsLV getBulkInvoiceItemsLV() {
    return getOrCreateProperty("BulkInvoiceItemsLV", "BulkInvoiceItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.class);
  }
  
  public BulkInvoiceItemsLV_tb getBulkInvoiceItemsLV_tb() {
    return getOrCreateProperty("BulkInvoiceItemsLV_tb", "BulkInvoiceItemsLV_tb", null, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV_tb.class);
  }
  
  public CheckInstructions getCheckInstructions() {
    return getOrCreateProperty("CheckInstructions", "CheckInstructions", null, pcftest.BulkInvoiceApprovalDetailDV.CheckInstructions.class);
  }
  
  public DateElement getCreateDate() {
    return getOrCreateProperty("CreateDate", "CreateDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Details_CreateUser getDetails_CreateUser() {
    return getOrCreateProperty("Details_CreateUser", "Details_CreateUser", null, pcftest.BulkInvoiceApprovalDetailDV.Details_CreateUser.class);
  }
  
  public ValueElement getInvoiceNumber() {
    return getOrCreateProperty("InvoiceNumber", "InvoiceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMemo() {
    return getOrCreateProperty("Memo", "Memo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Payee getPayee() {
    return getOrCreateProperty("Payee", "Payee", null, pcftest.BulkInvoiceApprovalDetailDV.Payee.class);
  }
  
  public PaymentMethodInputSet getPaymentMethodInputSet() {
    return getOrCreateProperty("PaymentMethodInputSet", "PaymentMethodInputSet", null, pcftest.PaymentMethodInputSet.class);
  }
  
  public DateElement getReceivedDate() {
    return getOrCreateProperty("ReceivedDate", "ReceivedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getScheduledSendDate() {
    return getOrCreateProperty("ScheduledSendDate", "ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.BulkInvoiceApprovalDetailDV.Status.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalHistoryLV_tb extends PCFElement {
    public ApprovalHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV extends PCFElement {
    public BulkInvoiceItemsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public InvoiceItemAmountHeader getInvoiceItemAmountHeader() {
      return getOrCreateProperty("InvoiceItemAmountHeader", "InvoiceItemAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemAmountHeader.class);
    }
    
    public InvoiceItemClaimNumHeader getInvoiceItemClaimNumHeader() {
      return getOrCreateProperty("InvoiceItemClaimNumHeader", "InvoiceItemClaimNumHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemClaimNumHeader.class);
    }
    
    public InvoiceItemDescriptionHeader getInvoiceItemDescriptionHeader() {
      return getOrCreateProperty("InvoiceItemDescriptionHeader", "InvoiceItemDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemDescriptionHeader.class);
    }
    
    public InvoiceItemExplanationHeader getInvoiceItemExplanationHeader() {
      return getOrCreateProperty("InvoiceItemExplanationHeader", "InvoiceItemExplanationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemExplanationHeader.class);
    }
    
    public InvoiceItemPaymentTypeHeader getInvoiceItemPaymentTypeHeader() {
      return getOrCreateProperty("InvoiceItemPaymentTypeHeader", "InvoiceItemPaymentTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemPaymentTypeHeader.class);
    }
    
    public InvoiceItemReserveLineHeader getInvoiceItemReserveLineHeader() {
      return getOrCreateProperty("InvoiceItemReserveLineHeader", "InvoiceItemReserveLineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemReserveLineHeader.class);
    }
    
    public InvoiceItemStatusHeader getInvoiceItemStatusHeader() {
      return getOrCreateProperty("InvoiceItemStatusHeader", "InvoiceItemStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.InvoiceItemStatusHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceItemAmountHeader extends ValueElement {
      public InvoiceItemAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceItemClaimNumHeader extends ValueElement {
      public InvoiceItemClaimNumHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceItemDescriptionHeader extends ValueElement {
      public InvoiceItemDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceItemExplanationHeader extends ValueElement {
      public InvoiceItemExplanationHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceItemPaymentTypeHeader extends ValueElement {
      public InvoiceItemPaymentTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceItemReserveLineHeader extends ValueElement {
      public InvoiceItemReserveLineHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceItemStatusHeader extends ValueElement {
      public InvoiceItemStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getInvoiceItemAmount() {
        return getOrCreateProperty("InvoiceItemAmount", "InvoiceItemAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInvoiceItemClaimNum() {
        return getOrCreateProperty("InvoiceItemClaimNum", "InvoiceItemClaimNum", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInvoiceItemDescription() {
        return getOrCreateProperty("InvoiceItemDescription", "InvoiceItemDescription", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInvoiceItemExplanation() {
        return getOrCreateProperty("InvoiceItemExplanation", "InvoiceItemExplanation", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInvoiceItemPaymentType() {
        return getOrCreateProperty("InvoiceItemPaymentType", "InvoiceItemPaymentType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInvoiceItemReserveLine() {
        return getOrCreateProperty("InvoiceItemReserveLine", "InvoiceItemReserveLine", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public SelectElement getInvoiceItemStatus() {
        return getOrCreateProperty("InvoiceItemStatus", "InvoiceItemStatus", null, gw.smoketest.platform.web.SelectElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BulkInvoiceApprovalDetailDV.BulkInvoiceItemsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_tb extends PCFElement {
    public BulkInvoiceItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckInstructions extends SelectElement {
    public CheckInstructions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CheckHandlingInstructions arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CheckHandlingInstructions getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CheckHandlingInstructions.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CheckHandlingInstructions arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Details_CreateUser extends ValueElement {
    public Details_CreateUser(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookContactDetailPopup click() {
      return clickThis(pcftest.AddressBookContactDetailPopup.class);
    }
    
    public pcftest.BulkInvoiceApprovalDetailDV.Details_CreateUser.MenuItem_NoneSelected getMenuItem_NoneSelected() {
      return getOrCreateProperty("MenuItem_NoneSelected", "MenuItem_NoneSelected", null, pcftest.BulkInvoiceApprovalDetailDV.Details_CreateUser.MenuItem_NoneSelected.class);
    }
    
    public pcftest.BulkInvoiceApprovalDetailDV.Details_CreateUser.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.BulkInvoiceApprovalDetailDV.Details_CreateUser.MenuItem_Search.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_NoneSelected extends ClickableActionElement {
      public MenuItem_NoneSelected(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Payee extends ValueElement {
    public Payee(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookContactDetailPopup click() {
      return clickThis(pcftest.AddressBookContactDetailPopup.class);
    }
    
    public pcftest.BulkInvoiceApprovalDetailDV.Payee.MenuItem_NoneSelected getMenuItem_NoneSelected() {
      return getOrCreateProperty("MenuItem_NoneSelected", "MenuItem_NoneSelected", null, pcftest.BulkInvoiceApprovalDetailDV.Payee.MenuItem_NoneSelected.class);
    }
    
    public pcftest.BulkInvoiceApprovalDetailDV.Payee.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.BulkInvoiceApprovalDetailDV.Payee.MenuItem_Search.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_NoneSelected extends ClickableActionElement {
      public MenuItem_NoneSelected(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(BulkInvoiceStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public BulkInvoiceStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BulkInvoiceStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(BulkInvoiceStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}