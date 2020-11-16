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
import pcftest.UserMattersLV.AssignedUserHeader;
import pcftest.UserMattersLV.CaseNumberHeader;
import pcftest.UserMattersLV.EstSettleCostHeader;
import pcftest.UserMattersLV.NameHeader;
import pcftest.UserMattersLV.TrialDateHeader;
import pcftest.UserMattersLV._ListPaging;
import pcftest.UserMattersLV.entry;
import pcftest.UserMattersLV.entry.Name;
import pcftest.UserMattersLV.entry._Select;
import pcftest.UserMattersLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserMattersLV extends PCFElement {
  public final static String CHECKSUM = "c90a78aa8d939debd8b9fa3b0a6620fb";
  
  public UserMattersLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignedUserHeader getAssignedUserHeader() {
    return getOrCreateProperty("AssignedUserHeader", "AssignedUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserMattersLV.AssignedUserHeader.class);
  }
  
  public CaseNumberHeader getCaseNumberHeader() {
    return getOrCreateProperty("CaseNumberHeader", "CaseNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserMattersLV.CaseNumberHeader.class);
  }
  
  public EstSettleCostHeader getEstSettleCostHeader() {
    return getOrCreateProperty("EstSettleCostHeader", "EstSettleCostHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserMattersLV.EstSettleCostHeader.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserMattersLV.NameHeader.class);
  }
  
  public TrialDateHeader getTrialDateHeader() {
    return getOrCreateProperty("TrialDateHeader", "TrialDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UserMattersLV.TrialDateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.UserMattersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.UserMattersLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedUserHeader extends ValueElement {
    public AssignedUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CaseNumberHeader extends ValueElement {
    public CaseNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EstSettleCostHeader extends ValueElement {
    public EstSettleCostHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TrialDateHeader extends ValueElement {
    public TrialDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAssignedUser() {
      return getOrCreateProperty("AssignedUser", "AssignedUser", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCaseNumber() {
      return getOrCreateProperty("CaseNumber", "CaseNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEstSettleCost() {
      return getOrCreateProperty("EstSettleCost", "EstSettleCost", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Name getName() {
      return getOrCreateProperty("Name", "Name", null, pcftest.UserMattersLV.entry.Name.class);
    }
    
    public DateElement getTrialDate() {
      return getOrCreateProperty("TrialDate", "TrialDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.UserMattersLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.UserMattersLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Name extends ValueElement {
      public Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserMattersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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