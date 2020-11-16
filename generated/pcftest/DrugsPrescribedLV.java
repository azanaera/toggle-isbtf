package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.DrugsPrescribedLV.DrugsPrescribed_DatePrescribedHeader;
import pcftest.DrugsPrescribedLV.DrugsPrescribed_DateScriptExpiresHeader;
import pcftest.DrugsPrescribedLV.DrugsPrescribed_DrugNameHeader;
import pcftest.DrugsPrescribedLV.DrugsPrescribed_PrescribingPhysicianHeader;
import pcftest.DrugsPrescribedLV._ListPaging;
import pcftest.DrugsPrescribedLV.entry;
import pcftest.DrugsPrescribedLV.entry._Select;
import pcftest.DrugsPrescribedLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DrugsPrescribedLV extends PCFElement {
  public final static String CHECKSUM = "04da29aca18d2917afa74d537c412fc9";
  
  public DrugsPrescribedLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DrugsPrescribed_DatePrescribedHeader getDrugsPrescribed_DatePrescribedHeader() {
    return getOrCreateProperty("DrugsPrescribed_DatePrescribedHeader", "DrugsPrescribed_DatePrescribedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DrugsPrescribedLV.DrugsPrescribed_DatePrescribedHeader.class);
  }
  
  public DrugsPrescribed_DateScriptExpiresHeader getDrugsPrescribed_DateScriptExpiresHeader() {
    return getOrCreateProperty("DrugsPrescribed_DateScriptExpiresHeader", "DrugsPrescribed_DateScriptExpiresHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DrugsPrescribedLV.DrugsPrescribed_DateScriptExpiresHeader.class);
  }
  
  public DrugsPrescribed_DrugNameHeader getDrugsPrescribed_DrugNameHeader() {
    return getOrCreateProperty("DrugsPrescribed_DrugNameHeader", "DrugsPrescribed_DrugNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DrugsPrescribedLV.DrugsPrescribed_DrugNameHeader.class);
  }
  
  public DrugsPrescribed_PrescribingPhysicianHeader getDrugsPrescribed_PrescribingPhysicianHeader() {
    return getOrCreateProperty("DrugsPrescribed_PrescribingPhysicianHeader", "DrugsPrescribed_PrescribingPhysicianHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DrugsPrescribedLV.DrugsPrescribed_PrescribingPhysicianHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DrugsPrescribedLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DrugsPrescribedLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrugsPrescribed_DatePrescribedHeader extends ValueElement {
    public DrugsPrescribed_DatePrescribedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrugsPrescribed_DateScriptExpiresHeader extends ValueElement {
    public DrugsPrescribed_DateScriptExpiresHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrugsPrescribed_DrugNameHeader extends ValueElement {
    public DrugsPrescribed_DrugNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrugsPrescribed_PrescribingPhysicianHeader extends ValueElement {
    public DrugsPrescribed_PrescribingPhysicianHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getDrugsPrescribed_DatePrescribed() {
      return getOrCreateProperty("DrugsPrescribed_DatePrescribed", "DrugsPrescribed_DatePrescribed", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getDrugsPrescribed_DateScriptExpires() {
      return getOrCreateProperty("DrugsPrescribed_DateScriptExpires", "DrugsPrescribed_DateScriptExpires", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getDrugsPrescribed_DrugName() {
      return getOrCreateProperty("DrugsPrescribed_DrugName", "DrugsPrescribed_DrugName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getDrugsPrescribed_PrescribingPhysician() {
      return getOrCreateProperty("DrugsPrescribed_PrescribingPhysician", "DrugsPrescribed_PrescribingPhysician", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.DrugsPrescribedLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DrugsPrescribedLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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