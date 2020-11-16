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
import pcftest.ClaimPolicyCovTermsLV.CovTermPatternHeader;
import pcftest.ClaimPolicyCovTermsLV.CovTermUnitsHeader;
import pcftest.ClaimPolicyCovTermsLV.ModelAggregationHeader;
import pcftest.ClaimPolicyCovTermsLV.ModelRestrictionHeader;
import pcftest.ClaimPolicyCovTermsLV._ListPaging;
import pcftest.ClaimPolicyCovTermsLV.entry;
import pcftest.ClaimPolicyCovTermsLV.entry.ModelAggregation;
import pcftest.ClaimPolicyCovTermsLV.entry.ModelRestriction;
import pcftest.ClaimPolicyCovTermsLV.entry._Select;
import pcftest.ClaimPolicyCovTermsLV.entry._ViewDetail;
import typekey.CovTermModelAgg;
import typekey.CovTermModelRest;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyCovTermsLV extends PCFElement {
  public final static String CHECKSUM = "fb7c7763994429f4f8bbd7ed2ffb8749";
  
  public ClaimPolicyCovTermsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CovTermPatternHeader getCovTermPatternHeader() {
    return getOrCreateProperty("CovTermPatternHeader", "CovTermPatternHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimPolicyCovTermsLV.CovTermPatternHeader.class);
  }
  
  public CovTermUnitsHeader getCovTermUnitsHeader() {
    return getOrCreateProperty("CovTermUnitsHeader", "CovTermUnitsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimPolicyCovTermsLV.CovTermUnitsHeader.class);
  }
  
  public ModelAggregationHeader getModelAggregationHeader() {
    return getOrCreateProperty("ModelAggregationHeader", "ModelAggregationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimPolicyCovTermsLV.ModelAggregationHeader.class);
  }
  
  public ModelRestrictionHeader getModelRestrictionHeader() {
    return getOrCreateProperty("ModelRestrictionHeader", "ModelRestrictionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimPolicyCovTermsLV.ModelRestrictionHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimPolicyCovTermsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimPolicyCovTermsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CovTermPatternHeader extends ValueElement {
    public CovTermPatternHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CovTermUnitsHeader extends ValueElement {
    public CovTermUnitsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ModelAggregationHeader extends ValueElement {
    public ModelAggregationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ModelRestrictionHeader extends ValueElement {
    public ModelRestrictionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CovTermAmount_Classification getCovTermAmount_Classification() {
      return getOrCreateProperty("CovTermAmount_Classification", "CovTermAmount", null, pcftest.CovTermAmount_Classification.class);
    }
    
    public CovTermAmount_Financial getCovTermAmount_Financial() {
      return getOrCreateProperty("CovTermAmount_Financial", "CovTermAmount", null, pcftest.CovTermAmount_Financial.class);
    }
    
    public CovTermAmount_Numeric getCovTermAmount_Numeric() {
      return getOrCreateProperty("CovTermAmount_Numeric", "CovTermAmount", null, pcftest.CovTermAmount_Numeric.class);
    }
    
    public CovTermAmount_default getCovTermAmount_default() {
      return getOrCreateProperty("CovTermAmount_default", "CovTermAmount", null, pcftest.CovTermAmount_default.class);
    }
    
    public pcftest.ClaimPolicyCovTermsLV.entry.CovTermPattern getCovTermPattern() {
      return getOrCreateProperty("CovTermPattern", "CovTermPattern", null, pcftest.ClaimPolicyCovTermsLV.entry.CovTermPattern.class);
    }
    
    public ValueElement getCovTermUnits() {
      return getOrCreateProperty("CovTermUnits", "CovTermUnits", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ModelAggregation getModelAggregation() {
      return getOrCreateProperty("ModelAggregation", "ModelAggregation", null, pcftest.ClaimPolicyCovTermsLV.entry.ModelAggregation.class);
    }
    
    public ModelRestriction getModelRestriction() {
      return getOrCreateProperty("ModelRestriction", "ModelRestriction", null, pcftest.ClaimPolicyCovTermsLV.entry.ModelRestriction.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimPolicyCovTermsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimPolicyCovTermsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermPattern extends SelectElement {
      public CovTermPattern(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CovTermPopup click() {
        return clickThis(pcftest.CovTermPopup.class);
      }
      
      public OptionElement getOptionByTypeKey(typekey.CovTermPattern arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.CovTermPattern getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CovTermPattern.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.CovTermPattern arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ModelAggregation extends SelectElement {
      public ModelAggregation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(CovTermModelAgg arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CovTermModelAgg getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CovTermModelAgg.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CovTermModelAgg arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ModelRestriction extends SelectElement {
      public ModelRestriction(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(CovTermModelRest arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CovTermModelRest getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CovTermModelRest.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CovTermModelRest arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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