package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GroupDetailPage.GroupDetailPage_UpLink;
import pcftest.GroupDetailPage.GroupDetailScreen;
import pcftest.GroupDetailPage.GroupDetailScreen.GroupDetail_BasicCardTab;
import pcftest.GroupDetailPage.GroupDetailScreen.GroupDetail_QueuesCardTab;
import pcftest.GroupDetailPage.GroupDetailScreen.GroupDetail_RegionsCardTab;
import pcftest.GroupDetailPage.GroupDetailScreen.GroupQueuesDV_tb;
import pcftest.GroupDetailPage.GroupDetailScreen.GroupRegionLV_tb;
import pcftest.GroupDetailPage.GroupDetailScreen.GroupUsersLV_tb;
import pcftest.GroupDetailPage.GroupDetailScreen.GroupUsersLV_tb.GroupDetailDV_ClearBackupUserButton;
import pcftest.GroupDetailPage.GroupDetailScreen._msgs;
import pcftest.GroupDetailPage._Paging;
import pcftest.GroupDetailPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupDetailPage extends PCFLocation {
  public final static String CHECKSUM = "4128724008089ba4b61de326817cff7f";
  
  public GroupDetailPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("GroupDetailPage"));
  }
  
  public GroupDetailPage_UpLink getGroupDetailPage_UpLink() {
    return getOrCreateProperty("GroupDetailPage_UpLink", "GroupDetailPage_UpLink", null, pcftest.GroupDetailPage.GroupDetailPage_UpLink.class);
  }
  
  public GroupDetailScreen getGroupDetailScreen() {
    return getOrCreateProperty("GroupDetailScreen", "GroupDetailScreen", null, pcftest.GroupDetailPage.GroupDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.GroupDetailPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.GroupDetailPage.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupDetailPage_UpLink extends ClickableActionElement {
    public GroupDetailPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupDetailScreen extends PCFElement {
    public GroupDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupDetailDV getGroupDetailDV() {
      return getOrCreateProperty("GroupDetailDV", "GroupDetailDV", null, pcftest.GroupDetailDV.class);
    }
    
    public GroupDetailToolbarButtonSet getGroupDetailToolbarButtonSet() {
      return getOrCreateProperty("GroupDetailToolbarButtonSet", "GroupDetailToolbarButtonSet", null, pcftest.GroupDetailToolbarButtonSet.class);
    }
    
    public GroupDetail_BasicCardTab getGroupDetail_BasicCardTab() {
      return getOrCreateProperty("GroupDetail_BasicCardTab", "GroupDetail_BasicCardTab", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupDetail_BasicCardTab.class);
    }
    
    public GroupDetail_QueuesCardTab getGroupDetail_QueuesCardTab() {
      return getOrCreateProperty("GroupDetail_QueuesCardTab", "GroupDetail_QueuesCardTab", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupDetail_QueuesCardTab.class);
    }
    
    public GroupDetail_RegionsCardTab getGroupDetail_RegionsCardTab() {
      return getOrCreateProperty("GroupDetail_RegionsCardTab", "GroupDetail_RegionsCardTab", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupDetail_RegionsCardTab.class);
    }
    
    public GroupQueuesDV getGroupQueuesDV() {
      return getOrCreateProperty("GroupQueuesDV", "GroupQueuesDV", null, pcftest.GroupQueuesDV.class);
    }
    
    public GroupQueuesDV_tb getGroupQueuesDV_tb() {
      return getOrCreateProperty("GroupQueuesDV_tb", "GroupQueuesDV_tb", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupQueuesDV_tb.class);
    }
    
    public GroupRegionLV getGroupRegionLV() {
      return getOrCreateProperty("GroupRegionLV", "GroupRegionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.GroupRegionLV.class);
    }
    
    public GroupRegionLV_tb getGroupRegionLV_tb() {
      return getOrCreateProperty("GroupRegionLV_tb", "GroupRegionLV_tb", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupRegionLV_tb.class);
    }
    
    public GroupUsersLV getGroupUsersLV() {
      return getOrCreateProperty("GroupUsersLV", "GroupUsersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.GroupUsersLV.class);
    }
    
    public GroupUsersLV_tb getGroupUsersLV_tb() {
      return getOrCreateProperty("GroupUsersLV_tb", "GroupUsersLV_tb", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupUsersLV_tb.class);
    }
    
    public ValueElement getLoadFactor() {
      return getOrCreateProperty("LoadFactor", "LoadFactor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LocalizedValuesDV getLocalizedValuesDV() {
      return getOrCreateProperty("LocalizedValuesDV", "LocalizedValuesDV", null, pcftest.LocalizedValuesDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.GroupDetailPage.GroupDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupDetail_BasicCardTab extends ClickableActionElement {
      public GroupDetail_BasicCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupDetail_QueuesCardTab extends ClickableActionElement {
      public GroupDetail_QueuesCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupDetail_RegionsCardTab extends ClickableActionElement {
      public GroupDetail_RegionsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupQueuesDV_tb extends PCFElement {
      public GroupQueuesDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupRegionLV_tb extends PCFElement {
      public GroupRegionLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.GroupDetailPage.GroupDetailScreen.GroupRegionLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupRegionLV_tb.Add.class);
      }
      
      public pcftest.GroupDetailPage.GroupDetailScreen.GroupRegionLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupRegionLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupUsersLV_tb extends PCFElement {
      public GroupUsersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.GroupDetailPage.GroupDetailScreen.GroupUsersLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupUsersLV_tb.Add.class);
      }
      
      public GroupDetailDV_ClearBackupUserButton getGroupDetailDV_ClearBackupUserButton() {
        return getOrCreateProperty("GroupDetailDV_ClearBackupUserButton", "GroupDetailDV_ClearBackupUserButton", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupUsersLV_tb.GroupDetailDV_ClearBackupUserButton.class);
      }
      
      public pcftest.GroupDetailPage.GroupDetailScreen.GroupUsersLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.GroupDetailPage.GroupDetailScreen.GroupUsersLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GroupDetailDV_ClearBackupUserButton extends ClickableActionElement {
        public GroupDetailDV_ClearBackupUserButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/GroupDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}