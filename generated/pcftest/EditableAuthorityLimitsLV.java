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
import pcftest.EditableAuthorityLimitsLV.CostTypeHeader;
import pcftest.EditableAuthorityLimitsLV.CoverageTypeHeader;
import pcftest.EditableAuthorityLimitsLV.LimitAmountHeader;
import pcftest.EditableAuthorityLimitsLV.LimitTypeHeader;
import pcftest.EditableAuthorityLimitsLV.PolicyTypeHeader;
import pcftest.EditableAuthorityLimitsLV._ListPaging;
import pcftest.EditableAuthorityLimitsLV.entry;
import pcftest.EditableAuthorityLimitsLV.entry.LimitType;
import pcftest.EditableAuthorityLimitsLV.entry._Select;
import pcftest.EditableAuthorityLimitsLV.entry._ViewDetail;
import typekey.AuthorityLimitType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableAuthorityLimitsLV extends PCFElement {
  public final static String CHECKSUM = "a160d87725b592934a07ff1ffc692c70";
  
  public EditableAuthorityLimitsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CostTypeHeader getCostTypeHeader() {
    return getOrCreateProperty("CostTypeHeader", "CostTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAuthorityLimitsLV.CostTypeHeader.class);
  }
  
  public CoverageTypeHeader getCoverageTypeHeader() {
    return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAuthorityLimitsLV.CoverageTypeHeader.class);
  }
  
  public LimitAmountHeader getLimitAmountHeader() {
    return getOrCreateProperty("LimitAmountHeader", "LimitAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAuthorityLimitsLV.LimitAmountHeader.class);
  }
  
  public LimitTypeHeader getLimitTypeHeader() {
    return getOrCreateProperty("LimitTypeHeader", "LimitTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAuthorityLimitsLV.LimitTypeHeader.class);
  }
  
  public PolicyTypeHeader getPolicyTypeHeader() {
    return getOrCreateProperty("PolicyTypeHeader", "PolicyTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableAuthorityLimitsLV.PolicyTypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableAuthorityLimitsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableAuthorityLimitsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostTypeHeader extends ValueElement {
    public CostTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageTypeHeader extends ValueElement {
    public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LimitAmountHeader extends ValueElement {
    public LimitAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LimitTypeHeader extends ValueElement {
    public LimitTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypeHeader extends ValueElement {
    public PolicyTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.EditableAuthorityLimitsLV.entry.CostType getCostType() {
      return getOrCreateProperty("CostType", "CostType", null, pcftest.EditableAuthorityLimitsLV.entry.CostType.class);
    }
    
    public pcftest.EditableAuthorityLimitsLV.entry.CoverageType getCoverageType() {
      return getOrCreateProperty("CoverageType", "CoverageType", null, pcftest.EditableAuthorityLimitsLV.entry.CoverageType.class);
    }
    
    public ValueElement getLimitAmount() {
      return getOrCreateProperty("LimitAmount", "LimitAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LimitType getLimitType() {
      return getOrCreateProperty("LimitType", "LimitType", null, pcftest.EditableAuthorityLimitsLV.entry.LimitType.class);
    }
    
    public pcftest.EditableAuthorityLimitsLV.entry.PolicyType getPolicyType() {
      return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.EditableAuthorityLimitsLV.entry.PolicyType.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableAuthorityLimitsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableAuthorityLimitsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CostType extends SelectElement {
      public CostType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.CostType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.CostType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CostType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.CostType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageType extends SelectElement {
      public CoverageType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.CoverageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.CoverageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.CoverageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LimitType extends SelectElement {
      public LimitType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(AuthorityLimitType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public AuthorityLimitType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AuthorityLimitType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(AuthorityLimitType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyType extends SelectElement {
      public PolicyType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.PolicyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.PolicyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.PolicyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/EditableAuthorityLimitsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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