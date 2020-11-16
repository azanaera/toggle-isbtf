package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.Cancel;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd.entry.AutomatedNotificationsAddClaimIndicatorHandler;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsDelete;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierDetailCardTab;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierSpecialHandlingCardTab;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.Edit;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.OtherInstructionsPanelSet_tb;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.OtherInstructionsPanelSet_tb.ToolbarButtonaddOtherInstruction;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.SpecialHandlingAutomatedActivitiesLV_tb;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd.entry.AutomatedActivitiesAddClaimIndicatorHandler;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesDelete;
import pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.Update;
import pcftest.CustomerServiceTierDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CustomerServiceTierDetailScreen extends PCFElement {
  public final static String CHECKSUM = "ab70d21156cad167643edf6eb0347b1f";
  
  public CustomerServiceTierDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CustomerServiceTiersTabsCV getCustomerServiceTiersTabsCV() {
    return getOrCreateProperty("CustomerServiceTiersTabsCV", "CustomerServiceTiersTabsCV", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CustomerServiceTierDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTiersTabsCV extends PCFElement {
    public CustomerServiceTiersTabsCV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.Cancel.class);
    }
    
    public SelectElement getCode() {
      return getOrCreateProperty("Code", "Code", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public CustomerServiceTierAutomatedNotificationsLVPanelRef getCustomerServiceTierAutomatedNotificationsLVPanelRef() {
      return getOrCreateProperty("CustomerServiceTierAutomatedNotificationsLVPanelRef", "CustomerServiceTierAutomatedNotificationsLVPanelRef", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.class);
    }
    
    public CustomerServiceTierDetailCardTab getCustomerServiceTierDetailCardTab() {
      return getOrCreateProperty("CustomerServiceTierDetailCardTab", "CustomerServiceTierDetailCardTab", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierDetailCardTab.class);
    }
    
    public CustomerServiceTierSpecialHandlingCardTab getCustomerServiceTierSpecialHandlingCardTab() {
      return getOrCreateProperty("CustomerServiceTierSpecialHandlingCardTab", "CustomerServiceTierSpecialHandlingCardTab", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierSpecialHandlingCardTab.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.Edit.class);
    }
    
    public OtherInstructionsPanelSet getOtherInstructionsPanelSet() {
      return getOrCreateProperty("OtherInstructionsPanelSet", "OtherInstructionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.OtherInstructionsPanelSet.class);
    }
    
    public OtherInstructionsPanelSet_tb getOtherInstructionsPanelSet_tb() {
      return getOrCreateProperty("OtherInstructionsPanelSet_tb", "OtherInstructionsPanelSet_tb", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.OtherInstructionsPanelSet_tb.class);
    }
    
    public SpecialHandlingAutomatedActivitiesLV getSpecialHandlingAutomatedActivitiesLV() {
      return getOrCreateProperty("SpecialHandlingAutomatedActivitiesLV", "SpecialHandlingAutomatedActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SpecialHandlingAutomatedActivitiesLV.class);
    }
    
    public SpecialHandlingAutomatedActivitiesLV_tb getSpecialHandlingAutomatedActivitiesLV_tb() {
      return getOrCreateProperty("SpecialHandlingAutomatedActivitiesLV_tb", "SpecialHandlingAutomatedActivitiesLV_tb", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.SpecialHandlingAutomatedActivitiesLV_tb.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.Update.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CustomerServiceTierAutomatedNotificationsLVPanelRef extends PCFElement {
      public CustomerServiceTierAutomatedNotificationsLVPanelRef(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SpecialHandlingAutomatedNotificationsLV getSpecialHandlingAutomatedNotificationsLV() {
        return getOrCreateProperty("SpecialHandlingAutomatedNotificationsLV", "SpecialHandlingAutomatedNotificationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SpecialHandlingAutomatedNotificationsLV.class);
      }
      
      public SpecialHandlingAutomatedNotificationsLV_tb getSpecialHandlingAutomatedNotificationsLV_tb() {
        return getOrCreateProperty("SpecialHandlingAutomatedNotificationsLV_tb", "SpecialHandlingAutomatedNotificationsLV_tb", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialHandlingAutomatedNotificationsLV_tb extends PCFElement {
        public SpecialHandlingAutomatedNotificationsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AutomatedNotificationsAdd getAutomatedNotificationsAdd() {
          return getOrCreateProperty("AutomatedNotificationsAdd", "AutomatedNotificationsAdd", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd.class);
        }
        
        public AutomatedNotificationsDelete getAutomatedNotificationsDelete() {
          return getOrCreateProperty("AutomatedNotificationsDelete", "AutomatedNotificationsDelete", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsDelete.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class AutomatedNotificationsAdd extends ClickableActionElement {
          public AutomatedNotificationsAdd(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          @SuppressWarnings(value = "unchecked")
          public IteratorEntries<pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd.entry> get_Entries() {
            return getOrCreateEntries(null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class entry extends PCFElement {
            public entry(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AutomatedNotificationsAddClaimIndicatorHandler getAutomatedNotificationsAddClaimIndicatorHandler() {
              return getOrCreateProperty("AutomatedNotificationsAddClaimIndicatorHandler", "AutomatedNotificationsAddClaimIndicatorHandler", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.CustomerServiceTierAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd.entry.AutomatedNotificationsAddClaimIndicatorHandler.class);
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class AutomatedNotificationsAddClaimIndicatorHandler extends ClickableActionElement {
              public AutomatedNotificationsAddClaimIndicatorHandler(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public NewAutomatedNotificationHandlerPopup click() {
                return clickThis(pcftest.NewAutomatedNotificationHandlerPopup.class);
              }
              
              
            }
            
            
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class AutomatedNotificationsDelete extends ClickableActionElement {
          public AutomatedNotificationsDelete(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CustomerServiceTierDetailCardTab extends ClickableActionElement {
      public CustomerServiceTierDetailCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CustomerServiceTierSpecialHandlingCardTab extends ClickableActionElement {
      public CustomerServiceTierSpecialHandlingCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherInstructionsPanelSet_tb extends PCFElement {
      public OtherInstructionsPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ToolbarButtonaddOtherInstruction getToolbarButtonaddOtherInstruction() {
        return getOrCreateProperty("ToolbarButtonaddOtherInstruction", "ToolbarButtonaddOtherInstruction", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.OtherInstructionsPanelSet_tb.ToolbarButtonaddOtherInstruction.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ToolbarButtonaddOtherInstruction extends ClickableActionElement {
        public ToolbarButtonaddOtherInstruction(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OtherInstructionPopup click() {
          return clickThis(pcftest.OtherInstructionPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SpecialHandlingAutomatedActivitiesLV_tb extends PCFElement {
      public SpecialHandlingAutomatedActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AutomatedActivitiesAdd getAutomatedActivitiesAdd() {
        return getOrCreateProperty("AutomatedActivitiesAdd", "AutomatedActivitiesAdd", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd.class);
      }
      
      public AutomatedActivitiesDelete getAutomatedActivitiesDelete() {
        return getOrCreateProperty("AutomatedActivitiesDelete", "AutomatedActivitiesDelete", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesDelete.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AutomatedActivitiesAdd extends ClickableActionElement {
        public AutomatedActivitiesAdd(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends PCFElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public AutomatedActivitiesAddClaimIndicatorHandler getAutomatedActivitiesAddClaimIndicatorHandler() {
            return getOrCreateProperty("AutomatedActivitiesAddClaimIndicatorHandler", "AutomatedActivitiesAddClaimIndicatorHandler", null, pcftest.CustomerServiceTierDetailScreen.CustomerServiceTiersTabsCV.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd.entry.AutomatedActivitiesAddClaimIndicatorHandler.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class AutomatedActivitiesAddClaimIndicatorHandler extends ClickableActionElement {
            public AutomatedActivitiesAddClaimIndicatorHandler(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public NewAutomatedActivityHandlerPopup click() {
              return clickThis(pcftest.NewAutomatedActivityHandlerPopup.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AutomatedActivitiesDelete extends ClickableActionElement {
        public AutomatedActivitiesDelete(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}