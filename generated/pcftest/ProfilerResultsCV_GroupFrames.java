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
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerResultsCV_GroupFrames.CardTab;
import pcftest.ProfilerResultsCV_GroupFrames.EmptyTab;
import pcftest.ProfilerResultsCV_GroupFrames.ProfilerFrameGroupLV_tb;
import pcftest.ProfilerResultsCV_GroupFrames.StacksLV;
import pcftest.ProfilerResultsCV_GroupFrames.StacksLV._ListPaging;
import pcftest.ProfilerResultsCV_GroupFrames.StacksLV.elapsedTimeHeader;
import pcftest.ProfilerResultsCV_GroupFrames.StacksLV.entry;
import pcftest.ProfilerResultsCV_GroupFrames.StacksLV.entry._Select;
import pcftest.ProfilerResultsCV_GroupFrames.StacksLV.entry._ViewDetail;
import pcftest.ProfilerResultsCV_GroupFrames.StacksLV.entry.reportLink;
import pcftest.ProfilerResultsCV_GroupFrames.StacksLV.frameCountHeader;
import pcftest.ProfilerResultsCV_GroupFrames.StacksLV.stackNameHeader;
import pcftest.ProfilerResultsCV_GroupFrames.stackCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_GroupFrames extends ProfilerResultsCV {
  public final static String CHECKSUM = "c8ed8b0e1d1091003775894d9190357a";
  
  public ProfilerResultsCV_GroupFrames(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CardTab getCardTab() {
    return getOrCreateProperty("CardTab", "CardTab", null, pcftest.ProfilerResultsCV_GroupFrames.CardTab.class);
  }
  
  public EmptyTab getEmptyTab() {
    return getOrCreateProperty("EmptyTab", "EmptyTab", null, pcftest.ProfilerResultsCV_GroupFrames.EmptyTab.class);
  }
  
  public ProfilerFrameGroupLV getProfilerFrameGroupLV() {
    return getOrCreateProperty("ProfilerFrameGroupLV", "ProfilerFrameGroupLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerFrameGroupLV.class);
  }
  
  public ProfilerFrameGroupLV_tb getProfilerFrameGroupLV_tb() {
    return getOrCreateProperty("ProfilerFrameGroupLV_tb", "ProfilerFrameGroupLV_tb", null, pcftest.ProfilerResultsCV_GroupFrames.ProfilerFrameGroupLV_tb.class);
  }
  
  public ProfilerResultsEmptyDV getProfilerResultsEmptyDV() {
    return getOrCreateProperty("ProfilerResultsEmptyDV", "ProfilerResultsEmptyDV", null, pcftest.ProfilerResultsEmptyDV.class);
  }
  
  public StacksLV getStacksLV() {
    return getOrCreateProperty("StacksLV", "StacksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_GroupFrames.StacksLV.class);
  }
  
  public ValueElement getframes() {
    return getOrCreateProperty("frames", "frames", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public stackCardTab getstackCardTab() {
    return getOrCreateProperty("stackCardTab", "stackCardTab", null, pcftest.ProfilerResultsCV_GroupFrames.stackCardTab.class);
  }
  
  public ValueElement gettime() {
    return getOrCreateProperty("time", "time", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardTab extends ClickableActionElement {
    public CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmptyTab extends ClickableActionElement {
    public EmptyTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerFrameGroupLV_tb extends PCFElement {
    public ProfilerFrameGroupLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StacksLV extends PCFElement {
    public StacksLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_GroupFrames.StacksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_GroupFrames.StacksLV._ListPaging.class);
    }
    
    public elapsedTimeHeader getelapsedTimeHeader() {
      return getOrCreateProperty("elapsedTimeHeader", "elapsedTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_GroupFrames.StacksLV.elapsedTimeHeader.class);
    }
    
    public frameCountHeader getframeCountHeader() {
      return getOrCreateProperty("frameCountHeader", "frameCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_GroupFrames.StacksLV.frameCountHeader.class);
    }
    
    public stackNameHeader getstackNameHeader() {
      return getOrCreateProperty("stackNameHeader", "stackNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_GroupFrames.StacksLV.stackNameHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class elapsedTimeHeader extends ValueElement {
      public elapsedTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_GroupFrames.StacksLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_GroupFrames.StacksLV.entry._ViewDetail.class);
      }
      
      public ValueElement getelapsedTime() {
        return getOrCreateProperty("elapsedTime", "elapsedTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getframeCount() {
        return getOrCreateProperty("frameCount", "frameCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public reportLink getreportLink() {
        return getOrCreateProperty("reportLink", "reportLink", null, pcftest.ProfilerResultsCV_GroupFrames.StacksLV.entry.reportLink.class);
      }
      
      public ValueElement getstackName() {
        return getOrCreateProperty("stackName", "stackName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class frameCountHeader extends ValueElement {
      public frameCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.GroupFrames.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class stackCardTab extends ClickableActionElement {
    public stackCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}