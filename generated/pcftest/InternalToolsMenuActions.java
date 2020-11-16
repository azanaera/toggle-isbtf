package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.InternalToolsMenuActions.InternalToolsMenuActions_Logout;
import pcftest.InternalToolsMenuActions.ReturnToApp;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/InternalToolsMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InternalToolsMenuActions extends PCFElement {
  public final static String CHECKSUM = "9fa36976b184ee470b6e94758316e025";
  
  public InternalToolsMenuActions(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public InternalToolsMenuActions_Logout getInternalToolsMenuActions_Logout() {
    return getOrCreateProperty("InternalToolsMenuActions_Logout", "InternalToolsMenuActions_Logout", null, pcftest.InternalToolsMenuActions.InternalToolsMenuActions_Logout.class);
  }
  
  public ReturnToApp getReturnToApp() {
    return getOrCreateProperty("ReturnToApp", "ReturnToApp", null, pcftest.InternalToolsMenuActions.ReturnToApp.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/InternalToolsMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InternalToolsMenuActions_Logout extends ClickableActionElement {
    public InternalToolsMenuActions_Logout(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/InternalToolsMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReturnToApp extends ClickableActionElement {
    public ReturnToApp(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}