package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ImportWizard_UploadDV.Conflicts;
import pcftest.ImportWizard_UploadDV.File;
import pcftest.ImportWizard_UploadDV.NoConflicts;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_UploadDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportWizard_UploadDV extends DetailViewElement {
  public final static String CHECKSUM = "015748322fe489cd56614cc43fd3487f";
  
  public ImportWizard_UploadDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Conflicts getConflicts() {
    return getOrCreateProperty("Conflicts", "Conflicts", null, pcftest.ImportWizard_UploadDV.Conflicts.class);
  }
  
  public File getFile() {
    return getOrCreateProperty("File", "File", null, pcftest.ImportWizard_UploadDV.File.class);
  }
  
  public NoConflicts getNoConflicts() {
    return getOrCreateProperty("NoConflicts", "NoConflicts", null, pcftest.ImportWizard_UploadDV.NoConflicts.class);
  }
  
  public SelectElement getResolution() {
    return getOrCreateProperty("Resolution", "Resolution", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_UploadDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Conflicts extends ValueElement {
    public Conflicts(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_UploadDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class File extends ValueElement {
    public File(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_UploadDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoConflicts extends ValueElement {
    public NoConflicts(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}