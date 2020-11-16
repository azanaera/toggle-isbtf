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
import pcftest.ClaimDocumentsPrint.ClaimDocumentsPrintScreen;
import pcftest.ClaimDocumentsPrint.ClaimDocumentsPrintScreen.DocumentsLV_tb;
import pcftest.ClaimDocumentsPrint.ClaimDocumentsPrintScreen._msgs;
import pcftest.ClaimDocumentsPrint.ClaimDocumentsPrint_UpLink;
import pcftest.ClaimDocumentsPrint._Paging;
import pcftest.ClaimDocumentsPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimDocumentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimDocumentsPrint extends PCFLocation {
  public final static String CHECKSUM = "d922eba122c6ff2a9a1609af0722f1a7";
  
  public ClaimDocumentsPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimDocumentsPrint"));
  }
  
  public ClaimDocumentsPrintScreen getClaimDocumentsPrintScreen() {
    return getOrCreateProperty("ClaimDocumentsPrintScreen", "ClaimDocumentsPrintScreen", null, pcftest.ClaimDocumentsPrint.ClaimDocumentsPrintScreen.class);
  }
  
  public ClaimDocumentsPrint_UpLink getClaimDocumentsPrint_UpLink() {
    return getOrCreateProperty("ClaimDocumentsPrint_UpLink", "ClaimDocumentsPrint_UpLink", null, pcftest.ClaimDocumentsPrint.ClaimDocumentsPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimDocumentsPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimDocumentsPrint.__crumb__.class);
  }
  
  public ClaimDocuments get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimDocuments.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimDocumentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimDocumentsPrintScreen extends PCFElement {
    public ClaimDocumentsPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DocumentsLV getDocumentsLV() {
      return getOrCreateProperty("DocumentsLV", "DocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DocumentsLV.class);
    }
    
    public DocumentsLV_tb getDocumentsLV_tb() {
      return getOrCreateProperty("DocumentsLV_tb", "DocumentsLV_tb", null, pcftest.ClaimDocumentsPrint.ClaimDocumentsPrintScreen.DocumentsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimDocumentsPrint.ClaimDocumentsPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimDocumentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DocumentsLV_tb extends PCFElement {
      public DocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimDocumentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimDocumentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimDocumentsPrint_UpLink extends ClickableActionElement {
    public ClaimDocumentsPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimDocumentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimDocumentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}