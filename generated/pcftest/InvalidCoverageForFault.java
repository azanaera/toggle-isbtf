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
import pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen;
import pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.Add;
import pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.Cancel;
import pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.Edit;
import pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.Remove;
import pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.Update;
import pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen._msgs;
import pcftest.InvalidCoverageForFault.InvalidCoverageForFault_UpLink;
import pcftest.InvalidCoverageForFault._Paging;
import pcftest.InvalidCoverageForFault.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InvalidCoverageForFault extends PCFLocation {
  public final static String CHECKSUM = "303ca1e722b06ed26804d0ae00fd8363";
  
  public InvalidCoverageForFault(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InvalidCoverageForFault"));
  }
  
  public InvalidCoverageForFaultScreen getInvalidCoverageForFaultScreen() {
    return getOrCreateProperty("InvalidCoverageForFaultScreen", "InvalidCoverageForFaultScreen", null, pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.class);
  }
  
  public InvalidCoverageForFault_UpLink getInvalidCoverageForFault_UpLink() {
    return getOrCreateProperty("InvalidCoverageForFault_UpLink", "InvalidCoverageForFault_UpLink", null, pcftest.InvalidCoverageForFault.InvalidCoverageForFault_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InvalidCoverageForFault._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InvalidCoverageForFault.__crumb__.class);
  }
  
  public CoverageDetermination get_parent() {
    return getOrCreateProperty("_parent", pcftest.CoverageDetermination.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvalidCoverageForFaultScreen extends PCFElement {
    public InvalidCoverageForFaultScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.Add.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.Edit.class);
    }
    
    public InvalidCoverageForFaultLV getInvalidCoverageForFaultLV() {
      return getOrCreateProperty("InvalidCoverageForFaultLV", "InvalidCoverageForFaultLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.InvalidCoverageForFaultLV.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.Remove.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InvalidCoverageForFault.InvalidCoverageForFaultScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvalidCoverageForFault_UpLink extends ClickableActionElement {
    public InvalidCoverageForFault_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/coverage/InvalidCoverageForFault.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}