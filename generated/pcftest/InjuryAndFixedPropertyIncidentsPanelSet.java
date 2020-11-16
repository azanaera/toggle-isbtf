package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator;
import pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryIncidentIcon;
import pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryName;
import pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator;
import pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyIncidentIcon;
import pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyName;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InjuryAndFixedPropertyIncidentsPanelSet extends PCFElement {
  public final static String CHECKSUM = "7a0cbac6ad1377a2a7593dbc1b6d62cf";
  
  public InjuryAndFixedPropertyIncidentsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public InjuryIncidentIterator getInjuryIncidentIterator() {
    return getOrCreateProperty("InjuryIncidentIterator", "InjuryIncidentIterator", null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.class);
  }
  
  public PropertyIncidentIterator getPropertyIncidentIterator() {
    return getOrCreateProperty("PropertyIncidentIterator", "PropertyIncidentIterator", null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentIterator extends PCFElement {
    public InjuryIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getInjuryDescription() {
        return getOrCreateProperty("InjuryDescription", "InjuryDescription", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public InjuryIncidentIcon getInjuryIncidentIcon() {
        return getOrCreateProperty("InjuryIncidentIcon", "InjuryIncidentIcon", null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryIncidentIcon.class);
      }
      
      public InjuryName getInjuryName() {
        return getOrCreateProperty("InjuryName", "InjuryName", null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryName.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InjuryIncidentIcon extends ValueElement {
        public InjuryIncidentIcon(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InjuryName extends ValueElement {
        public InjuryName(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        public pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryName.EditIncident getEditIncident() {
          return getOrCreateProperty("EditIncident", "EditIncident", null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryName.EditIncident.class);
        }
        
        public pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryName.RemoveIncident getRemoveIncident() {
          return getOrCreateProperty("RemoveIncident", "RemoveIncident", null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryName.RemoveIncident.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class EditIncident extends ClickableActionElement {
          public EditIncident(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class RemoveIncident extends ClickableActionElement {
          public RemoveIncident(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyIncidentIterator extends PCFElement {
    public PropertyIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getPropertyDescription() {
        return getOrCreateProperty("PropertyDescription", "PropertyDescription", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public PropertyIncidentIcon getPropertyIncidentIcon() {
        return getOrCreateProperty("PropertyIncidentIcon", "PropertyIncidentIcon", null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyIncidentIcon.class);
      }
      
      public PropertyName getPropertyName() {
        return getOrCreateProperty("PropertyName", "PropertyName", null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyName.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PropertyIncidentIcon extends ValueElement {
        public PropertyIncidentIcon(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PropertyName extends ValueElement {
        public PropertyName(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        public pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyName.EditIncident getEditIncident() {
          return getOrCreateProperty("EditIncident", "EditIncident", null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyName.EditIncident.class);
        }
        
        public pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyName.RemoveIncident getRemoveIncident() {
          return getOrCreateProperty("RemoveIncident", "RemoveIncident", null, pcftest.InjuryAndFixedPropertyIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyName.RemoveIncident.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class EditIncident extends ClickableActionElement {
          public EditIncident(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class RemoveIncident extends ClickableActionElement {
          public RemoveIncident(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}