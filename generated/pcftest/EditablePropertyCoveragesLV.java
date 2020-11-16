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
import pcftest.EditablePropertyCoveragesLV.CoinsuranceHeader;
import pcftest.EditablePropertyCoveragesLV.CoverageBasisHeader;
import pcftest.EditablePropertyCoveragesLV.CoverageTypeHeader;
import pcftest.EditablePropertyCoveragesLV.CurrencyHeader;
import pcftest.EditablePropertyCoveragesLV.DeductibleHeader;
import pcftest.EditablePropertyCoveragesLV.ExposureLimitHeader;
import pcftest.EditablePropertyCoveragesLV.IncidentLimitHeader;
import pcftest.EditablePropertyCoveragesLV.LimitsIndicatorHeader;
import pcftest.EditablePropertyCoveragesLV.NotesHeader;
import pcftest.EditablePropertyCoveragesLV._ListPaging;
import pcftest.EditablePropertyCoveragesLV.entry;
import pcftest.EditablePropertyCoveragesLV.entry._Select;
import pcftest.EditablePropertyCoveragesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditablePropertyCoveragesLV extends PCFElement {
  public final static String CHECKSUM = "d7c79de03ea6b7ba25e7431572be3852";
  
  public EditablePropertyCoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CoinsuranceHeader getCoinsuranceHeader() {
    return getOrCreateProperty("CoinsuranceHeader", "CoinsuranceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditablePropertyCoveragesLV.CoinsuranceHeader.class);
  }
  
  public CoverageBasisHeader getCoverageBasisHeader() {
    return getOrCreateProperty("CoverageBasisHeader", "CoverageBasisHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditablePropertyCoveragesLV.CoverageBasisHeader.class);
  }
  
  public CoverageTypeHeader getCoverageTypeHeader() {
    return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditablePropertyCoveragesLV.CoverageTypeHeader.class);
  }
  
  public CurrencyHeader getCurrencyHeader() {
    return getOrCreateProperty("CurrencyHeader", "CurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditablePropertyCoveragesLV.CurrencyHeader.class);
  }
  
  public DeductibleHeader getDeductibleHeader() {
    return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditablePropertyCoveragesLV.DeductibleHeader.class);
  }
  
  public ExposureLimitHeader getExposureLimitHeader() {
    return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditablePropertyCoveragesLV.ExposureLimitHeader.class);
  }
  
  public IncidentLimitHeader getIncidentLimitHeader() {
    return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditablePropertyCoveragesLV.IncidentLimitHeader.class);
  }
  
  public LimitsIndicatorHeader getLimitsIndicatorHeader() {
    return getOrCreateProperty("LimitsIndicatorHeader", "LimitsIndicatorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditablePropertyCoveragesLV.LimitsIndicatorHeader.class);
  }
  
  public NotesHeader getNotesHeader() {
    return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditablePropertyCoveragesLV.NotesHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditablePropertyCoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditablePropertyCoveragesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoinsuranceHeader extends ValueElement {
    public CoinsuranceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageBasisHeader extends ValueElement {
    public CoverageBasisHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageTypeHeader extends ValueElement {
    public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrencyHeader extends ValueElement {
    public CurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeductibleHeader extends ValueElement {
    public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureLimitHeader extends ValueElement {
    public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentLimitHeader extends ValueElement {
    public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LimitsIndicatorHeader extends ValueElement {
    public LimitsIndicatorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesHeader extends ValueElement {
    public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCoinsurance() {
      return getOrCreateProperty("Coinsurance", "Coinsurance", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.EditablePropertyCoveragesLV.entry.CoverageBasis getCoverageBasis() {
      return getOrCreateProperty("CoverageBasis", "CoverageBasis", null, pcftest.EditablePropertyCoveragesLV.entry.CoverageBasis.class);
    }
    
    public pcftest.EditablePropertyCoveragesLV.entry.CoverageType getCoverageType() {
      return getOrCreateProperty("CoverageType", "CoverageType", null, pcftest.EditablePropertyCoveragesLV.entry.CoverageType.class);
    }
    
    public pcftest.EditablePropertyCoveragesLV.entry.Currency getCurrency() {
      return getOrCreateProperty("Currency", "Currency", null, pcftest.EditablePropertyCoveragesLV.entry.Currency.class);
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
    
    public pcftest.EditablePropertyCoveragesLV.entry.LimitsIndicator getLimitsIndicator() {
      return getOrCreateProperty("LimitsIndicator", "LimitsIndicator", null, pcftest.EditablePropertyCoveragesLV.entry.LimitsIndicator.class);
    }
    
    public ValueElement getNotes() {
      return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditablePropertyCoveragesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditablePropertyCoveragesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageBasis extends SelectElement {
      public CoverageBasis(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.CoverageBasis arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.CoverageBasis getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageBasis.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.CoverageBasis arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/EditablePropertyCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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