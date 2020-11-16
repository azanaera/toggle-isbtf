package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_Vehicledamage.Exposure_ISOCardTab;
import pcftest.ExposureDetailDV_Vehicledamage.SubView_AutoTotalLossCalculatorCardTab;
import pcftest.ExposureDetailDV_Vehicledamage.VehicleDamage_DetailsCardTab;
import pcftest.ExposureDetailDV_Vehicledamage.VehicleDamage_VehicleSalvageCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Vehicledamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_Vehicledamage extends ExposureDetailDV {
  public final static String CHECKSUM = "30915ed6c0302f409de47a266c0b91f7";
  
  public ExposureDetailDV_Vehicledamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Exposure_ISOCardTab getExposure_ISOCardTab() {
    return getOrCreateProperty("Exposure_ISOCardTab", "Exposure_ISOCardTab", null, pcftest.ExposureDetailDV_Vehicledamage.Exposure_ISOCardTab.class);
  }
  
  public ISODetailsDV getISODetailsDV() {
    return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
  }
  
  public SubView_AutoTotalLossCalculatorCardTab getSubView_AutoTotalLossCalculatorCardTab() {
    return getOrCreateProperty("SubView_AutoTotalLossCalculatorCardTab", "SubView_AutoTotalLossCalculatorCardTab", null, pcftest.ExposureDetailDV_Vehicledamage.SubView_AutoTotalLossCalculatorCardTab.class);
  }
  
  public TotalLossCalculatorDV getTotalLossCalculatorDV() {
    return getOrCreateProperty("TotalLossCalculatorDV", "TotalLossCalculatorDV", null, pcftest.TotalLossCalculatorDV.class);
  }
  
  public VehicleDamageDV getVehicleDamageDV() {
    return getOrCreateProperty("VehicleDamageDV", "VehicleDamageDV", null, pcftest.VehicleDamageDV.class);
  }
  
  public VehicleDamage_DetailsCardTab getVehicleDamage_DetailsCardTab() {
    return getOrCreateProperty("VehicleDamage_DetailsCardTab", "VehicleDamage_DetailsCardTab", null, pcftest.ExposureDetailDV_Vehicledamage.VehicleDamage_DetailsCardTab.class);
  }
  
  public VehicleDamage_VehicleSalvageCardTab getVehicleDamage_VehicleSalvageCardTab() {
    return getOrCreateProperty("VehicleDamage_VehicleSalvageCardTab", "VehicleDamage_VehicleSalvageCardTab", null, pcftest.ExposureDetailDV_Vehicledamage.VehicleDamage_VehicleSalvageCardTab.class);
  }
  
  public VehicleSalvageDV getVehicleSalvageDV() {
    return getOrCreateProperty("VehicleSalvageDV", "VehicleSalvageDV", null, pcftest.VehicleSalvageDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Vehicledamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ISOCardTab extends ClickableActionElement {
    public Exposure_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Vehicledamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubView_AutoTotalLossCalculatorCardTab extends ClickableActionElement {
    public SubView_AutoTotalLossCalculatorCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Vehicledamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleDamage_DetailsCardTab extends ClickableActionElement {
    public VehicleDamage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Vehicledamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleDamage_VehicleSalvageCardTab extends ClickableActionElement {
    public VehicleDamage_VehicleSalvageCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}