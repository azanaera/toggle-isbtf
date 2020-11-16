package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.StatCodeDetailDV.MajorPeril;
import typekey.MajorPerils;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/policy/StatCodeDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StatCodeDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "b3bc9f42b85116a7f33261a264253690";
  
  public StatCodeDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBuildingNumber() {
    return getOrCreateProperty("BuildingNumber", "BuildingNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClassCode() {
    return getOrCreateProperty("ClassCode", "ClassCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.StatCodeDetailDV.InsuranceLine getInsuranceLine() {
    return getOrCreateProperty("InsuranceLine", "InsuranceLine", null, pcftest.StatCodeDetailDV.InsuranceLine.class);
  }
  
  public pcftest.StatCodeDetailDV.InsuranceSubLine getInsuranceSubLine() {
    return getOrCreateProperty("InsuranceSubLine", "InsuranceSubLine", null, pcftest.StatCodeDetailDV.InsuranceSubLine.class);
  }
  
  public ValueElement getLineNumber() {
    return getOrCreateProperty("LineNumber", "LineNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLocationNumber() {
    return getOrCreateProperty("LocationNumber", "LocationNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MajorPeril getMajorPeril() {
    return getOrCreateProperty("MajorPeril", "MajorPeril", null, pcftest.StatCodeDetailDV.MajorPeril.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.StatCodeDetailDV.State getState() {
    return getOrCreateProperty("State", "State", null, pcftest.StatCodeDetailDV.State.class);
  }
  
  public ValueElement getVehicleNumber() {
    return getOrCreateProperty("VehicleNumber", "VehicleNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodeDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuranceLine extends SelectElement {
    public InsuranceLine(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.InsuranceLine arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.InsuranceLine getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InsuranceLine.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.InsuranceLine arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodeDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuranceSubLine extends SelectElement {
    public InsuranceSubLine(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.InsuranceSubLine arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.InsuranceSubLine getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InsuranceSubLine.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.InsuranceSubLine arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodeDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MajorPeril extends SelectElement {
    public MajorPeril(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(MajorPerils arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public MajorPerils getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MajorPerils.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(MajorPerils arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodeDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class State extends SelectElement {
    public State(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.State arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.State getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.State arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}