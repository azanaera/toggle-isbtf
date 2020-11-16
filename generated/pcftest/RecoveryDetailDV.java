package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RecoveryDetailDV.EditableRecoveryLineItemsLV_tb;
import pcftest.RecoveryDetailDV.EditableRecoveryLineItemsLV_tb.Add;
import pcftest.RecoveryDetailDV.EditableRecoveryLineItemsLV_tb.Remove;
import pcftest.RecoveryDetailDV.OnBehalfOf;
import pcftest.RecoveryDetailDV.Payer;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/recovery/RecoveryDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoveryDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "3aca184da896dea2e8188978466f2382";
  
  public RecoveryDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.RecoveryDetailDV.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.RecoveryDetailDV.Currency.class);
  }
  
  public EditableRecoveryLineItemsLV getEditableRecoveryLineItemsLV() {
    return getOrCreateProperty("EditableRecoveryLineItemsLV", "EditableRecoveryLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableRecoveryLineItemsLV.class);
  }
  
  public EditableRecoveryLineItemsLV_tb getEditableRecoveryLineItemsLV_tb() {
    return getOrCreateProperty("EditableRecoveryLineItemsLV_tb", "EditableRecoveryLineItemsLV_tb", null, pcftest.RecoveryDetailDV.EditableRecoveryLineItemsLV_tb.class);
  }
  
  public OnBehalfOf getOnBehalfOf() {
    return getOrCreateProperty("OnBehalfOf", "OnBehalfOf", null, pcftest.RecoveryDetailDV.OnBehalfOf.class);
  }
  
  public ValueElement getOpenRecoveryReserves() {
    return getOrCreateProperty("OpenRecoveryReserves", "OpenRecoveryReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPastRecoveries() {
    return getOrCreateProperty("PastRecoveries", "PastRecoveries", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Payer getPayer() {
    return getOrCreateProperty("Payer", "Payer", null, pcftest.RecoveryDetailDV.Payer.class);
  }
  
  public ValueElement getPayments() {
    return getOrCreateProperty("Payments", "Payments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.RecoveryDetailDV.RecoveryCategory getRecoveryCategory() {
    return getOrCreateProperty("RecoveryCategory", "RecoveryCategory", null, pcftest.RecoveryDetailDV.RecoveryCategory.class);
  }
  
  public ReserveLineInputSet getReserveLineInputSet() {
    return getOrCreateProperty("ReserveLineInputSet", "ReserveLineInputSet", null, pcftest.ReserveLineInputSet.class);
  }
  
  public TransactionExchangeRateInputSet getTransactionExchangeRateInputSet() {
    return getOrCreateProperty("TransactionExchangeRateInputSet", "TransactionExchangeRateInputSet", null, pcftest.TransactionExchangeRateInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/RecoveryDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Currency extends SelectElement {
    public Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/RecoveryDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRecoveryLineItemsLV_tb extends PCFElement {
    public EditableRecoveryLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.RecoveryDetailDV.EditableRecoveryLineItemsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.RecoveryDetailDV.EditableRecoveryLineItemsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/RecoveryDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/RecoveryDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  public static class OnBehalfOf extends SelectElement {
    public OnBehalfOf(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.RecoveryDetailDV.OnBehalfOf.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.RecoveryDetailDV.OnBehalfOf.MenuItem_Search.class);
    }
    
    public pcftest.RecoveryDetailDV.OnBehalfOf.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.RecoveryDetailDV.OnBehalfOf.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Payer extends SelectElement {
    public Payer(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.RecoveryDetailDV.Payer.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.RecoveryDetailDV.Payer.MenuItem_Search.class);
    }
    
    public pcftest.RecoveryDetailDV.Payer.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.RecoveryDetailDV.Payer.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/RecoveryDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}