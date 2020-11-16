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
import pcftest.ProfilerFrameGroupLV.ReportsCellHeader;
import pcftest.ProfilerFrameGroupLV._ListPaging;
import pcftest.ProfilerFrameGroupLV.elapsedTimeSDHeader;
import pcftest.ProfilerFrameGroupLV.entry;
import pcftest.ProfilerFrameGroupLV.entry._Select;
import pcftest.ProfilerFrameGroupLV.entry._ViewDetail;
import pcftest.ProfilerFrameGroupLV.entry.entry2;
import pcftest.ProfilerFrameGroupLV.entry.entry2.reportLink;
import pcftest.ProfilerFrameGroupLV.entry.entry2.reportSeparator;
import pcftest.ProfilerFrameGroupLV.frameTimeHeader;
import pcftest.ProfilerFrameGroupLV.frameTimePctHeader;
import pcftest.ProfilerFrameGroupLV.frameTimeSDHeader;
import pcftest.ProfilerFrameGroupLV.meanElapsedTimeHeader;
import pcftest.ProfilerFrameGroupLV.meanFrameTimeHeader;
import pcftest.ProfilerFrameGroupLV.numHeader;
import pcftest.ProfilerFrameGroupLV.pathHeader;
import pcftest.ProfilerFrameGroupLV.propsAndCountersHeader;
import pcftest.ProfilerFrameGroupLV.timeHeader;
import pcftest.ProfilerFrameGroupLV.timePctHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerFrameGroupLV extends PCFElement {
  public final static String CHECKSUM = "1f7b7e345e8194cc84dbaaf6d40aac7a";
  
  public ProfilerFrameGroupLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ReportsCellHeader getReportsCellHeader() {
    return getOrCreateProperty("ReportsCellHeader", "ReportsCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.ReportsCellHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerFrameGroupLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerFrameGroupLV._ListPaging.class);
  }
  
  public elapsedTimeSDHeader getelapsedTimeSDHeader() {
    return getOrCreateProperty("elapsedTimeSDHeader", "elapsedTimeSDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.elapsedTimeSDHeader.class);
  }
  
  public ValueElement getframeTimeFooter() {
    return getOrCreateProperty("frameTimeFooter", "frameTimeFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public frameTimeHeader getframeTimeHeader() {
    return getOrCreateProperty("frameTimeHeader", "frameTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.frameTimeHeader.class);
  }
  
  public ValueElement getframeTimePctFooter() {
    return getOrCreateProperty("frameTimePctFooter", "frameTimePctFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public frameTimePctHeader getframeTimePctHeader() {
    return getOrCreateProperty("frameTimePctHeader", "frameTimePctHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.frameTimePctHeader.class);
  }
  
  public frameTimeSDHeader getframeTimeSDHeader() {
    return getOrCreateProperty("frameTimeSDHeader", "frameTimeSDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.frameTimeSDHeader.class);
  }
  
  public meanElapsedTimeHeader getmeanElapsedTimeHeader() {
    return getOrCreateProperty("meanElapsedTimeHeader", "meanElapsedTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.meanElapsedTimeHeader.class);
  }
  
  public meanFrameTimeHeader getmeanFrameTimeHeader() {
    return getOrCreateProperty("meanFrameTimeHeader", "meanFrameTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.meanFrameTimeHeader.class);
  }
  
  public numHeader getnumHeader() {
    return getOrCreateProperty("numHeader", "numHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.numHeader.class);
  }
  
  public ValueElement getpathFooter() {
    return getOrCreateProperty("pathFooter", "pathFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pathHeader getpathHeader() {
    return getOrCreateProperty("pathHeader", "pathHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.pathHeader.class);
  }
  
  public propsAndCountersHeader getpropsAndCountersHeader() {
    return getOrCreateProperty("propsAndCountersHeader", "propsAndCountersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.propsAndCountersHeader.class);
  }
  
  public timeHeader gettimeHeader() {
    return getOrCreateProperty("timeHeader", "timeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.timeHeader.class);
  }
  
  public timePctHeader gettimePctHeader() {
    return getOrCreateProperty("timePctHeader", "timePctHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerFrameGroupLV.timePctHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportsCellHeader extends ValueElement {
    public ReportsCellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class elapsedTimeSDHeader extends ValueElement {
    public elapsedTimeSDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry2> get_Entries() {
      return getOrCreateEntries(null, pcftest.ProfilerFrameGroupLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerFrameGroupLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerFrameGroupLV.entry._ViewDetail.class);
    }
    
    public ValueElement getelapsedTimeSD() {
      return getOrCreateProperty("elapsedTimeSD", "elapsedTimeSD", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getframeTime() {
      return getOrCreateProperty("frameTime", "frameTime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getframeTimePct() {
      return getOrCreateProperty("frameTimePct", "frameTimePct", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getframeTimeSD() {
      return getOrCreateProperty("frameTimeSD", "frameTimeSD", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getmeanElapsedTime() {
      return getOrCreateProperty("meanElapsedTime", "meanElapsedTime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getmeanFrameTime() {
      return getOrCreateProperty("meanFrameTime", "meanFrameTime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getnum() {
      return getOrCreateProperty("num", "num", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getpath() {
      return getOrCreateProperty("path", "path", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getpropsAndCounters() {
      return getOrCreateProperty("propsAndCounters", "propsAndCounters", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement gettime() {
      return getOrCreateProperty("time", "time", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement gettimePct() {
      return getOrCreateProperty("timePct", "timePct", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry2 extends PCFElement {
      public entry2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public reportLink getreportLink() {
        return getOrCreateProperty("reportLink", "reportLink", null, pcftest.ProfilerFrameGroupLV.entry.entry2.reportLink.class);
      }
      
      public reportSeparator getreportSeparator() {
        return getOrCreateProperty("reportSeparator", "reportSeparator", null, pcftest.ProfilerFrameGroupLV.entry.entry2.reportSeparator.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class reportLink extends ClickableActionElement {
        public reportLink(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class reportSeparator extends ClickableActionElement {
        public reportSeparator(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class frameTimeHeader extends ValueElement {
    public frameTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class frameTimePctHeader extends ValueElement {
    public frameTimePctHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class frameTimeSDHeader extends ValueElement {
    public frameTimeSDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class meanElapsedTimeHeader extends ValueElement {
    public meanElapsedTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class meanFrameTimeHeader extends ValueElement {
    public meanFrameTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class numHeader extends ValueElement {
    public numHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class pathHeader extends ValueElement {
    public pathHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class propsAndCountersHeader extends ValueElement {
    public propsAndCountersHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class timeHeader extends ValueElement {
    public timeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class timePctHeader extends ValueElement {
    public timePctHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}