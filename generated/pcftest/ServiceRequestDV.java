package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ServiceRequestDV.CustomerContact;
import pcftest.ServiceRequestDV.CustomerContact.MenuItem_Search;
import pcftest.ServiceRequestDV.CustomerContact.MenuItem_ViewDetails;
import pcftest.ServiceRequestDV.Kind;
import pcftest.ServiceRequestDV.Progress;
import pcftest.ServiceRequestDV.QuoteStatus;
import pcftest.ServiceRequestDV.ServiceAddress;
import pcftest.ServiceRequestDV.ServiceToPerform;
import pcftest.ServiceRequestDV.ServiceToPerform.InstructionServicesLV_tb;
import pcftest.ServiceRequestDV.Specialist;
import typekey.ServiceRequestKind;
import typekey.ServiceRequestProgress;
import typekey.ServiceRequestQuoteStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestDV extends DetailViewElement {
  public final static String CHECKSUM = "5dca5b3d38f81cc6d58c15e136aa5efb";
  
  public ServiceRequestDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getActionOwner() {
    return getOrCreateProperty("ActionOwner", "ActionOwner", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCompletionDate() {
    return getOrCreateProperty("CompletionDate", "CompletionDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.ServiceRequestDV.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.ServiceRequestDV.Currency.class);
  }
  
  public CustomerContact getCustomerContact() {
    return getOrCreateProperty("CustomerContact", "CustomerContact", null, pcftest.ServiceRequestDV.CustomerContact.class);
  }
  
  public DateElement getExpectedQuoteCompletionDate() {
    return getOrCreateProperty("ExpectedQuoteCompletionDate", "ExpectedQuoteCompletionDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getExpectedServiceCompletionDate() {
    return getOrCreateProperty("ExpectedServiceCompletionDate", "ExpectedServiceCompletionDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getInstructionText() {
    return getOrCreateProperty("InstructionText", "InstructionText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Kind getKind() {
    return getOrCreateProperty("Kind", "Kind", null, pcftest.ServiceRequestDV.Kind.class);
  }
  
  public ValueElement getNextAction() {
    return getOrCreateProperty("NextAction", "NextAction", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Progress getProgress() {
    return getOrCreateProperty("Progress", "Progress", null, pcftest.ServiceRequestDV.Progress.class);
  }
  
  public QuoteStatus getQuoteStatus() {
    return getOrCreateProperty("QuoteStatus", "QuoteStatus", null, pcftest.ServiceRequestDV.QuoteStatus.class);
  }
  
  public ValueElement getRelatedTo() {
    return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getRequestedQuoteCompletionDate() {
    return getOrCreateProperty("RequestedQuoteCompletionDate", "RequestedQuoteCompletionDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getRequestedServiceCompletionDate() {
    return getOrCreateProperty("RequestedServiceCompletionDate", "RequestedServiceCompletionDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getRequoteReason() {
    return getOrCreateProperty("RequoteReason", "RequoteReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ServiceAddress getServiceAddress() {
    return getOrCreateProperty("ServiceAddress", "ServiceAddress", null, pcftest.ServiceRequestDV.ServiceAddress.class);
  }
  
  public ValueElement getServiceRequestNumber() {
    return getOrCreateProperty("ServiceRequestNumber", "ServiceRequestNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestReferenceNumber() {
    return getOrCreateProperty("ServiceRequestReferenceNumber", "ServiceRequestReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ServiceToPerform getServiceToPerform() {
    return getOrCreateProperty("ServiceToPerform", "ServiceToPerform", null, pcftest.ServiceRequestDV.ServiceToPerform.class);
  }
  
  public Specialist getSpecialist() {
    return getOrCreateProperty("Specialist", "Specialist", null, pcftest.ServiceRequestDV.Specialist.class);
  }
  
  public pcftest.ServiceRequestDV.SpecialistCommMethod getSpecialistCommMethod() {
    return getOrCreateProperty("SpecialistCommMethod", "SpecialistCommMethod", null, pcftest.ServiceRequestDV.SpecialistCommMethod.class);
  }
  
  public ValueElement getSpecialistPhone() {
    return getOrCreateProperty("SpecialistPhone", "SpecialistPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Currency extends SelectElement {
    public Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerContact extends SelectElement {
    public CustomerContact(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ServiceRequestDV.CustomerContact.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ServiceRequestDV.CustomerContact.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Kind extends SelectElement {
    public Kind(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ServiceRequestKind arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ServiceRequestKind getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ServiceRequestKind.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ServiceRequestKind arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Progress extends SelectElement {
    public Progress(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ServiceRequestProgress arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ServiceRequestProgress getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ServiceRequestProgress.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ServiceRequestProgress arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuoteStatus extends SelectElement {
    public QuoteStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ServiceRequestQuoteStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ServiceRequestQuoteStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ServiceRequestQuoteStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ServiceRequestQuoteStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceAddress extends PCFElement {
    public ServiceAddress(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceToPerform extends PCFElement {
    public ServiceToPerform(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public InstructionServicesLV_default getInstructionServicesLV_default() {
      return getOrCreateProperty("InstructionServicesLV_default", "InstructionServicesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.InstructionServicesLV_default.class);
    }
    
    public InstructionServicesLV_tb getInstructionServicesLV_tb() {
      return getOrCreateProperty("InstructionServicesLV_tb", "InstructionServicesLV_tb", null, pcftest.ServiceRequestDV.ServiceToPerform.InstructionServicesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InstructionServicesLV_tb extends PCFElement {
      public InstructionServicesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Specialist extends ValueElement {
    public Specialist(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialistCommMethod extends SelectElement {
    public SpecialistCommMethod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.SpecialistCommMethod arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.SpecialistCommMethod getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SpecialistCommMethod.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.SpecialistCommMethod arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}