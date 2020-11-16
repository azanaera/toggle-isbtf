package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSearchScreen.ClaimSearchResultsLV_tb;
import pcftest.ClaimSearchScreen.ClaimSearchResultsLV_tb.ClaimSearchScreen_AssignButton;
import pcftest.ClaimSearchScreen.ClaimSearchResultsLV_tb.ClaimSearchScreen_PrintButton;
import pcftest.ClaimSearchScreen.ClaimSearchResultsLV_tb.ClaimSearchScreen_RetrieveButton;
import pcftest.ClaimSearchScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/ClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchScreen extends PCFElement {
  public final static String CHECKSUM = "02fe0c160d3ad58bc8563d65433eb772";
  
  public ClaimSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSearchDV getClaimSearchDV() {
    return getOrCreateProperty("ClaimSearchDV", "ClaimSearchDV", null, pcftest.ClaimSearchDV.class);
  }
  
  public ClaimSearchResultsLV_active getClaimSearchResultsLV_active() {
    return getOrCreateProperty("ClaimSearchResultsLV_active", "ClaimSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSearchResultsLV_active.class);
  }
  
  public ClaimSearchResultsLV_archived getClaimSearchResultsLV_archived() {
    return getOrCreateProperty("ClaimSearchResultsLV_archived", "ClaimSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSearchResultsLV_archived.class);
  }
  
  public ClaimSearchResultsLV_tb getClaimSearchResultsLV_tb() {
    return getOrCreateProperty("ClaimSearchResultsLV_tb", "ClaimSearchResultsLV_tb", null, pcftest.ClaimSearchScreen.ClaimSearchResultsLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSearchScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchResultsLV_tb extends PCFElement {
    public ClaimSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSearchScreen_AssignButton getClaimSearchScreen_AssignButton() {
      return getOrCreateProperty("ClaimSearchScreen_AssignButton", "ClaimSearchScreen_AssignButton", null, pcftest.ClaimSearchScreen.ClaimSearchResultsLV_tb.ClaimSearchScreen_AssignButton.class);
    }
    
    public ClaimSearchScreen_PrintButton getClaimSearchScreen_PrintButton() {
      return getOrCreateProperty("ClaimSearchScreen_PrintButton", "ClaimSearchScreen_PrintButton", null, pcftest.ClaimSearchScreen.ClaimSearchResultsLV_tb.ClaimSearchScreen_PrintButton.class);
    }
    
    public ClaimSearchScreen_RetrieveButton getClaimSearchScreen_RetrieveButton() {
      return getOrCreateProperty("ClaimSearchScreen_RetrieveButton", "ClaimSearchScreen_RetrieveButton", null, pcftest.ClaimSearchScreen.ClaimSearchResultsLV_tb.ClaimSearchScreen_RetrieveButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchScreen_AssignButton extends ClickableActionElement {
      public ClaimSearchScreen_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchScreen_PrintButton extends ClickableActionElement {
      public ClaimSearchScreen_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/ClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchScreen_RetrieveButton extends ClickableActionElement {
      public ClaimSearchScreen_RetrieveButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/ClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}