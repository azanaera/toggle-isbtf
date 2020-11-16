package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_DocumentsScreen.RefreshAsyncContent;
import pcftest.NewClaimWizard_DocumentsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_DocumentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_DocumentsScreen extends PCFElement {
  public final static String CHECKSUM = "fa5f04603041b888bf8fb93fe2d2424a";
  
  public NewClaimWizard_DocumentsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimDocumentsLV getNewClaimDocumentsLV() {
    return getOrCreateProperty("NewClaimDocumentsLV", "NewClaimDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimDocumentsLV.class);
  }
  
  public RefreshAsyncContent getRefreshAsyncContent() {
    return getOrCreateProperty("RefreshAsyncContent", "RefreshAsyncContent", null, pcftest.NewClaimWizard_DocumentsScreen.RefreshAsyncContent.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_DocumentsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_DocumentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RefreshAsyncContent extends ClickableActionElement {
    public RefreshAsyncContent(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_DocumentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}