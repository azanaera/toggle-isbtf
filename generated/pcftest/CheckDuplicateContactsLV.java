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
import pcftest.CheckDuplicateContactsLV.AddressLine1Header;
import pcftest.CheckDuplicateContactsLV.CityHeader;
import pcftest.CheckDuplicateContactsLV.ContactSubtypeHeader;
import pcftest.CheckDuplicateContactsLV.DirectionsHeader;
import pcftest.CheckDuplicateContactsLV.DisplayNameHeader;
import pcftest.CheckDuplicateContactsLV.DrivingDistanceHeader;
import pcftest.CheckDuplicateContactsLV.DrivingTimeHeader;
import pcftest.CheckDuplicateContactsLV.GCDistanceHeader;
import pcftest.CheckDuplicateContactsLV.LinkToHeader;
import pcftest.CheckDuplicateContactsLV.PostalCodeHeader;
import pcftest.CheckDuplicateContactsLV.PrimaryPhoneHeader;
import pcftest.CheckDuplicateContactsLV.ScoreHeader;
import pcftest.CheckDuplicateContactsLV.StateHeader;
import pcftest.CheckDuplicateContactsLV._ListPaging;
import pcftest.CheckDuplicateContactsLV.entry;
import pcftest.CheckDuplicateContactsLV.entry.ContactSubtype;
import pcftest.CheckDuplicateContactsLV.entry.LinkTo;
import pcftest.CheckDuplicateContactsLV.entry._Select;
import pcftest.CheckDuplicateContactsLV.entry._ViewDetail;
import typekey.Contact;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckDuplicateContactsLV extends PCFElement {
  public final static String CHECKSUM = "457efa2f4c4a9c5ff00825e0483b4be7";
  
  public CheckDuplicateContactsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressLine1Header getAddressLine1Header() {
    return getOrCreateProperty("AddressLine1Header", "AddressLine1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.AddressLine1Header.class);
  }
  
  public CityHeader getCityHeader() {
    return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.CityHeader.class);
  }
  
  public ContactSubtypeHeader getContactSubtypeHeader() {
    return getOrCreateProperty("ContactSubtypeHeader", "ContactSubtypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.ContactSubtypeHeader.class);
  }
  
  public DirectionsHeader getDirectionsHeader() {
    return getOrCreateProperty("DirectionsHeader", "DirectionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.DirectionsHeader.class);
  }
  
  public DisplayNameHeader getDisplayNameHeader() {
    return getOrCreateProperty("DisplayNameHeader", "DisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.DisplayNameHeader.class);
  }
  
  public DrivingDistanceHeader getDrivingDistanceHeader() {
    return getOrCreateProperty("DrivingDistanceHeader", "DrivingDistanceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.DrivingDistanceHeader.class);
  }
  
  public DrivingTimeHeader getDrivingTimeHeader() {
    return getOrCreateProperty("DrivingTimeHeader", "DrivingTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.DrivingTimeHeader.class);
  }
  
  public GCDistanceHeader getGCDistanceHeader() {
    return getOrCreateProperty("GCDistanceHeader", "GCDistanceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.GCDistanceHeader.class);
  }
  
  public LinkToHeader getLinkToHeader() {
    return getOrCreateProperty("LinkToHeader", "LinkToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.LinkToHeader.class);
  }
  
  public PostalCodeHeader getPostalCodeHeader() {
    return getOrCreateProperty("PostalCodeHeader", "PostalCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.PostalCodeHeader.class);
  }
  
  public PrimaryPhoneHeader getPrimaryPhoneHeader() {
    return getOrCreateProperty("PrimaryPhoneHeader", "PrimaryPhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.PrimaryPhoneHeader.class);
  }
  
  public ScoreHeader getScoreHeader() {
    return getOrCreateProperty("ScoreHeader", "ScoreHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.ScoreHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDuplicateContactsLV.StateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CheckDuplicateContactsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CheckDuplicateContactsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressLine1Header extends ValueElement {
    public AddressLine1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CityHeader extends ValueElement {
    public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactSubtypeHeader extends ValueElement {
    public ContactSubtypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DirectionsHeader extends ValueElement {
    public DirectionsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisplayNameHeader extends ValueElement {
    public DisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrivingDistanceHeader extends ValueElement {
    public DrivingDistanceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrivingTimeHeader extends ValueElement {
    public DrivingTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GCDistanceHeader extends ValueElement {
    public GCDistanceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LinkToHeader extends ValueElement {
    public LinkToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PostalCodeHeader extends ValueElement {
    public PostalCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryPhoneHeader extends ValueElement {
    public PrimaryPhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScoreHeader extends ValueElement {
    public ScoreHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("ContactSubtype", "ContactSubtype", null, pcftest.CheckDuplicateContactsLV.entry.ContactSubtype.class);
    }
    
    public ValueElement getDirections() {
      return getOrCreateProperty("Directions", "Directions", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDisplayName() {
      return getOrCreateProperty("DisplayName", "DisplayName", null, gw.smoketest.platform.web.ValueElement.class);
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
      return getOrCreateProperty("LinkTo", "LinkTo", null, pcftest.CheckDuplicateContactsLV.entry.LinkTo.class);
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
    
    public pcftest.CheckDuplicateContactsLV.entry.State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.CheckDuplicateContactsLV.entry.State.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.CheckDuplicateContactsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CheckDuplicateContactsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LinkTo extends ValueElement {
      public LinkTo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/CheckDuplicateContactsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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