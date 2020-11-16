package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FreeTextClaimSearchScreen.FreeTextClaimSearchResultsLV_tb;
import pcftest.FreeTextClaimSearchScreen.FreeTextClaimSearchResultsLV_tb.ClaimSearchScreen_AssignButton;
import pcftest.FreeTextClaimSearchScreen.FreeTextClaimSearchResultsLV_tb.ClaimSearchScreen_PrintButton;
import pcftest.FreeTextClaimSearchScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FreeTextClaimSearchScreen extends PCFElement {
  public final static String CHECKSUM = "e267d94e980e3b026a423881eb4ce626";
  
  public FreeTextClaimSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FreeTextClaimSearchDV getFreeTextClaimSearchDV() {
    return getOrCreateProperty("FreeTextClaimSearchDV", "FreeTextClaimSearchDV", null, pcftest.FreeTextClaimSearchDV.class);
  }
  
  public FreeTextClaimSearchResultsLV getFreeTextClaimSearchResultsLV() {
    return getOrCreateProperty("FreeTextClaimSearchResultsLV", "FreeTextClaimSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FreeTextClaimSearchResultsLV.class);
  }
  
  public FreeTextClaimSearchResultsLV_tb getFreeTextClaimSearchResultsLV_tb() {
    return getOrCreateProperty("FreeTextClaimSearchResultsLV_tb", "FreeTextClaimSearchResultsLV_tb", null, pcftest.FreeTextClaimSearchScreen.FreeTextClaimSearchResultsLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FreeTextClaimSearchScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FreeTextClaimSearchResultsLV_tb extends PCFElement {
    public FreeTextClaimSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSearchScreen_AssignButton getClaimSearchScreen_AssignButton() {
      return getOrCreateProperty("ClaimSearchScreen_AssignButton", "ClaimSearchScreen_AssignButton", null, pcftest.FreeTextClaimSearchScreen.FreeTextClaimSearchResultsLV_tb.ClaimSearchScreen_AssignButton.class);
    }
    
    public ClaimSearchScreen_PrintButton getClaimSearchScreen_PrintButton() {
      return getOrCreateProperty("ClaimSearchScreen_PrintButton", "ClaimSearchScreen_PrintButton", null, pcftest.FreeTextClaimSearchScreen.FreeTextClaimSearchResultsLV_tb.ClaimSearchScreen_PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchScreen_AssignButton extends ClickableActionElement {
      public ClaimSearchScreen_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchScreen_PrintButton extends ClickableActionElement {
      public ClaimSearchScreen_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}