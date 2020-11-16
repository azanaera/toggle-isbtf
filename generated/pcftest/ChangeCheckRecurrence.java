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
import pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen;
import pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.Cancel;
import pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.ChangeCheckRecurrence_ResetButton;
import pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.ChangeCheckRecurrence_SaveButton;
import pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.Edit;
import pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.Update;
import pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen._msgs;
import pcftest.ChangeCheckRecurrence.ChangeCheckRecurrence_UpLink;
import pcftest.ChangeCheckRecurrence._Paging;
import pcftest.ChangeCheckRecurrence.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ChangeCheckRecurrence extends PCFLocation {
  public final static String CHECKSUM = "3e2e67e0baad063b856479e0fe87de0c";
  
  public ChangeCheckRecurrence(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ChangeCheckRecurrence"));
  }
  
  public ChangeCheckRecurrenceScreen getChangeCheckRecurrenceScreen() {
    return getOrCreateProperty("ChangeCheckRecurrenceScreen", "ChangeCheckRecurrenceScreen", null, pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.class);
  }
  
  public ChangeCheckRecurrence_UpLink getChangeCheckRecurrence_UpLink() {
    return getOrCreateProperty("ChangeCheckRecurrence_UpLink", "ChangeCheckRecurrence_UpLink", null, pcftest.ChangeCheckRecurrence.ChangeCheckRecurrence_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ChangeCheckRecurrence._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ChangeCheckRecurrence.__crumb__.class);
  }
  
  public ClaimFinancialsChecksDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsChecksDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChangeCheckRecurrenceScreen extends PCFElement {
    public ChangeCheckRecurrenceScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.Cancel.class);
    }
    
    public ChangeCheckRecurrence_ResetButton getChangeCheckRecurrence_ResetButton() {
      return getOrCreateProperty("ChangeCheckRecurrence_ResetButton", "ChangeCheckRecurrence_ResetButton", null, pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.ChangeCheckRecurrence_ResetButton.class);
    }
    
    public ChangeCheckRecurrence_SaveButton getChangeCheckRecurrence_SaveButton() {
      return getOrCreateProperty("ChangeCheckRecurrence_SaveButton", "ChangeCheckRecurrence_SaveButton", null, pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.ChangeCheckRecurrence_SaveButton.class);
    }
    
    public CheckRecurrenceDV getCheckRecurrenceDV() {
      return getOrCreateProperty("CheckRecurrenceDV", "CheckRecurrenceDV", null, pcftest.CheckRecurrenceDV.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ChangeCheckRecurrence.ChangeCheckRecurrenceScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ChangeCheckRecurrence_ResetButton extends ClickableActionElement {
      public ChangeCheckRecurrence_ResetButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ChangeCheckRecurrence_SaveButton extends ClickableActionElement {
      public ChangeCheckRecurrence_SaveButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChangeCheckRecurrence_UpLink extends ClickableActionElement {
    public ChangeCheckRecurrence_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}