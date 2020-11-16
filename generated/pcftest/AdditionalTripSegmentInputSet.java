package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdditionalTripSegmentInputSet.Approve;
import pcftest.AdditionalTripSegmentInputSet.Assessment;
import pcftest.AdditionalTripSegmentInputSet.Clear;
import pcftest.AdditionalTripSegmentInputSet.Deny;
import pcftest.AdditionalTripSegmentInputSet.Review;
import typekey.AssessmentAction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripSegmentInputSet extends PCFElement {
  public final static String CHECKSUM = "06aca43e2bc4e1cd6a81c8c885d3c007";
  
  public AdditionalTripSegmentInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAgentFees() {
    return getOrCreateProperty("AgentFees", "AgentFees", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Approve getApprove() {
    return getOrCreateProperty("Approve", "Approve", null, pcftest.AdditionalTripSegmentInputSet.Approve.class);
  }
  
  public Assessment getAssessment() {
    return getOrCreateProperty("Assessment", "Assessment", null, pcftest.AdditionalTripSegmentInputSet.Assessment.class);
  }
  
  public ValueElement getCarrierName() {
    return getOrCreateProperty("CarrierName", "CarrierName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCarrierNumber() {
    return getOrCreateProperty("CarrierNumber", "CarrierNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Clear getClear() {
    return getOrCreateProperty("Clear", "Clear", null, pcftest.AdditionalTripSegmentInputSet.Clear.class);
  }
  
  public Deny getDeny() {
    return getOrCreateProperty("Deny", "Deny", null, pcftest.AdditionalTripSegmentInputSet.Deny.class);
  }
  
  public DateElement getEndedOn() {
    return getOrCreateProperty("EndedOn", "EndedOn", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getFinancialImpact() {
    return getOrCreateProperty("FinancialImpact", "FinancialImpact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOtherFees() {
    return getOrCreateProperty("OtherFees", "OtherFees", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPaidAmount() {
    return getOrCreateProperty("PaidAmount", "PaidAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPortOfDisembarkation() {
    return getOrCreateProperty("PortOfDisembarkation", "PortOfDisembarkation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPortOfEmbarkation() {
    return getOrCreateProperty("PortOfEmbarkation", "PortOfEmbarkation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReasonForDenial() {
    return getOrCreateProperty("ReasonForDenial", "ReasonForDenial", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Review getReview() {
    return getOrCreateProperty("Review", "Review", null, pcftest.AdditionalTripSegmentInputSet.Review.class);
  }
  
  public DateElement getStartedOn() {
    return getOrCreateProperty("StartedOn", "StartedOn", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.AdditionalTripSegmentInputSet.TransportType getTransportType() {
    return getOrCreateProperty("TransportType", "TransportType", null, pcftest.AdditionalTripSegmentInputSet.TransportType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Approve extends ClickableActionElement {
    public Approve(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Assessment extends SelectElement {
    public Assessment(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(AssessmentAction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public AssessmentAction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AssessmentAction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(AssessmentAction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Clear extends ClickableActionElement {
    public Clear(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Deny extends ClickableActionElement {
    public Deny(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Review extends ClickableActionElement {
    public Review(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripSegmentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransportType extends SelectElement {
    public TransportType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.TransportType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.TransportType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TransportType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.TransportType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}