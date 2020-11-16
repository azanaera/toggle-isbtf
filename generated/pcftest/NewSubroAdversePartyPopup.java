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
import pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyPopup_UpLink;
import pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen;
import pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen.SubrogationPartyDetailDV_tb;
import pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen.SubrogationPartyDetailDV_tb.Cancel;
import pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen.SubrogationPartyDetailDV_tb.Edit;
import pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen.SubrogationPartyDetailDV_tb.Update;
import pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen._msgs;
import pcftest.NewSubroAdversePartyPopup._Paging;
import pcftest.NewSubroAdversePartyPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewSubroAdversePartyPopup extends PCFLocation {
  public final static String CHECKSUM = "f3ec0c0f9a8e7a7b188b34f8d7dad6c1";
  
  public NewSubroAdversePartyPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewSubroAdversePartyPopup"));
  }
  
  public NewSubroAdversePartyPopup_UpLink getNewSubroAdversePartyPopup_UpLink() {
    return getOrCreateProperty("NewSubroAdversePartyPopup_UpLink", "NewSubroAdversePartyPopup_UpLink", null, pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyPopup_UpLink.class);
  }
  
  public NewSubroAdversePartyScreen getNewSubroAdversePartyScreen() {
    return getOrCreateProperty("NewSubroAdversePartyScreen", "NewSubroAdversePartyScreen", null, pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewSubroAdversePartyPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewSubroAdversePartyPopup.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewSubroAdversePartyPopup_UpLink extends ClickableActionElement {
    public NewSubroAdversePartyPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewSubroAdversePartyScreen extends PCFElement {
    public NewSubroAdversePartyScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SubrogationPartyDetailDV getSubrogationPartyDetailDV() {
      return getOrCreateProperty("SubrogationPartyDetailDV", "SubrogationPartyDetailDV", null, pcftest.SubrogationPartyDetailDV.class);
    }
    
    public SubrogationPartyDetailDV_tb getSubrogationPartyDetailDV_tb() {
      return getOrCreateProperty("SubrogationPartyDetailDV_tb", "SubrogationPartyDetailDV_tb", null, pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen.SubrogationPartyDetailDV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubrogationPartyDetailDV_tb extends PCFElement {
      public SubrogationPartyDetailDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen.SubrogationPartyDetailDV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen.SubrogationPartyDetailDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.NewSubroAdversePartyPopup.NewSubroAdversePartyScreen.SubrogationPartyDetailDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/NewSubroAdversePartyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}