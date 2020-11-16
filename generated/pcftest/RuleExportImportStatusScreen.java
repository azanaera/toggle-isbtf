package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
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
import pcftest.RuleExportImportStatusScreen.ExportsLV;
import pcftest.RuleExportImportStatusScreen.ExportsLV.RulesHeader;
import pcftest.RuleExportImportStatusScreen.ExportsLV.entry.Download;
import pcftest.RuleExportImportStatusScreen.ExportsLV.entry.Rules;
import pcftest.RuleExportImportStatusScreen.ExportsLV_tb;
import pcftest.RuleExportImportStatusScreen.Import;
import pcftest.RuleExportImportStatusScreen.ImportsLV;
import pcftest.RuleExportImportStatusScreen.ImportsLV.SourceNameHeader;
import pcftest.RuleExportImportStatusScreen.ImportsLV.entry.ImportDetails;
import pcftest.RuleExportImportStatusScreen.ImportsLV_tb;
import pcftest.RuleExportImportStatusScreen.RefreshButton;
import pcftest.RuleExportImportStatusScreen._msgs;
import typekey.Rule;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleExportImportStatusScreen extends PCFElement {
  public final static String CHECKSUM = "e02c71b8e2c1203e6c00fbed132f384a";
  
  public RuleExportImportStatusScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ExportsLV getExportsLV() {
    return getOrCreateProperty("ExportsLV", "ExportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RuleExportImportStatusScreen.ExportsLV.class);
  }
  
  public ExportsLV_tb getExportsLV_tb() {
    return getOrCreateProperty("ExportsLV_tb", "ExportsLV_tb", null, pcftest.RuleExportImportStatusScreen.ExportsLV_tb.class);
  }
  
  public Import getImport() {
    return getOrCreateProperty("Import", "Import", null, pcftest.RuleExportImportStatusScreen.Import.class);
  }
  
  public ImportsLV getImportsLV() {
    return getOrCreateProperty("ImportsLV", "ImportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RuleExportImportStatusScreen.ImportsLV.class);
  }
  
  public ImportsLV_tb getImportsLV_tb() {
    return getOrCreateProperty("ImportsLV_tb", "ImportsLV_tb", null, pcftest.RuleExportImportStatusScreen.ImportsLV_tb.class);
  }
  
  public RefreshButton getRefreshButton() {
    return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.RuleExportImportStatusScreen.RefreshButton.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RuleExportImportStatusScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportsLV extends PCFElement {
    public ExportsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.RuleExportImportStatusScreen.ExportsLV.CreatedHeader getCreatedHeader() {
      return getOrCreateProperty("CreatedHeader", "CreatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ExportsLV.CreatedHeader.class);
    }
    
    public pcftest.RuleExportImportStatusScreen.ExportsLV.ProgressHeader getProgressHeader() {
      return getOrCreateProperty("ProgressHeader", "ProgressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ExportsLV.ProgressHeader.class);
    }
    
    public pcftest.RuleExportImportStatusScreen.ExportsLV.RuleTypeHeader getRuleTypeHeader() {
      return getOrCreateProperty("RuleTypeHeader", "RuleTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ExportsLV.RuleTypeHeader.class);
    }
    
    public RulesHeader getRulesHeader() {
      return getOrCreateProperty("RulesHeader", "RulesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ExportsLV.RulesHeader.class);
    }
    
    public pcftest.RuleExportImportStatusScreen.ExportsLV.StartedByHeader getStartedByHeader() {
      return getOrCreateProperty("StartedByHeader", "StartedByHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ExportsLV.StartedByHeader.class);
    }
    
    public pcftest.RuleExportImportStatusScreen.ExportsLV.StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ExportsLV.StatusHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.RuleExportImportStatusScreen.ExportsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RuleExportImportStatusScreen.ExportsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.RuleExportImportStatusScreen.ExportsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.RuleExportImportStatusScreen.ExportsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedHeader extends ValueElement {
      public CreatedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProgressHeader extends ValueElement {
      public ProgressHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleTypeHeader extends ValueElement {
      public RuleTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RulesHeader extends ValueElement {
      public RulesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartedByHeader extends ValueElement {
      public StartedByHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.RuleExportImportStatusScreen.ExportsLV.entry.Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.RuleExportImportStatusScreen.ExportsLV.entry.Cancel.class);
      }
      
      public DateElement getCreated() {
        return getOrCreateProperty("Created", "Created", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public Download getDownload() {
        return getOrCreateProperty("Download", "Download", null, pcftest.RuleExportImportStatusScreen.ExportsLV.entry.Download.class);
      }
      
      public ValueElement getProgress() {
        return getOrCreateProperty("Progress", "Progress", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.RuleExportImportStatusScreen.ExportsLV.entry.RuleType getRuleType() {
        return getOrCreateProperty("RuleType", "RuleType", null, pcftest.RuleExportImportStatusScreen.ExportsLV.entry.RuleType.class);
      }
      
      public Rules getRules() {
        return getOrCreateProperty("Rules", "Rules", null, pcftest.RuleExportImportStatusScreen.ExportsLV.entry.Rules.class);
      }
      
      public ValueElement getStartedBy() {
        return getOrCreateProperty("StartedBy", "StartedBy", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.RuleExportImportStatusScreen.ExportsLV.entry.Status getStatus() {
        return getOrCreateProperty("Status", "Status", null, pcftest.RuleExportImportStatusScreen.ExportsLV.entry.Status.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.RuleExportImportStatusScreen.ExportsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleExportImportStatusScreen.ExportsLV.entry._Select.class);
      }
      
      public pcftest.RuleExportImportStatusScreen.ExportsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleExportImportStatusScreen.ExportsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Download extends ClickableActionElement {
        public Download(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RuleType extends SelectElement {
        public RuleType(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(Rule arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public Rule getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Rule.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(Rule arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Rules extends ValueElement {
        public Rules(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public RuleExportDetailsPopup click() {
          return clickThis(pcftest.RuleExportDetailsPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Status extends ValueElement {
        public Status(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public RuleExportImportFailurePopup click() {
          return clickThis(pcftest.RuleExportImportFailurePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportsLV_tb extends PCFElement {
    public ExportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Import extends ClickableActionElement {
    public Import(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StartRuleImportPopup click() {
      return clickThis(pcftest.StartRuleImportPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportsLV extends PCFElement {
    public ImportsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.RuleExportImportStatusScreen.ImportsLV.CreatedHeader getCreatedHeader() {
      return getOrCreateProperty("CreatedHeader", "CreatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ImportsLV.CreatedHeader.class);
    }
    
    public pcftest.RuleExportImportStatusScreen.ImportsLV.ProgressHeader getProgressHeader() {
      return getOrCreateProperty("ProgressHeader", "ProgressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ImportsLV.ProgressHeader.class);
    }
    
    public pcftest.RuleExportImportStatusScreen.ImportsLV.RuleTypeHeader getRuleTypeHeader() {
      return getOrCreateProperty("RuleTypeHeader", "RuleTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ImportsLV.RuleTypeHeader.class);
    }
    
    public SourceNameHeader getSourceNameHeader() {
      return getOrCreateProperty("SourceNameHeader", "SourceNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ImportsLV.SourceNameHeader.class);
    }
    
    public pcftest.RuleExportImportStatusScreen.ImportsLV.StartedByHeader getStartedByHeader() {
      return getOrCreateProperty("StartedByHeader", "StartedByHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ImportsLV.StartedByHeader.class);
    }
    
    public pcftest.RuleExportImportStatusScreen.ImportsLV.StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleExportImportStatusScreen.ImportsLV.StatusHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.RuleExportImportStatusScreen.ImportsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RuleExportImportStatusScreen.ImportsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.RuleExportImportStatusScreen.ImportsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.RuleExportImportStatusScreen.ImportsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedHeader extends ValueElement {
      public CreatedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProgressHeader extends ValueElement {
      public ProgressHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleTypeHeader extends ValueElement {
      public RuleTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SourceNameHeader extends ValueElement {
      public SourceNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartedByHeader extends ValueElement {
      public StartedByHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.RuleExportImportStatusScreen.ImportsLV.entry.Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.RuleExportImportStatusScreen.ImportsLV.entry.Cancel.class);
      }
      
      public DateElement getCreated() {
        return getOrCreateProperty("Created", "Created", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ImportDetails getImportDetails() {
        return getOrCreateProperty("ImportDetails", "ImportDetails", null, pcftest.RuleExportImportStatusScreen.ImportsLV.entry.ImportDetails.class);
      }
      
      public ValueElement getProgress() {
        return getOrCreateProperty("Progress", "Progress", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.RuleExportImportStatusScreen.ImportsLV.entry.RuleType getRuleType() {
        return getOrCreateProperty("RuleType", "RuleType", null, pcftest.RuleExportImportStatusScreen.ImportsLV.entry.RuleType.class);
      }
      
      public ValueElement getSourceName() {
        return getOrCreateProperty("SourceName", "SourceName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getStartedBy() {
        return getOrCreateProperty("StartedBy", "StartedBy", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.RuleExportImportStatusScreen.ImportsLV.entry.Status getStatus() {
        return getOrCreateProperty("Status", "Status", null, pcftest.RuleExportImportStatusScreen.ImportsLV.entry.Status.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.RuleExportImportStatusScreen.ImportsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleExportImportStatusScreen.ImportsLV.entry._Select.class);
      }
      
      public pcftest.RuleExportImportStatusScreen.ImportsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleExportImportStatusScreen.ImportsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ImportDetails extends ClickableActionElement {
        public ImportDetails(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public RuleImportDetailsPopup click() {
          return clickThis(pcftest.RuleImportDetailsPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RuleType extends SelectElement {
        public RuleType(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(Rule arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public Rule getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Rule.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(Rule arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Status extends ValueElement {
        public Status(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public RuleExportImportFailurePopup click() {
          return clickThis(pcftest.RuleExportImportFailurePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportsLV_tb extends PCFElement {
    public ImportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RefreshButton extends ClickableActionElement {
    public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportImportStatusScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}