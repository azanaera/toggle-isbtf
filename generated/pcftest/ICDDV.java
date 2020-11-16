package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ICDDV.Body_System;
import pcftest.ICDDV.ICD_Code;
import typekey.ICDBodySystem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/icd/ICDDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ICDDV extends DetailViewElement {
  public final static String CHECKSUM = "59dff5a809645ed2c09da443329cd40a";
  
  public ICDDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getAvailable_Date() {
    return getOrCreateProperty("Available_Date", "Available_Date", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Body_System getBody_System() {
    return getOrCreateProperty("Body_System", "Body_System", null, pcftest.ICDDV.Body_System.class);
  }
  
  public CheckboxValueElement getChronic() {
    return getOrCreateProperty("Chronic", "Chronic", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getEnd_Date() {
    return getOrCreateProperty("End_Date", "End_Date", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ICD_Code getICD_Code() {
    return getOrCreateProperty("ICD_Code", "ICD_Code", null, pcftest.ICDDV.ICD_Code.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Body_System extends SelectElement {
    public Body_System(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ICDBodySystem arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ICDBodySystem getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ICDBodySystem.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ICDBodySystem arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICDDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICD_Code extends ValueElement {
    public ICD_Code(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ICD10Data click() {
      return clickThis(pcftest.ICD10Data.class);
    }
    
    
  }
  
  
}