package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.EditableWitnessesLV.ContactHeader;
import pcftest.EditableWitnessesLV.EditableWitnesses_WitnessPerspectiveHeader;
import pcftest.EditableWitnessesLV.EditableWitnesses_WitnessPositionHeader;
import pcftest.EditableWitnessesLV.EditableWitnesses_WitnessStatementIndHeader;
import pcftest.EditableWitnessesLV._ListPaging;
import pcftest.EditableWitnessesLV.entry;
import pcftest.EditableWitnessesLV.entry.Contact;
import pcftest.EditableWitnessesLV.entry.Contact.MenuItem_Search;
import pcftest.EditableWitnessesLV.entry.Contact.MenuItem_ViewDetails;
import pcftest.EditableWitnessesLV.entry.EditableWitnesses_WitnessPosition;
import pcftest.EditableWitnessesLV.entry.EditableWitnesses_WitnessStatementInd;
import pcftest.EditableWitnessesLV.entry._Select;
import pcftest.EditableWitnessesLV.entry._ViewDetail;
import typekey.WitnessPosition;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableWitnessesLV extends PCFElement {
  public final static String CHECKSUM = "b152bce19b4ae608b9851feda0b7efec";
  
  public EditableWitnessesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ContactHeader getContactHeader() {
    return getOrCreateProperty("ContactHeader", "ContactHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableWitnessesLV.ContactHeader.class);
  }
  
  public EditableWitnesses_WitnessPerspectiveHeader getEditableWitnesses_WitnessPerspectiveHeader() {
    return getOrCreateProperty("EditableWitnesses_WitnessPerspectiveHeader", "EditableWitnesses_WitnessPerspectiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableWitnessesLV.EditableWitnesses_WitnessPerspectiveHeader.class);
  }
  
  public EditableWitnesses_WitnessPositionHeader getEditableWitnesses_WitnessPositionHeader() {
    return getOrCreateProperty("EditableWitnesses_WitnessPositionHeader", "EditableWitnesses_WitnessPositionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableWitnessesLV.EditableWitnesses_WitnessPositionHeader.class);
  }
  
  public EditableWitnesses_WitnessStatementIndHeader getEditableWitnesses_WitnessStatementIndHeader() {
    return getOrCreateProperty("EditableWitnesses_WitnessStatementIndHeader", "EditableWitnesses_WitnessStatementIndHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableWitnessesLV.EditableWitnesses_WitnessStatementIndHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableWitnessesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableWitnessesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactHeader extends ValueElement {
    public ContactHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableWitnesses_WitnessPerspectiveHeader extends ValueElement {
    public EditableWitnesses_WitnessPerspectiveHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableWitnesses_WitnessPositionHeader extends ValueElement {
    public EditableWitnesses_WitnessPositionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableWitnesses_WitnessStatementIndHeader extends ValueElement {
    public EditableWitnesses_WitnessStatementIndHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Contact getContact() {
      return getOrCreateProperty("Contact", "Contact", null, pcftest.EditableWitnessesLV.entry.Contact.class);
    }
    
    public ValueElement getEditableWitnesses_WitnessPerspective() {
      return getOrCreateProperty("EditableWitnesses_WitnessPerspective", "EditableWitnesses_WitnessPerspective", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EditableWitnesses_WitnessPosition getEditableWitnesses_WitnessPosition() {
      return getOrCreateProperty("EditableWitnesses_WitnessPosition", "EditableWitnesses_WitnessPosition", null, pcftest.EditableWitnessesLV.entry.EditableWitnesses_WitnessPosition.class);
    }
    
    public EditableWitnesses_WitnessStatementInd getEditableWitnesses_WitnessStatementInd() {
      return getOrCreateProperty("EditableWitnesses_WitnessStatementInd", "EditableWitnesses_WitnessStatementInd", null, pcftest.EditableWitnessesLV.entry.EditableWitnesses_WitnessStatementInd.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableWitnessesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableWitnessesLV.entry._ViewDetail.class);
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
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.EditableWitnessesLV.entry.Contact.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.EditableWitnessesLV.entry.Contact.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableWitnesses_WitnessPosition extends SelectElement {
      public EditableWitnesses_WitnessPosition(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(WitnessPosition arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public WitnessPosition getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WitnessPosition.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(WitnessPosition arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableWitnesses_WitnessStatementInd extends SelectElement {
      public EditableWitnesses_WitnessStatementInd(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(YesNo arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public YesNo getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(YesNo arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableWitnessesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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