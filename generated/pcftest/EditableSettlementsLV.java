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
import pcftest.EditableSettlementsLV.BenefitTypeHeader;
import pcftest.EditableSettlementsLV.DescriptionHeader;
import pcftest.EditableSettlementsLV.SettleAmountHeader;
import pcftest.EditableSettlementsLV.SettleDateHeader;
import pcftest.EditableSettlementsLV.SettleMethodHeader;
import pcftest.EditableSettlementsLV._ListPaging;
import pcftest.EditableSettlementsLV.entry;
import pcftest.EditableSettlementsLV.entry.BenefitType;
import pcftest.EditableSettlementsLV.entry._Select;
import pcftest.EditableSettlementsLV.entry._ViewDetail;
import typekey.LostWagesBenefitType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableSettlementsLV extends PCFElement {
  public final static String CHECKSUM = "160411c5db6562df337d37066931f0fc";
  
  public EditableSettlementsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BenefitTypeHeader getBenefitTypeHeader() {
    return getOrCreateProperty("BenefitTypeHeader", "BenefitTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableSettlementsLV.BenefitTypeHeader.class);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableSettlementsLV.DescriptionHeader.class);
  }
  
  public SettleAmountHeader getSettleAmountHeader() {
    return getOrCreateProperty("SettleAmountHeader", "SettleAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableSettlementsLV.SettleAmountHeader.class);
  }
  
  public SettleDateHeader getSettleDateHeader() {
    return getOrCreateProperty("SettleDateHeader", "SettleDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableSettlementsLV.SettleDateHeader.class);
  }
  
  public SettleMethodHeader getSettleMethodHeader() {
    return getOrCreateProperty("SettleMethodHeader", "SettleMethodHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableSettlementsLV.SettleMethodHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableSettlementsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableSettlementsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BenefitTypeHeader extends ValueElement {
    public BenefitTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SettleAmountHeader extends ValueElement {
    public SettleAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SettleDateHeader extends ValueElement {
    public SettleDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SettleMethodHeader extends ValueElement {
    public SettleMethodHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BenefitType getBenefitType() {
      return getOrCreateProperty("BenefitType", "BenefitType", null, pcftest.EditableSettlementsLV.entry.BenefitType.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSettleAmount() {
      return getOrCreateProperty("SettleAmount", "SettleAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getSettleDate() {
      return getOrCreateProperty("SettleDate", "SettleDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public pcftest.EditableSettlementsLV.entry.SettleMethod getSettleMethod() {
      return getOrCreateProperty("SettleMethod", "SettleMethod", null, pcftest.EditableSettlementsLV.entry.SettleMethod.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableSettlementsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableSettlementsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BenefitType extends SelectElement {
      public BenefitType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LostWagesBenefitType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LostWagesBenefitType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LostWagesBenefitType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LostWagesBenefitType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SettleMethod extends SelectElement {
      public SettleMethod(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.SettleMethod arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.SettleMethod getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SettleMethod.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.SettleMethod arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableSettlementsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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