package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CheckTransferDV.CheckTransferPaymentsLV_tb;
import pcftest.CheckTransferDV.Claim;
import pcftest.CheckTransferDV.Claim.SelectClaim;
import pcftest.CheckTransferDV.TargetReservingCurrency;
import typekey.Currency;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransferDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckTransferDV extends DetailViewElement {
  public final static String CHECKSUM = "104a3bee0f31f47f4232d9681b18cdc6";
  
  public CheckTransferDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckExchangeRateInputSet getCheckExchangeRateInputSet() {
    return getOrCreateProperty("CheckExchangeRateInputSet", "CheckExchangeRateInputSet", null, pcftest.CheckExchangeRateInputSet.class);
  }
  
  public ValueElement getCheckNumber() {
    return getOrCreateProperty("CheckNumber", "CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckTransferPaymentsLV getCheckTransferPaymentsLV() {
    return getOrCreateProperty("CheckTransferPaymentsLV", "CheckTransferPaymentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckTransferPaymentsLV.class);
  }
  
  public CheckTransferPaymentsLV_tb getCheckTransferPaymentsLV_tb() {
    return getOrCreateProperty("CheckTransferPaymentsLV_tb", "CheckTransferPaymentsLV_tb", null, pcftest.CheckTransferDV.CheckTransferPaymentsLV_tb.class);
  }
  
  public Claim getClaim() {
    return getOrCreateProperty("Claim", "Claim", null, pcftest.CheckTransferDV.Claim.class);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLinkedServiceRequestInvoicesMessage() {
    return getOrCreateProperty("LinkedServiceRequestInvoicesMessage", "LinkedServiceRequestInvoicesMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TargetReservingCurrency getTargetReservingCurrency() {
    return getOrCreateProperty("TargetReservingCurrency", "TargetReservingCurrency", null, pcftest.CheckTransferDV.TargetReservingCurrency.class);
  }
  
  public ValueElement getTransferPaymentsInstructions() {
    return getOrCreateProperty("TransferPaymentsInstructions", "TransferPaymentsInstructions", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransferDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckTransferPaymentsLV_tb extends PCFElement {
    public CheckTransferPaymentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransferDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim extends BasePickerValueElement {
    public Claim(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectClaim getSelectClaim() {
      return getOrCreateProperty("SelectClaim", "SelectClaim", null, pcftest.CheckTransferDV.Claim.SelectClaim.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransferDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransferDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TargetReservingCurrency extends SelectElement {
    public TargetReservingCurrency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}