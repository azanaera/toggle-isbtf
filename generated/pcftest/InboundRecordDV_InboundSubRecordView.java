package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/inbound/InboundRecordDV.InboundSubRecordView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InboundRecordDV_InboundSubRecordView extends InboundRecordDV {
  public final static String CHECKSUM = "18697f5cef9926be3d3ca009544a8a41";
  
  public InboundRecordDV_InboundSubRecordView(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getInboundRecordDVContent() {
    return getOrCreateProperty("InboundRecordDVContent", "InboundRecordDVContent", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInboundRecordDVLineNumber() {
    return getOrCreateProperty("InboundRecordDVLineNumber", "InboundRecordDVLineNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}