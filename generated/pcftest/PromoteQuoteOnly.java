package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PromoteQuoteOnly.Cancel;
import pcftest.PromoteQuoteOnly.Edit;
import pcftest.PromoteQuoteOnly.PromoteQuoteOnly_UpLink;
import pcftest.PromoteQuoteOnly.QuoteDocumentsLV;
import pcftest.PromoteQuoteOnly.QuoteDocumentsLV.StatementDocumentsLV_tb;
import pcftest.PromoteQuoteOnly.RemovedServiceTypes;
import pcftest.PromoteQuoteOnly.RemovedServiceTypes.CloseBtn;
import pcftest.PromoteQuoteOnly.Update;
import pcftest.PromoteQuoteOnly._Paging;
import pcftest.PromoteQuoteOnly.__crumb__;
import pcftest.PromoteQuoteOnly._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PromoteQuoteOnly extends PCFLocation {
  public final static String CHECKSUM = "cb96b018cc54cffa15821c86f5a76321";
  
  public PromoteQuoteOnly(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PromoteQuoteOnly"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.PromoteQuoteOnly.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.PromoteQuoteOnly.Edit.class);
  }
  
  public pcftest.PromoteQuoteOnly.NewServiceRequestDV getNewServiceRequestDV() {
    return getOrCreateProperty("NewServiceRequestDV", "NewServiceRequestDV", null, pcftest.PromoteQuoteOnly.NewServiceRequestDV.class);
  }
  
  public PromoteQuoteOnly_UpLink getPromoteQuoteOnly_UpLink() {
    return getOrCreateProperty("PromoteQuoteOnly_UpLink", "PromoteQuoteOnly_UpLink", null, pcftest.PromoteQuoteOnly.PromoteQuoteOnly_UpLink.class);
  }
  
  public QuoteDocumentsLV getQuoteDocumentsLV() {
    return getOrCreateProperty("QuoteDocumentsLV", "QuoteDocumentsLV", null, pcftest.PromoteQuoteOnly.QuoteDocumentsLV.class);
  }
  
  public ValueElement getQuoteLabel() {
    return getOrCreateProperty("QuoteLabel", "QuoteLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RemovedServiceTypes getRemovedServiceTypes() {
    return getOrCreateProperty("RemovedServiceTypes", "RemovedServiceTypes", null, pcftest.PromoteQuoteOnly.RemovedServiceTypes.class);
  }
  
  public StatementDV_invoice getStatementDV_invoice() {
    return getOrCreateProperty("StatementDV_invoice", "StatementDV", null, pcftest.StatementDV_invoice.class);
  }
  
  public StatementDV_quote getStatementDV_quote() {
    return getOrCreateProperty("StatementDV_quote", "StatementDV", null, pcftest.StatementDV_quote.class);
  }
  
  public StatementDV_quoterevision getStatementDV_quoterevision() {
    return getOrCreateProperty("StatementDV_quoterevision", "StatementDV", null, pcftest.StatementDV_quoterevision.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.PromoteQuoteOnly.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PromoteQuoteOnly._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PromoteQuoteOnly.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PromoteQuoteOnly._msgs.class);
  }
  
  public ClaimServiceRequests get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimServiceRequests.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewServiceRequestDV extends PCFElement {
    public NewServiceRequestDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewServiceRequestDV getNewServiceRequestDV() {
      return getOrCreateProperty("NewServiceRequestDV", "NewServiceRequestDV", null, pcftest.NewServiceRequestDV.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PromoteQuoteOnly_UpLink extends ClickableActionElement {
    public PromoteQuoteOnly_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuoteDocumentsLV extends PCFElement {
    public QuoteDocumentsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StatementDocumentsLV getStatementDocumentsLV() {
      return getOrCreateProperty("StatementDocumentsLV", "StatementDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatementDocumentsLV.class);
    }
    
    public StatementDocumentsLV_tb getStatementDocumentsLV_tb() {
      return getOrCreateProperty("StatementDocumentsLV_tb", "StatementDocumentsLV_tb", null, pcftest.PromoteQuoteOnly.QuoteDocumentsLV.StatementDocumentsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatementDocumentsLV_tb extends PCFElement {
      public StatementDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RemovedServiceTypes extends ClickableActionElement {
    public RemovedServiceTypes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.PromoteQuoteOnly.RemovedServiceTypes.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/PromoteQuoteOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}