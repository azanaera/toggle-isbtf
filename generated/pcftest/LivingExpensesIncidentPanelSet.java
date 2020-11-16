package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LivingExpensesIncidentPanelSet.IncidentExposuresLV.IncidentExposuresLV_tb;
import pcftest.LivingExpensesIncidentPanelSet.LodgingProviderLV.LodgingProviderLV_tb;
import pcftest.LivingExpensesIncidentPanelSet.LodgingProviderLV.LodgingProviderLV_tb.Add;
import pcftest.LivingExpensesIncidentPanelSet.LodgingProviderLV.LodgingProviderLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/LivingExpensesIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LivingExpensesIncidentPanelSet extends PCFElement {
  public final static String CHECKSUM = "b2962adc1e4a33f934e59bba9e357cd8";
  
  public LivingExpensesIncidentPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExpectedDuration() {
    return getOrCreateProperty("ExpectedDuration", "ExpectedDuration", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.LivingExpensesIncidentPanelSet.IncidentExposuresLV getIncidentExposuresLV() {
    return getOrCreateProperty("IncidentExposuresLV", "IncidentExposuresLV", null, pcftest.LivingExpensesIncidentPanelSet.IncidentExposuresLV.class);
  }
  
  public pcftest.LivingExpensesIncidentPanelSet.LodgingProviderLV getLodgingProviderLV() {
    return getOrCreateProperty("LodgingProviderLV", "LodgingProviderLV", null, pcftest.LivingExpensesIncidentPanelSet.LodgingProviderLV.class);
  }
  
  public ValueElement getMealsDays() {
    return getOrCreateProperty("MealsDays", "MealsDays", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMealsPeople() {
    return getOrCreateProperty("MealsPeople", "MealsPeople", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMealsRate() {
    return getOrCreateProperty("MealsRate", "MealsRate", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getTotalLodgingEstimate() {
    return getOrCreateProperty("TotalLodgingEstimate", "TotalLodgingEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalMealsEstimate() {
    return getOrCreateProperty("TotalMealsEstimate", "TotalMealsEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/LivingExpensesIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentExposuresLV extends PCFElement {
    public IncidentExposuresLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.IncidentExposuresLV getIncidentExposuresLV() {
      return getOrCreateProperty("IncidentExposuresLV", "IncidentExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IncidentExposuresLV.class);
    }
    
    public IncidentExposuresLV_tb getIncidentExposuresLV_tb() {
      return getOrCreateProperty("IncidentExposuresLV_tb", "IncidentExposuresLV_tb", null, pcftest.LivingExpensesIncidentPanelSet.IncidentExposuresLV.IncidentExposuresLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/LivingExpensesIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentExposuresLV_tb extends PCFElement {
      public IncidentExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/LivingExpensesIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LodgingProviderLV extends PCFElement {
    public LodgingProviderLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LodgingProviderLV getLodgingProviderLV() {
      return getOrCreateProperty("LodgingProviderLV", "LodgingProviderLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LodgingProviderLV.class);
    }
    
    public LodgingProviderLV_tb getLodgingProviderLV_tb() {
      return getOrCreateProperty("LodgingProviderLV_tb", "LodgingProviderLV_tb", null, pcftest.LivingExpensesIncidentPanelSet.LodgingProviderLV.LodgingProviderLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/LivingExpensesIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LodgingProviderLV_tb extends PCFElement {
      public LodgingProviderLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.LivingExpensesIncidentPanelSet.LodgingProviderLV.LodgingProviderLV_tb.Add.class);
      }
      
      public Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.LivingExpensesIncidentPanelSet.LodgingProviderLV.LodgingProviderLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/incidents/LivingExpensesIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/incidents/LivingExpensesIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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