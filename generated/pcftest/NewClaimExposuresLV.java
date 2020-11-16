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
import pcftest.NewClaimExposuresLV.AssigneeHeader;
import pcftest.NewClaimExposuresLV.ClaimantHeader;
import pcftest.NewClaimExposuresLV.CoverageHeader;
import pcftest.NewClaimExposuresLV.FuturePaymentsHeader;
import pcftest.NewClaimExposuresLV.OrderHeader;
import pcftest.NewClaimExposuresLV.PaidHeader;
import pcftest.NewClaimExposuresLV.RemainingReservesHeader;
import pcftest.NewClaimExposuresLV.StatusHeader;
import pcftest.NewClaimExposuresLV.TypeHeader;
import pcftest.NewClaimExposuresLV._ListPaging;
import pcftest.NewClaimExposuresLV.entry;
import pcftest.NewClaimExposuresLV.entry.Coverage;
import pcftest.NewClaimExposuresLV.entry.Order;
import pcftest.NewClaimExposuresLV.entry.Status;
import pcftest.NewClaimExposuresLV.entry.Type;
import pcftest.NewClaimExposuresLV.entry._Select;
import pcftest.NewClaimExposuresLV.entry._ViewDetail;
import typekey.CoverageType;
import typekey.ExposureState;
import typekey.ExposureType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposuresLV extends PCFElement {
  public final static String CHECKSUM = "70db3e8cb24d2e72cf21e1715b133c55";
  
  public NewClaimExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssigneeHeader getAssigneeHeader() {
    return getOrCreateProperty("AssigneeHeader", "AssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimExposuresLV.AssigneeHeader.class);
  }
  
  public ClaimantHeader getClaimantHeader() {
    return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimExposuresLV.ClaimantHeader.class);
  }
  
  public CoverageHeader getCoverageHeader() {
    return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimExposuresLV.CoverageHeader.class);
  }
  
  public ValueElement getFuturePaymentsFooter() {
    return getOrCreateProperty("FuturePaymentsFooter", "FuturePaymentsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public FuturePaymentsHeader getFuturePaymentsHeader() {
    return getOrCreateProperty("FuturePaymentsHeader", "FuturePaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimExposuresLV.FuturePaymentsHeader.class);
  }
  
  public SelectElement getNewClaimExposuresFilter() {
    return getOrCreateProperty("NewClaimExposuresFilter", "NewClaimExposuresFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public OrderHeader getOrderHeader() {
    return getOrCreateProperty("OrderHeader", "OrderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimExposuresLV.OrderHeader.class);
  }
  
  public ValueElement getPaidFooter() {
    return getOrCreateProperty("PaidFooter", "PaidFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PaidHeader getPaidHeader() {
    return getOrCreateProperty("PaidHeader", "PaidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimExposuresLV.PaidHeader.class);
  }
  
  public ValueElement getRemainingReservesFooter() {
    return getOrCreateProperty("RemainingReservesFooter", "RemainingReservesFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RemainingReservesHeader getRemainingReservesHeader() {
    return getOrCreateProperty("RemainingReservesHeader", "RemainingReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimExposuresLV.RemainingReservesHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimExposuresLV.StatusHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimExposuresLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewClaimExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewClaimExposuresLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssigneeHeader extends ValueElement {
    public AssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimantHeader extends ValueElement {
    public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageHeader extends ValueElement {
    public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FuturePaymentsHeader extends ValueElement {
    public FuturePaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrderHeader extends ValueElement {
    public OrderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaidHeader extends ValueElement {
    public PaidHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RemainingReservesHeader extends ValueElement {
    public RemainingReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAssignee() {
      return getOrCreateProperty("Assignee", "Assignee", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimant() {
      return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Coverage getCoverage() {
      return getOrCreateProperty("Coverage", "Coverage", null, pcftest.NewClaimExposuresLV.entry.Coverage.class);
    }
    
    public ValueElement getFuturePayments() {
      return getOrCreateProperty("FuturePayments", "FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Order getOrder() {
      return getOrCreateProperty("Order", "Order", null, pcftest.NewClaimExposuresLV.entry.Order.class);
    }
    
    public ValueElement getPaid() {
      return getOrCreateProperty("Paid", "Paid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRemainingReserves() {
      return getOrCreateProperty("RemainingReserves", "RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.NewClaimExposuresLV.entry.Status.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.NewClaimExposuresLV.entry.Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NewClaimExposuresLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewClaimExposuresLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Coverage extends SelectElement {
      public Coverage(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Order extends ValueElement {
      public Order(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_ExposurePagePopup click() {
        return clickThis(pcftest.NewClaimWizard_ExposurePagePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends SelectElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Type extends SelectElement {
      public Type(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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