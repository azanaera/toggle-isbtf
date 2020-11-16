package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.VoidStopCheckDV.CheckSummaryPaymentsLV_tb;
import pcftest.VoidStopCheckDV.Comments;
import typekey.VoidStopReason_Ext;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VoidStopCheckDV extends DetailViewElement {
  public final static String CHECKSUM = "58805403ec1bfe105d734ffa80672cd2";
  
  public VoidStopCheckDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCheckNumber() {
    return getOrCreateProperty("CheckNumber", "CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckSummaryPaymentsLV getCheckSummaryPaymentsLV() {
    return getOrCreateProperty("CheckSummaryPaymentsLV", "CheckSummaryPaymentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckSummaryPaymentsLV.class);
  }
  
  public CheckSummaryPaymentsLV_tb getCheckSummaryPaymentsLV_tb() {
    return getOrCreateProperty("CheckSummaryPaymentsLV_tb", "CheckSummaryPaymentsLV_tb", null, pcftest.VoidStopCheckDV.CheckSummaryPaymentsLV_tb.class);
  }
  
  public Comments getComments() {
    return getOrCreateProperty("Comments", "Comments", null, pcftest.VoidStopCheckDV.Comments.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getCreateUser() {
    return getOrCreateProperty("CreateUser", "CreateUser", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGrossAmount() {
    return getOrCreateProperty("GrossAmount", "GrossAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getIssueDate() {
    return getOrCreateProperty("IssueDate", "IssueDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getPayTo() {
    return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckSummaryPaymentsLV_tb extends PCFElement {
    public CheckSummaryPaymentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Comments extends SelectElement {
    public Comments(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(VoidStopReason_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public VoidStopReason_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VoidStopReason_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(VoidStopReason_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}