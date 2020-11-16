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
import pcftest.WCBenefitParameterSetLV.CommentHeader;
import pcftest.WCBenefitParameterSetLV.JurisdictionHeader;
import pcftest.WCBenefitParameterSetLV.TD_BenefitEndDateHeader;
import pcftest.WCBenefitParameterSetLV.TD_BenefitStartDateHeader;
import pcftest.WCBenefitParameterSetLV._ListPaging;
import pcftest.WCBenefitParameterSetLV.entry;
import pcftest.WCBenefitParameterSetLV.entry._Select;
import pcftest.WCBenefitParameterSetLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitParameterSetLV extends PCFElement {
  public final static String CHECKSUM = "9a9ce0515bafea7bb6ad70ceb71f9f68";
  
  public WCBenefitParameterSetLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CommentHeader getCommentHeader() {
    return getOrCreateProperty("CommentHeader", "CommentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitParameterSetLV.CommentHeader.class);
  }
  
  public JurisdictionHeader getJurisdictionHeader() {
    return getOrCreateProperty("JurisdictionHeader", "JurisdictionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitParameterSetLV.JurisdictionHeader.class);
  }
  
  public TD_BenefitEndDateHeader getTD_BenefitEndDateHeader() {
    return getOrCreateProperty("TD_BenefitEndDateHeader", "TD_BenefitEndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitParameterSetLV.TD_BenefitEndDateHeader.class);
  }
  
  public TD_BenefitStartDateHeader getTD_BenefitStartDateHeader() {
    return getOrCreateProperty("TD_BenefitStartDateHeader", "TD_BenefitStartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WCBenefitParameterSetLV.TD_BenefitStartDateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WCBenefitParameterSetLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WCBenefitParameterSetLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentHeader extends ValueElement {
    public CommentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionHeader extends ValueElement {
    public JurisdictionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TD_BenefitEndDateHeader extends ValueElement {
    public TD_BenefitEndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TD_BenefitStartDateHeader extends ValueElement {
    public TD_BenefitStartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getComment() {
      return getOrCreateProperty("Comment", "Comment", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.WCBenefitParameterSetLV.entry.Jurisdiction getJurisdiction() {
      return getOrCreateProperty("Jurisdiction", "Jurisdiction", null, pcftest.WCBenefitParameterSetLV.entry.Jurisdiction.class);
    }
    
    public DateElement getTD_BenefitEndDate() {
      return getOrCreateProperty("TD_BenefitEndDate", "TD_BenefitEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getTD_BenefitStartDate() {
      return getOrCreateProperty("TD_BenefitStartDate", "TD_BenefitStartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.WCBenefitParameterSetLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WCBenefitParameterSetLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Jurisdiction extends SelectElement {
      public Jurisdiction(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WCBenefitParameterSetPopup click() {
        return clickThis(pcftest.WCBenefitParameterSetPopup.class);
      }
      
      public OptionElement getOptionByTypeKey(typekey.Jurisdiction arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.Jurisdiction getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.Jurisdiction arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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