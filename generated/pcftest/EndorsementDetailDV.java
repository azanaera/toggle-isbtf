package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/EndorsementDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EndorsementDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "7463000f49cdb94c6b0cfa633609a54f";
  
  public EndorsementDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getEffectiveDate() {
    return getOrCreateProperty("EffectiveDate", "EffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getExpirationDate() {
    return getOrCreateProperty("ExpirationDate", "ExpirationDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getFormNumber() {
    return getOrCreateProperty("FormNumber", "FormNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getedition_ext() {
    return getOrCreateProperty("edition_ext", "edition_ext", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getvehicle_ext() {
    return getOrCreateProperty("vehicle_ext", "vehicle_ext", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}