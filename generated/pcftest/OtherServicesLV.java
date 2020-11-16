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
import pcftest.OtherServicesLV.KindHeader;
import pcftest.OtherServicesLV.RelatedToHeader;
import pcftest.OtherServicesLV.ServicesHeader;
import pcftest.OtherServicesLV.SpecialistHeader;
import pcftest.OtherServicesLV._ListPaging;
import pcftest.OtherServicesLV.entry;
import pcftest.OtherServicesLV.entry._Select;
import pcftest.OtherServicesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherServicesLV extends PCFElement {
  public final static String CHECKSUM = "aaae979a51e683360ab91e30f15703f0";
  
  public OtherServicesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public KindHeader getKindHeader() {
    return getOrCreateProperty("KindHeader", "KindHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OtherServicesLV.KindHeader.class);
  }
  
  public RelatedToHeader getRelatedToHeader() {
    return getOrCreateProperty("RelatedToHeader", "RelatedToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OtherServicesLV.RelatedToHeader.class);
  }
  
  public ServicesHeader getServicesHeader() {
    return getOrCreateProperty("ServicesHeader", "ServicesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OtherServicesLV.ServicesHeader.class);
  }
  
  public SpecialistHeader getSpecialistHeader() {
    return getOrCreateProperty("SpecialistHeader", "SpecialistHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OtherServicesLV.SpecialistHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.OtherServicesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.OtherServicesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class KindHeader extends ValueElement {
    public KindHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedToHeader extends ValueElement {
    public RelatedToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServicesHeader extends ValueElement {
    public ServicesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialistHeader extends ValueElement {
    public SpecialistHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getKind() {
      return getOrCreateProperty("Kind", "Kind", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getRelatedTo() {
      return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getServices() {
      return getOrCreateProperty("Services", "Services", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSpecialist() {
      return getOrCreateProperty("Specialist", "Specialist", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.OtherServicesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.OtherServicesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/OtherServicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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