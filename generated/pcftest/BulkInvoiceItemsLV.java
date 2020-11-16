package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
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
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_AlertsHeader;
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_AmountHeader;
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_ArchivedHeader;
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_ClaimNumberHeader;
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_DeductionsAmountHeader;
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_DescriptionHeader;
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_ExposureHeader;
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_PaymentTypeHeader;
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_ReserveLineHeader;
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_ServiceDateHeader;
import pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_StatusHeader;
import pcftest.BulkInvoiceItemsLV._ListPaging;
import pcftest.BulkInvoiceItemsLV.entry;
import pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_ClaimNumber;
import pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_ClaimNumber.InvoiceItemClaimSearchPicker;
import pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_ClaimNumber.RecentClaims;
import pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_ClaimNumber.RecentClaims.entry2;
import pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_ClaimNumber.RecentClaims.entry2.RecentClaimNumber;
import pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_PaymentType;
import pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_Status;
import pcftest.BulkInvoiceItemsLV.entry._Select;
import pcftest.BulkInvoiceItemsLV.entry._ViewDetail;
import typekey.BulkInvoiceItemStatus;
import typekey.PaymentType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceItemsLV extends PCFElement {
  public final static String CHECKSUM = "01c70b235305baa19eb35fe0383642fe";
  
  public BulkInvoiceItemsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BulkInvoiceItemsLV_AlertsHeader getBulkInvoiceItemsLV_AlertsHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_AlertsHeader", "BulkInvoiceItemsLV_AlertsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_AlertsHeader.class);
  }
  
  public ValueElement getBulkInvoiceItemsLV_AmountFooter() {
    return getOrCreateProperty("BulkInvoiceItemsLV_AmountFooter", "BulkInvoiceItemsLV_AmountFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BulkInvoiceItemsLV_AmountHeader getBulkInvoiceItemsLV_AmountHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_AmountHeader", "BulkInvoiceItemsLV_AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_AmountHeader.class);
  }
  
  public BulkInvoiceItemsLV_ArchivedHeader getBulkInvoiceItemsLV_ArchivedHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_ArchivedHeader", "BulkInvoiceItemsLV_ArchivedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_ArchivedHeader.class);
  }
  
  public BulkInvoiceItemsLV_ClaimNumberHeader getBulkInvoiceItemsLV_ClaimNumberHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_ClaimNumberHeader", "BulkInvoiceItemsLV_ClaimNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_ClaimNumberHeader.class);
  }
  
  public ValueElement getBulkInvoiceItemsLV_DeductionsAmountFooter() {
    return getOrCreateProperty("BulkInvoiceItemsLV_DeductionsAmountFooter", "BulkInvoiceItemsLV_DeductionsAmountFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BulkInvoiceItemsLV_DeductionsAmountHeader getBulkInvoiceItemsLV_DeductionsAmountHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_DeductionsAmountHeader", "BulkInvoiceItemsLV_DeductionsAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_DeductionsAmountHeader.class);
  }
  
  public BulkInvoiceItemsLV_DescriptionHeader getBulkInvoiceItemsLV_DescriptionHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_DescriptionHeader", "BulkInvoiceItemsLV_DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_DescriptionHeader.class);
  }
  
  public BulkInvoiceItemsLV_ExposureHeader getBulkInvoiceItemsLV_ExposureHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_ExposureHeader", "BulkInvoiceItemsLV_ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_ExposureHeader.class);
  }
  
  public ValueElement getBulkInvoiceItemsLV_PaymentTypeFooter() {
    return getOrCreateProperty("BulkInvoiceItemsLV_PaymentTypeFooter", "BulkInvoiceItemsLV_PaymentTypeFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BulkInvoiceItemsLV_PaymentTypeHeader getBulkInvoiceItemsLV_PaymentTypeHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_PaymentTypeHeader", "BulkInvoiceItemsLV_PaymentTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_PaymentTypeHeader.class);
  }
  
  public BulkInvoiceItemsLV_ReserveLineHeader getBulkInvoiceItemsLV_ReserveLineHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_ReserveLineHeader", "BulkInvoiceItemsLV_ReserveLineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_ReserveLineHeader.class);
  }
  
  public BulkInvoiceItemsLV_ServiceDateHeader getBulkInvoiceItemsLV_ServiceDateHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_ServiceDateHeader", "BulkInvoiceItemsLV_ServiceDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_ServiceDateHeader.class);
  }
  
  public BulkInvoiceItemsLV_StatusHeader getBulkInvoiceItemsLV_StatusHeader() {
    return getOrCreateProperty("BulkInvoiceItemsLV_StatusHeader", "BulkInvoiceItemsLV_StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceItemsLV.BulkInvoiceItemsLV_StatusHeader.class);
  }
  
  public SelectElement getBulkInvoiceItemsToolbarFilter() {
    return getOrCreateProperty("BulkInvoiceItemsToolbarFilter", "BulkInvoiceItemsToolbarFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BulkInvoiceItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.BulkInvoiceItemsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_AlertsHeader extends ValueElement {
    public BulkInvoiceItemsLV_AlertsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_AmountHeader extends ValueElement {
    public BulkInvoiceItemsLV_AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_ArchivedHeader extends ValueElement {
    public BulkInvoiceItemsLV_ArchivedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_ClaimNumberHeader extends ValueElement {
    public BulkInvoiceItemsLV_ClaimNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_DeductionsAmountHeader extends ValueElement {
    public BulkInvoiceItemsLV_DeductionsAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_DescriptionHeader extends ValueElement {
    public BulkInvoiceItemsLV_DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_ExposureHeader extends ValueElement {
    public BulkInvoiceItemsLV_ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_PaymentTypeHeader extends ValueElement {
    public BulkInvoiceItemsLV_PaymentTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_ReserveLineHeader extends ValueElement {
    public BulkInvoiceItemsLV_ReserveLineHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_ServiceDateHeader extends ValueElement {
    public BulkInvoiceItemsLV_ServiceDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceItemsLV_StatusHeader extends ValueElement {
    public BulkInvoiceItemsLV_StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getBulkInvoiceItemsLV_Alerts() {
      return getOrCreateProperty("BulkInvoiceItemsLV_Alerts", "BulkInvoiceItemsLV_Alerts", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBulkInvoiceItemsLV_Amount() {
      return getOrCreateProperty("BulkInvoiceItemsLV_Amount", "BulkInvoiceItemsLV_Amount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getBulkInvoiceItemsLV_Archived() {
      return getOrCreateProperty("BulkInvoiceItemsLV_Archived", "BulkInvoiceItemsLV_Archived", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BulkInvoiceItemsLV_ClaimNumber getBulkInvoiceItemsLV_ClaimNumber() {
      return getOrCreateProperty("BulkInvoiceItemsLV_ClaimNumber", "BulkInvoiceItemsLV_ClaimNumber", null, pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_ClaimNumber.class);
    }
    
    public ValueElement getBulkInvoiceItemsLV_DeductionsAmount() {
      return getOrCreateProperty("BulkInvoiceItemsLV_DeductionsAmount", "BulkInvoiceItemsLV_DeductionsAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBulkInvoiceItemsLV_Description() {
      return getOrCreateProperty("BulkInvoiceItemsLV_Description", "BulkInvoiceItemsLV_Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getBulkInvoiceItemsLV_Exposure() {
      return getOrCreateProperty("BulkInvoiceItemsLV_Exposure", "BulkInvoiceItemsLV_Exposure", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public BulkInvoiceItemsLV_PaymentType getBulkInvoiceItemsLV_PaymentType() {
      return getOrCreateProperty("BulkInvoiceItemsLV_PaymentType", "BulkInvoiceItemsLV_PaymentType", null, pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_PaymentType.class);
    }
    
    public SelectElement getBulkInvoiceItemsLV_ReserveLine() {
      return getOrCreateProperty("BulkInvoiceItemsLV_ReserveLine", "BulkInvoiceItemsLV_ReserveLine", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public DateElement getBulkInvoiceItemsLV_ServiceDate() {
      return getOrCreateProperty("BulkInvoiceItemsLV_ServiceDate", "BulkInvoiceItemsLV_ServiceDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BulkInvoiceItemsLV_Status getBulkInvoiceItemsLV_Status() {
      return getOrCreateProperty("BulkInvoiceItemsLV_Status", "BulkInvoiceItemsLV_Status", null, pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_Status.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.BulkInvoiceItemsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BulkInvoiceItemsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoiceItemsLV_ClaimNumber extends ValueElement {
      public BulkInvoiceItemsLV_ClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public InvoiceItemClaimSearchPicker getInvoiceItemClaimSearchPicker() {
        return getOrCreateProperty("InvoiceItemClaimSearchPicker", "InvoiceItemClaimSearchPicker", null, pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_ClaimNumber.InvoiceItemClaimSearchPicker.class);
      }
      
      public RecentClaims getRecentClaims() {
        return getOrCreateProperty("RecentClaims", "RecentClaims", null, pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_ClaimNumber.RecentClaims.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InvoiceItemClaimSearchPicker extends ClickableActionElement {
        public InvoiceItemClaimSearchPicker(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSearchPopup click() {
          return clickThis(pcftest.ClaimSearchPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RecentClaims extends ClickableActionElement {
        public RecentClaims(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<entry2> get_Entries() {
          return getOrCreateEntries(null, pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_ClaimNumber.RecentClaims.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry2 extends PCFElement {
          public entry2(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public RecentClaimNumber getRecentClaimNumber() {
            return getOrCreateProperty("RecentClaimNumber", "RecentClaimNumber", null, pcftest.BulkInvoiceItemsLV.entry.BulkInvoiceItemsLV_ClaimNumber.RecentClaims.entry2.RecentClaimNumber.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RecentClaimNumber extends ClickableActionElement {
            public RecentClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoiceItemsLV_PaymentType extends SelectElement {
      public BulkInvoiceItemsLV_PaymentType(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoiceItemsLV_Status extends SelectElement {
      public BulkInvoiceItemsLV_Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(BulkInvoiceItemStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public BulkInvoiceItemStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BulkInvoiceItemStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(BulkInvoiceItemStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceItemsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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