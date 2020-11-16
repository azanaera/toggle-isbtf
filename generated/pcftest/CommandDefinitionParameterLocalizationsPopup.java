package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandDefinitionParameterLocalizationsPopup.Cancel;
import pcftest.CommandDefinitionParameterLocalizationsPopup.CommandDefinitionParameterLocalizationsPopup_UpLink;
import pcftest.CommandDefinitionParameterLocalizationsPopup.Edit;
import pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV;
import pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV._ListPaging;
import pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.chkboxHeader;
import pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.entry;
import pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.entry._Select;
import pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.entry._ViewDetail;
import pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.languageHeader;
import pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.valueHeader;
import pcftest.CommandDefinitionParameterLocalizationsPopup.Update;
import pcftest.CommandDefinitionParameterLocalizationsPopup._Paging;
import pcftest.CommandDefinitionParameterLocalizationsPopup.__crumb__;
import pcftest.CommandDefinitionParameterLocalizationsPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandDefinitionParameterLocalizationsPopup extends PCFLocation {
  public final static String CHECKSUM = "d2e8a83952bd2e35cbbca41e2c8ed448";
  
  public CommandDefinitionParameterLocalizationsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CommandDefinitionParameterLocalizationsPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CommandDefinitionParameterLocalizationsPopup.Cancel.class);
  }
  
  public CommandDefinitionParameterLocalizationsPopup_UpLink getCommandDefinitionParameterLocalizationsPopup_UpLink() {
    return getOrCreateProperty("CommandDefinitionParameterLocalizationsPopup_UpLink", "CommandDefinitionParameterLocalizationsPopup_UpLink", null, pcftest.CommandDefinitionParameterLocalizationsPopup.CommandDefinitionParameterLocalizationsPopup_UpLink.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.CommandDefinitionParameterLocalizationsPopup.Edit.class);
  }
  
  public LocalizedCommandDefinitionParameterLV getLocalizedCommandDefinitionParameterLV() {
    return getOrCreateProperty("LocalizedCommandDefinitionParameterLV", "LocalizedCommandDefinitionParameterLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.CommandDefinitionParameterLocalizationsPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CommandDefinitionParameterLocalizationsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CommandDefinitionParameterLocalizationsPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CommandDefinitionParameterLocalizationsPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandDefinitionParameterLocalizationsPopup_UpLink extends ClickableActionElement {
    public CommandDefinitionParameterLocalizationsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocalizedCommandDefinitionParameterLV extends PCFElement {
    public LocalizedCommandDefinitionParameterLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV._ListPaging.class);
    }
    
    public chkboxHeader getchkboxHeader() {
      return getOrCreateProperty("chkboxHeader", "chkboxHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.chkboxHeader.class);
    }
    
    public languageHeader getlanguageHeader() {
      return getOrCreateProperty("languageHeader", "languageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.languageHeader.class);
    }
    
    public valueHeader getvalueHeader() {
      return getOrCreateProperty("valueHeader", "valueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.valueHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class chkboxHeader extends ValueElement {
      public chkboxHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CommandDefinitionParameterLocalizationsPopup.LocalizedCommandDefinitionParameterLV.entry._ViewDetail.class);
      }
      
      public CheckboxValueElement getchkbox() {
        return getOrCreateProperty("chkbox", "chkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      public ValueElement getlanguage() {
        return getOrCreateProperty("language", "language", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getvalue() {
        return getOrCreateProperty("value", "value", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class languageHeader extends ValueElement {
      public languageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class valueHeader extends ValueElement {
      public valueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionParameterLocalizationsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}