package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ViewPolicy.ViewPolicy_UpLink;
import pcftest.ViewPolicy._Paging;
import pcftest.ViewPolicy.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/exitpoints/ViewPolicy.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ViewPolicy extends PCFLocation {
  public final static String CHECKSUM = "3ff00de267c1806a948fc66625480a0a";
  
  public ViewPolicy(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ViewPolicy"));
  }
  
  public ViewPolicy_UpLink getViewPolicy_UpLink() {
    return getOrCreateProperty("ViewPolicy_UpLink", "ViewPolicy_UpLink", null, pcftest.ViewPolicy.ViewPolicy_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ViewPolicy._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ViewPolicy.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/ViewPolicy.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewPolicy_UpLink extends ClickableActionElement {
    public ViewPolicy_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/ViewPolicy.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/ViewPolicy.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}