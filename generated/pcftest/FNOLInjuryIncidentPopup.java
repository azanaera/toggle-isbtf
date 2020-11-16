package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentPopup_UpLink;
import pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen;
import pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.Cancel;
import pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.ContactDV;
import pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.ContactDV.Injury;
import pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.Edit;
import pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.Update;
import pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen._msgs;
import pcftest.FNOLInjuryIncidentPopup._Paging;
import pcftest.FNOLInjuryIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLInjuryIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "74cd6935f0239f2c52b909ae28d0cfe6";
  
  public FNOLInjuryIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FNOLInjuryIncidentPopup"));
  }
  
  public FNOLInjuryIncidentPopup_UpLink getFNOLInjuryIncidentPopup_UpLink() {
    return getOrCreateProperty("FNOLInjuryIncidentPopup_UpLink", "FNOLInjuryIncidentPopup_UpLink", null, pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentPopup_UpLink.class);
  }
  
  public FNOLInjuryIncidentScreen getFNOLInjuryIncidentScreen() {
    return getOrCreateProperty("FNOLInjuryIncidentScreen", "FNOLInjuryIncidentScreen", null, pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FNOLInjuryIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FNOLInjuryIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLInjuryIncidentPopup_UpLink extends ClickableActionElement {
    public FNOLInjuryIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLInjuryIncidentScreen extends PCFElement {
    public FNOLInjuryIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.Cancel.class);
    }
    
    public ContactDV getContactDV() {
      return getOrCreateProperty("ContactDV", "ContactDV", null, pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.ContactDV.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactDV extends DetailViewElement {
      public ContactDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SelectElement getClaimContactPerson() {
        return getOrCreateProperty("ClaimContactPerson", "ClaimContactPerson", null, gw.smoketest.platform.web.SelectElement.class);
      }
      
      public FNOLContactInputSet getFNOLContactInputSet() {
        return getOrCreateProperty("FNOLContactInputSet", "FNOLContactInputSet", null, pcftest.FNOLContactInputSet.class);
      }
      
      public Injury getInjury() {
        return getOrCreateProperty("Injury", "Injury", null, pcftest.FNOLInjuryIncidentPopup.FNOLInjuryIncidentScreen.ContactDV.Injury.class);
      }
      
      public InjuryIncidentInputSet getInjuryIncidentInputSet() {
        return getOrCreateProperty("InjuryIncidentInputSet", "InjuryIncidentInputSet", null, pcftest.InjuryIncidentInputSet.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Injury extends ValueElement {
        public Injury(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}