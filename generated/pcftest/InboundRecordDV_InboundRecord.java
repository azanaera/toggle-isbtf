package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.InboundRecordDV_InboundRecord.InboundRecordDVStatus;
import typekey.InboundRecordStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/inbound/InboundRecordDV.InboundRecord.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InboundRecordDV_InboundRecord extends InboundRecordDV {
  public final static String CHECKSUM = "667af1e84cbf195dcd34f74898b5c972";
  
  public InboundRecordDV_InboundRecord(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getInboundRecordDVContent() {
    return getOrCreateProperty("InboundRecordDVContent", "InboundRecordDVContent", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInboundRecordDVErrorMessage() {
    return getOrCreateProperty("InboundRecordDVErrorMessage", "InboundRecordDVErrorMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInboundRecordDVHandlerName() {
    return getOrCreateProperty("InboundRecordDVHandlerName", "InboundRecordDVHandlerName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInboundRecordDVLastModifiedUser() {
    return getOrCreateProperty("InboundRecordDVLastModifiedUser", "InboundRecordDVLastModifiedUser", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInboundRecordDVLineNumber() {
    return getOrCreateProperty("InboundRecordDVLineNumber", "InboundRecordDVLineNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public InboundRecordDVStatus getInboundRecordDVStatus() {
    return getOrCreateProperty("InboundRecordDVStatus", "InboundRecordDVStatus", null, pcftest.InboundRecordDV_InboundRecord.InboundRecordDVStatus.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundRecordDV.InboundRecord.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InboundRecordDVStatus extends SelectElement {
    public InboundRecordDVStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(InboundRecordStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public InboundRecordStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InboundRecordStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(InboundRecordStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}