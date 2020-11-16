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
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DesktopAwaitingAssignmentLV.AssignedUserHeader;
import pcftest.DesktopAwaitingAssignmentLV.AssignerHeader;
import pcftest.DesktopAwaitingAssignmentLV.CaseIDHeader;
import pcftest.DesktopAwaitingAssignmentLV.DueDateHeader;
import pcftest.DesktopAwaitingAssignmentLV.EscalatedHeader;
import pcftest.DesktopAwaitingAssignmentLV.ExposureHeader;
import pcftest.DesktopAwaitingAssignmentLV.InfoHeader;
import pcftest.DesktopAwaitingAssignmentLV.InsuredHeader;
import pcftest.DesktopAwaitingAssignmentLV.NewActivityHeader;
import pcftest.DesktopAwaitingAssignmentLV._ListPaging;
import pcftest.DesktopAwaitingAssignmentLV.entry;
import pcftest.DesktopAwaitingAssignmentLV.entry.CaseID;
import pcftest.DesktopAwaitingAssignmentLV.entry.Insured;
import pcftest.DesktopAwaitingAssignmentLV.entry._Select;
import pcftest.DesktopAwaitingAssignmentLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopAwaitingAssignmentLV extends PCFElement {
  public final static String CHECKSUM = "65d42404609041b04d0ef33dc1086797";
  
  public DesktopAwaitingAssignmentLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignedUserHeader getAssignedUserHeader() {
    return getOrCreateProperty("AssignedUserHeader", "AssignedUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopAwaitingAssignmentLV.AssignedUserHeader.class);
  }
  
  public AssignerHeader getAssignerHeader() {
    return getOrCreateProperty("AssignerHeader", "AssignerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopAwaitingAssignmentLV.AssignerHeader.class);
  }
  
  public CaseIDHeader getCaseIDHeader() {
    return getOrCreateProperty("CaseIDHeader", "CaseIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopAwaitingAssignmentLV.CaseIDHeader.class);
  }
  
  public SelectElement getDesktopAwaitingAssignmentFilter() {
    return getOrCreateProperty("DesktopAwaitingAssignmentFilter", "DesktopAwaitingAssignmentFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public DueDateHeader getDueDateHeader() {
    return getOrCreateProperty("DueDateHeader", "DueDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopAwaitingAssignmentLV.DueDateHeader.class);
  }
  
  public EscalatedHeader getEscalatedHeader() {
    return getOrCreateProperty("EscalatedHeader", "EscalatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopAwaitingAssignmentLV.EscalatedHeader.class);
  }
  
  public ExposureHeader getExposureHeader() {
    return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopAwaitingAssignmentLV.ExposureHeader.class);
  }
  
  public InfoHeader getInfoHeader() {
    return getOrCreateProperty("InfoHeader", "InfoHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopAwaitingAssignmentLV.InfoHeader.class);
  }
  
  public InsuredHeader getInsuredHeader() {
    return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopAwaitingAssignmentLV.InsuredHeader.class);
  }
  
  public NewActivityHeader getNewActivityHeader() {
    return getOrCreateProperty("NewActivityHeader", "NewActivityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopAwaitingAssignmentLV.NewActivityHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DesktopAwaitingAssignmentLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DesktopAwaitingAssignmentLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedUserHeader extends ValueElement {
    public AssignedUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignerHeader extends ValueElement {
    public AssignerHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CaseIDHeader extends ValueElement {
    public CaseIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DueDateHeader extends ValueElement {
    public DueDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalatedHeader extends ValueElement {
    public EscalatedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureHeader extends ValueElement {
    public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InfoHeader extends ValueElement {
    public InfoHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuredHeader extends ValueElement {
    public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewActivityHeader extends ValueElement {
    public NewActivityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAssignedUser() {
      return getOrCreateProperty("AssignedUser", "AssignedUser", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getAssigner() {
      return getOrCreateProperty("Assigner", "Assigner", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CaseID getCaseID() {
      return getOrCreateProperty("CaseID", "CaseID", null, pcftest.DesktopAwaitingAssignmentLV.entry.CaseID.class);
    }
    
    public DateElement getDueDate() {
      return getOrCreateProperty("DueDate", "DueDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getEscalated() {
      return getOrCreateProperty("Escalated", "Escalated", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInfo() {
      return getOrCreateProperty("Info", "Info", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Insured getInsured() {
      return getOrCreateProperty("Insured", "Insured", null, pcftest.DesktopAwaitingAssignmentLV.entry.Insured.class);
    }
    
    public BooleanValueElement getNewActivity() {
      return getOrCreateProperty("NewActivity", "NewActivity", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.DesktopAwaitingAssignmentLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DesktopAwaitingAssignmentLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CaseID extends ValueElement {
      public CaseID(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Insured extends ValueElement {
      public Insured(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignmentLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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