package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLContactPopup.FNOLContactPopup_UpLink;
import pcftest.FNOLContactPopup.FNOLContactScreen;
import pcftest.FNOLContactPopup.FNOLContactScreen.Cancel;
import pcftest.FNOLContactPopup.FNOLContactScreen.ContactDV;
import pcftest.FNOLContactPopup.FNOLContactScreen.ContactDV.Injury;
import pcftest.FNOLContactPopup.FNOLContactScreen.ContactDV.VehicleLossParty;
import pcftest.FNOLContactPopup.FNOLContactScreen.Edit;
import pcftest.FNOLContactPopup.FNOLContactScreen.Update;
import pcftest.FNOLContactPopup.FNOLContactScreen._msgs;
import pcftest.FNOLContactPopup._Paging;
import pcftest.FNOLContactPopup.__crumb__;
import typekey.LossPartyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLContactPopup extends PCFLocation {
  public final static String CHECKSUM = "99803a978e7405c4dd6db61b1abbcee5";
  
  public FNOLContactPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FNOLContactPopup"));
  }
  
  public FNOLContactPopup_UpLink getFNOLContactPopup_UpLink() {
    return getOrCreateProperty("FNOLContactPopup_UpLink", "FNOLContactPopup_UpLink", null, pcftest.FNOLContactPopup.FNOLContactPopup_UpLink.class);
  }
  
  public FNOLContactScreen getFNOLContactScreen() {
    return getOrCreateProperty("FNOLContactScreen", "FNOLContactScreen", null, pcftest.FNOLContactPopup.FNOLContactScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FNOLContactPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FNOLContactPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLContactPopup_UpLink extends ClickableActionElement {
    public FNOLContactPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLContactScreen extends PCFElement {
    public FNOLContactScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.FNOLContactPopup.FNOLContactScreen.Cancel.class);
    }
    
    public ContactDV getContactDV() {
      return getOrCreateProperty("ContactDV", "ContactDV", null, pcftest.FNOLContactPopup.FNOLContactScreen.ContactDV.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.FNOLContactPopup.FNOLContactScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.FNOLContactPopup.FNOLContactScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLContactPopup.FNOLContactScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public BooleanValueElement getInjuredBoolean() {
        return getOrCreateProperty("InjuredBoolean", "InjuredBoolean", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public Injury getInjury() {
        return getOrCreateProperty("Injury", "Injury", null, pcftest.FNOLContactPopup.FNOLContactScreen.ContactDV.Injury.class);
      }
      
      public InjuryIncidentInputSet getInjuryIncidentInputSet() {
        return getOrCreateProperty("InjuryIncidentInputSet", "InjuryIncidentInputSet", null, pcftest.InjuryIncidentInputSet.class);
      }
      
      public VehicleLossParty getVehicleLossParty() {
        return getOrCreateProperty("VehicleLossParty", "VehicleLossParty", null, pcftest.FNOLContactPopup.FNOLContactScreen.ContactDV.VehicleLossParty.class);
      }
      
      public ValueElement getVehicleName() {
        return getOrCreateProperty("VehicleName", "VehicleName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Injury extends ValueElement {
        public Injury(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class VehicleLossParty extends SelectElement {
        public VehicleLossParty(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(LossPartyType arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public LossPartyType getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossPartyType.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(LossPartyType arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}