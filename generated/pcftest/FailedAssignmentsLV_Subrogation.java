package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.FailedAssignmentsLV_Subrogation.StatusHeader;
import pcftest.FailedAssignmentsLV_Subrogation.SubrogationHeader;
import pcftest.FailedAssignmentsLV_Subrogation._ListPaging;
import pcftest.FailedAssignmentsLV_Subrogation.entry;
import pcftest.FailedAssignmentsLV_Subrogation.entry.Status;
import pcftest.FailedAssignmentsLV_Subrogation.entry._Select;
import pcftest.FailedAssignmentsLV_Subrogation.entry._ViewDetail;
import typekey.SubrogationStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FailedAssignmentsLV_Subrogation extends FailedAssignmentsLV {
  public final static String CHECKSUM = "81d7eb63862e441d3e8290abe724d575";
  
  public FailedAssignmentsLV_Subrogation(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_Subrogation.StatusHeader.class);
  }
  
  public SubrogationHeader getSubrogationHeader() {
    return getOrCreateProperty("SubrogationHeader", "SubrogationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FailedAssignmentsLV_Subrogation.SubrogationHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FailedAssignmentsLV_Subrogation.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FailedAssignmentsLV_Subrogation._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationHeader extends ValueElement {
    public SubrogationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.FailedAssignmentsLV_Subrogation.entry.Status.class);
    }
    
    public ValueElement getSubrogation() {
      return getOrCreateProperty("Subrogation", "Subrogation", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.FailedAssignmentsLV_Subrogation.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FailedAssignmentsLV_Subrogation.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends SelectElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(SubrogationStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public SubrogationStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SubrogationStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(SubrogationStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/FailedAssignmentsLV.Subrogation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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