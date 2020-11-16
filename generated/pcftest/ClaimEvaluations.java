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
import pcftest.ClaimEvaluations.ClaimEvaluationsScreen;
import pcftest.ClaimEvaluations.ClaimEvaluationsScreen.Add;
import pcftest.ClaimEvaluations.ClaimEvaluationsScreen.CE_Add;
import pcftest.ClaimEvaluations.ClaimEvaluationsScreen.ClaimEvaluationDetailsDV_tb;
import pcftest.ClaimEvaluations.ClaimEvaluationsScreen.ClaimEvaluationDetailsDV_tb.Cancel;
import pcftest.ClaimEvaluations.ClaimEvaluationsScreen.ClaimEvaluationDetailsDV_tb.Edit;
import pcftest.ClaimEvaluations.ClaimEvaluationsScreen.ClaimEvaluationDetailsDV_tb.Update;
import pcftest.ClaimEvaluations.ClaimEvaluationsScreen.DetailViewTitleCardTab;
import pcftest.ClaimEvaluations.ClaimEvaluationsScreen.Remove;
import pcftest.ClaimEvaluations.ClaimEvaluationsScreen._msgs;
import pcftest.ClaimEvaluations.ClaimEvaluations_UpLink;
import pcftest.ClaimEvaluations._Paging;
import pcftest.ClaimEvaluations.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimEvaluations extends PCFLocation {
  public final static String CHECKSUM = "ebf39153058ceaf2f5f3081d6c0b578a";
  
  public ClaimEvaluations(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimEvaluations"));
  }
  
  public ClaimEvaluationsScreen getClaimEvaluationsScreen() {
    return getOrCreateProperty("ClaimEvaluationsScreen", "ClaimEvaluationsScreen", null, pcftest.ClaimEvaluations.ClaimEvaluationsScreen.class);
  }
  
  public ClaimEvaluations_UpLink getClaimEvaluations_UpLink() {
    return getOrCreateProperty("ClaimEvaluations_UpLink", "ClaimEvaluations_UpLink", null, pcftest.ClaimEvaluations.ClaimEvaluations_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimEvaluations._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimEvaluations.__crumb__.class);
  }
  
  public ClaimPlanOfActionGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPlanOfActionGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimEvaluationsScreen extends PCFElement {
    public ClaimEvaluationsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ClaimEvaluations.ClaimEvaluationsScreen.Add.class);
    }
    
    public CE_Add getCE_Add() {
      return getOrCreateProperty("CE_Add", "CE_Add", null, pcftest.ClaimEvaluations.ClaimEvaluationsScreen.CE_Add.class);
    }
    
    public ClaimEvaluationDetailsDV_Auto getClaimEvaluationDetailsDV_Auto() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_Auto", "ClaimEvaluationDetailsDV", null, pcftest.ClaimEvaluationDetailsDV_Auto.class);
    }
    
    public ClaimEvaluationDetailsDV_Gl getClaimEvaluationDetailsDV_Gl() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_Gl", "ClaimEvaluationDetailsDV", null, pcftest.ClaimEvaluationDetailsDV_Gl.class);
    }
    
    public ClaimEvaluationDetailsDV_Pr getClaimEvaluationDetailsDV_Pr() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_Pr", "ClaimEvaluationDetailsDV", null, pcftest.ClaimEvaluationDetailsDV_Pr.class);
    }
    
    public ClaimEvaluationDetailsDV_Trav getClaimEvaluationDetailsDV_Trav() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_Trav", "ClaimEvaluationDetailsDV", null, pcftest.ClaimEvaluationDetailsDV_Trav.class);
    }
    
    public ClaimEvaluationDetailsDV_Wc getClaimEvaluationDetailsDV_Wc() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_Wc", "ClaimEvaluationDetailsDV", null, pcftest.ClaimEvaluationDetailsDV_Wc.class);
    }
    
    public ClaimEvaluationDetailsDV_tb getClaimEvaluationDetailsDV_tb() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_tb", "ClaimEvaluationDetailsDV_tb", null, pcftest.ClaimEvaluations.ClaimEvaluationsScreen.ClaimEvaluationDetailsDV_tb.class);
    }
    
    public DetailViewTitleCardTab getDetailViewTitleCardTab() {
      return getOrCreateProperty("DetailViewTitleCardTab", "DetailViewTitleCardTab", null, pcftest.ClaimEvaluations.ClaimEvaluationsScreen.DetailViewTitleCardTab.class);
    }
    
    public EditableEvaluationsLV getEditableEvaluationsLV() {
      return getOrCreateProperty("EditableEvaluationsLV", "EditableEvaluationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableEvaluationsLV.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimEvaluations.ClaimEvaluationsScreen.Remove.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimEvaluations.ClaimEvaluationsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CE_Add extends ClickableActionElement {
      public CE_Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewEvaluation click() {
        return clickThis(pcftest.NewEvaluation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimEvaluationDetailsDV_tb extends PCFElement {
      public ClaimEvaluationDetailsDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimEvaluations.ClaimEvaluationsScreen.ClaimEvaluationDetailsDV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimEvaluations.ClaimEvaluationsScreen.ClaimEvaluationDetailsDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.ClaimEvaluations.ClaimEvaluationsScreen.ClaimEvaluationDetailsDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Update extends ClickableActionElement {
        public Update(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailViewTitleCardTab extends ClickableActionElement {
      public DetailViewTitleCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimEvaluations_UpLink extends ClickableActionElement {
    public ClaimEvaluations_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}