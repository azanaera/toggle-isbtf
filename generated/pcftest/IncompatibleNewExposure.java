package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen;
import pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.Add;
import pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.Cancel;
import pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.Edit;
import pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.Remove;
import pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.Update;
import pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen._msgs;
import pcftest.IncompatibleNewExposure.IncompatibleNewExposure_UpLink;
import pcftest.IncompatibleNewExposure._Paging;
import pcftest.IncompatibleNewExposure.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class IncompatibleNewExposure extends PCFLocation {
  public final static String CHECKSUM = "607931c90e72ddb5f744644765b7e49c";
  
  public IncompatibleNewExposure(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("IncompatibleNewExposure"));
  }
  
  public IncompatibleNewExposureScreen getIncompatibleNewExposureScreen() {
    return getOrCreateProperty("IncompatibleNewExposureScreen", "IncompatibleNewExposureScreen", null, pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.class);
  }
  
  public IncompatibleNewExposure_UpLink getIncompatibleNewExposure_UpLink() {
    return getOrCreateProperty("IncompatibleNewExposure_UpLink", "IncompatibleNewExposure_UpLink", null, pcftest.IncompatibleNewExposure.IncompatibleNewExposure_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.IncompatibleNewExposure._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.IncompatibleNewExposure.__crumb__.class);
  }
  
  public CoverageDetermination get_parent() {
    return getOrCreateProperty("_parent", pcftest.CoverageDetermination.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncompatibleNewExposureScreen extends PCFElement {
    public IncompatibleNewExposureScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.Add.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.Edit.class);
    }
    
    public IncompatibleNewExposureLV getIncompatibleNewExposureLV() {
      return getOrCreateProperty("IncompatibleNewExposureLV", "IncompatibleNewExposureLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IncompatibleNewExposureLV.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.Remove.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.IncompatibleNewExposure.IncompatibleNewExposureScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncompatibleNewExposure_UpLink extends ClickableActionElement {
    public IncompatibleNewExposure_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/IncompatibleNewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}