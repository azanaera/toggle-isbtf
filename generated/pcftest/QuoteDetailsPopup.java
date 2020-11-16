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
import pcftest.QuoteDetailsPopup.ApproveQuote;
import pcftest.QuoteDetailsPopup.QuoteDetailsPopup_UpLink;
import pcftest.QuoteDetailsPopup.RequestRequote;
import pcftest.QuoteDetailsPopup.ReviseQuote;
import pcftest.QuoteDetailsPopup.StatementDocumentsLV_tb;
import pcftest.QuoteDetailsPopup._Paging;
import pcftest.QuoteDetailsPopup.__crumb__;
import pcftest.QuoteDetailsPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuoteDetailsPopup extends PCFLocation {
  public final static String CHECKSUM = "9152a46e4b9b0cacf86706af3750051a";
  
  public QuoteDetailsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("QuoteDetailsPopup"));
  }
  
  public ApproveQuote getApproveQuote() {
    return getOrCreateProperty("ApproveQuote", "ApproveQuote", null, pcftest.QuoteDetailsPopup.ApproveQuote.class);
  }
  
  public QuoteDetailsPopup_UpLink getQuoteDetailsPopup_UpLink() {
    return getOrCreateProperty("QuoteDetailsPopup_UpLink", "QuoteDetailsPopup_UpLink", null, pcftest.QuoteDetailsPopup.QuoteDetailsPopup_UpLink.class);
  }
  
  public RequestRequote getRequestRequote() {
    return getOrCreateProperty("RequestRequote", "RequestRequote", null, pcftest.QuoteDetailsPopup.RequestRequote.class);
  }
  
  public ReviseQuote getReviseQuote() {
    return getOrCreateProperty("ReviseQuote", "ReviseQuote", null, pcftest.QuoteDetailsPopup.ReviseQuote.class);
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
  
  public StatementDocumentsLV getStatementDocumentsLV() {
    return getOrCreateProperty("StatementDocumentsLV", "StatementDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatementDocumentsLV.class);
  }
  
  public StatementDocumentsLV_tb getStatementDocumentsLV_tb() {
    return getOrCreateProperty("StatementDocumentsLV_tb", "StatementDocumentsLV_tb", null, pcftest.QuoteDetailsPopup.StatementDocumentsLV_tb.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.QuoteDetailsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.QuoteDetailsPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.QuoteDetailsPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApproveQuote extends ClickableActionElement {
    public ApproveQuote(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApproveQuotePopup click() {
      return clickThis(pcftest.ApproveQuotePopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuoteDetailsPopup_UpLink extends ClickableActionElement {
    public QuoteDetailsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RequestRequote extends ClickableActionElement {
    public RequestRequote(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RequestRequotePopup click() {
      return clickThis(pcftest.RequestRequotePopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviseQuote extends ClickableActionElement {
    public ReviseQuote(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddReviseQuotePopup click() {
      return clickThis(pcftest.AddReviseQuotePopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementDocumentsLV_tb extends PCFElement {
    public StatementDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/QuoteDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}