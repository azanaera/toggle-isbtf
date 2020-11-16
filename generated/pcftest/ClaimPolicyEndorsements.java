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
import pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen;
import pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.Add;
import pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.EndorsementDetailCardTab;
import pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.EndorsementDetailDV_tb;
import pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.EndorsementDetailDV_tb.Cancel;
import pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.EndorsementDetailDV_tb.Edit;
import pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.EndorsementDetailDV_tb.Update;
import pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.Remove;
import pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen._msgs;
import pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsements_UpLink;
import pcftest.ClaimPolicyEndorsements._Paging;
import pcftest.ClaimPolicyEndorsements.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyEndorsements extends PCFLocation {
  public final static String CHECKSUM = "104c11da9b257a060eec91f548423cff";
  
  public ClaimPolicyEndorsements(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyEndorsements"));
  }
  
  public ClaimPolicyEndorsementsScreen getClaimPolicyEndorsementsScreen() {
    return getOrCreateProperty("ClaimPolicyEndorsementsScreen", "ClaimPolicyEndorsementsScreen", null, pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.class);
  }
  
  public ClaimPolicyEndorsements_UpLink getClaimPolicyEndorsements_UpLink() {
    return getOrCreateProperty("ClaimPolicyEndorsements_UpLink", "ClaimPolicyEndorsements_UpLink", null, pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsements_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyEndorsements._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyEndorsements.__crumb__.class);
  }
  
  public ClaimPolicyGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyEndorsementsScreen extends PCFElement {
    public ClaimPolicyEndorsementsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.Add.class);
    }
    
    public EndorsementDetailCardTab getEndorsementDetailCardTab() {
      return getOrCreateProperty("EndorsementDetailCardTab", "EndorsementDetailCardTab", null, pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.EndorsementDetailCardTab.class);
    }
    
    public EndorsementDetailDV getEndorsementDetailDV() {
      return getOrCreateProperty("EndorsementDetailDV", "EndorsementDetailDV", null, pcftest.EndorsementDetailDV.class);
    }
    
    public EndorsementDetailDV_tb getEndorsementDetailDV_tb() {
      return getOrCreateProperty("EndorsementDetailDV_tb", "EndorsementDetailDV_tb", null, pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.EndorsementDetailDV_tb.class);
    }
    
    public EndorsementsLV getEndorsementsLV() {
      return getOrCreateProperty("EndorsementsLV", "EndorsementsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EndorsementsLV.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.Remove.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EndorsementDetailCardTab extends ClickableActionElement {
      public EndorsementDetailCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EndorsementDetailDV_tb extends PCFElement {
      public EndorsementDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.EndorsementDetailDV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.EndorsementDetailDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.ClaimPolicyEndorsements.ClaimPolicyEndorsementsScreen.EndorsementDetailDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyEndorsements_UpLink extends ClickableActionElement {
    public ClaimPolicyEndorsements_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsements.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}