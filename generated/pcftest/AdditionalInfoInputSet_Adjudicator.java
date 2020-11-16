package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdditionalInfoInputSet_Adjudicator.Organization;
import pcftest.AdditionalInfoInputSet_Adjudicator.Organization.MenuItem_Search;
import pcftest.AdditionalInfoInputSet_Adjudicator.Organization.MenuItem_ViewDetails;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.Adjudicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalInfoInputSet_Adjudicator extends AdditionalInfoInputSet {
  public final static String CHECKSUM = "eecc0a301d41a55787064c85ccd22344";
  
  public AdditionalInfoInputSet_Adjudicator(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.AdditionalInfoInputSet_Adjudicator.AdjudicativeDomain getAdjudicativeDomain() {
    return getOrCreateProperty("AdjudicativeDomain", "AdjudicativeDomain", null, pcftest.AdditionalInfoInputSet_Adjudicator.AdjudicativeDomain.class);
  }
  
  public ValueElement getAdjudicatorLicense() {
    return getOrCreateProperty("AdjudicatorLicense", "AdjudicatorLicense", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getAdjudicatorValidFrom() {
    return getOrCreateProperty("AdjudicatorValidFrom", "AdjudicatorValidFrom", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getAdjudicatorValidTo() {
    return getOrCreateProperty("AdjudicatorValidTo", "AdjudicatorValidTo", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.AdditionalInfoInputSet_Adjudicator.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AdditionalInfoInputSet_Adjudicator.Currency.class);
  }
  
  public Organization getOrganization() {
    return getOrCreateProperty("Organization", "Organization", null, pcftest.AdditionalInfoInputSet_Adjudicator.Organization.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.Adjudicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdjudicativeDomain extends SelectElement {
    public AdjudicativeDomain(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.AdjudicativeDomain arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.AdjudicativeDomain getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AdjudicativeDomain.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.AdjudicativeDomain arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.Adjudicator.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  public static class Organization extends SelectElement {
    public Organization(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.AdditionalInfoInputSet_Adjudicator.Organization.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.AdditionalInfoInputSet_Adjudicator.Organization.MenuItem_ViewDetails.class);
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