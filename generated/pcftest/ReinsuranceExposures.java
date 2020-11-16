package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
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
import pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV;
import pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry.entry2;
import pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV_tb;
import pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV_tb.RemoveExposureFromAgreementGroup;
import pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV;
import pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV.ExposureNameHeader;
import pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV_tb;
import pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV_tb.AddToAgreementGroupButton;
import pcftest.ReinsuranceExposures.ReinsuranceExposures_UpLink;
import pcftest.ReinsuranceExposures._Paging;
import pcftest.ReinsuranceExposures.__crumb__;
import pcftest.ReinsuranceExposures._msgs;
import pcftest.ReinsuranceExposures.label;
import pcftest.ReinsuranceExposures.label2;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReinsuranceExposures extends PCFLocation {
  public final static String CHECKSUM = "2e583ccc6f958b05ba855dafbacf3df6";
  
  public ReinsuranceExposures(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReinsuranceExposures"));
  }
  
  public ExposuresWithReinsuranceLV getExposuresWithReinsuranceLV() {
    return getOrCreateProperty("ExposuresWithReinsuranceLV", "ExposuresWithReinsuranceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.class);
  }
  
  public ExposuresWithReinsuranceLV_tb getExposuresWithReinsuranceLV_tb() {
    return getOrCreateProperty("ExposuresWithReinsuranceLV_tb", "ExposuresWithReinsuranceLV_tb", null, pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV_tb.class);
  }
  
  public ExposuresWithoutReinsuranceLV getExposuresWithoutReinsuranceLV() {
    return getOrCreateProperty("ExposuresWithoutReinsuranceLV", "ExposuresWithoutReinsuranceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV.class);
  }
  
  public ExposuresWithoutReinsuranceLV_tb getExposuresWithoutReinsuranceLV_tb() {
    return getOrCreateProperty("ExposuresWithoutReinsuranceLV_tb", "ExposuresWithoutReinsuranceLV_tb", null, pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV_tb.class);
  }
  
  public ReinsuranceExposures_UpLink getReinsuranceExposures_UpLink() {
    return getOrCreateProperty("ReinsuranceExposures_UpLink", "ReinsuranceExposures_UpLink", null, pcftest.ReinsuranceExposures.ReinsuranceExposures_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReinsuranceExposures._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReinsuranceExposures.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ReinsuranceExposures._msgs.class);
  }
  
  public ReinsuranceSummary get_parent() {
    return getOrCreateProperty("_parent", pcftest.ReinsuranceSummary.class);
  }
  
  public label getlabel() {
    return getOrCreateProperty("label", "label", null, pcftest.ReinsuranceExposures.label.class);
  }
  
  public label2 getlabel2() {
    return getOrCreateProperty("label2", "label2", null, pcftest.ReinsuranceExposures.label2.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposuresWithReinsuranceLV extends PCFElement {
    public ExposuresWithReinsuranceLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry2> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry._Select.class);
      }
      
      public pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry._ViewDetail.class);
      }
      
      public ValueElement getriAgreementGroup() {
        return getOrCreateProperty("riAgreementGroup", "riAgreementGroup", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends RowElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getExposureName() {
          return getOrCreateProperty("ExposureName", "ExposureName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry.entry2._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry.entry2._Select.class);
        }
        
        public pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry.entry2._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV.entry.entry2._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposuresWithReinsuranceLV_tb extends PCFElement {
    public ExposuresWithReinsuranceLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RemoveExposureFromAgreementGroup getRemoveExposureFromAgreementGroup() {
      return getOrCreateProperty("RemoveExposureFromAgreementGroup", "RemoveExposureFromAgreementGroup", null, pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV_tb.RemoveExposureFromAgreementGroup.class);
    }
    
    public pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV_tb.RetrieveReinsuranceButton getRetrieveReinsuranceButton() {
      return getOrCreateProperty("RetrieveReinsuranceButton", "RetrieveReinsuranceButton", null, pcftest.ReinsuranceExposures.ExposuresWithReinsuranceLV_tb.RetrieveReinsuranceButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RemoveExposureFromAgreementGroup extends ClickableActionElement {
      public RemoveExposureFromAgreementGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RetrieveReinsuranceButton extends ClickableActionElement {
      public RetrieveReinsuranceButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposuresWithoutReinsuranceLV extends PCFElement {
    public ExposuresWithoutReinsuranceLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExposureNameHeader getExposureNameHeader() {
      return getOrCreateProperty("ExposureNameHeader", "ExposureNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV.ExposureNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExposureNameHeader extends ValueElement {
      public ExposureNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV.entry._Select.class);
      }
      
      public pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposuresWithoutReinsuranceLV_tb extends PCFElement {
    public ExposuresWithoutReinsuranceLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddToAgreementGroupButton getAddToAgreementGroupButton() {
      return getOrCreateProperty("AddToAgreementGroupButton", "AddToAgreementGroupButton", null, pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV_tb.AddToAgreementGroupButton.class);
    }
    
    public pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV_tb.RetrieveReinsuranceButton getRetrieveReinsuranceButton() {
      return getOrCreateProperty("RetrieveReinsuranceButton", "RetrieveReinsuranceButton", null, pcftest.ReinsuranceExposures.ExposuresWithoutReinsuranceLV_tb.RetrieveReinsuranceButton.class);
    }
    
    public SelectElement getSelectedAgreementDropdown() {
      return getOrCreateProperty("SelectedAgreementDropdown", "SelectedAgreementDropdown", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddToAgreementGroupButton extends ClickableActionElement {
      public AddToAgreementGroupButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RetrieveReinsuranceButton extends ClickableActionElement {
      public RetrieveReinsuranceButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceExposures_UpLink extends ClickableActionElement {
    public ReinsuranceExposures_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class label extends ValueElement {
    public label(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class label2 extends ValueElement {
    public label2(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}