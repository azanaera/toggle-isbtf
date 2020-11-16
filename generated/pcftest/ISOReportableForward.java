package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ISOReportableForward.ISOReportableForward_UpLink;
import pcftest.ISOReportableForward._Paging;
import pcftest.ISOReportableForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/ISOReportableForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ISOReportableForward extends PCFLocation {
  public final static String CHECKSUM = "fbb8ebec53cd50e6a9c995abb2da1b60";
  
  public ISOReportableForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ISOReportableForward"));
  }
  
  public ISOReportableForward_UpLink getISOReportableForward_UpLink() {
    return getOrCreateProperty("ISOReportableForward_UpLink", "ISOReportableForward_UpLink", null, pcftest.ISOReportableForward.ISOReportableForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ISOReportableForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ISOReportableForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ISOReportableForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ISOReportableForward_UpLink extends ClickableActionElement {
    public ISOReportableForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ISOReportableForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ISOReportableForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}