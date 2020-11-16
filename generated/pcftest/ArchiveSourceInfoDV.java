package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ArchiveSourceInfoDV.delete;
import pcftest.ArchiveSourceInfoDV.restore;
import pcftest.ArchiveSourceInfoDV.store;
import typekey.ArchiveSourceStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ArchiveSourceInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveSourceInfoDV extends DetailViewElement {
  public final static String CHECKSUM = "84dc7e6998a862f5e003feaad9b7c081";
  
  public ArchiveSourceInfoDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getasof() {
    return getOrCreateProperty("asof", "asof", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public delete getdelete() {
    return getOrCreateProperty("delete", "delete", null, pcftest.ArchiveSourceInfoDV.delete.class);
  }
  
  public restore getrestore() {
    return getOrCreateProperty("restore", "restore", null, pcftest.ArchiveSourceInfoDV.restore.class);
  }
  
  public store getstore() {
    return getOrCreateProperty("store", "store", null, pcftest.ArchiveSourceInfoDV.store.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveSourceInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class delete extends SelectElement {
    public delete(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ArchiveSourceStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ArchiveSourceStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ArchiveSourceStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ArchiveSourceStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveSourceInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class restore extends SelectElement {
    public restore(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ArchiveSourceStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ArchiveSourceStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ArchiveSourceStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ArchiveSourceStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveSourceInfoDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class store extends SelectElement {
    public store(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ArchiveSourceStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ArchiveSourceStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ArchiveSourceStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ArchiveSourceStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}