package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.RoleDetailDV.RolePrivilegesLV;
import pcftest.RoleDetailDV.RolePrivilegesLV.CodeHeader;
import pcftest.RoleDetailDV.RolePrivilegesLV.DescriptionHeader;
import pcftest.RoleDetailDV.RolePrivilegesLV.PermissionHeader;
import pcftest.RoleDetailDV.RolePrivilegesLV._ListPaging;
import pcftest.RoleDetailDV.RolePrivilegesLV.entry;
import pcftest.RoleDetailDV.RolePrivilegesLV.entry._Select;
import pcftest.RoleDetailDV.RolePrivilegesLV.entry._ViewDetail;
import pcftest.RoleDetailDV.RolePrivilegesLV_tb;
import pcftest.RoleDetailDV.RolePrivilegesLV_tb.Add;
import pcftest.RoleDetailDV.RolePrivilegesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RoleDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "4075e84a0983c9359609d1ec9ae6a4d7";
  
  public RoleDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RolePrivilegesLV getRolePrivilegesLV() {
    return getOrCreateProperty("RolePrivilegesLV", "RolePrivilegesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RoleDetailDV.RolePrivilegesLV.class);
  }
  
  public RolePrivilegesLV_tb getRolePrivilegesLV_tb() {
    return getOrCreateProperty("RolePrivilegesLV_tb", "RolePrivilegesLV_tb", null, pcftest.RoleDetailDV.RolePrivilegesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RolePrivilegesLV extends PCFElement {
    public RolePrivilegesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CodeHeader getCodeHeader() {
      return getOrCreateProperty("CodeHeader", "CodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RoleDetailDV.RolePrivilegesLV.CodeHeader.class);
    }
    
    public DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RoleDetailDV.RolePrivilegesLV.DescriptionHeader.class);
    }
    
    public PermissionHeader getPermissionHeader() {
      return getOrCreateProperty("PermissionHeader", "PermissionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RoleDetailDV.RolePrivilegesLV.PermissionHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RoleDetailDV.RolePrivilegesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.RoleDetailDV.RolePrivilegesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CodeHeader extends ValueElement {
      public CodeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PermissionHeader extends ValueElement {
      public PermissionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getCode() {
        return getOrCreateProperty("Code", "Code", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public SelectElement getPermission() {
        return getOrCreateProperty("Permission", "Permission", null, gw.smoketest.platform.web.SelectElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.RoleDetailDV.RolePrivilegesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RoleDetailDV.RolePrivilegesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RolePrivilegesLV_tb extends PCFElement {
    public RolePrivilegesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.RoleDetailDV.RolePrivilegesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.RoleDetailDV.RolePrivilegesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/roles/RoleDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}