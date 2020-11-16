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
import pcftest.EndUserError.EndUserErrorScreen;
import pcftest.EndUserError.EndUserErrorScreen._msgs;
import pcftest.EndUserError.EndUserError_UpLink;
import pcftest.EndUserError._Paging;
import pcftest.EndUserError.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/EndUserError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EndUserError extends PCFLocation {
  public final static String CHECKSUM = "992ba08cc3d3b1cef4bdddadcbebb749";
  
  public EndUserError(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EndUserError"));
  }
  
  public EndUserErrorScreen getEndUserErrorScreen() {
    return getOrCreateProperty("EndUserErrorScreen", "EndUserErrorScreen", null, pcftest.EndUserError.EndUserErrorScreen.class);
  }
  
  public EndUserError_UpLink getEndUserError_UpLink() {
    return getOrCreateProperty("EndUserError_UpLink", "EndUserError_UpLink", null, pcftest.EndUserError.EndUserError_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EndUserError._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EndUserError.__crumb__.class);
  }
  
  public ErrorGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ErrorGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/EndUserError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndUserErrorScreen extends PCFElement {
    public EndUserErrorScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.EndUserError.EndUserErrorScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/util/EndUserError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/util/EndUserError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndUserError_UpLink extends ClickableActionElement {
    public EndUserError_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/EndUserError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/EndUserError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}