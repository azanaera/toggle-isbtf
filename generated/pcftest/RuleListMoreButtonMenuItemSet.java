package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleListMoreButtonMenuItemSet.DisableSelectedRules;
import pcftest.RuleListMoreButtonMenuItemSet.EnableSelectedRules;
import pcftest.RuleListMoreButtonMenuItemSet.ExportAll;
import pcftest.RuleListMoreButtonMenuItemSet.ExportSelected;
import pcftest.RuleListMoreButtonMenuItemSet.Import;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleListMoreButtonMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleListMoreButtonMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "70534e60b7dfa3e3ab2e9110cbf8ee4e";
  
  public RuleListMoreButtonMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DisableSelectedRules getDisableSelectedRules() {
    return getOrCreateProperty("DisableSelectedRules", "DisableSelectedRules", null, pcftest.RuleListMoreButtonMenuItemSet.DisableSelectedRules.class);
  }
  
  public EnableSelectedRules getEnableSelectedRules() {
    return getOrCreateProperty("EnableSelectedRules", "EnableSelectedRules", null, pcftest.RuleListMoreButtonMenuItemSet.EnableSelectedRules.class);
  }
  
  public ExportAll getExportAll() {
    return getOrCreateProperty("ExportAll", "ExportAll", null, pcftest.RuleListMoreButtonMenuItemSet.ExportAll.class);
  }
  
  public ExportSelected getExportSelected() {
    return getOrCreateProperty("ExportSelected", "ExportSelected", null, pcftest.RuleListMoreButtonMenuItemSet.ExportSelected.class);
  }
  
  public Import getImport() {
    return getOrCreateProperty("Import", "Import", null, pcftest.RuleListMoreButtonMenuItemSet.Import.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleListMoreButtonMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisableSelectedRules extends ClickableActionElement {
    public DisableSelectedRules(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleListMoreButtonMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EnableSelectedRules extends ClickableActionElement {
    public EnableSelectedRules(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleListMoreButtonMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportAll extends ClickableActionElement {
    public ExportAll(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleListMoreButtonMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportSelected extends ClickableActionElement {
    public ExportSelected(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleListMoreButtonMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Import extends ClickableActionElement {
    public Import(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StartRuleImportPopup click() {
      return clickThis(pcftest.StartRuleImportPopup.class);
    }
    
    
  }
  
  
}