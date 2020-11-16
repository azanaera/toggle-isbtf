package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.AssigneeHeader;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.ClaimantHeader;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.IDOrderHeader;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.InsuredHeader;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.LossDateHeader;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.PolicyIDHeader;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.StatusHeader;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.entry;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.entry.IDOrder;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.entry.Status;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.entry._Select;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.entry._ViewDetail;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.Done;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.Restore;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen._msgs;
import pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopup_UpLink;
import pcftest.ArchiveClaimRetrievePopup._Paging;
import pcftest.ArchiveClaimRetrievePopup.__crumb__;
import typekey.ArchiveState;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveClaimRetrievePopup extends PCFLocation {
  public final static String CHECKSUM = "aa6a432f52653a6221480161a0acdfcc";
  
  public ArchiveClaimRetrievePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ArchiveClaimRetrievePopup"));
  }
  
  public ArchiveClaimRetrievePopupScreen getArchiveClaimRetrievePopupScreen() {
    return getOrCreateProperty("ArchiveClaimRetrievePopupScreen", "ArchiveClaimRetrievePopupScreen", null, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.class);
  }
  
  public ArchiveClaimRetrievePopup_UpLink getArchiveClaimRetrievePopup_UpLink() {
    return getOrCreateProperty("ArchiveClaimRetrievePopup_UpLink", "ArchiveClaimRetrievePopup_UpLink", null, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ArchiveClaimRetrievePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ArchiveClaimRetrievePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveClaimRetrievePopupScreen extends PCFElement {
    public ArchiveClaimRetrievePopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ArchiveClaimRetrieveLV getArchiveClaimRetrieveLV() {
      return getOrCreateProperty("ArchiveClaimRetrieveLV", "ArchiveClaimRetrieveLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.class);
    }
    
    public Done getDone() {
      return getOrCreateProperty("Done", "Done", null, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.Done.class);
    }
    
    public Restore getRestore() {
      return getOrCreateProperty("Restore", "Restore", null, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.Restore.class);
    }
    
    public RetrieveClaimInfoDV getRetrieveClaimInfoDV() {
      return getOrCreateProperty("RetrieveClaimInfoDV", "RetrieveClaimInfoDV", null, pcftest.RetrieveClaimInfoDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArchiveClaimRetrieveLV extends PCFElement {
      public ArchiveClaimRetrieveLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssigneeHeader getAssigneeHeader() {
        return getOrCreateProperty("AssigneeHeader", "AssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.AssigneeHeader.class);
      }
      
      public ClaimantHeader getClaimantHeader() {
        return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.ClaimantHeader.class);
      }
      
      public IDOrderHeader getIDOrderHeader() {
        return getOrCreateProperty("IDOrderHeader", "IDOrderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.IDOrderHeader.class);
      }
      
      public InsuredHeader getInsuredHeader() {
        return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.InsuredHeader.class);
      }
      
      public LossDateHeader getLossDateHeader() {
        return getOrCreateProperty("LossDateHeader", "LossDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.LossDateHeader.class);
      }
      
      public PolicyIDHeader getPolicyIDHeader() {
        return getOrCreateProperty("PolicyIDHeader", "PolicyIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.PolicyIDHeader.class);
      }
      
      public StatusHeader getStatusHeader() {
        return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.StatusHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AssigneeHeader extends ValueElement {
        public AssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimantHeader extends ValueElement {
        public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IDOrderHeader extends ValueElement {
        public IDOrderHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InsuredHeader extends ValueElement {
        public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LossDateHeader extends ValueElement {
        public LossDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PolicyIDHeader extends ValueElement {
        public PolicyIDHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StatusHeader extends ValueElement {
        public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getAssignee() {
          return getOrCreateProperty("Assignee", "Assignee", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getClaimant() {
          return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IDOrder getIDOrder() {
          return getOrCreateProperty("IDOrder", "IDOrder", null, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.entry.IDOrder.class);
        }
        
        public ValueElement getInsured() {
          return getOrCreateProperty("Insured", "Insured", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getLossDate() {
          return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public ValueElement getPolicyID() {
          return getOrCreateProperty("PolicyID", "PolicyID", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public Status getStatus() {
          return getOrCreateProperty("Status", "Status", null, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.entry.Status.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ArchiveClaimRetrievePopup.ArchiveClaimRetrievePopupScreen.ArchiveClaimRetrieveLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class IDOrder extends ValueElement {
          public IDOrder(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Status extends SelectElement {
          public Status(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public OptionElement getOptionByTypeKey(ArchiveState arg) {
            return getOptionByValue(arg == null ? null : arg.getCode());
          }
          
          public ArchiveState getTypeKeyValue() {
            String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ArchiveState.getTypeKey(myValue);
          }
          
          public void setTypeKeyValue(ArchiveState arg) {
            setValue(arg == null ? null : arg.getCode());
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Done extends ClickableActionElement {
      public Done(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Restore extends ClickableActionElement {
      public Restore(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveClaimRetrievePopup_UpLink extends ClickableActionElement {
    public ArchiveClaimRetrievePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/archive/ArchiveClaimRetrievePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}