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
import pcftest.DeleteReserveSet.DeleteReserveSetScreen;
import pcftest.DeleteReserveSet.DeleteReserveSetScreen.DeleteReserveSet_CancelButton;
import pcftest.DeleteReserveSet.DeleteReserveSetScreen.DeleteReserveSet_DeleteButton;
import pcftest.DeleteReserveSet.DeleteReserveSetScreen._msgs;
import pcftest.DeleteReserveSet.DeleteReserveSet_UpLink;
import pcftest.DeleteReserveSet._Paging;
import pcftest.DeleteReserveSet.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/DeleteReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DeleteReserveSet extends PCFLocation {
  public final static String CHECKSUM = "2924712c4330da4ebbfef76dce300315";
  
  public DeleteReserveSet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DeleteReserveSet"));
  }
  
  public DeleteReserveSetScreen getDeleteReserveSetScreen() {
    return getOrCreateProperty("DeleteReserveSetScreen", "DeleteReserveSetScreen", null, pcftest.DeleteReserveSet.DeleteReserveSetScreen.class);
  }
  
  public DeleteReserveSet_UpLink getDeleteReserveSet_UpLink() {
    return getOrCreateProperty("DeleteReserveSet_UpLink", "DeleteReserveSet_UpLink", null, pcftest.DeleteReserveSet.DeleteReserveSet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DeleteReserveSet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DeleteReserveSet.__crumb__.class);
  }
  
  public ClaimFinancialsTransactions get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsTransactions.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/DeleteReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteReserveSetScreen extends PCFElement {
    public DeleteReserveSetScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DeleteReserveSetDV getDeleteReserveSetDV() {
      return getOrCreateProperty("DeleteReserveSetDV", "DeleteReserveSetDV", null, pcftest.DeleteReserveSetDV.class);
    }
    
    public DeleteReserveSet_CancelButton getDeleteReserveSet_CancelButton() {
      return getOrCreateProperty("DeleteReserveSet_CancelButton", "DeleteReserveSet_CancelButton", null, pcftest.DeleteReserveSet.DeleteReserveSetScreen.DeleteReserveSet_CancelButton.class);
    }
    
    public DeleteReserveSet_DeleteButton getDeleteReserveSet_DeleteButton() {
      return getOrCreateProperty("DeleteReserveSet_DeleteButton", "DeleteReserveSet_DeleteButton", null, pcftest.DeleteReserveSet.DeleteReserveSetScreen.DeleteReserveSet_DeleteButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DeleteReserveSet.DeleteReserveSetScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/DeleteReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeleteReserveSet_CancelButton extends ClickableActionElement {
      public DeleteReserveSet_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsTransactionsDetail click() {
        return clickThis(pcftest.ClaimFinancialsTransactionsDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/DeleteReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeleteReserveSet_DeleteButton extends ClickableActionElement {
      public DeleteReserveSet_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/DeleteReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/DeleteReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteReserveSet_UpLink extends ClickableActionElement {
    public DeleteReserveSet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/DeleteReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/DeleteReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}