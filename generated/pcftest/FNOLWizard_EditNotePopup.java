package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_EditNotePopup.FNOLWizard_EditNotePopup_UpLink;
import pcftest.FNOLWizard_EditNotePopup._Paging;
import pcftest.FNOLWizard_EditNotePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_EditNotePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_EditNotePopup extends PCFLocation {
  public final static String CHECKSUM = "135703dbac78287dafd151d3cddd48a7";
  
  public FNOLWizard_EditNotePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FNOLWizard_EditNotePopup"));
  }
  
  public FNOLWizard_EditNotePopup_UpLink getFNOLWizard_EditNotePopup_UpLink() {
    return getOrCreateProperty("FNOLWizard_EditNotePopup_UpLink", "FNOLWizard_EditNotePopup_UpLink", null, pcftest.FNOLWizard_EditNotePopup.FNOLWizard_EditNotePopup_UpLink.class);
  }
  
  public FNOLWizard_EditNoteScreen getFNOLWizard_EditNoteScreen() {
    return getOrCreateProperty("FNOLWizard_EditNoteScreen", "FNOLWizard_EditNoteScreen", null, pcftest.FNOLWizard_EditNoteScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FNOLWizard_EditNotePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FNOLWizard_EditNotePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_EditNotePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_EditNotePopup_UpLink extends ClickableActionElement {
    public FNOLWizard_EditNotePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_EditNotePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_EditNotePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}