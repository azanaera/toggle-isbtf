package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCSampleData.CCSampleData_UpLink;
import pcftest.CCSampleData.DataGroupDescriptionHeader;
import pcftest.CCSampleData.DataGroupNameHeader;
import pcftest.CCSampleData._Paging;
import pcftest.CCSampleData.__crumb__;
import pcftest.CCSampleData._msgs;
import pcftest.CCSampleData.entry;
import pcftest.CCSampleData.entry.LoadSampleDataButton;
import pcftest.CCSampleData.entry._Select;
import pcftest.CCSampleData.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCSampleData extends PCFLocation {
  public final static String CHECKSUM = "4dafe7b5d2ee9b79214c5beb5e6d4ff8";
  
  public CCSampleData(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CCSampleData"));
  }
  
  public CCSampleData_UpLink getCCSampleData_UpLink() {
    return getOrCreateProperty("CCSampleData_UpLink", "CCSampleData_UpLink", null, pcftest.CCSampleData.CCSampleData_UpLink.class);
  }
  
  public DataGroupDescriptionHeader getDataGroupDescriptionHeader() {
    return getOrCreateProperty("DataGroupDescriptionHeader", "DataGroupDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCSampleData.DataGroupDescriptionHeader.class);
  }
  
  public DataGroupNameHeader getDataGroupNameHeader() {
    return getOrCreateProperty("DataGroupNameHeader", "DataGroupNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCSampleData.DataGroupNameHeader.class);
  }
  
  public ValueElement getLoadSampleDataButtonHeader() {
    return getOrCreateProperty("LoadSampleDataButtonHeader", "LoadSampleDataButtonHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ServerToolsDisclaimerDV getServerToolsDisclaimerDV() {
    return getOrCreateProperty("ServerToolsDisclaimerDV", "ServerToolsDisclaimerDV", null, pcftest.ServerToolsDisclaimerDV.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CCSampleData.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CCSampleData._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CCSampleData.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CCSampleData._msgs.class);
  }
  
  public UnsupportedTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.UnsupportedTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CCSampleData_UpLink extends ClickableActionElement {
    public CCSampleData_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DataGroupDescriptionHeader extends ValueElement {
    public DataGroupDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DataGroupNameHeader extends ValueElement {
    public DataGroupNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDataGroupDescription() {
      return getOrCreateProperty("DataGroupDescription", "DataGroupDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDataGroupName() {
      return getOrCreateProperty("DataGroupName", "DataGroupName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LoadSampleDataButton getLoadSampleDataButton() {
      return getOrCreateProperty("LoadSampleDataButton", "LoadSampleDataButton", null, pcftest.CCSampleData.entry.LoadSampleDataButton.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.CCSampleData.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CCSampleData.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadSampleDataButton extends ValueElement {
      public LoadSampleDataButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/CCSampleData.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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