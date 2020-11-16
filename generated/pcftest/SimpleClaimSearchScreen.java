package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SimpleClaimSearchScreen.SimpleClaimSearchResultsLV_tb;
import pcftest.SimpleClaimSearchScreen.SimpleClaimSearchResultsLV_tb.ClaimSearchScreen_AssignButton;
import pcftest.SimpleClaimSearchScreen.SimpleClaimSearchResultsLV_tb.SimpleClaimSearchScreen_PrintButton;
import pcftest.SimpleClaimSearchScreen.SimpleClaimSearchResultsLV_tb.archiveSearchLink;
import pcftest.SimpleClaimSearchScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SimpleClaimSearchScreen extends PCFElement {
  public final static String CHECKSUM = "d74bdad314ad6815db8cb286bc837b7b";
  
  public SimpleClaimSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SimpleClaimSearchDV getSimpleClaimSearchDV() {
    return getOrCreateProperty("SimpleClaimSearchDV", "SimpleClaimSearchDV", null, pcftest.SimpleClaimSearchDV.class);
  }
  
  public SimpleClaimSearchResultsLV getSimpleClaimSearchResultsLV() {
    return getOrCreateProperty("SimpleClaimSearchResultsLV", "SimpleClaimSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SimpleClaimSearchResultsLV.class);
  }
  
  public SimpleClaimSearchResultsLV_tb getSimpleClaimSearchResultsLV_tb() {
    return getOrCreateProperty("SimpleClaimSearchResultsLV_tb", "SimpleClaimSearchResultsLV_tb", null, pcftest.SimpleClaimSearchScreen.SimpleClaimSearchResultsLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SimpleClaimSearchScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleClaimSearchResultsLV_tb extends PCFElement {
    public SimpleClaimSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSearchScreen_AssignButton getClaimSearchScreen_AssignButton() {
      return getOrCreateProperty("ClaimSearchScreen_AssignButton", "ClaimSearchScreen_AssignButton", null, pcftest.SimpleClaimSearchScreen.SimpleClaimSearchResultsLV_tb.ClaimSearchScreen_AssignButton.class);
    }
    
    public SimpleClaimSearchScreen_PrintButton getSimpleClaimSearchScreen_PrintButton() {
      return getOrCreateProperty("SimpleClaimSearchScreen_PrintButton", "SimpleClaimSearchScreen_PrintButton", null, pcftest.SimpleClaimSearchScreen.SimpleClaimSearchResultsLV_tb.SimpleClaimSearchScreen_PrintButton.class);
    }
    
    public archiveSearchLink getarchiveSearchLink() {
      return getOrCreateProperty("archiveSearchLink", "archiveSearchLink", null, pcftest.SimpleClaimSearchScreen.SimpleClaimSearchResultsLV_tb.archiveSearchLink.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchScreen_AssignButton extends ClickableActionElement {
      public ClaimSearchScreen_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SimpleClaimSearchScreen_PrintButton extends ClickableActionElement {
      public SimpleClaimSearchScreen_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class archiveSearchLink extends ValueElement {
      public archiveSearchLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/SimpleClaimSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}