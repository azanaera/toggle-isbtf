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
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ClaimSnapshotContact700DV_tb;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ClaimSnapshotPartiesInvolvedCardTab;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.AddressHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.CityHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.NameHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.PhoneHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.ProhibitedHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.RolesHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.StateHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.ZipCodeHeader;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV._ListPaging;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.entry;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.entry._Select;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.entry._ViewDetail;
import pcftest.ClaimSnapshotPartiesInvolvedScreen_700._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPartiesInvolvedScreen_700 extends ClaimSnapshotPartiesInvolvedScreen {
  public final static String CHECKSUM = "dda16a33825fcaae91f5b9f2a6415dd2";
  
  public ClaimSnapshotPartiesInvolvedScreen_700(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotContact700DV_Person getClaimSnapshotContact700DV_Adjudicator() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_Adjudicator", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Person.class);
  }
  
  public ClaimSnapshotContact700DV_Person getClaimSnapshotContact700DV_Attorney() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_Attorney", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Person.class);
  }
  
  public ClaimSnapshotContact700DV_Company getClaimSnapshotContact700DV_AutoRepairShop() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_AutoRepairShop", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Company.class);
  }
  
  public ClaimSnapshotContact700DV_Company getClaimSnapshotContact700DV_AutoTowingAgcy() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_AutoTowingAgcy", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Company.class);
  }
  
  public ClaimSnapshotContact700DV_Company getClaimSnapshotContact700DV_Company() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_Company", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Company.class);
  }
  
  public ClaimSnapshotContact700DV_Company getClaimSnapshotContact700DV_CompanyVendor() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_CompanyVendor", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Company.class);
  }
  
  public ClaimSnapshotContact700DV_Person getClaimSnapshotContact700DV_Doctor() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_Doctor", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Person.class);
  }
  
  public ClaimSnapshotContact700DV_Company getClaimSnapshotContact700DV_LawFirm() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_LawFirm", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Company.class);
  }
  
  public ClaimSnapshotContact700DV_Place getClaimSnapshotContact700DV_LegalVenue() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_LegalVenue", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Place.class);
  }
  
  public ClaimSnapshotContact700DV_Company getClaimSnapshotContact700DV_MedicalCareOrg() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_MedicalCareOrg", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Company.class);
  }
  
  public ClaimSnapshotContact700DV_Person getClaimSnapshotContact700DV_Person() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_Person", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Person.class);
  }
  
  public ClaimSnapshotContact700DV_Person getClaimSnapshotContact700DV_PersonVendor() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_PersonVendor", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Person.class);
  }
  
  public ClaimSnapshotContact700DV_Place getClaimSnapshotContact700DV_Place() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_Place", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Place.class);
  }
  
  public ClaimSnapshotContact700DV_Person getClaimSnapshotContact700DV_UserContact() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_UserContact", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_Person.class);
  }
  
  public ClaimSnapshotContact700DV_contact getClaimSnapshotContact700DV_contact() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_contact", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_contact.class);
  }
  
  public ClaimSnapshotContact700DV_contact getClaimSnapshotContact700DV_default() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_default", "ClaimSnapshotContact700DV", null, pcftest.ClaimSnapshotContact700DV_contact.class);
  }
  
  public ClaimSnapshotContact700DV_tb getClaimSnapshotContact700DV_tb() {
    return getOrCreateProperty("ClaimSnapshotContact700DV_tb", "ClaimSnapshotContact700DV_tb", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ClaimSnapshotContact700DV_tb.class);
  }
  
  public ClaimSnapshotPartiesInvolvedCardTab getClaimSnapshotPartiesInvolvedCardTab() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedCardTab", "ClaimSnapshotPartiesInvolvedCardTab", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ClaimSnapshotPartiesInvolvedCardTab.class);
  }
  
  public ContactsLV getContactsLV() {
    return getOrCreateProperty("ContactsLV", "ContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_700._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotContact700DV_tb extends PCFElement {
    public ClaimSnapshotContact700DV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPartiesInvolvedCardTab extends ClickableActionElement {
    public ClaimSnapshotPartiesInvolvedCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactsLV extends PCFElement {
    public ContactsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressHeader getAddressHeader() {
      return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.AddressHeader.class);
    }
    
    public CityHeader getCityHeader() {
      return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.CityHeader.class);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.NameHeader.class);
    }
    
    public PhoneHeader getPhoneHeader() {
      return getOrCreateProperty("PhoneHeader", "PhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.PhoneHeader.class);
    }
    
    public ProhibitedHeader getProhibitedHeader() {
      return getOrCreateProperty("ProhibitedHeader", "ProhibitedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.ProhibitedHeader.class);
    }
    
    public RolesHeader getRolesHeader() {
      return getOrCreateProperty("RolesHeader", "RolesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.RolesHeader.class);
    }
    
    public StateHeader getStateHeader() {
      return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.StateHeader.class);
    }
    
    public ZipCodeHeader getZipCodeHeader() {
      return getOrCreateProperty("ZipCodeHeader", "ZipCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.ZipCodeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressHeader extends ValueElement {
      public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CityHeader extends ValueElement {
      public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PhoneHeader extends ValueElement {
      public PhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProhibitedHeader extends ValueElement {
      public ProhibitedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RolesHeader extends ValueElement {
      public RolesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StateHeader extends ValueElement {
      public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ZipCodeHeader extends ValueElement {
      public ZipCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.ContactsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPartiesInvolvedScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}