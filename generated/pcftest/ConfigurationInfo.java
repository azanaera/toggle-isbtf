package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ConfigurationInfo.ConfigurationInfo_DownloadButton;
import pcftest.ConfigurationInfo.ConfigurationInfo_UpLink;
import pcftest.ConfigurationInfo.ParameterLV;
import pcftest.ConfigurationInfo.ParameterLV.NameHeader;
import pcftest.ConfigurationInfo.ParameterLV.ValueHeader;
import pcftest.ConfigurationInfo.ParameterLV.entry;
import pcftest.ConfigurationInfo.ParameterLV.entry._Select;
import pcftest.ConfigurationInfo.ParameterLV.entry._ViewDetail;
import pcftest.ConfigurationInfo.ParameterLV_tb;
import pcftest.ConfigurationInfo._Paging;
import pcftest.ConfigurationInfo.__crumb__;
import pcftest.ConfigurationInfo._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ConfigurationInfo extends PCFLocation {
  public final static String CHECKSUM = "9f2ab5ee5f4e8448ef70ea3d049a62c6";
  
  public ConfigurationInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ConfigurationInfo"));
  }
  
  public ConfigurationInfo_DownloadButton getConfigurationInfo_DownloadButton() {
    return getOrCreateProperty("ConfigurationInfo_DownloadButton", "ConfigurationInfo_DownloadButton", null, pcftest.ConfigurationInfo.ConfigurationInfo_DownloadButton.class);
  }
  
  public ConfigurationInfo_UpLink getConfigurationInfo_UpLink() {
    return getOrCreateProperty("ConfigurationInfo_UpLink", "ConfigurationInfo_UpLink", null, pcftest.ConfigurationInfo.ConfigurationInfo_UpLink.class);
  }
  
  public ParameterLV getParameterLV() {
    return getOrCreateProperty("ParameterLV", "ParameterLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConfigurationInfo.ParameterLV.class);
  }
  
  public ParameterLV_tb getParameterLV_tb() {
    return getOrCreateProperty("ParameterLV_tb", "ParameterLV_tb", null, pcftest.ConfigurationInfo.ParameterLV_tb.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ConfigurationInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ConfigurationInfo.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ConfigurationInfo._msgs.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConfigurationInfo_DownloadButton extends ClickableActionElement {
    public ConfigurationInfo_DownloadButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConfigurationInfo_UpLink extends ClickableActionElement {
    public ConfigurationInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ParameterLV extends PCFElement {
    public ParameterLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConfigurationInfo.ParameterLV.NameHeader.class);
    }
    
    public ValueHeader getValueHeader() {
      return getOrCreateProperty("ValueHeader", "ValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConfigurationInfo.ParameterLV.ValueHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ConfigurationInfo.ParameterLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ValueHeader extends ValueElement {
      public ValueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getName() {
        return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getValue() {
        return getOrCreateProperty("Value", "Value", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ConfigurationInfo.ParameterLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConfigurationInfo.ParameterLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ParameterLV_tb extends PCFElement {
    public ParameterLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConfigurationInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}