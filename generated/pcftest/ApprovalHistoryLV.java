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
import pcftest.ApprovalHistoryLV.ApprovalHistory_DateHeader;
import pcftest.ApprovalHistoryLV.ApprovalIssueHeader;
import pcftest.ApprovalHistoryLV.ApprovalRationaleHeader;
import pcftest.ApprovalHistoryLV.ApprovedHeader;
import pcftest.ApprovalHistoryLV.UserHeader;
import pcftest.ApprovalHistoryLV._ListPaging;
import pcftest.ApprovalHistoryLV.entry;
import pcftest.ApprovalHistoryLV.entry._Select;
import pcftest.ApprovalHistoryLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ApprovalHistoryLV extends PCFElement {
  public final static String CHECKSUM = "add6590e536f191b291d6995c3c22810";
  
  public ApprovalHistoryLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApprovalHistory_DateHeader getApprovalHistory_DateHeader() {
    return getOrCreateProperty("ApprovalHistory_DateHeader", "ApprovalHistory_DateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ApprovalHistoryLV.ApprovalHistory_DateHeader.class);
  }
  
  public ApprovalIssueHeader getApprovalIssueHeader() {
    return getOrCreateProperty("ApprovalIssueHeader", "ApprovalIssueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ApprovalHistoryLV.ApprovalIssueHeader.class);
  }
  
  public ApprovalRationaleHeader getApprovalRationaleHeader() {
    return getOrCreateProperty("ApprovalRationaleHeader", "ApprovalRationaleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ApprovalHistoryLV.ApprovalRationaleHeader.class);
  }
  
  public ApprovedHeader getApprovedHeader() {
    return getOrCreateProperty("ApprovedHeader", "ApprovedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ApprovalHistoryLV.ApprovedHeader.class);
  }
  
  public UserHeader getUserHeader() {
    return getOrCreateProperty("UserHeader", "UserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ApprovalHistoryLV.UserHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ApprovalHistoryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ApprovalHistoryLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalHistory_DateHeader extends ValueElement {
    public ApprovalHistory_DateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalIssueHeader extends ValueElement {
    public ApprovalIssueHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalRationaleHeader extends ValueElement {
    public ApprovalRationaleHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovedHeader extends ValueElement {
    public ApprovedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserHeader extends ValueElement {
    public UserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getApprovalHistory_Date() {
      return getOrCreateProperty("ApprovalHistory_Date", "ApprovalHistory_Date", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getApprovalIssue() {
      return getOrCreateProperty("ApprovalIssue", "ApprovalIssue", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getApprovalRationale() {
      return getOrCreateProperty("ApprovalRationale", "ApprovalRationale", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getApproved() {
      return getOrCreateProperty("Approved", "Approved", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getUser() {
      return getOrCreateProperty("User", "User", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ApprovalHistoryLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ApprovalHistoryLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ApprovalHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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