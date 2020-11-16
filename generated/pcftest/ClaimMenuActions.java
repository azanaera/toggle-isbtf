package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimMenuActions.ClaimMenuActions_NewActivity;
import pcftest.ClaimMenuActions.ClaimMenuActions_NewDocument;
import pcftest.ClaimMenuActions.ClaimMenuActions_NewExposure;
import pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction;
import pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewOtherTrans;
import pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewOtherTrans.ClaimMenuActions_NewTransaction_Check;
import pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewOtherTrans.ClaimMenuActions_NewTransaction_RecoveryReserveSet;
import pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewOtherTrans.ClaimMenuActions_NewTransaction_RecoverySet;
import pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewTransaction_CheckSet;
import pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewTransaction_ReserveSet;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimMenuActions extends PCFElement {
  public final static String CHECKSUM = "ecf4878bd48d56231bd982aac1baafd9";
  
  public ClaimMenuActions(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PCFLocation click() {
    return clickThis(gw.smoketest.platform.web.PCFLocation.class);
  }
  
  public ClaimFileMenuItemSet getClaimFileMenuItemSet() {
    return getOrCreateProperty("ClaimFileMenuItemSet", "ClaimFileMenuItemSet", null, pcftest.ClaimFileMenuItemSet.class);
  }
  
  public ClaimMenuActions_NewActivity getClaimMenuActions_NewActivity() {
    return getOrCreateProperty("ClaimMenuActions_NewActivity", "ClaimMenuActions_NewActivity", null, pcftest.ClaimMenuActions.ClaimMenuActions_NewActivity.class);
  }
  
  public ClaimMenuActions_NewDocument getClaimMenuActions_NewDocument() {
    return getOrCreateProperty("ClaimMenuActions_NewDocument", "ClaimMenuActions_NewDocument", null, pcftest.ClaimMenuActions.ClaimMenuActions_NewDocument.class);
  }
  
  public ClaimMenuActions_NewExposure getClaimMenuActions_NewExposure() {
    return getOrCreateProperty("ClaimMenuActions_NewExposure", "ClaimMenuActions_NewExposure", null, pcftest.ClaimMenuActions.ClaimMenuActions_NewExposure.class);
  }
  
  public ClaimMenuActions_NewTransaction getClaimMenuActions_NewTransaction() {
    return getOrCreateProperty("ClaimMenuActions_NewTransaction", "ClaimMenuActions_NewTransaction", null, pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.class);
  }
  
  public ClaimNewOtherMenuItemSet getClaimNewOtherMenuItemSet() {
    return getOrCreateProperty("ClaimNewOtherMenuItemSet", "ClaimNewOtherMenuItemSet", null, pcftest.ClaimNewOtherMenuItemSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMenuActions_NewActivity extends ClickableActionElement {
    public ClaimMenuActions_NewActivity(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewActivityMenuItemSet getNewActivityMenuItemSet() {
      return getOrCreateProperty("NewActivityMenuItemSet", "NewActivityMenuItemSet", null, pcftest.NewActivityMenuItemSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMenuActions_NewDocument extends ClickableActionElement {
    public ClaimMenuActions_NewDocument(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimNewDocumentMenuItemSet getClaimNewDocumentMenuItemSet() {
      return getOrCreateProperty("ClaimNewDocumentMenuItemSet", "ClaimNewDocumentMenuItemSet", null, pcftest.ClaimNewDocumentMenuItemSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMenuActions_NewExposure extends ClickableActionElement {
    public ClaimMenuActions_NewExposure(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewExposureMenuItemSet_both getNewExposureMenuItemSet_both() {
      return getOrCreateProperty("NewExposureMenuItemSet_both", "NewExposureMenuItemSet", null, pcftest.NewExposureMenuItemSet_both.class);
    }
    
    public NewExposureMenuItemSet_coverage getNewExposureMenuItemSet_coverage() {
      return getOrCreateProperty("NewExposureMenuItemSet_coverage", "NewExposureMenuItemSet", null, pcftest.NewExposureMenuItemSet_coverage.class);
    }
    
    public NewExposureMenuItemSet_coveragetype getNewExposureMenuItemSet_coveragetype() {
      return getOrCreateProperty("NewExposureMenuItemSet_coveragetype", "NewExposureMenuItemSet", null, pcftest.NewExposureMenuItemSet_coveragetype.class);
    }
    
    public NewExposureMenuItemSet_none getNewExposureMenuItemSet_none() {
      return getOrCreateProperty("NewExposureMenuItemSet_none", "NewExposureMenuItemSet", null, pcftest.NewExposureMenuItemSet_none.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMenuActions_NewTransaction extends ClickableActionElement {
    public ClaimMenuActions_NewTransaction(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimMenuActions_NewOtherTrans getClaimMenuActions_NewOtherTrans() {
      return getOrCreateProperty("ClaimMenuActions_NewOtherTrans", "ClaimMenuActions_NewOtherTrans", null, pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewOtherTrans.class);
    }
    
    public ClaimMenuActions_NewTransaction_CheckSet getClaimMenuActions_NewTransaction_CheckSet() {
      return getOrCreateProperty("ClaimMenuActions_NewTransaction_CheckSet", "ClaimMenuActions_NewTransaction_CheckSet", null, pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewTransaction_CheckSet.class);
    }
    
    public ClaimMenuActions_NewTransaction_ReserveSet getClaimMenuActions_NewTransaction_ReserveSet() {
      return getOrCreateProperty("ClaimMenuActions_NewTransaction_ReserveSet", "ClaimMenuActions_NewTransaction_ReserveSet", null, pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewTransaction_ReserveSet.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_NewOtherTrans extends ClickableActionElement {
      public ClaimMenuActions_NewOtherTrans(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimMenuActions_NewTransaction_Check getClaimMenuActions_NewTransaction_Check() {
        return getOrCreateProperty("ClaimMenuActions_NewTransaction_Check", "ClaimMenuActions_NewTransaction_Check", null, pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewOtherTrans.ClaimMenuActions_NewTransaction_Check.class);
      }
      
      public ClaimMenuActions_NewTransaction_RecoveryReserveSet getClaimMenuActions_NewTransaction_RecoveryReserveSet() {
        return getOrCreateProperty("ClaimMenuActions_NewTransaction_RecoveryReserveSet", "ClaimMenuActions_NewTransaction_RecoveryReserveSet", null, pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewOtherTrans.ClaimMenuActions_NewTransaction_RecoveryReserveSet.class);
      }
      
      public ClaimMenuActions_NewTransaction_RecoverySet getClaimMenuActions_NewTransaction_RecoverySet() {
        return getOrCreateProperty("ClaimMenuActions_NewTransaction_RecoverySet", "ClaimMenuActions_NewTransaction_RecoverySet", null, pcftest.ClaimMenuActions.ClaimMenuActions_NewTransaction.ClaimMenuActions_NewOtherTrans.ClaimMenuActions_NewTransaction_RecoverySet.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimMenuActions_NewTransaction_Check extends ClickableActionElement {
        public ClaimMenuActions_NewTransaction_Check(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimMenuActions_NewTransaction_RecoveryReserveSet extends ClickableActionElement {
        public ClaimMenuActions_NewTransaction_RecoveryReserveSet(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewRecoveryReserveSet click() {
          return clickThis(pcftest.NewRecoveryReserveSet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimMenuActions_NewTransaction_RecoverySet extends ClickableActionElement {
        public ClaimMenuActions_NewTransaction_RecoverySet(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewRecoverySet click() {
          return clickThis(pcftest.NewRecoverySet.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_NewTransaction_CheckSet extends ClickableActionElement {
      public ClaimMenuActions_NewTransaction_CheckSet(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/ClaimMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_NewTransaction_ReserveSet extends ClickableActionElement {
      public ClaimMenuActions_NewTransaction_ReserveSet(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewReserveSet click() {
        return clickThis(pcftest.NewReserveSet.class);
      }
      
      
    }
    
    
  }
  
  
}