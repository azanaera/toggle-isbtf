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
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyComparisonScreen.PolicyDifferencesLV;
import pcftest.PolicyComparisonScreen.PolicyDifferencesLV.LabelFieldHeader;
import pcftest.PolicyComparisonScreen.PolicyDifferencesLV.NewPolicyFieldHeader;
import pcftest.PolicyComparisonScreen.PolicyDifferencesLV.OldPolicyFieldHeader;
import pcftest.PolicyComparisonScreen.PolicyDifferencesLV.entry;
import pcftest.PolicyComparisonScreen.PolicyDifferencesLV.entry._Select;
import pcftest.PolicyComparisonScreen.PolicyDifferencesLV.entry._ViewDetail;
import pcftest.PolicyComparisonScreen.PolicyDifferencesLV.entry.expandCollapse;
import pcftest.PolicyComparisonScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyComparisonScreen extends PCFElement {
  public final static String CHECKSUM = "d0c30b751592c73e2d40733b342d158a";
  
  public PolicyComparisonScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PolicyDifferencesLV getPolicyDifferencesLV() {
    return getOrCreateProperty("PolicyDifferencesLV", "PolicyDifferencesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicyComparisonScreen.PolicyDifferencesLV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PolicyComparisonScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyDifferencesLV extends PCFElement {
    public PolicyDifferencesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LabelFieldHeader getLabelFieldHeader() {
      return getOrCreateProperty("LabelFieldHeader", "LabelFieldHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyComparisonScreen.PolicyDifferencesLV.LabelFieldHeader.class);
    }
    
    public NewPolicyFieldHeader getNewPolicyFieldHeader() {
      return getOrCreateProperty("NewPolicyFieldHeader", "NewPolicyFieldHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyComparisonScreen.PolicyDifferencesLV.NewPolicyFieldHeader.class);
    }
    
    public OldPolicyFieldHeader getOldPolicyFieldHeader() {
      return getOrCreateProperty("OldPolicyFieldHeader", "OldPolicyFieldHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyComparisonScreen.PolicyDifferencesLV.OldPolicyFieldHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.PolicyComparisonScreen.PolicyDifferencesLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LabelFieldHeader extends ValueElement {
      public LabelFieldHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewPolicyFieldHeader extends ValueElement {
      public NewPolicyFieldHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OldPolicyFieldHeader extends ValueElement {
      public OldPolicyFieldHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getLabelField() {
        return getOrCreateProperty("LabelField", "LabelField", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNewPolicyField() {
        return getOrCreateProperty("NewPolicyField", "NewPolicyField", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getOldPolicyField() {
        return getOrCreateProperty("OldPolicyField", "OldPolicyField", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.PolicyComparisonScreen.PolicyDifferencesLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.PolicyComparisonScreen.PolicyDifferencesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PolicyComparisonScreen.PolicyDifferencesLV.entry._ViewDetail.class);
      }
      
      public ValueElement getcontainerLabel() {
        return getOrCreateProperty("containerLabel", "containerLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public expandCollapse getexpandCollapse() {
        return getOrCreateProperty("expandCollapse", "expandCollapse", gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeToggle, pcftest.PolicyComparisonScreen.PolicyDifferencesLV.entry.expandCollapse.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class expandCollapse extends ClickableActionElement {
        public expandCollapse(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyComparisonScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}