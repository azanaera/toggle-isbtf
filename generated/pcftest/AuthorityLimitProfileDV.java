package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.CostTypeHeader;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.CoverageTypeHeader;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.LimitAmountHeader;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.LimitTypeHeader;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.PolicyTypeHeader;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV._ListPaging;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry.LimitType;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry._Select;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry._ViewDetail;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV_tb;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV_tb.Add;
import pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV_tb.Remove;
import typekey.AuthorityLimitType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AuthorityLimitProfileDV extends DetailViewElement {
  public final static String CHECKSUM = "b0d6cf9b9dbe74e01ac5fb132dc32c7f";
  
  public AuthorityLimitProfileDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.AuthorityLimitProfileDV.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AuthorityLimitProfileDV.Currency.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditAuthorityLimitsLV getEditAuthorityLimitsLV() {
    return getOrCreateProperty("EditAuthorityLimitsLV", "EditAuthorityLimitsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.class);
  }
  
  public EditAuthorityLimitsLV_tb getEditAuthorityLimitsLV_tb() {
    return getOrCreateProperty("EditAuthorityLimitsLV_tb", "EditAuthorityLimitsLV_tb", null, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV_tb.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Currency extends SelectElement {
    public Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAuthorityLimitsLV extends PCFElement {
    public EditAuthorityLimitsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CostTypeHeader getCostTypeHeader() {
      return getOrCreateProperty("CostTypeHeader", "CostTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.CostTypeHeader.class);
    }
    
    public CoverageTypeHeader getCoverageTypeHeader() {
      return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.CoverageTypeHeader.class);
    }
    
    public LimitAmountHeader getLimitAmountHeader() {
      return getOrCreateProperty("LimitAmountHeader", "LimitAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.LimitAmountHeader.class);
    }
    
    public LimitTypeHeader getLimitTypeHeader() {
      return getOrCreateProperty("LimitTypeHeader", "LimitTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.LimitTypeHeader.class);
    }
    
    public PolicyTypeHeader getPolicyTypeHeader() {
      return getOrCreateProperty("PolicyTypeHeader", "PolicyTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.PolicyTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CostTypeHeader extends ValueElement {
      public CostTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageTypeHeader extends ValueElement {
      public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LimitAmountHeader extends ValueElement {
      public LimitAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LimitTypeHeader extends ValueElement {
      public LimitTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyTypeHeader extends ValueElement {
      public PolicyTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry.CostType getCostType() {
        return getOrCreateProperty("CostType", "CostType", null, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry.CostType.class);
      }
      
      public pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry.CoverageType getCoverageType() {
        return getOrCreateProperty("CoverageType", "CoverageType", null, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry.CoverageType.class);
      }
      
      public ValueElement getLimitAmount() {
        return getOrCreateProperty("LimitAmount", "LimitAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public LimitType getLimitType() {
        return getOrCreateProperty("LimitType", "LimitType", null, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry.LimitType.class);
      }
      
      public pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry.PolicyType getPolicyType() {
        return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry.PolicyType.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAuthorityLimitsLV_tb extends PCFElement {
    public EditAuthorityLimitsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.AuthorityLimitProfileDV.EditAuthorityLimitsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}