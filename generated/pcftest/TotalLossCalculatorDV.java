package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TotalLossCalculatorDV.VehicleLicensePlateState;
import typekey.Jurisdiction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/TotalLossCalculatorDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TotalLossCalculatorDV extends DetailViewElement {
  public final static String CHECKSUM = "8db16a9ccaa7bab981ba097be71462e0";
  
  public TotalLossCalculatorDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getAirbagsMissing() {
    return getOrCreateProperty("AirbagsMissing", "AirbagsMissing", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getComponentsMissing() {
    return getOrCreateProperty("ComponentsMissing", "ComponentsMissing", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getExtrication() {
    return getOrCreateProperty("Extrication", "Extrication", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getFireBurnDash() {
    return getOrCreateProperty("FireBurnDash", "FireBurnDash", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getFireBurnEngine() {
    return getOrCreateProperty("FireBurnEngine", "FireBurnEngine", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getFireBurnWindshield() {
    return getOrCreateProperty("FireBurnWindshield", "FireBurnWindshield", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getFloodSaltWater() {
    return getOrCreateProperty("FloodSaltWater", "FloodSaltWater", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getInteriorMissing() {
    return getOrCreateProperty("InteriorMissing", "InteriorMissing", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getMileage100K() {
    return getOrCreateProperty("Mileage100K", "Mileage100K", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getTotalLossCalculator_CollisionSection() {
    return getOrCreateProperty("TotalLossCalculator_CollisionSection", "TotalLossCalculator_CollisionSection", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalLossCalculator_FireSection() {
    return getOrCreateProperty("TotalLossCalculator_FireSection", "TotalLossCalculator_FireSection", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalLossCalculator_FloodSection() {
    return getOrCreateProperty("TotalLossCalculator_FloodSection", "TotalLossCalculator_FloodSection", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalLossCalculator_HowVehDamaged() {
    return getOrCreateProperty("TotalLossCalculator_HowVehDamaged", "TotalLossCalculator_HowVehDamaged", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalLossCalculator_NonAuto() {
    return getOrCreateProperty("TotalLossCalculator_NonAuto", "TotalLossCalculator_NonAuto", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalLossCalculator_VandalTheftSection() {
    return getOrCreateProperty("TotalLossCalculator_VandalTheftSection", "TotalLossCalculator_VandalTheftSection", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalLossCalculator_Vehicle() {
    return getOrCreateProperty("TotalLossCalculator_Vehicle", "TotalLossCalculator_Vehicle", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalLossPoints() {
    return getOrCreateProperty("TotalLossPoints", "TotalLossPoints", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getVehicleAge10Years() {
    return getOrCreateProperty("VehicleAge10Years", "VehicleAge10Years", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getVehicleAge5Years() {
    return getOrCreateProperty("VehicleAge5Years", "VehicleAge5Years", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getVehicleAirbagsDeployed() {
    return getOrCreateProperty("VehicleAirbagsDeployed", "VehicleAirbagsDeployed", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getVehicleColor() {
    return getOrCreateProperty("VehicleColor", "VehicleColor", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicleLicensePlate() {
    return getOrCreateProperty("VehicleLicensePlate", "VehicleLicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public VehicleLicensePlateState getVehicleLicensePlateState() {
    return getOrCreateProperty("VehicleLicensePlateState", "VehicleLicensePlateState", null, pcftest.TotalLossCalculatorDV.VehicleLicensePlateState.class);
  }
  
  public ValueElement getVehicleMake() {
    return getOrCreateProperty("VehicleMake", "VehicleMake", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicleModel() {
    return getOrCreateProperty("VehicleModel", "VehicleModel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getVehicleRollOver() {
    return getOrCreateProperty("VehicleRollOver", "VehicleRollOver", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public pcftest.TotalLossCalculatorDV.VehicleStyle getVehicleStyle() {
    return getOrCreateProperty("VehicleStyle", "VehicleStyle", null, pcftest.TotalLossCalculatorDV.VehicleStyle.class);
  }
  
  public BooleanValueElement getVehicleSubmerged() {
    return getOrCreateProperty("VehicleSubmerged", "VehicleSubmerged", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getVehicleTotalLoss() {
    return getOrCreateProperty("VehicleTotalLoss", "VehicleTotalLoss", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getVehicleTowed() {
    return getOrCreateProperty("VehicleTowed", "VehicleTowed", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getVehicleVin() {
    return getOrCreateProperty("VehicleVin", "VehicleVin", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicleYear() {
    return getOrCreateProperty("VehicleYear", "VehicleYear", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getWaterLevelDash() {
    return getOrCreateProperty("WaterLevelDash", "WaterLevelDash", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getWaterLevelSeats() {
    return getOrCreateProperty("WaterLevelSeats", "WaterLevelSeats", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TotalLossCalculatorDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleLicensePlateState extends SelectElement {
    public VehicleLicensePlateState(ISmokeTest helper, PCFElementId componentId)  {
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TotalLossCalculatorDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleStyle extends SelectElement {
    public VehicleStyle(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.VehicleStyle arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.VehicleStyle getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VehicleStyle.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.VehicleStyle arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}