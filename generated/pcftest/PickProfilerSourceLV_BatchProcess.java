package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PickProfilerSourceLV_BatchProcess.BatchProcessHeader;
import pcftest.PickProfilerSourceLV_BatchProcess.CompleteDateHeader;
import pcftest.PickProfilerSourceLV_BatchProcess.DescriptionHeader;
import pcftest.PickProfilerSourceLV_BatchProcess.RanToCompletionHeader;
import pcftest.PickProfilerSourceLV_BatchProcess.StartDateHeader;
import pcftest.PickProfilerSourceLV_BatchProcess._ListPaging;
import pcftest.PickProfilerSourceLV_BatchProcess.entry;
import pcftest.PickProfilerSourceLV_BatchProcess.entry.BatchProcess;
import pcftest.PickProfilerSourceLV_BatchProcess.entry._Select;
import pcftest.PickProfilerSourceLV_BatchProcess.entry._ViewDetail;
import typekey.BatchProcessType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PickProfilerSourceLV_BatchProcess extends PickProfilerSourceLV {
  public final static String CHECKSUM = "a0bfcb686d2496964fa8699ddde198ef";
  
  public PickProfilerSourceLV_BatchProcess(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BatchProcessHeader getBatchProcessHeader() {
    return getOrCreateProperty("BatchProcessHeader", "BatchProcessHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_BatchProcess.BatchProcessHeader.class);
  }
  
  public CompleteDateHeader getCompleteDateHeader() {
    return getOrCreateProperty("CompleteDateHeader", "CompleteDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_BatchProcess.CompleteDateHeader.class);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_BatchProcess.DescriptionHeader.class);
  }
  
  public RanToCompletionHeader getRanToCompletionHeader() {
    return getOrCreateProperty("RanToCompletionHeader", "RanToCompletionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_BatchProcess.RanToCompletionHeader.class);
  }
  
  public StartDateHeader getStartDateHeader() {
    return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_BatchProcess.StartDateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PickProfilerSourceLV_BatchProcess.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PickProfilerSourceLV_BatchProcess._ListPaging.class);
  }
  
  public SelectElement getbatchProcessTypeChooser() {
    return getOrCreateProperty("batchProcessTypeChooser", "batchProcessTypeChooser", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessHeader extends ValueElement {
    public BatchProcessHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompleteDateHeader extends ValueElement {
    public CompleteDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RanToCompletionHeader extends ValueElement {
    public RanToCompletionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartDateHeader extends ValueElement {
    public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BatchProcess getBatchProcess() {
      return getOrCreateProperty("BatchProcess", "BatchProcess", null, pcftest.PickProfilerSourceLV_BatchProcess.entry.BatchProcess.class);
    }
    
    public DateElement getCompleteDate() {
      return getOrCreateProperty("CompleteDate", "CompleteDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getRanToCompletion() {
      return getOrCreateProperty("RanToCompletion", "RanToCompletion", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public DateElement getStartDate() {
      return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PickProfilerSourceLV_BatchProcess.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PickProfilerSourceLV_BatchProcess.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BatchProcess extends SelectElement {
      public BatchProcess(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(BatchProcessType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public BatchProcessType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BatchProcessType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(BatchProcessType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.BatchProcess.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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