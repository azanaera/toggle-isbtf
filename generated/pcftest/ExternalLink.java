package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExternalLink.ExternalLink_UpLink;
import pcftest.ExternalLink._Paging;
import pcftest.ExternalLink.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/ExternalLink.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExternalLink extends PCFLocation {
  public final static String CHECKSUM = "b331d1e997be7f63f538751babff8278";
  
  public ExternalLink(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ExternalLink"));
  }
  
  public ExternalLink_UpLink getExternalLink_UpLink() {
    return getOrCreateProperty("ExternalLink_UpLink", "ExternalLink_UpLink", null, pcftest.ExternalLink.ExternalLink_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ExternalLink._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ExternalLink.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ExternalLink.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExternalLink_UpLink extends ClickableActionElement {
    public ExternalLink_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ExternalLink.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ExternalLink.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}