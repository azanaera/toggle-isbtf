package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContextHelp.ContextHelp_UpLink;
import pcftest.ContextHelp._Paging;
import pcftest.ContextHelp.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ContextHelp.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContextHelp extends PCFLocation {
  public final static String CHECKSUM = "7ebe0a2e0adf94aefe911e5b6883aab2";
  
  public ContextHelp(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ContextHelp"));
  }
  
  public ContextHelp_UpLink getContextHelp_UpLink() {
    return getOrCreateProperty("ContextHelp_UpLink", "ContextHelp_UpLink", null, pcftest.ContextHelp.ContextHelp_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ContextHelp._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ContextHelp.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContextHelp.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContextHelp_UpLink extends ClickableActionElement {
    public ContextHelp_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContextHelp.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContextHelp.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}