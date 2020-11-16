package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.JProfiler.JProfilerScreen;
import pcftest.JProfiler.JProfilerScreen.JProfilerDV;
import pcftest.JProfiler.JProfilerScreen.JProfilerDV.dump;
import pcftest.JProfiler.JProfilerScreen.JProfilerDV.startcpu;
import pcftest.JProfiler.JProfilerScreen.JProfilerDV.startmemory;
import pcftest.JProfiler.JProfilerScreen.JProfilerDV.startthread;
import pcftest.JProfiler.JProfilerScreen.JProfilerDV.stop;
import pcftest.JProfiler.JProfilerScreen.JProfilerDV.stopAndRestartCPUAndThread;
import pcftest.JProfiler.JProfilerScreen.JProfilerIsNotAvailable;
import pcftest.JProfiler.JProfilerScreen.JProfilerIsNotAvailable.CloseBtn;
import pcftest.JProfiler.JProfilerScreen._msgs;
import pcftest.JProfiler.JProfiler_UpLink;
import pcftest.JProfiler._Paging;
import pcftest.JProfiler.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class JProfiler extends PCFLocation {
  public final static String CHECKSUM = "6a89800b3d55bc615e0910cfa31ac59c";
  
  public JProfiler(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("JProfiler"));
  }
  
  public JProfilerScreen getJProfilerScreen() {
    return getOrCreateProperty("JProfilerScreen", "JProfilerScreen", null, pcftest.JProfiler.JProfilerScreen.class);
  }
  
  public JProfiler_UpLink getJProfiler_UpLink() {
    return getOrCreateProperty("JProfiler_UpLink", "JProfiler_UpLink", null, pcftest.JProfiler.JProfiler_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.JProfiler._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.JProfiler.__crumb__.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JProfilerScreen extends PCFElement {
    public JProfilerScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public JProfilerDV getJProfilerDV() {
      return getOrCreateProperty("JProfilerDV", "JProfilerDV", null, pcftest.JProfiler.JProfilerScreen.JProfilerDV.class);
    }
    
    public JProfilerIsNotAvailable getJProfilerIsNotAvailable() {
      return getOrCreateProperty("JProfilerIsNotAvailable", "JProfilerIsNotAvailable", null, pcftest.JProfiler.JProfilerScreen.JProfilerIsNotAvailable.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.JProfiler.JProfilerScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class JProfilerDV extends DetailViewElement {
      public JProfilerDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public dump getdump() {
        return getOrCreateProperty("dump", "dump", null, pcftest.JProfiler.JProfilerScreen.JProfilerDV.dump.class);
      }
      
      public startcpu getstartcpu() {
        return getOrCreateProperty("startcpu", "startcpu", null, pcftest.JProfiler.JProfilerScreen.JProfilerDV.startcpu.class);
      }
      
      public startmemory getstartmemory() {
        return getOrCreateProperty("startmemory", "startmemory", null, pcftest.JProfiler.JProfilerScreen.JProfilerDV.startmemory.class);
      }
      
      public startthread getstartthread() {
        return getOrCreateProperty("startthread", "startthread", null, pcftest.JProfiler.JProfilerScreen.JProfilerDV.startthread.class);
      }
      
      public stop getstop() {
        return getOrCreateProperty("stop", "stop", null, pcftest.JProfiler.JProfilerScreen.JProfilerDV.stop.class);
      }
      
      public stopAndRestartCPUAndThread getstopAndRestartCPUAndThread() {
        return getOrCreateProperty("stopAndRestartCPUAndThread", "stopAndRestartCPUAndThread", null, pcftest.JProfiler.JProfilerScreen.JProfilerDV.stopAndRestartCPUAndThread.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class dump extends ValueElement {
        public dump(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class startcpu extends ValueElement {
        public startcpu(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class startmemory extends ValueElement {
        public startmemory(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class startthread extends ValueElement {
        public startthread(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class stop extends ValueElement {
        public stop(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class stopAndRestartCPUAndThread extends ValueElement {
        public stopAndRestartCPUAndThread(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class JProfilerIsNotAvailable extends ClickableActionElement {
      public JProfilerIsNotAvailable(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.JProfiler.JProfilerScreen.JProfilerIsNotAvailable.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JProfiler_UpLink extends ClickableActionElement {
    public JProfiler_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/JProfiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}