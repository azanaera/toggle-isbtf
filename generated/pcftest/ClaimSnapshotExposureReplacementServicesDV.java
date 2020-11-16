package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotExposureReplacementServicesDV.EditableServiceProvider_PhoneHeader;
import pcftest.ClaimSnapshotExposureReplacementServicesDV.EditableServiceProvider_ProviderTypeHeader;
import pcftest.ClaimSnapshotExposureReplacementServicesDV.EditableServiceProvider_ServiceHeader;
import pcftest.ClaimSnapshotExposureReplacementServicesDV.EditableServiceProvider_ServiceTypeHeader;
import pcftest.ClaimSnapshotExposureReplacementServicesDV.Exposure_RSBenProviderHeader;
import pcftest.ClaimSnapshotExposureReplacementServicesDV._ListPaging;
import pcftest.ClaimSnapshotExposureReplacementServicesDV.entry;
import pcftest.ClaimSnapshotExposureReplacementServicesDV.entry._Select;
import pcftest.ClaimSnapshotExposureReplacementServicesDV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureReplacementServicesDV extends DetailViewElement {
  public final static String CHECKSUM = "4ef9bbae20fa6f6556e727f55603b4ef";
  
  public ClaimSnapshotExposureReplacementServicesDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableServiceProvider_PhoneHeader getEditableServiceProvider_PhoneHeader() {
    return getOrCreateProperty("EditableServiceProvider_PhoneHeader", "EditableServiceProvider_PhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposureReplacementServicesDV.EditableServiceProvider_PhoneHeader.class);
  }
  
  public EditableServiceProvider_ProviderTypeHeader getEditableServiceProvider_ProviderTypeHeader() {
    return getOrCreateProperty("EditableServiceProvider_ProviderTypeHeader", "EditableServiceProvider_ProviderTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposureReplacementServicesDV.EditableServiceProvider_ProviderTypeHeader.class);
  }
  
  public EditableServiceProvider_ServiceHeader getEditableServiceProvider_ServiceHeader() {
    return getOrCreateProperty("EditableServiceProvider_ServiceHeader", "EditableServiceProvider_ServiceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposureReplacementServicesDV.EditableServiceProvider_ServiceHeader.class);
  }
  
  public EditableServiceProvider_ServiceTypeHeader getEditableServiceProvider_ServiceTypeHeader() {
    return getOrCreateProperty("EditableServiceProvider_ServiceTypeHeader", "EditableServiceProvider_ServiceTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposureReplacementServicesDV.EditableServiceProvider_ServiceTypeHeader.class);
  }
  
  public Exposure_RSBenProviderHeader getExposure_RSBenProviderHeader() {
    return getOrCreateProperty("Exposure_RSBenProviderHeader", "Exposure_RSBenProviderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposureReplacementServicesDV.Exposure_RSBenProviderHeader.class);
  }
  
  public ValueElement getLostWagesBenefits_BenefitsBeginDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsBeginDate", "LostWagesBenefits_BenefitsBeginDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_BenefitsEndDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsEndDate", "LostWagesBenefits_BenefitsEndDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposureReplacementServicesDV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposureReplacementServicesDV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableServiceProvider_PhoneHeader extends ValueElement {
    public EditableServiceProvider_PhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableServiceProvider_ProviderTypeHeader extends ValueElement {
    public EditableServiceProvider_ProviderTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableServiceProvider_ServiceHeader extends ValueElement {
    public EditableServiceProvider_ServiceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableServiceProvider_ServiceTypeHeader extends ValueElement {
    public EditableServiceProvider_ServiceTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_RSBenProviderHeader extends ValueElement {
    public Exposure_RSBenProviderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getEditableServiceProvider_Phone() {
      return getOrCreateProperty("EditableServiceProvider_Phone", "EditableServiceProvider_Phone", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEditableServiceProvider_ProviderType() {
      return getOrCreateProperty("EditableServiceProvider_ProviderType", "EditableServiceProvider_ProviderType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEditableServiceProvider_Service() {
      return getOrCreateProperty("EditableServiceProvider_Service", "EditableServiceProvider_Service", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEditableServiceProvider_ServiceType() {
      return getOrCreateProperty("EditableServiceProvider_ServiceType", "EditableServiceProvider_ServiceType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposure_RSBenProvider() {
      return getOrCreateProperty("Exposure_RSBenProvider", "Exposure_RSBenProvider", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposureReplacementServicesDV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposureReplacementServicesDV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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