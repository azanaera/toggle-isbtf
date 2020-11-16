package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.TreeViewElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerResultsCV_Elapsed.CardTab;
import pcftest.ProfilerResultsCV_Elapsed.EmptyTab;
import pcftest.ProfilerResultsCV_Elapsed.StackCardTab;
import pcftest.ProfilerResultsCV_Elapsed.StacksLV;
import pcftest.ProfilerResultsCV_Elapsed.StacksLV._ListPaging;
import pcftest.ProfilerResultsCV_Elapsed.StacksLV.entry;
import pcftest.ProfilerResultsCV_Elapsed.StacksLV.entry._Select;
import pcftest.ProfilerResultsCV_Elapsed.StacksLV.entry._ViewDetail;
import pcftest.ProfilerResultsCV_Elapsed.StacksLV.frameCountHeader;
import pcftest.ProfilerResultsCV_Elapsed.StacksLV.stackNameHeader;
import pcftest.ProfilerResultsCV_Elapsed.TreeLabel;
import pcftest.ProfilerResultsCV_Elapsed.TreeViewForFrame;
import pcftest.ProfilerResultsCV_Elapsed.TreeViewForFrame.ProfilerTreeView;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_Elapsed extends ProfilerResultsCV {
  public final static String CHECKSUM = "6096a979a14935dae6ae91068e3cfe91";
  
  public ProfilerResultsCV_Elapsed(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CardTab getCardTab() {
    return getOrCreateProperty("CardTab", "CardTab", null, pcftest.ProfilerResultsCV_Elapsed.CardTab.class);
  }
  
  public EmptyTab getEmptyTab() {
    return getOrCreateProperty("EmptyTab", "EmptyTab", null, pcftest.ProfilerResultsCV_Elapsed.EmptyTab.class);
  }
  
  public ProfilerResultsEmptyDV getProfilerResultsEmptyDV() {
    return getOrCreateProperty("ProfilerResultsEmptyDV", "ProfilerResultsEmptyDV", null, pcftest.ProfilerResultsEmptyDV.class);
  }
  
  public StackCardTab getStackCardTab() {
    return getOrCreateProperty("StackCardTab", "StackCardTab", null, pcftest.ProfilerResultsCV_Elapsed.StackCardTab.class);
  }
  
  public StacksLV getStacksLV() {
    return getOrCreateProperty("StacksLV", "StacksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_Elapsed.StacksLV.class);
  }
  
  public TreeLabel getTreeLabel() {
    return getOrCreateProperty("TreeLabel", "TreeLabel", null, pcftest.ProfilerResultsCV_Elapsed.TreeLabel.class);
  }
  
  public TreeViewForFrame getTreeViewForFrame() {
    return getOrCreateProperty("TreeViewForFrame", "TreeViewForFrame", null, pcftest.ProfilerResultsCV_Elapsed.TreeViewForFrame.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardTab extends ClickableActionElement {
    public CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmptyTab extends ClickableActionElement {
    public EmptyTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackCardTab extends ClickableActionElement {
    public StackCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StacksLV extends PCFElement {
    public StacksLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_Elapsed.StacksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_Elapsed.StacksLV._ListPaging.class);
    }
    
    public frameCountHeader getframeCountHeader() {
      return getOrCreateProperty("frameCountHeader", "frameCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_Elapsed.StacksLV.frameCountHeader.class);
    }
    
    public stackNameHeader getstackNameHeader() {
      return getOrCreateProperty("stackNameHeader", "stackNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_Elapsed.StacksLV.stackNameHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_Elapsed.StacksLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_Elapsed.StacksLV.entry._ViewDetail.class);
      }
      
      public ValueElement getframeCount() {
        return getOrCreateProperty("frameCount", "frameCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getstackName() {
        return getOrCreateProperty("stackName", "stackName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class frameCountHeader extends ValueElement {
      public frameCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class stackNameHeader extends ValueElement {
      public stackNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TreeLabel extends ValueElement {
    public TreeLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TreeViewForFrame extends PCFElement {
    public TreeViewForFrame(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ProfilerTreeView getProfilerTreeView() {
      return getOrCreateProperty("ProfilerTreeView", "ProfilerTreeView", null, pcftest.ProfilerResultsCV_Elapsed.TreeViewForFrame.ProfilerTreeView.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Elapsed.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProfilerTreeView extends TreeViewElement {
      public ProfilerTreeView(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}