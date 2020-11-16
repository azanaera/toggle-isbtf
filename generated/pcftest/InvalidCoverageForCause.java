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
import pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen;
import pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.Add;
import pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.Cancel;
import pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.Edit;
import pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.Remove;
import pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.Update;
import pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen._msgs;
import pcftest.InvalidCoverageForCause.InvalidCoverageForCause_UpLink;
import pcftest.InvalidCoverageForCause._Paging;
import pcftest.InvalidCoverageForCause.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InvalidCoverageForCause extends PCFLocation {
  public final static String CHECKSUM = "f47fc1813370f3848ecb1e8a938f3e64";
  
  public InvalidCoverageForCause(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InvalidCoverageForCause"));
  }
  
  public InvalidCoverageForCauseScreen getInvalidCoverageForCauseScreen() {
    return getOrCreateProperty("InvalidCoverageForCauseScreen", "InvalidCoverageForCauseScreen", null, pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.class);
  }
  
  public InvalidCoverageForCause_UpLink getInvalidCoverageForCause_UpLink() {
    return getOrCreateProperty("InvalidCoverageForCause_UpLink", "InvalidCoverageForCause_UpLink", null, pcftest.InvalidCoverageForCause.InvalidCoverageForCause_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InvalidCoverageForCause._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InvalidCoverageForCause.__crumb__.class);
  }
  
  public CoverageDetermination get_parent() {
    return getOrCreateProperty("_parent", pcftest.CoverageDetermination.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvalidCoverageForCauseScreen extends PCFElement {
    public InvalidCoverageForCauseScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.Add.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.Edit.class);
    }
    
    public InvalidCoverageForCauseLV getInvalidCoverageForCauseLV() {
      return getOrCreateProperty("InvalidCoverageForCauseLV", "InvalidCoverageForCauseLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.InvalidCoverageForCauseLV.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.Remove.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InvalidCoverageForCause.InvalidCoverageForCauseScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvalidCoverageForCause_UpLink extends ClickableActionElement {
    public InvalidCoverageForCause_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForCause.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}