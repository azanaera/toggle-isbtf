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
import pcftest.MetroFlowDetail.MetroFlowDetailScreen;
import pcftest.MetroFlowDetail.MetroFlowDetailScreen.MetroFlowDetail_PreciousButton;
import pcftest.MetroFlowDetail.MetroFlowDetailScreen.MetroFlowDetail_RefreshButtonButton;
import pcftest.MetroFlowDetail.MetroFlowDetailScreen.MetroFlowDetail_ResumeButton;
import pcftest.MetroFlowDetail.MetroFlowDetailScreen.MetroFlowDetail_SuspendButton;
import pcftest.MetroFlowDetail.MetroFlowDetailScreen._msgs;
import pcftest.MetroFlowDetail.MetroFlowDetail_UpLink;
import pcftest.MetroFlowDetail._Paging;
import pcftest.MetroFlowDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlowDetail extends PCFLocation {
  public final static String CHECKSUM = "3697bae214d2e90334fd58b5fb4b6984";
  
  public MetroFlowDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MetroFlowDetail"));
  }
  
  public MetroFlowDetailScreen getMetroFlowDetailScreen() {
    return getOrCreateProperty("MetroFlowDetailScreen", "MetroFlowDetailScreen", null, pcftest.MetroFlowDetail.MetroFlowDetailScreen.class);
  }
  
  public MetroFlowDetail_UpLink getMetroFlowDetail_UpLink() {
    return getOrCreateProperty("MetroFlowDetail_UpLink", "MetroFlowDetail_UpLink", null, pcftest.MetroFlowDetail.MetroFlowDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MetroFlowDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MetroFlowDetail.__crumb__.class);
  }
  
  public MetroFlows get_parent() {
    return getOrCreateProperty("_parent", pcftest.MetroFlows.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowDetailScreen extends PCFElement {
    public MetroFlowDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MetroFlowDetailDV getMetroFlowDetailDV() {
      return getOrCreateProperty("MetroFlowDetailDV", "MetroFlowDetailDV", null, pcftest.MetroFlowDetailDV.class);
    }
    
    public MetroFlowDetail_PreciousButton getMetroFlowDetail_PreciousButton() {
      return getOrCreateProperty("MetroFlowDetail_PreciousButton", "MetroFlowDetail_PreciousButton", null, pcftest.MetroFlowDetail.MetroFlowDetailScreen.MetroFlowDetail_PreciousButton.class);
    }
    
    public MetroFlowDetail_RefreshButtonButton getMetroFlowDetail_RefreshButtonButton() {
      return getOrCreateProperty("MetroFlowDetail_RefreshButtonButton", "MetroFlowDetail_RefreshButtonButton", null, pcftest.MetroFlowDetail.MetroFlowDetailScreen.MetroFlowDetail_RefreshButtonButton.class);
    }
    
    public MetroFlowDetail_ResumeButton getMetroFlowDetail_ResumeButton() {
      return getOrCreateProperty("MetroFlowDetail_ResumeButton", "MetroFlowDetail_ResumeButton", null, pcftest.MetroFlowDetail.MetroFlowDetailScreen.MetroFlowDetail_ResumeButton.class);
    }
    
    public MetroFlowDetail_SuspendButton getMetroFlowDetail_SuspendButton() {
      return getOrCreateProperty("MetroFlowDetail_SuspendButton", "MetroFlowDetail_SuspendButton", null, pcftest.MetroFlowDetail.MetroFlowDetailScreen.MetroFlowDetail_SuspendButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MetroFlowDetail.MetroFlowDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroFlowDetail_PreciousButton extends ClickableActionElement {
      public MetroFlowDetail_PreciousButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MetroFlows click() {
        return clickThis(pcftest.MetroFlows.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroFlowDetail_RefreshButtonButton extends ClickableActionElement {
      public MetroFlowDetail_RefreshButtonButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroFlowDetail_ResumeButton extends ClickableActionElement {
      public MetroFlowDetail_ResumeButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroFlowDetail_SuspendButton extends ClickableActionElement {
      public MetroFlowDetail_SuspendButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowDetail_UpLink extends ClickableActionElement {
    public MetroFlowDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}