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
import pcftest.DuplicateContactPopup.DuplicateContactLV;
import pcftest.DuplicateContactPopup.DuplicateContactLV.ContactSubtypeHeader;
import pcftest.DuplicateContactPopup.DuplicateContactLV.DisplayNameHeader;
import pcftest.DuplicateContactPopup.DuplicateContactLV.MatchTypeHeader;
import pcftest.DuplicateContactPopup.DuplicateContactLV.PhoneNumberHeader;
import pcftest.DuplicateContactPopup.DuplicateContactLV.PrimaryAddressHeader;
import pcftest.DuplicateContactPopup.DuplicateContactLV._ListPaging;
import pcftest.DuplicateContactPopup.DuplicateContactLV.entry;
import pcftest.DuplicateContactPopup.DuplicateContactLV.entry.ContactSubtype;
import pcftest.DuplicateContactPopup.DuplicateContactLV.entry.SelectContact;
import pcftest.DuplicateContactPopup.DuplicateContactLV.entry._Select;
import pcftest.DuplicateContactPopup.DuplicateContactLV.entry._ViewDetail;
import pcftest.DuplicateContactPopup.DuplicateContactPopup_UpLink;
import pcftest.DuplicateContactPopup.DuplicateContact_CancelButton;
import pcftest.DuplicateContactPopup._Paging;
import pcftest.DuplicateContactPopup.__crumb__;
import pcftest.DuplicateContactPopup._msgs;
import pcftest.DuplicateContactPopup.matchMessage;
import pcftest.DuplicateContactPopup.matchMessageWarning;
import typekey.Contact;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DuplicateContactPopup extends PCFLocation {
  public final static String CHECKSUM = "5ee89c80fd5a95d7e0ce4ae5d52771fc";
  
  public DuplicateContactPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DuplicateContactPopup"));
  }
  
  public DuplicateContactLV getDuplicateContactLV() {
    return getOrCreateProperty("DuplicateContactLV", "DuplicateContactLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DuplicateContactPopup.DuplicateContactLV.class);
  }
  
  public DuplicateContactPopup_UpLink getDuplicateContactPopup_UpLink() {
    return getOrCreateProperty("DuplicateContactPopup_UpLink", "DuplicateContactPopup_UpLink", null, pcftest.DuplicateContactPopup.DuplicateContactPopup_UpLink.class);
  }
  
  public DuplicateContact_CancelButton getDuplicateContact_CancelButton() {
    return getOrCreateProperty("DuplicateContact_CancelButton", "DuplicateContact_CancelButton", null, pcftest.DuplicateContactPopup.DuplicateContact_CancelButton.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DuplicateContactPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DuplicateContactPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DuplicateContactPopup._msgs.class);
  }
  
  public matchMessage getmatchMessage() {
    return getOrCreateProperty("matchMessage", "matchMessage", null, pcftest.DuplicateContactPopup.matchMessage.class);
  }
  
  public matchMessageWarning getmatchMessageWarning() {
    return getOrCreateProperty("matchMessageWarning", "matchMessageWarning", null, pcftest.DuplicateContactPopup.matchMessageWarning.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateContactLV extends PCFElement {
    public DuplicateContactLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ContactSubtypeHeader getContactSubtypeHeader() {
      return getOrCreateProperty("ContactSubtypeHeader", "ContactSubtypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DuplicateContactPopup.DuplicateContactLV.ContactSubtypeHeader.class);
    }
    
    public DisplayNameHeader getDisplayNameHeader() {
      return getOrCreateProperty("DisplayNameHeader", "DisplayNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DuplicateContactPopup.DuplicateContactLV.DisplayNameHeader.class);
    }
    
    public MatchTypeHeader getMatchTypeHeader() {
      return getOrCreateProperty("MatchTypeHeader", "MatchTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DuplicateContactPopup.DuplicateContactLV.MatchTypeHeader.class);
    }
    
    public PhoneNumberHeader getPhoneNumberHeader() {
      return getOrCreateProperty("PhoneNumberHeader", "PhoneNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DuplicateContactPopup.DuplicateContactLV.PhoneNumberHeader.class);
    }
    
    public PrimaryAddressHeader getPrimaryAddressHeader() {
      return getOrCreateProperty("PrimaryAddressHeader", "PrimaryAddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DuplicateContactPopup.DuplicateContactLV.PrimaryAddressHeader.class);
    }
    
    public ValueElement getSelectContactHeader() {
      return getOrCreateProperty("SelectContactHeader", "SelectContactHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DuplicateContactPopup.DuplicateContactLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DuplicateContactPopup.DuplicateContactLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactSubtypeHeader extends ValueElement {
      public ContactSubtypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DisplayNameHeader extends ValueElement {
      public DisplayNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MatchTypeHeader extends ValueElement {
      public MatchTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PhoneNumberHeader extends ValueElement {
      public PhoneNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrimaryAddressHeader extends ValueElement {
      public PrimaryAddressHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ContactSubtype getContactSubtype() {
        return getOrCreateProperty("ContactSubtype", "ContactSubtype", null, pcftest.DuplicateContactPopup.DuplicateContactLV.entry.ContactSubtype.class);
      }
      
      public ValueElement getDisplayName() {
        return getOrCreateProperty("DisplayName", "DisplayName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getMatchType() {
        return getOrCreateProperty("MatchType", "MatchType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPhoneNumber() {
        return getOrCreateProperty("PhoneNumber", "PhoneNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPrimaryAddress() {
        return getOrCreateProperty("PrimaryAddress", "PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public SelectContact getSelectContact() {
        return getOrCreateProperty("SelectContact", "SelectContact", null, pcftest.DuplicateContactPopup.DuplicateContactLV.entry.SelectContact.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.DuplicateContactPopup.DuplicateContactLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DuplicateContactPopup.DuplicateContactLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SelectContact extends ValueElement {
        public SelectContact(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateContactPopup_UpLink extends ClickableActionElement {
    public DuplicateContactPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DuplicateContact_CancelButton extends ClickableActionElement {
    public DuplicateContact_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class matchMessage extends ValueElement {
    public matchMessage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/DuplicateContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class matchMessageWarning extends ValueElement {
    public matchMessageWarning(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}