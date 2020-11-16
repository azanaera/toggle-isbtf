package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.EditableConcurrentEmploymentLV.CompanyNameHeader;
import pcftest.EditableConcurrentEmploymentLV.ContactNumberHeader;
import pcftest.EditableConcurrentEmploymentLV.EndDateHeader;
import pcftest.EditableConcurrentEmploymentLV.FullTimeHeader;
import pcftest.EditableConcurrentEmploymentLV.JobTitleHeader;
import pcftest.EditableConcurrentEmploymentLV.StartDateHeader;
import pcftest.EditableConcurrentEmploymentLV.WeeklyWageHeader;
import pcftest.EditableConcurrentEmploymentLV._ListPaging;
import pcftest.EditableConcurrentEmploymentLV.entry;
import pcftest.EditableConcurrentEmploymentLV.entry._Select;
import pcftest.EditableConcurrentEmploymentLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableConcurrentEmploymentLV extends PCFElement {
  public final static String CHECKSUM = "43d5cd93a841677f7c60938be55966f2";
  
  public EditableConcurrentEmploymentLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CompanyNameHeader getCompanyNameHeader() {
    return getOrCreateProperty("CompanyNameHeader", "CompanyNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableConcurrentEmploymentLV.CompanyNameHeader.class);
  }
  
  public ContactNumberHeader getContactNumberHeader() {
    return getOrCreateProperty("ContactNumberHeader", "ContactNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableConcurrentEmploymentLV.ContactNumberHeader.class);
  }
  
  public EndDateHeader getEndDateHeader() {
    return getOrCreateProperty("EndDateHeader", "EndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableConcurrentEmploymentLV.EndDateHeader.class);
  }
  
  public FullTimeHeader getFullTimeHeader() {
    return getOrCreateProperty("FullTimeHeader", "FullTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableConcurrentEmploymentLV.FullTimeHeader.class);
  }
  
  public JobTitleHeader getJobTitleHeader() {
    return getOrCreateProperty("JobTitleHeader", "JobTitleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableConcurrentEmploymentLV.JobTitleHeader.class);
  }
  
  public StartDateHeader getStartDateHeader() {
    return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableConcurrentEmploymentLV.StartDateHeader.class);
  }
  
  public WeeklyWageHeader getWeeklyWageHeader() {
    return getOrCreateProperty("WeeklyWageHeader", "WeeklyWageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableConcurrentEmploymentLV.WeeklyWageHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableConcurrentEmploymentLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableConcurrentEmploymentLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompanyNameHeader extends ValueElement {
    public CompanyNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactNumberHeader extends ValueElement {
    public ContactNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndDateHeader extends ValueElement {
    public EndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FullTimeHeader extends ValueElement {
    public FullTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JobTitleHeader extends ValueElement {
    public JobTitleHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartDateHeader extends ValueElement {
    public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WeeklyWageHeader extends ValueElement {
    public WeeklyWageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCompanyName() {
      return getOrCreateProperty("CompanyName", "CompanyName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getContactNumber() {
      return getOrCreateProperty("ContactNumber", "ContactNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getEndDate() {
      return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getFullTime() {
      return getOrCreateProperty("FullTime", "FullTime", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getJobTitle() {
      return getOrCreateProperty("JobTitle", "JobTitle", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartDate() {
      return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getWeeklyWage() {
      return getOrCreateProperty("WeeklyWage", "WeeklyWage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableConcurrentEmploymentLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableConcurrentEmploymentLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableConcurrentEmploymentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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