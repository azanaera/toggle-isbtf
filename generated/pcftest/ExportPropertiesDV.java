package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExportPropertiesDV.Group;
import typekey.RuntimePropertyGroup;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/properties/export/ExportPropertiesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExportPropertiesDV extends DetailViewElement {
  public final static String CHECKSUM = "5de3f0976ed4e1851aee3e375febab1e";
  
  public ExportPropertiesDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckboxValueElement getExportPropertiesDVCurrentInput() {
    return getOrCreateProperty("ExportPropertiesDVCurrentInput", "ExportPropertiesDVCurrentInput", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getExportPropertiesDVDefaultsInput() {
    return getOrCreateProperty("ExportPropertiesDVDefaultsInput", "ExportPropertiesDVDefaultsInput", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public CheckboxValueElement getExportPropertiesDVTargetInput() {
    return getOrCreateProperty("ExportPropertiesDVTargetInput", "ExportPropertiesDVTargetInput", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ValueElement getExportPropertiesDVTargetName() {
    return getOrCreateProperty("ExportPropertiesDVTargetName", "ExportPropertiesDVTargetName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Group getGroup() {
    return getOrCreateProperty("Group", "Group", null, pcftest.ExportPropertiesDV.Group.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/export/ExportPropertiesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Group extends SelectElement {
    public Group(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(RuntimePropertyGroup arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public RuntimePropertyGroup getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RuntimePropertyGroup.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(RuntimePropertyGroup arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}