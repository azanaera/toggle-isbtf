package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.StatusTransitionToolbarButtonSet.Cancel;
import pcftest.StatusTransitionToolbarButtonSet.DeleteDraft;
import pcftest.StatusTransitionToolbarButtonSet.DeleteWip;
import pcftest.StatusTransitionToolbarButtonSet.Deploy;
import pcftest.StatusTransitionToolbarButtonSet.Edit;
import pcftest.StatusTransitionToolbarButtonSet.EnableDisableToggle;
import pcftest.StatusTransitionToolbarButtonSet.PromoteToApproved;
import pcftest.StatusTransitionToolbarButtonSet.PromoteToStaged;
import pcftest.StatusTransitionToolbarButtonSet.Revert;
import pcftest.StatusTransitionToolbarButtonSet.Update;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StatusTransitionToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "d7c0e04fcdab3f0a32f1b6065f675cc1";
  
  public StatusTransitionToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.StatusTransitionToolbarButtonSet.Cancel.class);
  }
  
  public DeleteDraft getDeleteDraft() {
    return getOrCreateProperty("DeleteDraft", "DeleteDraft", null, pcftest.StatusTransitionToolbarButtonSet.DeleteDraft.class);
  }
  
  public DeleteWip getDeleteWip() {
    return getOrCreateProperty("DeleteWip", "DeleteWip", null, pcftest.StatusTransitionToolbarButtonSet.DeleteWip.class);
  }
  
  public Deploy getDeploy() {
    return getOrCreateProperty("Deploy", "Deploy", null, pcftest.StatusTransitionToolbarButtonSet.Deploy.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.StatusTransitionToolbarButtonSet.Edit.class);
  }
  
  public EnableDisableToggle getEnableDisableToggle() {
    return getOrCreateProperty("EnableDisableToggle", "EnableDisableToggle", null, pcftest.StatusTransitionToolbarButtonSet.EnableDisableToggle.class);
  }
  
  public PromoteToApproved getPromoteToApproved() {
    return getOrCreateProperty("PromoteToApproved", "PromoteToApproved", null, pcftest.StatusTransitionToolbarButtonSet.PromoteToApproved.class);
  }
  
  public PromoteToStaged getPromoteToStaged() {
    return getOrCreateProperty("PromoteToStaged", "PromoteToStaged", null, pcftest.StatusTransitionToolbarButtonSet.PromoteToStaged.class);
  }
  
  public Revert getRevert() {
    return getOrCreateProperty("Revert", "Revert", null, pcftest.StatusTransitionToolbarButtonSet.Revert.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.StatusTransitionToolbarButtonSet.Update.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteDraft extends ClickableActionElement {
    public DeleteDraft(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteWip extends ClickableActionElement {
    public DeleteWip(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Deploy extends ClickableActionElement {
    public Deploy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EnableDisableToggle extends ClickableActionElement {
    public EnableDisableToggle(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PromoteToApproved extends ClickableActionElement {
    public PromoteToApproved(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PromoteToStaged extends ClickableActionElement {
    public PromoteToStaged(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Revert extends ClickableActionElement {
    public Revert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}