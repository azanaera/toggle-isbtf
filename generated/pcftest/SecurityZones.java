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
import pcftest.SecurityZones.SecurityZonesScreen;
import pcftest.SecurityZones.SecurityZonesScreen.SecurityZones_AddSecurityZoneButton;
import pcftest.SecurityZones.SecurityZonesScreen._msgs;
import pcftest.SecurityZones.SecurityZones_UpLink;
import pcftest.SecurityZones._Paging;
import pcftest.SecurityZones.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/usersandsecurity/SecurityZones.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SecurityZones extends PCFLocation {
  public final static String CHECKSUM = "b3b9fa860b7d7098abba70a43ccea40d";
  
  public SecurityZones(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SecurityZones"));
  }
  
  public SecurityZonesScreen getSecurityZonesScreen() {
    return getOrCreateProperty("SecurityZonesScreen", "SecurityZonesScreen", null, pcftest.SecurityZones.SecurityZonesScreen.class);
  }
  
  public SecurityZones_UpLink getSecurityZones_UpLink() {
    return getOrCreateProperty("SecurityZones_UpLink", "SecurityZones_UpLink", null, pcftest.SecurityZones.SecurityZones_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SecurityZones._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SecurityZones.__crumb__.class);
  }
  
  public UsersAndSecurity get_parent() {
    return getOrCreateProperty("_parent", pcftest.UsersAndSecurity.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/SecurityZones.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityZonesScreen extends PCFElement {
    public SecurityZonesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SecurityZonesLV getSecurityZonesLV() {
      return getOrCreateProperty("SecurityZonesLV", "SecurityZonesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SecurityZonesLV.class);
    }
    
    public SecurityZones_AddSecurityZoneButton getSecurityZones_AddSecurityZoneButton() {
      return getOrCreateProperty("SecurityZones_AddSecurityZoneButton", "SecurityZones_AddSecurityZoneButton", null, pcftest.SecurityZones.SecurityZonesScreen.SecurityZones_AddSecurityZoneButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SecurityZones.SecurityZonesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/SecurityZones.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SecurityZones_AddSecurityZoneButton extends ClickableActionElement {
      public SecurityZones_AddSecurityZoneButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewSecurityZone click() {
        return clickThis(pcftest.NewSecurityZone.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/SecurityZones.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/SecurityZones.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityZones_UpLink extends ClickableActionElement {
    public SecurityZones_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/SecurityZones.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/SecurityZones.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}