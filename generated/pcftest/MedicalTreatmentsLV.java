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
import pcftest.MedicalTreatmentsLV.MedicalTreatments_ActionDateHeader;
import pcftest.MedicalTreatmentsLV.MedicalTreatments_ApprovedTreatmentHeader;
import pcftest.MedicalTreatmentsLV.MedicalTreatments_ICD1Header;
import pcftest.MedicalTreatmentsLV.MedicalTreatments_ICD2Header;
import pcftest.MedicalTreatmentsLV.MedicalTreatments_ICD3Header;
import pcftest.MedicalTreatmentsLV.MedicalTreatments_ICD4Header;
import pcftest.MedicalTreatmentsLV.MedicalTreatments_ProviderNameHeader;
import pcftest.MedicalTreatmentsLV.MedicalTreatments_ProviderSpecialtyHeader;
import pcftest.MedicalTreatmentsLV.MedicalTreatments_TreatmentQuantityHeader;
import pcftest.MedicalTreatmentsLV._ListPaging;
import pcftest.MedicalTreatmentsLV.entry;
import pcftest.MedicalTreatmentsLV.entry.MedicalTreatments_ApprovedTreatment;
import pcftest.MedicalTreatmentsLV.entry.MedicalTreatments_ProviderSpecialty;
import pcftest.MedicalTreatmentsLV.entry._Select;
import pcftest.MedicalTreatmentsLV.entry._ViewDetail;
import typekey.ApprovedTreatment;
import typekey.SpecialtyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MedicalTreatmentsLV extends PCFElement {
  public final static String CHECKSUM = "ef78ee6352ec8165d560bd1e7de17388";
  
  public MedicalTreatmentsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public MedicalTreatments_ActionDateHeader getMedicalTreatments_ActionDateHeader() {
    return getOrCreateProperty("MedicalTreatments_ActionDateHeader", "MedicalTreatments_ActionDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalTreatmentsLV.MedicalTreatments_ActionDateHeader.class);
  }
  
  public MedicalTreatments_ApprovedTreatmentHeader getMedicalTreatments_ApprovedTreatmentHeader() {
    return getOrCreateProperty("MedicalTreatments_ApprovedTreatmentHeader", "MedicalTreatments_ApprovedTreatmentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalTreatmentsLV.MedicalTreatments_ApprovedTreatmentHeader.class);
  }
  
  public MedicalTreatments_ICD1Header getMedicalTreatments_ICD1Header() {
    return getOrCreateProperty("MedicalTreatments_ICD1Header", "MedicalTreatments_ICD1Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalTreatmentsLV.MedicalTreatments_ICD1Header.class);
  }
  
  public MedicalTreatments_ICD2Header getMedicalTreatments_ICD2Header() {
    return getOrCreateProperty("MedicalTreatments_ICD2Header", "MedicalTreatments_ICD2Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalTreatmentsLV.MedicalTreatments_ICD2Header.class);
  }
  
  public MedicalTreatments_ICD3Header getMedicalTreatments_ICD3Header() {
    return getOrCreateProperty("MedicalTreatments_ICD3Header", "MedicalTreatments_ICD3Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalTreatmentsLV.MedicalTreatments_ICD3Header.class);
  }
  
  public MedicalTreatments_ICD4Header getMedicalTreatments_ICD4Header() {
    return getOrCreateProperty("MedicalTreatments_ICD4Header", "MedicalTreatments_ICD4Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalTreatmentsLV.MedicalTreatments_ICD4Header.class);
  }
  
  public MedicalTreatments_ProviderNameHeader getMedicalTreatments_ProviderNameHeader() {
    return getOrCreateProperty("MedicalTreatments_ProviderNameHeader", "MedicalTreatments_ProviderNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalTreatmentsLV.MedicalTreatments_ProviderNameHeader.class);
  }
  
  public MedicalTreatments_ProviderSpecialtyHeader getMedicalTreatments_ProviderSpecialtyHeader() {
    return getOrCreateProperty("MedicalTreatments_ProviderSpecialtyHeader", "MedicalTreatments_ProviderSpecialtyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalTreatmentsLV.MedicalTreatments_ProviderSpecialtyHeader.class);
  }
  
  public MedicalTreatments_TreatmentQuantityHeader getMedicalTreatments_TreatmentQuantityHeader() {
    return getOrCreateProperty("MedicalTreatments_TreatmentQuantityHeader", "MedicalTreatments_TreatmentQuantityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MedicalTreatmentsLV.MedicalTreatments_TreatmentQuantityHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MedicalTreatmentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MedicalTreatmentsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatments_ActionDateHeader extends ValueElement {
    public MedicalTreatments_ActionDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatments_ApprovedTreatmentHeader extends ValueElement {
    public MedicalTreatments_ApprovedTreatmentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatments_ICD1Header extends ValueElement {
    public MedicalTreatments_ICD1Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatments_ICD2Header extends ValueElement {
    public MedicalTreatments_ICD2Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatments_ICD3Header extends ValueElement {
    public MedicalTreatments_ICD3Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatments_ICD4Header extends ValueElement {
    public MedicalTreatments_ICD4Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatments_ProviderNameHeader extends ValueElement {
    public MedicalTreatments_ProviderNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatments_ProviderSpecialtyHeader extends ValueElement {
    public MedicalTreatments_ProviderSpecialtyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatments_TreatmentQuantityHeader extends ValueElement {
    public MedicalTreatments_TreatmentQuantityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getMedicalTreatments_ActionDate() {
      return getOrCreateProperty("MedicalTreatments_ActionDate", "MedicalTreatments_ActionDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public MedicalTreatments_ApprovedTreatment getMedicalTreatments_ApprovedTreatment() {
      return getOrCreateProperty("MedicalTreatments_ApprovedTreatment", "MedicalTreatments_ApprovedTreatment", null, pcftest.MedicalTreatmentsLV.entry.MedicalTreatments_ApprovedTreatment.class);
    }
    
    public ValueElement getMedicalTreatments_ICD1() {
      return getOrCreateProperty("MedicalTreatments_ICD1", "MedicalTreatments_ICD1", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMedicalTreatments_ICD2() {
      return getOrCreateProperty("MedicalTreatments_ICD2", "MedicalTreatments_ICD2", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMedicalTreatments_ICD3() {
      return getOrCreateProperty("MedicalTreatments_ICD3", "MedicalTreatments_ICD3", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMedicalTreatments_ICD4() {
      return getOrCreateProperty("MedicalTreatments_ICD4", "MedicalTreatments_ICD4", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getMedicalTreatments_ProviderName() {
      return getOrCreateProperty("MedicalTreatments_ProviderName", "MedicalTreatments_ProviderName", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public MedicalTreatments_ProviderSpecialty getMedicalTreatments_ProviderSpecialty() {
      return getOrCreateProperty("MedicalTreatments_ProviderSpecialty", "MedicalTreatments_ProviderSpecialty", null, pcftest.MedicalTreatmentsLV.entry.MedicalTreatments_ProviderSpecialty.class);
    }
    
    public ValueElement getMedicalTreatments_TreatmentQuantity() {
      return getOrCreateProperty("MedicalTreatments_TreatmentQuantity", "MedicalTreatments_TreatmentQuantity", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MedicalTreatmentsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MedicalTreatmentsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedicalTreatments_ApprovedTreatment extends SelectElement {
      public MedicalTreatments_ApprovedTreatment(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ApprovedTreatment arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ApprovedTreatment getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ApprovedTreatment.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ApprovedTreatment arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedicalTreatments_ProviderSpecialty extends SelectElement {
      public MedicalTreatments_ProviderSpecialty(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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