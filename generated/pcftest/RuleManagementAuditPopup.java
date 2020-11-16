package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleManagementAuditPopup.AllVersionsLV;
import pcftest.RuleManagementAuditPopup.AllVersionsLV.ActitivityHeader;
import pcftest.RuleManagementAuditPopup.AllVersionsLV.ActivityGroupHeader;
import pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows;
import pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows.entry.entry2;
import pcftest.RuleManagementAuditPopup.AllVersionsLV_tb;
import pcftest.RuleManagementAuditPopup.RuleManagementAuditPopup_UpLink;
import pcftest.RuleManagementAuditPopup.VersionViewPanelSet;
import pcftest.RuleManagementAuditPopup.VersionViewPanelSet.ActivityHeader;
import pcftest.RuleManagementAuditPopup.VersionViewPanelSet.DateHeader;
import pcftest.RuleManagementAuditPopup.VersionViewPanelSet.ImportDateHeader;
import pcftest.RuleManagementAuditPopup.VersionViewPanelSet.ImportUserHeader;
import pcftest.RuleManagementAuditPopup.VersionViewPanelSet.SystemIdHeader;
import pcftest.RuleManagementAuditPopup.VersionViewPanelSet.UserHeader;
import pcftest.RuleManagementAuditPopup._Paging;
import pcftest.RuleManagementAuditPopup.__crumb__;
import pcftest.RuleManagementAuditPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleManagementAuditPopup extends PCFLocation {
  public final static String CHECKSUM = "7bd303705bfc45a2aae6266d564de4c4";
  
  public RuleManagementAuditPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RuleManagementAuditPopup"));
  }
  
  public AllVersionsLV getAllVersionsLV() {
    return getOrCreateProperty("AllVersionsLV", "AllVersionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RuleManagementAuditPopup.AllVersionsLV.class);
  }
  
  public AllVersionsLV_tb getAllVersionsLV_tb() {
    return getOrCreateProperty("AllVersionsLV_tb", "AllVersionsLV_tb", null, pcftest.RuleManagementAuditPopup.AllVersionsLV_tb.class);
  }
  
  public RuleManagementAuditPopup_UpLink getRuleManagementAuditPopup_UpLink() {
    return getOrCreateProperty("RuleManagementAuditPopup_UpLink", "RuleManagementAuditPopup_UpLink", null, pcftest.RuleManagementAuditPopup.RuleManagementAuditPopup_UpLink.class);
  }
  
  public SelectElement getVersion() {
    return getOrCreateProperty("Version", "Version", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public VersionViewPanelSet getVersionViewPanelSet() {
    return getOrCreateProperty("VersionViewPanelSet", "VersionViewPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleManagementAuditPopup.VersionViewPanelSet.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RuleManagementAuditPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RuleManagementAuditPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RuleManagementAuditPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AllVersionsLV extends PCFElement {
    public AllVersionsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActitivityHeader getActitivityHeader() {
      return getOrCreateProperty("ActitivityHeader", "ActitivityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.CellIterator, pcftest.RuleManagementAuditPopup.AllVersionsLV.ActitivityHeader.class);
    }
    
    public ActivityGroupHeader getActivityGroupHeader() {
      return getOrCreateProperty("ActivityGroupHeader", "ActivityGroupHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.CellIterator, pcftest.RuleManagementAuditPopup.AllVersionsLV.ActivityGroupHeader.class);
    }
    
    public ValueElement getAvailableHeader() {
      return getOrCreateProperty("AvailableHeader", "AvailableHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEmptyCell1() {
      return getOrCreateProperty("EmptyCell1", "EmptyCell1", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEmptyCell2() {
      return getOrCreateProperty("EmptyCell2", "EmptyCell2", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEmptyCell3() {
      return getOrCreateProperty("EmptyCell3", "EmptyCell3", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Rows getRows() {
      return getOrCreateProperty("Rows", "Rows", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows.class);
    }
    
    public ValueElement getVersionHeader() {
      return getOrCreateProperty("VersionHeader", "VersionHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.RuleManagementAuditPopup.AllVersionsLV._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleManagementAuditPopup.AllVersionsLV._Select.class);
    }
    
    public pcftest.RuleManagementAuditPopup.AllVersionsLV._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleManagementAuditPopup.AllVersionsLV._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActitivityHeader extends PCFElement {
      public ActitivityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.RuleManagementAuditPopup.AllVersionsLV.ActitivityHeader.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.RuleManagementAuditPopup.AllVersionsLV.ActitivityHeader.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDateHeader() {
          return getOrCreateProperty("DateHeader", "DateHeader", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getSystemHeader() {
          return getOrCreateProperty("SystemHeader", "SystemHeader", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getUserHeader() {
          return getOrCreateProperty("UserHeader", "UserHeader", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActivityGroupHeader extends PCFElement {
      public ActivityGroupHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.RuleManagementAuditPopup.AllVersionsLV.ActivityGroupHeader.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.RuleManagementAuditPopup.AllVersionsLV.ActivityGroupHeader.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getActivityHeader() {
          return getOrCreateProperty("ActivityHeader", "ActivityHeader", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Rows extends PCFElement {
      public Rows(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public BooleanValueElement getAvailableToRun() {
          return getOrCreateProperty("AvailableToRun", "AvailableToRun", null, gw.smoketest.platform.web.BooleanValueElement.class);
        }
        
        public ValueElement getName() {
          return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getVersion() {
          return getOrCreateProperty("Version", "Version", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<entry2> get_Entries() {
          return getOrCreateEntries(null, pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        public pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows.entry._Select.class);
        }
        
        public pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleManagementAuditPopup.AllVersionsLV.Rows.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry2 extends PCFElement {
          public entry2(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public DateElement getDate() {
            return getOrCreateProperty("Date", "Date", null, gw.smoketest.platform.web.DateElement.class);
          }
          
          public ValueElement getSystemId() {
            return getOrCreateProperty("SystemId", "SystemId", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getUser() {
            return getOrCreateProperty("User", "User", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AllVersionsLV_tb extends PCFElement {
    public AllVersionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleManagementAuditPopup_UpLink extends ClickableActionElement {
    public RuleManagementAuditPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VersionViewPanelSet extends PCFElement {
    public VersionViewPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActivityHeader getActivityHeader() {
      return getOrCreateProperty("ActivityHeader", "ActivityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleManagementAuditPopup.VersionViewPanelSet.ActivityHeader.class);
    }
    
    public BooleanValueElement getAvailableToRun() {
      return getOrCreateProperty("AvailableToRun", "AvailableToRun", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getChangesHeader() {
      return getOrCreateProperty("ChangesHeader", "ChangesHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateHeader getDateHeader() {
      return getOrCreateProperty("DateHeader", "DateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleManagementAuditPopup.VersionViewPanelSet.DateHeader.class);
    }
    
    public ImportDateHeader getImportDateHeader() {
      return getOrCreateProperty("ImportDateHeader", "ImportDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleManagementAuditPopup.VersionViewPanelSet.ImportDateHeader.class);
    }
    
    public ImportUserHeader getImportUserHeader() {
      return getOrCreateProperty("ImportUserHeader", "ImportUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleManagementAuditPopup.VersionViewPanelSet.ImportUserHeader.class);
    }
    
    public ValueElement getImportedHeader() {
      return getOrCreateProperty("ImportedHeader", "ImportedHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getName() {
      return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SystemIdHeader getSystemIdHeader() {
      return getOrCreateProperty("SystemIdHeader", "SystemIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleManagementAuditPopup.VersionViewPanelSet.SystemIdHeader.class);
    }
    
    public UserHeader getUserHeader() {
      return getOrCreateProperty("UserHeader", "UserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleManagementAuditPopup.VersionViewPanelSet.UserHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.RuleManagementAuditPopup.VersionViewPanelSet.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RuleManagementAuditPopup.VersionViewPanelSet.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.RuleManagementAuditPopup.VersionViewPanelSet._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.RuleManagementAuditPopup.VersionViewPanelSet._ListPaging.class);
    }
    
    public pcftest.RuleManagementAuditPopup.VersionViewPanelSet._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleManagementAuditPopup.VersionViewPanelSet._Select.class);
    }
    
    public pcftest.RuleManagementAuditPopup.VersionViewPanelSet._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleManagementAuditPopup.VersionViewPanelSet._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActivityHeader extends ValueElement {
      public ActivityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateHeader extends ValueElement {
      public DateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ImportDateHeader extends ValueElement {
      public ImportDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ImportUserHeader extends ValueElement {
      public ImportUserHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SystemIdHeader extends ValueElement {
      public SystemIdHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserHeader extends ValueElement {
      public UserHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getActivity() {
        return getOrCreateProperty("Activity", "Activity", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getDate() {
        return getOrCreateProperty("Date", "Date", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getImportDate() {
        return getOrCreateProperty("ImportDate", "ImportDate", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getImportUser() {
        return getOrCreateProperty("ImportUser", "ImportUser", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getSystemId() {
        return getOrCreateProperty("SystemId", "SystemId", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getUser() {
        return getOrCreateProperty("User", "User", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.RuleManagementAuditPopup.VersionViewPanelSet.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleManagementAuditPopup.VersionViewPanelSet.entry._Select.class);
      }
      
      public pcftest.RuleManagementAuditPopup.VersionViewPanelSet.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleManagementAuditPopup.VersionViewPanelSet.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}