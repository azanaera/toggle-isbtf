package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CannotViewClaim.CannotViewClaim_UpLink;
import pcftest.CannotViewClaim.Message;
import pcftest.CannotViewClaim._Paging;
import pcftest.CannotViewClaim.__crumb__;
import pcftest.CannotViewClaim._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/CannotViewClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CannotViewClaim extends PCFLocation {
  public final static String CHECKSUM = "e0c92a5bd7c57e356187f91a7d8173ba";
  
  public CannotViewClaim(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CannotViewClaim"));
  }
  
  public CannotViewClaim_UpLink getCannotViewClaim_UpLink() {
    return getOrCreateProperty("CannotViewClaim_UpLink", "CannotViewClaim_UpLink", null, pcftest.CannotViewClaim.CannotViewClaim_UpLink.class);
  }
  
  public Message getMessage() {
    return getOrCreateProperty("Message", "Message", null, pcftest.CannotViewClaim.Message.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CannotViewClaim._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CannotViewClaim.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CannotViewClaim._msgs.class);
  }
  
  public ClaimMessage get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimMessage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CannotViewClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CannotViewClaim_UpLink extends ClickableActionElement {
    public CannotViewClaim_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CannotViewClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Message extends ValueElement {
    public Message(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CannotViewClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CannotViewClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/CannotViewClaim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}