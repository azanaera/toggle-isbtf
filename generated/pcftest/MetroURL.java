package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MetroURL.MetroURL_UpLink;
import pcftest.MetroURL._Paging;
import pcftest.MetroURL.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/exitpoints/MetroURL.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroURL extends PCFLocation {
  public final static String CHECKSUM = "a645fe715b1c230e6e991c53bd7e225b";
  
  public MetroURL(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MetroURL"));
  }
  
  public MetroURL_UpLink getMetroURL_UpLink() {
    return getOrCreateProperty("MetroURL_UpLink", "MetroURL_UpLink", null, pcftest.MetroURL.MetroURL_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MetroURL._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MetroURL.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/MetroURL.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroURL_UpLink extends ClickableActionElement {
    public MetroURL_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/MetroURL.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/MetroURL.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}