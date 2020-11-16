package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.EnableWebProfilerPanelSet.TurnProfilingOff;
import pcftest.EnableWebProfilerPanelSet.TurnProfilingOn;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/EnableWebProfilerPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EnableWebProfilerPanelSet extends PCFElement {
  public final static String CHECKSUM = "45afdc08c107b654fdaa097ec884f49b";
  
  public EnableWebProfilerPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ProfilerOptionsLV getProfilerOptionsLV() {
    return getOrCreateProperty("ProfilerOptionsLV", "ProfilerOptionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerOptionsLV.class);
  }
  
  public TurnProfilingOff getTurnProfilingOff() {
    return getOrCreateProperty("TurnProfilingOff", "TurnProfilingOff", null, pcftest.EnableWebProfilerPanelSet.TurnProfilingOff.class);
  }
  
  public TurnProfilingOn getTurnProfilingOn() {
    return getOrCreateProperty("TurnProfilingOn", "TurnProfilingOn", null, pcftest.EnableWebProfilerPanelSet.TurnProfilingOn.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/EnableWebProfilerPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TurnProfilingOff extends ValueElement {
    public TurnProfilingOff(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/EnableWebProfilerPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TurnProfilingOn extends ValueElement {
    public TurnProfilingOn(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}