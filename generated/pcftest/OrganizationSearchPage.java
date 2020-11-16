package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OrganizationSearchPage.OrganizationSearchPage_UpLink;
import pcftest.OrganizationSearchPage._Paging;
import pcftest.OrganizationSearchPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationSearchPage extends PCFLocation {
  public final static String CHECKSUM = "226a828f2f370b95603172cc769a693b";
  
  public OrganizationSearchPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OrganizationSearchPage"));
  }
  
  public OrganizationSearchPage_UpLink getOrganizationSearchPage_UpLink() {
    return getOrCreateProperty("OrganizationSearchPage_UpLink", "OrganizationSearchPage_UpLink", null, pcftest.OrganizationSearchPage.OrganizationSearchPage_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OrganizationSearchPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OrganizationSearchPage.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationSearchPage_UpLink extends ClickableActionElement {
    public OrganizationSearchPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}