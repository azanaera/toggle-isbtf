package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerResultsCV_default.MainTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_default extends ProfilerResultsCV {
  public final static String CHECKSUM = "3c1fbf54122ae81669c197ff8873dbda";
  
  public ProfilerResultsCV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public MainTab getMainTab() {
    return getOrCreateProperty("MainTab", "MainTab", null, pcftest.ProfilerResultsCV_default.MainTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MainTab extends ClickableActionElement {
    public MainTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}