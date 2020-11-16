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
import pcftest.ClaimNegotiations.ClaimNegotiationsScreen;
import pcftest.ClaimNegotiations.ClaimNegotiationsScreen.Add;
import pcftest.ClaimNegotiations.ClaimNegotiationsScreen.CN_Add;
import pcftest.ClaimNegotiations.ClaimNegotiationsScreen.ClaimNegotiationDetailsDV_tb;
import pcftest.ClaimNegotiations.ClaimNegotiationsScreen.ClaimNegotiationDetailsDV_tb.Cancel;
import pcftest.ClaimNegotiations.ClaimNegotiationsScreen.ClaimNegotiationDetailsDV_tb.Edit;
import pcftest.ClaimNegotiations.ClaimNegotiationsScreen.ClaimNegotiationDetailsDV_tb.Update;
import pcftest.ClaimNegotiations.ClaimNegotiationsScreen.DetailViewTitleCardTab;
import pcftest.ClaimNegotiations.ClaimNegotiationsScreen.Remove;
import pcftest.ClaimNegotiations.ClaimNegotiationsScreen._msgs;
import pcftest.ClaimNegotiations.ClaimNegotiations_UpLink;
import pcftest.ClaimNegotiations._Paging;
import pcftest.ClaimNegotiations.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNegotiations extends PCFLocation {
  public final static String CHECKSUM = "5680cdf71a09bcc685e9ea3d2908a25a";
  
  public ClaimNegotiations(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimNegotiations"));
  }
  
  public ClaimNegotiationsScreen getClaimNegotiationsScreen() {
    return getOrCreateProperty("ClaimNegotiationsScreen", "ClaimNegotiationsScreen", null, pcftest.ClaimNegotiations.ClaimNegotiationsScreen.class);
  }
  
  public ClaimNegotiations_UpLink getClaimNegotiations_UpLink() {
    return getOrCreateProperty("ClaimNegotiations_UpLink", "ClaimNegotiations_UpLink", null, pcftest.ClaimNegotiations.ClaimNegotiations_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimNegotiations._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimNegotiations.__crumb__.class);
  }
  
  public ClaimPlanOfActionGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPlanOfActionGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNegotiationsScreen extends PCFElement {
    public ClaimNegotiationsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ClaimNegotiations.ClaimNegotiationsScreen.Add.class);
    }
    
    public CN_Add getCN_Add() {
      return getOrCreateProperty("CN_Add", "CN_Add", null, pcftest.ClaimNegotiations.ClaimNegotiationsScreen.CN_Add.class);
    }
    
    public ClaimNegotiationDetailsDV getClaimNegotiationDetailsDV() {
      return getOrCreateProperty("ClaimNegotiationDetailsDV", "ClaimNegotiationDetailsDV", null, pcftest.ClaimNegotiationDetailsDV.class);
    }
    
    public ClaimNegotiationDetailsDV_tb getClaimNegotiationDetailsDV_tb() {
      return getOrCreateProperty("ClaimNegotiationDetailsDV_tb", "ClaimNegotiationDetailsDV_tb", null, pcftest.ClaimNegotiations.ClaimNegotiationsScreen.ClaimNegotiationDetailsDV_tb.class);
    }
    
    public DetailViewTitleCardTab getDetailViewTitleCardTab() {
      return getOrCreateProperty("DetailViewTitleCardTab", "DetailViewTitleCardTab", null, pcftest.ClaimNegotiations.ClaimNegotiationsScreen.DetailViewTitleCardTab.class);
    }
    
    public EditableNegotiationsLV getEditableNegotiationsLV() {
      return getOrCreateProperty("EditableNegotiationsLV", "EditableNegotiationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableNegotiationsLV.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimNegotiations.ClaimNegotiationsScreen.Remove.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimNegotiations.ClaimNegotiationsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CN_Add extends ClickableActionElement {
      public CN_Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewNegotiation click() {
        return clickThis(pcftest.NewNegotiation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimNegotiationDetailsDV_tb extends PCFElement {
      public ClaimNegotiationDetailsDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimNegotiations.ClaimNegotiationsScreen.ClaimNegotiationDetailsDV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimNegotiations.ClaimNegotiationsScreen.ClaimNegotiationDetailsDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.ClaimNegotiations.ClaimNegotiationsScreen.ClaimNegotiationDetailsDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailViewTitleCardTab extends ClickableActionElement {
      public DetailViewTitleCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNegotiations_UpLink extends ClickableActionElement {
    public ClaimNegotiations_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}