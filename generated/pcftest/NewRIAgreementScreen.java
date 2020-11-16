package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewRIAgreementScreen.CancelButton;
import pcftest.NewRIAgreementScreen.UpdateButton;
import pcftest.NewRIAgreementScreen._msgs;
import pcftest.NewRIAgreementScreen.relatedAgreementIter;
import pcftest.NewRIAgreementScreen.relatedAgreementIter.AgreementNameHeader;
import pcftest.NewRIAgreementScreen.relatedAgreementIter.AgreementNumberHeader;
import pcftest.NewRIAgreementScreen.relatedExposureIter;
import pcftest.NewRIAgreementScreen.relatedExposureIter.ExposureNameHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewRIAgreementScreen extends PCFElement {
  public final static String CHECKSUM = "10a4f72580a0df6daada18fd8bbdced6";
  
  public NewRIAgreementScreen(ISmokeTest helper, PCFElementId componentId)  {
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
  
  public CancelButton getCancelButton() {
    return getOrCreateProperty("CancelButton", "CancelButton", null, pcftest.NewRIAgreementScreen.CancelButton.class);
  }
  
  public RISubtypeAndGroupInputSet getRISubtypeAndGroupInputSet() {
    return getOrCreateProperty("RISubtypeAndGroupInputSet", "RISubtypeAndGroupInputSet", null, pcftest.RISubtypeAndGroupInputSet.class);
  }
  
  public UpdateButton getUpdateButton() {
    return getOrCreateProperty("UpdateButton", "UpdateButton", null, pcftest.NewRIAgreementScreen.UpdateButton.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewRIAgreementScreen._msgs.class);
  }
  
  public relatedAgreementIter getrelatedAgreementIter() {
    return getOrCreateProperty("relatedAgreementIter", "relatedAgreementIter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.NewRIAgreementScreen.relatedAgreementIter.class);
  }
  
  public relatedExposureIter getrelatedExposureIter() {
    return getOrCreateProperty("relatedExposureIter", "relatedExposureIter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.NewRIAgreementScreen.relatedExposureIter.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CancelButton extends ClickableActionElement {
    public CancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpdateButton extends ClickableActionElement {
    public UpdateButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class relatedAgreementIter extends PCFElement {
    public relatedAgreementIter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AgreementNameHeader getAgreementNameHeader() {
      return getOrCreateProperty("AgreementNameHeader", "AgreementNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewRIAgreementScreen.relatedAgreementIter.AgreementNameHeader.class);
    }
    
    public AgreementNumberHeader getAgreementNumberHeader() {
      return getOrCreateProperty("AgreementNumberHeader", "AgreementNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewRIAgreementScreen.relatedAgreementIter.AgreementNumberHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.NewRIAgreementScreen.relatedAgreementIter.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewRIAgreementScreen.relatedAgreementIter.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.NewRIAgreementScreen.relatedAgreementIter._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewRIAgreementScreen.relatedAgreementIter._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AgreementNameHeader extends ValueElement {
      public AgreementNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AgreementNumberHeader extends ValueElement {
      public AgreementNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAgreementName() {
        return getOrCreateProperty("AgreementName", "AgreementName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getAgreementNumber() {
        return getOrCreateProperty("AgreementNumber", "AgreementNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.NewRIAgreementScreen.relatedAgreementIter.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.NewRIAgreementScreen.relatedAgreementIter.entry._Select.class);
      }
      
      public pcftest.NewRIAgreementScreen.relatedAgreementIter.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewRIAgreementScreen.relatedAgreementIter.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class relatedExposureIter extends PCFElement {
    public relatedExposureIter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExposureNameHeader getExposureNameHeader() {
      return getOrCreateProperty("ExposureNameHeader", "ExposureNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewRIAgreementScreen.relatedExposureIter.ExposureNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.NewRIAgreementScreen.relatedExposureIter.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewRIAgreementScreen.relatedExposureIter.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.NewRIAgreementScreen.relatedExposureIter._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewRIAgreementScreen.relatedExposureIter._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExposureNameHeader extends ValueElement {
      public ExposureNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getExposureName() {
        return getOrCreateProperty("ExposureName", "ExposureName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.NewRIAgreementScreen.relatedExposureIter.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.NewRIAgreementScreen.relatedExposureIter.entry._Select.class);
      }
      
      public pcftest.NewRIAgreementScreen.relatedExposureIter.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewRIAgreementScreen.relatedExposureIter.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}