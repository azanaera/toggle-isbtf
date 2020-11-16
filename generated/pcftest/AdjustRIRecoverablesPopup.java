package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesPopup_UpLink;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.Cancel;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.Edit;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.RIRecoverableLV;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.RIRecoverableLV.CededReservesHeader;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.RIRecoverableLV.RIRecoverableHeader;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.RIRecoverableLV._Select;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.RIRecoverableLV._ViewDetail;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.Update;
import pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen._msgs;
import pcftest.AdjustRIRecoverablesPopup._Paging;
import pcftest.AdjustRIRecoverablesPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdjustRIRecoverablesPopup extends PCFLocation {
  public final static String CHECKSUM = "766210b272e16a04c764fb468999c61e";
  
  public AdjustRIRecoverablesPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AdjustRIRecoverablesPopup"));
  }
  
  public AdjustRIRecoverablesPopup_UpLink getAdjustRIRecoverablesPopup_UpLink() {
    return getOrCreateProperty("AdjustRIRecoverablesPopup_UpLink", "AdjustRIRecoverablesPopup_UpLink", null, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesPopup_UpLink.class);
  }
  
  public AdjustRIRecoverablesScreen getAdjustRIRecoverablesScreen() {
    return getOrCreateProperty("AdjustRIRecoverablesScreen", "AdjustRIRecoverablesScreen", null, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AdjustRIRecoverablesPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AdjustRIRecoverablesPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdjustRIRecoverablesPopup_UpLink extends ClickableActionElement {
    public AdjustRIRecoverablesPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdjustRIRecoverablesScreen extends PCFElement {
    public AdjustRIRecoverablesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AgreementDetailsDV_AnnualAggregateRITreaty getAgreementDetailsDV_AnnualAggregateRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_AnnualAggregateRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_AnnualAggregateRITreaty.class);
    }
    
    public AgreementDetailsDV_ExcessOfLossRITreaty getAgreementDetailsDV_ExcessOfLossRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_ExcessOfLossRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_ExcessOfLossRITreaty.class);
    }
    
    public AgreementDetailsDV_FacExcessOfLossRIAgreement getAgreementDetailsDV_FacExcessOfLossRIAgreement() {
      return getOrCreateProperty("AgreementDetailsDV_FacExcessOfLossRIAgreement", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_FacExcessOfLossRIAgreement.class);
    }
    
    public AgreementDetailsDV_FacNetExcessOfLossRIAgreement getAgreementDetailsDV_FacNetExcessOfLossRIAgreement() {
      return getOrCreateProperty("AgreementDetailsDV_FacNetExcessOfLossRIAgreement", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_FacNetExcessOfLossRIAgreement.class);
    }
    
    public AgreementDetailsDV_FacProportionalRIAgreement getAgreementDetailsDV_FacProportionalRIAgreement() {
      return getOrCreateProperty("AgreementDetailsDV_FacProportionalRIAgreement", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_FacProportionalRIAgreement.class);
    }
    
    public AgreementDetailsDV_NetExcessOfLossRITreaty getAgreementDetailsDV_NetExcessOfLossRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_NetExcessOfLossRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_NetExcessOfLossRITreaty.class);
    }
    
    public AgreementDetailsDV_PerEventRITreaty getAgreementDetailsDV_PerEventRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_PerEventRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_PerEventRITreaty.class);
    }
    
    public AgreementDetailsDV_QuotaShareRITreaty getAgreementDetailsDV_QuotaShareRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_QuotaShareRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_QuotaShareRITreaty.class);
    }
    
    public AgreementDetailsDV_SurplusRITreaty getAgreementDetailsDV_SurplusRITreaty() {
      return getOrCreateProperty("AgreementDetailsDV_SurplusRITreaty", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_SurplusRITreaty.class);
    }
    
    public AgreementDetailsDV_default getAgreementDetailsDV_default() {
      return getOrCreateProperty("AgreementDetailsDV_default", "AgreementDetailsDV", null, pcftest.AgreementDetailsDV_default.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.Edit.class);
    }
    
    public RIRecoverableLV getRIRecoverableLV() {
      return getOrCreateProperty("RIRecoverableLV", "RIRecoverableLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.RIRecoverableLV.class);
    }
    
    public ValueElement getReasonForAdjustment() {
      return getOrCreateProperty("ReasonForAdjustment", "ReasonForAdjustment", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RIRecoverableLV extends PCFElement {
      public RIRecoverableLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAdjustedCededReservesDelta() {
        return getOrCreateProperty("AdjustedCededReservesDelta", "AdjustedCededReservesDelta", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getAdjustedRecoverableDelta() {
        return getOrCreateProperty("AdjustedRecoverableDelta", "AdjustedRecoverableDelta", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCalculatedRecoverable() {
        return getOrCreateProperty("CalculatedRecoverable", "CalculatedRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public CededReservesHeader getCededReservesHeader() {
        return getOrCreateProperty("CededReservesHeader", "CededReservesHeader", null, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.RIRecoverableLV.CededReservesHeader.class);
      }
      
      public ValueElement getNewRecoverableAdjustment() {
        return getOrCreateProperty("NewRecoverableAdjustment", "NewRecoverableAdjustment", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNewReserveAdjustment() {
        return getOrCreateProperty("NewReserveAdjustment", "NewReserveAdjustment", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNewUnadjustedCededReserves() {
        return getOrCreateProperty("NewUnadjustedCededReserves", "NewUnadjustedCededReserves", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNewUnadjustedRecoverable() {
        return getOrCreateProperty("NewUnadjustedRecoverable", "NewUnadjustedRecoverable", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getOpenCededReserves() {
        return getOrCreateProperty("OpenCededReserves", "OpenCededReserves", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPreviousAdjustments() {
        return getOrCreateProperty("PreviousAdjustments", "PreviousAdjustments", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPreviousReserveAdjustments() {
        return getOrCreateProperty("PreviousReserveAdjustments", "PreviousReserveAdjustments", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public RIRecoverableHeader getRIRecoverableHeader() {
        return getOrCreateProperty("RIRecoverableHeader", "RIRecoverableHeader", null, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.RIRecoverableLV.RIRecoverableHeader.class);
      }
      
      public ValueElement getTotalRecoverables() {
        return getOrCreateProperty("TotalRecoverables", "TotalRecoverables", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTotalReserves() {
        return getOrCreateProperty("TotalReserves", "TotalReserves", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getUnadjustedCededReservesDelta() {
        return getOrCreateProperty("UnadjustedCededReservesDelta", "UnadjustedCededReservesDelta", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getUnadjustedRecoverableDelta() {
        return getOrCreateProperty("UnadjustedRecoverableDelta", "UnadjustedRecoverableDelta", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.RIRecoverableLV._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AdjustRIRecoverablesPopup.AdjustRIRecoverablesScreen.RIRecoverableLV._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CededReservesHeader extends PCFElement {
        public CededReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AdjustRIRecoverablesHeaderRowSet getAdjustRIRecoverablesHeaderRowSet() {
          return getOrCreateProperty("AdjustRIRecoverablesHeaderRowSet", "AdjustRIRecoverablesHeaderRowSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AdjustRIRecoverablesHeaderRowSet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RIRecoverableHeader extends PCFElement {
        public RIRecoverableHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AdjustRIRecoverablesHeaderRowSet getAdjustRIRecoverablesHeaderRowSet() {
          return getOrCreateProperty("AdjustRIRecoverablesHeaderRowSet", "AdjustRIRecoverablesHeaderRowSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AdjustRIRecoverablesHeaderRowSet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/AdjustRIRecoverablesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}