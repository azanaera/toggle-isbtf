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
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ClaimSnapshotContactDV_tb;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ClaimSnapshotPartiesInvolvedCardTab;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.AddressHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.CityHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.NameHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.PhoneHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.ProhibitedHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.RolesHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.StateHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.ZipCodeHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV._ListPaging;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.entry;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.entry._Select;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.entry._ViewDetail;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_default._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPartiesInvolvedScreen_default extends ClaimSnapshotPartiesInvolvedScreen {
  public final static String CHECKSUM = "f03df6fd914ea5835b8d47379fc515e3";
  
  public ClaimSnapshotPartiesInvolvedScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotContactDV_Person getClaimSnapshotContactDV_Adjudicator() {
    return getOrCreateProperty("ClaimSnapshotContactDV_Adjudicator", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Person.class);
  }
  
  public ClaimSnapshotContactDV_Person getClaimSnapshotContactDV_Attorney() {
    return getOrCreateProperty("ClaimSnapshotContactDV_Attorney", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Person.class);
  }
  
  public ClaimSnapshotContactDV_Company getClaimSnapshotContactDV_AutoRepairShop() {
    return getOrCreateProperty("ClaimSnapshotContactDV_AutoRepairShop", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Company.class);
  }
  
  public ClaimSnapshotContactDV_Company getClaimSnapshotContactDV_AutoTowingAgcy() {
    return getOrCreateProperty("ClaimSnapshotContactDV_AutoTowingAgcy", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Company.class);
  }
  
  public ClaimSnapshotContactDV_Company getClaimSnapshotContactDV_Company() {
    return getOrCreateProperty("ClaimSnapshotContactDV_Company", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Company.class);
  }
  
  public ClaimSnapshotContactDV_Company getClaimSnapshotContactDV_CompanyVendor() {
    return getOrCreateProperty("ClaimSnapshotContactDV_CompanyVendor", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Company.class);
  }
  
  public ClaimSnapshotContactDV_Person getClaimSnapshotContactDV_Doctor() {
    return getOrCreateProperty("ClaimSnapshotContactDV_Doctor", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Person.class);
  }
  
  public ClaimSnapshotContactDV_Company getClaimSnapshotContactDV_LawFirm() {
    return getOrCreateProperty("ClaimSnapshotContactDV_LawFirm", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Company.class);
  }
  
  public ClaimSnapshotContactDV_Place getClaimSnapshotContactDV_LegalVenue() {
    return getOrCreateProperty("ClaimSnapshotContactDV_LegalVenue", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Place.class);
  }
  
  public ClaimSnapshotContactDV_Company getClaimSnapshotContactDV_MedicalCareOrg() {
    return getOrCreateProperty("ClaimSnapshotContactDV_MedicalCareOrg", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Company.class);
  }
  
  public ClaimSnapshotContactDV_Person getClaimSnapshotContactDV_Person() {
    return getOrCreateProperty("ClaimSnapshotContactDV_Person", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Person.class);
  }
  
  public ClaimSnapshotContactDV_Person getClaimSnapshotContactDV_PersonVendor() {
    return getOrCreateProperty("ClaimSnapshotContactDV_PersonVendor", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Person.class);
  }
  
  public ClaimSnapshotContactDV_Place getClaimSnapshotContactDV_Place() {
    return getOrCreateProperty("ClaimSnapshotContactDV_Place", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Place.class);
  }
  
  public ClaimSnapshotContactDV_Person getClaimSnapshotContactDV_UserContact() {
    return getOrCreateProperty("ClaimSnapshotContactDV_UserContact", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_Person.class);
  }
  
  public ClaimSnapshotContactDV_contact getClaimSnapshotContactDV_contact() {
    return getOrCreateProperty("ClaimSnapshotContactDV_contact", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_contact.class);
  }
  
  public ClaimSnapshotContactDV_contact getClaimSnapshotContactDV_default() {
    return getOrCreateProperty("ClaimSnapshotContactDV_default", "ClaimSnapshotContactDV", null, pcftest.ClaimSnapshotContactDV_contact.class);
  }
  
  public ClaimSnapshotContactDV_tb getClaimSnapshotContactDV_tb() {
    return getOrCreateProperty("ClaimSnapshotContactDV_tb", "ClaimSnapshotContactDV_tb", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ClaimSnapshotContactDV_tb.class);
  }
  
  public ClaimSnapshotPartiesInvolvedCardTab getClaimSnapshotPartiesInvolvedCardTab() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedCardTab", "ClaimSnapshotPartiesInvolvedCardTab", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ClaimSnapshotPartiesInvolvedCardTab.class);
  }
  
  public ContactsLV getContactsLV() {
    return getOrCreateProperty("ContactsLV", "ContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotContactDV_tb extends PCFElement {
    public ClaimSnapshotContactDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPartiesInvolvedCardTab extends ClickableActionElement {
    public ClaimSnapshotPartiesInvolvedCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactsLV extends PCFElement {
    public ContactsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressHeader getAddressHeader() {
      return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.AddressHeader.class);
    }
    
    public CityHeader getCityHeader() {
      return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.CityHeader.class);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.NameHeader.class);
    }
    
    public PhoneHeader getPhoneHeader() {
      return getOrCreateProperty("PhoneHeader", "PhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.PhoneHeader.class);
    }
    
    public ProhibitedHeader getProhibitedHeader() {
      return getOrCreateProperty("ProhibitedHeader", "ProhibitedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.ProhibitedHeader.class);
    }
    
    public RolesHeader getRolesHeader() {
      return getOrCreateProperty("RolesHeader", "RolesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.RolesHeader.class);
    }
    
    public StateHeader getStateHeader() {
      return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.StateHeader.class);
    }
    
    public ZipCodeHeader getZipCodeHeader() {
      return getOrCreateProperty("ZipCodeHeader", "ZipCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.ZipCodeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressHeader extends ValueElement {
      public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CityHeader extends ValueElement {
      public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PhoneHeader extends ValueElement {
      public PhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProhibitedHeader extends ValueElement {
      public ProhibitedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RolesHeader extends ValueElement {
      public RolesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StateHeader extends ValueElement {
      public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ZipCodeHeader extends ValueElement {
      public ZipCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.ContactsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPartiesInvolvedScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}