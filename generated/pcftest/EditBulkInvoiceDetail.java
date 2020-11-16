package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.Add;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.ClaimFilterClaimSearchPicker;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.ClaimFilterRecentList;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.ClaimFilterRecentList.entry;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.ClaimFilterRecentList.entry.RecentClaimNumber;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.ClearClaimFilter;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.Remove;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.Cancel;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.Edit;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.RefreshButton;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.RetryButton;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.SubmitButton;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.Update;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen._msgs;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.errorDuringProcessingAlertBar;
import pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.errorDuringProcessingAlertBar.CloseBtn;
import pcftest.EditBulkInvoiceDetail.EditBulkInvoiceDetail_UpLink;
import pcftest.EditBulkInvoiceDetail._Paging;
import pcftest.EditBulkInvoiceDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditBulkInvoiceDetail extends PCFLocation {
  public final static String CHECKSUM = "737b4ee9da9366523450b8d70ab67d30";
  
  public EditBulkInvoiceDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EditBulkInvoiceDetail"));
  }
  
  public BulkInvoiceDetailScreen getBulkInvoiceDetailScreen() {
    return getOrCreateProperty("BulkInvoiceDetailScreen", "BulkInvoiceDetailScreen", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.class);
  }
  
  public EditBulkInvoiceDetail_UpLink getEditBulkInvoiceDetail_UpLink() {
    return getOrCreateProperty("EditBulkInvoiceDetail_UpLink", "EditBulkInvoiceDetail_UpLink", null, pcftest.EditBulkInvoiceDetail.EditBulkInvoiceDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EditBulkInvoiceDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EditBulkInvoiceDetail.__crumb__.class);
  }
  
  public BulkPay get_parent() {
    return getOrCreateProperty("_parent", pcftest.BulkPay.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceDetailScreen extends PCFElement {
    public BulkInvoiceDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BulkInvoiceDetailDV getBulkInvoiceDetailDV() {
      return getOrCreateProperty("BulkInvoiceDetailDV", "BulkInvoiceDetailDV", null, pcftest.BulkInvoiceDetailDV.class);
    }
    
    public BulkInvoiceItemsLV getBulkInvoiceItemsLV() {
      return getOrCreateProperty("BulkInvoiceItemsLV", "BulkInvoiceItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BulkInvoiceItemsLV.class);
    }
    
    public BulkInvoiceItemsLV_tb getBulkInvoiceItemsLV_tb() {
      return getOrCreateProperty("BulkInvoiceItemsLV_tb", "BulkInvoiceItemsLV_tb", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.Edit.class);
    }
    
    public RefreshButton getRefreshButton() {
      return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.RefreshButton.class);
    }
    
    public RetryButton getRetryButton() {
      return getOrCreateProperty("RetryButton", "RetryButton", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.RetryButton.class);
    }
    
    public SubmitButton getSubmitButton() {
      return getOrCreateProperty("SubmitButton", "SubmitButton", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.SubmitButton.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen._msgs.class);
    }
    
    public errorDuringProcessingAlertBar geterrorDuringProcessingAlertBar() {
      return getOrCreateProperty("errorDuringProcessingAlertBar", "errorDuringProcessingAlertBar", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.errorDuringProcessingAlertBar.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoiceItemsLV_tb extends PCFElement {
      public BulkInvoiceItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.Add.class);
      }
      
      public ClaimFilter getClaimFilter() {
        return getOrCreateProperty("ClaimFilter", "ClaimFilter", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.class);
      }
      
      public Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimFilter extends ValueElement {
        public ClaimFilter(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimFilterClaimSearchPicker getClaimFilterClaimSearchPicker() {
          return getOrCreateProperty("ClaimFilterClaimSearchPicker", "ClaimFilterClaimSearchPicker", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.ClaimFilterClaimSearchPicker.class);
        }
        
        public ClaimFilterRecentList getClaimFilterRecentList() {
          return getOrCreateProperty("ClaimFilterRecentList", "ClaimFilterRecentList", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.ClaimFilterRecentList.class);
        }
        
        public ClearClaimFilter getClearClaimFilter() {
          return getOrCreateProperty("ClearClaimFilter", "ClearClaimFilter", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.ClearClaimFilter.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ClaimFilterClaimSearchPicker extends ClickableActionElement {
          public ClaimFilterClaimSearchPicker(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimSearchPopup click() {
            return clickThis(pcftest.ClaimSearchPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ClaimFilterRecentList extends ClickableActionElement {
          public ClaimFilterRecentList(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          @SuppressWarnings(value = "unchecked")
          public IteratorEntries<entry> get_Entries() {
            return getOrCreateEntries(null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.ClaimFilterRecentList.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class entry extends PCFElement {
            public entry(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public RecentClaimNumber getRecentClaimNumber() {
              return getOrCreateProperty("RecentClaimNumber", "RecentClaimNumber", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.ClaimFilter.ClaimFilterRecentList.entry.RecentClaimNumber.class);
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ClearClaimFilter extends ClickableActionElement {
          public ClearClaimFilter(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RefreshButton extends ClickableActionElement {
      public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RetryButton extends ClickableActionElement {
      public RetryButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubmitButton extends ClickableActionElement {
      public SubmitButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class errorDuringProcessingAlertBar extends ClickableActionElement {
      public errorDuringProcessingAlertBar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.EditBulkInvoiceDetail.BulkInvoiceDetailScreen.errorDuringProcessingAlertBar.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditBulkInvoiceDetail_UpLink extends ClickableActionElement {
    public EditBulkInvoiceDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/EditBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}