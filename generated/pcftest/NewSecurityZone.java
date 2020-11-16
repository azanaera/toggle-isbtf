package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewSecurityZone.NewSecurityZone_UpLink;
import pcftest.NewSecurityZone._Paging;
import pcftest.NewSecurityZone.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/securityzones/NewSecurityZone.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewSecurityZone extends PCFLocation {
  public final static String CHECKSUM = "5cfde519f9509fc1489d87ad1e8e54cc";
  
  public NewSecurityZone(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewSecurityZone"));
  }
  
  public NewSecurityZone_UpLink getNewSecurityZone_UpLink() {
    return getOrCreateProperty("NewSecurityZone_UpLink", "NewSecurityZone_UpLink", null, pcftest.NewSecurityZone.NewSecurityZone_UpLink.class);
  }
  
  public SecurityZoneDetailScreen getSecurityZoneDetailScreen() {
    return getOrCreateProperty("SecurityZoneDetailScreen", "SecurityZoneDetailScreen", null, pcftest.SecurityZoneDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewSecurityZone._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewSecurityZone.__crumb__.class);
  }
  
  public SecurityZones get_parent() {
    return getOrCreateProperty("_parent", pcftest.SecurityZones.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/securityzones/NewSecurityZone.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewSecurityZone_UpLink extends ClickableActionElement {
    public NewSecurityZone_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/securityzones/NewSecurityZone.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/securityzones/NewSecurityZone.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}