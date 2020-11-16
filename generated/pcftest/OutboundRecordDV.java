package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OutboundRecordDV.OutboundRecordDVStatus;
import typekey.OutboundRecordStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/outboundfile/OutboundRecordDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OutboundRecordDV extends DetailViewElement {
  public final static String CHECKSUM = "f65eaac1687c89e8f88575613dc01d17";
  
  public OutboundRecordDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getOutboundRecordDVConfig() {
    return getOrCreateProperty("OutboundRecordDVConfig", "OutboundRecordDVConfig", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOutboundRecordDVContent() {
    return getOrCreateProperty("OutboundRecordDVContent", "OutboundRecordDVContent", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getOutboundRecordDVCreateDate() {
    return getOrCreateProperty("OutboundRecordDVCreateDate", "OutboundRecordDVCreateDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getOutboundRecordDVErrorMessage() {
    return getOrCreateProperty("OutboundRecordDVErrorMessage", "OutboundRecordDVErrorMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOutboundRecordDVLastModifiedUser() {
    return getOrCreateProperty("OutboundRecordDVLastModifiedUser", "OutboundRecordDVLastModifiedUser", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OutboundRecordDVStatus getOutboundRecordDVStatus() {
    return getOrCreateProperty("OutboundRecordDVStatus", "OutboundRecordDVStatus", null, pcftest.OutboundRecordDV.OutboundRecordDVStatus.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundRecordDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OutboundRecordDVStatus extends SelectElement {
    public OutboundRecordDVStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(OutboundRecordStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public OutboundRecordStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.OutboundRecordStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(OutboundRecordStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}