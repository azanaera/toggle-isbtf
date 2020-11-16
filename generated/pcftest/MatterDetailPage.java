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
import pcftest.MatterDetailPage.MatterDetailPage_UpLink;
import pcftest.MatterDetailPage.MatterDetailScreen;
import pcftest.MatterDetailPage.MatterDetailScreen.BudgetLineCardDVTab;
import pcftest.MatterDetailPage.MatterDetailScreen.BudgetLinesLV;
import pcftest.MatterDetailPage.MatterDetailScreen.BudgetLinesLV.EditableBudgetLinesLV_tb;
import pcftest.MatterDetailPage.MatterDetailScreen.BudgetLinesLV.EditableBudgetLinesLV_tb.Add;
import pcftest.MatterDetailPage.MatterDetailScreen.BudgetLinesLV.EditableBudgetLinesLV_tb.AddAllBudgetLines;
import pcftest.MatterDetailPage.MatterDetailScreen.BudgetLinesLV.EditableBudgetLinesLV_tb.Remove;
import pcftest.MatterDetailPage.MatterDetailScreen.Cancel;
import pcftest.MatterDetailPage.MatterDetailScreen.Edit;
import pcftest.MatterDetailPage.MatterDetailScreen.MatterActivitiesLV_tb;
import pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailCardDVTab;
import pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailPage_AssignButton;
import pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailPage_CalendarButton;
import pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailPage_CloseMatterButton;
import pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailPage_ReopenMatterButton;
import pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailPage_SupervisorCalendarButton;
import pcftest.MatterDetailPage.MatterDetailScreen.NotesLV_tb;
import pcftest.MatterDetailPage.MatterDetailScreen.Update;
import pcftest.MatterDetailPage.MatterDetailScreen._msgs;
import pcftest.MatterDetailPage._Paging;
import pcftest.MatterDetailPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MatterDetailPage extends PCFLocation {
  public final static String CHECKSUM = "c376ae9d53d42e9377ca695518989c3b";
  
  public MatterDetailPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MatterDetailPage"));
  }
  
  public MatterDetailPage_UpLink getMatterDetailPage_UpLink() {
    return getOrCreateProperty("MatterDetailPage_UpLink", "MatterDetailPage_UpLink", null, pcftest.MatterDetailPage.MatterDetailPage_UpLink.class);
  }
  
  public MatterDetailScreen getMatterDetailScreen() {
    return getOrCreateProperty("MatterDetailScreen", "MatterDetailScreen", null, pcftest.MatterDetailPage.MatterDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MatterDetailPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MatterDetailPage.__crumb__.class);
  }
  
  public ClaimMatters get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimMatters.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterDetailPage_UpLink extends ClickableActionElement {
    public MatterDetailPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterDetailScreen extends PCFElement {
    public MatterDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BudgetLineCardDVTab getBudgetLineCardDVTab() {
      return getOrCreateProperty("BudgetLineCardDVTab", "BudgetLineCardDVTab", null, pcftest.MatterDetailPage.MatterDetailScreen.BudgetLineCardDVTab.class);
    }
    
    public BudgetLinesLV getBudgetLinesLV() {
      return getOrCreateProperty("BudgetLinesLV", "BudgetLinesLV", null, pcftest.MatterDetailPage.MatterDetailScreen.BudgetLinesLV.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.MatterDetailPage.MatterDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.MatterDetailPage.MatterDetailScreen.Edit.class);
    }
    
    public MatterActivitiesLV getMatterActivitiesLV() {
      return getOrCreateProperty("MatterActivitiesLV", "MatterActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MatterActivitiesLV.class);
    }
    
    public MatterActivitiesLV_tb getMatterActivitiesLV_tb() {
      return getOrCreateProperty("MatterActivitiesLV_tb", "MatterActivitiesLV_tb", null, pcftest.MatterDetailPage.MatterDetailScreen.MatterActivitiesLV_tb.class);
    }
    
    public MatterDetailCardDVTab getMatterDetailCardDVTab() {
      return getOrCreateProperty("MatterDetailCardDVTab", "MatterDetailCardDVTab", null, pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailCardDVTab.class);
    }
    
    public MatterDetailPage_AssignButton getMatterDetailPage_AssignButton() {
      return getOrCreateProperty("MatterDetailPage_AssignButton", "MatterDetailPage_AssignButton", null, pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailPage_AssignButton.class);
    }
    
    public MatterDetailPage_CalendarButton getMatterDetailPage_CalendarButton() {
      return getOrCreateProperty("MatterDetailPage_CalendarButton", "MatterDetailPage_CalendarButton", null, pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailPage_CalendarButton.class);
    }
    
    public MatterDetailPage_CloseMatterButton getMatterDetailPage_CloseMatterButton() {
      return getOrCreateProperty("MatterDetailPage_CloseMatterButton", "MatterDetailPage_CloseMatterButton", null, pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailPage_CloseMatterButton.class);
    }
    
    public MatterDetailPage_ReopenMatterButton getMatterDetailPage_ReopenMatterButton() {
      return getOrCreateProperty("MatterDetailPage_ReopenMatterButton", "MatterDetailPage_ReopenMatterButton", null, pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailPage_ReopenMatterButton.class);
    }
    
    public MatterDetailPage_SupervisorCalendarButton getMatterDetailPage_SupervisorCalendarButton() {
      return getOrCreateProperty("MatterDetailPage_SupervisorCalendarButton", "MatterDetailPage_SupervisorCalendarButton", null, pcftest.MatterDetailPage.MatterDetailScreen.MatterDetailPage_SupervisorCalendarButton.class);
    }
    
    public MatterDetailsDV getMatterDetailsDV() {
      return getOrCreateProperty("MatterDetailsDV", "MatterDetailsDV", null, pcftest.MatterDetailsDV.class);
    }
    
    public NotesLV getNotesLV() {
      return getOrCreateProperty("NotesLV", "NotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NotesLV.class);
    }
    
    public NotesLV_tb getNotesLV_tb() {
      return getOrCreateProperty("NotesLV_tb", "NotesLV_tb", null, pcftest.MatterDetailPage.MatterDetailScreen.NotesLV_tb.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.MatterDetailPage.MatterDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MatterDetailPage.MatterDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BudgetLineCardDVTab extends ClickableActionElement {
      public BudgetLineCardDVTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BudgetLinesLV extends PCFElement {
      public BudgetLinesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditableBudgetLinesLV getEditableBudgetLinesLV() {
        return getOrCreateProperty("EditableBudgetLinesLV", "EditableBudgetLinesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableBudgetLinesLV.class);
      }
      
      public EditableBudgetLinesLV_tb getEditableBudgetLinesLV_tb() {
        return getOrCreateProperty("EditableBudgetLinesLV_tb", "EditableBudgetLinesLV_tb", null, pcftest.MatterDetailPage.MatterDetailScreen.BudgetLinesLV.EditableBudgetLinesLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EditableBudgetLinesLV_tb extends PCFElement {
        public EditableBudgetLinesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.MatterDetailPage.MatterDetailScreen.BudgetLinesLV.EditableBudgetLinesLV_tb.Add.class);
        }
        
        public AddAllBudgetLines getAddAllBudgetLines() {
          return getOrCreateProperty("AddAllBudgetLines", "AddAllBudgetLines", null, pcftest.MatterDetailPage.MatterDetailScreen.BudgetLinesLV.EditableBudgetLinesLV_tb.AddAllBudgetLines.class);
        }
        
        public Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.MatterDetailPage.MatterDetailScreen.BudgetLinesLV.EditableBudgetLinesLV_tb.Remove.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class AddAllBudgetLines extends ClickableActionElement {
          public AddAllBudgetLines(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Remove extends ClickableActionElement {
          public Remove(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MatterActivitiesLV_tb extends PCFElement {
      public MatterActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MatterDetailCardDVTab extends ClickableActionElement {
      public MatterDetailCardDVTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MatterDetailPage_AssignButton extends ClickableActionElement {
      public MatterDetailPage_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssignMattersPopup click() {
        return clickThis(pcftest.AssignMattersPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MatterDetailPage_CalendarButton extends ClickableActionElement {
      public MatterDetailPage_CalendarButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimMatterCalendar click() {
        return clickThis(pcftest.ClaimMatterCalendar.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MatterDetailPage_CloseMatterButton extends ClickableActionElement {
      public MatterDetailPage_CloseMatterButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CloseMatterPopup click() {
        return clickThis(pcftest.CloseMatterPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MatterDetailPage_ReopenMatterButton extends ClickableActionElement {
      public MatterDetailPage_ReopenMatterButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MatterDetailPage_SupervisorCalendarButton extends ClickableActionElement {
      public MatterDetailPage_SupervisorCalendarButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SupervisorClaimMatterCalendar click() {
        return clickThis(pcftest.SupervisorClaimMatterCalendar.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesLV_tb extends PCFElement {
      public NotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/MatterDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}