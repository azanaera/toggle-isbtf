package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowStatsDV extends DetailViewElement {
  public final static String CHECKSUM = "f490a527f4f7302bf53ca021b359000b";
  
  public WorkflowStatsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getDateFrom() {
    return getOrCreateProperty("DateFrom", "DateFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getDateTo() {
    return getOrCreateProperty("DateTo", "DateTo", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public SelectElement getType() {
    return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}