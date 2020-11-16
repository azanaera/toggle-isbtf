package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNegotiationDetailsDV.EditableNegotiationLinesLV_tb;
import pcftest.ClaimNegotiationDetailsDV.EditableNegotiationLinesLV_tb.Add;
import pcftest.ClaimNegotiationDetailsDV.EditableNegotiationLinesLV_tb.Remove;
import pcftest.ClaimNegotiationDetailsDV.General_NegContact;
import pcftest.ClaimNegotiationDetailsDV.General_NegContact.MenuItem_Search;
import pcftest.ClaimNegotiationDetailsDV.General_NegContact.MenuItem_ViewDetails;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiationDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNegotiationDetailsDV extends DetailViewElement {
  public final static String CHECKSUM = "f1434e84e6cd8ce00742f2aa6430bfc1";
  
  public ClaimNegotiationDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableNegotiationLinesLV getEditableNegotiationLinesLV() {
    return getOrCreateProperty("EditableNegotiationLinesLV", "EditableNegotiationLinesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableNegotiationLinesLV.class);
  }
  
  public EditableNegotiationLinesLV_tb getEditableNegotiationLinesLV_tb() {
    return getOrCreateProperty("EditableNegotiationLinesLV_tb", "EditableNegotiationLinesLV_tb", null, pcftest.ClaimNegotiationDetailsDV.EditableNegotiationLinesLV_tb.class);
  }
  
  public ValueElement getGeneral_AlternativeToSettlement() {
    return getOrCreateProperty("General_AlternativeToSettlement", "General_AlternativeToSettlement", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_DefenseArgument() {
    return getOrCreateProperty("General_DefenseArgument", "General_DefenseArgument", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_MaxOffer() {
    return getOrCreateProperty("General_MaxOffer", "General_MaxOffer", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_Name() {
    return getOrCreateProperty("General_Name", "General_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public General_NegContact getGeneral_NegContact() {
    return getOrCreateProperty("General_NegContact", "General_NegContact", null, pcftest.ClaimNegotiationDetailsDV.General_NegContact.class);
  }
  
  public ValueElement getGeneral_OverallLiabilityAssessment() {
    return getOrCreateProperty("General_OverallLiabilityAssessment", "General_OverallLiabilityAssessment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_PlaintiffArgument() {
    return getOrCreateProperty("General_PlaintiffArgument", "General_PlaintiffArgument", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_SettlementPlan() {
    return getOrCreateProperty("General_SettlementPlan", "General_SettlementPlan", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_TargetOffer() {
    return getOrCreateProperty("General_TargetOffer", "General_TargetOffer", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_TargetOfferRationale() {
    return getOrCreateProperty("General_TargetOfferRationale", "General_TargetOfferRationale", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getNote_RelatedTo() {
    return getOrCreateProperty("Note_RelatedTo", "Note_RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiationDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableNegotiationLinesLV_tb extends PCFElement {
    public EditableNegotiationLinesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ClaimNegotiationDetailsDV.EditableNegotiationLinesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimNegotiationDetailsDV.EditableNegotiationLinesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiationDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimNegotiationDetailsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class General_NegContact extends SelectElement {
    public General_NegContact(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ClaimNegotiationDetailsDV.General_NegContact.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ClaimNegotiationDetailsDV.General_NegContact.MenuItem_ViewDetails.class);
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