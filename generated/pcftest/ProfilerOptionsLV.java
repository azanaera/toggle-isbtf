package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerOptionsLV._Select;
import pcftest.ProfilerOptionsLV._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerOptionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerOptionsLV extends PCFElement {
  public final static String CHECKSUM = "12f478b37898b0b22f5fc959b3edcafb";
  
  public ProfilerOptionsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDbmsCounterThresholdMs() {
    return getOrCreateProperty("DbmsCounterThresholdMs", "DbmsCounterThresholdMs", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDbmsCounterThresholdMsText() {
    return getOrCreateProperty("DbmsCounterThresholdMsText", "DbmsCounterThresholdMsText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckboxValueElement getDiffDbmsCounters() {
    return getOrCreateProperty("DiffDbmsCounters", "DiffDbmsCounters", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ValueElement getDiffDbmsCountersText() {
    return getOrCreateProperty("DiffDbmsCountersText", "DiffDbmsCountersText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckboxValueElement getExtendedQueryTracing() {
    return getOrCreateProperty("ExtendedQueryTracing", "ExtendedQueryTracing", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ValueElement getExtendedQueryTracingText() {
    return getOrCreateProperty("ExtendedQueryTracingText", "ExtendedQueryTracingText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckboxValueElement getQueryOptimizerTracing() {
    return getOrCreateProperty("QueryOptimizerTracing", "QueryOptimizerTracing", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ValueElement getQueryOptimizerTracingText() {
    return getOrCreateProperty("QueryOptimizerTracingText", "QueryOptimizerTracingText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckboxValueElement getStackTraceTracking() {
    return getOrCreateProperty("StackTraceTracking", "StackTraceTracking", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ValueElement getStackTraceTrackingText() {
    return getOrCreateProperty("StackTraceTrackingText", "StackTraceTrackingText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckboxValueElement getUseNanoTime() {
    return getOrCreateProperty("UseNanoTime", "UseNanoTime", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ValueElement getUseNanoTimeText() {
    return getOrCreateProperty("UseNanoTimeText", "UseNanoTimeText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  public _Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerOptionsLV._Select.class);
  }
  
  public _ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerOptionsLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerOptionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerOptionsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}