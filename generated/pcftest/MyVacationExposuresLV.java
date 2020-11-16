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
import pcftest.MyVacationExposuresLV.Exposures_AssignedUserHeader;
import pcftest.MyVacationExposuresLV.Exposures_CaseIDHeader;
import pcftest.MyVacationExposuresLV.Exposures_ClaimantHeader;
import pcftest.MyVacationExposuresLV.Exposures_CoverageHeader;
import pcftest.MyVacationExposuresLV.Exposures_OrderHeader;
import pcftest.MyVacationExposuresLV.Exposures_StatusHeader;
import pcftest.MyVacationExposuresLV.Exposures_TotalIncurredNetHeader;
import pcftest.MyVacationExposuresLV.Exposures_TypeHeader;
import pcftest.MyVacationExposuresLV._ListPaging;
import pcftest.MyVacationExposuresLV.entry;
import pcftest.MyVacationExposuresLV.entry.Exposures_CaseID;
import pcftest.MyVacationExposuresLV.entry.Exposures_Claimant;
import pcftest.MyVacationExposuresLV.entry.Exposures_Coverage;
import pcftest.MyVacationExposuresLV.entry.Exposures_Order;
import pcftest.MyVacationExposuresLV.entry.Exposures_Status;
import pcftest.MyVacationExposuresLV.entry.Exposures_Type;
import pcftest.MyVacationExposuresLV.entry._Select;
import pcftest.MyVacationExposuresLV.entry._ViewDetail;
import typekey.CoverageType;
import typekey.ExposureState;
import typekey.ExposureType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MyVacationExposuresLV extends PCFElement {
  public final static String CHECKSUM = "3d9faf48f9c448fcd1db52fcc8ef7789";
  
  public MyVacationExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getDesktopExposuresFilter() {
    return getOrCreateProperty("DesktopExposuresFilter", "DesktopExposuresFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Exposures_AssignedUserHeader getExposures_AssignedUserHeader() {
    return getOrCreateProperty("Exposures_AssignedUserHeader", "Exposures_AssignedUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MyVacationExposuresLV.Exposures_AssignedUserHeader.class);
  }
  
  public Exposures_CaseIDHeader getExposures_CaseIDHeader() {
    return getOrCreateProperty("Exposures_CaseIDHeader", "Exposures_CaseIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MyVacationExposuresLV.Exposures_CaseIDHeader.class);
  }
  
  public Exposures_ClaimantHeader getExposures_ClaimantHeader() {
    return getOrCreateProperty("Exposures_ClaimantHeader", "Exposures_ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MyVacationExposuresLV.Exposures_ClaimantHeader.class);
  }
  
  public Exposures_CoverageHeader getExposures_CoverageHeader() {
    return getOrCreateProperty("Exposures_CoverageHeader", "Exposures_CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MyVacationExposuresLV.Exposures_CoverageHeader.class);
  }
  
  public Exposures_OrderHeader getExposures_OrderHeader() {
    return getOrCreateProperty("Exposures_OrderHeader", "Exposures_OrderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MyVacationExposuresLV.Exposures_OrderHeader.class);
  }
  
  public Exposures_StatusHeader getExposures_StatusHeader() {
    return getOrCreateProperty("Exposures_StatusHeader", "Exposures_StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MyVacationExposuresLV.Exposures_StatusHeader.class);
  }
  
  public Exposures_TotalIncurredNetHeader getExposures_TotalIncurredNetHeader() {
    return getOrCreateProperty("Exposures_TotalIncurredNetHeader", "Exposures_TotalIncurredNetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MyVacationExposuresLV.Exposures_TotalIncurredNetHeader.class);
  }
  
  public Exposures_TypeHeader getExposures_TypeHeader() {
    return getOrCreateProperty("Exposures_TypeHeader", "Exposures_TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MyVacationExposuresLV.Exposures_TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MyVacationExposuresLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MyVacationExposuresLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_AssignedUserHeader extends ValueElement {
    public Exposures_AssignedUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_CaseIDHeader extends ValueElement {
    public Exposures_CaseIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_ClaimantHeader extends ValueElement {
    public Exposures_ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_CoverageHeader extends ValueElement {
    public Exposures_CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_OrderHeader extends ValueElement {
    public Exposures_OrderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_StatusHeader extends ValueElement {
    public Exposures_StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_TotalIncurredNetHeader extends ValueElement {
    public Exposures_TotalIncurredNetHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposures_TypeHeader extends ValueElement {
    public Exposures_TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getExposures_AssignedUser() {
      return getOrCreateProperty("Exposures_AssignedUser", "Exposures_AssignedUser", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Exposures_CaseID getExposures_CaseID() {
      return getOrCreateProperty("Exposures_CaseID", "Exposures_CaseID", null, pcftest.MyVacationExposuresLV.entry.Exposures_CaseID.class);
    }
    
    public Exposures_Claimant getExposures_Claimant() {
      return getOrCreateProperty("Exposures_Claimant", "Exposures_Claimant", null, pcftest.MyVacationExposuresLV.entry.Exposures_Claimant.class);
    }
    
    public Exposures_Coverage getExposures_Coverage() {
      return getOrCreateProperty("Exposures_Coverage", "Exposures_Coverage", null, pcftest.MyVacationExposuresLV.entry.Exposures_Coverage.class);
    }
    
    public Exposures_Order getExposures_Order() {
      return getOrCreateProperty("Exposures_Order", "Exposures_Order", null, pcftest.MyVacationExposuresLV.entry.Exposures_Order.class);
    }
    
    public Exposures_Status getExposures_Status() {
      return getOrCreateProperty("Exposures_Status", "Exposures_Status", null, pcftest.MyVacationExposuresLV.entry.Exposures_Status.class);
    }
    
    public ValueElement getExposures_TotalIncurredNet() {
      return getOrCreateProperty("Exposures_TotalIncurredNet", "Exposures_TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Exposures_Type getExposures_Type() {
      return getOrCreateProperty("Exposures_Type", "Exposures_Type", null, pcftest.MyVacationExposuresLV.entry.Exposures_Type.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MyVacationExposuresLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MyVacationExposuresLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_CaseID extends ValueElement {
      public Exposures_CaseID(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_Claimant extends ValueElement {
      public Exposures_Claimant(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_Order extends ValueElement {
      public Exposures_Order(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_Type extends SelectElement {
      public Exposures_Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
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
    @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/MyVacationExposuresLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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