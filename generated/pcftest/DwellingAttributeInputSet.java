package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DwellingAttributeInputSet.DwellingAttribute_ClassType;
import pcftest.DwellingAttributeInputSet.DwellingAttribute_ExtWallMat;
import pcftest.DwellingAttributeInputSet.DwellingAttribute_LossArea;
import pcftest.DwellingAttributeInputSet.DwellingAttribute_RoofMaterial;
import pcftest.DwellingAttributeInputSet.DwellingAttribute_SprinkRetServ;
import pcftest.DwellingAttributeInputSet.DwellingAttribute_SprinklerType;
import pcftest.DwellingAttributeInputSet.LossLocation_Hazard;
import pcftest.DwellingAttributeInputSet.LossLocation_Mold;
import typekey.ClassType;
import typekey.ExtWallMat;
import typekey.LossArea;
import typekey.RoofMaterial;
import typekey.SprinkRetServ;
import typekey.SprinklerType;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DwellingAttributeInputSet extends PCFElement {
  public final static String CHECKSUM = "71f4dba8d560aabc972b5dc67bb2748d";
  
  public DwellingAttributeInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DwellingAttribute_ClassType getDwellingAttribute_ClassType() {
    return getOrCreateProperty("DwellingAttribute_ClassType", "DwellingAttribute_ClassType", null, pcftest.DwellingAttributeInputSet.DwellingAttribute_ClassType.class);
  }
  
  public DwellingAttribute_ExtWallMat getDwellingAttribute_ExtWallMat() {
    return getOrCreateProperty("DwellingAttribute_ExtWallMat", "DwellingAttribute_ExtWallMat", null, pcftest.DwellingAttributeInputSet.DwellingAttribute_ExtWallMat.class);
  }
  
  public DwellingAttribute_LossArea getDwellingAttribute_LossArea() {
    return getOrCreateProperty("DwellingAttribute_LossArea", "DwellingAttribute_LossArea", null, pcftest.DwellingAttributeInputSet.DwellingAttribute_LossArea.class);
  }
  
  public ValueElement getDwellingAttribute_NumSprinkOper() {
    return getOrCreateProperty("DwellingAttribute_NumSprinkOper", "DwellingAttribute_NumSprinkOper", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_NumSprinkler() {
    return getOrCreateProperty("DwellingAttribute_NumSprinkler", "DwellingAttribute_NumSprinkler", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_NumStories() {
    return getOrCreateProperty("DwellingAttribute_NumStories", "DwellingAttribute_NumStories", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_NumberOfPeopleOnPolicy() {
    return getOrCreateProperty("DwellingAttribute_NumberOfPeopleOnPolicy", "DwellingAttribute_NumberOfPeopleOnPolicy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DwellingAttribute_RoofMaterial getDwellingAttribute_RoofMaterial() {
    return getOrCreateProperty("DwellingAttribute_RoofMaterial", "DwellingAttribute_RoofMaterial", null, pcftest.DwellingAttributeInputSet.DwellingAttribute_RoofMaterial.class);
  }
  
  public DwellingAttribute_SprinkRetServ getDwellingAttribute_SprinkRetServ() {
    return getOrCreateProperty("DwellingAttribute_SprinkRetServ", "DwellingAttribute_SprinkRetServ", null, pcftest.DwellingAttributeInputSet.DwellingAttribute_SprinkRetServ.class);
  }
  
  public DwellingAttribute_SprinklerType getDwellingAttribute_SprinklerType() {
    return getOrCreateProperty("DwellingAttribute_SprinklerType", "DwellingAttribute_SprinklerType", null, pcftest.DwellingAttributeInputSet.DwellingAttribute_SprinklerType.class);
  }
  
  public ValueElement getDwellingAttribute_YearsInHome() {
    return getOrCreateProperty("DwellingAttribute_YearsInHome", "DwellingAttribute_YearsInHome", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LossLocation_Hazard getLossLocation_Hazard() {
    return getOrCreateProperty("LossLocation_Hazard", "LossLocation_Hazard", null, pcftest.DwellingAttributeInputSet.LossLocation_Hazard.class);
  }
  
  public LossLocation_Mold getLossLocation_Mold() {
    return getOrCreateProperty("LossLocation_Mold", "LossLocation_Mold", null, pcftest.DwellingAttributeInputSet.LossLocation_Mold.class);
  }
  
  public pcftest.DwellingAttributeInputSet.OccupancyType getOccupancyType() {
    return getOrCreateProperty("OccupancyType", "OccupancyType", null, pcftest.DwellingAttributeInputSet.OccupancyType.class);
  }
  
  public ValueElement getPropertySize() {
    return getOrCreateProperty("PropertySize", "PropertySize", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getYearBuilt() {
    return getOrCreateProperty("YearBuilt", "YearBuilt", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingAttribute_ClassType extends SelectElement {
    public DwellingAttribute_ClassType(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingAttribute_ExtWallMat extends SelectElement {
    public DwellingAttribute_ExtWallMat(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingAttribute_LossArea extends SelectElement {
    public DwellingAttribute_LossArea(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingAttribute_RoofMaterial extends SelectElement {
    public DwellingAttribute_RoofMaterial(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingAttribute_SprinkRetServ extends SelectElement {
    public DwellingAttribute_SprinkRetServ(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingAttribute_SprinklerType extends SelectElement {
    public DwellingAttribute_SprinklerType(ISmokeTest helper, PCFElementId componentId)  {
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingAttributeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}