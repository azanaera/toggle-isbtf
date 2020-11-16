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
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailCardTab;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailDV_tb;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailDV_tb.Cancel;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailDV_tb.ClaimPolicyStatCodes_EditButton;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailDV_tb.Edit;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailDV_tb.Update;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodesLV_tb;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodesLV_tb.Add;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodesLV_tb.ClaimPolicyStatCodes_AddMoreStatCodesButton;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodesLV_tb.Remove;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen._msgs;
import pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodes_UpLink;
import pcftest.ClaimPolicyStatCodes._Paging;
import pcftest.ClaimPolicyStatCodes.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyStatCodes extends PCFLocation {
  public final static String CHECKSUM = "b7cc0cf9ee1a9d6d7831978310448759";
  
  public ClaimPolicyStatCodes(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyStatCodes"));
  }
  
  public ClaimPolicyStatCodesScreen getClaimPolicyStatCodesScreen() {
    return getOrCreateProperty("ClaimPolicyStatCodesScreen", "ClaimPolicyStatCodesScreen", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.class);
  }
  
  public ClaimPolicyStatCodes_UpLink getClaimPolicyStatCodes_UpLink() {
    return getOrCreateProperty("ClaimPolicyStatCodes_UpLink", "ClaimPolicyStatCodes_UpLink", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodes_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyStatCodes._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyStatCodes.__crumb__.class);
  }
  
  public ClaimPolicyGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodesScreen extends PCFElement {
    public ClaimPolicyStatCodesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StatCodeDetailCardTab getStatCodeDetailCardTab() {
      return getOrCreateProperty("StatCodeDetailCardTab", "StatCodeDetailCardTab", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailCardTab.class);
    }
    
    public StatCodeDetailDV getStatCodeDetailDV() {
      return getOrCreateProperty("StatCodeDetailDV", "StatCodeDetailDV", null, pcftest.StatCodeDetailDV.class);
    }
    
    public StatCodeDetailDV_tb getStatCodeDetailDV_tb() {
      return getOrCreateProperty("StatCodeDetailDV_tb", "StatCodeDetailDV_tb", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailDV_tb.class);
    }
    
    public StatCodeFilterDV getStatCodeFilterDV() {
      return getOrCreateProperty("StatCodeFilterDV", "StatCodeFilterDV", null, pcftest.StatCodeFilterDV.class);
    }
    
    public StatCodesLV getStatCodesLV() {
      return getOrCreateProperty("StatCodesLV", "StatCodesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatCodesLV.class);
    }
    
    public StatCodesLV_tb getStatCodesLV_tb() {
      return getOrCreateProperty("StatCodesLV_tb", "StatCodesLV_tb", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodesLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatCodeDetailCardTab extends ClickableActionElement {
      public StatCodeDetailCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatCodeDetailDV_tb extends PCFElement {
      public StatCodeDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailDV_tb.Cancel.class);
      }
      
      public ClaimPolicyStatCodes_EditButton getClaimPolicyStatCodes_EditButton() {
        return getOrCreateProperty("ClaimPolicyStatCodes_EditButton", "ClaimPolicyStatCodes_EditButton", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailDV_tb.ClaimPolicyStatCodes_EditButton.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodeDetailDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPolicyStatCodes_EditButton extends ClickableActionElement {
        public ClaimPolicyStatCodes_EditButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatCodesLV_tb extends PCFElement {
      public StatCodesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodesLV_tb.Add.class);
      }
      
      public ClaimPolicyStatCodes_AddMoreStatCodesButton getClaimPolicyStatCodes_AddMoreStatCodesButton() {
        return getOrCreateProperty("ClaimPolicyStatCodes_AddMoreStatCodesButton", "ClaimPolicyStatCodes_AddMoreStatCodesButton", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodesLV_tb.ClaimPolicyStatCodes_AddMoreStatCodesButton.class);
      }
      
      public Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimPolicyStatCodes.ClaimPolicyStatCodesScreen.StatCodesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimPolicyStatCodes_AddMoreStatCodesButton extends ClickableActionElement {
        public ClaimPolicyStatCodes_AddMoreStatCodesButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodes_UpLink extends ClickableActionElement {
    public ClaimPolicyStatCodes_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}