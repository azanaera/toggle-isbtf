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
import pcftest.DesktopClaims.DesktopClaimsScreen;
import pcftest.DesktopClaims.DesktopClaimsScreen.DesktopClaims_AssignButton;
import pcftest.DesktopClaims.DesktopClaimsScreen.DesktopClaims_PrintButton;
import pcftest.DesktopClaims.DesktopClaimsScreen._msgs;
import pcftest.DesktopClaims.DesktopClaims_UpLink;
import pcftest.DesktopClaims._Paging;
import pcftest.DesktopClaims.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/claims/DesktopClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopClaims extends PCFLocation {
  public final static String CHECKSUM = "be34811b80075aeeac6d4fb63b26b27b";
  
  public DesktopClaims(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DesktopClaims"));
  }
  
  public DesktopClaimsScreen getDesktopClaimsScreen() {
    return getOrCreateProperty("DesktopClaimsScreen", "DesktopClaimsScreen", null, pcftest.DesktopClaims.DesktopClaimsScreen.class);
  }
  
  public DesktopClaims_UpLink getDesktopClaims_UpLink() {
    return getOrCreateProperty("DesktopClaims_UpLink", "DesktopClaims_UpLink", null, pcftest.DesktopClaims.DesktopClaims_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DesktopClaims._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DesktopClaims.__crumb__.class);
  }
  
  public Desktop get_parent() {
    return getOrCreateProperty("_parent", pcftest.Desktop.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/claims/DesktopClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopClaimsScreen extends PCFElement {
    public DesktopClaimsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DesktopClaimsLV getDesktopClaimsLV() {
      return getOrCreateProperty("DesktopClaimsLV", "DesktopClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopClaimsLV.class);
    }
    
    public DesktopClaims_AssignButton getDesktopClaims_AssignButton() {
      return getOrCreateProperty("DesktopClaims_AssignButton", "DesktopClaims_AssignButton", null, pcftest.DesktopClaims.DesktopClaimsScreen.DesktopClaims_AssignButton.class);
    }
    
    public DesktopClaims_PrintButton getDesktopClaims_PrintButton() {
      return getOrCreateProperty("DesktopClaims_PrintButton", "DesktopClaims_PrintButton", null, pcftest.DesktopClaims.DesktopClaimsScreen.DesktopClaims_PrintButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DesktopClaims.DesktopClaimsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/claims/DesktopClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopClaims_AssignButton extends ClickableActionElement {
      public DesktopClaims_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/claims/DesktopClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopClaims_PrintButton extends ClickableActionElement {
      public DesktopClaims_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/claims/DesktopClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/claims/DesktopClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopClaims_UpLink extends ClickableActionElement {
    public DesktopClaims_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/claims/DesktopClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/claims/DesktopClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}