package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReinsuranceInputSet.ReinsuranceFlagged;
import typekey.ReinsuranceFlaggedStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/generalstatus/ReinsuranceInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceInputSet extends PCFElement {
  public final static String CHECKSUM = "b3e0dd4e8e35ed59089872ef69c50857";
  
  public ReinsuranceInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ReinsuranceFlagged getReinsuranceFlagged() {
    return getOrCreateProperty("ReinsuranceFlagged", "ReinsuranceFlagged", null, pcftest.ReinsuranceInputSet.ReinsuranceFlagged.class);
  }
  
  public ValueElement getReinsuranceReason() {
    return getOrCreateProperty("ReinsuranceReason", "ReinsuranceReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getReinsuranceReportable() {
    return getOrCreateProperty("ReinsuranceReportable", "ReinsuranceReportable", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/generalstatus/ReinsuranceInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceFlagged extends SelectElement {
    public ReinsuranceFlagged(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ReinsuranceFlaggedStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ReinsuranceFlaggedStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ReinsuranceFlaggedStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ReinsuranceFlaggedStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}