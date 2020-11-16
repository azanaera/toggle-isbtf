package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentDetailsPrint.DocumentDetailsPrintScreen;
import pcftest.DocumentDetailsPrint.DocumentDetailsPrintScreen._msgs;
import pcftest.DocumentDetailsPrint.DocumentDetailsPrint_UpLink;
import pcftest.DocumentDetailsPrint._Paging;
import pcftest.DocumentDetailsPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/documents/print/DocumentDetailsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsPrint extends PCFLocation {
  public final static String CHECKSUM = "47408eada6505de3055bac4451b6a1a0";
  
  public DocumentDetailsPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DocumentDetailsPrint"));
  }
  
  public DocumentDetailsPrintScreen getDocumentDetailsPrintScreen() {
    return getOrCreateProperty("DocumentDetailsPrintScreen", "DocumentDetailsPrintScreen", null, pcftest.DocumentDetailsPrint.DocumentDetailsPrintScreen.class);
  }
  
  public DocumentDetailsPrint_UpLink getDocumentDetailsPrint_UpLink() {
    return getOrCreateProperty("DocumentDetailsPrint_UpLink", "DocumentDetailsPrint_UpLink", null, pcftest.DocumentDetailsPrint.DocumentDetailsPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DocumentDetailsPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DocumentDetailsPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/print/DocumentDetailsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsPrintScreen extends PCFElement {
    public DocumentDetailsPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DocumentDetailsEditInputSet_default getDocumentDetailsEditInputSet_default() {
      return getOrCreateProperty("DocumentDetailsEditInputSet_default", "DocumentDetailsEditInputSet", null, pcftest.DocumentDetailsEditInputSet_default.class);
    }
    
    public DocumentDetailsEditInputSet_email_sent getDocumentDetailsEditInputSet_email_sent() {
      return getOrCreateProperty("DocumentDetailsEditInputSet_email_sent", "DocumentDetailsEditInputSet", null, pcftest.DocumentDetailsEditInputSet_email_sent.class);
    }
    
    public DocumentDetailsEditSupplementalInputSet getDocumentDetailsEditSupplementalInputSet() {
      return getOrCreateProperty("DocumentDetailsEditSupplementalInputSet", "DocumentDetailsEditSupplementalInputSet", null, pcftest.DocumentDetailsEditSupplementalInputSet.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DocumentDetailsPrint.DocumentDetailsPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/print/DocumentDetailsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/print/DocumentDetailsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsPrint_UpLink extends ClickableActionElement {
    public DocumentDetailsPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/print/DocumentDetailsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/print/DocumentDetailsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}