package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SecurityZoneDetail.SecurityZoneDetail_UpLink;
import pcftest.SecurityZoneDetail._Paging;
import pcftest.SecurityZoneDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/securityzones/SecurityZoneDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SecurityZoneDetail extends PCFLocation {
  public final static String CHECKSUM = "7889c7e326c8589b548f37a63573651f";
  
  public SecurityZoneDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SecurityZoneDetail"));
  }
  
  public SecurityZoneDetailScreen getSecurityZoneDetailScreen() {
    return getOrCreateProperty("SecurityZoneDetailScreen", "SecurityZoneDetailScreen", null, pcftest.SecurityZoneDetailScreen.class);
  }
  
  public SecurityZoneDetail_UpLink getSecurityZoneDetail_UpLink() {
    return getOrCreateProperty("SecurityZoneDetail_UpLink", "SecurityZoneDetail_UpLink", null, pcftest.SecurityZoneDetail.SecurityZoneDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SecurityZoneDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SecurityZoneDetail.__crumb__.class);
  }
  
  public SecurityZones get_parent() {
    return getOrCreateProperty("_parent", pcftest.SecurityZones.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/securityzones/SecurityZoneDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityZoneDetail_UpLink extends ClickableActionElement {
    public SecurityZoneDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/securityzones/SecurityZoneDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/securityzones/SecurityZoneDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}