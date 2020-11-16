package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookContactDetailScreen_default.AddressBookAddressesPanelSet_tb;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactActivitiesCardTab;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactActivitiesLV_tb;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactAddressesCardTab;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactBasicsCardTab;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactBasicsDV_tb;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactClaimsCardTab;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactClaimsLV_tb;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactDocumentsCardTab;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactDocumentsLV_tb;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactExposuresCardTab;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactExposuresLV_tb;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactMattersCardTab;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactMattersLV_tb;
import pcftest.AddressBookContactDetailScreen_default.AddressBookContactRelatedContactsCardTab;
import pcftest.AddressBookContactDetailScreen_default.AddressBookRelatedContactsLV_tb;
import pcftest.AddressBookContactDetailScreen_default.ReviewsCardTab;
import pcftest.AddressBookContactDetailScreen_default.ShowActivitiesButton;
import pcftest.AddressBookContactDetailScreen_default.ShowClaimsButton;
import pcftest.AddressBookContactDetailScreen_default.ShowExposuresButton;
import pcftest.AddressBookContactDetailScreen_default.ShowMattersButton;
import pcftest.AddressBookContactDetailScreen_default.ViewInCM;
import pcftest.AddressBookContactDetailScreen_default._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactDetailScreen_default extends AddressBookContactDetailScreen {
  public final static String CHECKSUM = "63521db3f25f40b0b8feebd125cd2560";
  
  public AddressBookContactDetailScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookAddressesPanelSet getAddressBookAddressesPanelSet() {
    return getOrCreateProperty("AddressBookAddressesPanelSet", "AddressBookAddressesPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.AddressBookAddressesPanelSet.class);
  }
  
  public AddressBookAddressesPanelSet_tb getAddressBookAddressesPanelSet_tb() {
    return getOrCreateProperty("AddressBookAddressesPanelSet_tb", "AddressBookAddressesPanelSet_tb", null, pcftest.AddressBookContactDetailScreen_default.AddressBookAddressesPanelSet_tb.class);
  }
  
  public AddressBookContactActivitiesCardTab getAddressBookContactActivitiesCardTab() {
    return getOrCreateProperty("AddressBookContactActivitiesCardTab", "AddressBookContactActivitiesCardTab", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactActivitiesCardTab.class);
  }
  
  public AddressBookContactActivitiesLV getAddressBookContactActivitiesLV() {
    return getOrCreateProperty("AddressBookContactActivitiesLV", "AddressBookContactActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactActivitiesLV.class);
  }
  
  public AddressBookContactActivitiesLV_tb getAddressBookContactActivitiesLV_tb() {
    return getOrCreateProperty("AddressBookContactActivitiesLV_tb", "AddressBookContactActivitiesLV_tb", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactActivitiesLV_tb.class);
  }
  
  public AddressBookContactAddressesCardTab getAddressBookContactAddressesCardTab() {
    return getOrCreateProperty("AddressBookContactAddressesCardTab", "AddressBookContactAddressesCardTab", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactAddressesCardTab.class);
  }
  
  public AddressBookContactBasicsCardTab getAddressBookContactBasicsCardTab() {
    return getOrCreateProperty("AddressBookContactBasicsCardTab", "AddressBookContactBasicsCardTab", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactBasicsCardTab.class);
  }
  
  public AddressBookContactBasicsDV_Person getAddressBookContactBasicsDV_Adjudicator() {
    return getOrCreateProperty("AddressBookContactBasicsDV_Adjudicator", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Person.class);
  }
  
  public AddressBookContactBasicsDV_Person getAddressBookContactBasicsDV_Attorney() {
    return getOrCreateProperty("AddressBookContactBasicsDV_Attorney", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Person.class);
  }
  
  public AddressBookContactBasicsDV_Company getAddressBookContactBasicsDV_AutoRepairShop() {
    return getOrCreateProperty("AddressBookContactBasicsDV_AutoRepairShop", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Company.class);
  }
  
  public AddressBookContactBasicsDV_Company getAddressBookContactBasicsDV_AutoTowingAgcy() {
    return getOrCreateProperty("AddressBookContactBasicsDV_AutoTowingAgcy", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Company.class);
  }
  
  public AddressBookContactBasicsDV_Company getAddressBookContactBasicsDV_Company() {
    return getOrCreateProperty("AddressBookContactBasicsDV_Company", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Company.class);
  }
  
  public AddressBookContactBasicsDV_Company getAddressBookContactBasicsDV_CompanyVendor() {
    return getOrCreateProperty("AddressBookContactBasicsDV_CompanyVendor", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Company.class);
  }
  
  public AddressBookContactBasicsDV_Person getAddressBookContactBasicsDV_Doctor() {
    return getOrCreateProperty("AddressBookContactBasicsDV_Doctor", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Person.class);
  }
  
  public AddressBookContactBasicsDV_Company getAddressBookContactBasicsDV_LawFirm() {
    return getOrCreateProperty("AddressBookContactBasicsDV_LawFirm", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Company.class);
  }
  
  public AddressBookContactBasicsDV_Place getAddressBookContactBasicsDV_LegalVenue() {
    return getOrCreateProperty("AddressBookContactBasicsDV_LegalVenue", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Place.class);
  }
  
  public AddressBookContactBasicsDV_Company getAddressBookContactBasicsDV_MedicalCareOrg() {
    return getOrCreateProperty("AddressBookContactBasicsDV_MedicalCareOrg", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Company.class);
  }
  
  public AddressBookContactBasicsDV_Person getAddressBookContactBasicsDV_Person() {
    return getOrCreateProperty("AddressBookContactBasicsDV_Person", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Person.class);
  }
  
  public AddressBookContactBasicsDV_Person getAddressBookContactBasicsDV_PersonVendor() {
    return getOrCreateProperty("AddressBookContactBasicsDV_PersonVendor", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Person.class);
  }
  
  public AddressBookContactBasicsDV_Place getAddressBookContactBasicsDV_Place() {
    return getOrCreateProperty("AddressBookContactBasicsDV_Place", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Place.class);
  }
  
  public AddressBookContactBasicsDV_Person getAddressBookContactBasicsDV_UserContact() {
    return getOrCreateProperty("AddressBookContactBasicsDV_UserContact", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_Person.class);
  }
  
  public AddressBookContactBasicsDV_default getAddressBookContactBasicsDV_default() {
    return getOrCreateProperty("AddressBookContactBasicsDV_default", "AddressBookContactBasicsDV", null, pcftest.AddressBookContactBasicsDV_default.class);
  }
  
  public AddressBookContactBasicsDV_tb getAddressBookContactBasicsDV_tb() {
    return getOrCreateProperty("AddressBookContactBasicsDV_tb", "AddressBookContactBasicsDV_tb", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactBasicsDV_tb.class);
  }
  
  public AddressBookContactClaimsCardTab getAddressBookContactClaimsCardTab() {
    return getOrCreateProperty("AddressBookContactClaimsCardTab", "AddressBookContactClaimsCardTab", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactClaimsCardTab.class);
  }
  
  public AddressBookContactClaimsLV getAddressBookContactClaimsLV() {
    return getOrCreateProperty("AddressBookContactClaimsLV", "AddressBookContactClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactClaimsLV.class);
  }
  
  public AddressBookContactClaimsLV_tb getAddressBookContactClaimsLV_tb() {
    return getOrCreateProperty("AddressBookContactClaimsLV_tb", "AddressBookContactClaimsLV_tb", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactClaimsLV_tb.class);
  }
  
  public AddressBookContactDocumentsCardTab getAddressBookContactDocumentsCardTab() {
    return getOrCreateProperty("AddressBookContactDocumentsCardTab", "AddressBookContactDocumentsCardTab", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactDocumentsCardTab.class);
  }
  
  public AddressBookContactDocumentsLV getAddressBookContactDocumentsLV() {
    return getOrCreateProperty("AddressBookContactDocumentsLV", "AddressBookContactDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactDocumentsLV.class);
  }
  
  public AddressBookContactDocumentsLV_tb getAddressBookContactDocumentsLV_tb() {
    return getOrCreateProperty("AddressBookContactDocumentsLV_tb", "AddressBookContactDocumentsLV_tb", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactDocumentsLV_tb.class);
  }
  
  public AddressBookContactExposuresCardTab getAddressBookContactExposuresCardTab() {
    return getOrCreateProperty("AddressBookContactExposuresCardTab", "AddressBookContactExposuresCardTab", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactExposuresCardTab.class);
  }
  
  public AddressBookContactExposuresLV getAddressBookContactExposuresLV() {
    return getOrCreateProperty("AddressBookContactExposuresLV", "AddressBookContactExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactExposuresLV.class);
  }
  
  public AddressBookContactExposuresLV_tb getAddressBookContactExposuresLV_tb() {
    return getOrCreateProperty("AddressBookContactExposuresLV_tb", "AddressBookContactExposuresLV_tb", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactExposuresLV_tb.class);
  }
  
  public AddressBookContactMattersCardTab getAddressBookContactMattersCardTab() {
    return getOrCreateProperty("AddressBookContactMattersCardTab", "AddressBookContactMattersCardTab", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactMattersCardTab.class);
  }
  
  public AddressBookContactMattersLV getAddressBookContactMattersLV() {
    return getOrCreateProperty("AddressBookContactMattersLV", "AddressBookContactMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactMattersLV.class);
  }
  
  public AddressBookContactMattersLV_tb getAddressBookContactMattersLV_tb() {
    return getOrCreateProperty("AddressBookContactMattersLV_tb", "AddressBookContactMattersLV_tb", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactMattersLV_tb.class);
  }
  
  public AddressBookContactRelatedContactsCardTab getAddressBookContactRelatedContactsCardTab() {
    return getOrCreateProperty("AddressBookContactRelatedContactsCardTab", "AddressBookContactRelatedContactsCardTab", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactRelatedContactsCardTab.class);
  }
  
  public AddressBookRelatedContactsLV getAddressBookRelatedContactsLV() {
    return getOrCreateProperty("AddressBookRelatedContactsLV", "AddressBookRelatedContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookRelatedContactsLV.class);
  }
  
  public AddressBookRelatedContactsLV_tb getAddressBookRelatedContactsLV_tb() {
    return getOrCreateProperty("AddressBookRelatedContactsLV_tb", "AddressBookRelatedContactsLV_tb", null, pcftest.AddressBookContactDetailScreen_default.AddressBookRelatedContactsLV_tb.class);
  }
  
  public ReviewsCardTab getReviewsCardTab() {
    return getOrCreateProperty("ReviewsCardTab", "ReviewsCardTab", null, pcftest.AddressBookContactDetailScreen_default.ReviewsCardTab.class);
  }
  
  public ReviewsPanelSet getReviewsPanelSet() {
    return getOrCreateProperty("ReviewsPanelSet", "ReviewsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ReviewsPanelSet.class);
  }
  
  public ShowActivitiesButton getShowActivitiesButton() {
    return getOrCreateProperty("ShowActivitiesButton", "ShowActivitiesButton", null, pcftest.AddressBookContactDetailScreen_default.ShowActivitiesButton.class);
  }
  
  public ShowClaimsButton getShowClaimsButton() {
    return getOrCreateProperty("ShowClaimsButton", "ShowClaimsButton", null, pcftest.AddressBookContactDetailScreen_default.ShowClaimsButton.class);
  }
  
  public ShowExposuresButton getShowExposuresButton() {
    return getOrCreateProperty("ShowExposuresButton", "ShowExposuresButton", null, pcftest.AddressBookContactDetailScreen_default.ShowExposuresButton.class);
  }
  
  public ShowMattersButton getShowMattersButton() {
    return getOrCreateProperty("ShowMattersButton", "ShowMattersButton", null, pcftest.AddressBookContactDetailScreen_default.ShowMattersButton.class);
  }
  
  public ViewInCM getViewInCM() {
    return getOrCreateProperty("ViewInCM", "ViewInCM", null, pcftest.AddressBookContactDetailScreen_default.ViewInCM.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AddressBookContactDetailScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookAddressesPanelSet_tb extends PCFElement {
    public AddressBookAddressesPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AddressBookContactDetailScreen_default.AddressBookAddressesPanelSet_tb.PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.AddressBookContactDetailScreen_default.AddressBookAddressesPanelSet_tb.PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactActivitiesCardTab extends ClickableActionElement {
    public AddressBookContactActivitiesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactActivitiesLV_tb extends PCFElement {
    public AddressBookContactActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AddressBookContactDetailScreen_default.AddressBookContactActivitiesLV_tb.PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactActivitiesLV_tb.PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactAddressesCardTab extends ClickableActionElement {
    public AddressBookContactAddressesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactBasicsCardTab extends ClickableActionElement {
    public AddressBookContactBasicsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactBasicsDV_tb extends PCFElement {
    public AddressBookContactBasicsDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AddressBookContactDetailScreen_default.AddressBookContactBasicsDV_tb.PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactBasicsDV_tb.PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactClaimsCardTab extends ClickableActionElement {
    public AddressBookContactClaimsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactClaimsLV_tb extends PCFElement {
    public AddressBookContactClaimsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AddressBookContactDetailScreen_default.AddressBookContactClaimsLV_tb.PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactClaimsLV_tb.PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactDocumentsCardTab extends ClickableActionElement {
    public AddressBookContactDocumentsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactDocumentsLV_tb extends PCFElement {
    public AddressBookContactDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactExposuresCardTab extends ClickableActionElement {
    public AddressBookContactExposuresCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactExposuresLV_tb extends PCFElement {
    public AddressBookContactExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AddressBookContactDetailScreen_default.AddressBookContactExposuresLV_tb.PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactExposuresLV_tb.PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactMattersCardTab extends ClickableActionElement {
    public AddressBookContactMattersCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactMattersLV_tb extends PCFElement {
    public AddressBookContactMattersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AddressBookContactDetailScreen_default.AddressBookContactMattersLV_tb.PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.AddressBookContactDetailScreen_default.AddressBookContactMattersLV_tb.PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactRelatedContactsCardTab extends ClickableActionElement {
    public AddressBookContactRelatedContactsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookRelatedContactsLV_tb extends PCFElement {
    public AddressBookRelatedContactsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AddressBookContactDetailScreen_default.AddressBookRelatedContactsLV_tb.PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.AddressBookContactDetailScreen_default.AddressBookRelatedContactsLV_tb.PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviewsCardTab extends ClickableActionElement {
    public ReviewsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ShowActivitiesButton extends ValueElement {
    public ShowActivitiesButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ShowClaimsButton extends ValueElement {
    public ShowClaimsButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ShowExposuresButton extends ValueElement {
    public ShowExposuresButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ShowMattersButton extends ValueElement {
    public ShowMattersButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewInCM extends ClickableActionElement {
    public ViewInCM(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}