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
import pcftest.AddressBookSearchLV.AddressLine1Header;
import pcftest.AddressBookSearchLV.CityHeader;
import pcftest.AddressBookSearchLV.ContactSubtypeHeader;
import pcftest.AddressBookSearchLV.CreationStatusHeader;
import pcftest.AddressBookSearchLV.DirectionsHeader;
import pcftest.AddressBookSearchLV.DisplayNameHeader;
import pcftest.AddressBookSearchLV.DrivingDistanceHeader;
import pcftest.AddressBookSearchLV.DrivingTimeHeader;
import pcftest.AddressBookSearchLV.GCDistanceHeader;
import pcftest.AddressBookSearchLV.LinkToHeader;
import pcftest.AddressBookSearchLV.PostalCodeHeader;
import pcftest.AddressBookSearchLV.PrimaryPhoneHeader;
import pcftest.AddressBookSearchLV.ScoreHeader;
import pcftest.AddressBookSearchLV.StateHeader;
import pcftest.AddressBookSearchLV._ListPaging;
import pcftest.AddressBookSearchLV.entry;
import pcftest.AddressBookSearchLV.entry.ContactSubtype;
import pcftest.AddressBookSearchLV.entry.CreationStatus;
import pcftest.AddressBookSearchLV.entry.Directions;
import pcftest.AddressBookSearchLV.entry.DisplayName;
import pcftest.AddressBookSearchLV.entry.LinkTo;
import pcftest.AddressBookSearchLV.entry._Select;
import pcftest.AddressBookSearchLV.entry._ViewDetail;
import typekey.Contact;
import typekey.ContactCreationApprovalStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchLV extends PCFElement {
  public final static String CHECKSUM = "7afa98a37bea9a1dbeb69cdd80895982";
  
  public AddressBookSearchLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressLine1Header getAddressLine1Header() {
    return getOrCreateProperty("AddressLine1Header", "AddressLine1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.AddressLine1Header.class);
  }
  
  public CityHeader getCityHeader() {
    return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.CityHeader.class);
  }
  
  public ContactSubtypeHeader getContactSubtypeHeader() {
    return getOrCreateProperty("ContactSubtypeHeader", "ContactSubtypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.ContactSubtypeHeader.class);
  }
  
  public CreationStatusHeader getCreationStatusHeader() {
    return getOrCreateProperty("CreationStatusHeader", "CreationStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.CreationStatusHeader.class);
  }
  
  public DirectionsHeader getDirectionsHeader() {
    return getOrCreateProperty("DirectionsHeader", "DirectionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.DirectionsHeader.class);
  }
  
  public DisplayNameHeader getDisplayNameHeader() {
    return getOrCreateProperty("DisplayNameHeader", "DisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.DisplayNameHeader.class);
  }
  
  public DrivingDistanceHeader getDrivingDistanceHeader() {
    return getOrCreateProperty("DrivingDistanceHeader", "DrivingDistanceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.DrivingDistanceHeader.class);
  }
  
  public DrivingTimeHeader getDrivingTimeHeader() {
    return getOrCreateProperty("DrivingTimeHeader", "DrivingTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.DrivingTimeHeader.class);
  }
  
  public GCDistanceHeader getGCDistanceHeader() {
    return getOrCreateProperty("GCDistanceHeader", "GCDistanceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.GCDistanceHeader.class);
  }
  
  public LinkToHeader getLinkToHeader() {
    return getOrCreateProperty("LinkToHeader", "LinkToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.LinkToHeader.class);
  }
  
  public PostalCodeHeader getPostalCodeHeader() {
    return getOrCreateProperty("PostalCodeHeader", "PostalCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.PostalCodeHeader.class);
  }
  
  public PrimaryPhoneHeader getPrimaryPhoneHeader() {
    return getOrCreateProperty("PrimaryPhoneHeader", "PrimaryPhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.PrimaryPhoneHeader.class);
  }
  
  public ScoreHeader getScoreHeader() {
    return getOrCreateProperty("ScoreHeader", "ScoreHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.ScoreHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookSearchLV.StateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AddressBookSearchLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AddressBookSearchLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressLine1Header extends ValueElement {
    public AddressLine1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CityHeader extends ValueElement {
    public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactSubtypeHeader extends ValueElement {
    public ContactSubtypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreationStatusHeader extends ValueElement {
    public CreationStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DirectionsHeader extends ValueElement {
    public DirectionsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisplayNameHeader extends ValueElement {
    public DisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrivingDistanceHeader extends ValueElement {
    public DrivingDistanceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrivingTimeHeader extends ValueElement {
    public DrivingTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GCDistanceHeader extends ValueElement {
    public GCDistanceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LinkToHeader extends ValueElement {
    public LinkToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PostalCodeHeader extends ValueElement {
    public PostalCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryPhoneHeader extends ValueElement {
    public PrimaryPhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScoreHeader extends ValueElement {
    public ScoreHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAddressLine1() {
      return getOrCreateProperty("AddressLine1", "AddressLine1", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCity() {
      return getOrCreateProperty("City", "City", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ContactSubtype getContactSubtype() {
      return getOrCreateProperty("ContactSubtype", "ContactSubtype", null, pcftest.AddressBookSearchLV.entry.ContactSubtype.class);
    }
    
    public CreationStatus getCreationStatus() {
      return getOrCreateProperty("CreationStatus", "CreationStatus", null, pcftest.AddressBookSearchLV.entry.CreationStatus.class);
    }
    
    public Directions getDirections() {
      return getOrCreateProperty("Directions", "Directions", null, pcftest.AddressBookSearchLV.entry.Directions.class);
    }
    
    public DisplayName getDisplayName() {
      return getOrCreateProperty("DisplayName", "DisplayName", null, pcftest.AddressBookSearchLV.entry.DisplayName.class);
    }
    
    public ValueElement getDrivingDistance() {
      return getOrCreateProperty("DrivingDistance", "DrivingDistance", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDrivingTime() {
      return getOrCreateProperty("DrivingTime", "DrivingTime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getGCDistance() {
      return getOrCreateProperty("GCDistance", "GCDistance", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LinkTo getLinkTo() {
      return getOrCreateProperty("LinkTo", "LinkTo", null, pcftest.AddressBookSearchLV.entry.LinkTo.class);
    }
    
    public ValueElement getPostalCode() {
      return getOrCreateProperty("PostalCode", "PostalCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPrimaryPhone() {
      return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getScore() {
      return getOrCreateProperty("Score", "Score", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.AddressBookSearchLV.entry.State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.AddressBookSearchLV.entry.State.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AddressBookSearchLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AddressBookSearchLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactSubtype extends SelectElement {
      public ContactSubtype(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Contact arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Contact getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Contact.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Contact arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreationStatus extends SelectElement {
      public CreationStatus(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ContactCreationApprovalStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ContactCreationApprovalStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ContactCreationApprovalStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ContactCreationApprovalStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Directions extends ValueElement {
      public Directions(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookDirectionsPopup click() {
        return clickThis(pcftest.AddressBookDirectionsPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DisplayName extends ValueElement {
      public DisplayName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookContactDetailPopup click() {
        return clickThis(pcftest.AddressBookContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LinkTo extends ValueElement {
      public LinkTo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookSearchLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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