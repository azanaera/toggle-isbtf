package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerAnalysisPage.ProfilerAnalysisPage_UpLink;
import pcftest.ProfilerAnalysisPage._Paging;
import pcftest.ProfilerAnalysisPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerAnalysisPage extends PCFLocation {
  public final static String CHECKSUM = "f72ac72bb49ad35a60413121843d3851";
  
  public ProfilerAnalysisPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ProfilerAnalysisPage"));
  }
  
  public ProfilerAnalysisPage_UpLink getProfilerAnalysisPage_UpLink() {
    return getOrCreateProperty("ProfilerAnalysisPage_UpLink", "ProfilerAnalysisPage_UpLink", null, pcftest.ProfilerAnalysisPage.ProfilerAnalysisPage_UpLink.class);
  }
  
  public ProfilerAnalysisScreen getProfilerAnalysisScreen() {
    return getOrCreateProperty("ProfilerAnalysisScreen", "ProfilerAnalysisScreen", null, pcftest.ProfilerAnalysisScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ProfilerAnalysisPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ProfilerAnalysisPage.__crumb__.class);
  }
  
  public ProfilerAnalysisLG get_parent() {
    return getOrCreateProperty("_parent", pcftest.ProfilerAnalysisLG.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerAnalysisPage_UpLink extends ClickableActionElement {
    public ProfilerAnalysisPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}