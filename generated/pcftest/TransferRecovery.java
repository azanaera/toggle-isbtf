package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransferRecovery.Cancel;
import pcftest.TransferRecovery.Claim;
import pcftest.TransferRecovery.Claim.SelectClaim;
import pcftest.TransferRecovery.Edit;
import pcftest.TransferRecovery.EditableRecodeLineItemsLV_tb;
import pcftest.TransferRecovery.EditableRecodeLineItemsLV_tb.Add;
import pcftest.TransferRecovery.EditableRecodeLineItemsLV_tb.Remove;
import pcftest.TransferRecovery.TransferButton;
import pcftest.TransferRecovery.TransferRecovery_UpLink;
import pcftest.TransferRecovery.Update;
import pcftest.TransferRecovery._Paging;
import pcftest.TransferRecovery.__crumb__;
import pcftest.TransferRecovery._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransferRecovery extends PCFLocation {
  public final static String CHECKSUM = "a7adc952406b6be24b7a604b900794d9";
  
  public TransferRecovery(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TransferRecovery"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.TransferRecovery.Cancel.class);
  }
  
  public Claim getClaim() {
    return getOrCreateProperty("Claim", "Claim", null, pcftest.TransferRecovery.Claim.class);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.TransferRecovery.Edit.class);
  }
  
  public EditableRecodeLineItemsLV getEditableRecodeLineItemsLV() {
    return getOrCreateProperty("EditableRecodeLineItemsLV", "EditableRecodeLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableRecodeLineItemsLV.class);
  }
  
  public EditableRecodeLineItemsLV_tb getEditableRecodeLineItemsLV_tb() {
    return getOrCreateProperty("EditableRecodeLineItemsLV_tb", "EditableRecodeLineItemsLV_tb", null, pcftest.TransferRecovery.EditableRecodeLineItemsLV_tb.class);
  }
  
  public ReserveLineInputSet getReserveLineInputSet() {
    return getOrCreateProperty("ReserveLineInputSet", "ReserveLineInputSet", null, pcftest.ReserveLineInputSet.class);
  }
  
  public TransactionExchangeRateInputSet getTransactionExchangeRateInputSet() {
    return getOrCreateProperty("TransactionExchangeRateInputSet", "TransactionExchangeRateInputSet", null, pcftest.TransactionExchangeRateInputSet.class);
  }
  
  public TransferButton getTransferButton() {
    return getOrCreateProperty("TransferButton", "TransferButton", null, pcftest.TransferRecovery.TransferButton.class);
  }
  
  public TransferRecovery_UpLink getTransferRecovery_UpLink() {
    return getOrCreateProperty("TransferRecovery_UpLink", "TransferRecovery_UpLink", null, pcftest.TransferRecovery.TransferRecovery_UpLink.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.TransferRecovery.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TransferRecovery._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TransferRecovery.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TransferRecovery._msgs.class);
  }
  
  public ClaimFinancialsTransactionsDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsTransactionsDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim extends BasePickerValueElement {
    public Claim(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectClaim getSelectClaim() {
      return getOrCreateProperty("SelectClaim", "SelectClaim", null, pcftest.TransferRecovery.Claim.SelectClaim.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectClaim extends ClickableActionElement {
      public SelectClaim(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSearchPopup click() {
        return clickThis(pcftest.ClaimSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRecodeLineItemsLV_tb extends PCFElement {
    public EditableRecodeLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.TransferRecovery.EditableRecodeLineItemsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.TransferRecovery.EditableRecodeLineItemsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransferButton extends ClickableActionElement {
    public TransferButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransferRecovery_UpLink extends ClickableActionElement {
    public TransferRecovery_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransferRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}