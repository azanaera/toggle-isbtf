package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Authority.Authority_UpLink;
import pcftest.Authority._Paging;
import pcftest.Authority.__crumb__;
import pcftest.Authority._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/usersandsecurity/Authority.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Authority extends PCFLocation {
  public final static String CHECKSUM = "04f6d37273be6f06d37e906449c01062";
  
  public Authority(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Authority"));
  }
  
  public Authority_UpLink getAuthority_UpLink() {
    return getOrCreateProperty("Authority_UpLink", "Authority_UpLink", null, pcftest.Authority.Authority_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Authority._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Authority.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Authority._msgs.class);
  }
  
  public UsersAndSecurity get_parent() {
    return getOrCreateProperty("_parent", pcftest.UsersAndSecurity.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Authority.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Authority_UpLink extends ClickableActionElement {
    public Authority_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Authority.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Authority.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Authority.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}