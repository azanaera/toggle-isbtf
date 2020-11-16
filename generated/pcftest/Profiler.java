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
import pcftest.Profiler.MenuLinks;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage10;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage11;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage2;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage3;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage4;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage5;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage6;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage7;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage8;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage9;
import pcftest.Profiler.MenuLinks.Profiler_ProfilerConfigurationPage;
import pcftest.Profiler.Profiler_UpLink;
import pcftest.Profiler._Paging;
import pcftest.Profiler.__crumb__;
import pcftest.Profiler._msgs;
import pcftest.Profiler.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Profiler extends PCFLocation {
  public final static String CHECKSUM = "dd8062d6660b230ae4bae44b24be038b";
  
  public Profiler(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Profiler"));
  }
  
  public InternalToolsTabBar getInternalToolsTabBar() {
    return getOrCreateProperty("InternalToolsTabBar", pcftest.InternalToolsTabBar.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.Profiler.MenuLinks.class, "ServerTools-MenuLinks-ServerTools_Profiler");
  }
  
  public ProfilerAnalysisLG getProfilerAnalysisLG() {
    return getOrCreateProperty("ProfilerAnalysisLG", pcftest.ProfilerAnalysisLG.class);
  }
  
  public ProfilerConfigurationPage getProfilerConfigurationPage() {
    return getOrCreateProperty("ProfilerConfigurationPage", pcftest.ProfilerConfigurationPage.class);
  }
  
  public Profiler_UpLink getProfiler_UpLink() {
    return getOrCreateProperty("Profiler_UpLink", "Profiler_UpLink", null, pcftest.Profiler.Profiler_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Profiler._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Profiler.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Profiler._msgs.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.Profiler.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Profiler_ProfilerAnalysisLG getProfiler_ProfilerAnalysisLG() {
      return getOrCreateProperty("Profiler_ProfilerAnalysisLG", "Profiler_ProfilerAnalysisLG", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.class);
    }
    
    public Profiler_ProfilerConfigurationPage getProfiler_ProfilerConfigurationPage() {
      return getOrCreateProperty("Profiler_ProfilerConfigurationPage", "Profiler_ProfilerConfigurationPage", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerConfigurationPage.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Profiler_ProfilerAnalysisLG extends ClickableActionElement {
      public Profiler_ProfilerAnalysisLG(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage getProfilerAnalysisLG_ProfilerAnalysisPage() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage", "ProfilerAnalysisLG_ProfilerAnalysisPage", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage10 getProfilerAnalysisLG_ProfilerAnalysisPage10() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage10", "ProfilerAnalysisLG_ProfilerAnalysisPage10", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage10.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage11 getProfilerAnalysisLG_ProfilerAnalysisPage11() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage11", "ProfilerAnalysisLG_ProfilerAnalysisPage11", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage11.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage2 getProfilerAnalysisLG_ProfilerAnalysisPage2() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage2", "ProfilerAnalysisLG_ProfilerAnalysisPage2", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage2.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage3 getProfilerAnalysisLG_ProfilerAnalysisPage3() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage3", "ProfilerAnalysisLG_ProfilerAnalysisPage3", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage3.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage4 getProfilerAnalysisLG_ProfilerAnalysisPage4() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage4", "ProfilerAnalysisLG_ProfilerAnalysisPage4", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage4.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage5 getProfilerAnalysisLG_ProfilerAnalysisPage5() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage5", "ProfilerAnalysisLG_ProfilerAnalysisPage5", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage5.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage6 getProfilerAnalysisLG_ProfilerAnalysisPage6() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage6", "ProfilerAnalysisLG_ProfilerAnalysisPage6", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage6.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage7 getProfilerAnalysisLG_ProfilerAnalysisPage7() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage7", "ProfilerAnalysisLG_ProfilerAnalysisPage7", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage7.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage8 getProfilerAnalysisLG_ProfilerAnalysisPage8() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage8", "ProfilerAnalysisLG_ProfilerAnalysisPage8", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage8.class);
      }
      
      public ProfilerAnalysisLG_ProfilerAnalysisPage9 getProfilerAnalysisLG_ProfilerAnalysisPage9() {
        return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage9", "ProfilerAnalysisLG_ProfilerAnalysisPage9", null, pcftest.Profiler.MenuLinks.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage9.class);
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
    @Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Profiler_ProfilerConfigurationPage extends ClickableActionElement {
      public Profiler_ProfilerConfigurationPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ProfilerConfigurationPage click() {
        return clickThis(pcftest.ProfilerConfigurationPage.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Profiler_UpLink extends ClickableActionElement {
    public Profiler_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}