package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ClaimSnapshotContact600DV_tb;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ClaimSnapshotPartiesInvolvedCardTab;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.AddressHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.CityHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.NameHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.PhoneHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.ProhibitedHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.RolesHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.StateHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.ZipCodeHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV._ListPaging;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.entry;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.entry._Select;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.entry._ViewDetail;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_600._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPartiesInvolvedScreen_600 extends ClaimSnapshotPartiesInvolvedScreen {
  public final static String CHECKSUM = "724c7c41853267f43ac291e4decfae44";
  
  public ClaimSnapshotPartiesInvolvedScreen_600(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotContact600DV_Person getClaimSnapshotContact600DV_Adjudicator() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_Adjudicator", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Person.class);
  }
  
  public ClaimSnapshotContact600DV_Person getClaimSnapshotContact600DV_Attorney() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_Attorney", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Person.class);
  }
  
  public ClaimSnapshotContact600DV_Company getClaimSnapshotContact600DV_AutoRepairShop() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_AutoRepairShop", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Company.class);
  }
  
  public ClaimSnapshotContact600DV_Company getClaimSnapshotContact600DV_AutoTowingAgcy() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_AutoTowingAgcy", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Company.class);
  }
  
  public ClaimSnapshotContact600DV_Company getClaimSnapshotContact600DV_Company() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_Company", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Company.class);
  }
  
  public ClaimSnapshotContact600DV_Company getClaimSnapshotContact600DV_CompanyVendor() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_CompanyVendor", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Company.class);
  }
  
  public ClaimSnapshotContact600DV_Person getClaimSnapshotContact600DV_Doctor() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_Doctor", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Person.class);
  }
  
  public ClaimSnapshotContact600DV_Company getClaimSnapshotContact600DV_LawFirm() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_LawFirm", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Company.class);
  }
  
  public ClaimSnapshotContact600DV_Place getClaimSnapshotContact600DV_LegalVenue() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_LegalVenue", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Place.class);
  }
  
  public ClaimSnapshotContact600DV_Company getClaimSnapshotContact600DV_MedicalCareOrg() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_MedicalCareOrg", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Company.class);
  }
  
  public ClaimSnapshotContact600DV_Person getClaimSnapshotContact600DV_Person() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_Person", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Person.class);
  }
  
  public ClaimSnapshotContact600DV_Person getClaimSnapshotContact600DV_PersonVendor() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_PersonVendor", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Person.class);
  }
  
  public ClaimSnapshotContact600DV_Place getClaimSnapshotContact600DV_Place() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_Place", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Place.class);
  }
  
  public ClaimSnapshotContact600DV_Person getClaimSnapshotContact600DV_UserContact() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_UserContact", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_Person.class);
  }
  
  public ClaimSnapshotContact600DV_contact getClaimSnapshotContact600DV_contact() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_contact", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_contact.class);
  }
  
  public ClaimSnapshotContact600DV_contact getClaimSnapshotContact600DV_default() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_default", "ClaimSnapshotContact600DV", null, pcftest.ClaimSnapshotContact600DV_contact.class);
  }
  
  public ClaimSnapshotContact600DV_tb getClaimSnapshotContact600DV_tb() {
    return getOrCreateProperty("ClaimSnapshotContact600DV_tb", "ClaimSnapshotContact600DV_tb", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ClaimSnapshotContact600DV_tb.class);
  }
  
  public ClaimSnapshotPartiesInvolvedCardTab getClaimSnapshotPartiesInvolvedCardTab() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedCardTab", "ClaimSnapshotPartiesInvolvedCardTab", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ClaimSnapshotPartiesInvolvedCardTab.class);
  }
  
  public ContactsLV getContactsLV() {
    return getOrCreateProperty("ContactsLV", "ContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_600._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotContact600DV_tb extends PCFElement {
    public ClaimSnapshotContact600DV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPartiesInvolvedCardTab extends ClickableActionElement {
    public ClaimSnapshotPartiesInvolvedCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactsLV extends PCFElement {
    public ContactsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressHeader getAddressHeader() {
      return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.AddressHeader.class);
    }
    
    public CityHeader getCityHeader() {
      return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.CityHeader.class);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.NameHeader.class);
    }
    
    public PhoneHeader getPhoneHeader() {
      return getOrCreateProperty("PhoneHeader", "PhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.PhoneHeader.class);
    }
    
    public ProhibitedHeader getProhibitedHeader() {
      return getOrCreateProperty("ProhibitedHeader", "ProhibitedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.ProhibitedHeader.class);
    }
    
    public RolesHeader getRolesHeader() {
      return getOrCreateProperty("RolesHeader", "RolesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.RolesHeader.class);
    }
    
    public StateHeader getStateHeader() {
      return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.StateHeader.class);
    }
    
    public ZipCodeHeader getZipCodeHeader() {
      return getOrCreateProperty("ZipCodeHeader", "ZipCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.ZipCodeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressHeader extends ValueElement {
      public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CityHeader extends ValueElement {
      public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PhoneHeader extends ValueElement {
      public PhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProhibitedHeader extends ValueElement {
      public ProhibitedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RolesHeader extends ValueElement {
      public RolesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StateHeader extends ValueElement {
      public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ZipCodeHeader extends ValueElement {
      public ZipCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAddress() {
        return getOrCreateProperty("Address", "Address", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCity() {
        return getOrCreateProperty("City", "City", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getName() {
        return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPhone() {
        return getOrCreateProperty("Phone", "Phone", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getProhibited() {
        return getOrCreateProperty("Prohibited", "Prohibited", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRoles() {
        return getOrCreateProperty("Roles", "Roles", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getState() {
        return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getZipCode() {
        return getOrCreateProperty("ZipCode", "ZipCode", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.ContactsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPartiesInvolvedScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}