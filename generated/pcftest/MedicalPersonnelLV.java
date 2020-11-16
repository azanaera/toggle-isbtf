package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.MedicalPersonnelLV.MedicalPersonnel_ProviderNameHeader;
import pcftest.MedicalPersonnelLV.MedicalPersonnel_ProviderSpecialtyHeader;
import pcftest.MedicalPersonnelLV.MedicalPersonnel_ValidFromHeader;
import pcftest.MedicalPersonnelLV.MedicalPersonnel_ValidToHeader;
import pcftest.MedicalPersonnelLV._ListPaging;
import pcftest.MedicalPersonnelLV.entry;
import pcftest.MedicalPersonnelLV.entry.MedicalPersonnel_ProviderSpecialty;
import pcftest.MedicalPersonnelLV.entry._Select;
import pcftest.MedicalPersonnelLV.entry._ViewDetail;
import typekey.SpecialtyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MedicalPersonnelLV extends PCFElement {
  public final static String CHECKSUM = "c22f3b803beea18c142bbdc21139f915";
  
  public MedicalPersonnelLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public MedicalPersonnel_ProviderNameHeader getMedicalPersonnel_ProviderNameHeader() {
    return getOrCreateProperty("MedicalPersonnel_ProviderNameHeader", "MedicalPersonnel_ProviderNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalPersonnelLV.MedicalPersonnel_ProviderNameHeader.class);
  }
  
  public MedicalPersonnel_ProviderSpecialtyHeader getMedicalPersonnel_ProviderSpecialtyHeader() {
    return getOrCreateProperty("MedicalPersonnel_ProviderSpecialtyHeader", "MedicalPersonnel_ProviderSpecialtyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalPersonnelLV.MedicalPersonnel_ProviderSpecialtyHeader.class);
  }
  
  public MedicalPersonnel_ValidFromHeader getMedicalPersonnel_ValidFromHeader() {
    return getOrCreateProperty("MedicalPersonnel_ValidFromHeader", "MedicalPersonnel_ValidFromHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalPersonnelLV.MedicalPersonnel_ValidFromHeader.class);
  }
  
  public MedicalPersonnel_ValidToHeader getMedicalPersonnel_ValidToHeader() {
    return getOrCreateProperty("MedicalPersonnel_ValidToHeader", "MedicalPersonnel_ValidToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalPersonnelLV.MedicalPersonnel_ValidToHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MedicalPersonnelLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MedicalPersonnelLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalPersonnel_ProviderNameHeader extends ValueElement {
    public MedicalPersonnel_ProviderNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalPersonnel_ProviderSpecialtyHeader extends ValueElement {
    public MedicalPersonnel_ProviderSpecialtyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalPersonnel_ValidFromHeader extends ValueElement {
    public MedicalPersonnel_ValidFromHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalPersonnel_ValidToHeader extends ValueElement {
    public MedicalPersonnel_ValidToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getMedicalPersonnel_ProviderName() {
      return getOrCreateProperty("MedicalPersonnel_ProviderName", "MedicalPersonnel_ProviderName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MedicalPersonnel_ProviderSpecialty getMedicalPersonnel_ProviderSpecialty() {
      return getOrCreateProperty("MedicalPersonnel_ProviderSpecialty", "MedicalPersonnel_ProviderSpecialty", null, pcftest.MedicalPersonnelLV.entry.MedicalPersonnel_ProviderSpecialty.class);
    }
    
    public DateElement getMedicalPersonnel_ValidFrom() {
      return getOrCreateProperty("MedicalPersonnel_ValidFrom", "MedicalPersonnel_ValidFrom", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getMedicalPersonnel_ValidTo() {
      return getOrCreateProperty("MedicalPersonnel_ValidTo", "MedicalPersonnel_ValidTo", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MedicalPersonnelLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MedicalPersonnelLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedicalPersonnel_ProviderSpecialty extends SelectElement {
      public MedicalPersonnel_ProviderSpecialty(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(SpecialtyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public SpecialtyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SpecialtyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(SpecialtyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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