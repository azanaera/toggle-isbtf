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
import pcftest.RecoverySearch.RecoverySearchScreen;
import pcftest.RecoverySearch.RecoverySearchScreen.RecoverySearchResultsLV_tb;
import pcftest.RecoverySearch.RecoverySearchScreen.RecoverySearchResultsLV_tb.PrintButton;
import pcftest.RecoverySearch.RecoverySearchScreen._msgs;
import pcftest.RecoverySearch.RecoverySearch_UpLink;
import pcftest.RecoverySearch._Paging;
import pcftest.RecoverySearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/recoveries/RecoverySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoverySearch extends PCFLocation {
  public final static String CHECKSUM = "47408b7c9620201dac59553cb1f0d251";
  
  public RecoverySearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RecoverySearch"));
  }
  
  public RecoverySearchScreen getRecoverySearchScreen() {
    return getOrCreateProperty("RecoverySearchScreen", "RecoverySearchScreen", null, pcftest.RecoverySearch.RecoverySearchScreen.class);
  }
  
  public RecoverySearch_UpLink getRecoverySearch_UpLink() {
    return getOrCreateProperty("RecoverySearch_UpLink", "RecoverySearch_UpLink", null, pcftest.RecoverySearch.RecoverySearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RecoverySearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RecoverySearch.__crumb__.class);
  }
  
  public Search get_parent() {
    return getOrCreateProperty("_parent", pcftest.Search.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoverySearchScreen extends PCFElement {
    public RecoverySearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RecoverySearchDV getRecoverySearchDV() {
      return getOrCreateProperty("RecoverySearchDV", "RecoverySearchDV", null, pcftest.RecoverySearchDV.class);
    }
    
    public RecoverySearchResultsLV getRecoverySearchResultsLV() {
      return getOrCreateProperty("RecoverySearchResultsLV", "RecoverySearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RecoverySearchResultsLV.class);
    }
    
    public RecoverySearchResultsLV_tb getRecoverySearchResultsLV_tb() {
      return getOrCreateProperty("RecoverySearchResultsLV_tb", "RecoverySearchResultsLV_tb", null, pcftest.RecoverySearch.RecoverySearchScreen.RecoverySearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RecoverySearch.RecoverySearchScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RecoverySearchResultsLV_tb extends PCFElement {
      public RecoverySearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PrintButton getPrintButton() {
        return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.RecoverySearch.RecoverySearchScreen.RecoverySearchResultsLV_tb.PrintButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PrintButton extends ClickableActionElement {
        public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoverySearch_UpLink extends ClickableActionElement {
    public RecoverySearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}