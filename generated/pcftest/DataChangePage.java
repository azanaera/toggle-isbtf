package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
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
import pcftest.DataChangePage.DataChangePage_UpLink;
import pcftest.DataChangePage.DataChangeScreen;
import pcftest.DataChangePage.DataChangeScreen.DiscardToolbarButton;
import pcftest.DataChangePage.DataChangeScreen.ExecuteToolbarButton;
import pcftest.DataChangePage.DataChangeScreen._ListPaging;
import pcftest.DataChangePage.DataChangeScreen._msgs;
import pcftest.DataChangePage.DataChangeScreen.createDateHeader;
import pcftest.DataChangePage.DataChangeScreen.createUserHeader;
import pcftest.DataChangePage.DataChangeScreen.descHeader;
import pcftest.DataChangePage.DataChangeScreen.detailsTab;
import pcftest.DataChangePage.DataChangeScreen.entry;
import pcftest.DataChangePage.DataChangeScreen.entry._Select;
import pcftest.DataChangePage.DataChangeScreen.entry._ViewDetail;
import pcftest.DataChangePage.DataChangeScreen.entry.createUser;
import pcftest.DataChangePage.DataChangeScreen.entry.createUser.createUserUserSearchMenuItem;
import pcftest.DataChangePage.DataChangeScreen.entry.createUser.createUserUserSelectMenuItem;
import pcftest.DataChangePage.DataChangeScreen.entry.execUser;
import pcftest.DataChangePage.DataChangeScreen.entry.execUser.execUserUserSearchMenuItem;
import pcftest.DataChangePage.DataChangeScreen.entry.execUser.execUserUserSelectMenuItem;
import pcftest.DataChangePage.DataChangeScreen.entry.status;
import pcftest.DataChangePage.DataChangeScreen.execDateHeader;
import pcftest.DataChangePage.DataChangeScreen.execUserHeader;
import pcftest.DataChangePage.DataChangeScreen.referenceHeader;
import pcftest.DataChangePage.DataChangeScreen.statusHeader;
import pcftest.DataChangePage._Paging;
import pcftest.DataChangePage.__crumb__;
import typekey.DataChangeStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DataChangePage extends PCFLocation {
  public final static String CHECKSUM = "816f97c4e470c42b0d531df1406d1835";
  
  public DataChangePage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DataChangePage"));
  }
  
  public DataChangePage_UpLink getDataChangePage_UpLink() {
    return getOrCreateProperty("DataChangePage_UpLink", "DataChangePage_UpLink", null, pcftest.DataChangePage.DataChangePage_UpLink.class);
  }
  
  public DataChangeScreen getDataChangeScreen() {
    return getOrCreateProperty("DataChangeScreen", "DataChangeScreen", null, pcftest.DataChangePage.DataChangeScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DataChangePage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DataChangePage.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DataChangePage_UpLink extends ClickableActionElement {
    public DataChangePage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DataChangeScreen extends PCFElement {
    public DataChangeScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DiscardToolbarButton getDiscardToolbarButton() {
      return getOrCreateProperty("DiscardToolbarButton", "DiscardToolbarButton", null, pcftest.DataChangePage.DataChangeScreen.DiscardToolbarButton.class);
    }
    
    public ExecuteToolbarButton getExecuteToolbarButton() {
      return getOrCreateProperty("ExecuteToolbarButton", "ExecuteToolbarButton", null, pcftest.DataChangePage.DataChangeScreen.ExecuteToolbarButton.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DataChangePage.DataChangeScreen.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DataChangePage.DataChangeScreen._ListPaging.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DataChangePage.DataChangeScreen._msgs.class);
    }
    
    public createDateHeader getcreateDateHeader() {
      return getOrCreateProperty("createDateHeader", "createDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataChangePage.DataChangeScreen.createDateHeader.class);
    }
    
    public createUserHeader getcreateUserHeader() {
      return getOrCreateProperty("createUserHeader", "createUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataChangePage.DataChangeScreen.createUserHeader.class);
    }
    
    public descHeader getdescHeader() {
      return getOrCreateProperty("descHeader", "descHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataChangePage.DataChangeScreen.descHeader.class);
    }
    
    public detailsTab getdetailsTab() {
      return getOrCreateProperty("detailsTab", "detailsTab", null, pcftest.DataChangePage.DataChangeScreen.detailsTab.class);
    }
    
    public execDateHeader getexecDateHeader() {
      return getOrCreateProperty("execDateHeader", "execDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataChangePage.DataChangeScreen.execDateHeader.class);
    }
    
    public execUserHeader getexecUserHeader() {
      return getOrCreateProperty("execUserHeader", "execUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataChangePage.DataChangeScreen.execUserHeader.class);
    }
    
    public SelectElement getfilter() {
      return getOrCreateProperty("filter", "filter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getgosu() {
      return getOrCreateProperty("gosu", "gosu", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public referenceHeader getreferenceHeader() {
      return getOrCreateProperty("referenceHeader", "referenceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataChangePage.DataChangeScreen.referenceHeader.class);
    }
    
    public ValueElement getresult() {
      return getOrCreateProperty("result", "result", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public statusHeader getstatusHeader() {
      return getOrCreateProperty("statusHeader", "statusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataChangePage.DataChangeScreen.statusHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DiscardToolbarButton extends ClickableActionElement {
      public DiscardToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExecuteToolbarButton extends ClickableActionElement {
      public ExecuteToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class createDateHeader extends ValueElement {
      public createDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class createUserHeader extends ValueElement {
      public createUserHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class descHeader extends ValueElement {
      public descHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class detailsTab extends ClickableActionElement {
      public detailsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.DataChangePage.DataChangeScreen.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DataChangePage.DataChangeScreen.entry._ViewDetail.class);
      }
      
      public DateElement getcreateDate() {
        return getOrCreateProperty("createDate", "createDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public createUser getcreateUser() {
        return getOrCreateProperty("createUser", "createUser", null, pcftest.DataChangePage.DataChangeScreen.entry.createUser.class);
      }
      
      public ValueElement getdesc() {
        return getOrCreateProperty("desc", "desc", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getexecDate() {
        return getOrCreateProperty("execDate", "execDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public execUser getexecUser() {
        return getOrCreateProperty("execUser", "execUser", null, pcftest.DataChangePage.DataChangeScreen.entry.execUser.class);
      }
      
      public ValueElement getreference() {
        return getOrCreateProperty("reference", "reference", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public status getstatus() {
        return getOrCreateProperty("status", "status", null, pcftest.DataChangePage.DataChangeScreen.entry.status.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class createUser extends SelectElement {
        public createUser(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public createUserUserSearchMenuItem getcreateUserUserSearchMenuItem() {
          return getOrCreateProperty("createUserUserSearchMenuItem", "createUserUserSearchMenuItem", null, pcftest.DataChangePage.DataChangeScreen.entry.createUser.createUserUserSearchMenuItem.class);
        }
        
        public createUserUserSelectMenuItem getcreateUserUserSelectMenuItem() {
          return getOrCreateProperty("createUserUserSelectMenuItem", "createUserUserSelectMenuItem", null, pcftest.DataChangePage.DataChangeScreen.entry.createUser.createUserUserSelectMenuItem.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class createUserUserSearchMenuItem extends ClickableActionElement {
          public createUserUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public UserSearchPopup click() {
            return clickThis(pcftest.UserSearchPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class createUserUserSelectMenuItem extends ClickableActionElement {
          public createUserUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public UserSelectPopup click() {
            return clickThis(pcftest.UserSelectPopup.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class execUser extends SelectElement {
        public execUser(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public execUserUserSearchMenuItem getexecUserUserSearchMenuItem() {
          return getOrCreateProperty("execUserUserSearchMenuItem", "execUserUserSearchMenuItem", null, pcftest.DataChangePage.DataChangeScreen.entry.execUser.execUserUserSearchMenuItem.class);
        }
        
        public execUserUserSelectMenuItem getexecUserUserSelectMenuItem() {
          return getOrCreateProperty("execUserUserSelectMenuItem", "execUserUserSelectMenuItem", null, pcftest.DataChangePage.DataChangeScreen.entry.execUser.execUserUserSelectMenuItem.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class execUserUserSearchMenuItem extends ClickableActionElement {
          public execUserUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public UserSearchPopup click() {
            return clickThis(pcftest.UserSearchPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class execUserUserSelectMenuItem extends ClickableActionElement {
          public execUserUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public UserSelectPopup click() {
            return clickThis(pcftest.UserSelectPopup.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class status extends SelectElement {
        public status(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(DataChangeStatus arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public DataChangeStatus getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DataChangeStatus.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(DataChangeStatus arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class execDateHeader extends ValueElement {
      public execDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class execUserHeader extends ValueElement {
      public execUserHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class referenceHeader extends ValueElement {
      public referenceHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class statusHeader extends ValueElement {
      public statusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/datachange/DataChangePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}