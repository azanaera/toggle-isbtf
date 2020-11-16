package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddAgreementMenuItemSet.FacultativeSubMenu;
import pcftest.AddAgreementMenuItemSet.FacultativeSubMenu.entry.facSubMenuItem;
import pcftest.AddAgreementMenuItemSet.TreatySubMenu;
import pcftest.AddAgreementMenuItemSet.TreatySubMenu.entry.treatySubMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddAgreementMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "08ae5a2defe26f245d1327681ba279a2";
  
  public AddAgreementMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FacultativeSubMenu getFacultativeSubMenu() {
    return getOrCreateProperty("FacultativeSubMenu", "FacultativeSubMenu", null, pcftest.AddAgreementMenuItemSet.FacultativeSubMenu.class);
  }
  
  public TreatySubMenu getTreatySubMenu() {
    return getOrCreateProperty("TreatySubMenu", "TreatySubMenu", null, pcftest.AddAgreementMenuItemSet.TreatySubMenu.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FacultativeSubMenu extends ClickableActionElement {
    public FacultativeSubMenu(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.AddAgreementMenuItemSet.FacultativeSubMenu.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.AddAgreementMenuItemSet.FacultativeSubMenu.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public facSubMenuItem getfacSubMenuItem() {
        return getOrCreateProperty("facSubMenuItem", "facSubMenuItem", null, pcftest.AddAgreementMenuItemSet.FacultativeSubMenu.entry.facSubMenuItem.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class facSubMenuItem extends ClickableActionElement {
        public facSubMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewRIAgreement click() {
          return clickThis(pcftest.NewRIAgreement.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TreatySubMenu extends ClickableActionElement {
    public TreatySubMenu(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.AddAgreementMenuItemSet.TreatySubMenu.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.AddAgreementMenuItemSet.TreatySubMenu.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public treatySubMenuItem gettreatySubMenuItem() {
        return getOrCreateProperty("treatySubMenuItem", "treatySubMenuItem", null, pcftest.AddAgreementMenuItemSet.TreatySubMenu.entry.treatySubMenuItem.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class treatySubMenuItem extends ClickableActionElement {
        public treatySubMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewRIAgreement click() {
          return clickThis(pcftest.NewRIAgreement.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}