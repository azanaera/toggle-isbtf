package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerAnalysisPopup.ProfilerAnalysisPopup_UpLink;
import pcftest.ProfilerAnalysisPopup._Paging;
import pcftest.ProfilerAnalysisPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerAnalysisPopup extends PCFLocation {
  public final static String CHECKSUM = "9347aa2814c01d51a0edd372da8acd61";
  
  public ProfilerAnalysisPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ProfilerAnalysisPopup"));
  }
  
  public ProfilerAnalysisPopup_UpLink getProfilerAnalysisPopup_UpLink() {
    return getOrCreateProperty("ProfilerAnalysisPopup_UpLink", "ProfilerAnalysisPopup_UpLink", null, pcftest.ProfilerAnalysisPopup.ProfilerAnalysisPopup_UpLink.class);
  }
  
  public ProfilerAnalysisScreen getProfilerAnalysisScreen() {
    return getOrCreateProperty("ProfilerAnalysisScreen", "ProfilerAnalysisScreen", null, pcftest.ProfilerAnalysisScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ProfilerAnalysisPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ProfilerAnalysisPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerAnalysisPopup_UpLink extends ClickableActionElement {
    public ProfilerAnalysisPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}