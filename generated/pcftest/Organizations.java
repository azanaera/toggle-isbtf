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
import pcftest.Organizations.OrganizationsScreen;
import pcftest.Organizations.OrganizationsScreen._msgs;
import pcftest.Organizations.Organizations_UpLink;
import pcftest.Organizations._Paging;
import pcftest.Organizations.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/Organizations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Organizations extends PCFLocation {
  public final static String CHECKSUM = "0bfd869c5ee0f6ef8045e484e54842fd";
  
  public Organizations(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Organizations"));
  }
  
  public OrganizationsScreen getOrganizationsScreen() {
    return getOrCreateProperty("OrganizationsScreen", "OrganizationsScreen", null, pcftest.Organizations.OrganizationsScreen.class);
  }
  
  public Organizations_UpLink getOrganizations_UpLink() {
    return getOrCreateProperty("Organizations_UpLink", "Organizations_UpLink", null, pcftest.Organizations.Organizations_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Organizations._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Organizations.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/Organizations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationsScreen extends PCFElement {
    public OrganizationsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OrganizationsLV getOrganizationsLV() {
      return getOrCreateProperty("OrganizationsLV", "OrganizationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OrganizationsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Organizations.OrganizationsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/Organizations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/Organizations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Organizations_UpLink extends ClickableActionElement {
    public Organizations_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/Organizations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/Organizations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}