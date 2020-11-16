package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.AggregateLimitCoveragesLV.CoverageTypeHeader;
import pcftest.AggregateLimitCoveragesLV.CoveredItemHeader;
import pcftest.AggregateLimitCoveragesLV.LOBCoverageSubtypeHeader;
import pcftest.AggregateLimitCoveragesLV.RealizedHeader;
import pcftest.AggregateLimitCoveragesLV._ListPaging;
import pcftest.AggregateLimitCoveragesLV.entry;
import pcftest.AggregateLimitCoveragesLV.entry._Select;
import pcftest.AggregateLimitCoveragesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/AggregateLimitCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AggregateLimitCoveragesLV extends PCFElement {
  public final static String CHECKSUM = "bfc0af68e4e02fd28649b4bf3047e479";
  
  public AggregateLimitCoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CoverageTypeHeader getCoverageTypeHeader() {
    return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitCoveragesLV.CoverageTypeHeader.class);
  }
  
  public CoveredItemHeader getCoveredItemHeader() {
    return getOrCreateProperty("CoveredItemHeader", "CoveredItemHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitCoveragesLV.CoveredItemHeader.class);
  }
  
  public LOBCoverageSubtypeHeader getLOBCoverageSubtypeHeader() {
    return getOrCreateProperty("LOBCoverageSubtypeHeader", "LOBCoverageSubtypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitCoveragesLV.LOBCoverageSubtypeHeader.class);
  }
  
  public RealizedHeader getRealizedHeader() {
    return getOrCreateProperty("RealizedHeader", "RealizedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AggregateLimitCoveragesLV.RealizedHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AggregateLimitCoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AggregateLimitCoveragesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageTypeHeader extends ValueElement {
    public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoveredItemHeader extends ValueElement {
    public CoveredItemHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LOBCoverageSubtypeHeader extends ValueElement {
    public LOBCoverageSubtypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RealizedHeader extends ValueElement {
    public RealizedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getCoverageType() {
      return getOrCreateProperty("CoverageType", "CoverageType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SelectElement getCoveredItem() {
      return getOrCreateProperty("CoveredItem", "CoveredItem", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SelectElement getLOBCoverageSubtype() {
      return getOrCreateProperty("LOBCoverageSubtype", "LOBCoverageSubtype", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getRealized() {
      return getOrCreateProperty("Realized", "Realized", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.AggregateLimitCoveragesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AggregateLimitCoveragesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/AggregateLimitCoveragesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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