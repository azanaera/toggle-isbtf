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
import pcftest.NewCheckPayeesLV.Check_DeductionTypeHeader;
import pcftest.NewCheckPayeesLV.Check_DeliverMethodHeader;
import pcftest.NewCheckPayeesLV.Check_PayToHeader;
import pcftest.NewCheckPayeesLV.Check_PortionHeader;
import pcftest.NewCheckPayeesLV.Check_PrimaryHeader;
import pcftest.NewCheckPayeesLV._ListPaging;
import pcftest.NewCheckPayeesLV.entry;
import pcftest.NewCheckPayeesLV.entry.Check_DeductionType;
import pcftest.NewCheckPayeesLV.entry.Check_DeliverMethod;
import pcftest.NewCheckPayeesLV.entry._Select;
import pcftest.NewCheckPayeesLV.entry._ViewDetail;
import typekey.DeductionType;
import typekey.DeliveryMethod;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckPayeesLV extends PCFElement {
  public final static String CHECKSUM = "b928706b3edd996d79700c5d653d9594";
  
  public NewCheckPayeesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Check_DeductionTypeHeader getCheck_DeductionTypeHeader() {
    return getOrCreateProperty("Check_DeductionTypeHeader", "Check_DeductionTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckPayeesLV.Check_DeductionTypeHeader.class);
  }
  
  public Check_DeliverMethodHeader getCheck_DeliverMethodHeader() {
    return getOrCreateProperty("Check_DeliverMethodHeader", "Check_DeliverMethodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckPayeesLV.Check_DeliverMethodHeader.class);
  }
  
  public Check_PayToHeader getCheck_PayToHeader() {
    return getOrCreateProperty("Check_PayToHeader", "Check_PayToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckPayeesLV.Check_PayToHeader.class);
  }
  
  public Check_PortionHeader getCheck_PortionHeader() {
    return getOrCreateProperty("Check_PortionHeader", "Check_PortionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckPayeesLV.Check_PortionHeader.class);
  }
  
  public Check_PrimaryHeader getCheck_PrimaryHeader() {
    return getOrCreateProperty("Check_PrimaryHeader", "Check_PrimaryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewCheckPayeesLV.Check_PrimaryHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewCheckPayeesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewCheckPayeesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_DeductionTypeHeader extends ValueElement {
    public Check_DeductionTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_DeliverMethodHeader extends ValueElement {
    public Check_DeliverMethodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PayToHeader extends ValueElement {
    public Check_PayToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PortionHeader extends ValueElement {
    public Check_PortionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PrimaryHeader extends ValueElement {
    public Check_PrimaryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Check_DeductionType getCheck_DeductionType() {
      return getOrCreateProperty("Check_DeductionType", "Check_DeductionType", null, pcftest.NewCheckPayeesLV.entry.Check_DeductionType.class);
    }
    
    public Check_DeliverMethod getCheck_DeliverMethod() {
      return getOrCreateProperty("Check_DeliverMethod", "Check_DeliverMethod", null, pcftest.NewCheckPayeesLV.entry.Check_DeliverMethod.class);
    }
    
    public ValueElement getCheck_PayTo() {
      return getOrCreateProperty("Check_PayTo", "Check_PayTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCheck_Portion() {
      return getOrCreateProperty("Check_Portion", "Check_Portion", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getCheck_Primary() {
      return getOrCreateProperty("Check_Primary", "Check_Primary", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NewCheckPayeesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewCheckPayeesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Check_DeductionType extends SelectElement {
      public Check_DeductionType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(DeductionType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public DeductionType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DeductionType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(DeductionType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Check_DeliverMethod extends SelectElement {
      public Check_DeliverMethod(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(DeliveryMethod arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public DeliveryMethod getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DeliveryMethod.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(DeliveryMethod arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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