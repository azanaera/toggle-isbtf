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
import pcftest.GroupRegionPopup.GroupRegionPopupScreen;
import pcftest.GroupRegionPopup.GroupRegionPopupScreen.RegionSearchResultsLV_tb;
import pcftest.GroupRegionPopup.GroupRegionPopupScreen.RegionSearchResultsLV_tb.GroupRegionPopup_SelectButton;
import pcftest.GroupRegionPopup.GroupRegionPopupScreen._msgs;
import pcftest.GroupRegionPopup.GroupRegionPopup_UpLink;
import pcftest.GroupRegionPopup._Paging;
import pcftest.GroupRegionPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/groups/GroupRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupRegionPopup extends PCFLocation {
  public final static String CHECKSUM = "1eb3846ad9a3d18b854393b476e11006";
  
  public GroupRegionPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("GroupRegionPopup"));
  }
  
  public GroupRegionPopupScreen getGroupRegionPopupScreen() {
    return getOrCreateProperty("GroupRegionPopupScreen", "GroupRegionPopupScreen", null, pcftest.GroupRegionPopup.GroupRegionPopupScreen.class);
  }
  
  public GroupRegionPopup_UpLink getGroupRegionPopup_UpLink() {
    return getOrCreateProperty("GroupRegionPopup_UpLink", "GroupRegionPopup_UpLink", null, pcftest.GroupRegionPopup.GroupRegionPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.GroupRegionPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.GroupRegionPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupRegionPopupScreen extends PCFElement {
    public GroupRegionPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RegionSearchDV getRegionSearchDV() {
      return getOrCreateProperty("RegionSearchDV", "RegionSearchDV", null, pcftest.RegionSearchDV.class);
    }
    
    public RegionSearchResultsLV getRegionSearchResultsLV() {
      return getOrCreateProperty("RegionSearchResultsLV", "RegionSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RegionSearchResultsLV.class);
    }
    
    public RegionSearchResultsLV_tb getRegionSearchResultsLV_tb() {
      return getOrCreateProperty("RegionSearchResultsLV_tb", "RegionSearchResultsLV_tb", null, pcftest.GroupRegionPopup.GroupRegionPopupScreen.RegionSearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.GroupRegionPopup.GroupRegionPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/groups/GroupRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RegionSearchResultsLV_tb extends PCFElement {
      public RegionSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GroupRegionPopup_SelectButton getGroupRegionPopup_SelectButton() {
        return getOrCreateProperty("GroupRegionPopup_SelectButton", "GroupRegionPopup_SelectButton", null, pcftest.GroupRegionPopup.GroupRegionPopupScreen.RegionSearchResultsLV_tb.GroupRegionPopup_SelectButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/groups/GroupRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GroupRegionPopup_SelectButton extends ClickableActionElement {
        public GroupRegionPopup_SelectButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/groups/GroupRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/groups/GroupRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupRegionPopup_UpLink extends ClickableActionElement {
    public GroupRegionPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}