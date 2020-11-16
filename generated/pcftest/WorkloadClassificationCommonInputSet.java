package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkloadClassificationCommonInputSet.AllClaimLossType;
import pcftest.WorkloadClassificationCommonInputSet.AssignmentClassificationInputSet;
import pcftest.WorkloadClassificationCommonInputSet.AssignmentClassificationInputSet.ClaimLossType;
import typekey.LossType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationCommonInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkloadClassificationCommonInputSet extends PCFElement {
  public final static String CHECKSUM = "ba7b33e7315a6abbfafadd6dd2631523";
  
  public WorkloadClassificationCommonInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAllClaimLOBCode() {
    return getOrCreateProperty("AllClaimLOBCode", "AllClaimLOBCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AllClaimLossType getAllClaimLossType() {
    return getOrCreateProperty("AllClaimLossType", "AllClaimLossType", null, pcftest.WorkloadClassificationCommonInputSet.AllClaimLossType.class);
  }
  
  public ValueElement getAllClaimPolicyType() {
    return getOrCreateProperty("AllClaimPolicyType", "AllClaimPolicyType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AssignmentClassificationInputSet getAssignmentClassificationInputSet() {
    return getOrCreateProperty("AssignmentClassificationInputSet", "AssignmentClassificationInputSet", null, pcftest.WorkloadClassificationCommonInputSet.AssignmentClassificationInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationCommonInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AllClaimLossType extends SelectElement {
    public AllClaimLossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationCommonInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentClassificationInputSet extends PCFElement {
    public AssignmentClassificationInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getClaimLOBCode() {
      return getOrCreateProperty("ClaimLOBCode", "ClaimLOBCode", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ClaimLossType getClaimLossType() {
      return getOrCreateProperty("ClaimLossType", "ClaimLossType", null, pcftest.WorkloadClassificationCommonInputSet.AssignmentClassificationInputSet.ClaimLossType.class);
    }
    
    public SelectElement getClaimPolicyType() {
      return getOrCreateProperty("ClaimPolicyType", "ClaimPolicyType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationCommonInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimLossType extends SelectElement {
      public ClaimLossType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  
}