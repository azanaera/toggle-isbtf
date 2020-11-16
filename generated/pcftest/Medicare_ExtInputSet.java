package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/Medicare_ExtInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Medicare_ExtInputSet extends PCFElement {
  public final static String CHECKSUM = "24805ba7a520cd8765bc3b42717f5fcb";
  
  public Medicare_ExtInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getClaimantRepresentation() {
    return getOrCreateProperty("ClaimantRepresentation", "ClaimantRepresentation", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getExhaustDate() {
    return getOrCreateProperty("ExhaustDate", "ExhaustDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getNoFaultLimit() {
    return getOrCreateProperty("NoFaultLimit", "NoFaultLimit", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getORM() {
    return getOrCreateProperty("ORM", "ORM", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getORMTermDate() {
    return getOrCreateProperty("ORMTermDate", "ORMTermDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  
}