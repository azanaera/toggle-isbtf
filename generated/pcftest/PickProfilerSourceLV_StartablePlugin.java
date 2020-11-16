package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PickProfilerSourceLV_StartablePlugin.CompleteDateHeader;
import pcftest.PickProfilerSourceLV_StartablePlugin.ServiceNameHeader;
import pcftest.PickProfilerSourceLV_StartablePlugin.StartDateHeader;
import pcftest.PickProfilerSourceLV_StartablePlugin._ListPaging;
import pcftest.PickProfilerSourceLV_StartablePlugin.entry;
import pcftest.PickProfilerSourceLV_StartablePlugin.entry._Select;
import pcftest.PickProfilerSourceLV_StartablePlugin.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PickProfilerSourceLV_StartablePlugin extends PickProfilerSourceLV {
  public final static String CHECKSUM = "7ab7987a58b5606d8cb3795b67581d0e";
  
  public PickProfilerSourceLV_StartablePlugin(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CompleteDateHeader getCompleteDateHeader() {
    return getOrCreateProperty("CompleteDateHeader", "CompleteDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_StartablePlugin.CompleteDateHeader.class);
  }
  
  public ServiceNameHeader getServiceNameHeader() {
    return getOrCreateProperty("ServiceNameHeader", "ServiceNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_StartablePlugin.ServiceNameHeader.class);
  }
  
  public StartDateHeader getStartDateHeader() {
    return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_StartablePlugin.StartDateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PickProfilerSourceLV_StartablePlugin.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PickProfilerSourceLV_StartablePlugin._ListPaging.class);
  }
  
  public SelectElement getstartablePluginChooser() {
    return getOrCreateProperty("startablePluginChooser", "startablePluginChooser", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompleteDateHeader extends ValueElement {
    public CompleteDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceNameHeader extends ValueElement {
    public ServiceNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartDateHeader extends ValueElement {
    public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getCompleteDate() {
      return getOrCreateProperty("CompleteDate", "CompleteDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getServiceName() {
      return getOrCreateProperty("ServiceName", "ServiceName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartDate() {
      return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PickProfilerSourceLV_StartablePlugin.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PickProfilerSourceLV_StartablePlugin.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.StartablePlugin.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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