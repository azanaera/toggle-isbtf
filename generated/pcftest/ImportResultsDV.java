package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ImportResultsDV.Canceled;
import pcftest.ImportResultsDV.Failure;
import pcftest.ImportResultsDV.Success;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/importexport/ImportResultsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportResultsDV extends DetailViewElement {
  public final static String CHECKSUM = "4b8786b62a7aca76239f3c45fd8db2fe";
  
  public ImportResultsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Canceled getCanceled() {
    return getOrCreateProperty("Canceled", "Canceled", null, pcftest.ImportResultsDV.Canceled.class);
  }
  
  public Failure getFailure() {
    return getOrCreateProperty("Failure", "Failure", null, pcftest.ImportResultsDV.Failure.class);
  }
  
  public Success getSuccess() {
    return getOrCreateProperty("Success", "Success", null, pcftest.ImportResultsDV.Success.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportResultsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Canceled extends ValueElement {
    public Canceled(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportResultsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Failure extends ValueElement {
    public Failure(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportResultsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Success extends ValueElement {
    public Success(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}