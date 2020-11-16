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
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen;
import pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.Cancel;
import pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.Continue;
import pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.Refresh;
import pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.RunningServersLV;
import pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.RunningServersLV._ListPaging;
import pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.RunningServersLV.entry;
import pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.RunningServersLV.entry._Select;
import pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.RunningServersLV.entry._ViewDetail;
import pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen._msgs;
import pcftest.InitiateBackoutConfirmPopup.InitiateBackoutConfirmPopup_UpLink;
import pcftest.InitiateBackoutConfirmPopup._Paging;
import pcftest.InitiateBackoutConfirmPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InitiateBackoutConfirmPopup extends PCFLocation {
  public final static String CHECKSUM = "cdb1a45863a5623f34e0298a7854288a";
  
  public InitiateBackoutConfirmPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InitiateBackoutConfirmPopup"));
  }
  
  public InitBackoutConfirmScreen getInitBackoutConfirmScreen() {
    return getOrCreateProperty("InitBackoutConfirmScreen", "InitBackoutConfirmScreen", null, pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.class);
  }
  
  public InitiateBackoutConfirmPopup_UpLink getInitiateBackoutConfirmPopup_UpLink() {
    return getOrCreateProperty("InitiateBackoutConfirmPopup_UpLink", "InitiateBackoutConfirmPopup_UpLink", null, pcftest.InitiateBackoutConfirmPopup.InitiateBackoutConfirmPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InitiateBackoutConfirmPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InitiateBackoutConfirmPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InitBackoutConfirmScreen extends PCFElement {
    public InitBackoutConfirmScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.Cancel.class);
    }
    
    public ValueElement getConfirm() {
      return getOrCreateProperty("Confirm", "Confirm", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Continue getContinue() {
      return getOrCreateProperty("Continue", "Continue", null, pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.Continue.class);
    }
    
    public ValueElement getHasTargetServers() {
      return getOrCreateProperty("HasTargetServers", "HasTargetServers", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNoTargetServers() {
      return getOrCreateProperty("NoTargetServers", "NoTargetServers", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Refresh getRefresh() {
      return getOrCreateProperty("Refresh", "Refresh", null, pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.Refresh.class);
    }
    
    public RunningServersLV getRunningServersLV() {
      return getOrCreateProperty("RunningServersLV", "RunningServersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.RunningServersLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Continue extends ClickableActionElement {
      public Continue(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Refresh extends ClickableActionElement {
      public Refresh(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RunningServersLV extends PCFElement {
      public RunningServersLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.RunningServersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.RunningServersLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getServerId() {
          return getOrCreateProperty("ServerId", "ServerId", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.RunningServersLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.InitiateBackoutConfirmPopup.InitBackoutConfirmScreen.RunningServersLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InitiateBackoutConfirmPopup_UpLink extends ClickableActionElement {
    public InitiateBackoutConfirmPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InitiateBackoutConfirmPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}