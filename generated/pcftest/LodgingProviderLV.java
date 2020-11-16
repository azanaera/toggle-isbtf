package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.LodgingProviderLV.Approx_TotalHeader;
import pcftest.LodgingProviderLV.CommentsHeader;
import pcftest.LodgingProviderLV.ContactHeader;
import pcftest.LodgingProviderLV.DaysHeader;
import pcftest.LodgingProviderLV.EndDateHeader;
import pcftest.LodgingProviderLV.LocationDetailsCellHeader;
import pcftest.LodgingProviderLV.RateHeader;
import pcftest.LodgingProviderLV.StartDateHeader;
import pcftest.LodgingProviderLV._ListPaging;
import pcftest.LodgingProviderLV.entry;
import pcftest.LodgingProviderLV.entry.Contact;
import pcftest.LodgingProviderLV.entry.Contact.MenuItem_Search;
import pcftest.LodgingProviderLV.entry.Contact.MenuItem_ViewDetails;
import pcftest.LodgingProviderLV.entry.LocationDetailsCell;
import pcftest.LodgingProviderLV.entry._Select;
import pcftest.LodgingProviderLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LodgingProviderLV extends PCFElement {
  public final static String CHECKSUM = "a0364839ca8952a48d6f62a04041f2cf";
  
  public LodgingProviderLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Approx_TotalHeader getApprox_TotalHeader() {
    return getOrCreateProperty("Approx_TotalHeader", "Approx_TotalHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LodgingProviderLV.Approx_TotalHeader.class);
  }
  
  public CommentsHeader getCommentsHeader() {
    return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LodgingProviderLV.CommentsHeader.class);
  }
  
  public ContactHeader getContactHeader() {
    return getOrCreateProperty("ContactHeader", "ContactHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LodgingProviderLV.ContactHeader.class);
  }
  
  public DaysHeader getDaysHeader() {
    return getOrCreateProperty("DaysHeader", "DaysHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LodgingProviderLV.DaysHeader.class);
  }
  
  public EndDateHeader getEndDateHeader() {
    return getOrCreateProperty("EndDateHeader", "EndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LodgingProviderLV.EndDateHeader.class);
  }
  
  public LocationDetailsCellHeader getLocationDetailsCellHeader() {
    return getOrCreateProperty("LocationDetailsCellHeader", "LocationDetailsCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LodgingProviderLV.LocationDetailsCellHeader.class);
  }
  
  public RateHeader getRateHeader() {
    return getOrCreateProperty("RateHeader", "RateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LodgingProviderLV.RateHeader.class);
  }
  
  public StartDateHeader getStartDateHeader() {
    return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LodgingProviderLV.StartDateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LodgingProviderLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LodgingProviderLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Approx_TotalHeader extends ValueElement {
    public Approx_TotalHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentsHeader extends ValueElement {
    public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactHeader extends ValueElement {
    public ContactHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DaysHeader extends ValueElement {
    public DaysHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndDateHeader extends ValueElement {
    public EndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationDetailsCellHeader extends ValueElement {
    public LocationDetailsCellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RateHeader extends ValueElement {
    public RateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartDateHeader extends ValueElement {
    public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getApprox_Total() {
      return getOrCreateProperty("Approx_Total", "Approx_Total", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getComments() {
      return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Contact getContact() {
      return getOrCreateProperty("Contact", "Contact", null, pcftest.LodgingProviderLV.entry.Contact.class);
    }
    
    public ValueElement getDays() {
      return getOrCreateProperty("Days", "Days", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getEndDate() {
      return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public LocationDetailsCell getLocationDetailsCell() {
      return getOrCreateProperty("LocationDetailsCell", "LocationDetailsCell", null, pcftest.LodgingProviderLV.entry.LocationDetailsCell.class);
    }
    
    public ValueElement getRate() {
      return getOrCreateProperty("Rate", "Rate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartDate() {
      return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.LodgingProviderLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LodgingProviderLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Contact extends SelectElement {
      public Contact(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewCompanyOnlyPickerMenuItemSet getClaimNewCompanyOnlyPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewCompanyOnlyPickerMenuItemSet", "ClaimNewCompanyOnlyPickerMenuItemSet", null, pcftest.ClaimNewCompanyOnlyPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LodgingProviderLV.entry.Contact.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LodgingProviderLV.entry.Contact.MenuItem_ViewDetails.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MenuItem_Search extends ClickableActionElement {
        public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddressBookPickerPopup click() {
          return clickThis(pcftest.AddressBookPickerPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MenuItem_ViewDetails extends ClickableActionElement {
        public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LocationDetailsCell extends PCFElement {
      public LocationDetailsCell(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ContactPhoneDisplayCell_NullContact getContactPhoneDisplayCell_NullContact() {
        return getOrCreateProperty("ContactPhoneDisplayCell_NullContact", "ContactPhoneDisplayCell", null, pcftest.ContactPhoneDisplayCell_NullContact.class);
      }
      
      public ContactPhoneDisplayCell_default getContactPhoneDisplayCell_default() {
        return getOrCreateProperty("ContactPhoneDisplayCell_default", "ContactPhoneDisplayCell", null, pcftest.ContactPhoneDisplayCell_default.class);
      }
      
      public ValueElement getLocationDetailsCell() {
        return getOrCreateProperty("LocationDetailsCell", "LocationDetailsCell", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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