package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_LivingExpenses.Exposure_ISOCardTab;
import pcftest.ExposureDetailDV_LivingExpenses.PropertyDamage_DetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.LivingExpenses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_LivingExpenses extends ExposureDetailDV {
  public final static String CHECKSUM = "57b7f99144968ab53e01fccd2a890620";
  
  public ExposureDetailDV_LivingExpenses(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Exposure_ISOCardTab getExposure_ISOCardTab() {
    return getOrCreateProperty("Exposure_ISOCardTab", "Exposure_ISOCardTab", null, pcftest.ExposureDetailDV_LivingExpenses.Exposure_ISOCardTab.class);
  }
  
  public ISODetailsDV getISODetailsDV() {
    return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
  }
  
  public LivingExpensesDV getLivingExpensesDV() {
    return getOrCreateProperty("LivingExpensesDV", "LivingExpensesDV", null, pcftest.LivingExpensesDV.class);
  }
  
  public PropertyDamage_DetailsCardTab getPropertyDamage_DetailsCardTab() {
    return getOrCreateProperty("PropertyDamage_DetailsCardTab", "PropertyDamage_DetailsCardTab", null, pcftest.ExposureDetailDV_LivingExpenses.PropertyDamage_DetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.LivingExpenses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ISOCardTab extends ClickableActionElement {
    public Exposure_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.LivingExpenses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyDamage_DetailsCardTab extends ClickableActionElement {
    public PropertyDamage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}