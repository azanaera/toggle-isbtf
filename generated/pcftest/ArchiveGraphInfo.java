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
import pcftest.ArchiveGraphInfo.ArchiveGraphInfo_UpLink;
import pcftest.ArchiveGraphInfo.EntityDiffTab;
import pcftest.ArchiveGraphInfo.GraphsTab;
import pcftest.ArchiveGraphInfo.WarningsTab;
import pcftest.ArchiveGraphInfo._Paging;
import pcftest.ArchiveGraphInfo.__crumb__;
import pcftest.ArchiveGraphInfo._msgs;
import pcftest.ArchiveGraphInfo.download;
import pcftest.ArchiveGraphInfo.warningLV1;
import pcftest.ArchiveGraphInfo.warningLV2;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveGraphInfo extends PCFLocation {
  public final static String CHECKSUM = "aba1aca728718a3365d48f77d31f4dd8";
  
  public ArchiveGraphInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ArchiveGraphInfo"));
  }
  
  public ArchiveGraphInfo_UpLink getArchiveGraphInfo_UpLink() {
    return getOrCreateProperty("ArchiveGraphInfo_UpLink", "ArchiveGraphInfo_UpLink", null, pcftest.ArchiveGraphInfo.ArchiveGraphInfo_UpLink.class);
  }
  
  public EntityDiffTab getEntityDiffTab() {
    return getOrCreateProperty("EntityDiffTab", "EntityDiffTab", null, pcftest.ArchiveGraphInfo.EntityDiffTab.class);
  }
  
  public ValueElement getEntityDiffText() {
    return getOrCreateProperty("EntityDiffText", "EntityDiffText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getGraphName() {
    return getOrCreateProperty("GraphName", "GraphName", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public GraphsTab getGraphsTab() {
    return getOrCreateProperty("GraphsTab", "GraphsTab", null, pcftest.ArchiveGraphInfo.GraphsTab.class);
  }
  
  public WarningsTab getWarningsTab() {
    return getOrCreateProperty("WarningsTab", "WarningsTab", null, pcftest.ArchiveGraphInfo.WarningsTab.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ArchiveGraphInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ArchiveGraphInfo.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ArchiveGraphInfo._msgs.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  public download getdownload() {
    return getOrCreateProperty("download", "download", null, pcftest.ArchiveGraphInfo.download.class);
  }
  
  public ValueElement getgraph1() {
    return getOrCreateProperty("graph1", "graph1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getinstructions1() {
    return getOrCreateProperty("instructions1", "instructions1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getinstructions2() {
    return getOrCreateProperty("instructions2", "instructions2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public warningLV1 getwarningLV1() {
    return getOrCreateProperty("warningLV1", "warningLV1", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.ArchiveGraphInfo.warningLV1.class);
  }
  
  public warningLV2 getwarningLV2() {
    return getOrCreateProperty("warningLV2", "warningLV2", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.ArchiveGraphInfo.warningLV2.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveGraphInfo_UpLink extends ClickableActionElement {
    public ArchiveGraphInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EntityDiffTab extends ClickableActionElement {
    public EntityDiffTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GraphsTab extends ClickableActionElement {
    public GraphsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WarningsTab extends ClickableActionElement {
    public WarningsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class download extends ValueElement {
    public download(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class warningLV1 extends PCFElement {
    public warningLV1(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ArchiveGraphInfo.warningLV1.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ArchiveGraphInfo.warningLV1.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ArchiveGraphInfo.warningLV1._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ArchiveGraphInfo.warningLV1._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ArchiveGraphInfo.warningLV1.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ArchiveGraphInfo.warningLV1.entry._Select.class);
      }
      
      public pcftest.ArchiveGraphInfo.warningLV1.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ArchiveGraphInfo.warningLV1.entry._ViewDetail.class);
      }
      
      public ValueElement getwarningMessage1() {
        return getOrCreateProperty("warningMessage1", "warningMessage1", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class warningLV2 extends PCFElement {
    public warningLV2(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ArchiveGraphInfo.warningLV2.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ArchiveGraphInfo.warningLV2.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ArchiveGraphInfo.warningLV2._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ArchiveGraphInfo.warningLV2._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ArchiveGraphInfo.warningLV2.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ArchiveGraphInfo.warningLV2.entry._Select.class);
      }
      
      public pcftest.ArchiveGraphInfo.warningLV2.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ArchiveGraphInfo.warningLV2.entry._ViewDetail.class);
      }
      
      public ValueElement getwarningMessage2() {
        return getOrCreateProperty("warningMessage2", "warningMessage2", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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