package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Login.LoginScreen;
import pcftest.Login.LoginScreen._msgs;
import pcftest.Login.Login_UpLink;
import pcftest.Login._Paging;
import pcftest.Login.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/Login.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Login extends PCFLocation {
  public final static String CHECKSUM = "2597feb531b6e55dc0a10164fcb28c9f";
  
  public Login(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Login"));
  }
  
  public LoginScreen getLoginScreen() {
    return getOrCreateProperty("LoginScreen", "LoginScreen", null, pcftest.Login.LoginScreen.class);
  }
  
  public Login_UpLink getLogin_UpLink() {
    return getOrCreateProperty("Login_UpLink", "Login_UpLink", null, pcftest.Login.Login_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Login._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Login.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Login.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoginScreen extends PCFElement {
    public LoginScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LoginDV getLoginDV() {
      return getOrCreateProperty("LoginDV", "LoginDV", null, pcftest.LoginDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Login.LoginScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/util/Login.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Login.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Login_UpLink extends ClickableActionElement {
    public Login_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Login.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Login.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}