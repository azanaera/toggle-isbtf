package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LoadFactorDV.EditableLoadFactorsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadFactorDV extends DetailViewElement {
  public final static String CHECKSUM = "25376907d57b7dfadac37786107bb021";
  
  public LoadFactorDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableLoadFactorsLV getEditableLoadFactorsLV() {
    return getOrCreateProperty("EditableLoadFactorsLV", "EditableLoadFactorsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableLoadFactorsLV.class);
  }
  
  public EditableLoadFactorsLV_tb getEditableLoadFactorsLV_tb() {
    return getOrCreateProperty("EditableLoadFactorsLV_tb", "EditableLoadFactorsLV_tb", null, pcftest.LoadFactorDV.EditableLoadFactorsLV_tb.class);
  }
  
  public ValueElement getGroupLoadFactor() {
    return getOrCreateProperty("GroupLoadFactor", "GroupLoadFactor", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/loadandvacation/LoadFactorDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableLoadFactorsLV_tb extends PCFElement {
    public EditableLoadFactorsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}