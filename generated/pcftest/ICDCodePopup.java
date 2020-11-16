package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ICDCodePopup.CancelButton;
import pcftest.ICDCodePopup.ChronicHeader;
import pcftest.ICDCodePopup.CodeDescHeader;
import pcftest.ICDCodePopup.ExpiryDateHeader;
import pcftest.ICDCodePopup.ICDCodeHeader;
import pcftest.ICDCodePopup.ICDCodePopup_UpLink;
import pcftest.ICDCodePopup.SearchButton;
import pcftest.ICDCodePopup._ListPaging;
import pcftest.ICDCodePopup._Paging;
import pcftest.ICDCodePopup.__crumb__;
import pcftest.ICDCodePopup._msgs;
import pcftest.ICDCodePopup.entry;
import pcftest.ICDCodePopup.entry._Select;
import pcftest.ICDCodePopup.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ICDCodePopup extends PCFLocation {
  public final static String CHECKSUM = "c2a1653c1d7f81304d01431c616df3c0";
  
  public ICDCodePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ICDCodePopup"));
  }
  
  public CancelButton getCancelButton() {
    return getOrCreateProperty("CancelButton", "CancelButton", null, pcftest.ICDCodePopup.CancelButton.class);
  }
  
  public ChronicHeader getChronicHeader() {
    return getOrCreateProperty("ChronicHeader", "ChronicHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ICDCodePopup.ChronicHeader.class);
  }
  
  public CodeDescHeader getCodeDescHeader() {
    return getOrCreateProperty("CodeDescHeader", "CodeDescHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ICDCodePopup.CodeDescHeader.class);
  }
  
  public ExpiryDateHeader getExpiryDateHeader() {
    return getOrCreateProperty("ExpiryDateHeader", "ExpiryDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ICDCodePopup.ExpiryDateHeader.class);
  }
  
  public ValueElement getFindCode() {
    return getOrCreateProperty("FindCode", "FindCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getFind_Body_System() {
    return getOrCreateProperty("Find_Body_System", "Find_Body_System", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ICDCodeHeader getICDCodeHeader() {
    return getOrCreateProperty("ICDCodeHeader", "ICDCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ICDCodePopup.ICDCodeHeader.class);
  }
  
  public ICDCodePopup_UpLink getICDCodePopup_UpLink() {
    return getOrCreateProperty("ICDCodePopup_UpLink", "ICDCodePopup_UpLink", null, pcftest.ICDCodePopup.ICDCodePopup_UpLink.class);
  }
  
  public SearchButton getSearchButton() {
    return getOrCreateProperty("SearchButton", "SearchButton", null, pcftest.ICDCodePopup.SearchButton.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ICDCodePopup.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ICDCodePopup._ListPaging.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ICDCodePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ICDCodePopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ICDCodePopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CancelButton extends ClickableActionElement {
    public CancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChronicHeader extends ValueElement {
    public ChronicHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CodeDescHeader extends ValueElement {
    public CodeDescHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpiryDateHeader extends ValueElement {
    public ExpiryDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDCodeHeader extends ValueElement {
    public ICDCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDCodePopup_UpLink extends ClickableActionElement {
    public ICDCodePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchButton extends ClickableActionElement {
    public SearchButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getChronic() {
      return getOrCreateProperty("Chronic", "Chronic", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getCodeDesc() {
      return getOrCreateProperty("CodeDesc", "CodeDesc", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getExpiryDate() {
      return getOrCreateProperty("ExpiryDate", "ExpiryDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getICDCode() {
      return getOrCreateProperty("ICDCode", "ICDCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ICDCodePopup.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ICDCodePopup.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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