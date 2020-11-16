package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OtherInstructionsPanelSet._ListPaging;
import pcftest.OtherInstructionsPanelSet.entry;
import pcftest.OtherInstructionsPanelSet.entry.entry2;
import pcftest.OtherInstructionsPanelSet.entry.entry2.instructionType;
import pcftest.OtherInstructionsPanelSet.entry.entry2.instructionType.edit;
import pcftest.OtherInstructionsPanelSet.entry.entry2.instructionType.remove;
import typekey.InstructionType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherInstructionsPanelSet extends PCFElement {
  public final static String CHECKSUM = "2b380ef3e2be8be1e974331298c4334a";
  
  public OtherInstructionsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.OtherInstructionsPanelSet.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.OtherInstructionsPanelSet._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry2> get_Entries() {
      return getOrCreateEntries(null, pcftest.OtherInstructionsPanelSet.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public ValueElement getinstructionCategoryHeader() {
      return getOrCreateProperty("instructionCategoryHeader", "instructionCategoryHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry2 extends PCFElement {
      public entry2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public ValueElement getcomment() {
        return getOrCreateProperty("comment", "comment", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public instructionType getinstructionType() {
        return getOrCreateProperty("instructionType", "instructionType", null, pcftest.OtherInstructionsPanelSet.entry.entry2.instructionType.class);
      }
      
      public ValueElement getpolicyType() {
        return getOrCreateProperty("policyType", "policyType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class instructionType extends SelectElement {
        public instructionType(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OtherInstructionPopup click() {
          return clickThis(pcftest.OtherInstructionPopup.class);
        }
        
        public OptionElement getOptionByTypeKey(InstructionType arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public InstructionType getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InstructionType.getTypeKey(myValue);
        }
        
        public edit getedit() {
          return getOrCreateProperty("edit", "edit", null, pcftest.OtherInstructionsPanelSet.entry.entry2.instructionType.edit.class);
        }
        
        public remove getremove() {
          return getOrCreateProperty("remove", "remove", null, pcftest.OtherInstructionsPanelSet.entry.entry2.instructionType.remove.class);
        }
        
        public void setTypeKeyValue(InstructionType arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class edit extends ClickableActionElement {
          public edit(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public OtherInstructionPopup click() {
            return clickThis(pcftest.OtherInstructionPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class remove extends ClickableActionElement {
          public remove(ISmokeTest helper, PCFElementId componentId)  {
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