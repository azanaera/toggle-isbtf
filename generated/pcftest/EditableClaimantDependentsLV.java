package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.EditableClaimantDependentsLV.EditableClaimantDependents_BenefitEndDateHeader;
import pcftest.EditableClaimantDependentsLV.EditableClaimantDependents_BenefitEndReasonTypeHeader;
import pcftest.EditableClaimantDependentsLV.EditableClaimantDependents_DateOfBirthHeader;
import pcftest.EditableClaimantDependentsLV.EditableClaimantDependents_DependentHeader;
import pcftest.EditableClaimantDependentsLV.EditableClaimantDependents_DependentTypeHeader;
import pcftest.EditableClaimantDependentsLV._ListPaging;
import pcftest.EditableClaimantDependentsLV.entry;
import pcftest.EditableClaimantDependentsLV.entry.EditableClaimantDependents_BenefitEndReasonType;
import pcftest.EditableClaimantDependentsLV.entry.EditableClaimantDependents_Dependent;
import pcftest.EditableClaimantDependentsLV.entry.EditableClaimantDependents_Dependent.MenuItem_Search;
import pcftest.EditableClaimantDependentsLV.entry.EditableClaimantDependents_Dependent.MenuItem_ViewDetails;
import pcftest.EditableClaimantDependentsLV.entry.EditableClaimantDependents_DependentType;
import pcftest.EditableClaimantDependentsLV.entry._Select;
import pcftest.EditableClaimantDependentsLV.entry._ViewDetail;
import typekey.BenefitEndReasonType;
import typekey.DependentType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableClaimantDependentsLV extends PCFElement {
  public final static String CHECKSUM = "14e078aa2860943120c9ce578d71ef85";
  
  public EditableClaimantDependentsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableClaimantDependents_BenefitEndDateHeader getEditableClaimantDependents_BenefitEndDateHeader() {
    return getOrCreateProperty("EditableClaimantDependents_BenefitEndDateHeader", "EditableClaimantDependents_BenefitEndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableClaimantDependentsLV.EditableClaimantDependents_BenefitEndDateHeader.class);
  }
  
  public EditableClaimantDependents_BenefitEndReasonTypeHeader getEditableClaimantDependents_BenefitEndReasonTypeHeader() {
    return getOrCreateProperty("EditableClaimantDependents_BenefitEndReasonTypeHeader", "EditableClaimantDependents_BenefitEndReasonTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableClaimantDependentsLV.EditableClaimantDependents_BenefitEndReasonTypeHeader.class);
  }
  
  public EditableClaimantDependents_DateOfBirthHeader getEditableClaimantDependents_DateOfBirthHeader() {
    return getOrCreateProperty("EditableClaimantDependents_DateOfBirthHeader", "EditableClaimantDependents_DateOfBirthHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableClaimantDependentsLV.EditableClaimantDependents_DateOfBirthHeader.class);
  }
  
  public EditableClaimantDependents_DependentHeader getEditableClaimantDependents_DependentHeader() {
    return getOrCreateProperty("EditableClaimantDependents_DependentHeader", "EditableClaimantDependents_DependentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableClaimantDependentsLV.EditableClaimantDependents_DependentHeader.class);
  }
  
  public EditableClaimantDependents_DependentTypeHeader getEditableClaimantDependents_DependentTypeHeader() {
    return getOrCreateProperty("EditableClaimantDependents_DependentTypeHeader", "EditableClaimantDependents_DependentTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableClaimantDependentsLV.EditableClaimantDependents_DependentTypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableClaimantDependentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableClaimantDependentsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimantDependents_BenefitEndDateHeader extends ValueElement {
    public EditableClaimantDependents_BenefitEndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimantDependents_BenefitEndReasonTypeHeader extends ValueElement {
    public EditableClaimantDependents_BenefitEndReasonTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimantDependents_DateOfBirthHeader extends ValueElement {
    public EditableClaimantDependents_DateOfBirthHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimantDependents_DependentHeader extends ValueElement {
    public EditableClaimantDependents_DependentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimantDependents_DependentTypeHeader extends ValueElement {
    public EditableClaimantDependents_DependentTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getEditableClaimantDependents_BenefitEndDate() {
      return getOrCreateProperty("EditableClaimantDependents_BenefitEndDate", "EditableClaimantDependents_BenefitEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public EditableClaimantDependents_BenefitEndReasonType getEditableClaimantDependents_BenefitEndReasonType() {
      return getOrCreateProperty("EditableClaimantDependents_BenefitEndReasonType", "EditableClaimantDependents_BenefitEndReasonType", null, pcftest.EditableClaimantDependentsLV.entry.EditableClaimantDependents_BenefitEndReasonType.class);
    }
    
    public DateElement getEditableClaimantDependents_DateOfBirth() {
      return getOrCreateProperty("EditableClaimantDependents_DateOfBirth", "EditableClaimantDependents_DateOfBirth", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public EditableClaimantDependents_Dependent getEditableClaimantDependents_Dependent() {
      return getOrCreateProperty("EditableClaimantDependents_Dependent", "EditableClaimantDependents_Dependent", null, pcftest.EditableClaimantDependentsLV.entry.EditableClaimantDependents_Dependent.class);
    }
    
    public EditableClaimantDependents_DependentType getEditableClaimantDependents_DependentType() {
      return getOrCreateProperty("EditableClaimantDependents_DependentType", "EditableClaimantDependents_DependentType", null, pcftest.EditableClaimantDependentsLV.entry.EditableClaimantDependents_DependentType.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableClaimantDependentsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableClaimantDependentsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableClaimantDependents_BenefitEndReasonType extends SelectElement {
      public EditableClaimantDependents_BenefitEndReasonType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(BenefitEndReasonType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public BenefitEndReasonType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BenefitEndReasonType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(BenefitEndReasonType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableClaimantDependents_Dependent extends SelectElement {
      public EditableClaimantDependents_Dependent(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.EditableClaimantDependentsLV.entry.EditableClaimantDependents_Dependent.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.EditableClaimantDependentsLV.entry.EditableClaimantDependents_Dependent.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableClaimantDependents_DependentType extends SelectElement {
      public EditableClaimantDependents_DependentType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(DependentType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public DependentType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DependentType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(DependentType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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