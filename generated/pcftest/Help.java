package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Help.Help_UpLink;
import pcftest.Help._Paging;
import pcftest.Help.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/exitpoints/Help.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Help extends PCFLocation {
  public final static String CHECKSUM = "224e369c229faa5a4fadb60196d44ed8";
  
  public Help(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Help"));
  }
  
  public Help_UpLink getHelp_UpLink() {
    return getOrCreateProperty("Help_UpLink", "Help_UpLink", null, pcftest.Help.Help_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Help._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Help.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/Help.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Help_UpLink extends ClickableActionElement {
    public Help_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/Help.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/Help.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}