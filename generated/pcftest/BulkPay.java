package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BulkPay.BulkPayScreen;
import pcftest.BulkPay.BulkPayScreen.CreateNewButton;
import pcftest.BulkPay.BulkPayScreen.DeleteButton;
import pcftest.BulkPay.BulkPayScreen.RefreshButton;
import pcftest.BulkPay.BulkPayScreen.StopButton;
import pcftest.BulkPay.BulkPayScreen.SubmitButton;
import pcftest.BulkPay.BulkPayScreen.VoidButton;
import pcftest.BulkPay.BulkPayScreen._msgs;
import pcftest.BulkPay.BulkPay_UpLink;
import pcftest.BulkPay._Paging;
import pcftest.BulkPay.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkPay extends PCFLocation {
  public final static String CHECKSUM = "5f2312c29108104810a630afa1332803";
  
  public BulkPay(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BulkPay"));
  }
  
  public BulkPayScreen getBulkPayScreen() {
    return getOrCreateProperty("BulkPayScreen", "BulkPayScreen", null, pcftest.BulkPay.BulkPayScreen.class);
  }
  
  public BulkPay_UpLink getBulkPay_UpLink() {
    return getOrCreateProperty("BulkPay_UpLink", "BulkPay_UpLink", null, pcftest.BulkPay.BulkPay_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BulkPay._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BulkPay.__crumb__.class);
  }
  
  public Desktop get_parent() {
    return getOrCreateProperty("_parent", pcftest.Desktop.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkPayScreen extends PCFElement {
    public BulkPayScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BulkInvoicesLV getBulkInvoicesLV() {
      return getOrCreateProperty("BulkInvoicesLV", "BulkInvoicesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BulkInvoicesLV.class);
    }
    
    public SelectElement getBulkPayFilter() {
      return getOrCreateProperty("BulkPayFilter", "BulkPayFilter", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public CreateNewButton getCreateNewButton() {
      return getOrCreateProperty("CreateNewButton", "CreateNewButton", null, pcftest.BulkPay.BulkPayScreen.CreateNewButton.class);
    }
    
    public DeleteButton getDeleteButton() {
      return getOrCreateProperty("DeleteButton", "DeleteButton", null, pcftest.BulkPay.BulkPayScreen.DeleteButton.class);
    }
    
    public RefreshButton getRefreshButton() {
      return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.BulkPay.BulkPayScreen.RefreshButton.class);
    }
    
    public StopButton getStopButton() {
      return getOrCreateProperty("StopButton", "StopButton", null, pcftest.BulkPay.BulkPayScreen.StopButton.class);
    }
    
    public SubmitButton getSubmitButton() {
      return getOrCreateProperty("SubmitButton", "SubmitButton", null, pcftest.BulkPay.BulkPayScreen.SubmitButton.class);
    }
    
    public VoidButton getVoidButton() {
      return getOrCreateProperty("VoidButton", "VoidButton", null, pcftest.BulkPay.BulkPayScreen.VoidButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BulkPay.BulkPayScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreateNewButton extends ClickableActionElement {
      public CreateNewButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewBulkInvoiceDetail click() {
        return clickThis(pcftest.NewBulkInvoiceDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeleteButton extends ClickableActionElement {
      public DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RefreshButton extends ClickableActionElement {
      public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StopButton extends ClickableActionElement {
      public StopButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubmitButton extends ClickableActionElement {
      public SubmitButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VoidButton extends ClickableActionElement {
      public VoidButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkPay_UpLink extends ClickableActionElement {
    public BulkPay_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkPay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}