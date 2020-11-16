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
import pcftest.NewClaimSummaryExposuresLV.Exposures_AssigneeHeader;
import pcftest.NewClaimSummaryExposuresLV.Exposures_ClaimantHeader;
import pcftest.NewClaimSummaryExposuresLV.Exposures_CoverageHeader;
import pcftest.NewClaimSummaryExposuresLV.Exposures_FuturePaymentsHeader;
import pcftest.NewClaimSummaryExposuresLV.Exposures_OrderHeader;
import pcftest.NewClaimSummaryExposuresLV.Exposures_PaidHeader;
import pcftest.NewClaimSummaryExposuresLV.Exposures_RemainingReservesHeader;
import pcftest.NewClaimSummaryExposuresLV.Exposures_StatusHeader;
import pcftest.NewClaimSummaryExposuresLV.Exposures_TypeHeader;
import pcftest.NewClaimSummaryExposuresLV._ListPaging;
import pcftest.NewClaimSummaryExposuresLV.entry;
import pcftest.NewClaimSummaryExposuresLV.entry.Exposures_Coverage;
import pcftest.NewClaimSummaryExposuresLV.entry.Exposures_Order;
import pcftest.NewClaimSummaryExposuresLV.entry.Exposures_Status;
import pcftest.NewClaimSummaryExposuresLV.entry.Exposures_Type;
import pcftest.NewClaimSummaryExposuresLV.entry._Select;
import pcftest.NewClaimSummaryExposuresLV.entry._ViewDetail;
import typekey.CoverageType;
import typekey.ExposureState;
import typekey.ExposureType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimSummaryExposuresLV extends PCFElement {
  public final static String CHECKSUM = "38995b71b49b27f9b6cf066b43789117";
  
  public NewClaimSummaryExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Exposures_AssigneeHeader getExposures_AssigneeHeader() {
    return getOrCreateProperty("Exposures_AssigneeHeader", "Exposures_AssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryExposuresLV.Exposures_AssigneeHeader.class);
  }
  
  public Exposures_ClaimantHeader getExposures_ClaimantHeader() {
    return getOrCreateProperty("Exposures_ClaimantHeader", "Exposures_ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryExposuresLV.Exposures_ClaimantHeader.class);
  }
  
  public Exposures_CoverageHeader getExposures_CoverageHeader() {
    return getOrCreateProperty("Exposures_CoverageHeader", "Exposures_CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryExposuresLV.Exposures_CoverageHeader.class);
  }
  
  public ValueElement getExposures_FuturePaymentsFooter() {
    return getOrCreateProperty("Exposures_FuturePaymentsFooter", "Exposures_FuturePaymentsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposures_FuturePaymentsHeader getExposures_FuturePaymentsHeader() {
    return getOrCreateProperty("Exposures_FuturePaymentsHeader", "Exposures_FuturePaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryExposuresLV.Exposures_FuturePaymentsHeader.class);
  }
  
  public Exposures_OrderHeader getExposures_OrderHeader() {
    return getOrCreateProperty("Exposures_OrderHeader", "Exposures_OrderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryExposuresLV.Exposures_OrderHeader.class);
  }
  
  public ValueElement getExposures_PaidFooter() {
    return getOrCreateProperty("Exposures_PaidFooter", "Exposures_PaidFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposures_PaidHeader getExposures_PaidHeader() {
    return getOrCreateProperty("Exposures_PaidHeader", "Exposures_PaidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryExposuresLV.Exposures_PaidHeader.class);
  }
  
  public ValueElement getExposures_RemainingReservesFooter() {
    return getOrCreateProperty("Exposures_RemainingReservesFooter", "Exposures_RemainingReservesFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposures_RemainingReservesHeader getExposures_RemainingReservesHeader() {
    return getOrCreateProperty("Exposures_RemainingReservesHeader", "Exposures_RemainingReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryExposuresLV.Exposures_RemainingReservesHeader.class);
  }
  
  public Exposures_StatusHeader getExposures_StatusHeader() {
    return getOrCreateProperty("Exposures_StatusHeader", "Exposures_StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryExposuresLV.Exposures_StatusHeader.class);
  }
  
  public Exposures_TypeHeader getExposures_TypeHeader() {
    return getOrCreateProperty("Exposures_TypeHeader", "Exposures_TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimSummaryExposuresLV.Exposures_TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewClaimSummaryExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewClaimSummaryExposuresLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_AssigneeHeader extends ValueElement {
    public Exposures_AssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_ClaimantHeader extends ValueElement {
    public Exposures_ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_CoverageHeader extends ValueElement {
    public Exposures_CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_FuturePaymentsHeader extends ValueElement {
    public Exposures_FuturePaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_OrderHeader extends ValueElement {
    public Exposures_OrderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_PaidHeader extends ValueElement {
    public Exposures_PaidHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_RemainingReservesHeader extends ValueElement {
    public Exposures_RemainingReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_StatusHeader extends ValueElement {
    public Exposures_StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_TypeHeader extends ValueElement {
    public Exposures_TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getExposures_Assignee() {
      return getOrCreateProperty("Exposures_Assignee", "Exposures_Assignee", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposures_Claimant() {
      return getOrCreateProperty("Exposures_Claimant", "Exposures_Claimant", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Exposures_Coverage getExposures_Coverage() {
      return getOrCreateProperty("Exposures_Coverage", "Exposures_Coverage", null, pcftest.NewClaimSummaryExposuresLV.entry.Exposures_Coverage.class);
    }
    
    public ValueElement getExposures_FuturePayments() {
      return getOrCreateProperty("Exposures_FuturePayments", "Exposures_FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Exposures_Order getExposures_Order() {
      return getOrCreateProperty("Exposures_Order", "Exposures_Order", null, pcftest.NewClaimSummaryExposuresLV.entry.Exposures_Order.class);
    }
    
    public ValueElement getExposures_Paid() {
      return getOrCreateProperty("Exposures_Paid", "Exposures_Paid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExposures_RemainingReserves() {
      return getOrCreateProperty("Exposures_RemainingReserves", "Exposures_RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Exposures_Status getExposures_Status() {
      return getOrCreateProperty("Exposures_Status", "Exposures_Status", null, pcftest.NewClaimSummaryExposuresLV.entry.Exposures_Status.class);
    }
    
    public Exposures_Type getExposures_Type() {
      return getOrCreateProperty("Exposures_Type", "Exposures_Type", null, pcftest.NewClaimSummaryExposuresLV.entry.Exposures_Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NewClaimSummaryExposuresLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewClaimSummaryExposuresLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_Coverage extends SelectElement {
      public Exposures_Coverage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(CoverageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CoverageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CoverageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_Order extends ValueElement {
      public Exposures_Order(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_ExposurePagePopup click() {
        return clickThis(pcftest.NewClaimWizard_ExposurePagePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_Status extends SelectElement {
      public Exposures_Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ExposureState arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ExposureState getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureState.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ExposureState arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_Type extends SelectElement {
      public Exposures_Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_ExposurePagePopup click() {
        return clickThis(pcftest.NewClaimWizard_ExposurePagePopup.class);
      }
      
      public OptionElement getOptionByTypeKey(ExposureType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ExposureType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ExposureType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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