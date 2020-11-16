package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.LoadIntegrityChecksCompoundLVPopup.LoadIntegrityChecksCompoundLVPopup_UpLink;
import pcftest.LoadIntegrityChecksCompoundLVPopup._Paging;
import pcftest.LoadIntegrityChecksCompoundLVPopup.__crumb__;
import pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen;
import pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundLV;
import pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundLV.errortype;
import pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundLV.expand;
import pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundStagingTableLV;
import pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV;
import pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV._ListPaging;
import pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV.entry;
import pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV.simplequeryHeader;
import pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen._msgs;
import typekey.LoadErrorType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadIntegrityChecksCompoundLVPopup extends PCFLocation {
  public final static String CHECKSUM = "3907bb00123cb347abec5ba16b4bf230";
  
  public LoadIntegrityChecksCompoundLVPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LoadIntegrityChecksCompoundLVPopup"));
  }
  
  public LoadIntegrityChecksCompoundLVPopup_UpLink getLoadIntegrityChecksCompoundLVPopup_UpLink() {
    return getOrCreateProperty("LoadIntegrityChecksCompoundLVPopup_UpLink", "LoadIntegrityChecksCompoundLVPopup_UpLink", null, pcftest.LoadIntegrityChecksCompoundLVPopup.LoadIntegrityChecksCompoundLVPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LoadIntegrityChecksCompoundLVPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LoadIntegrityChecksCompoundLVPopup.__crumb__.class);
  }
  
  public loadintegritycheckscompoundlvScreen getloadintegritycheckscompoundlvScreen() {
    return getOrCreateProperty("loadintegritycheckscompoundlvScreen", "loadintegritycheckscompoundlvScreen", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadIntegrityChecksCompoundLVPopup_UpLink extends ClickableActionElement {
    public LoadIntegrityChecksCompoundLVPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class loadintegritycheckscompoundlvScreen extends PCFElement {
    public loadintegritycheckscompoundlvScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LoadIntegrityChecksCompoundLV getLoadIntegrityChecksCompoundLV() {
      return getOrCreateProperty("LoadIntegrityChecksCompoundLV", "LoadIntegrityChecksCompoundLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundLV.class);
    }
    
    public LoadIntegrityChecksCompoundStagingTableLV getLoadIntegrityChecksCompoundStagingTableLV() {
      return getOrCreateProperty("LoadIntegrityChecksCompoundStagingTableLV", "LoadIntegrityChecksCompoundStagingTableLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundStagingTableLV.class);
    }
    
    public LoadIntegrityChecksSimpleQueriesLV getLoadIntegrityChecksSimpleQueriesLV() {
      return getOrCreateProperty("LoadIntegrityChecksSimpleQueriesLV", "LoadIntegrityChecksSimpleQueriesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadIntegrityChecksCompoundLV extends PCFElement {
      public LoadIntegrityChecksCompoundLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundLV._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundLV._Select.class);
      }
      
      public pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundLV._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundLV._ViewDetail.class);
      }
      
      public ValueElement getc() {
        return getOrCreateProperty("c", "c", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getd() {
        return getOrCreateProperty("d", "d", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getdescription() {
        return getOrCreateProperty("description", "description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public errortype geterrortype() {
        return getOrCreateProperty("errortype", "errortype", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundLV.errortype.class);
      }
      
      public expand getexpand() {
        return getOrCreateProperty("expand", "expand", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundLV.expand.class);
      }
      
      public ValueElement getquery() {
        return getOrCreateProperty("query", "query", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement gett() {
        return getOrCreateProperty("t", "t", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class errortype extends SelectElement {
        public errortype(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(LoadErrorType arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public LoadErrorType getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LoadErrorType.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(LoadErrorType arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class expand extends ValueElement {
        public expand(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadIntegrityChecksCompoundStagingTableLV extends PCFElement {
      public LoadIntegrityChecksCompoundStagingTableLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundStagingTableLV._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundStagingTableLV._Select.class);
      }
      
      public pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundStagingTableLV._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksCompoundStagingTableLV._ViewDetail.class);
      }
      
      public ValueElement geta() {
        return getOrCreateProperty("a", "a", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public BooleanValueElement getallowadmin() {
        return getOrCreateProperty("allowadmin", "allowadmin", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public ValueElement gets() {
        return getOrCreateProperty("s", "s", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getstagingnamecell() {
        return getOrCreateProperty("stagingnamecell", "stagingnamecell", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadIntegrityChecksSimpleQueriesLV extends PCFElement {
      public LoadIntegrityChecksSimpleQueriesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV._ListPaging.class);
      }
      
      public simplequeryHeader getsimplequeryHeader() {
        return getOrCreateProperty("simplequeryHeader", "simplequeryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV.simplequeryHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV.entry._Select.class);
        }
        
        public pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadIntegrityChecksCompoundLVPopup.loadintegritycheckscompoundlvScreen.LoadIntegrityChecksSimpleQueriesLV.entry._ViewDetail.class);
        }
        
        public ValueElement getsimplequery() {
          return getOrCreateProperty("simplequery", "simplequery", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class simplequeryHeader extends ValueElement {
        public simplequeryHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}