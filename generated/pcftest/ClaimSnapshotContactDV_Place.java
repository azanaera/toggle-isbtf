package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV;
import pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.ActiveHeader;
import pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.CommentsHeader;
import pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.OwnerHeader;
import pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.RoleHeader;
import pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV._ListPaging;
import pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.entry;
import pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.entry._Select;
import pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.entry._ViewDetail;
import pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotContactDV_Place extends ClaimSnapshotContactDV {
  public final static String CHECKSUM = "73b8812af3130ca1f3f5f8ffc629febf";
  
  public ClaimSnapshotContactDV_Place(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddressType() {
    return getOrCreateProperty("AddressType", "AddressType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimRolesLV getClaimRolesLV() {
    return getOrCreateProperty("ClaimRolesLV", "ClaimRolesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.class);
  }
  
  public ClaimRolesLV_tb getClaimRolesLV_tb() {
    return getOrCreateProperty("ClaimRolesLV_tb", "ClaimRolesLV_tb", null, pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV_tb.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmailAddress1() {
    return getOrCreateProperty("EmailAddress1", "EmailAddress1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmailAddress2() {
    return getOrCreateProperty("EmailAddress2", "EmailAddress2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFaxPhone() {
    return getOrCreateProperty("FaxPhone", "FaxPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getHomePhone() {
    return getOrCreateProperty("HomePhone", "HomePhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPreferredCurrency() {
    return getOrCreateProperty("PreferredCurrency", "PreferredCurrency", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryAddress() {
    return getOrCreateProperty("PrimaryAddress", "PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryContact() {
    return getOrCreateProperty("PrimaryContact", "PrimaryContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getValidUntil() {
    return getOrCreateProperty("ValidUntil", "ValidUntil", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWorkPhone() {
    return getOrCreateProperty("WorkPhone", "WorkPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getcontact() {
    return getOrCreateProperty("contact", "contact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimRolesLV extends PCFElement {
    public ClaimRolesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActiveHeader getActiveHeader() {
      return getOrCreateProperty("ActiveHeader", "ActiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.ActiveHeader.class);
    }
    
    public CommentsHeader getCommentsHeader() {
      return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.CommentsHeader.class);
    }
    
    public OwnerHeader getOwnerHeader() {
      return getOrCreateProperty("OwnerHeader", "OwnerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.OwnerHeader.class);
    }
    
    public RoleHeader getRoleHeader() {
      return getOrCreateProperty("RoleHeader", "RoleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.RoleHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActiveHeader extends ValueElement {
      public ActiveHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommentsHeader extends ValueElement {
      public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OwnerHeader extends ValueElement {
      public OwnerHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RoleHeader extends ValueElement {
      public RoleHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getActive() {
        return getOrCreateProperty("Active", "Active", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getComments() {
        return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getOwner() {
        return getOrCreateProperty("Owner", "Owner", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRole() {
        return getOrCreateProperty("Role", "Role", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotContactDV_Place.ClaimRolesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotContactDV.place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimRolesLV_tb extends PCFElement {
    public ClaimRolesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}