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
import pcftest.CatastropheSearchScreen.ClaimsTab;
import pcftest.CatastropheSearchScreen.PolicyLocationSearchResultsLV_tb;
import pcftest.CatastropheSearchScreen.PolicyTab;
import pcftest.CatastropheSearchScreen.SimpleClaimSearchResultsLV_tb;
import pcftest.CatastropheSearchScreen.SimpleClaimSearchResultsLV_tb.ClaimSearchScreen_AssignButton;
import pcftest.CatastropheSearchScreen.SimpleClaimSearchResultsLV_tb.SimpleClaimSearchScreen_PrintButton;
import pcftest.CatastropheSearchScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/CatastropheSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheSearchScreen extends PCFElement {
  public final static String CHECKSUM = "2056e827f66062305711261fac181599";
  
  public CatastropheSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CatastropheHeatMapFilterPanelSet getCatastropheHeatMapFilterPanelSet() {
    return getOrCreateProperty("CatastropheHeatMapFilterPanelSet", "CatastropheHeatMapFilterPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.CatastropheHeatMapFilterPanelSet.class);
  }
  
  public ClaimsTab getClaimsTab() {
    return getOrCreateProperty("ClaimsTab", "ClaimsTab", null, pcftest.CatastropheSearchScreen.ClaimsTab.class);
  }
  
  public PolicyLocationSearchResultsLV getPolicyLocationSearchResultsLV() {
    return getOrCreateProperty("PolicyLocationSearchResultsLV", "PolicyLocationSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicyLocationSearchResultsLV.class);
  }
  
  public PolicyLocationSearchResultsLV_tb getPolicyLocationSearchResultsLV_tb() {
    return getOrCreateProperty("PolicyLocationSearchResultsLV_tb", "PolicyLocationSearchResultsLV_tb", null, pcftest.CatastropheSearchScreen.PolicyLocationSearchResultsLV_tb.class);
  }
  
  public PolicyTab getPolicyTab() {
    return getOrCreateProperty("PolicyTab", "PolicyTab", null, pcftest.CatastropheSearchScreen.PolicyTab.class);
  }
  
  public SimpleClaimSearchResultsLV getSimpleClaimSearchResultsLV() {
    return getOrCreateProperty("SimpleClaimSearchResultsLV", "SimpleClaimSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SimpleClaimSearchResultsLV.class);
  }
  
  public SimpleClaimSearchResultsLV_tb getSimpleClaimSearchResultsLV_tb() {
    return getOrCreateProperty("SimpleClaimSearchResultsLV_tb", "SimpleClaimSearchResultsLV_tb", null, pcftest.CatastropheSearchScreen.SimpleClaimSearchResultsLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CatastropheSearchScreen._msgs.class);
  }
  
  public ValueElement gethowToSelect() {
    return getOrCreateProperty("howToSelect", "howToSelect", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getmapSelectionMessage() {
    return getOrCreateProperty("mapSelectionMessage", "mapSelectionMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/CatastropheSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimsTab extends ClickableActionElement {
    public ClaimsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/CatastropheSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationSearchResultsLV_tb extends PCFElement {
    public PolicyLocationSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/CatastropheSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTab extends ClickableActionElement {
    public PolicyTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/CatastropheSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleClaimSearchResultsLV_tb extends PCFElement {
    public SimpleClaimSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSearchScreen_AssignButton getClaimSearchScreen_AssignButton() {
      return getOrCreateProperty("ClaimSearchScreen_AssignButton", "ClaimSearchScreen_AssignButton", null, pcftest.CatastropheSearchScreen.SimpleClaimSearchResultsLV_tb.ClaimSearchScreen_AssignButton.class);
    }
    
    public SimpleClaimSearchScreen_PrintButton getSimpleClaimSearchScreen_PrintButton() {
      return getOrCreateProperty("SimpleClaimSearchScreen_PrintButton", "SimpleClaimSearchScreen_PrintButton", null, pcftest.CatastropheSearchScreen.SimpleClaimSearchResultsLV_tb.SimpleClaimSearchScreen_PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/CatastropheSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSearchScreen_AssignButton extends ClickableActionElement {
      public ClaimSearchScreen_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/claims/CatastropheSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SimpleClaimSearchScreen_PrintButton extends ClickableActionElement {
      public SimpleClaimSearchScreen_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/CatastropheSearchScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}