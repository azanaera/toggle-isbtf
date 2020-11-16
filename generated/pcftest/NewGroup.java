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
import pcftest.NewGroup.NewGroupDetailScreen;
import pcftest.NewGroup.NewGroupDetailScreen.Cancel;
import pcftest.NewGroup.NewGroupDetailScreen.Edit;
import pcftest.NewGroup.NewGroupDetailScreen.Update;
import pcftest.NewGroup.NewGroupDetailScreen._msgs;
import pcftest.NewGroup.NewGroup_UpLink;
import pcftest.NewGroup._Paging;
import pcftest.NewGroup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/newgroup/NewGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewGroup extends PCFLocation {
  public final static String CHECKSUM = "59f8fd53129ddb6b840d39bfed39c97f";
  
  public NewGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewGroup"));
  }
  
  public NewGroupDetailScreen getNewGroupDetailScreen() {
    return getOrCreateProperty("NewGroupDetailScreen", "NewGroupDetailScreen", null, pcftest.NewGroup.NewGroupDetailScreen.class);
  }
  
  public NewGroup_UpLink getNewGroup_UpLink() {
    return getOrCreateProperty("NewGroup_UpLink", "NewGroup_UpLink", null, pcftest.NewGroup.NewGroup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewGroup.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/newgroup/NewGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewGroupDetailScreen extends PCFElement {
    public NewGroupDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewGroup.NewGroupDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewGroup.NewGroupDetailScreen.Edit.class);
    }
    
    public NewGroupDetailDV getNewGroupDetailDV() {
      return getOrCreateProperty("NewGroupDetailDV", "NewGroupDetailDV", null, pcftest.NewGroupDetailDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewGroup.NewGroupDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewGroup.NewGroupDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newgroup/NewGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newgroup/NewGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newgroup/NewGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/newgroup/NewGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/newgroup/NewGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewGroup_UpLink extends ClickableActionElement {
    public NewGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/newgroup/NewGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/newgroup/NewGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}