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
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsPopup_UpLink;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.HintHeader;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.JoinPosHeader;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.NodeHeader;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.StageHeader;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV._ListPaging;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.entry;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.entry._Select;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.entry._ViewDetail;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV_tb;
import pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen._msgs;
import pcftest.OracleOutlineDetailsPopup._Paging;
import pcftest.OracleOutlineDetailsPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleOutlineDetailsPopup extends PCFLocation {
  public final static String CHECKSUM = "996534bf09dd972d221d257a6fc3c30e";
  
  public OracleOutlineDetailsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OracleOutlineDetailsPopup"));
  }
  
  public OracleOutlineDetailsPopup_UpLink getOracleOutlineDetailsPopup_UpLink() {
    return getOrCreateProperty("OracleOutlineDetailsPopup_UpLink", "OracleOutlineDetailsPopup_UpLink", null, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsPopup_UpLink.class);
  }
  
  public OracleOutlineDetailsScreen getOracleOutlineDetailsScreen() {
    return getOrCreateProperty("OracleOutlineDetailsScreen", "OracleOutlineDetailsScreen", null, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OracleOutlineDetailsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OracleOutlineDetailsPopup.__crumb__.class);
  }
  
  public OracleOutlineInfo get_parent() {
    return getOrCreateProperty("_parent", pcftest.OracleOutlineInfo.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleOutlineDetailsPopup_UpLink extends ClickableActionElement {
    public OracleOutlineDetailsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleOutlineDetailsScreen extends PCFElement {
    public OracleOutlineDetailsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public HintsLV getHintsLV() {
      return getOrCreateProperty("HintsLV", "HintsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.class);
    }
    
    public HintsLV_tb getHintsLV_tb() {
      return getOrCreateProperty("HintsLV_tb", "HintsLV_tb", null, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class HintsLV extends PCFElement {
      public HintsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public HintHeader getHintHeader() {
        return getOrCreateProperty("HintHeader", "HintHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.HintHeader.class);
      }
      
      public JoinPosHeader getJoinPosHeader() {
        return getOrCreateProperty("JoinPosHeader", "JoinPosHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.JoinPosHeader.class);
      }
      
      public NodeHeader getNodeHeader() {
        return getOrCreateProperty("NodeHeader", "NodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.NodeHeader.class);
      }
      
      public StageHeader getStageHeader() {
        return getOrCreateProperty("StageHeader", "StageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.StageHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class HintHeader extends ValueElement {
        public HintHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class JoinPosHeader extends ValueElement {
        public JoinPosHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NodeHeader extends ValueElement {
        public NodeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StageHeader extends ValueElement {
        public StageHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getHint() {
          return getOrCreateProperty("Hint", "Hint", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getJoinPos() {
          return getOrCreateProperty("JoinPos", "JoinPos", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getNode() {
          return getOrCreateProperty("Node", "Node", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getStage() {
          return getOrCreateProperty("Stage", "Stage", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.OracleOutlineDetailsPopup.OracleOutlineDetailsScreen.HintsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class HintsLV_tb extends PCFElement {
      public HintsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}