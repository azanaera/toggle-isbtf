package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewDocumentFromTemplateScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newdocument/NewDocumentFromTemplateScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewDocumentFromTemplateScreen extends PCFElement {
  public final static String CHECKSUM = "0830bf141c3121262bb7db880e152fb8";
  
  public NewDocumentFromTemplateScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DocumentCreationToolbarButtonSet getDocumentCreationToolbarButtonSet() {
    return getOrCreateProperty("DocumentCreationToolbarButtonSet", "DocumentCreationToolbarButtonSet", null, pcftest.DocumentCreationToolbarButtonSet.class);
  }
  
  public DocumentDetailsEditDVPanelSet getDocumentDetailsEditDVPanelSet() {
    return getOrCreateProperty("DocumentDetailsEditDVPanelSet", "DocumentDetailsEditDVPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.DocumentDetailsEditDVPanelSet.class);
  }
  
  public NewTemplateDocumentDV getNewTemplateDocumentDV() {
    return getOrCreateProperty("NewTemplateDocumentDV", "NewTemplateDocumentDV", null, pcftest.NewTemplateDocumentDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewDocumentFromTemplateScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewDocumentFromTemplateScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}