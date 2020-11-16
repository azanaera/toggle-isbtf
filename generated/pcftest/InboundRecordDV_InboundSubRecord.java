package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/inbound/InboundRecordDV.InboundSubRecord.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InboundRecordDV_InboundSubRecord extends InboundRecordDV {
  public final static String CHECKSUM = "552eb0ec686c8e6a3f3f9446a39532ea";
  
  public InboundRecordDV_InboundSubRecord(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getInboundRecordDVContent() {
    return getOrCreateProperty("InboundRecordDVContent", "InboundRecordDVContent", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInboundRecordDVLineNumber() {
    return getOrCreateProperty("InboundRecordDVLineNumber", "InboundRecordDVLineNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}