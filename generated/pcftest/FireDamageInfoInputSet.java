package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FireDamageInfoInputSet.RoomsDamagedLVInput;
import pcftest.FireDamageInfoInputSet.RoomsDamagedLVInput.EditableRoomsLV_tb;
import pcftest.FireDamageInfoInputSet.RoomsDamagedLVInput.EditableRoomsLV_tb.Add;
import pcftest.FireDamageInfoInputSet.RoomsDamagedLVInput.EditableRoomsLV_tb.Remove;
import pcftest.FireDamageInfoInputSet.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/FireDamageInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FireDamageInfoInputSet extends PCFElement {
  public final static String CHECKSUM = "567020c8dfd7d32e23e7b4db2b5d2b25";
  
  public FireDamageInfoInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDamageTypesLabel() {
    return getOrCreateProperty("DamageTypesLabel", "DamageTypesLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDamagedAreaSize() {
    return getOrCreateProperty("DamagedAreaSize", "DamagedAreaSize", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMaterialsDamaged() {
    return getOrCreateProperty("MaterialsDamaged", "MaterialsDamaged", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RoomsDamagedLVInput getRoomsDamagedLVInput() {
    return getOrCreateProperty("RoomsDamagedLVInput", "RoomsDamagedLVInput", null, pcftest.FireDamageInfoInputSet.RoomsDamagedLVInput.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.FireDamageInfoInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/FireDamageInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RoomsDamagedLVInput extends PCFElement {
    public RoomsDamagedLVInput(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableRoomsLV getEditableRoomsLV() {
      return getOrCreateProperty("EditableRoomsLV", "EditableRoomsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableRoomsLV.class);
    }
    
    public EditableRoomsLV_tb getEditableRoomsLV_tb() {
      return getOrCreateProperty("EditableRoomsLV_tb", "EditableRoomsLV_tb", null, pcftest.FireDamageInfoInputSet.RoomsDamagedLVInput.EditableRoomsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/FireDamageInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableRoomsLV_tb extends PCFElement {
      public EditableRoomsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.FireDamageInfoInputSet.RoomsDamagedLVInput.EditableRoomsLV_tb.Add.class);
      }
      
      public Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.FireDamageInfoInputSet.RoomsDamagedLVInput.EditableRoomsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/FireDamageInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/FireDamageInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/FireDamageInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckboxValueElement getDamage() {
      return getOrCreateProperty("Damage", "Damage", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    
  }
  
  
}