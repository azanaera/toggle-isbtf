package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OtherStructureIncidentPanelSet.EstimatesReceived;
import pcftest.OtherStructureIncidentPanelSet.IncidentExposuresLV.IncidentExposuresLV_tb;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/OtherStructureIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherStructureIncidentPanelSet extends PCFElement {
  public final static String CHECKSUM = "b0090025eaa437ec623ade0469fbd5e3";
  
  public OtherStructureIncidentPanelSet(ISmokeTest helper, PCFElementId componentId)  {
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
  
  public EstimatesReceived getEstimatesReceived() {
    return getOrCreateProperty("EstimatesReceived", "EstimatesReceived", null, pcftest.OtherStructureIncidentPanelSet.EstimatesReceived.class);
  }
  
  public BooleanValueElement getFencesDamaged() {
    return getOrCreateProperty("FencesDamaged", "FencesDamaged", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public pcftest.OtherStructureIncidentPanelSet.IncidentExposuresLV getIncidentExposuresLV() {
    return getOrCreateProperty("IncidentExposuresLV", "IncidentExposuresLV", null, pcftest.OtherStructureIncidentPanelSet.IncidentExposuresLV.class);
  }
  
  public ValueElement getLossEstimate() {
    return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OtherServicesLVInputSet getOtherServicesLVInputSet() {
    return getOrCreateProperty("OtherServicesLVInputSet", "OtherServicesLVInputSet", null, pcftest.OtherServicesLVInputSet.class);
  }
  
  public ValueElement getServiceRequestSubmitMessage() {
    return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessageFNOL() {
    return getOrCreateProperty("ServiceRequestSubmitMessageFNOL", "ServiceRequestSubmitMessageFNOL", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/OtherStructureIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EstimatesReceived extends SelectElement {
    public EstimatesReceived(ISmokeTest helper, PCFElementId componentId)  {
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/OtherStructureIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentExposuresLV extends PCFElement {
    public IncidentExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.IncidentExposuresLV getIncidentExposuresLV() {
      return getOrCreateProperty("IncidentExposuresLV", "IncidentExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IncidentExposuresLV.class);
    }
    
    public IncidentExposuresLV_tb getIncidentExposuresLV_tb() {
      return getOrCreateProperty("IncidentExposuresLV_tb", "IncidentExposuresLV_tb", null, pcftest.OtherStructureIncidentPanelSet.IncidentExposuresLV.IncidentExposuresLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/OtherStructureIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentExposuresLV_tb extends PCFElement {
      public IncidentExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}