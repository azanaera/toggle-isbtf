package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.InternalTools.InternalTools_UpLink;
import pcftest.InternalTools._Paging;
import pcftest.InternalTools.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/InternalTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InternalTools extends PCFLocation {
  public final static String CHECKSUM = "4d33b27b5d20fdaec2c52baaee147b81";
  
  public InternalTools(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InternalTools"));
  }
  
  public InternalTools_UpLink getInternalTools_UpLink() {
    return getOrCreateProperty("InternalTools_UpLink", "InternalTools_UpLink", null, pcftest.InternalTools.InternalTools_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InternalTools._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InternalTools.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/InternalTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InternalTools_UpLink extends ClickableActionElement {
    public InternalTools_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/InternalTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/InternalTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}