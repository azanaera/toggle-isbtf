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
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ApplyButton;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ConsistencyChecksChangeNumOfWorkersPopup_UpLink;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.ActiveHeader;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.NumWorkersHeader;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.ServerIdHeader;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV._ListPaging;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.entry;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.entry._Select;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.entry._ViewDetail;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.OneServerAlert;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.OneServerAlert.CloseBtn;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.RefreshButton;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup._Paging;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup.__crumb__;
import pcftest.ConsistencyChecksChangeNumOfWorkersPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ConsistencyChecksChangeNumOfWorkersPopup extends PCFLocation {
  public final static String CHECKSUM = "944654d6da1ff794f3c15e4458c0020a";
  
  public ConsistencyChecksChangeNumOfWorkersPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ConsistencyChecksChangeNumOfWorkersPopup"));
  }
  
  public ValueElement getActualNumThreads() {
    return getOrCreateProperty("ActualNumThreads", "ActualNumThreads", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ApplyButton getApplyButton() {
    return getOrCreateProperty("ApplyButton", "ApplyButton", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ApplyButton.class);
  }
  
  public ConsistencyChecksChangeNumOfWorkersPopup_UpLink getConsistencyChecksChangeNumOfWorkersPopup_UpLink() {
    return getOrCreateProperty("ConsistencyChecksChangeNumOfWorkersPopup_UpLink", "ConsistencyChecksChangeNumOfWorkersPopup_UpLink", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ConsistencyChecksChangeNumOfWorkersPopup_UpLink.class);
  }
  
  public ValueElement getDesiredNumThreads() {
    return getOrCreateProperty("DesiredNumThreads", "DesiredNumThreads", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ExecutorsLV getExecutorsLV() {
    return getOrCreateProperty("ExecutorsLV", "ExecutorsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.class);
  }
  
  public OneServerAlert getOneServerAlert() {
    return getOrCreateProperty("OneServerAlert", "OneServerAlert", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.OneServerAlert.class);
  }
  
  public RefreshButton getRefreshButton() {
    return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.RefreshButton.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApplyButton extends ClickableActionElement {
    public ApplyButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConsistencyChecksChangeNumOfWorkersPopup_UpLink extends ClickableActionElement {
    public ConsistencyChecksChangeNumOfWorkersPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExecutorsLV extends PCFElement {
    public ExecutorsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActiveHeader getActiveHeader() {
      return getOrCreateProperty("ActiveHeader", "ActiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.ActiveHeader.class);
    }
    
    public NumWorkersHeader getNumWorkersHeader() {
      return getOrCreateProperty("NumWorkersHeader", "NumWorkersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.NumWorkersHeader.class);
    }
    
    public ServerIdHeader getServerIdHeader() {
      return getOrCreateProperty("ServerIdHeader", "ServerIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.ServerIdHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActiveHeader extends ValueElement {
      public ActiveHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumWorkersHeader extends ValueElement {
      public NumWorkersHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerIdHeader extends ValueElement {
      public ServerIdHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getActive() {
        return getOrCreateProperty("Active", "Active", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNumWorkers() {
        return getOrCreateProperty("NumWorkers", "NumWorkers", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getServerId() {
        return getOrCreateProperty("ServerId", "ServerId", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.ExecutorsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OneServerAlert extends ClickableActionElement {
    public OneServerAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ConsistencyChecksChangeNumOfWorkersPopup.OneServerAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RefreshButton extends ClickableActionElement {
    public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksChangeNumOfWorkersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}