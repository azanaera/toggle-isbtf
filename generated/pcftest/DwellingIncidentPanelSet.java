package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DwellingIncidentPanelSet.DamageDV;
import pcftest.DwellingIncidentPanelSet.DamageDV.EstimatedReceived;
import pcftest.DwellingIncidentPanelSet.IncidentExposuresLV_tb;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/DwellingIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DwellingIncidentPanelSet extends PCFElement {
  public final static String CHECKSUM = "50baffc7b93ab9515788cfb66ba23da7";
  
  public DwellingIncidentPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddress() {
    return getOrCreateProperty("Address", "Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DamageDV getDamageDV() {
    return getOrCreateProperty("DamageDV", "DamageDV", null, pcftest.DwellingIncidentPanelSet.DamageDV.class);
  }
  
  public DwellingAttributeInputSet getDwellingAttributeInputSet() {
    return getOrCreateProperty("DwellingAttributeInputSet", "DwellingAttributeInputSet", null, pcftest.DwellingAttributeInputSet.class);
  }
  
  public HomeownersPanelSet getHomeownersPanelSet() {
    return getOrCreateProperty("HomeownersPanelSet", "HomeownersPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.HomeownersPanelSet.class);
  }
  
  public IncidentExposuresLV getIncidentExposuresLV() {
    return getOrCreateProperty("IncidentExposuresLV", "IncidentExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IncidentExposuresLV.class);
  }
  
  public IncidentExposuresLV_tb getIncidentExposuresLV_tb() {
    return getOrCreateProperty("IncidentExposuresLV_tb", "IncidentExposuresLV_tb", null, pcftest.DwellingIncidentPanelSet.IncidentExposuresLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DamageDV extends DetailViewElement {
    public DamageDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getAlreadyRepaired() {
      return getOrCreateProperty("AlreadyRepaired", "AlreadyRepaired", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEstimateCost() {
      return getOrCreateProperty("EstimateCost", "EstimateCost", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEstimateTime() {
      return getOrCreateProperty("EstimateTime", "EstimateTime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EstimatedReceived getEstimatedReceived() {
      return getOrCreateProperty("EstimatedReceived", "EstimatedReceived", null, pcftest.DwellingIncidentPanelSet.DamageDV.EstimatedReceived.class);
    }
    
    public FireDamageInfoInputSet getFireDamageInfoInputSet() {
      return getOrCreateProperty("FireDamageInfoInputSet", "FireDamageInfoInputSet", null, pcftest.FireDamageInfoInputSet.class);
    }
    
    public ValueElement getLossEstimate() {
      return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPropertyDescription() {
      return getOrCreateProperty("PropertyDescription", "PropertyDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/DwellingIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EstimatedReceived extends SelectElement {
      public EstimatedReceived(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(YesNo arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public YesNo getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(YesNo arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/DwellingIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentExposuresLV_tb extends PCFElement {
    public IncidentExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}