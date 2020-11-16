package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV;
import pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV;
import pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.DistanceHeader;
import pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.TextDescriptionHeader;
import pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.TimeHeader;
import pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.entry._Select;
import pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.entry._ViewDetail;
import pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV_tb;
import pcftest.AddressBookDirectionsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookDirectionsScreen extends PCFElement {
  public final static String CHECKSUM = "96af57d7648d262b14f5f181e4a5451f";
  
  public AddressBookDirectionsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookDirectionsDV getAddressBookDirectionsDV() {
    return getOrCreateProperty("AddressBookDirectionsDV", "AddressBookDirectionsDV", null, pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<pcftest.AddressBookDirectionsScreen.entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.AddressBookDirectionsScreen.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AddressBookDirectionsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookDirectionsDV extends DetailViewElement {
    public AddressBookDirectionsDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DirectionsLV getDirectionsLV() {
      return getOrCreateProperty("DirectionsLV", "DirectionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.class);
    }
    
    public DirectionsLV_tb getDirectionsLV_tb() {
      return getOrCreateProperty("DirectionsLV_tb", "DirectionsLV_tb", null, pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV_tb.class);
    }
    
    public ValueElement getFromLoc() {
      return getOrCreateProperty("FromLoc", "FromLoc", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getToLoc() {
      return getOrCreateProperty("ToLoc", "ToLoc", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalDist() {
      return getOrCreateProperty("TotalDist", "TotalDist", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalTime() {
      return getOrCreateProperty("TotalTime", "TotalTime", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DirectionsLV extends PCFElement {
      public DirectionsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DistanceHeader getDistanceHeader() {
        return getOrCreateProperty("DistanceHeader", "DistanceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.DistanceHeader.class);
      }
      
      public TextDescriptionHeader getTextDescriptionHeader() {
        return getOrCreateProperty("TextDescriptionHeader", "TextDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.TextDescriptionHeader.class);
      }
      
      public TimeHeader getTimeHeader() {
        return getOrCreateProperty("TimeHeader", "TimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.TimeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DistanceHeader extends ValueElement {
        public DistanceHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TextDescriptionHeader extends ValueElement {
        public TextDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TimeHeader extends ValueElement {
        public TimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDistance() {
          return getOrCreateProperty("Distance", "Distance", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getTextDescription() {
          return getOrCreateProperty("TextDescription", "TextDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getTime() {
          return getOrCreateProperty("Time", "Time", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.AddressBookDirectionsScreen.AddressBookDirectionsDV.DirectionsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DirectionsLV_tb extends PCFElement {
      public DirectionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    
  }
  
  
}