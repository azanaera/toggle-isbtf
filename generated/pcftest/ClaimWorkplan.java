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
import pcftest.ClaimWorkplan.ClaimWorkplanScreen;
import pcftest.ClaimWorkplan.ClaimWorkplanScreen.ClaimWorkplan_ApproveButton;
import pcftest.ClaimWorkplan.ClaimWorkplanScreen.ClaimWorkplan_AssignButton;
import pcftest.ClaimWorkplan.ClaimWorkplanScreen.ClaimWorkplan_CompleteButton;
import pcftest.ClaimWorkplan.ClaimWorkplanScreen.ClaimWorkplan_RejectButton;
import pcftest.ClaimWorkplan.ClaimWorkplanScreen.ClaimWorkplan_SkipButton;
import pcftest.ClaimWorkplan.ClaimWorkplanScreen._msgs;
import pcftest.ClaimWorkplan.ClaimWorkplan_UpLink;
import pcftest.ClaimWorkplan._Paging;
import pcftest.ClaimWorkplan.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimWorkplan extends PCFLocation {
  public final static String CHECKSUM = "e62c9b9e321d18339b3b4dd277ee9530";
  
  public ClaimWorkplan(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimWorkplan"));
  }
  
  public ClaimWorkplanScreen getClaimWorkplanScreen() {
    return getOrCreateProperty("ClaimWorkplanScreen", "ClaimWorkplanScreen", null, pcftest.ClaimWorkplan.ClaimWorkplanScreen.class);
  }
  
  public ClaimWorkplan_UpLink getClaimWorkplan_UpLink() {
    return getOrCreateProperty("ClaimWorkplan_UpLink", "ClaimWorkplan_UpLink", null, pcftest.ClaimWorkplan.ClaimWorkplan_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimWorkplan._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimWorkplan.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimWorkplanScreen extends PCFElement {
    public ClaimWorkplanScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimWorkplan_ApproveButton getClaimWorkplan_ApproveButton() {
      return getOrCreateProperty("ClaimWorkplan_ApproveButton", "ClaimWorkplan_ApproveButton", null, pcftest.ClaimWorkplan.ClaimWorkplanScreen.ClaimWorkplan_ApproveButton.class);
    }
    
    public ClaimWorkplan_AssignButton getClaimWorkplan_AssignButton() {
      return getOrCreateProperty("ClaimWorkplan_AssignButton", "ClaimWorkplan_AssignButton", null, pcftest.ClaimWorkplan.ClaimWorkplanScreen.ClaimWorkplan_AssignButton.class);
    }
    
    public ClaimWorkplan_CompleteButton getClaimWorkplan_CompleteButton() {
      return getOrCreateProperty("ClaimWorkplan_CompleteButton", "ClaimWorkplan_CompleteButton", null, pcftest.ClaimWorkplan.ClaimWorkplanScreen.ClaimWorkplan_CompleteButton.class);
    }
    
    public ClaimWorkplan_RejectButton getClaimWorkplan_RejectButton() {
      return getOrCreateProperty("ClaimWorkplan_RejectButton", "ClaimWorkplan_RejectButton", null, pcftest.ClaimWorkplan.ClaimWorkplanScreen.ClaimWorkplan_RejectButton.class);
    }
    
    public ClaimWorkplan_SkipButton getClaimWorkplan_SkipButton() {
      return getOrCreateProperty("ClaimWorkplan_SkipButton", "ClaimWorkplan_SkipButton", null, pcftest.ClaimWorkplan.ClaimWorkplanScreen.ClaimWorkplan_SkipButton.class);
    }
    
    public WorkplanLV getWorkplanLV() {
      return getOrCreateProperty("WorkplanLV", "WorkplanLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkplanLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimWorkplan.ClaimWorkplanScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimWorkplan_ApproveButton extends ClickableActionElement {
      public ClaimWorkplan_ApproveButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimWorkplan_AssignButton extends ClickableActionElement {
      public ClaimWorkplan_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimWorkplan_CompleteButton extends ClickableActionElement {
      public ClaimWorkplan_CompleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimWorkplan_RejectButton extends ClickableActionElement {
      public ClaimWorkplan_RejectButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimWorkplan_SkipButton extends ClickableActionElement {
      public ClaimWorkplan_SkipButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimWorkplan_UpLink extends ClickableActionElement {
    public ClaimWorkplan_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/workplan/ClaimWorkplan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}