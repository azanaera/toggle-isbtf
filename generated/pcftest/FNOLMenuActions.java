package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLMenuActions.NewClaimMenuActions_NewDocument;
import pcftest.FNOLMenuActions.NewClaimMenuActions_NewExposure;
import pcftest.FNOLMenuActions.NewClaimMenuActions_NewNote;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLMenuActions extends PCFElement {
  public final static String CHECKSUM = "257345933d888cb41345ceff4a3a0283";
  
  public FNOLMenuActions(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PCFLocation click() {
    return clickThis(gw.smoketest.platform.web.PCFLocation.class);
  }
  
  public NewClaimMenuActions_NewDocument getNewClaimMenuActions_NewDocument() {
    return getOrCreateProperty("NewClaimMenuActions_NewDocument", "NewClaimMenuActions_NewDocument", null, pcftest.FNOLMenuActions.NewClaimMenuActions_NewDocument.class);
  }
  
  public NewClaimMenuActions_NewExposure getNewClaimMenuActions_NewExposure() {
    return getOrCreateProperty("NewClaimMenuActions_NewExposure", "NewClaimMenuActions_NewExposure", null, pcftest.FNOLMenuActions.NewClaimMenuActions_NewExposure.class);
  }
  
  public NewClaimMenuActions_NewNote getNewClaimMenuActions_NewNote() {
    return getOrCreateProperty("NewClaimMenuActions_NewNote", "NewClaimMenuActions_NewNote", null, pcftest.FNOLMenuActions.NewClaimMenuActions_NewNote.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimMenuActions_NewDocument extends ClickableActionElement {
    public NewClaimMenuActions_NewDocument(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimNewDocumentMenuItemSet getNewClaimNewDocumentMenuItemSet() {
      return getOrCreateProperty("NewClaimNewDocumentMenuItemSet", "NewClaimNewDocumentMenuItemSet", null, pcftest.NewClaimNewDocumentMenuItemSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimMenuActions_NewExposure extends ClickableActionElement {
    public NewClaimMenuActions_NewExposure(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimNewExposureMenuItemSet_both getNewClaimNewExposureMenuItemSet_both() {
      return getOrCreateProperty("NewClaimNewExposureMenuItemSet_both", "NewClaimNewExposureMenuItemSet", null, pcftest.NewClaimNewExposureMenuItemSet_both.class);
    }
    
    public NewClaimNewExposureMenuItemSet_coverage getNewClaimNewExposureMenuItemSet_coverage() {
      return getOrCreateProperty("NewClaimNewExposureMenuItemSet_coverage", "NewClaimNewExposureMenuItemSet", null, pcftest.NewClaimNewExposureMenuItemSet_coverage.class);
    }
    
    public NewClaimNewExposureMenuItemSet_coveragetype getNewClaimNewExposureMenuItemSet_coveragetype() {
      return getOrCreateProperty("NewClaimNewExposureMenuItemSet_coveragetype", "NewClaimNewExposureMenuItemSet", null, pcftest.NewClaimNewExposureMenuItemSet_coveragetype.class);
    }
    
    public NewClaimNewExposureMenuItemSet_none getNewClaimNewExposureMenuItemSet_none() {
      return getOrCreateProperty("NewClaimNewExposureMenuItemSet_none", "NewClaimNewExposureMenuItemSet", null, pcftest.NewClaimNewExposureMenuItemSet_none.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimMenuActions_NewNote extends ClickableActionElement {
    public NewClaimMenuActions_NewNote(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard_NewNoteWorksheet click() {
      return clickThis(pcftest.FNOLWizard_NewNoteWorksheet.class);
    }
    
    
  }
  
  
}