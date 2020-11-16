package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ImportPropertiesDV.ImportPropertiesDVFile;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/properties/import/ImportPropertiesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportPropertiesDV extends DetailViewElement {
  public final static String CHECKSUM = "f2a705aeb0cee68549c4e3847aa6bb43";
  
  public ImportPropertiesDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ImportPropertiesDVFile getImportPropertiesDVFile() {
    return getOrCreateProperty("ImportPropertiesDVFile", "ImportPropertiesDVFile", null, pcftest.ImportPropertiesDV.ImportPropertiesDVFile.class);
  }
  
  public CheckboxValueElement getImportPropertiesDVUpdateExisting() {
    return getOrCreateProperty("ImportPropertiesDVUpdateExisting", "ImportPropertiesDVUpdateExisting", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/import/ImportPropertiesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportPropertiesDVFile extends ValueElement {
    public ImportPropertiesDVFile(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}