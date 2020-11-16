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
import pcftest.MetroFlows.MetroFlowsScreen;
import pcftest.MetroFlows.MetroFlowsScreen.MetroFlowsLV_tb;
import pcftest.MetroFlows.MetroFlowsScreen.MetroFlowsLV_tb.MetroFlows_ResumeAllButton;
import pcftest.MetroFlows.MetroFlowsScreen.MetroFlowsLV_tb.MetroFlows_ResumeButton;
import pcftest.MetroFlows.MetroFlowsScreen._msgs;
import pcftest.MetroFlows.MetroFlows_UpLink;
import pcftest.MetroFlows._Paging;
import pcftest.MetroFlows.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/workflow/MetroFlows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlows extends PCFLocation {
  public final static String CHECKSUM = "352b33bb16ef69b7027bb6207d6ceb21";
  
  public MetroFlows(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MetroFlows"));
  }
  
  public MetroFlowsScreen getMetroFlowsScreen() {
    return getOrCreateProperty("MetroFlowsScreen", "MetroFlowsScreen", null, pcftest.MetroFlows.MetroFlowsScreen.class);
  }
  
  public MetroFlows_UpLink getMetroFlows_UpLink() {
    return getOrCreateProperty("MetroFlows_UpLink", "MetroFlows_UpLink", null, pcftest.MetroFlows.MetroFlows_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MetroFlows._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MetroFlows.__crumb__.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowsScreen extends PCFElement {
    public MetroFlowsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MetroFlowsDV getMetroFlowsDV() {
      return getOrCreateProperty("MetroFlowsDV", "MetroFlowsDV", null, pcftest.MetroFlowsDV.class);
    }
    
    public MetroFlowsLV getMetroFlowsLV() {
      return getOrCreateProperty("MetroFlowsLV", "MetroFlowsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MetroFlowsLV.class);
    }
    
    public MetroFlowsLV_tb getMetroFlowsLV_tb() {
      return getOrCreateProperty("MetroFlowsLV_tb", "MetroFlowsLV_tb", null, pcftest.MetroFlows.MetroFlowsScreen.MetroFlowsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MetroFlows.MetroFlowsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroFlowsLV_tb extends PCFElement {
      public MetroFlowsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MetroFlows_ResumeAllButton getMetroFlows_ResumeAllButton() {
        return getOrCreateProperty("MetroFlows_ResumeAllButton", "MetroFlows_ResumeAllButton", null, pcftest.MetroFlows.MetroFlowsScreen.MetroFlowsLV_tb.MetroFlows_ResumeAllButton.class);
      }
      
      public MetroFlows_ResumeButton getMetroFlows_ResumeButton() {
        return getOrCreateProperty("MetroFlows_ResumeButton", "MetroFlows_ResumeButton", null, pcftest.MetroFlows.MetroFlowsScreen.MetroFlowsLV_tb.MetroFlows_ResumeButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/workflow/MetroFlows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MetroFlows_ResumeAllButton extends ClickableActionElement {
        public MetroFlows_ResumeAllButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/workflow/MetroFlows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MetroFlows_ResumeButton extends ClickableActionElement {
        public MetroFlows_ResumeButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlows_UpLink extends ClickableActionElement {
    public MetroFlows_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}