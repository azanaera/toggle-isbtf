package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerPopup.ProfilerPopup_UpLink;
import pcftest.ProfilerPopup._Paging;
import pcftest.ProfilerPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerPopup extends PCFLocation {
  public final static String CHECKSUM = "53ecf8effb58e68c03d516c7d5089ac9";
  
  public ProfilerPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ProfilerPopup"));
  }
  
  public ProfilerConfigurationScreen getProfilerConfigurationScreen() {
    return getOrCreateProperty("ProfilerConfigurationScreen", "ProfilerConfigurationScreen", null, pcftest.ProfilerConfigurationScreen.class);
  }
  
  public ProfilerPopup_UpLink getProfilerPopup_UpLink() {
    return getOrCreateProperty("ProfilerPopup_UpLink", "ProfilerPopup_UpLink", null, pcftest.ProfilerPopup.ProfilerPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ProfilerPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ProfilerPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerPopup_UpLink extends ClickableActionElement {
    public ProfilerPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}