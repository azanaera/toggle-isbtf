package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_NewNoteWorksheet.FNOLWizard_NewNoteScreen;
import pcftest.FNOLWizard_NewNoteWorksheet.FNOLWizard_NewNoteScreen.NewClaimWizard_NewNoteWorksheet_CancelButton;
import pcftest.FNOLWizard_NewNoteWorksheet.FNOLWizard_NewNoteScreen.NewClaimWizard_NewNoteWorksheet_UpdateButton;
import pcftest.FNOLWizard_NewNoteWorksheet.FNOLWizard_NewNoteScreen._msgs;
import pcftest.FNOLWizard_NewNoteWorksheet.FNOLWizard_NewNoteWorksheet_UpLink;
import pcftest.FNOLWizard_NewNoteWorksheet._Paging;
import pcftest.FNOLWizard_NewNoteWorksheet.__crumb__;
import pcftest.FNOLWizard_NewNoteWorksheet.wsTabBar;
import pcftest.FNOLWizard_NewNoteWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewNoteWorksheet extends PCFLocation {
  public final static String CHECKSUM = "f1e3d42b44034464c24d3ff7873ac018";
  
  public FNOLWizard_NewNoteWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FNOLWizard_NewNoteWorksheet"));
  }
  
  public FNOLWizard_NewNoteScreen getFNOLWizard_NewNoteScreen() {
    return getOrCreateProperty("FNOLWizard_NewNoteScreen", "FNOLWizard_NewNoteScreen", null, pcftest.FNOLWizard_NewNoteWorksheet.FNOLWizard_NewNoteScreen.class);
  }
  
  public FNOLWizard_NewNoteWorksheet_UpLink getFNOLWizard_NewNoteWorksheet_UpLink() {
    return getOrCreateProperty("FNOLWizard_NewNoteWorksheet_UpLink", "FNOLWizard_NewNoteWorksheet_UpLink", null, pcftest.FNOLWizard_NewNoteWorksheet.FNOLWizard_NewNoteWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FNOLWizard_NewNoteWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FNOLWizard_NewNoteWorksheet.__crumb__.class);
  }
  
  public FNOLWizard get_parent() {
    return getOrCreateProperty("_parent", pcftest.FNOLWizard.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.FNOLWizard_NewNoteWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_NewNoteScreen extends PCFElement {
    public FNOLWizard_NewNoteScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DocumentNoteDV getDocumentNoteDV() {
      return getOrCreateProperty("DocumentNoteDV", "DocumentNoteDV", null, pcftest.DocumentNoteDV.class);
    }
    
    public NewClaimWizard_NewNoteWorksheet_CancelButton getNewClaimWizard_NewNoteWorksheet_CancelButton() {
      return getOrCreateProperty("NewClaimWizard_NewNoteWorksheet_CancelButton", "NewClaimWizard_NewNoteWorksheet_CancelButton", null, pcftest.FNOLWizard_NewNoteWorksheet.FNOLWizard_NewNoteScreen.NewClaimWizard_NewNoteWorksheet_CancelButton.class);
    }
    
    public NewClaimWizard_NewNoteWorksheet_UpdateButton getNewClaimWizard_NewNoteWorksheet_UpdateButton() {
      return getOrCreateProperty("NewClaimWizard_NewNoteWorksheet_UpdateButton", "NewClaimWizard_NewNoteWorksheet_UpdateButton", null, pcftest.FNOLWizard_NewNoteWorksheet.FNOLWizard_NewNoteScreen.NewClaimWizard_NewNoteWorksheet_UpdateButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_NewNoteWorksheet.FNOLWizard_NewNoteScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimWizard_NewNoteWorksheet_CancelButton extends ClickableActionElement {
      public NewClaimWizard_NewNoteWorksheet_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimWizard_NewNoteWorksheet_UpdateButton extends ClickableActionElement {
      public NewClaimWizard_NewNoteWorksheet_UpdateButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_NewNoteWorksheet_UpLink extends ClickableActionElement {
    public FNOLWizard_NewNoteWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.FNOLWizard_NewNoteWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class wsTab extends ClickableActionElement {
      public wsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}