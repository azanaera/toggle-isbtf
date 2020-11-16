package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb;
import pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.Add;
import pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.AddCovTerm;
import pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.AddCovTerm.entry;
import pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.AddCovTerm.entry.CovTermMenuItem;
import pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.Remove;
import pcftest.ClaimPolicyCovTermsCV.CovTermsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyCovTermsCV extends PCFElement {
  public final static String CHECKSUM = "5f910a5bff9c737bb8dd98b53522b0a6";
  
  public ClaimPolicyCovTermsCV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimPolicyCovTermsLV getClaimPolicyCovTermsLV() {
    return getOrCreateProperty("ClaimPolicyCovTermsLV", "ClaimPolicyCovTermsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimPolicyCovTermsLV.class);
  }
  
  public ClaimPolicyCovTermsLV_tb getClaimPolicyCovTermsLV_tb() {
    return getOrCreateProperty("ClaimPolicyCovTermsLV_tb", "ClaimPolicyCovTermsLV_tb", null, pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.class);
  }
  
  public CovTermsTab getCovTermsTab() {
    return getOrCreateProperty("CovTermsTab", "CovTermsTab", null, pcftest.ClaimPolicyCovTermsCV.CovTermsTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyCovTermsLV_tb extends PCFElement {
    public ClaimPolicyCovTermsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.Add.class);
    }
    
    public AddCovTerm getAddCovTerm() {
      return getOrCreateProperty("AddCovTerm", "AddCovTerm", null, pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.AddCovTerm.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddCovTerm extends ClickableActionElement {
      public AddCovTerm(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.AddCovTerm.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public CovTermMenuItem getCovTermMenuItem() {
          return getOrCreateProperty("CovTermMenuItem", "CovTermMenuItem", null, pcftest.ClaimPolicyCovTermsCV.ClaimPolicyCovTermsLV_tb.AddCovTerm.entry.CovTermMenuItem.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class CovTermMenuItem extends ClickableActionElement {
          public CovTermMenuItem(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public CovTermPopup click() {
            return clickThis(pcftest.CovTermPopup.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CovTermsTab extends ClickableActionElement {
    public CovTermsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}