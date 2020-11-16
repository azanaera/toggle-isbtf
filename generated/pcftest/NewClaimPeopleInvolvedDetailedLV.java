package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
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
import pcftest.NewClaimPeopleInvolvedDetailedLV.AddressHeader;
import pcftest.NewClaimPeopleInvolvedDetailedLV.CityHeader;
import pcftest.NewClaimPeopleInvolvedDetailedLV.ContactProhibitedHeader;
import pcftest.NewClaimPeopleInvolvedDetailedLV.NameHeader;
import pcftest.NewClaimPeopleInvolvedDetailedLV.Phone_WorkHeader;
import pcftest.NewClaimPeopleInvolvedDetailedLV.PostalCodeHeader;
import pcftest.NewClaimPeopleInvolvedDetailedLV.RolesHeader;
import pcftest.NewClaimPeopleInvolvedDetailedLV.StateHeader;
import pcftest.NewClaimPeopleInvolvedDetailedLV._ListPaging;
import pcftest.NewClaimPeopleInvolvedDetailedLV.entry;
import pcftest.NewClaimPeopleInvolvedDetailedLV.entry.Name;
import pcftest.NewClaimPeopleInvolvedDetailedLV.entry._Select;
import pcftest.NewClaimPeopleInvolvedDetailedLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimPeopleInvolvedDetailedLV extends PCFElement {
  public final static String CHECKSUM = "fa7e7bb88a4f071eaeb3abfaaff06591";
  
  public NewClaimPeopleInvolvedDetailedLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressHeader getAddressHeader() {
    return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimPeopleInvolvedDetailedLV.AddressHeader.class);
  }
  
  public CityHeader getCityHeader() {
    return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimPeopleInvolvedDetailedLV.CityHeader.class);
  }
  
  public ContactProhibitedHeader getContactProhibitedHeader() {
    return getOrCreateProperty("ContactProhibitedHeader", "ContactProhibitedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimPeopleInvolvedDetailedLV.ContactProhibitedHeader.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimPeopleInvolvedDetailedLV.NameHeader.class);
  }
  
  public SelectElement getNewClaimPeopleInvolvedDetailedFilter() {
    return getOrCreateProperty("NewClaimPeopleInvolvedDetailedFilter", "NewClaimPeopleInvolvedDetailedFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Phone_WorkHeader getPhone_WorkHeader() {
    return getOrCreateProperty("Phone_WorkHeader", "Phone_WorkHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimPeopleInvolvedDetailedLV.Phone_WorkHeader.class);
  }
  
  public PostalCodeHeader getPostalCodeHeader() {
    return getOrCreateProperty("PostalCodeHeader", "PostalCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimPeopleInvolvedDetailedLV.PostalCodeHeader.class);
  }
  
  public SelectElement getRoleFilter() {
    return getOrCreateProperty("RoleFilter", "RoleFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public RolesHeader getRolesHeader() {
    return getOrCreateProperty("RolesHeader", "RolesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimPeopleInvolvedDetailedLV.RolesHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimPeopleInvolvedDetailedLV.StateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewClaimPeopleInvolvedDetailedLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewClaimPeopleInvolvedDetailedLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressHeader extends ValueElement {
    public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CityHeader extends ValueElement {
    public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactProhibitedHeader extends ValueElement {
    public ContactProhibitedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Phone_WorkHeader extends ValueElement {
    public Phone_WorkHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PostalCodeHeader extends ValueElement {
    public PostalCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RolesHeader extends ValueElement {
    public RolesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public Name getName() {
      return getOrCreateProperty("Name", "Name", null, pcftest.NewClaimPeopleInvolvedDetailedLV.entry.Name.class);
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
    
    public pcftest.NewClaimPeopleInvolvedDetailedLV.entry.State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.NewClaimPeopleInvolvedDetailedLV.entry.State.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NewClaimPeopleInvolvedDetailedLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewClaimPeopleInvolvedDetailedLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Name extends ValueElement {
      public Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_PartyInvolvedPopup click() {
        return clickThis(pcftest.NewClaimWizard_PartyInvolvedPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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