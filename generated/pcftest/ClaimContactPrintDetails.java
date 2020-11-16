package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimContactPrintDetails.ClaimContactPrintDetailScreen;
import pcftest.ClaimContactPrintDetails.ClaimContactPrintDetailScreen.ClaimContactRelatedContactsLV_tb;
import pcftest.ClaimContactPrintDetails.ClaimContactPrintDetailScreen._msgs;
import pcftest.ClaimContactPrintDetails.ClaimContactPrintDetails_UpLink;
import pcftest.ClaimContactPrintDetails._Paging;
import pcftest.ClaimContactPrintDetails.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimContactPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimContactPrintDetails extends PCFLocation {
  public final static String CHECKSUM = "669c22a70e1cbfa574881b3fb0973e1c";
  
  public ClaimContactPrintDetails(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimContactPrintDetails"));
  }
  
  public ClaimContactPrintDetailScreen getClaimContactPrintDetailScreen() {
    return getOrCreateProperty("ClaimContactPrintDetailScreen", "ClaimContactPrintDetailScreen", null, pcftest.ClaimContactPrintDetails.ClaimContactPrintDetailScreen.class);
  }
  
  public ClaimContactPrintDetails_UpLink getClaimContactPrintDetails_UpLink() {
    return getOrCreateProperty("ClaimContactPrintDetails_UpLink", "ClaimContactPrintDetails_UpLink", null, pcftest.ClaimContactPrintDetails.ClaimContactPrintDetails_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimContactPrintDetails._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimContactPrintDetails.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimContactPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactPrintDetailScreen extends PCFElement {
    public ClaimContactPrintDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressesPanelSet getAddressesPanelSet() {
      return getOrCreateProperty("AddressesPanelSet", "AddressesPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.AddressesPanelSet.class);
    }
    
    public ClaimContactRelatedContactsLV getClaimContactRelatedContactsLV() {
      return getOrCreateProperty("ClaimContactRelatedContactsLV", "ClaimContactRelatedContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimContactRelatedContactsLV.class);
    }
    
    public ClaimContactRelatedContactsLV_tb getClaimContactRelatedContactsLV_tb() {
      return getOrCreateProperty("ClaimContactRelatedContactsLV_tb", "ClaimContactRelatedContactsLV_tb", null, pcftest.ClaimContactPrintDetails.ClaimContactPrintDetailScreen.ClaimContactRelatedContactsLV_tb.class);
    }
    
    public ContactBasicsDV_Person getContactBasicsDV_Adjudicator() {
      return getOrCreateProperty("ContactBasicsDV_Adjudicator", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
    }
    
    public ContactBasicsDV_Person getContactBasicsDV_Attorney() {
      return getOrCreateProperty("ContactBasicsDV_Attorney", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
    }
    
    public ContactBasicsDV_Company getContactBasicsDV_AutoRepairShop() {
      return getOrCreateProperty("ContactBasicsDV_AutoRepairShop", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
    }
    
    public ContactBasicsDV_Company getContactBasicsDV_AutoTowingAgcy() {
      return getOrCreateProperty("ContactBasicsDV_AutoTowingAgcy", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
    }
    
    public ContactBasicsDV_Company getContactBasicsDV_Company() {
      return getOrCreateProperty("ContactBasicsDV_Company", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
    }
    
    public ContactBasicsDV_Company getContactBasicsDV_CompanyVendor() {
      return getOrCreateProperty("ContactBasicsDV_CompanyVendor", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
    }
    
    public ContactBasicsDV_Person getContactBasicsDV_Doctor() {
      return getOrCreateProperty("ContactBasicsDV_Doctor", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
    }
    
    public ContactBasicsDV_Company getContactBasicsDV_LawFirm() {
      return getOrCreateProperty("ContactBasicsDV_LawFirm", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
    }
    
    public ContactBasicsDV_Place getContactBasicsDV_LegalVenue() {
      return getOrCreateProperty("ContactBasicsDV_LegalVenue", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Place.class);
    }
    
    public ContactBasicsDV_Company getContactBasicsDV_MedicalCareOrg() {
      return getOrCreateProperty("ContactBasicsDV_MedicalCareOrg", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
    }
    
    public ContactBasicsDV_Person getContactBasicsDV_Person() {
      return getOrCreateProperty("ContactBasicsDV_Person", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
    }
    
    public ContactBasicsDV_Person getContactBasicsDV_PersonVendor() {
      return getOrCreateProperty("ContactBasicsDV_PersonVendor", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
    }
    
    public ContactBasicsDV_Place getContactBasicsDV_Place() {
      return getOrCreateProperty("ContactBasicsDV_Place", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Place.class);
    }
    
    public ContactBasicsDV_Person getContactBasicsDV_UserContact() {
      return getOrCreateProperty("ContactBasicsDV_UserContact", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
    }
    
    public ContactBasicsDV_default getContactBasicsDV_default() {
      return getOrCreateProperty("ContactBasicsDV_default", "ContactBasicsDV", null, pcftest.ContactBasicsDV_default.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimContactPrintDetails.ClaimContactPrintDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimContactPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimContactRelatedContactsLV_tb extends PCFElement {
      public ClaimContactRelatedContactsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimContactPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimContactPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactPrintDetails_UpLink extends ClickableActionElement {
    public ClaimContactPrintDetails_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimContactPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/print/ClaimContactPrintDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}