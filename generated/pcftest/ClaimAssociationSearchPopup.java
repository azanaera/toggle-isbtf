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
import pcftest.ClaimAssociationSearchPopup.ClaimAssociationSearchPopup_UpLink;
import pcftest.ClaimAssociationSearchPopup.ClaimAssociationsSearchScreen;
import pcftest.ClaimAssociationSearchPopup.ClaimAssociationsSearchScreen.ClaimAssociationsSearchResultsLV_tb;
import pcftest.ClaimAssociationSearchPopup.ClaimAssociationsSearchScreen._msgs;
import pcftest.ClaimAssociationSearchPopup._Paging;
import pcftest.ClaimAssociationSearchPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimAssociationSearchPopup extends PCFLocation {
  public final static String CHECKSUM = "4b84d3f101664e1fd05f126c6ce7d9b6";
  
  public ClaimAssociationSearchPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimAssociationSearchPopup"));
  }
  
  public ClaimAssociationSearchPopup_UpLink getClaimAssociationSearchPopup_UpLink() {
    return getOrCreateProperty("ClaimAssociationSearchPopup_UpLink", "ClaimAssociationSearchPopup_UpLink", null, pcftest.ClaimAssociationSearchPopup.ClaimAssociationSearchPopup_UpLink.class);
  }
  
  public ClaimAssociationsSearchScreen getClaimAssociationsSearchScreen() {
    return getOrCreateProperty("ClaimAssociationsSearchScreen", "ClaimAssociationsSearchScreen", null, pcftest.ClaimAssociationSearchPopup.ClaimAssociationsSearchScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimAssociationSearchPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimAssociationSearchPopup.__crumb__.class);
  }
  
  public ClaimAssociations get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimAssociations.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationSearchPopup_UpLink extends ClickableActionElement {
    public ClaimAssociationSearchPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationsSearchScreen extends PCFElement {
    public ClaimAssociationsSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimAssociationSearchDV getClaimAssociationSearchDV() {
      return getOrCreateProperty("ClaimAssociationSearchDV", "ClaimAssociationSearchDV", null, pcftest.ClaimAssociationSearchDV.class);
    }
    
    public ClaimAssociationsSearchResultsLV getClaimAssociationsSearchResultsLV() {
      return getOrCreateProperty("ClaimAssociationsSearchResultsLV", "ClaimAssociationsSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimAssociationsSearchResultsLV.class);
    }
    
    public ClaimAssociationsSearchResultsLV_tb getClaimAssociationsSearchResultsLV_tb() {
      return getOrCreateProperty("ClaimAssociationsSearchResultsLV_tb", "ClaimAssociationsSearchResultsLV_tb", null, pcftest.ClaimAssociationSearchPopup.ClaimAssociationsSearchScreen.ClaimAssociationsSearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimAssociationSearchPopup.ClaimAssociationsSearchScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimAssociationsSearchResultsLV_tb extends PCFElement {
      public ClaimAssociationsSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}