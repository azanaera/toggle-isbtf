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
import pcftest.EditableVehicleCoveragesLV.ClaimAggLimitHeader;
import pcftest.EditableVehicleCoveragesLV.CoverageTypeHeader;
import pcftest.EditableVehicleCoveragesLV.CurrencyHeader;
import pcftest.EditableVehicleCoveragesLV.DeductibleHeader;
import pcftest.EditableVehicleCoveragesLV.ExposureLimitHeader;
import pcftest.EditableVehicleCoveragesLV.IncidentLimitHeader;
import pcftest.EditableVehicleCoveragesLV.LimitsIndicatorHeader;
import pcftest.EditableVehicleCoveragesLV.NonmedAggLimitHeader;
import pcftest.EditableVehicleCoveragesLV.NotesHeader;
import pcftest.EditableVehicleCoveragesLV.PersonAggLimitHeader;
import pcftest.EditableVehicleCoveragesLV.ReplaceAggLimitHeader;
import pcftest.EditableVehicleCoveragesLV._ListPaging;
import pcftest.EditableVehicleCoveragesLV.entry;
import pcftest.EditableVehicleCoveragesLV.entry._Select;
import pcftest.EditableVehicleCoveragesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableVehicleCoveragesLV extends PCFElement {
  public final static String CHECKSUM = "797953b81fef4000db6b6087bbbccace";
  
  public EditableVehicleCoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimAggLimitHeader getClaimAggLimitHeader() {
    return getOrCreateProperty("ClaimAggLimitHeader", "ClaimAggLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.ClaimAggLimitHeader.class);
  }
  
  public CoverageTypeHeader getCoverageTypeHeader() {
    return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.CoverageTypeHeader.class);
  }
  
  public CurrencyHeader getCurrencyHeader() {
    return getOrCreateProperty("CurrencyHeader", "CurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.CurrencyHeader.class);
  }
  
  public DeductibleHeader getDeductibleHeader() {
    return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.DeductibleHeader.class);
  }
  
  public ExposureLimitHeader getExposureLimitHeader() {
    return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.ExposureLimitHeader.class);
  }
  
  public IncidentLimitHeader getIncidentLimitHeader() {
    return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.IncidentLimitHeader.class);
  }
  
  public LimitsIndicatorHeader getLimitsIndicatorHeader() {
    return getOrCreateProperty("LimitsIndicatorHeader", "LimitsIndicatorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.LimitsIndicatorHeader.class);
  }
  
  public NonmedAggLimitHeader getNonmedAggLimitHeader() {
    return getOrCreateProperty("NonmedAggLimitHeader", "NonmedAggLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.NonmedAggLimitHeader.class);
  }
  
  public NotesHeader getNotesHeader() {
    return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.NotesHeader.class);
  }
  
  public PersonAggLimitHeader getPersonAggLimitHeader() {
    return getOrCreateProperty("PersonAggLimitHeader", "PersonAggLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.PersonAggLimitHeader.class);
  }
  
  public ReplaceAggLimitHeader getReplaceAggLimitHeader() {
    return getOrCreateProperty("ReplaceAggLimitHeader", "ReplaceAggLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleCoveragesLV.ReplaceAggLimitHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableVehicleCoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableVehicleCoveragesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAggLimitHeader extends ValueElement {
    public ClaimAggLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageTypeHeader extends ValueElement {
    public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrencyHeader extends ValueElement {
    public CurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeductibleHeader extends ValueElement {
    public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureLimitHeader extends ValueElement {
    public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentLimitHeader extends ValueElement {
    public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LimitsIndicatorHeader extends ValueElement {
    public LimitsIndicatorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NonmedAggLimitHeader extends ValueElement {
    public NonmedAggLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesHeader extends ValueElement {
    public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PersonAggLimitHeader extends ValueElement {
    public PersonAggLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReplaceAggLimitHeader extends ValueElement {
    public ReplaceAggLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getClaimAggLimit() {
      return getOrCreateProperty("ClaimAggLimit", "ClaimAggLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.EditableVehicleCoveragesLV.entry.CoverageType getCoverageType() {
      return getOrCreateProperty("CoverageType", "CoverageType", null, pcftest.EditableVehicleCoveragesLV.entry.CoverageType.class);
    }
    
    public pcftest.EditableVehicleCoveragesLV.entry.Currency getCurrency() {
      return getOrCreateProperty("Currency", "Currency", null, pcftest.EditableVehicleCoveragesLV.entry.Currency.class);
    }
    
    public ValueElement getDeductible() {
      return getOrCreateProperty("Deductible", "Deductible", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposureLimit() {
      return getOrCreateProperty("ExposureLimit", "ExposureLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getIncidentLimit() {
      return getOrCreateProperty("IncidentLimit", "IncidentLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.EditableVehicleCoveragesLV.entry.LimitsIndicator getLimitsIndicator() {
      return getOrCreateProperty("LimitsIndicator", "LimitsIndicator", null, pcftest.EditableVehicleCoveragesLV.entry.LimitsIndicator.class);
    }
    
    public ValueElement getNonmedAggLimit() {
      return getOrCreateProperty("NonmedAggLimit", "NonmedAggLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNotes() {
      return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPersonAggLimit() {
      return getOrCreateProperty("PersonAggLimit", "PersonAggLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReplaceAggLimit() {
      return getOrCreateProperty("ReplaceAggLimit", "ReplaceAggLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableVehicleCoveragesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableVehicleCoveragesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageType extends SelectElement {
      public CoverageType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.CoverageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.CoverageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.CoverageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Currency extends SelectElement {
      public Currency(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.Currency arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.Currency getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.Currency arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LimitsIndicator extends SelectElement {
      public LimitsIndicator(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LimitsIndicator arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LimitsIndicator getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LimitsIndicator.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LimitsIndicator arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/EditableVehicleCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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