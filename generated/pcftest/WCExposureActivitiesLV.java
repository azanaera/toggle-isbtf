package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.WCExposureActivitiesLV.AssignedUserHeader;
import pcftest.WCExposureActivitiesLV.DueDateHeader;
import pcftest.WCExposureActivitiesLV.PriorityHeader;
import pcftest.WCExposureActivitiesLV.SubjectHeader;
import pcftest.WCExposureActivitiesLV._ListPaging;
import pcftest.WCExposureActivitiesLV.entry;
import pcftest.WCExposureActivitiesLV.entry.AssignedUser;
import pcftest.WCExposureActivitiesLV.entry.Subject;
import pcftest.WCExposureActivitiesLV.entry._Select;
import pcftest.WCExposureActivitiesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCExposureActivitiesLV extends PCFElement {
  public final static String CHECKSUM = "5a481a3bd21e14ac7259d818fe901c63";
  
  public WCExposureActivitiesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignedUserHeader getAssignedUserHeader() {
    return getOrCreateProperty("AssignedUserHeader", "AssignedUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCExposureActivitiesLV.AssignedUserHeader.class);
  }
  
  public DueDateHeader getDueDateHeader() {
    return getOrCreateProperty("DueDateHeader", "DueDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCExposureActivitiesLV.DueDateHeader.class);
  }
  
  public PriorityHeader getPriorityHeader() {
    return getOrCreateProperty("PriorityHeader", "PriorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCExposureActivitiesLV.PriorityHeader.class);
  }
  
  public SubjectHeader getSubjectHeader() {
    return getOrCreateProperty("SubjectHeader", "SubjectHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCExposureActivitiesLV.SubjectHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WCExposureActivitiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WCExposureActivitiesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedUserHeader extends ValueElement {
    public AssignedUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DueDateHeader extends ValueElement {
    public DueDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorityHeader extends ValueElement {
    public PriorityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubjectHeader extends ValueElement {
    public SubjectHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssignedUser getAssignedUser() {
      return getOrCreateProperty("AssignedUser", "AssignedUser", null, pcftest.WCExposureActivitiesLV.entry.AssignedUser.class);
    }
    
    public DateElement getDueDate() {
      return getOrCreateProperty("DueDate", "DueDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public pcftest.WCExposureActivitiesLV.entry.Priority getPriority() {
      return getOrCreateProperty("Priority", "Priority", null, pcftest.WCExposureActivitiesLV.entry.Priority.class);
    }
    
    public Subject getSubject() {
      return getOrCreateProperty("Subject", "Subject", null, pcftest.WCExposureActivitiesLV.entry.Subject.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.WCExposureActivitiesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WCExposureActivitiesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignedUser extends ValueElement {
      public AssignedUser(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserContactDetailPopup click() {
        return clickThis(pcftest.UserContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Priority extends SelectElement {
      public Priority(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.Priority arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.Priority getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Priority.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.Priority arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Subject extends ValueElement {
      public Subject(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/WCExposureActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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