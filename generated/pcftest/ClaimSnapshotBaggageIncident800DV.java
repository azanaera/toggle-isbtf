package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotBaggageIncident800DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotBaggageIncident800DV extends DetailViewElement {
  public final static String CHECKSUM = "99e84592fcd3ed055679f1545f4b4631";
  
  public ClaimSnapshotBaggageIncident800DV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getBaggageMissingFrom() {
    return getOrCreateProperty("BaggageMissingFrom", "BaggageMissingFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getBaggageRecoveredOn() {
    return getOrCreateProperty("BaggageRecoveredOn", "BaggageRecoveredOn", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getBaggageType() {
    return getOrCreateProperty("BaggageType", "BaggageType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getCarrierCompensated() {
    return getOrCreateProperty("CarrierCompensated", "CarrierCompensated", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getCarrierCompensatedAmount() {
    return getOrCreateProperty("CarrierCompensatedAmount", "CarrierCompensatedAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getDelayOnly() {
    return getOrCreateProperty("DelayOnly", "DelayOnly", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimateCost() {
    return getOrCreateProperty("EstimateCost", "EstimateCost", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimateTime() {
    return getOrCreateProperty("EstimateTime", "EstimateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimatedReceived() {
    return getOrCreateProperty("EstimatedReceived", "EstimatedReceived", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossEstimate() {
    return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyDescription() {
    return getOrCreateProperty("PropertyDescription", "PropertyDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}