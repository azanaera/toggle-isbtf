package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LoadFactorsPopup.LoadFactorsPopup_UpLink;
import pcftest.LoadFactorsPopup.LoadFactorsScreen;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupDetailsCardTab;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.GroupNameHeader;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV._ListPaging;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry.GroupName;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry.GroupName.GroupPickerMenuIcon;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry.GroupName.GroupSearchMenuIcon;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry._Select;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry._ViewDetail;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.LoadFactorDV_tb;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.LoadFactorDV_tb.Cancel;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.LoadFactorDV_tb.Edit;
import pcftest.LoadFactorsPopup.LoadFactorsScreen.LoadFactorDV_tb.Update;
import pcftest.LoadFactorsPopup.LoadFactorsScreen._msgs;
import pcftest.LoadFactorsPopup._Paging;
import pcftest.LoadFactorsPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadFactorsPopup extends PCFLocation {
  public final static String CHECKSUM = "0b8fa265daa2cd135a59e09723e10135";
  
  public LoadFactorsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LoadFactorsPopup"));
  }
  
  public LoadFactorsPopup_UpLink getLoadFactorsPopup_UpLink() {
    return getOrCreateProperty("LoadFactorsPopup_UpLink", "LoadFactorsPopup_UpLink", null, pcftest.LoadFactorsPopup.LoadFactorsPopup_UpLink.class);
  }
  
  public LoadFactorsScreen getLoadFactorsScreen() {
    return getOrCreateProperty("LoadFactorsScreen", "LoadFactorsScreen", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LoadFactorsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LoadFactorsPopup.__crumb__.class);
  }
  
  public Desktop get_parent() {
    return getOrCreateProperty("_parent", pcftest.Desktop.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadFactorsPopup_UpLink extends ClickableActionElement {
    public LoadFactorsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadFactorsScreen extends PCFElement {
    public LoadFactorsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupDetailsCardTab getGroupDetailsCardTab() {
      return getOrCreateProperty("GroupDetailsCardTab", "GroupDetailsCardTab", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupDetailsCardTab.class);
    }
    
    public GroupSelectionLV getGroupSelectionLV() {
      return getOrCreateProperty("GroupSelectionLV", "GroupSelectionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.class);
    }
    
    public LoadFactorDV getLoadFactorDV() {
      return getOrCreateProperty("LoadFactorDV", "LoadFactorDV", null, pcftest.LoadFactorDV.class);
    }
    
    public LoadFactorDV_tb getLoadFactorDV_tb() {
      return getOrCreateProperty("LoadFactorDV_tb", "LoadFactorDV_tb", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.LoadFactorDV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LoadFactorsPopup.LoadFactorsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupDetailsCardTab extends ClickableActionElement {
      public GroupDetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupSelectionLV extends PCFElement {
      public GroupSelectionLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GroupNameHeader getGroupNameHeader() {
        return getOrCreateProperty("GroupNameHeader", "GroupNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.GroupNameHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GroupNameHeader extends ValueElement {
        public GroupNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public GroupName getGroupName() {
          return getOrCreateProperty("GroupName", "GroupName", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry.GroupName.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class GroupName extends SelectElement {
          public GroupName(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public GroupPickerMenuIcon getGroupPickerMenuIcon() {
            return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry.GroupName.GroupPickerMenuIcon.class);
          }
          
          public GroupSearchMenuIcon getGroupSearchMenuIcon() {
            return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.GroupSelectionLV.entry.GroupName.GroupSearchMenuIcon.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class GroupPickerMenuIcon extends ClickableActionElement {
            public GroupPickerMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public OrganizationGroupTreePopup click() {
              return clickThis(pcftest.OrganizationGroupTreePopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class GroupSearchMenuIcon extends ClickableActionElement {
            public GroupSearchMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public GroupSearchPopup click() {
              return clickThis(pcftest.GroupSearchPopup.class);
            }
            
            
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadFactorDV_tb extends PCFElement {
      public LoadFactorDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.LoadFactorDV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.LoadFactorDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.LoadFactorsPopup.LoadFactorsScreen.LoadFactorDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Update extends ClickableActionElement {
        public Update(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}