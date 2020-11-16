package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.StartFullUpgradePopup.StartFullUpgradePopup_UpLink;
import pcftest.StartFullUpgradePopup.StartFullUpgradeScreen;
import pcftest.StartFullUpgradePopup.StartFullUpgradeScreen.Cancel;
import pcftest.StartFullUpgradePopup.StartFullUpgradeScreen.Edit;
import pcftest.StartFullUpgradePopup.StartFullUpgradeScreen.StartFull;
import pcftest.StartFullUpgradePopup.StartFullUpgradeScreen.Update;
import pcftest.StartFullUpgradePopup.StartFullUpgradeScreen._msgs;
import pcftest.StartFullUpgradePopup._Paging;
import pcftest.StartFullUpgradePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StartFullUpgradePopup extends PCFLocation {
  public final static String CHECKSUM = "6ed2faae3c1e5ecdbf28506042053b63";
  
  public StartFullUpgradePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("StartFullUpgradePopup"));
  }
  
  public StartFullUpgradePopup_UpLink getStartFullUpgradePopup_UpLink() {
    return getOrCreateProperty("StartFullUpgradePopup_UpLink", "StartFullUpgradePopup_UpLink", null, pcftest.StartFullUpgradePopup.StartFullUpgradePopup_UpLink.class);
  }
  
  public StartFullUpgradeScreen getStartFullUpgradeScreen() {
    return getOrCreateProperty("StartFullUpgradeScreen", "StartFullUpgradeScreen", null, pcftest.StartFullUpgradePopup.StartFullUpgradeScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.StartFullUpgradePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.StartFullUpgradePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartFullUpgradePopup_UpLink extends ClickableActionElement {
    public StartFullUpgradePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartFullUpgradeScreen extends PCFElement {
    public StartFullUpgradeScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.StartFullUpgradePopup.StartFullUpgradeScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.StartFullUpgradePopup.StartFullUpgradeScreen.Edit.class);
    }
    
    public StartFull getStartFull() {
      return getOrCreateProperty("StartFull", "StartFull", null, pcftest.StartFullUpgradePopup.StartFullUpgradeScreen.StartFull.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.StartFullUpgradePopup.StartFullUpgradeScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.StartFullUpgradePopup.StartFullUpgradeScreen._msgs.class);
    }
    
    public ValueElement getbackup() {
      return getOrCreateProperty("backup", "backup", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getcomplete() {
      return getOrCreateProperty("complete", "complete", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getdeploy() {
      return getOrCreateProperty("deploy", "deploy", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getshutdown() {
      return getOrCreateProperty("shutdown", "shutdown", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getstartBatch() {
      return getOrCreateProperty("startBatch", "startBatch", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getstartOthers() {
      return getOrCreateProperty("startOthers", "startOthers", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement gettoProceed() {
      return getOrCreateProperty("toProceed", "toProceed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartFull extends ClickableActionElement {
      public StartFull(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/StartFullUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}