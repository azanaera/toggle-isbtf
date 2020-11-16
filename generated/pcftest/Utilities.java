package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Utilities.MenuLinks;
import pcftest.Utilities.MenuLinks.Utilities_DataChangePage;
import pcftest.Utilities.MenuLinks.Utilities_ExportData;
import pcftest.Utilities.MenuLinks.Utilities_ImportWizard;
import pcftest.Utilities.MenuLinks.Utilities_InboundFileSearch;
import pcftest.Utilities.MenuLinks.Utilities_OutboundFileSearch;
import pcftest.Utilities.MenuLinks.Utilities_Properties;
import pcftest.Utilities.MenuLinks.Utilities_ScriptParametersPage;
import pcftest.Utilities.Utilities_UpLink;
import pcftest.Utilities._Paging;
import pcftest.Utilities.__crumb__;
import pcftest.Utilities._msgs;
import pcftest.Utilities.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Utilities extends PCFLocation {
  public final static String CHECKSUM = "5c31869a6c524f683b410aac5325d9fd";
  
  public Utilities(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Utilities"));
  }
  
  public DataChangePage getDataChangePage() {
    return getOrCreateProperty("DataChangePage", pcftest.DataChangePage.class);
  }
  
  public ExportData getExportData() {
    return getOrCreateProperty("ExportData", pcftest.ExportData.class);
  }
  
  public ImportWizard getImportWizard() {
    return getOrCreateProperty("ImportWizard", pcftest.ImportWizard.class);
  }
  
  public InboundFileSearch getInboundFileSearch() {
    return getOrCreateProperty("InboundFileSearch", pcftest.InboundFileSearch.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.Utilities.MenuLinks.class, "Admin-MenuLinks-Admin_Utilities");
  }
  
  public OutboundFileSearch getOutboundFileSearch() {
    return getOrCreateProperty("OutboundFileSearch", pcftest.OutboundFileSearch.class);
  }
  
  public Properties getProperties() {
    return getOrCreateProperty("Properties", pcftest.Properties.class);
  }
  
  public ScriptParametersPage getScriptParametersPage() {
    return getOrCreateProperty("ScriptParametersPage", pcftest.ScriptParametersPage.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public Utilities_UpLink getUtilities_UpLink() {
    return getOrCreateProperty("Utilities_UpLink", "Utilities_UpLink", null, pcftest.Utilities.Utilities_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Utilities._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Utilities.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Utilities._msgs.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.Utilities.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Utilities_DataChangePage getUtilities_DataChangePage() {
      return getOrCreateProperty("Utilities_DataChangePage", "Utilities_DataChangePage", null, pcftest.Utilities.MenuLinks.Utilities_DataChangePage.class);
    }
    
    public Utilities_ExportData getUtilities_ExportData() {
      return getOrCreateProperty("Utilities_ExportData", "Utilities_ExportData", null, pcftest.Utilities.MenuLinks.Utilities_ExportData.class);
    }
    
    public Utilities_ImportWizard getUtilities_ImportWizard() {
      return getOrCreateProperty("Utilities_ImportWizard", "Utilities_ImportWizard", null, pcftest.Utilities.MenuLinks.Utilities_ImportWizard.class);
    }
    
    public Utilities_InboundFileSearch getUtilities_InboundFileSearch() {
      return getOrCreateProperty("Utilities_InboundFileSearch", "Utilities_InboundFileSearch", null, pcftest.Utilities.MenuLinks.Utilities_InboundFileSearch.class);
    }
    
    public Utilities_OutboundFileSearch getUtilities_OutboundFileSearch() {
      return getOrCreateProperty("Utilities_OutboundFileSearch", "Utilities_OutboundFileSearch", null, pcftest.Utilities.MenuLinks.Utilities_OutboundFileSearch.class);
    }
    
    public Utilities_Properties getUtilities_Properties() {
      return getOrCreateProperty("Utilities_Properties", "Utilities_Properties", null, pcftest.Utilities.MenuLinks.Utilities_Properties.class);
    }
    
    public Utilities_ScriptParametersPage getUtilities_ScriptParametersPage() {
      return getOrCreateProperty("Utilities_ScriptParametersPage", "Utilities_ScriptParametersPage", null, pcftest.Utilities.MenuLinks.Utilities_ScriptParametersPage.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Utilities_DataChangePage extends ClickableActionElement {
      public Utilities_DataChangePage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DataChangePage click() {
        return clickThis(pcftest.DataChangePage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Utilities_ExportData extends ClickableActionElement {
      public Utilities_ExportData(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExportData click() {
        return clickThis(pcftest.ExportData.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Utilities_ImportWizard extends ClickableActionElement {
      public Utilities_ImportWizard(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ImportWizard click() {
        return clickThis(pcftest.ImportWizard.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Utilities_InboundFileSearch extends ClickableActionElement {
      public Utilities_InboundFileSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public InboundFileSearch click() {
        return clickThis(pcftest.InboundFileSearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Utilities_OutboundFileSearch extends ClickableActionElement {
      public Utilities_OutboundFileSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OutboundFileSearch click() {
        return clickThis(pcftest.OutboundFileSearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Utilities_Properties extends ClickableActionElement {
      public Utilities_Properties(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Properties click() {
        return clickThis(pcftest.Properties.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Utilities_ScriptParametersPage extends ClickableActionElement {
      public Utilities_ScriptParametersPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ScriptParametersPage click() {
        return clickThis(pcftest.ScriptParametersPage.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Utilities_UpLink extends ClickableActionElement {
    public Utilities_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/utilities/Utilities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}