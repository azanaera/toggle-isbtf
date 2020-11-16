package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/summary/RemoveFlagInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RemoveFlagInfoDV extends DetailViewElement {
  public final static String CHECKSUM = "3bf29464e7ba26be97ea8a2a467d4c95";
  
  public RemoveFlagInfoDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaim() {
    return getOrCreateProperty("Claim", "Claim", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getFlaggedDate() {
    return getOrCreateProperty("FlaggedDate", "FlaggedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getFlaggedReason() {
    return getOrCreateProperty("FlaggedReason", "FlaggedReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInsured() {
    return getOrCreateProperty("Insured", "Insured", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNote() {
    return getOrCreateProperty("Note", "Note", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}