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
import pcftest.ClaimFinancialsChecks.ClaimFinancialsChecksScreen;
import pcftest.ClaimFinancialsChecks.ClaimFinancialsChecksScreen._msgs;
import pcftest.ClaimFinancialsChecks.ClaimFinancialsChecks_UpLink;
import pcftest.ClaimFinancialsChecks._Paging;
import pcftest.ClaimFinancialsChecks.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFinancialsChecks extends PCFLocation {
  public final static String CHECKSUM = "d4e48397ad3c62aea6980926b76cdb6d";
  
  public ClaimFinancialsChecks(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimFinancialsChecks"));
  }
  
  public ClaimFinancialsChecksScreen getClaimFinancialsChecksScreen() {
    return getOrCreateProperty("ClaimFinancialsChecksScreen", "ClaimFinancialsChecksScreen", null, pcftest.ClaimFinancialsChecks.ClaimFinancialsChecksScreen.class);
  }
  
  public ClaimFinancialsChecks_UpLink getClaimFinancialsChecks_UpLink() {
    return getOrCreateProperty("ClaimFinancialsChecks_UpLink", "ClaimFinancialsChecks_UpLink", null, pcftest.ClaimFinancialsChecks.ClaimFinancialsChecks_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimFinancialsChecks._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimFinancialsChecks.__crumb__.class);
  }
  
  public ClaimFinancialsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsChecksScreen extends PCFElement {
    public ClaimFinancialsChecksScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ChecksLV getChecksLV() {
      return getOrCreateProperty("ChecksLV", "ChecksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ChecksLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimFinancialsChecks.ClaimFinancialsChecksScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsChecks_UpLink extends ClickableActionElement {
    public ClaimFinancialsChecks_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}