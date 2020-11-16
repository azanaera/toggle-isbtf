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
import pcftest.ActivitySearch.ActivitySearchScreen;
import pcftest.ActivitySearch.ActivitySearchScreen.ActivitySearchResultsLV_tb;
import pcftest.ActivitySearch.ActivitySearchScreen.ActivitySearchResultsLV_tb.ActivitySearch_AssignButton;
import pcftest.ActivitySearch.ActivitySearchScreen.ActivitySearchResultsLV_tb.ActivitySearch_PrintButton;
import pcftest.ActivitySearch.ActivitySearchScreen._msgs;
import pcftest.ActivitySearch.ActivitySearch_UpLink;
import pcftest.ActivitySearch._Paging;
import pcftest.ActivitySearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/activities/ActivitySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivitySearch extends PCFLocation {
  public final static String CHECKSUM = "6932c00a186a7a3e1ed753956a491c0b";
  
  public ActivitySearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ActivitySearch"));
  }
  
  public ActivitySearchScreen getActivitySearchScreen() {
    return getOrCreateProperty("ActivitySearchScreen", "ActivitySearchScreen", null, pcftest.ActivitySearch.ActivitySearchScreen.class);
  }
  
  public ActivitySearch_UpLink getActivitySearch_UpLink() {
    return getOrCreateProperty("ActivitySearch_UpLink", "ActivitySearch_UpLink", null, pcftest.ActivitySearch.ActivitySearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ActivitySearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ActivitySearch.__crumb__.class);
  }
  
  public Search get_parent() {
    return getOrCreateProperty("_parent", pcftest.Search.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/activities/ActivitySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivitySearchScreen extends PCFElement {
    public ActivitySearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActivitySearchDV getActivitySearchDV() {
      return getOrCreateProperty("ActivitySearchDV", "ActivitySearchDV", null, pcftest.ActivitySearchDV.class);
    }
    
    public ActivitySearchResultsLV getActivitySearchResultsLV() {
      return getOrCreateProperty("ActivitySearchResultsLV", "ActivitySearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ActivitySearchResultsLV.class);
    }
    
    public ActivitySearchResultsLV_tb getActivitySearchResultsLV_tb() {
      return getOrCreateProperty("ActivitySearchResultsLV_tb", "ActivitySearchResultsLV_tb", null, pcftest.ActivitySearch.ActivitySearchScreen.ActivitySearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ActivitySearch.ActivitySearchScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/activities/ActivitySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActivitySearchResultsLV_tb extends PCFElement {
      public ActivitySearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ActivitySearch_AssignButton getActivitySearch_AssignButton() {
        return getOrCreateProperty("ActivitySearch_AssignButton", "ActivitySearch_AssignButton", null, pcftest.ActivitySearch.ActivitySearchScreen.ActivitySearchResultsLV_tb.ActivitySearch_AssignButton.class);
      }
      
      public ActivitySearch_PrintButton getActivitySearch_PrintButton() {
        return getOrCreateProperty("ActivitySearch_PrintButton", "ActivitySearch_PrintButton", null, pcftest.ActivitySearch.ActivitySearchScreen.ActivitySearchResultsLV_tb.ActivitySearch_PrintButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/search/activities/ActivitySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ActivitySearch_AssignButton extends ClickableActionElement {
        public ActivitySearch_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/search/activities/ActivitySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ActivitySearch_PrintButton extends ClickableActionElement {
        public ActivitySearch_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/activities/ActivitySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/search/activities/ActivitySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivitySearch_UpLink extends ClickableActionElement {
    public ActivitySearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/activities/ActivitySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/activities/ActivitySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}