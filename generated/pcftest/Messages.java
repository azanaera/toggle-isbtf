package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Messages.Messages_UpLink;
import pcftest.Messages._Paging;
import pcftest.Messages.__crumb__;
import pcftest.Messages._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/monitoring/Messages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Messages extends PCFLocation {
  public final static String CHECKSUM = "ad7cbe6799a33dab204d410981ef26d4";
  
  public Messages(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Messages"));
  }
  
  public Messages_UpLink getMessages_UpLink() {
    return getOrCreateProperty("Messages_UpLink", "Messages_UpLink", null, pcftest.Messages.Messages_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Messages._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Messages.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Messages._msgs.class);
  }
  
  public Monitoring get_parent() {
    return getOrCreateProperty("_parent", pcftest.Monitoring.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/monitoring/Messages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Messages_UpLink extends ClickableActionElement {
    public Messages_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/monitoring/Messages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/monitoring/Messages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/monitoring/Messages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}