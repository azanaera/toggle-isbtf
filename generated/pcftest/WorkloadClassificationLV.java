package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkloadClassificationLV.EntityAssignmentTypeHeader;
import pcftest.WorkloadClassificationLV.LossTypeHeader;
import pcftest.WorkloadClassificationLV.NameHeader;
import pcftest.WorkloadClassificationLV.PriorityHeader;
import pcftest.WorkloadClassificationLV.StatusHeader;
import pcftest.WorkloadClassificationLV.TotalFactorHeader;
import pcftest.WorkloadClassificationLV._ListPaging;
import pcftest.WorkloadClassificationLV.entry;
import pcftest.WorkloadClassificationLV.entry.Name;
import pcftest.WorkloadClassificationLV.entry._Select;
import pcftest.WorkloadClassificationLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkloadClassificationLV extends PCFElement {
  public final static String CHECKSUM = "4126814ae9744f9518e21332b6692bdb";
  
  public WorkloadClassificationLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EntityAssignmentTypeHeader getEntityAssignmentTypeHeader() {
    return getOrCreateProperty("EntityAssignmentTypeHeader", "EntityAssignmentTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkloadClassificationLV.EntityAssignmentTypeHeader.class);
  }
  
  public LossTypeHeader getLossTypeHeader() {
    return getOrCreateProperty("LossTypeHeader", "LossTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkloadClassificationLV.LossTypeHeader.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkloadClassificationLV.NameHeader.class);
  }
  
  public PriorityHeader getPriorityHeader() {
    return getOrCreateProperty("PriorityHeader", "PriorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkloadClassificationLV.PriorityHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkloadClassificationLV.StatusHeader.class);
  }
  
  public TotalFactorHeader getTotalFactorHeader() {
    return getOrCreateProperty("TotalFactorHeader", "TotalFactorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkloadClassificationLV.TotalFactorHeader.class);
  }
  
  public SelectElement getWeightedAssignmentRulesFilter() {
    return getOrCreateProperty("WeightedAssignmentRulesFilter", "WeightedAssignmentRulesFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkloadClassificationLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WorkloadClassificationLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EntityAssignmentTypeHeader extends ValueElement {
    public EntityAssignmentTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossTypeHeader extends ValueElement {
    public LossTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorityHeader extends ValueElement {
    public PriorityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalFactorHeader extends ValueElement {
    public TotalFactorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getEntityAssignmentType() {
      return getOrCreateProperty("EntityAssignmentType", "EntityAssignmentType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.WorkloadClassificationLV.entry.LossType getLossType() {
      return getOrCreateProperty("LossType", "LossType", null, pcftest.WorkloadClassificationLV.entry.LossType.class);
    }
    
    public Name getName() {
      return getOrCreateProperty("Name", "Name", null, pcftest.WorkloadClassificationLV.entry.Name.class);
    }
    
    public ValueElement getPriority() {
      return getOrCreateProperty("Priority", "Priority", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getStatus() {
      return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getTotalFactor() {
      return getOrCreateProperty("TotalFactor", "TotalFactor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkloadClassificationLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkloadClassificationLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossType extends SelectElement {
      public LossType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LossType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LossType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LossType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Name extends ValueElement {
      public Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WorkloadClassificationDetailPopup click() {
        return clickThis(pcftest.WorkloadClassificationDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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