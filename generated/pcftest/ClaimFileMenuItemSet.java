package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_Assign;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimExposureValidation;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimValidation;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_CloseClaim;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_CloseExposure;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ExposureValidation;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_PolicyValidation;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_Print;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ReopenClaim;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ReopenExposure;
import pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_SyncStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFileMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "60fe4a7e0fb9fc91db984483a9082ad0";
  
  public ClaimFileMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimMenuActions_ClaimActions getClaimMenuActions_ClaimActions() {
    return getOrCreateProperty("ClaimMenuActions_ClaimActions", "ClaimMenuActions_ClaimActions", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMenuActions_ClaimActions extends ClickableActionElement {
    public ClaimMenuActions_ClaimActions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimMenuActions_Assign getClaimMenuActions_Assign() {
      return getOrCreateProperty("ClaimMenuActions_Assign", "ClaimMenuActions_Assign", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_Assign.class);
    }
    
    public ClaimMenuActions_ClaimExposureValidation getClaimMenuActions_ClaimExposureValidation() {
      return getOrCreateProperty("ClaimMenuActions_ClaimExposureValidation", "ClaimMenuActions_ClaimExposureValidation", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimExposureValidation.class);
    }
    
    public ClaimMenuActions_ClaimValidation getClaimMenuActions_ClaimValidation() {
      return getOrCreateProperty("ClaimMenuActions_ClaimValidation", "ClaimMenuActions_ClaimValidation", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimValidation.class);
    }
    
    public ClaimMenuActions_CloseClaim getClaimMenuActions_CloseClaim() {
      return getOrCreateProperty("ClaimMenuActions_CloseClaim", "ClaimMenuActions_CloseClaim", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_CloseClaim.class);
    }
    
    public ClaimMenuActions_CloseExposure getClaimMenuActions_CloseExposure() {
      return getOrCreateProperty("ClaimMenuActions_CloseExposure", "ClaimMenuActions_CloseExposure", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_CloseExposure.class);
    }
    
    public ClaimMenuActions_ExposureValidation getClaimMenuActions_ExposureValidation() {
      return getOrCreateProperty("ClaimMenuActions_ExposureValidation", "ClaimMenuActions_ExposureValidation", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ExposureValidation.class);
    }
    
    public ClaimMenuActions_PolicyValidation getClaimMenuActions_PolicyValidation() {
      return getOrCreateProperty("ClaimMenuActions_PolicyValidation", "ClaimMenuActions_PolicyValidation", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_PolicyValidation.class);
    }
    
    public ClaimMenuActions_Print getClaimMenuActions_Print() {
      return getOrCreateProperty("ClaimMenuActions_Print", "ClaimMenuActions_Print", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_Print.class);
    }
    
    public ClaimMenuActions_ReopenClaim getClaimMenuActions_ReopenClaim() {
      return getOrCreateProperty("ClaimMenuActions_ReopenClaim", "ClaimMenuActions_ReopenClaim", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ReopenClaim.class);
    }
    
    public ClaimMenuActions_ReopenExposure getClaimMenuActions_ReopenExposure() {
      return getOrCreateProperty("ClaimMenuActions_ReopenExposure", "ClaimMenuActions_ReopenExposure", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ReopenExposure.class);
    }
    
    public ClaimMenuActions_SyncStatus getClaimMenuActions_SyncStatus() {
      return getOrCreateProperty("ClaimMenuActions_SyncStatus", "ClaimMenuActions_SyncStatus", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_SyncStatus.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_Assign extends ClickableActionElement {
      public ClaimMenuActions_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_ClaimExposureValidation extends ClickableActionElement {
      public ClaimMenuActions_ClaimExposureValidation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimExposureValidation.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimExposureValidation.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimExposureValidation.entry.item getitem() {
          return getOrCreateProperty("item", "item", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimExposureValidation.entry.item.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class item extends ClickableActionElement {
          public item(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_ClaimValidation extends ClickableActionElement {
      public ClaimMenuActions_ClaimValidation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimValidation.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimValidation.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimValidation.entry.item getitem() {
          return getOrCreateProperty("item", "item", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ClaimValidation.entry.item.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class item extends ClickableActionElement {
          public item(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_CloseClaim extends ClickableActionElement {
      public ClaimMenuActions_CloseClaim(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CloseClaimPopup click() {
        return clickThis(pcftest.CloseClaimPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_CloseExposure extends ClickableActionElement {
      public ClaimMenuActions_CloseExposure(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CloseExposurePopup click() {
        return clickThis(pcftest.CloseExposurePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_ExposureValidation extends ClickableActionElement {
      public ClaimMenuActions_ExposureValidation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ExposureValidation.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ExposureValidation.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ExposureValidation.entry.item getitem() {
          return getOrCreateProperty("item", "item", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_ExposureValidation.entry.item.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class item extends ClickableActionElement {
          public item(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_PolicyValidation extends ClickableActionElement {
      public ClaimMenuActions_PolicyValidation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_PolicyValidation.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_PolicyValidation.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_PolicyValidation.entry.item getitem() {
          return getOrCreateProperty("item", "item", null, pcftest.ClaimFileMenuItemSet.ClaimMenuActions_ClaimActions.ClaimMenuActions_PolicyValidation.entry.item.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class item extends ClickableActionElement {
          public item(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_Print extends ClickableActionElement {
      public ClaimMenuActions_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPrintout click() {
        return clickThis(pcftest.ClaimPrintout.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_ReopenClaim extends ClickableActionElement {
      public ClaimMenuActions_ReopenClaim(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_ReopenExposure extends ClickableActionElement {
      public ClaimMenuActions_ReopenExposure(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimFileMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_SyncStatus extends ClickableActionElement {
      public ClaimMenuActions_SyncStatus(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimSyncStatusPopup click() {
        return clickThis(pcftest.ClaimSyncStatusPopup.class);
      }
      
      
    }
    
    
  }
  
  
}