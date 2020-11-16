package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen;
import pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb;
import pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.Add;
import pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.Remove;
import pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.Cancel;
import pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.Edit;
import pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.Update;
import pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen._msgs;
import pcftest.NewBulkInvoiceDetail.NewBulkInvoiceDetail_UpLink;
import pcftest.NewBulkInvoiceDetail._Paging;
import pcftest.NewBulkInvoiceDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewBulkInvoiceDetail extends PCFLocation {
  public final static String CHECKSUM = "8c78aa9066d32afe6b88f0967092b7c0";
  
  public NewBulkInvoiceDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewBulkInvoiceDetail"));
  }
  
  public BulkInvoiceDetailScreen getBulkInvoiceDetailScreen() {
    return getOrCreateProperty("BulkInvoiceDetailScreen", "BulkInvoiceDetailScreen", null, pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.class);
  }
  
  public NewBulkInvoiceDetail_UpLink getNewBulkInvoiceDetail_UpLink() {
    return getOrCreateProperty("NewBulkInvoiceDetail_UpLink", "NewBulkInvoiceDetail_UpLink", null, pcftest.NewBulkInvoiceDetail.NewBulkInvoiceDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewBulkInvoiceDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewBulkInvoiceDetail.__crumb__.class);
  }
  
  public BulkPay get_parent() {
    return getOrCreateProperty("_parent", pcftest.BulkPay.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("BulkInvoiceItemsLV_tb", "BulkInvoiceItemsLV_tb", null, pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoiceItemsLV_tb extends PCFElement {
      public BulkInvoiceItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.Add.class);
      }
      
      public Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.NewBulkInvoiceDetail.BulkInvoiceDetailScreen.BulkInvoiceItemsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewBulkInvoiceDetail_UpLink extends ClickableActionElement {
    public NewBulkInvoiceDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/NewBulkInvoiceDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}