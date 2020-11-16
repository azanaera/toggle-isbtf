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
import pcftest.IntentionalLogging.IntentionalLoggingScreen;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.ActionsHeader;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.NameHeader;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.StatusHeader;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV._ListPaging;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.entry;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.entry.Start;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.entry.Stop;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.entry._Select;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.entry._ViewDetail;
import pcftest.IntentionalLogging.IntentionalLoggingScreen._msgs;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.globalButtonOff;
import pcftest.IntentionalLogging.IntentionalLoggingScreen.globalButtonOn;
import pcftest.IntentionalLogging.IntentionalLogging_UpLink;
import pcftest.IntentionalLogging._Paging;
import pcftest.IntentionalLogging.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class IntentionalLogging extends PCFLocation {
  public final static String CHECKSUM = "d15da771e0c370608b79212b3b9ea951";
  
  public IntentionalLogging(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("IntentionalLogging"));
  }
  
  public IntentionalLoggingScreen getIntentionalLoggingScreen() {
    return getOrCreateProperty("IntentionalLoggingScreen", "IntentionalLoggingScreen", null, pcftest.IntentionalLogging.IntentionalLoggingScreen.class);
  }
  
  public IntentionalLogging_UpLink getIntentionalLogging_UpLink() {
    return getOrCreateProperty("IntentionalLogging_UpLink", "IntentionalLogging_UpLink", null, pcftest.IntentionalLogging.IntentionalLogging_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.IntentionalLogging._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.IntentionalLogging.__crumb__.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IntentionalLoggingScreen extends PCFElement {
    public IntentionalLoggingScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IntentionalLoggingLV getIntentionalLoggingLV() {
      return getOrCreateProperty("IntentionalLoggingLV", "IntentionalLoggingLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.IntentionalLogging.IntentionalLoggingScreen._msgs.class);
    }
    
    public globalButtonOff getglobalButtonOff() {
      return getOrCreateProperty("globalButtonOff", "globalButtonOff", null, pcftest.IntentionalLogging.IntentionalLoggingScreen.globalButtonOff.class);
    }
    
    public globalButtonOn getglobalButtonOn() {
      return getOrCreateProperty("globalButtonOn", "globalButtonOn", null, pcftest.IntentionalLogging.IntentionalLoggingScreen.globalButtonOn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IntentionalLoggingLV extends PCFElement {
      public IntentionalLoggingLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ActionsHeader getActionsHeader() {
        return getOrCreateProperty("ActionsHeader", "ActionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.ActionsHeader.class);
      }
      
      public NameHeader getNameHeader() {
        return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.NameHeader.class);
      }
      
      public StatusHeader getStatusHeader() {
        return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.StatusHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ActionsHeader extends ValueElement {
        public ActionsHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameHeader extends ValueElement {
        public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StatusHeader extends ValueElement {
        public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getName() {
          return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public Start getStart() {
          return getOrCreateProperty("Start", "Start", null, pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.entry.Start.class);
        }
        
        public ValueElement getStatus() {
          return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public Stop getStop() {
          return getOrCreateProperty("Stop", "Stop", null, pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.entry.Stop.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.IntentionalLogging.IntentionalLoggingScreen.IntentionalLoggingLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Start extends ClickableActionElement {
          public Start(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Stop extends ClickableActionElement {
          public Stop(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class globalButtonOff extends ClickableActionElement {
      public globalButtonOff(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class globalButtonOn extends ClickableActionElement {
      public globalButtonOn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IntentionalLogging_UpLink extends ClickableActionElement {
    public IntentionalLogging_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/IntentionalLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}