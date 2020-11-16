package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AggregateLimitClaimsWorksheet.AggregateLimitClaimsWorksheet_UpLink;
import pcftest.AggregateLimitClaimsWorksheet.ToolbarButton;
import pcftest.AggregateLimitClaimsWorksheet._Paging;
import pcftest.AggregateLimitClaimsWorksheet.__crumb__;
import pcftest.AggregateLimitClaimsWorksheet._msgs;
import pcftest.AggregateLimitClaimsWorksheet.agglimitsListView;
import pcftest.AggregateLimitClaimsWorksheet.agglimitsListView.AggregateLimitClaimsLV_tb;
import pcftest.AggregateLimitClaimsWorksheet.wsTabBar;
import pcftest.AggregateLimitClaimsWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AggregateLimitClaimsWorksheet extends PCFLocation {
  public final static String CHECKSUM = "bf83f5b09a0201d245f82fa7f9bf5c21";
  
  public AggregateLimitClaimsWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AggregateLimitClaimsWorksheet"));
  }
  
  public AggregateLimitClaimsWorksheet_UpLink getAggregateLimitClaimsWorksheet_UpLink() {
    return getOrCreateProperty("AggregateLimitClaimsWorksheet_UpLink", "AggregateLimitClaimsWorksheet_UpLink", null, pcftest.AggregateLimitClaimsWorksheet.AggregateLimitClaimsWorksheet_UpLink.class);
  }
  
  public ToolbarButton getToolbarButton() {
    return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.AggregateLimitClaimsWorksheet.ToolbarButton.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AggregateLimitClaimsWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AggregateLimitClaimsWorksheet.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AggregateLimitClaimsWorksheet._msgs.class);
  }
  
  public agglimitsListView getagglimitsListView() {
    return getOrCreateProperty("agglimitsListView", "agglimitsListView", null, pcftest.AggregateLimitClaimsWorksheet.agglimitsListView.class);
  }
  
  public ValueElement getlid() {
    return getOrCreateProperty("lid", "lid", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getlid1() {
    return getOrCreateProperty("lid1", "lid1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.AggregateLimitClaimsWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregateLimitClaimsWorksheet_UpLink extends ClickableActionElement {
    public AggregateLimitClaimsWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ToolbarButton extends ClickableActionElement {
    public ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class agglimitsListView extends PCFElement {
    public agglimitsListView(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AggregateLimitClaimsLV getAggregateLimitClaimsLV() {
      return getOrCreateProperty("AggregateLimitClaimsLV", "AggregateLimitClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AggregateLimitClaimsLV.class);
    }
    
    public AggregateLimitClaimsLV_tb getAggregateLimitClaimsLV_tb() {
      return getOrCreateProperty("AggregateLimitClaimsLV_tb", "AggregateLimitClaimsLV_tb", null, pcftest.AggregateLimitClaimsWorksheet.agglimitsListView.AggregateLimitClaimsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AggregateLimitClaimsLV_tb extends PCFElement {
      public AggregateLimitClaimsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.AggregateLimitClaimsWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitClaimsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class wsTab extends ClickableActionElement {
      public wsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}