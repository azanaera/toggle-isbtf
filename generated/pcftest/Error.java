package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Error.ErrorScreen;
import pcftest.Error.ErrorScreen.ErrorScreenDV;
import pcftest.Error.Error_UpLink;
import pcftest.Error._Paging;
import pcftest.Error.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/Error.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Error extends PCFLocation {
  public final static String CHECKSUM = "ebf4c2c387342080fb43a712ff8a43df";
  
  public Error(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Error"));
  }
  
  public ErrorScreen getErrorScreen() {
    return getOrCreateProperty("ErrorScreen", "ErrorScreen", null, pcftest.Error.ErrorScreen.class);
  }
  
  public Error_UpLink getError_UpLink() {
    return getOrCreateProperty("Error_UpLink", "Error_UpLink", null, pcftest.Error.Error_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Error._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Error.__crumb__.class);
  }
  
  public ErrorGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ErrorGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Error.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ErrorScreen extends PCFElement {
    public ErrorScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ErrorScreenDV getErrorScreenDV() {
      return getOrCreateProperty("ErrorScreenDV", "ErrorScreenDV", null, pcftest.Error.ErrorScreen.ErrorScreenDV.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/util/Error.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ErrorScreenDV extends DetailViewElement {
      public ErrorScreenDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getException() {
        return getOrCreateProperty("Exception", "Exception", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getStackTrace() {
        return getOrCreateProperty("StackTrace", "StackTrace", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Error.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Error_UpLink extends ClickableActionElement {
    public Error_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Error.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Error.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}