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
import pcftest.ReissueCheck.ReissueCheckScreen;
import pcftest.ReissueCheck.ReissueCheckScreen.Cancel;
import pcftest.ReissueCheck.ReissueCheckScreen.Edit;
import pcftest.ReissueCheck.ReissueCheckScreen.ReissueCheck_StopAndReissueButton;
import pcftest.ReissueCheck.ReissueCheckScreen.ReissueCheck_VoidAndReissueButton;
import pcftest.ReissueCheck.ReissueCheckScreen.Update;
import pcftest.ReissueCheck.ReissueCheckScreen._msgs;
import pcftest.ReissueCheck.ReissueCheck_UpLink;
import pcftest.ReissueCheck._Paging;
import pcftest.ReissueCheck.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReissueCheck extends PCFLocation {
  public final static String CHECKSUM = "b2557862410e56e0f0892865f4ed1440";
  
  public ReissueCheck(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReissueCheck"));
  }
  
  public ReissueCheckScreen getReissueCheckScreen() {
    return getOrCreateProperty("ReissueCheckScreen", "ReissueCheckScreen", null, pcftest.ReissueCheck.ReissueCheckScreen.class);
  }
  
  public ReissueCheck_UpLink getReissueCheck_UpLink() {
    return getOrCreateProperty("ReissueCheck_UpLink", "ReissueCheck_UpLink", null, pcftest.ReissueCheck.ReissueCheck_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReissueCheck._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReissueCheck.__crumb__.class);
  }
  
  public ClaimFinancialsChecksDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsChecksDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReissueCheckScreen extends PCFElement {
    public ReissueCheckScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ReissueCheck.ReissueCheckScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ReissueCheck.ReissueCheckScreen.Edit.class);
    }
    
    public ReissueCheckDV getReissueCheckDV() {
      return getOrCreateProperty("ReissueCheckDV", "ReissueCheckDV", null, pcftest.ReissueCheckDV.class);
    }
    
    public ReissueCheck_StopAndReissueButton getReissueCheck_StopAndReissueButton() {
      return getOrCreateProperty("ReissueCheck_StopAndReissueButton", "ReissueCheck_StopAndReissueButton", null, pcftest.ReissueCheck.ReissueCheckScreen.ReissueCheck_StopAndReissueButton.class);
    }
    
    public ReissueCheck_VoidAndReissueButton getReissueCheck_VoidAndReissueButton() {
      return getOrCreateProperty("ReissueCheck_VoidAndReissueButton", "ReissueCheck_VoidAndReissueButton", null, pcftest.ReissueCheck.ReissueCheckScreen.ReissueCheck_VoidAndReissueButton.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ReissueCheck.ReissueCheckScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ReissueCheck.ReissueCheckScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReissueCheck_StopAndReissueButton extends ClickableActionElement {
      public ReissueCheck_StopAndReissueButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReissueCheck_VoidAndReissueButton extends ClickableActionElement {
      public ReissueCheck_VoidAndReissueButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReissueCheck_UpLink extends ClickableActionElement {
    public ReissueCheck_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ReissueCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}