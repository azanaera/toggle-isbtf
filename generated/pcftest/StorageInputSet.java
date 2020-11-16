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
import pcftest.StorageInputSet.StorageLocationState;
import typekey.State;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/generalstatus/StorageInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StorageInputSet extends PCFElement {
  public final static String CHECKSUM = "66e6cadb05d61e23c41b74d412594046";
  
  public StorageInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getDateShippedToStorage() {
    return getOrCreateProperty("DateShippedToStorage", "DateShippedToStorage", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getStorageBarCodeNumber() {
    return getOrCreateProperty("StorageBarCodeNumber", "StorageBarCodeNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStorageBoxNumber() {
    return getOrCreateProperty("StorageBoxNumber", "StorageBoxNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.StorageInputSet.StorageCategory getStorageCategory() {
    return getOrCreateProperty("StorageCategory", "StorageCategory", null, pcftest.StorageInputSet.StorageCategory.class);
  }
  
  public StorageLocationState getStorageLocationState() {
    return getOrCreateProperty("StorageLocationState", "StorageLocationState", null, pcftest.StorageInputSet.StorageLocationState.class);
  }
  
  public ValueElement getStorageNotes() {
    return getOrCreateProperty("StorageNotes", "StorageNotes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.StorageInputSet.StorageType getStorageType() {
    return getOrCreateProperty("StorageType", "StorageType", null, pcftest.StorageInputSet.StorageType.class);
  }
  
  public ValueElement getStorageVolumes() {
    return getOrCreateProperty("StorageVolumes", "StorageVolumes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/generalstatus/StorageInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StorageCategory extends SelectElement {
    public StorageCategory(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.StorageCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.StorageCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.StorageCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.StorageCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/generalstatus/StorageInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StorageLocationState extends SelectElement {
    public StorageLocationState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(State arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public State getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(State arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/generalstatus/StorageInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StorageType extends SelectElement {
    public StorageType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.StorageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.StorageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.StorageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.StorageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}