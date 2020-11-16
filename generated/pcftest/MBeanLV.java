package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MBeanLV.PropertyNameHeader;
import pcftest.MBeanLV.ValueHeader;
import pcftest.MBeanLV.entry;
import pcftest.MBeanLV.entry.ResetBtn;
import pcftest.MBeanLV.entry.SaveBtn;
import pcftest.MBeanLV.entry.entry2;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MBeanLV extends PCFElement {
  public final static String CHECKSUM = "c74b5382a9b99485199e1d5c640b917a";
  
  public MBeanLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PropertyNameHeader getPropertyNameHeader() {
    return getOrCreateProperty("PropertyNameHeader", "PropertyNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MBeanLV.PropertyNameHeader.class);
  }
  
  public ValueHeader getValueHeader() {
    return getOrCreateProperty("ValueHeader", "ValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MBeanLV.ValueHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MBeanLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyNameHeader extends ValueElement {
    public PropertyNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValueHeader extends ValueElement {
    public ValueHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getPropertyName() {
      return getOrCreateProperty("PropertyName", "PropertyName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ResetBtn getResetBtn() {
      return getOrCreateProperty("ResetBtn", "ResetBtn", null, pcftest.MBeanLV.entry.ResetBtn.class);
    }
    
    public SaveBtn getSaveBtn() {
      return getOrCreateProperty("SaveBtn", "SaveBtn", null, pcftest.MBeanLV.entry.SaveBtn.class);
    }
    
    public ValueElement getValue() {
      return getOrCreateProperty("Value", "Value", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry2> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MBeanLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public pcftest.MBeanLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MBeanLV.entry._Select.class);
    }
    
    public pcftest.MBeanLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MBeanLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ResetBtn extends ClickableActionElement {
      public ResetBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SaveBtn extends ClickableActionElement {
      public SaveBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry2 extends RowElement {
      public entry2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getArrayValue() {
        return getOrCreateProperty("ArrayValue", "ArrayValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getArrayValueIdx() {
        return getOrCreateProperty("ArrayValueIdx", "ArrayValueIdx", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getEmptyCell() {
        return getOrCreateProperty("EmptyCell", "EmptyCell", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.MBeanLV.entry.entry2._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.MBeanLV.entry.entry2._Select.class);
      }
      
      public pcftest.MBeanLV.entry.entry2._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MBeanLV.entry.entry2._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/MBeanLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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