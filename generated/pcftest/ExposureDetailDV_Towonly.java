package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_Towonly.SubView_AutoTotalLossCalculatorCardTab;
import pcftest.ExposureDetailDV_Towonly.TowOnly_DetailsCardTab;
import pcftest.ExposureDetailDV_Towonly.TowOnly_VehicleSalvageCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_Towonly extends ExposureDetailDV {
  public final static String CHECKSUM = "5d1c055ee2c7e058b31eb4edea9c382e";
  
  public ExposureDetailDV_Towonly(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SubView_AutoTotalLossCalculatorCardTab getSubView_AutoTotalLossCalculatorCardTab() {
    return getOrCreateProperty("SubView_AutoTotalLossCalculatorCardTab", "SubView_AutoTotalLossCalculatorCardTab", null, pcftest.ExposureDetailDV_Towonly.SubView_AutoTotalLossCalculatorCardTab.class);
  }
  
  public TotalLossCalculatorDV getTotalLossCalculatorDV() {
    return getOrCreateProperty("TotalLossCalculatorDV", "TotalLossCalculatorDV", null, pcftest.TotalLossCalculatorDV.class);
  }
  
  public TowOnlyDV getTowOnlyDV() {
    return getOrCreateProperty("TowOnlyDV", "TowOnlyDV", null, pcftest.TowOnlyDV.class);
  }
  
  public TowOnly_DetailsCardTab getTowOnly_DetailsCardTab() {
    return getOrCreateProperty("TowOnly_DetailsCardTab", "TowOnly_DetailsCardTab", null, pcftest.ExposureDetailDV_Towonly.TowOnly_DetailsCardTab.class);
  }
  
  public TowOnly_VehicleSalvageCardTab getTowOnly_VehicleSalvageCardTab() {
    return getOrCreateProperty("TowOnly_VehicleSalvageCardTab", "TowOnly_VehicleSalvageCardTab", null, pcftest.ExposureDetailDV_Towonly.TowOnly_VehicleSalvageCardTab.class);
  }
  
  public VehicleSalvageDV getVehicleSalvageDV() {
    return getOrCreateProperty("VehicleSalvageDV", "VehicleSalvageDV", null, pcftest.VehicleSalvageDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubView_AutoTotalLossCalculatorCardTab extends ClickableActionElement {
    public SubView_AutoTotalLossCalculatorCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TowOnly_DetailsCardTab extends ClickableActionElement {
    public TowOnly_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TowOnly_VehicleSalvageCardTab extends ClickableActionElement {
    public TowOnly_VehicleSalvageCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}