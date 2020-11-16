package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerAnalysisLG.MenuLinks;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage10;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage11;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage2;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage3;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage4;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage5;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage6;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage7;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage8;
import pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage9;
import pcftest.ProfilerAnalysisLG.ProfilerAnalysisLG_UpLink;
import pcftest.ProfilerAnalysisLG._Paging;
import pcftest.ProfilerAnalysisLG.__crumb__;
import pcftest.ProfilerAnalysisLG._msgs;
import pcftest.ProfilerAnalysisLG.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerAnalysisLG extends PCFLocation {
  public final static String CHECKSUM = "b6da834d0966e46b0272f107b2dc06a9";
  
  public ProfilerAnalysisLG(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ProfilerAnalysisLG"));
  }
  
  public InternalToolsTabBar getInternalToolsTabBar() {
    return getOrCreateProperty("InternalToolsTabBar", pcftest.InternalToolsTabBar.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ProfilerAnalysisLG.MenuLinks.class, "ServerTools-MenuLinks-ServerTools_Profiler-Profiler_ProfilerAnalysisLG");
  }
  
  public ProfilerAnalysisLG_UpLink getProfilerAnalysisLG_UpLink() {
    return getOrCreateProperty("ProfilerAnalysisLG_UpLink", "ProfilerAnalysisLG_UpLink", null, pcftest.ProfilerAnalysisLG.ProfilerAnalysisLG_UpLink.class);
  }
  
  public ProfilerAnalysisPage getProfilerAnalysisPage() {
    return getOrCreateProperty("ProfilerAnalysisPage", pcftest.ProfilerAnalysisPage.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ProfilerAnalysisLG._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ProfilerAnalysisLG.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ProfilerAnalysisLG._msgs.class);
  }
  
  public Profiler get_parent() {
    return getOrCreateProperty("_parent", pcftest.Profiler.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ProfilerAnalysisLG.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage getProfilerAnalysisLG_ProfilerAnalysisPage() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage", "ProfilerAnalysisLG_ProfilerAnalysisPage", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage.class);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage10 getProfilerAnalysisLG_ProfilerAnalysisPage10() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage10", "ProfilerAnalysisLG_ProfilerAnalysisPage10", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage10.class);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage11 getProfilerAnalysisLG_ProfilerAnalysisPage11() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage11", "ProfilerAnalysisLG_ProfilerAnalysisPage11", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage11.class);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage2 getProfilerAnalysisLG_ProfilerAnalysisPage2() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage2", "ProfilerAnalysisLG_ProfilerAnalysisPage2", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage2.class);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage3 getProfilerAnalysisLG_ProfilerAnalysisPage3() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage3", "ProfilerAnalysisLG_ProfilerAnalysisPage3", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage3.class);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage4 getProfilerAnalysisLG_ProfilerAnalysisPage4() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage4", "ProfilerAnalysisLG_ProfilerAnalysisPage4", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage4.class);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage5 getProfilerAnalysisLG_ProfilerAnalysisPage5() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage5", "ProfilerAnalysisLG_ProfilerAnalysisPage5", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage5.class);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage6 getProfilerAnalysisLG_ProfilerAnalysisPage6() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage6", "ProfilerAnalysisLG_ProfilerAnalysisPage6", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage6.class);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage7 getProfilerAnalysisLG_ProfilerAnalysisPage7() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage7", "ProfilerAnalysisLG_ProfilerAnalysisPage7", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage7.class);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage8 getProfilerAnalysisLG_ProfilerAnalysisPage8() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage8", "ProfilerAnalysisLG_ProfilerAnalysisPage8", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage8.class);
    }
    
    public ProfilerAnalysisLG_ProfilerAnalysisPage9 getProfilerAnalysisLG_ProfilerAnalysisPage9() {
      return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage9", "ProfilerAnalysisLG_ProfilerAnalysisPage9", null, pcftest.ProfilerAnalysisLG.MenuLinks.ProfilerAnalysisLG_ProfilerAnalysisPage9.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage10 extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage10(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage11 extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage11(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage2 extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage3 extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage3(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage4 extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage4(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage5 extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage5(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage6 extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage6(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage7 extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage7(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage8 extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage8(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerAnalysisLG_ProfilerAnalysisPage9 extends ClickableActionElement {
      public ProfilerAnalysisLG_ProfilerAnalysisPage9(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerAnalysisPage click() {
        return clickThis(pcftest.ProfilerAnalysisPage.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerAnalysisLG_UpLink extends ClickableActionElement {
    public ProfilerAnalysisLG_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}