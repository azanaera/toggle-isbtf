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
import pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV;
import pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.EnvironmentVars_keyHeader;
import pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.EnvironmentVars_valueHeader;
import pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV_tb;
import pcftest.RuntimeEnvironmentInfo.RuntimeEnvironmentInfo_Download;
import pcftest.RuntimeEnvironmentInfo.RuntimeEnvironmentInfo_UpLink;
import pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV;
import pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.systemproperties_keyHeader;
import pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.systemproperties_valueHeader;
import pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV_tb;
import pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV;
import pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.versionproperties_keyHeader;
import pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.versionproperties_valueHeader;
import pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV_tb;
import pcftest.RuntimeEnvironmentInfo._Paging;
import pcftest.RuntimeEnvironmentInfo.__crumb__;
import pcftest.RuntimeEnvironmentInfo._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuntimeEnvironmentInfo extends PCFLocation {
  public final static String CHECKSUM = "76cbacb6058688271c6e4cc802e45a1f";
  
  public RuntimeEnvironmentInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RuntimeEnvironmentInfo"));
  }
  
  public EnvironmentVarsLV getEnvironmentVarsLV() {
    return getOrCreateProperty("EnvironmentVarsLV", "EnvironmentVarsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.class);
  }
  
  public EnvironmentVarsLV_tb getEnvironmentVarsLV_tb() {
    return getOrCreateProperty("EnvironmentVarsLV_tb", "EnvironmentVarsLV_tb", null, pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV_tb.class);
  }
  
  public RuntimeEnvironmentInfo_Download getRuntimeEnvironmentInfo_Download() {
    return getOrCreateProperty("RuntimeEnvironmentInfo_Download", "RuntimeEnvironmentInfo_Download", null, pcftest.RuntimeEnvironmentInfo.RuntimeEnvironmentInfo_Download.class);
  }
  
  public RuntimeEnvironmentInfo_UpLink getRuntimeEnvironmentInfo_UpLink() {
    return getOrCreateProperty("RuntimeEnvironmentInfo_UpLink", "RuntimeEnvironmentInfo_UpLink", null, pcftest.RuntimeEnvironmentInfo.RuntimeEnvironmentInfo_UpLink.class);
  }
  
  public ValueElement getSystemDetailsTextBox() {
    return getOrCreateProperty("SystemDetailsTextBox", "SystemDetailsTextBox", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SystemPropertiesLV getSystemPropertiesLV() {
    return getOrCreateProperty("SystemPropertiesLV", "SystemPropertiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.class);
  }
  
  public SystemPropertiesLV_tb getSystemPropertiesLV_tb() {
    return getOrCreateProperty("SystemPropertiesLV_tb", "SystemPropertiesLV_tb", null, pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV_tb.class);
  }
  
  public VersionPropertiesLV getVersionPropertiesLV() {
    return getOrCreateProperty("VersionPropertiesLV", "VersionPropertiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.class);
  }
  
  public VersionPropertiesLV_tb getVersionPropertiesLV_tb() {
    return getOrCreateProperty("VersionPropertiesLV_tb", "VersionPropertiesLV_tb", null, pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV_tb.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RuntimeEnvironmentInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RuntimeEnvironmentInfo.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RuntimeEnvironmentInfo._msgs.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EnvironmentVarsLV extends PCFElement {
    public EnvironmentVarsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EnvironmentVars_keyHeader getEnvironmentVars_keyHeader() {
      return getOrCreateProperty("EnvironmentVars_keyHeader", "EnvironmentVars_keyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.EnvironmentVars_keyHeader.class);
    }
    
    public EnvironmentVars_valueHeader getEnvironmentVars_valueHeader() {
      return getOrCreateProperty("EnvironmentVars_valueHeader", "EnvironmentVars_valueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.EnvironmentVars_valueHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnvironmentVars_keyHeader extends ValueElement {
      public EnvironmentVars_keyHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnvironmentVars_valueHeader extends ValueElement {
      public EnvironmentVars_valueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getEnvironmentVars_key() {
        return getOrCreateProperty("EnvironmentVars_key", "EnvironmentVars_key", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getEnvironmentVars_value() {
        return getOrCreateProperty("EnvironmentVars_value", "EnvironmentVars_value", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.entry._Select.class);
      }
      
      public pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuntimeEnvironmentInfo.EnvironmentVarsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EnvironmentVarsLV_tb extends PCFElement {
    public EnvironmentVarsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuntimeEnvironmentInfo_Download extends ClickableActionElement {
    public RuntimeEnvironmentInfo_Download(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuntimeEnvironmentInfo_UpLink extends ClickableActionElement {
    public RuntimeEnvironmentInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SystemPropertiesLV extends PCFElement {
    public SystemPropertiesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public systemproperties_keyHeader getsystemproperties_keyHeader() {
      return getOrCreateProperty("systemproperties_keyHeader", "systemproperties_keyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.systemproperties_keyHeader.class);
    }
    
    public systemproperties_valueHeader getsystemproperties_valueHeader() {
      return getOrCreateProperty("systemproperties_valueHeader", "systemproperties_valueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.systemproperties_valueHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.entry._Select.class);
      }
      
      public pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuntimeEnvironmentInfo.SystemPropertiesLV.entry._ViewDetail.class);
      }
      
      public ValueElement getsystemproperties_key() {
        return getOrCreateProperty("systemproperties_key", "systemproperties_key", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getsystemproperties_value() {
        return getOrCreateProperty("systemproperties_value", "systemproperties_value", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class systemproperties_keyHeader extends ValueElement {
      public systemproperties_keyHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class systemproperties_valueHeader extends ValueElement {
      public systemproperties_valueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SystemPropertiesLV_tb extends PCFElement {
    public SystemPropertiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VersionPropertiesLV extends PCFElement {
    public VersionPropertiesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public versionproperties_keyHeader getversionproperties_keyHeader() {
      return getOrCreateProperty("versionproperties_keyHeader", "versionproperties_keyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.versionproperties_keyHeader.class);
    }
    
    public versionproperties_valueHeader getversionproperties_valueHeader() {
      return getOrCreateProperty("versionproperties_valueHeader", "versionproperties_valueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.versionproperties_valueHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.entry._Select.class);
      }
      
      public pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuntimeEnvironmentInfo.VersionPropertiesLV.entry._ViewDetail.class);
      }
      
      public ValueElement getversionproperties_key() {
        return getOrCreateProperty("versionproperties_key", "versionproperties_key", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getversionproperties_value() {
        return getOrCreateProperty("versionproperties_value", "versionproperties_value", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class versionproperties_keyHeader extends ValueElement {
      public versionproperties_keyHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class versionproperties_valueHeader extends ValueElement {
      public versionproperties_valueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VersionPropertiesLV_tb extends PCFElement {
    public VersionPropertiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/RuntimeEnvironmentInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}