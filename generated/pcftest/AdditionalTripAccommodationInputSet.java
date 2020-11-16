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
import pcftest.AdditionalTripAccommodationInputSet.Approve;
import pcftest.AdditionalTripAccommodationInputSet.Assessment;
import pcftest.AdditionalTripAccommodationInputSet.Clear;
import pcftest.AdditionalTripAccommodationInputSet.Deny;
import pcftest.AdditionalTripAccommodationInputSet.Review;
import typekey.AssessmentAction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalTripAccommodationInputSet extends PCFElement {
  public final static String CHECKSUM = "004d9ce074637f8e2c8a8a91a0605ce5";
  
  public AdditionalTripAccommodationInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAgentFees() {
    return getOrCreateProperty("AgentFees", "AgentFees", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Approve getApprove() {
    return getOrCreateProperty("Approve", "Approve", null, pcftest.AdditionalTripAccommodationInputSet.Approve.class);
  }
  
  public Assessment getAssessment() {
    return getOrCreateProperty("Assessment", "Assessment", null, pcftest.AdditionalTripAccommodationInputSet.Assessment.class);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public DateElement getCheckin() {
    return getOrCreateProperty("Checkin", "Checkin", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getCheckout() {
    return getOrCreateProperty("Checkout", "Checkout", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Clear getClear() {
    return getOrCreateProperty("Clear", "Clear", null, pcftest.AdditionalTripAccommodationInputSet.Clear.class);
  }
  
  public Deny getDeny() {
    return getOrCreateProperty("Deny", "Deny", null, pcftest.AdditionalTripAccommodationInputSet.Deny.class);
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
  
  public ValueElement getPropertyName() {
    return getOrCreateProperty("PropertyName", "PropertyName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReasonForDenial() {
    return getOrCreateProperty("ReasonForDenial", "ReasonForDenial", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Review getReview() {
    return getOrCreateProperty("Review", "Review", null, pcftest.AdditionalTripAccommodationInputSet.Review.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Approve extends ClickableActionElement {
    public Approve(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Clear extends ClickableActionElement {
    public Clear(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Deny extends ClickableActionElement {
    public Deny(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AdditionalTripAccommodationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Review extends ClickableActionElement {
    public Review(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}