package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.ActiveHeader;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.CommentsHeader;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.OwnerHeader;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.RoleHeader;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV._ListPaging;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.entry;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.entry._Select;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.entry._ViewDetail;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV_tb;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimSnapshotContactEFT600LV_tb;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimSnapshotContactEFT600LV_tb.Add;
import pcftest.ClaimSnapshotContact600DV_Person.ClaimSnapshotContactEFT600LV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotContact600DV_Person extends ClaimSnapshotContact600DV {
  public final static String CHECKSUM = "0050b9a025603d8e0eee87f4222b1eed";
  
  public ClaimSnapshotContact600DV_Person(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddressType() {
    return getOrCreateProperty("AddressType", "AddressType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCellPhone() {
    return getOrCreateProperty("CellPhone", "CellPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimRolesLV getClaimRolesLV() {
    return getOrCreateProperty("ClaimRolesLV", "ClaimRolesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.class);
  }
  
  public ClaimRolesLV_tb getClaimRolesLV_tb() {
    return getOrCreateProperty("ClaimRolesLV_tb", "ClaimRolesLV_tb", null, pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV_tb.class);
  }
  
  public ClaimSnapshotContactEFT600LV getClaimSnapshotContactEFT600LV() {
    return getOrCreateProperty("ClaimSnapshotContactEFT600LV", "ClaimSnapshotContactEFT600LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotContactEFT600LV.class);
  }
  
  public ClaimSnapshotContactEFT600LV_tb getClaimSnapshotContactEFT600LV_tb() {
    return getOrCreateProperty("ClaimSnapshotContactEFT600LV_tb", "ClaimSnapshotContactEFT600LV_tb", null, pcftest.ClaimSnapshotContact600DV_Person.ClaimSnapshotContactEFT600LV_tb.class);
  }
  
  public ValueElement getContact() {
    return getOrCreateProperty("Contact", "Contact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCountry() {
    return getOrCreateProperty("Country", "Country", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCounty() {
    return getOrCreateProperty("County", "County", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDateOfBirth() {
    return getOrCreateProperty("DateOfBirth", "DateOfBirth", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getEmployer() {
    return getOrCreateProperty("Employer", "Employer", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFaxPhone() {
    return getOrCreateProperty("FaxPhone", "FaxPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFormerName() {
    return getOrCreateProperty("FormerName", "FormerName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGender() {
    return getOrCreateProperty("Gender", "Gender", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGuardian() {
    return getOrCreateProperty("Guardian", "Guardian", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getHomePhone() {
    return getOrCreateProperty("HomePhone", "HomePhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLicenseNumber() {
    return getOrCreateProperty("LicenseNumber", "LicenseNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLicenseState() {
    return getOrCreateProperty("LicenseState", "LicenseState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMaritalStatus() {
    return getOrCreateProperty("MaritalStatus", "MaritalStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOccupation() {
    return getOrCreateProperty("Occupation", "Occupation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPreferredCurrency() {
    return getOrCreateProperty("PreferredCurrency", "PreferredCurrency", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryAddress() {
    return getOrCreateProperty("PrimaryAddress", "PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTaxFilingStatus() {
    return getOrCreateProperty("TaxFilingStatus", "TaxFilingStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getValidUntil() {
    return getOrCreateProperty("ValidUntil", "ValidUntil", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWorkPhone() {
    return getOrCreateProperty("WorkPhone", "WorkPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimRolesLV extends PCFElement {
    public ClaimRolesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActiveHeader getActiveHeader() {
      return getOrCreateProperty("ActiveHeader", "ActiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.ActiveHeader.class);
    }
    
    public CommentsHeader getCommentsHeader() {
      return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.CommentsHeader.class);
    }
    
    public OwnerHeader getOwnerHeader() {
      return getOrCreateProperty("OwnerHeader", "OwnerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.OwnerHeader.class);
    }
    
    public RoleHeader getRoleHeader() {
      return getOrCreateProperty("RoleHeader", "RoleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.RoleHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActiveHeader extends ValueElement {
      public ActiveHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommentsHeader extends ValueElement {
      public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OwnerHeader extends ValueElement {
      public OwnerHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RoleHeader extends ValueElement {
      public RoleHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotContact600DV_Person.ClaimRolesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimRolesLV_tb extends PCFElement {
    public ClaimRolesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotContactEFT600LV_tb extends PCFElement {
    public ClaimSnapshotContactEFT600LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ClaimSnapshotContact600DV_Person.ClaimSnapshotContactEFT600LV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimSnapshotContact600DV_Person.ClaimSnapshotContactEFT600LV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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