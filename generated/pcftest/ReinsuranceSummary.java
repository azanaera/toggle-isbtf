package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReinsuranceSummary.FinancialsDetailsDV;
import pcftest.ReinsuranceSummary.ReinsuranceSummaryLV_tb;
import pcftest.ReinsuranceSummary.ReinsuranceSummaryLV_tb.AddAgreementButton;
import pcftest.ReinsuranceSummary.ReinsuranceSummaryLV_tb.ManageExposuresButton;
import pcftest.ReinsuranceSummary.ReinsuranceSummary_UpLink;
import pcftest.ReinsuranceSummary._Paging;
import pcftest.ReinsuranceSummary.__crumb__;
import pcftest.ReinsuranceSummary._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceSummary extends PCFLocation {
  public final static String CHECKSUM = "8027cafdcefaf535996388b5b030fe39";
  
  public ReinsuranceSummary(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReinsuranceSummary"));
  }
  
  public FinancialsDetailsDV getFinancialsDetailsDV() {
    return getOrCreateProperty("FinancialsDetailsDV", "FinancialsDetailsDV", null, pcftest.ReinsuranceSummary.FinancialsDetailsDV.class);
  }
  
  public ReinsuranceSummaryLV getReinsuranceSummaryLV() {
    return getOrCreateProperty("ReinsuranceSummaryLV", "ReinsuranceSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReinsuranceSummaryLV.class);
  }
  
  public ReinsuranceSummaryLV_tb getReinsuranceSummaryLV_tb() {
    return getOrCreateProperty("ReinsuranceSummaryLV_tb", "ReinsuranceSummaryLV_tb", null, pcftest.ReinsuranceSummary.ReinsuranceSummaryLV_tb.class);
  }
  
  public ReinsuranceSummary_UpLink getReinsuranceSummary_UpLink() {
    return getOrCreateProperty("ReinsuranceSummary_UpLink", "ReinsuranceSummary_UpLink", null, pcftest.ReinsuranceSummary.ReinsuranceSummary_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReinsuranceSummary._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReinsuranceSummary.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ReinsuranceSummary._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsDetailsDV extends DetailViewElement {
    public FinancialsDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCededReserves() {
      return getOrCreateProperty("CededReserves", "CededReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNetNetOnClaim() {
      return getOrCreateProperty("NetNetOnClaim", "NetNetOnClaim", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNetNetReserves() {
      return getOrCreateProperty("NetNetReserves", "NetNetReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNetPaidOnClaim() {
      return getOrCreateProperty("NetPaidOnClaim", "NetPaidOnClaim", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOpenReserves() {
      return getOrCreateProperty("OpenReserves", "OpenReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalIncurred() {
      return getOrCreateProperty("TotalIncurred", "TotalIncurred", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalIncurredWithRI() {
      return getOrCreateProperty("TotalIncurredWithRI", "TotalIncurredWithRI", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalRI() {
      return getOrCreateProperty("TotalRI", "TotalRI", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalRIRecoverable() {
      return getOrCreateProperty("TotalRIRecoverable", "TotalRIRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceSummaryLV_tb extends PCFElement {
    public ReinsuranceSummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddAgreementButton getAddAgreementButton() {
      return getOrCreateProperty("AddAgreementButton", "AddAgreementButton", null, pcftest.ReinsuranceSummary.ReinsuranceSummaryLV_tb.AddAgreementButton.class);
    }
    
    public ManageExposuresButton getManageExposuresButton() {
      return getOrCreateProperty("ManageExposuresButton", "ManageExposuresButton", null, pcftest.ReinsuranceSummary.ReinsuranceSummaryLV_tb.ManageExposuresButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddAgreementButton extends ClickableActionElement {
      public AddAgreementButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddAgreementMenuItemSet getAddAgreementMenuItemSet() {
        return getOrCreateProperty("AddAgreementMenuItemSet", "AddAgreementMenuItemSet", null, pcftest.AddAgreementMenuItemSet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ManageExposuresButton extends ClickableActionElement {
      public ManageExposuresButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReinsuranceExposures click() {
        return clickThis(pcftest.ReinsuranceExposures.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceSummary_UpLink extends ClickableActionElement {
    public ReinsuranceSummary_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}