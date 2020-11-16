package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PickSavedFilePopup.Cancel;
import pcftest.PickSavedFilePopup.Edit;
import pcftest.PickSavedFilePopup.PickSavedFilePopup_UpLink;
import pcftest.PickSavedFilePopup.Update;
import pcftest.PickSavedFilePopup.ZipFile;
import pcftest.PickSavedFilePopup._Paging;
import pcftest.PickSavedFilePopup.__crumb__;
import pcftest.PickSavedFilePopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PickSavedFilePopup extends PCFLocation {
  public final static String CHECKSUM = "7d63f3913e3665a70001aa6da91d1780";
  
  public PickSavedFilePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PickSavedFilePopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.PickSavedFilePopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.PickSavedFilePopup.Edit.class);
  }
  
  public PickSavedFilePopup_UpLink getPickSavedFilePopup_UpLink() {
    return getOrCreateProperty("PickSavedFilePopup_UpLink", "PickSavedFilePopup_UpLink", null, pcftest.PickSavedFilePopup.PickSavedFilePopup_UpLink.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.PickSavedFilePopup.Update.class);
  }
  
  public ZipFile getZipFile() {
    return getOrCreateProperty("ZipFile", "ZipFile", null, pcftest.PickSavedFilePopup.ZipFile.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PickSavedFilePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PickSavedFilePopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PickSavedFilePopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickSavedFilePopup_UpLink extends ClickableActionElement {
    public PickSavedFilePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ZipFile extends ValueElement {
    public ZipFile(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickSavedFilePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}