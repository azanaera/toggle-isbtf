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
import pcftest.RegionsPage.RegionsPage_UpLink;
import pcftest.RegionsPage.RegionsScreen;
import pcftest.RegionsPage.RegionsScreen.RegionSearchResultsLV_tb;
import pcftest.RegionsPage.RegionsScreen.RegionSearchResultsLV_tb.Regions_AddRegionButton;
import pcftest.RegionsPage.RegionsScreen.RegionSearchResultsLV_tb.Regions_DeleteButton;
import pcftest.RegionsPage.RegionsScreen._msgs;
import pcftest.RegionsPage._Paging;
import pcftest.RegionsPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/regions/RegionsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionsPage extends PCFLocation {
  public final static String CHECKSUM = "d9e16b9014506152c7b15f1d8e97cd1c";
  
  public RegionsPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RegionsPage"));
  }
  
  public RegionsPage_UpLink getRegionsPage_UpLink() {
    return getOrCreateProperty("RegionsPage_UpLink", "RegionsPage_UpLink", null, pcftest.RegionsPage.RegionsPage_UpLink.class);
  }
  
  public RegionsScreen getRegionsScreen() {
    return getOrCreateProperty("RegionsScreen", "RegionsScreen", null, pcftest.RegionsPage.RegionsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RegionsPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RegionsPage.__crumb__.class);
  }
  
  public RegionsForward get_parent() {
    return getOrCreateProperty("_parent", pcftest.RegionsForward.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionsPage_UpLink extends ClickableActionElement {
    public RegionsPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionsScreen extends PCFElement {
    public RegionsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RegionSearchDV getRegionSearchDV() {
      return getOrCreateProperty("RegionSearchDV", "RegionSearchDV", null, pcftest.RegionSearchDV.class);
    }
    
    public RegionSearchResultsLV getRegionSearchResultsLV() {
      return getOrCreateProperty("RegionSearchResultsLV", "RegionSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RegionSearchResultsLV.class);
    }
    
    public RegionSearchResultsLV_tb getRegionSearchResultsLV_tb() {
      return getOrCreateProperty("RegionSearchResultsLV_tb", "RegionSearchResultsLV_tb", null, pcftest.RegionsPage.RegionsScreen.RegionSearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RegionsPage.RegionsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/regions/RegionsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RegionSearchResultsLV_tb extends PCFElement {
      public RegionSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Regions_AddRegionButton getRegions_AddRegionButton() {
        return getOrCreateProperty("Regions_AddRegionButton", "Regions_AddRegionButton", null, pcftest.RegionsPage.RegionsScreen.RegionSearchResultsLV_tb.Regions_AddRegionButton.class);
      }
      
      public Regions_DeleteButton getRegions_DeleteButton() {
        return getOrCreateProperty("Regions_DeleteButton", "Regions_DeleteButton", null, pcftest.RegionsPage.RegionsScreen.RegionSearchResultsLV_tb.Regions_DeleteButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/regions/RegionsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Regions_AddRegionButton extends ClickableActionElement {
        public Regions_AddRegionButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewRegion click() {
          return clickThis(pcftest.NewRegion.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/regions/RegionsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Regions_DeleteButton extends ClickableActionElement {
        public Regions_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/regions/RegionsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/regions/RegionsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}