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
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AddBaggageDamageButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AddInjuriesButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AddPropertyDamageButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AddTripButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AddVehicleButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.Claim_Officials;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.Claim_Officials.EditableOfficialsLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.WitnessLV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.BaggageIncidentDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.BaggageIncidentDV.Baggage;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.BaggageIncidentDV.Baggage.EditBaggage;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.BaggageIncidentDV.Baggage.RemoveBaggage;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.BaggageIncidentDV.BaggageIcon;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.CategorizationDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.CategorizationDV.Claim_Weather;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.CategorizationDV.Notification_Fault;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.InjuryIncidentDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.InjuryIncidentDV.InjuryIcon;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.InjuryIncidentDV.InjuryName;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.InjuryIncidentDV.InjuryName.EditInjury;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.InjuryIncidentDV.InjuryName.RemoveInjury;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.LossDetailsAddressDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.LossDetailsAddressDV.AddressDetailInputSetRef;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.LossDetailsAddressDV.Claim_LossCause;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.PropertyIncidentDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyIcon;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.EditProperty;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.RemoveProperty;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.TripIncidentDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.TripIncidentDV.TripName;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.TripIncidentDV.TripName.EditTripMenu;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.TripIncidentDV.TripName.RemoveTripMenu;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.TripIncidentDV.tripIcon;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleIcon;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleIncidentOccupantsLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName.EditVehicleMenu;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName.RemoveVehicleMenu;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleState;
import pcftest.FNOLWizard_NewLossDetailsScreen_Trav._msgs;
import typekey.BaggageType;
import typekey.FaultRating;
import typekey.Jurisdiction;
import typekey.LossCause;
import typekey.WeatherType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewLossDetailsScreen_Trav extends FNOLWizard_NewLossDetailsScreen {
  public final static String CHECKSUM = "16dd7e79d28a755edf9f31bc403e464b";
  
  public FNOLWizard_NewLossDetailsScreen_Trav(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddBaggageDamageButton getAddBaggageDamageButton() {
    return getOrCreateProperty("AddBaggageDamageButton", "AddBaggageDamageButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AddBaggageDamageButton.class);
  }
  
  public AddInjuriesButton getAddInjuriesButton() {
    return getOrCreateProperty("AddInjuriesButton", "AddInjuriesButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AddInjuriesButton.class);
  }
  
  public AddPropertyDamageButton getAddPropertyDamageButton() {
    return getOrCreateProperty("AddPropertyDamageButton", "AddPropertyDamageButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AddPropertyDamageButton.class);
  }
  
  public AddTripButton getAddTripButton() {
    return getOrCreateProperty("AddTripButton", "AddTripButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AddTripButton.class);
  }
  
  public AddVehicleButton getAddVehicleButton() {
    return getOrCreateProperty("AddVehicleButton", "AddVehicleButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AddVehicleButton.class);
  }
  
  public AtTheSceneDV getAtTheSceneDV() {
    return getOrCreateProperty("AtTheSceneDV", "AtTheSceneDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.class);
  }
  
  public BaggageIncidentIterator getBaggageIncidentIterator() {
    return getOrCreateProperty("BaggageIncidentIterator", "BaggageIncidentIterator", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.class);
  }
  
  public CategorizationDV getCategorizationDV() {
    return getOrCreateProperty("CategorizationDV", "CategorizationDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.CategorizationDV.class);
  }
  
  public InjuryIncidentIterator getInjuryIncidentIterator() {
    return getOrCreateProperty("InjuryIncidentIterator", "InjuryIncidentIterator", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.class);
  }
  
  public LossDetailsAddressDV getLossDetailsAddressDV() {
    return getOrCreateProperty("LossDetailsAddressDV", "LossDetailsAddressDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.LossDetailsAddressDV.class);
  }
  
  public PropertyIncidentIterator getPropertyIncidentIterator() {
    return getOrCreateProperty("PropertyIncidentIterator", "PropertyIncidentIterator", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.class);
  }
  
  public TripIncidentIterator getTripIncidentIterator() {
    return getOrCreateProperty("TripIncidentIterator", "TripIncidentIterator", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.class);
  }
  
  public VehicleIncidentIterator getVehicleIncidentIterator() {
    return getOrCreateProperty("VehicleIncidentIterator", "VehicleIncidentIterator", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddBaggageDamageButton extends ClickableActionElement {
    public AddBaggageDamageButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BaggageIncidentPopup click() {
      return clickThis(pcftest.BaggageIncidentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddInjuriesButton extends ClickableActionElement {
    public AddInjuriesButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewInjuryIncidentPopup click() {
      return clickThis(pcftest.NewInjuryIncidentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddPropertyDamageButton extends ClickableActionElement {
    public AddPropertyDamageButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewFixedPropertyIncidentPopup click() {
      return clickThis(pcftest.NewFixedPropertyIncidentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddTripButton extends ClickableActionElement {
    public AddTripButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TripIncidentPopup click() {
      return clickThis(pcftest.TripIncidentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddVehicleButton extends ClickableActionElement {
    public AddVehicleButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLVehicleIncidentPopup click() {
      return clickThis(pcftest.FNOLVehicleIncidentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AtTheSceneDV extends DetailViewElement {
    public AtTheSceneDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Claim_Officials getClaim_Officials() {
      return getOrCreateProperty("Claim_Officials", "Claim_Officials", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.Claim_Officials.class);
    }
    
    public WitnessLV getWitnessLV() {
      return getOrCreateProperty("WitnessLV", "WitnessLV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.WitnessLV.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_Officials extends PCFElement {
      public Claim_Officials(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditableOfficialsLV getEditableOfficialsLV() {
        return getOrCreateProperty("EditableOfficialsLV", "EditableOfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOfficialsLV.class);
      }
      
      public EditableOfficialsLV_tb getEditableOfficialsLV_tb() {
        return getOrCreateProperty("EditableOfficialsLV_tb", "EditableOfficialsLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.Claim_Officials.EditableOfficialsLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EditableOfficialsLV_tb extends PCFElement {
        public EditableOfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.Claim_Officials.EditableOfficialsLV_tb.Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.Claim_Officials.EditableOfficialsLV_tb.Add.class);
        }
        
        public pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.Claim_Officials.EditableOfficialsLV_tb.Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.Claim_Officials.EditableOfficialsLV_tb.Remove.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WitnessLV extends PCFElement {
      public WitnessLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditableWitnessesLV getEditableWitnessesLV() {
        return getOrCreateProperty("EditableWitnessesLV", "EditableWitnessesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableWitnessesLV.class);
      }
      
      public EditableWitnessesLV_tb getEditableWitnessesLV_tb() {
        return getOrCreateProperty("EditableWitnessesLV_tb", "EditableWitnessesLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EditableWitnessesLV_tb extends PCFElement {
        public EditableWitnessesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb.Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb.Add.class);
        }
        
        public pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb.Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.AtTheSceneDV.WitnessLV.EditableWitnessesLV_tb.Remove.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncidentIterator extends PCFElement {
    public BaggageIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BaggageIncidentDV getBaggageIncidentDV() {
        return getOrCreateProperty("BaggageIncidentDV", "BaggageIncidentDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.BaggageIncidentDV.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class BaggageIncidentDV extends DetailViewElement {
        public BaggageIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Baggage getBaggage() {
          return getOrCreateProperty("Baggage", "Baggage", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.BaggageIncidentDV.Baggage.class);
        }
        
        public BaggageIcon getBaggageIcon() {
          return getOrCreateProperty("BaggageIcon", "BaggageIcon", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.BaggageIncidentDV.BaggageIcon.class);
        }
        
        public ValueElement getBaggageIncidentDescription() {
          return getOrCreateProperty("BaggageIncidentDescription", "BaggageIncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Baggage extends SelectElement {
          public Baggage(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public BaggageIncidentPopup click() {
            return clickThis(pcftest.BaggageIncidentPopup.class);
          }
          
          public EditBaggage getEditBaggage() {
            return getOrCreateProperty("EditBaggage", "EditBaggage", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.BaggageIncidentDV.Baggage.EditBaggage.class);
          }
          
          public OptionElement getOptionByTypeKey(BaggageType arg) {
            return getOptionByValue(arg == null ? null : arg.getCode());
          }
          
          public RemoveBaggage getRemoveBaggage() {
            return getOrCreateProperty("RemoveBaggage", "RemoveBaggage", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.BaggageIncidentIterator.entry.BaggageIncidentDV.Baggage.RemoveBaggage.class);
          }
          
          public BaggageType getTypeKeyValue() {
            String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BaggageType.getTypeKey(myValue);
          }
          
          public void setTypeKeyValue(BaggageType arg) {
            setValue(arg == null ? null : arg.getCode());
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditBaggage extends ClickableActionElement {
            public EditBaggage(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public BaggageIncidentPopup click() {
              return clickThis(pcftest.BaggageIncidentPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveBaggage extends ClickableActionElement {
            public RemoveBaggage(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class BaggageIcon extends ValueElement {
          public BaggageIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("Claim_Weather", "Claim_Weather", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.CategorizationDV.Claim_Weather.class);
    }
    
    public Notification_Fault getNotification_Fault() {
      return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.CategorizationDV.Notification_Fault.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentIterator extends PCFElement {
    public InjuryIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public InjuryIncidentDV getInjuryIncidentDV() {
        return getOrCreateProperty("InjuryIncidentDV", "InjuryIncidentDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.InjuryIncidentDV.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InjuryIncidentDV extends DetailViewElement {
        public InjuryIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public InjuryIcon getInjuryIcon() {
          return getOrCreateProperty("InjuryIcon", "InjuryIcon", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.InjuryIncidentDV.InjuryIcon.class);
        }
        
        public ValueElement getInjuryIncidentDescription() {
          return getOrCreateProperty("InjuryIncidentDescription", "InjuryIncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public InjuryName getInjuryName() {
          return getOrCreateProperty("InjuryName", "InjuryName", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.InjuryIncidentDV.InjuryName.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class InjuryIcon extends ValueElement {
          public InjuryIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class InjuryName extends ValueElement {
          public InjuryName(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public EditInjuryIncidentPopup click() {
            return clickThis(pcftest.EditInjuryIncidentPopup.class);
          }
          
          public EditInjury getEditInjury() {
            return getOrCreateProperty("EditInjury", "EditInjury", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.InjuryIncidentDV.InjuryName.EditInjury.class);
          }
          
          public RemoveInjury getRemoveInjury() {
            return getOrCreateProperty("RemoveInjury", "RemoveInjury", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.InjuryIncidentIterator.entry.InjuryIncidentDV.InjuryName.RemoveInjury.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditInjury extends ClickableActionElement {
            public EditInjury(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public EditInjuryIncidentPopup click() {
              return clickThis(pcftest.EditInjuryIncidentPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveInjury extends ClickableActionElement {
            public RemoveInjury(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsAddressDV extends DetailViewElement {
    public LossDetailsAddressDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressDetailInputSetRef getAddressDetailInputSetRef() {
      return getOrCreateProperty("AddressDetailInputSetRef", "AddressDetailInputSetRef", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.LossDetailsAddressDV.AddressDetailInputSetRef.class);
    }
    
    public Claim_LossCause getClaim_LossCause() {
      return getOrCreateProperty("Claim_LossCause", "Claim_LossCause", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.LossDetailsAddressDV.Claim_LossCause.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressDetailInputSetRef extends PCFElement {
      public AddressDetailInputSetRef(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CCAddressInputSet getCCAddressInputSet() {
        return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyIncidentIterator extends PCFElement {
    public PropertyIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PropertyIncidentDV getPropertyIncidentDV() {
        return getOrCreateProperty("PropertyIncidentDV", "PropertyIncidentDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.PropertyIncidentDV.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PropertyIncidentDV extends DetailViewElement {
        public PropertyIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PropertyIcon getPropertyIcon() {
          return getOrCreateProperty("PropertyIcon", "PropertyIcon", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyIcon.class);
        }
        
        public ValueElement getPropertyIncidentDescription() {
          return getOrCreateProperty("PropertyIncidentDescription", "PropertyIncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public PropertyName getPropertyName() {
          return getOrCreateProperty("PropertyName", "PropertyName", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PropertyIcon extends ValueElement {
          public PropertyIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PropertyName extends ValueElement {
          public PropertyName(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public EditFixedPropertyIncidentPopup click() {
            return clickThis(pcftest.EditFixedPropertyIncidentPopup.class);
          }
          
          public EditProperty getEditProperty() {
            return getOrCreateProperty("EditProperty", "EditProperty", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.EditProperty.class);
          }
          
          public RemoveProperty getRemoveProperty() {
            return getOrCreateProperty("RemoveProperty", "RemoveProperty", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.RemoveProperty.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditProperty extends ClickableActionElement {
            public EditProperty(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public EditFixedPropertyIncidentPopup click() {
              return clickThis(pcftest.EditFixedPropertyIncidentPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentIterator extends PCFElement {
    public TripIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TripIncidentDV getTripIncidentDV() {
        return getOrCreateProperty("TripIncidentDV", "TripIncidentDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.TripIncidentDV.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TripIncidentDV extends DetailViewElement {
        public TripIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getTripIncidentDescription() {
          return getOrCreateProperty("TripIncidentDescription", "TripIncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public TripName getTripName() {
          return getOrCreateProperty("TripName", "TripName", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.TripIncidentDV.TripName.class);
        }
        
        public tripIcon gettripIcon() {
          return getOrCreateProperty("tripIcon", "tripIcon", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.TripIncidentDV.tripIcon.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class TripName extends ValueElement {
          public TripName(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public TripIncidentPopup click() {
            return clickThis(pcftest.TripIncidentPopup.class);
          }
          
          public EditTripMenu getEditTripMenu() {
            return getOrCreateProperty("EditTripMenu", "EditTripMenu", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.TripIncidentDV.TripName.EditTripMenu.class);
          }
          
          public RemoveTripMenu getRemoveTripMenu() {
            return getOrCreateProperty("RemoveTripMenu", "RemoveTripMenu", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.TripIncidentIterator.entry.TripIncidentDV.TripName.RemoveTripMenu.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditTripMenu extends ClickableActionElement {
            public EditTripMenu(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public TripIncidentPopup click() {
              return clickThis(pcftest.TripIncidentPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveTripMenu extends ClickableActionElement {
            public RemoveTripMenu(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class tripIcon extends ValueElement {
          public tripIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentIterator extends PCFElement {
    public VehicleIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public VehicleIncidentDV getVehicleIncidentDV() {
        return getOrCreateProperty("VehicleIncidentDV", "VehicleIncidentDV", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class VehicleIncidentDV extends DetailViewElement {
        public VehicleIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public VehicleIcon getVehicleIcon() {
          return getOrCreateProperty("VehicleIcon", "VehicleIcon", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleIcon.class);
        }
        
        public ValueElement getVehicleIncidentDescription() {
          return getOrCreateProperty("VehicleIncidentDescription", "VehicleIncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public VehicleIncidentOccupantsLV getVehicleIncidentOccupantsLV() {
          return getOrCreateProperty("VehicleIncidentOccupantsLV", "VehicleIncidentOccupantsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.VehicleIncidentOccupantsLV.class);
        }
        
        public VehicleIncidentOccupantsLV_tb getVehicleIncidentOccupantsLV_tb() {
          return getOrCreateProperty("VehicleIncidentOccupantsLV_tb", "VehicleIncidentOccupantsLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleIncidentOccupantsLV_tb.class);
        }
        
        public VehicleName getVehicleName() {
          return getOrCreateProperty("VehicleName", "VehicleName", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName.class);
        }
        
        public ValueElement getVehiclePlateNumber() {
          return getOrCreateProperty("VehiclePlateNumber", "VehiclePlateNumber", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public VehicleState getVehicleState() {
          return getOrCreateProperty("VehicleState", "VehicleState", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleState.class);
        }
        
        public ValueElement getVehicleVIN() {
          return getOrCreateProperty("VehicleVIN", "VehicleVIN", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class VehicleIcon extends ValueElement {
          public VehicleIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class VehicleIncidentOccupantsLV_tb extends PCFElement {
          public VehicleIncidentOccupantsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class VehicleName extends ValueElement {
          public VehicleName(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          public EditVehicleMenu getEditVehicleMenu() {
            return getOrCreateProperty("EditVehicleMenu", "EditVehicleMenu", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName.EditVehicleMenu.class);
          }
          
          public RemoveVehicleMenu getRemoveVehicleMenu() {
            return getOrCreateProperty("RemoveVehicleMenu", "RemoveVehicleMenu", null, pcftest.FNOLWizard_NewLossDetailsScreen_Trav.VehicleIncidentIterator.entry.VehicleIncidentDV.VehicleName.RemoveVehicleMenu.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditVehicleMenu extends ClickableActionElement {
            public EditVehicleMenu(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public FNOLVehicleIncidentPopup click() {
              return clickThis(pcftest.FNOLVehicleIncidentPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}