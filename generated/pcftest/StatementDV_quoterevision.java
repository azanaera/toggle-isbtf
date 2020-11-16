package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.StatementDV_quoterevision.StatementLineItemLV_tb;
import pcftest.StatementDV_quoterevision.StatementLineItemLV_tb.Add;
import pcftest.StatementDV_quoterevision.StatementLineItemLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.quoterevision.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StatementDV_quoterevision extends StatementDV {
  public final static String CHECKSUM = "f64535741b535e49561ebaf6d5cf3f43";
  
  public StatementDV_quoterevision(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDaysToPerformService() {
    return getOrCreateProperty("DaysToPerformService", "DaysToPerformService", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPreviousTotal() {
    return getOrCreateProperty("PreviousTotal", "PreviousTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReferenceNumber() {
    return getOrCreateProperty("ReferenceNumber", "ReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public StatementLineItemLV getStatementLineItemLV() {
    return getOrCreateProperty("StatementLineItemLV", "StatementLineItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatementLineItemLV.class);
  }
  
  public StatementLineItemLV_tb getStatementLineItemLV_tb() {
    return getOrCreateProperty("StatementLineItemLV_tb", "StatementLineItemLV_tb", null, pcftest.StatementDV_quoterevision.StatementLineItemLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.quoterevision.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementLineItemLV_tb extends PCFElement {
    public StatementLineItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.StatementDV_quoterevision.StatementLineItemLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.StatementDV_quoterevision.StatementLineItemLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.quoterevision.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.quoterevision.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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