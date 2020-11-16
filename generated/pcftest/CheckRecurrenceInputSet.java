package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckRecurrenceInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckRecurrenceInputSet extends PCFElement {
  public final static String CHECKSUM = "8ed7a59ee84a3a4829ff27dd99587c06";
  
  public CheckRecurrenceInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckRecurrenceDetailInputSet_monthly getCheckRecurrenceDetailInputSet_monthly() {
    return getOrCreateProperty("CheckRecurrenceDetailInputSet_monthly", "CheckRecurrenceDetailInputSet", null, pcftest.CheckRecurrenceDetailInputSet_monthly.class);
  }
  
  public CheckRecurrenceDetailInputSet_single getCheckRecurrenceDetailInputSet_single() {
    return getOrCreateProperty("CheckRecurrenceDetailInputSet_single", "CheckRecurrenceDetailInputSet", null, pcftest.CheckRecurrenceDetailInputSet_single.class);
  }
  
  public CheckRecurrenceDetailInputSet_weekly getCheckRecurrenceDetailInputSet_weekly() {
    return getOrCreateProperty("CheckRecurrenceDetailInputSet_weekly", "CheckRecurrenceDetailInputSet", null, pcftest.CheckRecurrenceDetailInputSet_weekly.class);
  }
  
  public SelectElement getRecurrenceType() {
    return getOrCreateProperty("RecurrenceType", "RecurrenceType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}