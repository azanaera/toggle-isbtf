package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RIAgreementGroupPopup.Cancel;
import pcftest.RIAgreementGroupPopup.Edit;
import pcftest.RIAgreementGroupPopup.RIAgreementGroupPopup_UpLink;
import pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV;
import pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV.ExposureNameHeader;
import pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV.entry;
import pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV.entry._Select;
import pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV.entry._ViewDetail;
import pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV_tb;
import pcftest.RIAgreementGroupPopup.Update;
import pcftest.RIAgreementGroupPopup._Paging;
import pcftest.RIAgreementGroupPopup.__crumb__;
import pcftest.RIAgreementGroupPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RIAgreementGroupPopup extends PCFLocation {
  public final static String CHECKSUM = "52dbbb04df3facf13692eb7c2cd42d41";
  
  public RIAgreementGroupPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RIAgreementGroupPopup"));
  }
  
  public ValueElement getAgreementGroupName() {
    return getOrCreateProperty("AgreementGroupName", "AgreementGroupName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.RIAgreementGroupPopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.RIAgreementGroupPopup.Edit.class);
  }
  
  public RIAgreementGroupPopup_UpLink getRIAgreementGroupPopup_UpLink() {
    return getOrCreateProperty("RIAgreementGroupPopup_UpLink", "RIAgreementGroupPopup_UpLink", null, pcftest.RIAgreementGroupPopup.RIAgreementGroupPopup_UpLink.class);
  }
  
  public RelatedExposuresPopupLV getRelatedExposuresPopupLV() {
    return getOrCreateProperty("RelatedExposuresPopupLV", "RelatedExposuresPopupLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV.class);
  }
  
  public RelatedExposuresPopupLV_tb getRelatedExposuresPopupLV_tb() {
    return getOrCreateProperty("RelatedExposuresPopupLV_tb", "RelatedExposuresPopupLV_tb", null, pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV_tb.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.RIAgreementGroupPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RIAgreementGroupPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RIAgreementGroupPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RIAgreementGroupPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RIAgreementGroupPopup_UpLink extends ClickableActionElement {
    public RIAgreementGroupPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedExposuresPopupLV extends PCFElement {
    public RelatedExposuresPopupLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExposureNameHeader getExposureNameHeader() {
      return getOrCreateProperty("ExposureNameHeader", "ExposureNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV.ExposureNameHeader.class);
    }
    
    public ValueElement getPickedHeader() {
      return getOrCreateProperty("PickedHeader", "PickedHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExposureNameHeader extends ValueElement {
      public ExposureNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getExposureName() {
        return getOrCreateProperty("ExposureName", "ExposureName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public CheckboxValueElement getPicked() {
        return getOrCreateProperty("Picked", "Picked", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RIAgreementGroupPopup.RelatedExposuresPopupLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedExposuresPopupLV_tb extends PCFElement {
    public RelatedExposuresPopupLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}