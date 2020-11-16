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
import pcftest.ExposuresLV.AssigneeHeader;
import pcftest.ExposuresLV.ClaimantHeader;
import pcftest.ExposuresLV.CoverageHeader;
import pcftest.ExposuresLV.FuturePaymentsHeader;
import pcftest.ExposuresLV.OrderHeader;
import pcftest.ExposuresLV.PaidHeader;
import pcftest.ExposuresLV.RemainingReservesHeader;
import pcftest.ExposuresLV.StatusHeader;
import pcftest.ExposuresLV.TypeHeader;
import pcftest.ExposuresLV._ListPaging;
import pcftest.ExposuresLV.entry;
import pcftest.ExposuresLV.entry.Assignee;
import pcftest.ExposuresLV.entry.Claimant;
import pcftest.ExposuresLV.entry.Coverage;
import pcftest.ExposuresLV.entry.Order;
import pcftest.ExposuresLV.entry.Status;
import pcftest.ExposuresLV.entry.Type;
import pcftest.ExposuresLV.entry._Select;
import pcftest.ExposuresLV.entry._ViewDetail;
import pcftest.ExposuresLV.entry.loss_party_ext;
import pcftest.ExposuresLV.loss_party_extHeader;
import pcftest.ExposuresLV.vehicle_extHeader;
import typekey.CoverageType;
import typekey.ExposureState;
import typekey.ExposureType;
import typekey.LossPartyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposuresLV extends PCFElement {
  public final static String CHECKSUM = "dc9062b88e6610d28263420d2bf98a11";
  
  public ExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssigneeHeader getAssigneeHeader() {
    return getOrCreateProperty("AssigneeHeader", "AssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.AssigneeHeader.class);
  }
  
  public ClaimantHeader getClaimantHeader() {
    return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.ClaimantHeader.class);
  }
  
  public CoverageHeader getCoverageHeader() {
    return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.CoverageHeader.class);
  }
  
  public SelectElement getExposuresFilter() {
    return getOrCreateProperty("ExposuresFilter", "ExposuresFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public FuturePaymentsHeader getFuturePaymentsHeader() {
    return getOrCreateProperty("FuturePaymentsHeader", "FuturePaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.FuturePaymentsHeader.class);
  }
  
  public OrderHeader getOrderHeader() {
    return getOrCreateProperty("OrderHeader", "OrderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.OrderHeader.class);
  }
  
  public PaidHeader getPaidHeader() {
    return getOrCreateProperty("PaidHeader", "PaidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.PaidHeader.class);
  }
  
  public RemainingReservesHeader getRemainingReservesHeader() {
    return getOrCreateProperty("RemainingReservesHeader", "RemainingReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.RemainingReservesHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.StatusHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ExposuresLV._ListPaging.class);
  }
  
  public loss_party_extHeader getloss_party_extHeader() {
    return getOrCreateProperty("loss_party_extHeader", "loss_party_extHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.loss_party_extHeader.class);
  }
  
  public vehicle_extHeader getvehicle_extHeader() {
    return getOrCreateProperty("vehicle_extHeader", "vehicle_extHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExposuresLV.vehicle_extHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssigneeHeader extends ValueElement {
    public AssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimantHeader extends ValueElement {
    public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageHeader extends ValueElement {
    public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FuturePaymentsHeader extends ValueElement {
    public FuturePaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrderHeader extends ValueElement {
    public OrderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaidHeader extends ValueElement {
    public PaidHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RemainingReservesHeader extends ValueElement {
    public RemainingReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Assignee getAssignee() {
      return getOrCreateProperty("Assignee", "Assignee", null, pcftest.ExposuresLV.entry.Assignee.class);
    }
    
    public Claimant getClaimant() {
      return getOrCreateProperty("Claimant", "Claimant", null, pcftest.ExposuresLV.entry.Claimant.class);
    }
    
    public Coverage getCoverage() {
      return getOrCreateProperty("Coverage", "Coverage", null, pcftest.ExposuresLV.entry.Coverage.class);
    }
    
    public ValueElement getFuturePayments() {
      return getOrCreateProperty("FuturePayments", "FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Order getOrder() {
      return getOrCreateProperty("Order", "Order", null, pcftest.ExposuresLV.entry.Order.class);
    }
    
    public ValueElement getPaid() {
      return getOrCreateProperty("Paid", "Paid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRemainingReserves() {
      return getOrCreateProperty("RemainingReserves", "RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.ExposuresLV.entry.Status.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.ExposuresLV.entry.Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ExposuresLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ExposuresLV.entry._ViewDetail.class);
    }
    
    public loss_party_ext getloss_party_ext() {
      return getOrCreateProperty("loss_party_ext", "loss_party_ext", null, pcftest.ExposuresLV.entry.loss_party_ext.class);
    }
    
    public ValueElement getvehicle_ext() {
      return getOrCreateProperty("vehicle_ext", "vehicle_ext", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Assignee extends ValueElement {
      public Assignee(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserContactDetailPopup click() {
        return clickThis(pcftest.UserContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claimant extends ValueElement {
      public Claimant(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Order extends ValueElement {
      public Order(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExposureDetail click() {
        return clickThis(pcftest.ExposureDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Type extends SelectElement {
      public Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExposureDetail click() {
        return clickThis(pcftest.ExposureDetail.class);
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
    @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class loss_party_ext extends SelectElement {
      public loss_party_ext(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossPartyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossPartyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossPartyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossPartyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class loss_party_extHeader extends ValueElement {
    public loss_party_extHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class vehicle_extHeader extends ValueElement {
    public vehicle_extHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}