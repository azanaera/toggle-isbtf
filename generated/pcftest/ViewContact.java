package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ViewContact.ViewContact_UpLink;
import pcftest.ViewContact._Paging;
import pcftest.ViewContact.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/exitpoints/ViewContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ViewContact extends PCFLocation {
  public final static String CHECKSUM = "1007b7f0138789a9ba3f3881b06a5263";
  
  public ViewContact(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ViewContact"));
  }
  
  public ViewContact_UpLink getViewContact_UpLink() {
    return getOrCreateProperty("ViewContact_UpLink", "ViewContact_UpLink", null, pcftest.ViewContact.ViewContact_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ViewContact._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ViewContact.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/ViewContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewContact_UpLink extends ClickableActionElement {
    public ViewContact_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/ViewContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/ViewContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}