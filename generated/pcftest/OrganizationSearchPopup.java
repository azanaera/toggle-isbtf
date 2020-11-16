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
import pcftest.OrganizationSearchPopup.OrganizationSearchPopupScreen;
import pcftest.OrganizationSearchPopup.OrganizationSearchPopupScreen.OrganizationSearchResultsLV_tb;
import pcftest.OrganizationSearchPopup.OrganizationSearchPopupScreen._msgs;
import pcftest.OrganizationSearchPopup.OrganizationSearchPopup_UpLink;
import pcftest.OrganizationSearchPopup._Paging;
import pcftest.OrganizationSearchPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationSearchPopup extends PCFLocation {
  public final static String CHECKSUM = "f415de8f62cb3f8875ba0faad5c630fb";
  
  public OrganizationSearchPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OrganizationSearchPopup"));
  }
  
  public OrganizationSearchPopupScreen getOrganizationSearchPopupScreen() {
    return getOrCreateProperty("OrganizationSearchPopupScreen", "OrganizationSearchPopupScreen", null, pcftest.OrganizationSearchPopup.OrganizationSearchPopupScreen.class);
  }
  
  public OrganizationSearchPopup_UpLink getOrganizationSearchPopup_UpLink() {
    return getOrCreateProperty("OrganizationSearchPopup_UpLink", "OrganizationSearchPopup_UpLink", null, pcftest.OrganizationSearchPopup.OrganizationSearchPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OrganizationSearchPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OrganizationSearchPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationSearchPopupScreen extends PCFElement {
    public OrganizationSearchPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OrganizationSearchDV getOrganizationSearchDV() {
      return getOrCreateProperty("OrganizationSearchDV", "OrganizationSearchDV", null, pcftest.OrganizationSearchDV.class);
    }
    
    public OrganizationSearchResultsLV getOrganizationSearchResultsLV() {
      return getOrCreateProperty("OrganizationSearchResultsLV", "OrganizationSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OrganizationSearchResultsLV.class);
    }
    
    public OrganizationSearchResultsLV_tb getOrganizationSearchResultsLV_tb() {
      return getOrCreateProperty("OrganizationSearchResultsLV_tb", "OrganizationSearchResultsLV_tb", null, pcftest.OrganizationSearchPopup.OrganizationSearchPopupScreen.OrganizationSearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OrganizationSearchPopup.OrganizationSearchPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OrganizationSearchResultsLV_tb extends PCFElement {
      public OrganizationSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationSearchPopup_UpLink extends ClickableActionElement {
    public OrganizationSearchPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/organizationsearch/OrganizationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}