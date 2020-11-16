package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
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
import pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV;
import pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV_tb;
import pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV_tb.AddToSourceContacts;
import pcftest.ClaimContactTransferRolesPopup.CancelTransferRolesButton;
import pcftest.ClaimContactTransferRolesPopup.ClaimContactTransferRolesPopup_UpLink;
import pcftest.ClaimContactTransferRolesPopup.PerformContactRoleTransferButton;
import pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV;
import pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV_tb;
import pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV_tb.RemoveFromSourceContacts;
import pcftest.ClaimContactTransferRolesPopup._Paging;
import pcftest.ClaimContactTransferRolesPopup.__crumb__;
import pcftest.ClaimContactTransferRolesPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimContactTransferRolesPopup extends PCFLocation {
  public final static String CHECKSUM = "574b94fa49c33866c93dd6427ccff275";
  
  public ClaimContactTransferRolesPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimContactTransferRolesPopup"));
  }
  
  public AvailableClaimContactsLV getAvailableClaimContactsLV() {
    return getOrCreateProperty("AvailableClaimContactsLV", "AvailableClaimContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.class);
  }
  
  public AvailableClaimContactsLV_tb getAvailableClaimContactsLV_tb() {
    return getOrCreateProperty("AvailableClaimContactsLV_tb", "AvailableClaimContactsLV_tb", null, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV_tb.class);
  }
  
  public CancelTransferRolesButton getCancelTransferRolesButton() {
    return getOrCreateProperty("CancelTransferRolesButton", "CancelTransferRolesButton", null, pcftest.ClaimContactTransferRolesPopup.CancelTransferRolesButton.class);
  }
  
  public ClaimContactTransferRolesPopup_UpLink getClaimContactTransferRolesPopup_UpLink() {
    return getOrCreateProperty("ClaimContactTransferRolesPopup_UpLink", "ClaimContactTransferRolesPopup_UpLink", null, pcftest.ClaimContactTransferRolesPopup.ClaimContactTransferRolesPopup_UpLink.class);
  }
  
  public PerformContactRoleTransferButton getPerformContactRoleTransferButton() {
    return getOrCreateProperty("PerformContactRoleTransferButton", "PerformContactRoleTransferButton", null, pcftest.ClaimContactTransferRolesPopup.PerformContactRoleTransferButton.class);
  }
  
  public SourceClaimContactsLV getSourceClaimContactsLV() {
    return getOrCreateProperty("SourceClaimContactsLV", "SourceClaimContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.class);
  }
  
  public SourceClaimContactsLV_tb getSourceClaimContactsLV_tb() {
    return getOrCreateProperty("SourceClaimContactsLV_tb", "SourceClaimContactsLV_tb", null, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV_tb.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimContactTransferRolesPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimContactTransferRolesPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimContactTransferRolesPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AvailableClaimContactsLV extends PCFElement {
    public AvailableClaimContactsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.AddressHeader getAddressHeader() {
      return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.AddressHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.CityHeader getCityHeader() {
      return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.CityHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.ContactProhibitedHeader getContactProhibitedHeader() {
      return getOrCreateProperty("ContactProhibitedHeader", "ContactProhibitedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.ContactProhibitedHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.NameHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.Phone_WorkHeader getPhone_WorkHeader() {
      return getOrCreateProperty("Phone_WorkHeader", "Phone_WorkHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.Phone_WorkHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.PostalCodeHeader getPostalCodeHeader() {
      return getOrCreateProperty("PostalCodeHeader", "PostalCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.PostalCodeHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.RolesHeader getRolesHeader() {
      return getOrCreateProperty("RolesHeader", "RolesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.RolesHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.StateHeader getStateHeader() {
      return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.StateHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressHeader extends ValueElement {
      public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CityHeader extends ValueElement {
      public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactProhibitedHeader extends ValueElement {
      public ContactProhibitedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Phone_WorkHeader extends ValueElement {
      public Phone_WorkHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PostalCodeHeader extends ValueElement {
      public PostalCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RolesHeader extends ValueElement {
      public RolesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StateHeader extends ValueElement {
      public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public BooleanValueElement getContactProhibited() {
        return getOrCreateProperty("ContactProhibited", "ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public ValueElement getName() {
        return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPhone_Work() {
        return getOrCreateProperty("Phone_Work", "Phone_Work", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPostalCode() {
        return getOrCreateProperty("PostalCode", "PostalCode", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRoles() {
        return getOrCreateProperty("Roles", "Roles", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.entry.State getState() {
        return getOrCreateProperty("State", "State", null, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.entry.State.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.entry._Select.class);
      }
      
      public pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class State extends SelectElement {
        public State(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(typekey.State arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public typekey.State getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(typekey.State arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AvailableClaimContactsLV_tb extends PCFElement {
    public AvailableClaimContactsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddToSourceContacts getAddToSourceContacts() {
      return getOrCreateProperty("AddToSourceContacts", "AddToSourceContacts", null, pcftest.ClaimContactTransferRolesPopup.AvailableClaimContactsLV_tb.AddToSourceContacts.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddToSourceContacts extends ClickableActionElement {
      public AddToSourceContacts(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CancelTransferRolesButton extends ClickableActionElement {
    public CancelTransferRolesButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactTransferRolesPopup_UpLink extends ClickableActionElement {
    public ClaimContactTransferRolesPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PerformContactRoleTransferButton extends ClickableActionElement {
    public PerformContactRoleTransferButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SourceClaimContactsLV extends PCFElement {
    public SourceClaimContactsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.AddressHeader getAddressHeader() {
      return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.AddressHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.CityHeader getCityHeader() {
      return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.CityHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.ContactProhibitedHeader getContactProhibitedHeader() {
      return getOrCreateProperty("ContactProhibitedHeader", "ContactProhibitedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.ContactProhibitedHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.NameHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.Phone_WorkHeader getPhone_WorkHeader() {
      return getOrCreateProperty("Phone_WorkHeader", "Phone_WorkHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.Phone_WorkHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.PostalCodeHeader getPostalCodeHeader() {
      return getOrCreateProperty("PostalCodeHeader", "PostalCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.PostalCodeHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.RolesHeader getRolesHeader() {
      return getOrCreateProperty("RolesHeader", "RolesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.RolesHeader.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.StateHeader getStateHeader() {
      return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.StateHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressHeader extends ValueElement {
      public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CityHeader extends ValueElement {
      public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactProhibitedHeader extends ValueElement {
      public ContactProhibitedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Phone_WorkHeader extends ValueElement {
      public Phone_WorkHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PostalCodeHeader extends ValueElement {
      public PostalCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RolesHeader extends ValueElement {
      public RolesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StateHeader extends ValueElement {
      public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public BooleanValueElement getContactProhibited() {
        return getOrCreateProperty("ContactProhibited", "ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public ValueElement getName() {
        return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPhone_Work() {
        return getOrCreateProperty("Phone_Work", "Phone_Work", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPostalCode() {
        return getOrCreateProperty("PostalCode", "PostalCode", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRoles() {
        return getOrCreateProperty("Roles", "Roles", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.entry.State getState() {
        return getOrCreateProperty("State", "State", null, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.entry.State.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.entry._Select.class);
      }
      
      public pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class State extends SelectElement {
        public State(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(typekey.State arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public typekey.State getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(typekey.State arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SourceClaimContactsLV_tb extends PCFElement {
    public SourceClaimContactsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RemoveFromSourceContacts getRemoveFromSourceContacts() {
      return getOrCreateProperty("RemoveFromSourceContacts", "RemoveFromSourceContacts", null, pcftest.ClaimContactTransferRolesPopup.SourceClaimContactsLV_tb.RemoveFromSourceContacts.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RemoveFromSourceContacts extends ClickableActionElement {
      public RemoveFromSourceContacts(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}