package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.ClaimSnapshotCovTermCardTab;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.AmountHeader;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.CovTermPatternHeader;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.ModelAggregationHeader;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.ModelRestrictionHeader;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.TypeHeader;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV._ListPaging;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.covSortOrderCellHeader;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.entry;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.entry.CovTermPattern;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.entry._Select;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.entry._ViewDetail;
import pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyCovTermsCV_800 extends ClaimSnapshotPolicyCovTermsCV {
  public final static String CHECKSUM = "52cad9606665bd940a6d4cfa213f6971";
  
  public ClaimSnapshotPolicyCovTermsCV_800(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotCovTermCardTab getClaimSnapshotCovTermCardTab() {
    return getOrCreateProperty("ClaimSnapshotCovTermCardTab", "ClaimSnapshotCovTermCardTab", null, pcftest.ClaimSnapshotPolicyCovTermsCV_800.ClaimSnapshotCovTermCardTab.class);
  }
  
  public CovTermLV getCovTermLV() {
    return getOrCreateProperty("CovTermLV", "CovTermLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.class);
  }
  
  public CovTermLV_tb getCovTermLV_tb() {
    return getOrCreateProperty("CovTermLV_tb", "CovTermLV_tb", null, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotCovTermCardTab extends ClickableActionElement {
    public ClaimSnapshotCovTermCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CovTermLV extends PCFElement {
    public CovTermLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AmountHeader getAmountHeader() {
      return getOrCreateProperty("AmountHeader", "AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.AmountHeader.class);
    }
    
    public CovTermPatternHeader getCovTermPatternHeader() {
      return getOrCreateProperty("CovTermPatternHeader", "CovTermPatternHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.CovTermPatternHeader.class);
    }
    
    public ModelAggregationHeader getModelAggregationHeader() {
      return getOrCreateProperty("ModelAggregationHeader", "ModelAggregationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.ModelAggregationHeader.class);
    }
    
    public ModelRestrictionHeader getModelRestrictionHeader() {
      return getOrCreateProperty("ModelRestrictionHeader", "ModelRestrictionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.ModelRestrictionHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV._ListPaging.class);
    }
    
    public covSortOrderCellHeader getcovSortOrderCellHeader() {
      return getOrCreateProperty("covSortOrderCellHeader", "covSortOrderCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.covSortOrderCellHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AmountHeader extends ValueElement {
      public AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermPatternHeader extends ValueElement {
      public CovTermPatternHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ModelAggregationHeader extends ValueElement {
      public ModelAggregationHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ModelRestrictionHeader extends ValueElement {
      public ModelRestrictionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class covSortOrderCellHeader extends ValueElement {
      public covSortOrderCellHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAmount() {
        return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public CovTermPattern getCovTermPattern() {
        return getOrCreateProperty("CovTermPattern", "CovTermPattern", null, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.entry.CovTermPattern.class);
      }
      
      public ValueElement getModelAggregation() {
        return getOrCreateProperty("ModelAggregation", "ModelAggregation", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getModelRestriction() {
        return getOrCreateProperty("ModelRestriction", "ModelRestriction", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getType() {
        return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyCovTermsCV_800.CovTermLV.entry._ViewDetail.class);
      }
      
      public ValueElement getcovSortOrderCell() {
        return getOrCreateProperty("covSortOrderCell", "covSortOrderCell", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CovTermPattern extends ValueElement {
        public CovTermPattern(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSnapshotCovTerm800Popup click() {
          return clickThis(pcftest.ClaimSnapshotCovTerm800Popup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotPolicyCovTermsCV.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CovTermLV_tb extends PCFElement {
    public CovTermLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}