package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.MicrosoftDriverLogging.MSDriverLoggingDV;
import pcftest.MicrosoftDriverLogging.MSDriverLoggingDV.SetLoggingLevel;
import pcftest.MicrosoftDriverLogging.MicrosoftDriverLogging_UpLink;
import pcftest.MicrosoftDriverLogging._Paging;
import pcftest.MicrosoftDriverLogging.__crumb__;
import pcftest.MicrosoftDriverLogging._msgs;
import pcftest.MicrosoftDriverLogging.msgsLV;
import pcftest.MicrosoftDriverLogging.msgsLV._ListPaging;
import pcftest.MicrosoftDriverLogging.msgsLV.entry;
import pcftest.MicrosoftDriverLogging.msgsLV.entry._Select;
import pcftest.MicrosoftDriverLogging.msgsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MicrosoftDriverLogging extends PCFLocation {
  public final static String CHECKSUM = "846b5d55d9df75ab8fbbab5b712e9152";
  
  public MicrosoftDriverLogging(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MicrosoftDriverLogging"));
  }
  
  public MSDriverLoggingDV getMSDriverLoggingDV() {
    return getOrCreateProperty("MSDriverLoggingDV", "MSDriverLoggingDV", null, pcftest.MicrosoftDriverLogging.MSDriverLoggingDV.class);
  }
  
  public MicrosoftDriverLogging_UpLink getMicrosoftDriverLogging_UpLink() {
    return getOrCreateProperty("MicrosoftDriverLogging_UpLink", "MicrosoftDriverLogging_UpLink", null, pcftest.MicrosoftDriverLogging.MicrosoftDriverLogging_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MicrosoftDriverLogging._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MicrosoftDriverLogging.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MicrosoftDriverLogging._msgs.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  public msgsLV getmsgsLV() {
    return getOrCreateProperty("msgsLV", "msgsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MicrosoftDriverLogging.msgsLV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MSDriverLoggingDV extends DetailViewElement {
    public MSDriverLoggingDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SetLoggingLevel getSetLoggingLevel() {
      return getOrCreateProperty("SetLoggingLevel", "SetLoggingLevel", null, pcftest.MicrosoftDriverLogging.MSDriverLoggingDV.SetLoggingLevel.class);
    }
    
    public ValueElement getinstructions0() {
      return getOrCreateProperty("instructions0", "instructions0", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getinstructions2() {
      return getOrCreateProperty("instructions2", "instructions2", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getinstructions3() {
      return getOrCreateProperty("instructions3", "instructions3", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getinstructions4() {
      return getOrCreateProperty("instructions4", "instructions4", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getloggingFormat() {
      return getOrCreateProperty("loggingFormat", "loggingFormat", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SelectElement getloggingLevel() {
      return getOrCreateProperty("loggingLevel", "loggingLevel", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement gettopNHotObjects() {
      return getOrCreateProperty("topNHotObjects", "topNHotObjects", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SetLoggingLevel extends ValueElement {
      public SetLoggingLevel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MicrosoftDriverLogging_UpLink extends ClickableActionElement {
    public MicrosoftDriverLogging_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class msgsLV extends PCFElement {
    public msgsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MicrosoftDriverLogging.msgsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MicrosoftDriverLogging.msgsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.MicrosoftDriverLogging.msgsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MicrosoftDriverLogging.msgsLV.entry._ViewDetail.class);
      }
      
      public ValueElement getmsgCell() {
        return getOrCreateProperty("msgCell", "msgCell", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}