package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ImportWizard_UploadScreen.Errors;
import pcftest.ImportWizard_UploadScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_UploadScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportWizard_UploadScreen extends PCFElement {
  public final static String CHECKSUM = "0fe1b735959f3b8c017537ca3aa2588f";
  
  public ImportWizard_UploadScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Errors getErrors() {
    return getOrCreateProperty("Errors", "Errors", null, pcftest.ImportWizard_UploadScreen.Errors.class);
  }
  
  public ImportWizard_UploadDV getImportWizard_UploadDV() {
    return getOrCreateProperty("ImportWizard_UploadDV", "ImportWizard_UploadDV", null, pcftest.ImportWizard_UploadDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ImportWizard_UploadScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_UploadScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Errors extends ValueElement {
    public Errors(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_UploadScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}