package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RecodePaymentPanelSet_multi.PaymentDetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/RecodePaymentPanelSet.multi.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecodePaymentPanelSet_multi extends RecodePaymentPanelSet {
  public final static String CHECKSUM = "815d9b1e4391f9ea3b830d58cf291aea";
  
  public RecodePaymentPanelSet_multi(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewOnsetPaymentsLV getNewOnsetPaymentsLV() {
    return getOrCreateProperty("NewOnsetPaymentsLV", "NewOnsetPaymentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewOnsetPaymentsLV.class);
  }
  
  public PaymentDetailsCardTab getPaymentDetailsCardTab() {
    return getOrCreateProperty("PaymentDetailsCardTab", "PaymentDetailsCardTab", null, pcftest.RecodePaymentPanelSet_multi.PaymentDetailsCardTab.class);
  }
  
  public RecodePaymentDV getRecodePaymentDV() {
    return getOrCreateProperty("RecodePaymentDV", "RecodePaymentDV", null, pcftest.RecodePaymentDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePaymentPanelSet.multi.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentDetailsCardTab extends ClickableActionElement {
    public PaymentDetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}