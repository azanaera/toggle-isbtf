package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.StatementDV_invoice.InvoiceStatus;
import pcftest.StatementDV_invoice.StatementLineItemLV_tb;
import pcftest.StatementDV_invoice.StatementLineItemLV_tb.Add;
import pcftest.StatementDV_invoice.StatementLineItemLV_tb.Remove;
import typekey.ServiceRequestInvoiceStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.invoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StatementDV_invoice extends StatementDV {
  public final static String CHECKSUM = "e11882535c9f7d2c60163865c8aa2f9d";
  
  public StatementDV_invoice(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public InvoiceStatus getInvoiceStatus() {
    return getOrCreateProperty("InvoiceStatus", "InvoiceStatus", null, pcftest.StatementDV_invoice.InvoiceStatus.class);
  }
  
  public ValueElement getReferenceNumber() {
    return getOrCreateProperty("ReferenceNumber", "ReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public StatementLineItemLV getStatementLineItemLV() {
    return getOrCreateProperty("StatementLineItemLV", "StatementLineItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatementLineItemLV.class);
  }
  
  public StatementLineItemLV_tb getStatementLineItemLV_tb() {
    return getOrCreateProperty("StatementLineItemLV_tb", "StatementLineItemLV_tb", null, pcftest.StatementDV_invoice.StatementLineItemLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.invoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceStatus extends SelectElement {
    public InvoiceStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ServiceRequestInvoiceStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ServiceRequestInvoiceStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ServiceRequestInvoiceStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ServiceRequestInvoiceStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.invoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementLineItemLV_tb extends PCFElement {
    public StatementLineItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.StatementDV_invoice.StatementLineItemLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.StatementDV_invoice.StatementLineItemLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.invoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.invoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}