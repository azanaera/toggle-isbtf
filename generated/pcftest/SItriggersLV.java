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
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SItriggersLV.SItriggers_AdditionalInfoHeader;
import pcftest.SItriggersLV.SItriggers_DescriptionHeader;
import pcftest.SItriggersLV.SItriggers_PointValueHeader;
import pcftest.SItriggersLV._ListPaging;
import pcftest.SItriggersLV.entry;
import pcftest.SItriggersLV.entry._Select;
import pcftest.SItriggersLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SItriggersLV extends PCFElement {
  public final static String CHECKSUM = "0b6cb3a7fa685152da0444d80915dedf";
  
  public SItriggersLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SItriggers_AdditionalInfoHeader getSItriggers_AdditionalInfoHeader() {
    return getOrCreateProperty("SItriggers_AdditionalInfoHeader", "SItriggers_AdditionalInfoHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SItriggersLV.SItriggers_AdditionalInfoHeader.class);
  }
  
  public SItriggers_DescriptionHeader getSItriggers_DescriptionHeader() {
    return getOrCreateProperty("SItriggers_DescriptionHeader", "SItriggers_DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SItriggersLV.SItriggers_DescriptionHeader.class);
  }
  
  public SItriggers_PointValueHeader getSItriggers_PointValueHeader() {
    return getOrCreateProperty("SItriggers_PointValueHeader", "SItriggers_PointValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SItriggersLV.SItriggers_PointValueHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SItriggersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SItriggersLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SItriggers_AdditionalInfoHeader extends ValueElement {
    public SItriggers_AdditionalInfoHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SItriggers_DescriptionHeader extends ValueElement {
    public SItriggers_DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SItriggers_PointValueHeader extends ValueElement {
    public SItriggers_PointValueHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getSItriggers_AdditionalInfo() {
      return getOrCreateProperty("SItriggers_AdditionalInfo", "SItriggers_AdditionalInfo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSItriggers_Description() {
      return getOrCreateProperty("SItriggers_Description", "SItriggers_Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSItriggers_PointValue() {
      return getOrCreateProperty("SItriggers_PointValue", "SItriggers_PointValue", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.SItriggersLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SItriggersLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SItriggersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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