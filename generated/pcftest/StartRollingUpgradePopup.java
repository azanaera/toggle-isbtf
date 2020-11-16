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
import pcftest.StartRollingUpgradePopup.StartRollingUpgradePopup_UpLink;
import pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen;
import pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.Cancel;
import pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.Edit;
import pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.StartRolling;
import pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.StartRollingUpgradeConditionsLV;
import pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.StartRollingUpgradeConditionsLV.entry;
import pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.StartRollingUpgradeConditionsLV.entry._Select;
import pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.StartRollingUpgradeConditionsLV.entry._ViewDetail;
import pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.Update;
import pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen._msgs;
import pcftest.StartRollingUpgradePopup._Paging;
import pcftest.StartRollingUpgradePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StartRollingUpgradePopup extends PCFLocation {
  public final static String CHECKSUM = "7f688f8a4b015aa03bdcea83cf0926b7";
  
  public StartRollingUpgradePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("StartRollingUpgradePopup"));
  }
  
  public StartRollingUpgradePopup_UpLink getStartRollingUpgradePopup_UpLink() {
    return getOrCreateProperty("StartRollingUpgradePopup_UpLink", "StartRollingUpgradePopup_UpLink", null, pcftest.StartRollingUpgradePopup.StartRollingUpgradePopup_UpLink.class);
  }
  
  public StartRollingUpgradeScreen getStartRollingUpgradeScreen() {
    return getOrCreateProperty("StartRollingUpgradeScreen", "StartRollingUpgradeScreen", null, pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.StartRollingUpgradePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.StartRollingUpgradePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartRollingUpgradePopup_UpLink extends ClickableActionElement {
    public StartRollingUpgradePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartRollingUpgradeScreen extends PCFElement {
    public StartRollingUpgradeScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.Edit.class);
    }
    
    public StartRolling getStartRolling() {
      return getOrCreateProperty("StartRolling", "StartRolling", null, pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.StartRolling.class);
    }
    
    public StartRollingUpgradeConditionsLV getStartRollingUpgradeConditionsLV() {
      return getOrCreateProperty("StartRollingUpgradeConditionsLV", "StartRollingUpgradeConditionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.StartRollingUpgradeConditionsLV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartRolling extends ClickableActionElement {
      public StartRolling(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartRollingUpgradeConditionsLV extends PCFElement {
      public StartRollingUpgradeConditionsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.StartRollingUpgradeConditionsLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public CheckboxValueElement getChecked() {
          return getOrCreateProperty("Checked", "Checked", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.StartRollingUpgradeConditionsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.StartRollingUpgradePopup.StartRollingUpgradeScreen.StartRollingUpgradeConditionsLV.entry._ViewDetail.class);
        }
        
        public ValueElement getcondition() {
          return getOrCreateProperty("condition", "condition", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/StartRollingUpgradePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}