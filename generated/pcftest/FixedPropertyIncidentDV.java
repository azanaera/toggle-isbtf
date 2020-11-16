package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FixedPropertyIncidentDV.AllPolicyLocationLienHoldersLV_tb;
import pcftest.FixedPropertyIncidentDV.EstDamageAmt;
import pcftest.FixedPropertyIncidentDV.EstimatedReceived;
import pcftest.FixedPropertyIncidentDV.Owner;
import pcftest.FixedPropertyIncidentDV.Owner.MenuItem_Search;
import pcftest.FixedPropertyIncidentDV.Owner.MenuItem_ViewDetails;
import typekey.EstDamageType;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/FixedPropertyIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixedPropertyIncidentDV extends DetailViewElement {
  public final static String CHECKSUM = "b584bb6bd6be8fa1570e21751d7ee0d4";
  
  public FixedPropertyIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AllPolicyLocationLienHoldersLV getAllPolicyLocationLienHoldersLV() {
    return getOrCreateProperty("AllPolicyLocationLienHoldersLV", "AllPolicyLocationLienHoldersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AllPolicyLocationLienHoldersLV.class);
  }
  
  public AllPolicyLocationLienHoldersLV_tb getAllPolicyLocationLienHoldersLV_tb() {
    return getOrCreateProperty("AllPolicyLocationLienHoldersLV_tb", "AllPolicyLocationLienHoldersLV_tb", null, pcftest.FixedPropertyIncidentDV.AllPolicyLocationLienHoldersLV_tb.class);
  }
  
  public BooleanValueElement getAlreadyRepaired() {
    return getOrCreateProperty("AlreadyRepaired", "AlreadyRepaired", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public pcftest.FixedPropertyIncidentDV.AppraisalServiceInputSet getAppraisalServiceInputSet() {
    return getOrCreateProperty("AppraisalServiceInputSet", "AppraisalServiceInputSet", null, pcftest.FixedPropertyIncidentDV.AppraisalServiceInputSet.class);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EstDamageAmt getEstDamageAmt() {
    return getOrCreateProperty("EstDamageAmt", "EstDamageAmt", null, pcftest.FixedPropertyIncidentDV.EstDamageAmt.class);
  }
  
  public ValueElement getEstimateCost() {
    return getOrCreateProperty("EstimateCost", "EstimateCost", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimateTime() {
    return getOrCreateProperty("EstimateTime", "EstimateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EstimatedReceived getEstimatedReceived() {
    return getOrCreateProperty("EstimatedReceived", "EstimatedReceived", null, pcftest.FixedPropertyIncidentDV.EstimatedReceived.class);
  }
  
  public ValueElement getExtDamagetxt() {
    return getOrCreateProperty("ExtDamagetxt", "ExtDamagetxt", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossEstimate() {
    return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OtherServicesLVInputGroupInputSet getOtherServicesLVInputGroupInputSet() {
    return getOrCreateProperty("OtherServicesLVInputGroupInputSet", "OtherServicesLVInputGroupInputSet", null, pcftest.OtherServicesLVInputGroupInputSet.class);
  }
  
  public Owner getOwner() {
    return getOrCreateProperty("Owner", "Owner", null, pcftest.FixedPropertyIncidentDV.Owner.class);
  }
  
  public PropertyAttributeInputSet getPropertyAttributeInputSet() {
    return getOrCreateProperty("PropertyAttributeInputSet", "PropertyAttributeInputSet", null, pcftest.PropertyAttributeInputSet.class);
  }
  
  public ValueElement getPropertyDescription() {
    return getOrCreateProperty("PropertyDescription", "PropertyDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessage() {
    return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessageFNOL() {
    return getOrCreateProperty("ServiceRequestSubmitMessageFNOL", "ServiceRequestSubmitMessageFNOL", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/FixedPropertyIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AllPolicyLocationLienHoldersLV_tb extends PCFElement {
    public AllPolicyLocationLienHoldersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/FixedPropertyIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppraisalServiceInputSet extends PCFElement {
    public AppraisalServiceInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AppraisalServiceInputSet getAppraisalServiceInputSet() {
      return getOrCreateProperty("AppraisalServiceInputSet", "AppraisalServiceInputSet", null, pcftest.AppraisalServiceInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/FixedPropertyIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EstDamageAmt extends SelectElement {
    public EstDamageAmt(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(EstDamageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public EstDamageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.EstDamageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(EstDamageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/FixedPropertyIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Owner extends SelectElement {
    public Owner(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FixedPropertyIncidentDV.Owner.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FixedPropertyIncidentDV.Owner.MenuItem_ViewDetails.class);
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
  
  
}