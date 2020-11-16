package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerResultsCV_Chrono.CardTab;
import pcftest.ProfilerResultsCV_Chrono.ChronoLV;
import pcftest.ProfilerResultsCV_Chrono.ChronoLV.elapsedTimeHeader;
import pcftest.ProfilerResultsCV_Chrono.ChronoLV.entry.expandCollapse;
import pcftest.ProfilerResultsCV_Chrono.ChronoLV.frameTimeHeader;
import pcftest.ProfilerResultsCV_Chrono.ChronoLV.nameHeader;
import pcftest.ProfilerResultsCV_Chrono.ChronoLV.offsetHeader;
import pcftest.ProfilerResultsCV_Chrono.ChronoLV.propsAndCountersHeader;
import pcftest.ProfilerResultsCV_Chrono.ChronoLV_tb;
import pcftest.ProfilerResultsCV_Chrono.ChronoLV_tb.Collapse;
import pcftest.ProfilerResultsCV_Chrono.ChronoLV_tb.Expand;
import pcftest.ProfilerResultsCV_Chrono.EmptyTab;
import pcftest.ProfilerResultsCV_Chrono.StackCardTab;
import pcftest.ProfilerResultsCV_Chrono.StacksLV;
import pcftest.ProfilerResultsCV_Chrono.StacksLV.StartTmeHeader;
import pcftest.ProfilerResultsCV_Chrono.StacksLV._ListPaging;
import pcftest.ProfilerResultsCV_Chrono.StacksLV.entry.reportLink;
import pcftest.ProfilerResultsCV_Chrono.StacksLV.frameCountHeader;
import pcftest.ProfilerResultsCV_Chrono.StacksLV.stackNameHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_Chrono extends ProfilerResultsCV {
  public final static String CHECKSUM = "3470da092cdc90a03f975062a54a24dc";
  
  public ProfilerResultsCV_Chrono(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CardTab getCardTab() {
    return getOrCreateProperty("CardTab", "CardTab", null, pcftest.ProfilerResultsCV_Chrono.CardTab.class);
  }
  
  public ChronoLV getChronoLV() {
    return getOrCreateProperty("ChronoLV", "ChronoLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_Chrono.ChronoLV.class);
  }
  
  public ChronoLV_tb getChronoLV_tb() {
    return getOrCreateProperty("ChronoLV_tb", "ChronoLV_tb", null, pcftest.ProfilerResultsCV_Chrono.ChronoLV_tb.class);
  }
  
  public EmptyTab getEmptyTab() {
    return getOrCreateProperty("EmptyTab", "EmptyTab", null, pcftest.ProfilerResultsCV_Chrono.EmptyTab.class);
  }
  
  public ProfilerResultsEmptyDV getProfilerResultsEmptyDV() {
    return getOrCreateProperty("ProfilerResultsEmptyDV", "ProfilerResultsEmptyDV", null, pcftest.ProfilerResultsEmptyDV.class);
  }
  
  public StackCardTab getStackCardTab() {
    return getOrCreateProperty("StackCardTab", "StackCardTab", null, pcftest.ProfilerResultsCV_Chrono.StackCardTab.class);
  }
  
  public StacksLV getStacksLV() {
    return getOrCreateProperty("StacksLV", "StacksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_Chrono.StacksLV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardTab extends ClickableActionElement {
    public CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChronoLV extends PCFElement {
    public ChronoLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.ProfilerResultsCV_Chrono.ChronoLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.ProfilerResultsCV_Chrono.ChronoLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public elapsedTimeHeader getelapsedTimeHeader() {
      return getOrCreateProperty("elapsedTimeHeader", "elapsedTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_Chrono.ChronoLV.elapsedTimeHeader.class);
    }
    
    public frameTimeHeader getframeTimeHeader() {
      return getOrCreateProperty("frameTimeHeader", "frameTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_Chrono.ChronoLV.frameTimeHeader.class);
    }
    
    public nameHeader getnameHeader() {
      return getOrCreateProperty("nameHeader", "nameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_Chrono.ChronoLV.nameHeader.class);
    }
    
    public offsetHeader getoffsetHeader() {
      return getOrCreateProperty("offsetHeader", "offsetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_Chrono.ChronoLV.offsetHeader.class);
    }
    
    public propsAndCountersHeader getpropsAndCountersHeader() {
      return getOrCreateProperty("propsAndCountersHeader", "propsAndCountersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_Chrono.ChronoLV.propsAndCountersHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class elapsedTimeHeader extends ValueElement {
      public elapsedTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ProfilerResultsCV_Chrono.ChronoLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.ProfilerResultsCV_Chrono.ChronoLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.ProfilerResultsCV_Chrono.ChronoLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_Chrono.ChronoLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_Chrono.ChronoLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_Chrono.ChronoLV.entry._ViewDetail.class);
      }
      
      public ValueElement getcontainerLabel() {
        return getOrCreateProperty("containerLabel", "containerLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getelapsedTime() {
        return getOrCreateProperty("elapsedTime", "elapsedTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public expandCollapse getexpandCollapse() {
        return getOrCreateProperty("expandCollapse", "expandCollapse", gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeToggle, pcftest.ProfilerResultsCV_Chrono.ChronoLV.entry.expandCollapse.class);
      }
      
      public ValueElement getframeTime() {
        return getOrCreateProperty("frameTime", "frameTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getname() {
        return getOrCreateProperty("name", "name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getoffset() {
        return getOrCreateProperty("offset", "offset", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getpropsAndCounters() {
        return getOrCreateProperty("propsAndCounters", "propsAndCounters", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class expandCollapse extends ClickableActionElement {
        public expandCollapse(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class frameTimeHeader extends ValueElement {
      public frameTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class nameHeader extends ValueElement {
      public nameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class offsetHeader extends ValueElement {
      public offsetHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class propsAndCountersHeader extends ValueElement {
      public propsAndCountersHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChronoLV_tb extends PCFElement {
    public ChronoLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Collapse getCollapse() {
      return getOrCreateProperty("Collapse", "Collapse", null, pcftest.ProfilerResultsCV_Chrono.ChronoLV_tb.Collapse.class);
    }
    
    public Expand getExpand() {
      return getOrCreateProperty("Expand", "Expand", null, pcftest.ProfilerResultsCV_Chrono.ChronoLV_tb.Expand.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Collapse extends ClickableActionElement {
      public Collapse(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Expand extends ClickableActionElement {
      public Expand(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmptyTab extends ClickableActionElement {
    public EmptyTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackCardTab extends ClickableActionElement {
    public StackCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StacksLV extends PCFElement {
    public StacksLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StartTmeHeader getStartTmeHeader() {
      return getOrCreateProperty("StartTmeHeader", "StartTmeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_Chrono.StacksLV.StartTmeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ProfilerResultsCV_Chrono.StacksLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_Chrono.StacksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_Chrono.StacksLV._ListPaging.class);
    }
    
    public frameCountHeader getframeCountHeader() {
      return getOrCreateProperty("frameCountHeader", "frameCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_Chrono.StacksLV.frameCountHeader.class);
    }
    
    public stackNameHeader getstackNameHeader() {
      return getOrCreateProperty("stackNameHeader", "stackNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_Chrono.StacksLV.stackNameHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartTmeHeader extends ValueElement {
      public StartTmeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getStartTme() {
        return getOrCreateProperty("StartTme", "StartTme", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ProfilerResultsCV_Chrono.StacksLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_Chrono.StacksLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_Chrono.StacksLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_Chrono.StacksLV.entry._ViewDetail.class);
      }
      
      public ValueElement getframeCount() {
        return getOrCreateProperty("frameCount", "frameCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public reportLink getreportLink() {
        return getOrCreateProperty("reportLink", "reportLink", null, pcftest.ProfilerResultsCV_Chrono.StacksLV.entry.reportLink.class);
      }
      
      public ValueElement getstackName() {
        return getOrCreateProperty("stackName", "stackName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class reportLink extends ClickableActionElement {
        public reportLink(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class frameCountHeader extends ValueElement {
      public frameCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.Chrono.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class stackNameHeader extends ValueElement {
      public stackNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}