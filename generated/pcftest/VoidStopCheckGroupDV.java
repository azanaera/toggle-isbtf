package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.VoidStopCheckGroupDV.CheckSummaryPaymentsLV_tb;
import pcftest.VoidStopCheckGroupDV.VoidStopCheckGroupLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VoidStopCheckGroupDV extends DetailViewElement {
  public final static String CHECKSUM = "b7ddb5984a4a6166575add6bd49581f0";
  
  public VoidStopCheckGroupDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckSummaryPaymentsLV getCheckSummaryPaymentsLV() {
    return getOrCreateProperty("CheckSummaryPaymentsLV", "CheckSummaryPaymentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckSummaryPaymentsLV.class);
  }
  
  public CheckSummaryPaymentsLV_tb getCheckSummaryPaymentsLV_tb() {
    return getOrCreateProperty("CheckSummaryPaymentsLV_tb", "CheckSummaryPaymentsLV_tb", null, pcftest.VoidStopCheckGroupDV.CheckSummaryPaymentsLV_tb.class);
  }
  
  public ValueElement getCheck_Comments() {
    return getOrCreateProperty("Check_Comments", "Check_Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public VoidStopCheckGroupLV getVoidStopCheckGroupLV() {
    return getOrCreateProperty("VoidStopCheckGroupLV", "VoidStopCheckGroupLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.VoidStopCheckGroupLV.class);
  }
  
  public VoidStopCheckGroupLV_tb getVoidStopCheckGroupLV_tb() {
    return getOrCreateProperty("VoidStopCheckGroupLV_tb", "VoidStopCheckGroupLV_tb", null, pcftest.VoidStopCheckGroupDV.VoidStopCheckGroupLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckSummaryPaymentsLV_tb extends PCFElement {
    public CheckSummaryPaymentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckGroupDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VoidStopCheckGroupLV_tb extends PCFElement {
    public VoidStopCheckGroupLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}