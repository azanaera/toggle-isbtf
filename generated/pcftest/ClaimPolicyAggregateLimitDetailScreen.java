package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimPolicyAggregateLimitDetailScreen.Cancel;
import pcftest.ClaimPolicyAggregateLimitDetailScreen.ClaimPolicyAggregateLimitDetailScreen_EditButton;
import pcftest.ClaimPolicyAggregateLimitDetailScreen.Edit;
import pcftest.ClaimPolicyAggregateLimitDetailScreen.Update;
import pcftest.ClaimPolicyAggregateLimitDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyAggregateLimitDetailScreen extends PCFElement {
  public final static String CHECKSUM = "f981c0928bcd190437f4123ae430bf3b";
  
  public ClaimPolicyAggregateLimitDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AggregateLimitDetailDV getAggregateLimitDetailDV() {
    return getOrCreateProperty("AggregateLimitDetailDV", "AggregateLimitDetailDV", null, pcftest.AggregateLimitDetailDV.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimPolicyAggregateLimitDetailScreen.Cancel.class);
  }
  
  public ClaimPolicyAggregateLimitDetailScreen_EditButton getClaimPolicyAggregateLimitDetailScreen_EditButton() {
    return getOrCreateProperty("ClaimPolicyAggregateLimitDetailScreen_EditButton", "ClaimPolicyAggregateLimitDetailScreen_EditButton", null, pcftest.ClaimPolicyAggregateLimitDetailScreen.ClaimPolicyAggregateLimitDetailScreen_EditButton.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimPolicyAggregateLimitDetailScreen.Edit.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.ClaimPolicyAggregateLimitDetailScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyAggregateLimitDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyAggregateLimitDetailScreen_EditButton extends ClickableActionElement {
    public ClaimPolicyAggregateLimitDetailScreen_EditButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}