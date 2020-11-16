package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesForWizardSteps;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WizardMenuLinkElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ImportWizard.Cancel;
import pcftest.ImportWizard.Finish;
import pcftest.ImportWizard.ImportWizard_UpLink;
import pcftest.ImportWizard.Next;
import pcftest.ImportWizard.Prev;
import pcftest.ImportWizard.Upload;
import pcftest.ImportWizard._Paging;
import pcftest.ImportWizard.__crumb__;
import pcftest.ImportWizard.entry;
import pcftest.ImportWizard.entry.ResolveConflicts;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportWizard extends PCFLocation {
  public final static String CHECKSUM = "cbf08e6f315cd321f1a40af231df6b0b";
  
  public ImportWizard(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ImportWizard"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ImportWizard.Cancel.class);
  }
  
  public Finish getFinish() {
    return getOrCreateProperty("Finish", "Finish", null, pcftest.ImportWizard.Finish.class);
  }
  
  public ImportWizard_UpLink getImportWizard_UpLink() {
    return getOrCreateProperty("ImportWizard_UpLink", "ImportWizard_UpLink", null, pcftest.ImportWizard.ImportWizard_UpLink.class);
  }
  
  public Next getNext() {
    return getOrCreateProperty("Next", "Next", null, pcftest.ImportWizard.Next.class);
  }
  
  public Prev getPrev() {
    return getOrCreateProperty("Prev", "Prev", null, pcftest.ImportWizard.Prev.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public Upload getUpload() {
    return getOrCreateProperty("Upload", "Upload", null, pcftest.ImportWizard.Upload.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesForWizardSteps<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.ImportWizard.entry.class, gw.smoketest.platform.web.IteratorEntriesForWizardSteps.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ImportWizard._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ImportWizard.__crumb__.class);
  }
  
  public Utilities get_parent() {
    return getOrCreateProperty("_parent", pcftest.Utilities.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Finish extends ClickableActionElement {
    public Finish(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportWizard_UpLink extends ClickableActionElement {
    public ImportWizard_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Next extends ClickableActionElement {
    public Next(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Prev extends ClickableActionElement {
    public Prev(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Upload extends WizardMenuLinkElement {
    public Upload(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ImportWizard_UploadScreen click() {
      clickSelf();
return getImportWizard_UploadScreen();
    }
    
    public ImportWizard_UploadScreen getImportWizard_UploadScreen() {
      return getOrCreateWizardStepProperty("ImportWizard_UploadScreen", "ImportWizard_UploadScreen", null, pcftest.ImportWizard_UploadScreen.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ResolveConflicts getResolveConflicts() {
      return getOrCreateProperty("ResolveConflicts", "ResolveConflicts", null, pcftest.ImportWizard.entry.ResolveConflicts.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ResolveConflicts extends WizardMenuLinkElement {
      public ResolveConflicts(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ImportWizard_ConflictScreen click() {
        clickSelf();
return getImportWizard_ConflictScreen();
      }
      
      public ImportWizard_ConflictScreen getImportWizard_ConflictScreen() {
        return getOrCreateWizardStepProperty("ImportWizard_ConflictScreen", "ImportWizard_ConflictScreen", null, pcftest.ImportWizard_ConflictScreen.class);
      }
      
      
    }
    
    
  }
  
  
}