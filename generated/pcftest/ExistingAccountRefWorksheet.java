package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExistingAccountRefWorksheet.CloseButton;
import pcftest.ExistingAccountRefWorksheet.EffectiveDateHeader;
import pcftest.ExistingAccountRefWorksheet.ExistingAccountRefWorksheet_UpLink;
import pcftest.ExistingAccountRefWorksheet.ExpirationDateHeader;
import pcftest.ExistingAccountRefWorksheet.InsuredNameHeader;
import pcftest.ExistingAccountRefWorksheet.PolicyNumberHeader;
import pcftest.ExistingAccountRefWorksheet.PolicyTypeHeader;
import pcftest.ExistingAccountRefWorksheet._ListPaging;
import pcftest.ExistingAccountRefWorksheet._Paging;
import pcftest.ExistingAccountRefWorksheet.__crumb__;
import pcftest.ExistingAccountRefWorksheet._msgs;
import pcftest.ExistingAccountRefWorksheet.entry;
import pcftest.ExistingAccountRefWorksheet.entry._Select;
import pcftest.ExistingAccountRefWorksheet.entry._ViewDetail;
import pcftest.ExistingAccountRefWorksheet.wsTabBar;
import pcftest.ExistingAccountRefWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExistingAccountRefWorksheet extends PCFLocation {
  public final static String CHECKSUM = "9950775f83277ef49fb5018bd4dedb4c";
  
  public ExistingAccountRefWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ExistingAccountRefWorksheet"));
  }
  
  public CloseButton getCloseButton() {
    return getOrCreateProperty("CloseButton", "CloseButton", null, pcftest.ExistingAccountRefWorksheet.CloseButton.class);
  }
  
  public EffectiveDateHeader getEffectiveDateHeader() {
    return getOrCreateProperty("EffectiveDateHeader", "EffectiveDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExistingAccountRefWorksheet.EffectiveDateHeader.class);
  }
  
  public ExistingAccountRefWorksheet_UpLink getExistingAccountRefWorksheet_UpLink() {
    return getOrCreateProperty("ExistingAccountRefWorksheet_UpLink", "ExistingAccountRefWorksheet_UpLink", null, pcftest.ExistingAccountRefWorksheet.ExistingAccountRefWorksheet_UpLink.class);
  }
  
  public ExpirationDateHeader getExpirationDateHeader() {
    return getOrCreateProperty("ExpirationDateHeader", "ExpirationDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExistingAccountRefWorksheet.ExpirationDateHeader.class);
  }
  
  public InsuredNameHeader getInsuredNameHeader() {
    return getOrCreateProperty("InsuredNameHeader", "InsuredNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExistingAccountRefWorksheet.InsuredNameHeader.class);
  }
  
  public PolicyNumberHeader getPolicyNumberHeader() {
    return getOrCreateProperty("PolicyNumberHeader", "PolicyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExistingAccountRefWorksheet.PolicyNumberHeader.class);
  }
  
  public PolicyTypeHeader getPolicyTypeHeader() {
    return getOrCreateProperty("PolicyTypeHeader", "PolicyTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExistingAccountRefWorksheet.PolicyTypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ExistingAccountRefWorksheet.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ExistingAccountRefWorksheet._ListPaging.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ExistingAccountRefWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ExistingAccountRefWorksheet.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ExistingAccountRefWorksheet._msgs.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.ExistingAccountRefWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloseButton extends ClickableActionElement {
    public CloseButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EffectiveDateHeader extends ValueElement {
    public EffectiveDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExistingAccountRefWorksheet_UpLink extends ClickableActionElement {
    public ExistingAccountRefWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpirationDateHeader extends ValueElement {
    public ExpirationDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuredNameHeader extends ValueElement {
    public InsuredNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyNumberHeader extends ValueElement {
    public PolicyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypeHeader extends ValueElement {
    public PolicyTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getEffectiveDate() {
      return getOrCreateProperty("EffectiveDate", "EffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getExpirationDate() {
      return getOrCreateProperty("ExpirationDate", "ExpirationDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getInsuredName() {
      return getOrCreateProperty("InsuredName", "InsuredName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPolicyNumber() {
      return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.ExistingAccountRefWorksheet.entry.PolicyType getPolicyType() {
      return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.ExistingAccountRefWorksheet.entry.PolicyType.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ExistingAccountRefWorksheet.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ExistingAccountRefWorksheet.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.ExistingAccountRefWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/accounts/ExistingAccountRefWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class wsTab extends ClickableActionElement {
      public wsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}