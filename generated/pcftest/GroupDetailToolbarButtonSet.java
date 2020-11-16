package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GroupDetailToolbarButtonSet.Cancel;
import pcftest.GroupDetailToolbarButtonSet.Edit;
import pcftest.GroupDetailToolbarButtonSet.GroupDetailPage_RegionsCard_DeleteButton;
import pcftest.GroupDetailToolbarButtonSet.Update;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/groups/GroupDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupDetailToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "113140ac3173ab9a2c379221efd4d387";
  
  public GroupDetailToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.GroupDetailToolbarButtonSet.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.GroupDetailToolbarButtonSet.Edit.class);
  }
  
  public GroupDetailPage_RegionsCard_DeleteButton getGroupDetailPage_RegionsCard_DeleteButton() {
    return getOrCreateProperty("GroupDetailPage_RegionsCard_DeleteButton", "GroupDetailPage_RegionsCard_DeleteButton", null, pcftest.GroupDetailToolbarButtonSet.GroupDetailPage_RegionsCard_DeleteButton.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.GroupDetailToolbarButtonSet.Update.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupDetailPage_RegionsCard_DeleteButton extends ClickableActionElement {
    public GroupDetailPage_RegionsCard_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}