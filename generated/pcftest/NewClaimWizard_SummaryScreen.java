package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_SummaryScreen.NewClaimSummaryExposuresLV_tb;
import pcftest.NewClaimWizard_SummaryScreen.NewClaimSummaryPeopleInvolvedLV_tb;
import pcftest.NewClaimWizard_SummaryScreen.NotesLV_tb;
import pcftest.NewClaimWizard_SummaryScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_SummaryScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_SummaryScreen extends PCFElement {
  public final static String CHECKSUM = "96b91f674f2fe6ff982c216c56cc41fe";
  
  public NewClaimWizard_SummaryScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSummaryDV getClaimSummaryDV() {
    return getOrCreateProperty("ClaimSummaryDV", "ClaimSummaryDV", null, pcftest.ClaimSummaryDV.class);
  }
  
  public NewClaimSummaryExposuresLV getNewClaimSummaryExposuresLV() {
    return getOrCreateProperty("NewClaimSummaryExposuresLV", "NewClaimSummaryExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimSummaryExposuresLV.class);
  }
  
  public NewClaimSummaryExposuresLV_tb getNewClaimSummaryExposuresLV_tb() {
    return getOrCreateProperty("NewClaimSummaryExposuresLV_tb", "NewClaimSummaryExposuresLV_tb", null, pcftest.NewClaimWizard_SummaryScreen.NewClaimSummaryExposuresLV_tb.class);
  }
  
  public NewClaimSummaryPeopleInvolvedLV getNewClaimSummaryPeopleInvolvedLV() {
    return getOrCreateProperty("NewClaimSummaryPeopleInvolvedLV", "NewClaimSummaryPeopleInvolvedLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimSummaryPeopleInvolvedLV.class);
  }
  
  public NewClaimSummaryPeopleInvolvedLV_tb getNewClaimSummaryPeopleInvolvedLV_tb() {
    return getOrCreateProperty("NewClaimSummaryPeopleInvolvedLV_tb", "NewClaimSummaryPeopleInvolvedLV_tb", null, pcftest.NewClaimWizard_SummaryScreen.NewClaimSummaryPeopleInvolvedLV_tb.class);
  }
  
  public NotesLV getNotesLV() {
    return getOrCreateProperty("NotesLV", "NotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NotesLV.class);
  }
  
  public NotesLV_tb getNotesLV_tb() {
    return getOrCreateProperty("NotesLV_tb", "NotesLV_tb", null, pcftest.NewClaimWizard_SummaryScreen.NotesLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_SummaryScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_SummaryScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimSummaryExposuresLV_tb extends PCFElement {
    public NewClaimSummaryExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_SummaryScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimSummaryPeopleInvolvedLV_tb extends PCFElement {
    public NewClaimSummaryPeopleInvolvedLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_SummaryScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesLV_tb extends PCFElement {
    public NotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_SummaryScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}