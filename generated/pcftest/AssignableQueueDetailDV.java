package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/groups/AssignableQueueDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignableQueueDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "3b544c62345fe5ad20c7a725c455ec5c";
  
  public AssignableQueueDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getSubGroupVisible() {
    return getOrCreateProperty("SubGroupVisible", "SubGroupVisible", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  
}