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
import pcftest.NewNoteWorksheet.NewNoteScreen;
import pcftest.NewNoteWorksheet.NewNoteScreen.Cancel;
import pcftest.NewNoteWorksheet.NewNoteScreen.Edit;
import pcftest.NewNoteWorksheet.NewNoteScreen.NewNoteWorksheet_AddDocumentButton;
import pcftest.NewNoteWorksheet.NewNoteScreen.NewNoteWorksheet_UseTemplateButton;
import pcftest.NewNoteWorksheet.NewNoteScreen.Update;
import pcftest.NewNoteWorksheet.NewNoteScreen._msgs;
import pcftest.NewNoteWorksheet.NewNoteWorksheet_UpLink;
import pcftest.NewNoteWorksheet._Paging;
import pcftest.NewNoteWorksheet.__crumb__;
import pcftest.NewNoteWorksheet.wsTabBar;
import pcftest.NewNoteWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewNoteWorksheet extends PCFLocation {
  public final static String CHECKSUM = "f77e8f9cbc9829b934e950b244bf8fcf";
  
  public NewNoteWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewNoteWorksheet"));
  }
  
  public NewNoteScreen getNewNoteScreen() {
    return getOrCreateProperty("NewNoteScreen", "NewNoteScreen", null, pcftest.NewNoteWorksheet.NewNoteScreen.class);
  }
  
  public NewNoteWorksheet_UpLink getNewNoteWorksheet_UpLink() {
    return getOrCreateProperty("NewNoteWorksheet_UpLink", "NewNoteWorksheet_UpLink", null, pcftest.NewNoteWorksheet.NewNoteWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewNoteWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewNoteWorksheet.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.NewNoteWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewNoteScreen extends PCFElement {
    public NewNoteScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewNoteWorksheet.NewNoteScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewNoteWorksheet.NewNoteScreen.Edit.class);
    }
    
    public NewNoteWorksheet_AddDocumentButton getNewNoteWorksheet_AddDocumentButton() {
      return getOrCreateProperty("NewNoteWorksheet_AddDocumentButton", "NewNoteWorksheet_AddDocumentButton", null, pcftest.NewNoteWorksheet.NewNoteScreen.NewNoteWorksheet_AddDocumentButton.class);
    }
    
    public NewNoteWorksheet_UseTemplateButton getNewNoteWorksheet_UseTemplateButton() {
      return getOrCreateProperty("NewNoteWorksheet_UseTemplateButton", "NewNoteWorksheet_UseTemplateButton", null, pcftest.NewNoteWorksheet.NewNoteScreen.NewNoteWorksheet_UseTemplateButton.class);
    }
    
    public NoteDetailDV getNoteDetailDV() {
      return getOrCreateProperty("NoteDetailDV", "NoteDetailDV", null, pcftest.NoteDetailDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewNoteWorksheet.NewNoteScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewNoteWorksheet.NewNoteScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewNoteWorksheet_AddDocumentButton extends ClickableActionElement {
      public NewNoteWorksheet_AddDocumentButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickExistingDocumentPopup click() {
        return clickThis(pcftest.PickExistingDocumentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewNoteWorksheet_UseTemplateButton extends ClickableActionElement {
      public NewNoteWorksheet_UseTemplateButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickNoteTemplatePopup click() {
        return clickThis(pcftest.PickNoteTemplatePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewNoteWorksheet_UpLink extends ClickableActionElement {
    public NewNoteWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.NewNoteWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/NewNoteWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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