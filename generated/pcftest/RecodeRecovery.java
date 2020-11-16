package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RecodeRecovery.Cancel;
import pcftest.RecodeRecovery.Edit;
import pcftest.RecodeRecovery.EditableRecodeLineItemsLV_tb;
import pcftest.RecodeRecovery.RecodeButton;
import pcftest.RecodeRecovery.RecodeRecovery_UpLink;
import pcftest.RecodeRecovery.Update;
import pcftest.RecodeRecovery._Paging;
import pcftest.RecodeRecovery.__crumb__;
import pcftest.RecodeRecovery._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecodeRecovery extends PCFLocation {
  public final static String CHECKSUM = "ba1f87aeb2f4a633b02c5a6b56af7a5d";
  
  public RecodeRecovery(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RecodeRecovery"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.RecodeRecovery.Cancel.class);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.RecodeRecovery.Edit.class);
  }
  
  public EditableRecodeLineItemsLV getEditableRecodeLineItemsLV() {
    return getOrCreateProperty("EditableRecodeLineItemsLV", "EditableRecodeLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableRecodeLineItemsLV.class);
  }
  
  public EditableRecodeLineItemsLV_tb getEditableRecodeLineItemsLV_tb() {
    return getOrCreateProperty("EditableRecodeLineItemsLV_tb", "EditableRecodeLineItemsLV_tb", null, pcftest.RecodeRecovery.EditableRecodeLineItemsLV_tb.class);
  }
  
  public RecodeButton getRecodeButton() {
    return getOrCreateProperty("RecodeButton", "RecodeButton", null, pcftest.RecodeRecovery.RecodeButton.class);
  }
  
  public RecodeRecovery_UpLink getRecodeRecovery_UpLink() {
    return getOrCreateProperty("RecodeRecovery_UpLink", "RecodeRecovery_UpLink", null, pcftest.RecodeRecovery.RecodeRecovery_UpLink.class);
  }
  
  public pcftest.RecodeRecovery.RecoveryCategory getRecoveryCategory() {
    return getOrCreateProperty("RecoveryCategory", "RecoveryCategory", null, pcftest.RecodeRecovery.RecoveryCategory.class);
  }
  
  public ReserveLineInputSet getReserveLineInputSet() {
    return getOrCreateProperty("ReserveLineInputSet", "ReserveLineInputSet", null, pcftest.ReserveLineInputSet.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.RecodeRecovery.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RecodeRecovery._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RecodeRecovery.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RecodeRecovery._msgs.class);
  }
  
  public ClaimFinancialsTransactionsDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsTransactionsDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRecodeLineItemsLV_tb extends PCFElement {
    public EditableRecodeLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecodeButton extends ClickableActionElement {
    public RecodeButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecodeRecovery_UpLink extends ClickableActionElement {
    public RecodeRecovery_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryCategory extends SelectElement {
    public RecoveryCategory(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.RecoveryCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.RecoveryCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RecoveryCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.RecoveryCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodeRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}