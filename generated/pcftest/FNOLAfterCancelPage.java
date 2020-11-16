package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLAfterCancelPage.FNOLAfterCancelPage_UpLink;
import pcftest.FNOLAfterCancelPage._Paging;
import pcftest.FNOLAfterCancelPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/FNOLAfterCancelPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLAfterCancelPage extends PCFLocation {
  public final static String CHECKSUM = "8384cf641666086e0b56afc2ff82c3f8";
  
  public FNOLAfterCancelPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FNOLAfterCancelPage"));
  }
  
  public FNOLAfterCancelPage_UpLink getFNOLAfterCancelPage_UpLink() {
    return getOrCreateProperty("FNOLAfterCancelPage_UpLink", "FNOLAfterCancelPage_UpLink", null, pcftest.FNOLAfterCancelPage.FNOLAfterCancelPage_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FNOLAfterCancelPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FNOLAfterCancelPage.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/FNOLAfterCancelPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLAfterCancelPage_UpLink extends ClickableActionElement {
    public FNOLAfterCancelPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/FNOLAfterCancelPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/FNOLAfterCancelPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}