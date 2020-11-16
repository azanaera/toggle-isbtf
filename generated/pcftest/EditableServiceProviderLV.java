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
import pcftest.EditableServiceProviderLV.EditableServiceProvider_PhoneHeader;
import pcftest.EditableServiceProviderLV.EditableServiceProvider_ProviderTypeHeader;
import pcftest.EditableServiceProviderLV.EditableServiceProvider_ServiceHeader;
import pcftest.EditableServiceProviderLV.EditableServiceProvider_ServiceTypeHeader;
import pcftest.EditableServiceProviderLV.Exposure_RSBenProviderHeader;
import pcftest.EditableServiceProviderLV._ListPaging;
import pcftest.EditableServiceProviderLV.entry;
import pcftest.EditableServiceProviderLV.entry.EditableServiceProvider_ProviderType;
import pcftest.EditableServiceProviderLV.entry.EditableServiceProvider_ServiceType;
import pcftest.EditableServiceProviderLV.entry.Exposure_RSBenProvider;
import pcftest.EditableServiceProviderLV.entry.Exposure_RSBenProvider.MenuItem_Search;
import pcftest.EditableServiceProviderLV.entry.Exposure_RSBenProvider.MenuItem_ViewDetails;
import pcftest.EditableServiceProviderLV.entry._Select;
import pcftest.EditableServiceProviderLV.entry._ViewDetail;
import typekey.EssentialServiceType;
import typekey.ProviderType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableServiceProviderLV extends PCFElement {
  public final static String CHECKSUM = "d81f59b1e38a99c6407ba60dfa46d1ad";
  
  public EditableServiceProviderLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableServiceProvider_PhoneHeader getEditableServiceProvider_PhoneHeader() {
    return getOrCreateProperty("EditableServiceProvider_PhoneHeader", "EditableServiceProvider_PhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableServiceProviderLV.EditableServiceProvider_PhoneHeader.class);
  }
  
  public EditableServiceProvider_ProviderTypeHeader getEditableServiceProvider_ProviderTypeHeader() {
    return getOrCreateProperty("EditableServiceProvider_ProviderTypeHeader", "EditableServiceProvider_ProviderTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableServiceProviderLV.EditableServiceProvider_ProviderTypeHeader.class);
  }
  
  public EditableServiceProvider_ServiceHeader getEditableServiceProvider_ServiceHeader() {
    return getOrCreateProperty("EditableServiceProvider_ServiceHeader", "EditableServiceProvider_ServiceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableServiceProviderLV.EditableServiceProvider_ServiceHeader.class);
  }
  
  public EditableServiceProvider_ServiceTypeHeader getEditableServiceProvider_ServiceTypeHeader() {
    return getOrCreateProperty("EditableServiceProvider_ServiceTypeHeader", "EditableServiceProvider_ServiceTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableServiceProviderLV.EditableServiceProvider_ServiceTypeHeader.class);
  }
  
  public Exposure_RSBenProviderHeader getExposure_RSBenProviderHeader() {
    return getOrCreateProperty("Exposure_RSBenProviderHeader", "Exposure_RSBenProviderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableServiceProviderLV.Exposure_RSBenProviderHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableServiceProviderLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableServiceProviderLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableServiceProvider_PhoneHeader extends ValueElement {
    public EditableServiceProvider_PhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableServiceProvider_ProviderTypeHeader extends ValueElement {
    public EditableServiceProvider_ProviderTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableServiceProvider_ServiceHeader extends ValueElement {
    public EditableServiceProvider_ServiceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableServiceProvider_ServiceTypeHeader extends ValueElement {
    public EditableServiceProvider_ServiceTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_RSBenProviderHeader extends ValueElement {
    public Exposure_RSBenProviderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getEditableServiceProvider_Phone() {
      return getOrCreateProperty("EditableServiceProvider_Phone", "EditableServiceProvider_Phone", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EditableServiceProvider_ProviderType getEditableServiceProvider_ProviderType() {
      return getOrCreateProperty("EditableServiceProvider_ProviderType", "EditableServiceProvider_ProviderType", null, pcftest.EditableServiceProviderLV.entry.EditableServiceProvider_ProviderType.class);
    }
    
    public ValueElement getEditableServiceProvider_Service() {
      return getOrCreateProperty("EditableServiceProvider_Service", "EditableServiceProvider_Service", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EditableServiceProvider_ServiceType getEditableServiceProvider_ServiceType() {
      return getOrCreateProperty("EditableServiceProvider_ServiceType", "EditableServiceProvider_ServiceType", null, pcftest.EditableServiceProviderLV.entry.EditableServiceProvider_ServiceType.class);
    }
    
    public Exposure_RSBenProvider getExposure_RSBenProvider() {
      return getOrCreateProperty("Exposure_RSBenProvider", "Exposure_RSBenProvider", null, pcftest.EditableServiceProviderLV.entry.Exposure_RSBenProvider.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableServiceProviderLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableServiceProviderLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableServiceProvider_ProviderType extends SelectElement {
      public EditableServiceProvider_ProviderType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ProviderType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ProviderType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ProviderType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ProviderType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableServiceProvider_ServiceType extends SelectElement {
      public EditableServiceProvider_ServiceType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(EssentialServiceType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public EssentialServiceType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.EssentialServiceType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(EssentialServiceType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposure_RSBenProvider extends SelectElement {
      public Exposure_RSBenProvider(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.EditableServiceProviderLV.entry.Exposure_RSBenProvider.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.EditableServiceProviderLV.entry.Exposure_RSBenProvider.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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