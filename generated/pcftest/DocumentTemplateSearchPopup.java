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
import pcftest.DocumentTemplateSearchPopup.DocumentTemplateSearchPopup_UpLink;
import pcftest.DocumentTemplateSearchPopup.DocumentTemplateSearchScreen;
import pcftest.DocumentTemplateSearchPopup.DocumentTemplateSearchScreen.DocumentTemplateSearchResultLV_tb;
import pcftest.DocumentTemplateSearchPopup.DocumentTemplateSearchScreen._msgs;
import pcftest.DocumentTemplateSearchPopup.DocumentTemplateSearchScreen.cancel;
import pcftest.DocumentTemplateSearchPopup._Paging;
import pcftest.DocumentTemplateSearchPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateSearchPopup extends PCFLocation {
  public final static String CHECKSUM = "30f1c83dd6633b3ddbc06713bc4f8629";
  
  public DocumentTemplateSearchPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DocumentTemplateSearchPopup"));
  }
  
  public DocumentTemplateSearchPopup_UpLink getDocumentTemplateSearchPopup_UpLink() {
    return getOrCreateProperty("DocumentTemplateSearchPopup_UpLink", "DocumentTemplateSearchPopup_UpLink", null, pcftest.DocumentTemplateSearchPopup.DocumentTemplateSearchPopup_UpLink.class);
  }
  
  public DocumentTemplateSearchScreen getDocumentTemplateSearchScreen() {
    return getOrCreateProperty("DocumentTemplateSearchScreen", "DocumentTemplateSearchScreen", null, pcftest.DocumentTemplateSearchPopup.DocumentTemplateSearchScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DocumentTemplateSearchPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DocumentTemplateSearchPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentTemplateSearchPopup_UpLink extends ClickableActionElement {
    public DocumentTemplateSearchPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentTemplateSearchScreen extends PCFElement {
    public DocumentTemplateSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DocumentTemplateSearchDV getDocumentTemplateSearchDV() {
      return getOrCreateProperty("DocumentTemplateSearchDV", "DocumentTemplateSearchDV", null, pcftest.DocumentTemplateSearchDV.class);
    }
    
    public DocumentTemplateSearchResultLV getDocumentTemplateSearchResultLV() {
      return getOrCreateProperty("DocumentTemplateSearchResultLV", "DocumentTemplateSearchResultLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DocumentTemplateSearchResultLV.class);
    }
    
    public DocumentTemplateSearchResultLV_tb getDocumentTemplateSearchResultLV_tb() {
      return getOrCreateProperty("DocumentTemplateSearchResultLV_tb", "DocumentTemplateSearchResultLV_tb", null, pcftest.DocumentTemplateSearchPopup.DocumentTemplateSearchScreen.DocumentTemplateSearchResultLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DocumentTemplateSearchPopup.DocumentTemplateSearchScreen._msgs.class);
    }
    
    public cancel getcancel() {
      return getOrCreateProperty("cancel", "cancel", null, pcftest.DocumentTemplateSearchPopup.DocumentTemplateSearchScreen.cancel.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DocumentTemplateSearchResultLV_tb extends PCFElement {
      public DocumentTemplateSearchResultLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class cancel extends ClickableActionElement {
      public cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}