package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PropertyAttributeInputSet.LossLocation_Hazard;
import pcftest.PropertyAttributeInputSet.LossLocation_Mold;
import pcftest.PropertyAttributeInputSet.PropertyAttribute_ClassType;
import pcftest.PropertyAttributeInputSet.PropertyAttribute_ExtWallMat;
import pcftest.PropertyAttributeInputSet.PropertyAttribute_LossArea;
import pcftest.PropertyAttributeInputSet.PropertyAttribute_RoofMaterial;
import pcftest.PropertyAttributeInputSet.PropertyAttribute_SprinkRetServ;
import pcftest.PropertyAttributeInputSet.PropertyAttribute_SprinklerType;
import typekey.ClassType;
import typekey.ExtWallMat;
import typekey.LossArea;
import typekey.RoofMaterial;
import typekey.SprinkRetServ;
import typekey.SprinklerType;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyAttributeInputSet extends PCFElement {
  public final static String CHECKSUM = "2509b50f7f54a698ac23213c9031fdd8";
  
  public PropertyAttributeInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LossLocation_Hazard getLossLocation_Hazard() {
    return getOrCreateProperty("LossLocation_Hazard", "LossLocation_Hazard", null, pcftest.PropertyAttributeInputSet.LossLocation_Hazard.class);
  }
  
  public LossLocation_Mold getLossLocation_Mold() {
    return getOrCreateProperty("LossLocation_Mold", "LossLocation_Mold", null, pcftest.PropertyAttributeInputSet.LossLocation_Mold.class);
  }
  
  public pcftest.PropertyAttributeInputSet.OccupancyType getOccupancyType() {
    return getOrCreateProperty("OccupancyType", "OccupancyType", null, pcftest.PropertyAttributeInputSet.OccupancyType.class);
  }
  
  public PropertyAttribute_ClassType getPropertyAttribute_ClassType() {
    return getOrCreateProperty("PropertyAttribute_ClassType", "PropertyAttribute_ClassType", null, pcftest.PropertyAttributeInputSet.PropertyAttribute_ClassType.class);
  }
  
  public PropertyAttribute_ExtWallMat getPropertyAttribute_ExtWallMat() {
    return getOrCreateProperty("PropertyAttribute_ExtWallMat", "PropertyAttribute_ExtWallMat", null, pcftest.PropertyAttributeInputSet.PropertyAttribute_ExtWallMat.class);
  }
  
  public PropertyAttribute_LossArea getPropertyAttribute_LossArea() {
    return getOrCreateProperty("PropertyAttribute_LossArea", "PropertyAttribute_LossArea", null, pcftest.PropertyAttributeInputSet.PropertyAttribute_LossArea.class);
  }
  
  public ValueElement getPropertyAttribute_NumSprinkOper() {
    return getOrCreateProperty("PropertyAttribute_NumSprinkOper", "PropertyAttribute_NumSprinkOper", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_NumSprinkler() {
    return getOrCreateProperty("PropertyAttribute_NumSprinkler", "PropertyAttribute_NumSprinkler", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_NumStories() {
    return getOrCreateProperty("PropertyAttribute_NumStories", "PropertyAttribute_NumStories", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PropertyAttribute_RoofMaterial getPropertyAttribute_RoofMaterial() {
    return getOrCreateProperty("PropertyAttribute_RoofMaterial", "PropertyAttribute_RoofMaterial", null, pcftest.PropertyAttributeInputSet.PropertyAttribute_RoofMaterial.class);
  }
  
  public PropertyAttribute_SprinkRetServ getPropertyAttribute_SprinkRetServ() {
    return getOrCreateProperty("PropertyAttribute_SprinkRetServ", "PropertyAttribute_SprinkRetServ", null, pcftest.PropertyAttributeInputSet.PropertyAttribute_SprinkRetServ.class);
  }
  
  public PropertyAttribute_SprinklerType getPropertyAttribute_SprinklerType() {
    return getOrCreateProperty("PropertyAttribute_SprinklerType", "PropertyAttribute_SprinklerType", null, pcftest.PropertyAttributeInputSet.PropertyAttribute_SprinklerType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossLocation_Hazard extends SelectElement {
    public LossLocation_Hazard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(YesNo arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public YesNo getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(YesNo arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossLocation_Mold extends SelectElement {
    public LossLocation_Mold(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(YesNo arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public YesNo getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(YesNo arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OccupancyType extends SelectElement {
    public OccupancyType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.OccupancyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.OccupancyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.OccupancyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.OccupancyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyAttribute_ClassType extends SelectElement {
    public PropertyAttribute_ClassType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClassType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClassType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClassType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClassType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyAttribute_ExtWallMat extends SelectElement {
    public PropertyAttribute_ExtWallMat(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ExtWallMat arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ExtWallMat getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExtWallMat.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ExtWallMat arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyAttribute_LossArea extends SelectElement {
    public PropertyAttribute_LossArea(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossArea arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossArea getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossArea.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossArea arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyAttribute_RoofMaterial extends SelectElement {
    public PropertyAttribute_RoofMaterial(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(RoofMaterial arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public RoofMaterial getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RoofMaterial.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(RoofMaterial arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyAttribute_SprinkRetServ extends SelectElement {
    public PropertyAttribute_SprinkRetServ(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SprinkRetServ arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SprinkRetServ getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SprinkRetServ.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SprinkRetServ arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/PropertyAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyAttribute_SprinklerType extends SelectElement {
    public PropertyAttribute_SprinklerType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SprinklerType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SprinklerType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SprinklerType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SprinklerType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}