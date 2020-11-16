package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerConfigurationPage.ProfilerConfigurationPage_UpLink;
import pcftest.ProfilerConfigurationPage._Paging;
import pcftest.ProfilerConfigurationPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerConfigurationPage extends PCFLocation {
  public final static String CHECKSUM = "ae08d4749b103f9c91b1356233712490";
  
  public ProfilerConfigurationPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ProfilerConfigurationPage"));
  }
  
  public ProfilerConfigurationPage_UpLink getProfilerConfigurationPage_UpLink() {
    return getOrCreateProperty("ProfilerConfigurationPage_UpLink", "ProfilerConfigurationPage_UpLink", null, pcftest.ProfilerConfigurationPage.ProfilerConfigurationPage_UpLink.class);
  }
  
  public ProfilerConfigurationScreen getProfilerConfigurationScreen() {
    return getOrCreateProperty("ProfilerConfigurationScreen", "ProfilerConfigurationScreen", null, pcftest.ProfilerConfigurationScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ProfilerConfigurationPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ProfilerConfigurationPage.__crumb__.class);
  }
  
  public Profiler get_parent() {
    return getOrCreateProperty("_parent", pcftest.Profiler.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerConfigurationPage_UpLink extends ClickableActionElement {
    public ProfilerConfigurationPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}