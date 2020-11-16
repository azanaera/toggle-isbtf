package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import pcftest.PriorClaimsLV.PriorClaims_ClaimNumberHeader;
import pcftest.PriorClaimsLV.PriorClaims_DescriptionHeader;
import pcftest.PriorClaimsLV.PriorClaims_IncidentReportHeader;
import pcftest.PriorClaimsLV.PriorClaims_LossCauseHeader;
import pcftest.PriorClaimsLV.PriorClaims_LossDateHeader;
import pcftest.PriorClaimsLV.PriorClaims_LossTypeHeader;
import pcftest.PriorClaimsLV._ListPaging;
import pcftest.PriorClaimsLV.entry;
import pcftest.PriorClaimsLV.entry.PriorClaims_ClaimNumber;
import pcftest.PriorClaimsLV.entry.PriorClaims_LossCause;
import pcftest.PriorClaimsLV.entry.PriorClaims_LossType;
import pcftest.PriorClaimsLV.entry._Select;
import pcftest.PriorClaimsLV.entry._ViewDetail;
import typekey.LossCause;
import typekey.LossType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PriorClaimsLV extends PCFElement {
  public final static String CHECKSUM = "367d451f14025f35f4b8102b6223fe1d";
  
  public PriorClaimsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PriorClaims_ClaimNumberHeader getPriorClaims_ClaimNumberHeader() {
    return getOrCreateProperty("PriorClaims_ClaimNumberHeader", "PriorClaims_ClaimNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PriorClaimsLV.PriorClaims_ClaimNumberHeader.class);
  }
  
  public PriorClaims_DescriptionHeader getPriorClaims_DescriptionHeader() {
    return getOrCreateProperty("PriorClaims_DescriptionHeader", "PriorClaims_DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PriorClaimsLV.PriorClaims_DescriptionHeader.class);
  }
  
  public PriorClaims_IncidentReportHeader getPriorClaims_IncidentReportHeader() {
    return getOrCreateProperty("PriorClaims_IncidentReportHeader", "PriorClaims_IncidentReportHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PriorClaimsLV.PriorClaims_IncidentReportHeader.class);
  }
  
  public PriorClaims_LossCauseHeader getPriorClaims_LossCauseHeader() {
    return getOrCreateProperty("PriorClaims_LossCauseHeader", "PriorClaims_LossCauseHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PriorClaimsLV.PriorClaims_LossCauseHeader.class);
  }
  
  public PriorClaims_LossDateHeader getPriorClaims_LossDateHeader() {
    return getOrCreateProperty("PriorClaims_LossDateHeader", "PriorClaims_LossDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PriorClaimsLV.PriorClaims_LossDateHeader.class);
  }
  
  public PriorClaims_LossTypeHeader getPriorClaims_LossTypeHeader() {
    return getOrCreateProperty("PriorClaims_LossTypeHeader", "PriorClaims_LossTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PriorClaimsLV.PriorClaims_LossTypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PriorClaimsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PriorClaimsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorClaims_ClaimNumberHeader extends ValueElement {
    public PriorClaims_ClaimNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorClaims_DescriptionHeader extends ValueElement {
    public PriorClaims_DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorClaims_IncidentReportHeader extends ValueElement {
    public PriorClaims_IncidentReportHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorClaims_LossCauseHeader extends ValueElement {
    public PriorClaims_LossCauseHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorClaims_LossDateHeader extends ValueElement {
    public PriorClaims_LossDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorClaims_LossTypeHeader extends ValueElement {
    public PriorClaims_LossTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PriorClaims_ClaimNumber getPriorClaims_ClaimNumber() {
      return getOrCreateProperty("PriorClaims_ClaimNumber", "PriorClaims_ClaimNumber", null, pcftest.PriorClaimsLV.entry.PriorClaims_ClaimNumber.class);
    }
    
    public ValueElement getPriorClaims_Description() {
      return getOrCreateProperty("PriorClaims_Description", "PriorClaims_Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement getPriorClaims_IncidentReport() {
      return getOrCreateProperty("PriorClaims_IncidentReport", "PriorClaims_IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public PriorClaims_LossCause getPriorClaims_LossCause() {
      return getOrCreateProperty("PriorClaims_LossCause", "PriorClaims_LossCause", null, pcftest.PriorClaimsLV.entry.PriorClaims_LossCause.class);
    }
    
    public DateElement getPriorClaims_LossDate() {
      return getOrCreateProperty("PriorClaims_LossDate", "PriorClaims_LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public PriorClaims_LossType getPriorClaims_LossType() {
      return getOrCreateProperty("PriorClaims_LossType", "PriorClaims_LossType", null, pcftest.PriorClaimsLV.entry.PriorClaims_LossType.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PriorClaimsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PriorClaimsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PriorClaims_ClaimNumber extends ValueElement {
      public PriorClaims_ClaimNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PriorClaims_LossCause extends SelectElement {
      public PriorClaims_LossCause(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossCause arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossCause getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossCause.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossCause arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PriorClaims_LossType extends SelectElement {
      public PriorClaims_LossType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/PriorClaimsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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