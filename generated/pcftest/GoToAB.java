package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GoToAB.GoToAB_UpLink;
import pcftest.GoToAB._Paging;
import pcftest.GoToAB.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/exitpoints/GoToAB.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GoToAB extends PCFLocation {
  public final static String CHECKSUM = "97fc00a5f5a1b422257d411998685a9d";
  
  public GoToAB(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("GoToAB"));
  }
  
  public GoToAB_UpLink getGoToAB_UpLink() {
    return getOrCreateProperty("GoToAB_UpLink", "GoToAB_UpLink", null, pcftest.GoToAB.GoToAB_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.GoToAB._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.GoToAB.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/GoToAB.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GoToAB_UpLink extends ClickableActionElement {
    public GoToAB_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/GoToAB.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/GoToAB.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}