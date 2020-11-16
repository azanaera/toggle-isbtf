package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TotalLossCalculatorPopup.Cancel;
import pcftest.TotalLossCalculatorPopup.CollisionLabel;
import pcftest.TotalLossCalculatorPopup.Edit;
import pcftest.TotalLossCalculatorPopup.FireLabel;
import pcftest.TotalLossCalculatorPopup.FloodLabel;
import pcftest.TotalLossCalculatorPopup.TheftLabel;
import pcftest.TotalLossCalculatorPopup.TotalLossCalculatorPopup_UpLink;
import pcftest.TotalLossCalculatorPopup.Update;
import pcftest.TotalLossCalculatorPopup.VehInfoLabel;
import pcftest.TotalLossCalculatorPopup.VehicleLabel;
import pcftest.TotalLossCalculatorPopup.VehicleLicensePlateState;
import pcftest.TotalLossCalculatorPopup._Paging;
import pcftest.TotalLossCalculatorPopup.__crumb__;
import pcftest.TotalLossCalculatorPopup._msgs;
import typekey.Jurisdiction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TotalLossCalculatorPopup extends PCFLocation {
  public final static String CHECKSUM = "c3262f4784b1f61ae0e5a496f3fa9941";
  
  public TotalLossCalculatorPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TotalLossCalculatorPopup"));
  }
  
  public BooleanValueElement getAirbagsMissing() {
    return getOrCreateProperty("AirbagsMissing", "AirbagsMissing", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.TotalLossCalculatorPopup.Cancel.class);
  }
  
  public CollisionLabel getCollisionLabel() {
    return getOrCreateProperty("CollisionLabel", "CollisionLabel", null, pcftest.TotalLossCalculatorPopup.CollisionLabel.class);
  }
  
  public BooleanValueElement getComponentsMissing() {
    return getOrCreateProperty("ComponentsMissing", "ComponentsMissing", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.TotalLossCalculatorPopup.Edit.class);
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
  
  public FireLabel getFireLabel() {
    return getOrCreateProperty("FireLabel", "FireLabel", null, pcftest.TotalLossCalculatorPopup.FireLabel.class);
  }
  
  public FloodLabel getFloodLabel() {
    return getOrCreateProperty("FloodLabel", "FloodLabel", null, pcftest.TotalLossCalculatorPopup.FloodLabel.class);
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
  
  public TheftLabel getTheftLabel() {
    return getOrCreateProperty("TheftLabel", "TheftLabel", null, pcftest.TotalLossCalculatorPopup.TheftLabel.class);
  }
  
  public TotalLossCalculatorPopup_UpLink getTotalLossCalculatorPopup_UpLink() {
    return getOrCreateProperty("TotalLossCalculatorPopup_UpLink", "TotalLossCalculatorPopup_UpLink", null, pcftest.TotalLossCalculatorPopup.TotalLossCalculatorPopup_UpLink.class);
  }
  
  public ValueElement getTotalLossPoints() {
    return getOrCreateProperty("TotalLossPoints", "TotalLossPoints", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.TotalLossCalculatorPopup.Update.class);
  }
  
  public VehInfoLabel getVehInfoLabel() {
    return getOrCreateProperty("VehInfoLabel", "VehInfoLabel", null, pcftest.TotalLossCalculatorPopup.VehInfoLabel.class);
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
  
  public VehicleLabel getVehicleLabel() {
    return getOrCreateProperty("VehicleLabel", "VehicleLabel", null, pcftest.TotalLossCalculatorPopup.VehicleLabel.class);
  }
  
  public ValueElement getVehicleLicensePlate() {
    return getOrCreateProperty("VehicleLicensePlate", "VehicleLicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public VehicleLicensePlateState getVehicleLicensePlateState() {
    return getOrCreateProperty("VehicleLicensePlateState", "VehicleLicensePlateState", null, pcftest.TotalLossCalculatorPopup.VehicleLicensePlateState.class);
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
  
  public pcftest.TotalLossCalculatorPopup.VehicleStyle getVehicleStyle() {
    return getOrCreateProperty("VehicleStyle", "VehicleStyle", null, pcftest.TotalLossCalculatorPopup.VehicleStyle.class);
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
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TotalLossCalculatorPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TotalLossCalculatorPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TotalLossCalculatorPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CollisionLabel extends ValueElement {
    public CollisionLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FireLabel extends ValueElement {
    public FireLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FloodLabel extends ValueElement {
    public FloodLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TheftLabel extends ValueElement {
    public TheftLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalLossCalculatorPopup_UpLink extends ClickableActionElement {
    public TotalLossCalculatorPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehInfoLabel extends ValueElement {
    public VehInfoLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleLabel extends ValueElement {
    public VehicleLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/TotalLossCalculatorPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}