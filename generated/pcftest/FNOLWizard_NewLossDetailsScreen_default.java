package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.AddPedestrianButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.AddPropertyDamageButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.AddVehicleButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.AtTheSceneDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.AtTheSceneDV.WitnessLV;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb.Add;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb.Remove;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.CategorizationDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.CategorizationDV.Claim_Weather;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.CategorizationDV.Notification_Fault;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.LossDetailsAddressDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.LossDetailsAddressDV.AddressDetailInputSetRef;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.LossDetailsAddressDV.Claim_LossCause;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.PedestrianDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.PedestrianDV.PedestrianIcon;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.PedestrianDV.PersonName;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.PedestrianDV.PersonName.EditPedestrian;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.PedestrianDV.PersonName.RemovePedestrian;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.PropertyIncidentDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyIcon;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.EditProperty;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.RemoveProperty;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleIcon;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleIncidentOccupantsLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName.EditVehicleMenu;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName.RemoveVehicleMenu;
import pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleState;
import pcftest.FNOLWizard_NewLossDetailsScreen_default._msgs;
import typekey.FaultRating;
import typekey.Jurisdiction;
import typekey.LossCause;
import typekey.WeatherType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewLossDetailsScreen_default extends FNOLWizard_NewLossDetailsScreen {
  public final static String CHECKSUM = "55bba53dba663736548497e1d4ed858c";
  
  public FNOLWizard_NewLossDetailsScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddPedestrianButton getAddPedestrianButton() {
    return getOrCreateProperty("AddPedestrianButton", "AddPedestrianButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.AddPedestrianButton.class);
  }
  
  public AddPropertyDamageButton getAddPropertyDamageButton() {
    return getOrCreateProperty("AddPropertyDamageButton", "AddPropertyDamageButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.AddPropertyDamageButton.class);
  }
  
  public AddVehicleButton getAddVehicleButton() {
    return getOrCreateProperty("AddVehicleButton", "AddVehicleButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.AddVehicleButton.class);
  }
  
  public AtTheSceneDV getAtTheSceneDV() {
    return getOrCreateProperty("AtTheSceneDV", "AtTheSceneDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.AtTheSceneDV.class);
  }
  
  public CategorizationDV getCategorizationDV() {
    return getOrCreateProperty("CategorizationDV", "CategorizationDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.CategorizationDV.class);
  }
  
  public LossDetailsAddressDV getLossDetailsAddressDV() {
    return getOrCreateProperty("LossDetailsAddressDV", "LossDetailsAddressDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.LossDetailsAddressDV.class);
  }
  
  public PedestrianIterator getPedestrianIterator() {
    return getOrCreateProperty("PedestrianIterator", "PedestrianIterator", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.class);
  }
  
  public PropertyIncidentIterator getPropertyIncidentIterator() {
    return getOrCreateProperty("PropertyIncidentIterator", "PropertyIncidentIterator", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.class);
  }
  
  public VehicleIncidentIterator getVehicleIncidentIterator() {
    return getOrCreateProperty("VehicleIncidentIterator", "VehicleIncidentIterator", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_NewLossDetailsScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddPedestrianButton extends ClickableActionElement {
    public AddPedestrianButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLContactPopup click() {
      return clickThis(pcftest.FNOLContactPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddPropertyDamageButton extends ClickableActionElement {
    public AddPropertyDamageButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewFixedPropertyIncidentPopup click() {
      return clickThis(pcftest.NewFixedPropertyIncidentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddVehicleButton extends ClickableActionElement {
    public AddVehicleButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLVehicleIncidentPopup click() {
      return clickThis(pcftest.FNOLVehicleIncidentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AtTheSceneDV extends DetailViewElement {
    public AtTheSceneDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WitnessLV getWitnessLV() {
      return getOrCreateProperty("WitnessLV", "WitnessLV", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.AtTheSceneDV.WitnessLV.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WitnessLV extends PCFElement {
      public WitnessLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditableWitnessesLV getEditableWitnessesLV() {
        return getOrCreateProperty("EditableWitnessesLV", "EditableWitnessesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableWitnessesLV.class);
      }
      
      public EditableWitnessesLV_tb getEditableWitnessesLV_tb() {
        return getOrCreateProperty("EditableWitnessesLV_tb", "EditableWitnessesLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EditableWitnessesLV_tb extends PCFElement {
        public EditableWitnessesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb.Add.class);
        }
        
        public Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb.Remove.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CategorizationDV extends DetailViewElement {
    public CategorizationDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getCatastrophe_CatastropheNumber() {
      return getOrCreateProperty("Catastrophe_CatastropheNumber", "Catastrophe_CatastropheNumber", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SelectElement getClaim_PermissionRequired() {
      return getOrCreateProperty("Claim_PermissionRequired", "Claim_PermissionRequired", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public Claim_Weather getClaim_Weather() {
      return getOrCreateProperty("Claim_Weather", "Claim_Weather", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.CategorizationDV.Claim_Weather.class);
    }
    
    public Notification_Fault getNotification_Fault() {
      return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.CategorizationDV.Notification_Fault.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_Weather extends SelectElement {
      public Claim_Weather(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(WeatherType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public WeatherType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WeatherType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(WeatherType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Notification_Fault extends SelectElement {
      public Notification_Fault(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(FaultRating arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public FaultRating getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FaultRating.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(FaultRating arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsAddressDV extends DetailViewElement {
    public LossDetailsAddressDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressDetailInputSetRef getAddressDetailInputSetRef() {
      return getOrCreateProperty("AddressDetailInputSetRef", "AddressDetailInputSetRef", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.LossDetailsAddressDV.AddressDetailInputSetRef.class);
    }
    
    public Claim_LossCause getClaim_LossCause() {
      return getOrCreateProperty("Claim_LossCause", "Claim_LossCause", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.LossDetailsAddressDV.Claim_LossCause.class);
    }
    
    public DateElement getClaim_LossDate() {
      return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement getIncidentOnly() {
      return getOrCreateProperty("IncidentOnly", "IncidentOnly", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressDetailInputSetRef extends PCFElement {
      public AddressDetailInputSetRef(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CCAddressInputSet getCCAddressInputSet() {
        return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_LossCause extends SelectElement {
      public Claim_LossCause(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossCause arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossCause getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossCause.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossCause arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PedestrianIterator extends PCFElement {
    public PedestrianIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PedestrianDV getPedestrianDV() {
        return getOrCreateProperty("PedestrianDV", "PedestrianDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.PedestrianDV.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PedestrianDV extends DetailViewElement {
        public PedestrianDV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getInjuryIncidentDescription() {
          return getOrCreateProperty("InjuryIncidentDescription", "InjuryIncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public PedestrianIcon getPedestrianIcon() {
          return getOrCreateProperty("PedestrianIcon", "PedestrianIcon", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.PedestrianDV.PedestrianIcon.class);
        }
        
        public PersonName getPersonName() {
          return getOrCreateProperty("PersonName", "PersonName", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.PedestrianDV.PersonName.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PedestrianIcon extends ValueElement {
          public PedestrianIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PersonName extends ValueElement {
          public PersonName(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public FNOLContactPopup click() {
            return clickThis(pcftest.FNOLContactPopup.class);
          }
          
          public EditPedestrian getEditPedestrian() {
            return getOrCreateProperty("EditPedestrian", "EditPedestrian", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.PedestrianDV.PersonName.EditPedestrian.class);
          }
          
          public RemovePedestrian getRemovePedestrian() {
            return getOrCreateProperty("RemovePedestrian", "RemovePedestrian", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PedestrianIterator.entry.PedestrianDV.PersonName.RemovePedestrian.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditPedestrian extends ClickableActionElement {
            public EditPedestrian(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public FNOLContactPopup click() {
              return clickThis(pcftest.FNOLContactPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemovePedestrian extends ClickableActionElement {
            public RemovePedestrian(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyIncidentIterator extends PCFElement {
    public PropertyIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PropertyIncidentDV getPropertyIncidentDV() {
        return getOrCreateProperty("PropertyIncidentDV", "PropertyIncidentDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.PropertyIncidentDV.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PropertyIncidentDV extends DetailViewElement {
        public PropertyIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PropertyIcon getPropertyIcon() {
          return getOrCreateProperty("PropertyIcon", "PropertyIcon", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyIcon.class);
        }
        
        public ValueElement getPropertyIncidentDescription() {
          return getOrCreateProperty("PropertyIncidentDescription", "PropertyIncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public PropertyName getPropertyName() {
          return getOrCreateProperty("PropertyName", "PropertyName", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PropertyIcon extends ValueElement {
          public PropertyIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PropertyName extends ValueElement {
          public PropertyName(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public EditFixedPropertyIncidentPopup click() {
            return clickThis(pcftest.EditFixedPropertyIncidentPopup.class);
          }
          
          public EditProperty getEditProperty() {
            return getOrCreateProperty("EditProperty", "EditProperty", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.EditProperty.class);
          }
          
          public RemoveProperty getRemoveProperty() {
            return getOrCreateProperty("RemoveProperty", "RemoveProperty", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.RemoveProperty.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditProperty extends ClickableActionElement {
            public EditProperty(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public EditFixedPropertyIncidentPopup click() {
              return clickThis(pcftest.EditFixedPropertyIncidentPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveProperty extends ClickableActionElement {
            public RemoveProperty(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentIterator extends PCFElement {
    public VehicleIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public VehicleIncidentDV getVehicleIncidentDV() {
        return getOrCreateProperty("VehicleIncidentDV", "VehicleIncidentDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class VehicleIncidentDV extends DetailViewElement {
        public VehicleIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public VehicleIcon getVehicleIcon() {
          return getOrCreateProperty("VehicleIcon", "VehicleIcon", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleIcon.class);
        }
        
        public ValueElement getVehicleIncidentDescription() {
          return getOrCreateProperty("VehicleIncidentDescription", "VehicleIncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public VehicleIncidentOccupantsLV getVehicleIncidentOccupantsLV() {
          return getOrCreateProperty("VehicleIncidentOccupantsLV", "VehicleIncidentOccupantsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.VehicleIncidentOccupantsLV.class);
        }
        
        public VehicleIncidentOccupantsLV_tb getVehicleIncidentOccupantsLV_tb() {
          return getOrCreateProperty("VehicleIncidentOccupantsLV_tb", "VehicleIncidentOccupantsLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleIncidentOccupantsLV_tb.class);
        }
        
        public VehicleName getVehicleName() {
          return getOrCreateProperty("VehicleName", "VehicleName", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName.class);
        }
        
        public ValueElement getVehiclePlateNumber() {
          return getOrCreateProperty("VehiclePlateNumber", "VehiclePlateNumber", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public VehicleState getVehicleState() {
          return getOrCreateProperty("VehicleState", "VehicleState", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleState.class);
        }
        
        public ValueElement getVehicleVIN() {
          return getOrCreateProperty("VehicleVIN", "VehicleVIN", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class VehicleIcon extends ValueElement {
          public VehicleIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class VehicleIncidentOccupantsLV_tb extends PCFElement {
          public VehicleIncidentOccupantsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class VehicleName extends ValueElement {
          public VehicleName(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          public EditVehicleMenu getEditVehicleMenu() {
            return getOrCreateProperty("EditVehicleMenu", "EditVehicleMenu", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName.EditVehicleMenu.class);
          }
          
          public RemoveVehicleMenu getRemoveVehicleMenu() {
            return getOrCreateProperty("RemoveVehicleMenu", "RemoveVehicleMenu", null, pcftest.FNOLWizard_NewLossDetailsScreen_default.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName.RemoveVehicleMenu.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditVehicleMenu extends ClickableActionElement {
            public EditVehicleMenu(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public FNOLVehicleIncidentPopup click() {
              return clickThis(pcftest.FNOLVehicleIncidentPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveVehicleMenu extends ClickableActionElement {
            public RemoveVehicleMenu(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class VehicleState extends SelectElement {
          public VehicleState(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public OptionElement getOptionByTypeKey(Jurisdiction arg) {
            return getOptionByValue(arg == null ? null : arg.getCode());
          }
          
          public Jurisdiction getTypeKeyValue() {
            String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
          }
          
          public void setTypeKeyValue(Jurisdiction arg) {
            setValue(arg == null ? null : arg.getCode());
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}