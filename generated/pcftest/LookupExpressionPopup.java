package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
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
import pcftest.LookupExpressionPopup.Cancel;
import pcftest.LookupExpressionPopup.CreateNewLookupToolbar;
import pcftest.LookupExpressionPopup.CreateNewLookupToolbar.CreateNewLookupButton;
import pcftest.LookupExpressionPopup.Edit;
import pcftest.LookupExpressionPopup.LookupExpressionPopup_UpLink;
import pcftest.LookupExpressionPopup.LookupMetaRefreshTag;
import pcftest.LookupExpressionPopup.LookupMetaRefreshTag.CloseBtn;
import pcftest.LookupExpressionPopup.LookupRequestDefDV;
import pcftest.LookupExpressionPopup.LookupRequestDefDV.LTLabelID;
import pcftest.LookupExpressionPopup.LookupRequestDefDV.LookupContextHelp;
import pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV;
import pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.ContextSymbolHeader;
import pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.InputNameHeader;
import pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry.RightOperandErrorIcon;
import pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry.RightOperandValidationLabel;
import pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry.entry2;
import pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV_tb;
import pcftest.LookupExpressionPopup.LookupTablesLV;
import pcftest.LookupExpressionPopup.LookupTablesLV.DescriptionHeader;
import pcftest.LookupExpressionPopup.LookupTablesLV.InputsHeader;
import pcftest.LookupExpressionPopup.LookupTablesLV.OutputHeader;
import pcftest.LookupExpressionPopup.LookupTablesLV.OutputTypeHeader;
import pcftest.LookupExpressionPopup.LookupTablesLV.TableNameHeader;
import pcftest.LookupExpressionPopup.LookupTablesLV._ListPaging;
import pcftest.LookupExpressionPopup.LookupTablesLV.entry.selectButton;
import pcftest.LookupExpressionPopup.LookupTablesLV.entry.unselectButton;
import pcftest.LookupExpressionPopup.Update;
import pcftest.LookupExpressionPopup._Paging;
import pcftest.LookupExpressionPopup.__crumb__;
import pcftest.LookupExpressionPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LookupExpressionPopup extends PCFLocation {
  public final static String CHECKSUM = "b67a6a3d6d846f7b9d6db30df8a7e28a";
  
  public LookupExpressionPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LookupExpressionPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.LookupExpressionPopup.Cancel.class);
  }
  
  public ConditionValidationToolbarButtonSet getConditionValidationToolbarButtonSet() {
    return getOrCreateProperty("ConditionValidationToolbarButtonSet", "ConditionValidationToolbarButtonSet", null, pcftest.ConditionValidationToolbarButtonSet.class);
  }
  
  public CreateNewLookupToolbar getCreateNewLookupToolbar() {
    return getOrCreateProperty("CreateNewLookupToolbar", "CreateNewLookupToolbar", null, pcftest.LookupExpressionPopup.CreateNewLookupToolbar.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.LookupExpressionPopup.Edit.class);
  }
  
  public LookupExpressionPopup_UpLink getLookupExpressionPopup_UpLink() {
    return getOrCreateProperty("LookupExpressionPopup_UpLink", "LookupExpressionPopup_UpLink", null, pcftest.LookupExpressionPopup.LookupExpressionPopup_UpLink.class);
  }
  
  public LookupMetaRefreshTag getLookupMetaRefreshTag() {
    return getOrCreateProperty("LookupMetaRefreshTag", "LookupMetaRefreshTag", null, pcftest.LookupExpressionPopup.LookupMetaRefreshTag.class);
  }
  
  public LookupRequestDefDV getLookupRequestDefDV() {
    return getOrCreateProperty("LookupRequestDefDV", "LookupRequestDefDV", null, pcftest.LookupExpressionPopup.LookupRequestDefDV.class);
  }
  
  public LookupTablesLV getLookupTablesLV() {
    return getOrCreateProperty("LookupTablesLV", "LookupTablesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LookupExpressionPopup.LookupTablesLV.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.LookupExpressionPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LookupExpressionPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LookupExpressionPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LookupExpressionPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateNewLookupToolbar extends PCFElement {
    public CreateNewLookupToolbar(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CreateNewLookupButton getCreateNewLookupButton() {
      return getOrCreateProperty("CreateNewLookupButton", "CreateNewLookupButton", null, pcftest.LookupExpressionPopup.CreateNewLookupToolbar.CreateNewLookupButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreateNewLookupButton extends ClickableActionElement {
      public CreateNewLookupButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LookupExpressionPopup_UpLink extends ClickableActionElement {
    public LookupExpressionPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LookupMetaRefreshTag extends ClickableActionElement {
    public LookupMetaRefreshTag(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.LookupExpressionPopup.LookupMetaRefreshTag.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LookupRequestDefDV extends DetailViewElement {
    public LookupRequestDefDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getLTDescritionID() {
      return getOrCreateProperty("LTDescritionID", "LTDescritionID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LTLabelID getLTLabelID() {
      return getOrCreateProperty("LTLabelID", "LTLabelID", null, pcftest.LookupExpressionPopup.LookupRequestDefDV.LTLabelID.class);
    }
    
    public LookupContextHelp getLookupContextHelp() {
      return getOrCreateProperty("LookupContextHelp", "LookupContextHelp", null, pcftest.LookupExpressionPopup.LookupRequestDefDV.LookupContextHelp.class);
    }
    
    public RuleLookupRequestDefLV getRuleLookupRequestDefLV() {
      return getOrCreateProperty("RuleLookupRequestDefLV", "RuleLookupRequestDefLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.class);
    }
    
    public RuleLookupRequestDefLV_tb getRuleLookupRequestDefLV_tb() {
      return getOrCreateProperty("RuleLookupRequestDefLV_tb", "RuleLookupRequestDefLV_tb", null, pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LTLabelID extends ValueElement {
      public LTLabelID(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LookupContextHelp extends ValueElement {
      public LookupContextHelp(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ContextHelp click() {
        return clickThis(pcftest.ContextHelp.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleLookupRequestDefLV extends PCFElement {
      public RuleLookupRequestDefLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ContextSymbolHeader getContextSymbolHeader() {
        return getOrCreateProperty("ContextSymbolHeader", "ContextSymbolHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.ContextSymbolHeader.class);
      }
      
      public InputNameHeader getInputNameHeader() {
        return getOrCreateProperty("InputNameHeader", "InputNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.InputNameHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ContextSymbolHeader extends ValueElement {
        public ContextSymbolHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InputNameHeader extends ValueElement {
        public InputNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getContextSymbol() {
          return getOrCreateProperty("ContextSymbol", "ContextSymbol", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getInputName() {
          return getOrCreateProperty("InputName", "InputName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public RightOperandErrorIcon getRightOperandErrorIcon() {
          return getOrCreateProperty("RightOperandErrorIcon", "RightOperandErrorIcon", null, pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry.RightOperandErrorIcon.class);
        }
        
        public RightOperandValidationLabel getRightOperandValidationLabel() {
          return getOrCreateProperty("RightOperandValidationLabel", "RightOperandValidationLabel", null, pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry.RightOperandValidationLabel.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<entry2> get_Entries() {
          return getOrCreateEntries(null, pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        public pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry._Select.class);
        }
        
        public pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LookupExpressionPopup.LookupRequestDefDV.RuleLookupRequestDefLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class RightOperandErrorIcon extends ClickableActionElement {
          public RightOperandErrorIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class RightOperandValidationLabel extends ClickableActionElement {
          public RightOperandValidationLabel(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry2 extends PCFElement {
          public entry2(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ValueElement getRightOperandError() {
            return getOrCreateProperty("RightOperandError", "RightOperandError", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleLookupRequestDefLV_tb extends PCFElement {
      public RuleLookupRequestDefLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LookupTablesLV extends PCFElement {
    public LookupTablesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LookupExpressionPopup.LookupTablesLV.DescriptionHeader.class);
    }
    
    public InputsHeader getInputsHeader() {
      return getOrCreateProperty("InputsHeader", "InputsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LookupExpressionPopup.LookupTablesLV.InputsHeader.class);
    }
    
    public OutputHeader getOutputHeader() {
      return getOrCreateProperty("OutputHeader", "OutputHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LookupExpressionPopup.LookupTablesLV.OutputHeader.class);
    }
    
    public OutputTypeHeader getOutputTypeHeader() {
      return getOrCreateProperty("OutputTypeHeader", "OutputTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LookupExpressionPopup.LookupTablesLV.OutputTypeHeader.class);
    }
    
    public TableNameHeader getTableNameHeader() {
      return getOrCreateProperty("TableNameHeader", "TableNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LookupExpressionPopup.LookupTablesLV.TableNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.LookupExpressionPopup.LookupTablesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LookupExpressionPopup.LookupTablesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LookupExpressionPopup.LookupTablesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InputsHeader extends ValueElement {
      public InputsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutputHeader extends ValueElement {
      public OutputHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutputTypeHeader extends ValueElement {
      public OutputTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TableNameHeader extends ValueElement {
      public TableNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInputs() {
        return getOrCreateProperty("Inputs", "Inputs", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getOutput() {
        return getOrCreateProperty("Output", "Output", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getOutputType() {
        return getOrCreateProperty("OutputType", "OutputType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTableName() {
        return getOrCreateProperty("TableName", "TableName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.LookupExpressionPopup.LookupTablesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.LookupExpressionPopup.LookupTablesLV.entry._Select.class);
      }
      
      public pcftest.LookupExpressionPopup.LookupTablesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LookupExpressionPopup.LookupTablesLV.entry._ViewDetail.class);
      }
      
      public selectButton getselectButton() {
        return getOrCreateProperty("selectButton", "selectButton", null, pcftest.LookupExpressionPopup.LookupTablesLV.entry.selectButton.class);
      }
      
      public unselectButton getunselectButton() {
        return getOrCreateProperty("unselectButton", "unselectButton", null, pcftest.LookupExpressionPopup.LookupTablesLV.entry.unselectButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class selectButton extends ClickableActionElement {
        public selectButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class unselectButton extends ClickableActionElement {
        public unselectButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LookupExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}