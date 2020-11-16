package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewCheckPaymentPanelSet_Multi.NewPaymentDetailDV_tb;
import pcftest.NewCheckPaymentPanelSet_Multi.PaymentDetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewCheckPaymentPanelSet.Multi.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckPaymentPanelSet_Multi extends NewCheckPaymentPanelSet {
  public final static String CHECKSUM = "3e9122f381adff1a4bcf92b98fb60f46";
  
  public NewCheckPaymentPanelSet_Multi(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewCheckPaymentsLV getNewCheckPaymentsLV() {
    return getOrCreateProperty("NewCheckPaymentsLV", "NewCheckPaymentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewCheckPaymentsLV.class);
  }
  
  public NewPaymentDetailDV_default getNewPaymentDetailDV_default() {
    return getOrCreateProperty("NewPaymentDetailDV_default", "NewPaymentDetailDV", null, pcftest.NewPaymentDetailDV_default.class);
  }
  
  public NewPaymentDetailDV_tb getNewPaymentDetailDV_tb() {
    return getOrCreateProperty("NewPaymentDetailDV_tb", "NewPaymentDetailDV_tb", null, pcftest.NewCheckPaymentPanelSet_Multi.NewPaymentDetailDV_tb.class);
  }
  
  public PaymentDetailsCardTab getPaymentDetailsCardTab() {
    return getOrCreateProperty("PaymentDetailsCardTab", "PaymentDetailsCardTab", null, pcftest.NewCheckPaymentPanelSet_Multi.PaymentDetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewCheckPaymentPanelSet.Multi.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewPaymentDetailDV_tb extends PCFElement {
    public NewPaymentDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewCheckPaymentPanelSet.Multi.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentDetailsCardTab extends ClickableActionElement {
    public PaymentDetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}