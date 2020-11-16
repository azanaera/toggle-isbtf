package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AccountDetailScreen.AccountTabsCV;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.SpecialHandlingAutomatedActivitiesLV_tb;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd.entry.AutomatedActivitiesAddClaimIndicatorHandler;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesDelete;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd.entry.AutomatedNotificationsAddClaimIndicatorHandler;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsDelete;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountDV_tb;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountDV_tb.Cancel;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountDV_tb.Edit;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountDV_tb.Update;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountDetailTabTab;
import pcftest.AccountDetailScreen.AccountTabsCV.AccountHandlingTabTab;
import pcftest.AccountDetailScreen.AccountTabsCV.OtherInstructionsPanelSet_tb;
import pcftest.AccountDetailScreen.AccountTabsCV.OtherInstructionsPanelSet_tb.ToolbarButtonaddOtherInstruction;
import pcftest.AccountDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AccountDetailScreen extends PCFElement {
  public final static String CHECKSUM = "c828cdfa12189a5e68036a1d858f06b5";
  
  public AccountDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AccountTabsCV getAccountTabsCV() {
    return getOrCreateProperty("AccountTabsCV", "AccountTabsCV", null, pcftest.AccountDetailScreen.AccountTabsCV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AccountDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountTabsCV extends PCFElement {
    public AccountTabsCV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AccountAutomatedActivitiesLVPanelRef getAccountAutomatedActivitiesLVPanelRef() {
      return getOrCreateProperty("AccountAutomatedActivitiesLVPanelRef", "AccountAutomatedActivitiesLVPanelRef", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.class);
    }
    
    public AccountAutomatedNotificationsLVPanelRef getAccountAutomatedNotificationsLVPanelRef() {
      return getOrCreateProperty("AccountAutomatedNotificationsLVPanelRef", "AccountAutomatedNotificationsLVPanelRef", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.class);
    }
    
    public AccountDV getAccountDV() {
      return getOrCreateProperty("AccountDV", "AccountDV", null, pcftest.AccountDV.class);
    }
    
    public AccountDV_tb getAccountDV_tb() {
      return getOrCreateProperty("AccountDV_tb", "AccountDV_tb", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountDV_tb.class);
    }
    
    public AccountDetailTabTab getAccountDetailTabTab() {
      return getOrCreateProperty("AccountDetailTabTab", "AccountDetailTabTab", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountDetailTabTab.class);
    }
    
    public AccountHandlingTabTab getAccountHandlingTabTab() {
      return getOrCreateProperty("AccountHandlingTabTab", "AccountHandlingTabTab", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountHandlingTabTab.class);
    }
    
    public OtherInstructionsPanelSet getOtherInstructionsPanelSet() {
      return getOrCreateProperty("OtherInstructionsPanelSet", "OtherInstructionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.OtherInstructionsPanelSet.class);
    }
    
    public OtherInstructionsPanelSet_tb getOtherInstructionsPanelSet_tb() {
      return getOrCreateProperty("OtherInstructionsPanelSet_tb", "OtherInstructionsPanelSet_tb", null, pcftest.AccountDetailScreen.AccountTabsCV.OtherInstructionsPanelSet_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AccountAutomatedActivitiesLVPanelRef extends PCFElement {
      public AccountAutomatedActivitiesLVPanelRef(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SpecialHandlingAutomatedActivitiesLV getSpecialHandlingAutomatedActivitiesLV() {
        return getOrCreateProperty("SpecialHandlingAutomatedActivitiesLV", "SpecialHandlingAutomatedActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SpecialHandlingAutomatedActivitiesLV.class);
      }
      
      public SpecialHandlingAutomatedActivitiesLV_tb getSpecialHandlingAutomatedActivitiesLV_tb() {
        return getOrCreateProperty("SpecialHandlingAutomatedActivitiesLV_tb", "SpecialHandlingAutomatedActivitiesLV_tb", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.SpecialHandlingAutomatedActivitiesLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialHandlingAutomatedActivitiesLV_tb extends PCFElement {
        public SpecialHandlingAutomatedActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AutomatedActivitiesAdd getAutomatedActivitiesAdd() {
          return getOrCreateProperty("AutomatedActivitiesAdd", "AutomatedActivitiesAdd", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd.class);
        }
        
        public AutomatedActivitiesDelete getAutomatedActivitiesDelete() {
          return getOrCreateProperty("AutomatedActivitiesDelete", "AutomatedActivitiesDelete", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesDelete.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class AutomatedActivitiesAdd extends ClickableActionElement {
          public AutomatedActivitiesAdd(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          @SuppressWarnings(value = "unchecked")
          public IteratorEntries<pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd.entry> get_Entries() {
            return getOrCreateEntries(null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class entry extends PCFElement {
            public entry(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AutomatedActivitiesAddClaimIndicatorHandler getAutomatedActivitiesAddClaimIndicatorHandler() {
              return getOrCreateProperty("AutomatedActivitiesAddClaimIndicatorHandler", "AutomatedActivitiesAddClaimIndicatorHandler", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedActivitiesLVPanelRef.SpecialHandlingAutomatedActivitiesLV_tb.AutomatedActivitiesAdd.entry.AutomatedActivitiesAddClaimIndicatorHandler.class);
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class AutomatedActivitiesDelete extends ClickableActionElement {
          public AutomatedActivitiesDelete(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AccountAutomatedNotificationsLVPanelRef extends PCFElement {
      public AccountAutomatedNotificationsLVPanelRef(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SpecialHandlingAutomatedNotificationsLV getSpecialHandlingAutomatedNotificationsLV() {
        return getOrCreateProperty("SpecialHandlingAutomatedNotificationsLV", "SpecialHandlingAutomatedNotificationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SpecialHandlingAutomatedNotificationsLV.class);
      }
      
      public SpecialHandlingAutomatedNotificationsLV_tb getSpecialHandlingAutomatedNotificationsLV_tb() {
        return getOrCreateProperty("SpecialHandlingAutomatedNotificationsLV_tb", "SpecialHandlingAutomatedNotificationsLV_tb", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialHandlingAutomatedNotificationsLV_tb extends PCFElement {
        public SpecialHandlingAutomatedNotificationsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AutomatedNotificationsAdd getAutomatedNotificationsAdd() {
          return getOrCreateProperty("AutomatedNotificationsAdd", "AutomatedNotificationsAdd", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd.class);
        }
        
        public AutomatedNotificationsDelete getAutomatedNotificationsDelete() {
          return getOrCreateProperty("AutomatedNotificationsDelete", "AutomatedNotificationsDelete", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsDelete.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class AutomatedNotificationsAdd extends ClickableActionElement {
          public AutomatedNotificationsAdd(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          @SuppressWarnings(value = "unchecked")
          public IteratorEntries<pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd.entry> get_Entries() {
            return getOrCreateEntries(null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class entry extends PCFElement {
            public entry(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AutomatedNotificationsAddClaimIndicatorHandler getAutomatedNotificationsAddClaimIndicatorHandler() {
              return getOrCreateProperty("AutomatedNotificationsAddClaimIndicatorHandler", "AutomatedNotificationsAddClaimIndicatorHandler", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountAutomatedNotificationsLVPanelRef.SpecialHandlingAutomatedNotificationsLV_tb.AutomatedNotificationsAdd.entry.AutomatedNotificationsAddClaimIndicatorHandler.class);
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AccountDV_tb extends PCFElement {
      public AccountDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountDV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountDV_tb.Edit.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.AccountDetailScreen.AccountTabsCV.AccountDV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AccountDetailTabTab extends ClickableActionElement {
      public AccountDetailTabTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AccountHandlingTabTab extends ClickableActionElement {
      public AccountHandlingTabTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherInstructionsPanelSet_tb extends PCFElement {
      public OtherInstructionsPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ToolbarButtonaddOtherInstruction getToolbarButtonaddOtherInstruction() {
        return getOrCreateProperty("ToolbarButtonaddOtherInstruction", "ToolbarButtonaddOtherInstruction", null, pcftest.AccountDetailScreen.AccountTabsCV.OtherInstructionsPanelSet_tb.ToolbarButtonaddOtherInstruction.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ToolbarButtonaddOtherInstruction extends ClickableActionElement {
        public ToolbarButtonaddOtherInstruction(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OtherInstructionPopup click() {
          return clickThis(pcftest.OtherInstructionPopup.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/accounts/AccountDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}