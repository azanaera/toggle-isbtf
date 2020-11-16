package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WeightedWorkloadAdminPanelSet.LocalizedValues;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workload/WeightedWorkloadAdminPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WeightedWorkloadAdminPanelSet extends PCFElement {
  public final static String CHECKSUM = "82399aef99aaba287f79fbc7c9a9da27";
  
  public WeightedWorkloadAdminPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getActive() {
    return getOrCreateProperty("Active", "Active", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LocalizedValues getLocalizedValues() {
    return getOrCreateProperty("LocalizedValues", "LocalizedValues", null, pcftest.WeightedWorkloadAdminPanelSet.LocalizedValues.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPriority() {
    return getOrCreateProperty("Priority", "Priority", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWeight() {
    return getOrCreateProperty("Weight", "Weight", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public WorkloadClassificationDV_ClaimWorkloadClassification getWorkloadClassificationDV_ClaimWorkloadClassification() {
    return getOrCreateProperty("WorkloadClassificationDV_ClaimWorkloadClassification", "WorkloadClassificationDV", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.class);
  }
  
  public WorkloadClassificationDV_ExposureWorkloadClassification getWorkloadClassificationDV_ExposureWorkloadClassification() {
    return getOrCreateProperty("WorkloadClassificationDV_ExposureWorkloadClassification", "WorkloadClassificationDV", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WeightedWorkloadAdminPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocalizedValues extends PCFElement {
    public LocalizedValues(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LocalizedValuesDV getLocalizedValuesDV() {
      return getOrCreateProperty("LocalizedValuesDV", "LocalizedValuesDV", null, pcftest.LocalizedValuesDV.class);
    }
    
    
  }
  
  
}