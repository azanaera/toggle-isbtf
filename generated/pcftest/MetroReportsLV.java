package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.MetroReportsLV.ActionHeader;
import pcftest.MetroReportsLV.MetroReportOrderDateHeader;
import pcftest.MetroReportsLV.MetroReportStatusHeader;
import pcftest.MetroReportsLV.MetroReportTypeHeader;
import pcftest.MetroReportsLV._ListPaging;
import pcftest.MetroReportsLV.entry;
import pcftest.MetroReportsLV.entry.MetroReportDocument;
import pcftest.MetroReportsLV.entry.ReSubmit;
import pcftest.MetroReportsLV.entry._Select;
import pcftest.MetroReportsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroReportsLV extends PCFElement {
  public final static String CHECKSUM = "933ada3a33e5fbdba2a541c1f136d998";
  
  public MetroReportsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActionHeader getActionHeader() {
    return getOrCreateProperty("ActionHeader", "ActionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroReportsLV.ActionHeader.class);
  }
  
  public MetroReportOrderDateHeader getMetroReportOrderDateHeader() {
    return getOrCreateProperty("MetroReportOrderDateHeader", "MetroReportOrderDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroReportsLV.MetroReportOrderDateHeader.class);
  }
  
  public MetroReportStatusHeader getMetroReportStatusHeader() {
    return getOrCreateProperty("MetroReportStatusHeader", "MetroReportStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroReportsLV.MetroReportStatusHeader.class);
  }
  
  public MetroReportTypeHeader getMetroReportTypeHeader() {
    return getOrCreateProperty("MetroReportTypeHeader", "MetroReportTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroReportsLV.MetroReportTypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MetroReportsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MetroReportsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionHeader extends ValueElement {
    public ActionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportOrderDateHeader extends ValueElement {
    public MetroReportOrderDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportStatusHeader extends ValueElement {
    public MetroReportStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportTypeHeader extends ValueElement {
    public MetroReportTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MetroReportDocument getMetroReportDocument() {
      return getOrCreateProperty("MetroReportDocument", "MetroReportDocument", null, pcftest.MetroReportsLV.entry.MetroReportDocument.class);
    }
    
    public DateElement getMetroReportOrderDate() {
      return getOrCreateProperty("MetroReportOrderDate", "MetroReportOrderDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public pcftest.MetroReportsLV.entry.MetroReportStatus getMetroReportStatus() {
      return getOrCreateProperty("MetroReportStatus", "MetroReportStatus", null, pcftest.MetroReportsLV.entry.MetroReportStatus.class);
    }
    
    public pcftest.MetroReportsLV.entry.MetroReportType getMetroReportType() {
      return getOrCreateProperty("MetroReportType", "MetroReportType", null, pcftest.MetroReportsLV.entry.MetroReportType.class);
    }
    
    public ReSubmit getReSubmit() {
      return getOrCreateProperty("ReSubmit", "ReSubmit", null, pcftest.MetroReportsLV.entry.ReSubmit.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MetroReportsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MetroReportsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportDocument extends ClickableActionElement {
      public MetroReportDocument(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportStatus extends SelectElement {
      public MetroReportStatus(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.MetroReportStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.MetroReportStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MetroReportStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.MetroReportStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportType extends SelectElement {
      public MetroReportType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MetroReportDetailsPopup click() {
        return clickThis(pcftest.MetroReportDetailsPopup.class);
      }
      
      public OptionElement getOptionByTypeKey(typekey.MetroReportType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.MetroReportType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MetroReportType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.MetroReportType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReSubmit extends ClickableActionElement {
      public ReSubmit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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