package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/archive/RetrieveClaimInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RetrieveClaimInfoDV extends DetailViewElement {
  public final static String CHECKSUM = "13b775de9b01f6427b8a0b16cc99c3e8";
  
  public RetrieveClaimInfoDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getComment() {
    return getOrCreateProperty("Comment", "Comment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}