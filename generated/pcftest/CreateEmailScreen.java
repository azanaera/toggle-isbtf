package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CreateEmailScreen.AttachedDocumentsLV;
import pcftest.CreateEmailScreen.AttachedDocumentsLV.DocumentHeader;
import pcftest.CreateEmailScreen.AttachedDocumentsLV_tb;
import pcftest.CreateEmailScreen.AttachedDocumentsLV_tb.AddDocumentButton;
import pcftest.CreateEmailScreen.BccRecipientLV;
import pcftest.CreateEmailScreen.BccRecipientLV.BccEmailHeader;
import pcftest.CreateEmailScreen.BccRecipientLV.BccNameHeader;
import pcftest.CreateEmailScreen.BccRecipientLV_tb;
import pcftest.CreateEmailScreen.CcRecipientLV;
import pcftest.CreateEmailScreen.CcRecipientLV.CcEmailHeader;
import pcftest.CreateEmailScreen.CcRecipientLV.CcNameHeader;
import pcftest.CreateEmailScreen.CcRecipientLV_tb;
import pcftest.CreateEmailScreen.EmailWorksheet_UseTemplateButton;
import pcftest.CreateEmailScreen.Language;
import pcftest.CreateEmailScreen.NoDefaultTemplate;
import pcftest.CreateEmailScreen.ShowBCCRecipients;
import pcftest.CreateEmailScreen.ShowCCRecipients;
import pcftest.CreateEmailScreen.ToRecipientLV;
import pcftest.CreateEmailScreen.ToRecipientLV.ToEmailHeader;
import pcftest.CreateEmailScreen.ToRecipientLV.ToNameHeader;
import pcftest.CreateEmailScreen.ToRecipientLV_tb;
import pcftest.CreateEmailScreen.ToolbarButton0;
import pcftest.CreateEmailScreen.ToolbarButton1;
import pcftest.CreateEmailScreen._msgs;
import pcftest.CreateEmailScreen.templateEvalErro;
import typekey.LanguageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CreateEmailScreen extends PCFElement {
  public final static String CHECKSUM = "6372edb062fdcc0005328d548e776fd1";
  
  public CreateEmailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AttachedDocumentsLV getAttachedDocumentsLV() {
    return getOrCreateProperty("AttachedDocumentsLV", "AttachedDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CreateEmailScreen.AttachedDocumentsLV.class);
  }
  
  public AttachedDocumentsLV_tb getAttachedDocumentsLV_tb() {
    return getOrCreateProperty("AttachedDocumentsLV_tb", "AttachedDocumentsLV_tb", null, pcftest.CreateEmailScreen.AttachedDocumentsLV_tb.class);
  }
  
  public BccRecipientLV getBccRecipientLV() {
    return getOrCreateProperty("BccRecipientLV", "BccRecipientLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CreateEmailScreen.BccRecipientLV.class);
  }
  
  public BccRecipientLV_tb getBccRecipientLV_tb() {
    return getOrCreateProperty("BccRecipientLV_tb", "BccRecipientLV_tb", null, pcftest.CreateEmailScreen.BccRecipientLV_tb.class);
  }
  
  public CcRecipientLV getCcRecipientLV() {
    return getOrCreateProperty("CcRecipientLV", "CcRecipientLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CreateEmailScreen.CcRecipientLV.class);
  }
  
  public CcRecipientLV_tb getCcRecipientLV_tb() {
    return getOrCreateProperty("CcRecipientLV_tb", "CcRecipientLV_tb", null, pcftest.CreateEmailScreen.CcRecipientLV_tb.class);
  }
  
  public EmailWorksheet_UseTemplateButton getEmailWorksheet_UseTemplateButton() {
    return getOrCreateProperty("EmailWorksheet_UseTemplateButton", "EmailWorksheet_UseTemplateButton", null, pcftest.CreateEmailScreen.EmailWorksheet_UseTemplateButton.class);
  }
  
  public Language getLanguage() {
    return getOrCreateProperty("Language", "Language", null, pcftest.CreateEmailScreen.Language.class);
  }
  
  public NoDefaultTemplate getNoDefaultTemplate() {
    return getOrCreateProperty("NoDefaultTemplate", "NoDefaultTemplate", null, pcftest.CreateEmailScreen.NoDefaultTemplate.class);
  }
  
  public CheckboxValueElement getSaveAsDocument() {
    return getOrCreateProperty("SaveAsDocument", "SaveAsDocument", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ShowBCCRecipients getShowBCCRecipients() {
    return getOrCreateProperty("ShowBCCRecipients", "ShowBCCRecipients", null, pcftest.CreateEmailScreen.ShowBCCRecipients.class);
  }
  
  public ShowCCRecipients getShowCCRecipients() {
    return getOrCreateProperty("ShowCCRecipients", "ShowCCRecipients", null, pcftest.CreateEmailScreen.ShowCCRecipients.class);
  }
  
  public ValueElement getTextAreaInput0() {
    return getOrCreateProperty("TextAreaInput0", "TextAreaInput0", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTextInput0() {
    return getOrCreateProperty("TextInput0", "TextInput0", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTextInput1() {
    return getOrCreateProperty("TextInput1", "TextInput1", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTextInput2() {
    return getOrCreateProperty("TextInput2", "TextInput2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ToRecipientLV getToRecipientLV() {
    return getOrCreateProperty("ToRecipientLV", "ToRecipientLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CreateEmailScreen.ToRecipientLV.class);
  }
  
  public ToRecipientLV_tb getToRecipientLV_tb() {
    return getOrCreateProperty("ToRecipientLV_tb", "ToRecipientLV_tb", null, pcftest.CreateEmailScreen.ToRecipientLV_tb.class);
  }
  
  public ToolbarButton0 getToolbarButton0() {
    return getOrCreateProperty("ToolbarButton0", "ToolbarButton0", null, pcftest.CreateEmailScreen.ToolbarButton0.class);
  }
  
  public ToolbarButton1 getToolbarButton1() {
    return getOrCreateProperty("ToolbarButton1", "ToolbarButton1", null, pcftest.CreateEmailScreen.ToolbarButton1.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CreateEmailScreen._msgs.class);
  }
  
  public templateEvalErro gettemplateEvalErro() {
    return getOrCreateProperty("templateEvalErro", "templateEvalErro", null, pcftest.CreateEmailScreen.templateEvalErro.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttachedDocumentsLV extends PCFElement {
    public AttachedDocumentsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DocumentHeader getDocumentHeader() {
      return getOrCreateProperty("DocumentHeader", "DocumentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CreateEmailScreen.AttachedDocumentsLV.DocumentHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.CreateEmailScreen.AttachedDocumentsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CreateEmailScreen.AttachedDocumentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.CreateEmailScreen.AttachedDocumentsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CreateEmailScreen.AttachedDocumentsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DocumentHeader extends ValueElement {
      public DocumentHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getDocument() {
        return getOrCreateProperty("Document", "Document", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.CreateEmailScreen.AttachedDocumentsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.CreateEmailScreen.AttachedDocumentsLV.entry._Select.class);
      }
      
      public pcftest.CreateEmailScreen.AttachedDocumentsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CreateEmailScreen.AttachedDocumentsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttachedDocumentsLV_tb extends PCFElement {
    public AttachedDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CreateEmailScreen.AttachedDocumentsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.CreateEmailScreen.AttachedDocumentsLV_tb.Add.class);
    }
    
    public AddDocumentButton getAddDocumentButton() {
      return getOrCreateProperty("AddDocumentButton", "AddDocumentButton", null, pcftest.CreateEmailScreen.AttachedDocumentsLV_tb.AddDocumentButton.class);
    }
    
    public pcftest.CreateEmailScreen.AttachedDocumentsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.CreateEmailScreen.AttachedDocumentsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddDocumentButton extends ClickableActionElement {
      public AddDocumentButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickExistingDocumentPopup click() {
        return clickThis(pcftest.PickExistingDocumentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BccRecipientLV extends PCFElement {
    public BccRecipientLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CreateEmailScreen.BccRecipientLV.ABPickerCellHeader getABPickerCellHeader() {
      return getOrCreateProperty("ABPickerCellHeader", "ABPickerCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CreateEmailScreen.BccRecipientLV.ABPickerCellHeader.class);
    }
    
    public BccEmailHeader getBccEmailHeader() {
      return getOrCreateProperty("BccEmailHeader", "BccEmailHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CreateEmailScreen.BccRecipientLV.BccEmailHeader.class);
    }
    
    public BccNameHeader getBccNameHeader() {
      return getOrCreateProperty("BccNameHeader", "BccNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CreateEmailScreen.BccRecipientLV.BccNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.CreateEmailScreen.BccRecipientLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CreateEmailScreen.BccRecipientLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.CreateEmailScreen.BccRecipientLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CreateEmailScreen.BccRecipientLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ABPickerCellHeader extends ValueElement {
      public ABPickerCellHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BccEmailHeader extends ValueElement {
      public BccEmailHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BccNameHeader extends ValueElement {
      public BccNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.CreateEmailScreen.BccRecipientLV.entry.ABPickerLink getABPickerLink() {
        return getOrCreateProperty("ABPickerLink", "ABPickerLink", null, pcftest.CreateEmailScreen.BccRecipientLV.entry.ABPickerLink.class);
      }
      
      public ValueElement getBccEmail() {
        return getOrCreateProperty("BccEmail", "BccEmail", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getBccName() {
        return getOrCreateProperty("BccName", "BccName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.CreateEmailScreen.BccRecipientLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.CreateEmailScreen.BccRecipientLV.entry._Select.class);
      }
      
      public pcftest.CreateEmailScreen.BccRecipientLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CreateEmailScreen.BccRecipientLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ABPickerLink extends ClickableActionElement {
        public ABPickerLink(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddressBookPickerPopup click() {
          return clickThis(pcftest.AddressBookPickerPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BccRecipientLV_tb extends PCFElement {
    public BccRecipientLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CreateEmailScreen.BccRecipientLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.CreateEmailScreen.BccRecipientLV_tb.Add.class);
    }
    
    public pcftest.CreateEmailScreen.BccRecipientLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.CreateEmailScreen.BccRecipientLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CcRecipientLV extends PCFElement {
    public CcRecipientLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CreateEmailScreen.CcRecipientLV.ABPickerCellHeader getABPickerCellHeader() {
      return getOrCreateProperty("ABPickerCellHeader", "ABPickerCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CreateEmailScreen.CcRecipientLV.ABPickerCellHeader.class);
    }
    
    public CcEmailHeader getCcEmailHeader() {
      return getOrCreateProperty("CcEmailHeader", "CcEmailHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CreateEmailScreen.CcRecipientLV.CcEmailHeader.class);
    }
    
    public CcNameHeader getCcNameHeader() {
      return getOrCreateProperty("CcNameHeader", "CcNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CreateEmailScreen.CcRecipientLV.CcNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.CreateEmailScreen.CcRecipientLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CreateEmailScreen.CcRecipientLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.CreateEmailScreen.CcRecipientLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CreateEmailScreen.CcRecipientLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ABPickerCellHeader extends ValueElement {
      public ABPickerCellHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CcEmailHeader extends ValueElement {
      public CcEmailHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CcNameHeader extends ValueElement {
      public CcNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.CreateEmailScreen.CcRecipientLV.entry.ABPickerLink getABPickerLink() {
        return getOrCreateProperty("ABPickerLink", "ABPickerLink", null, pcftest.CreateEmailScreen.CcRecipientLV.entry.ABPickerLink.class);
      }
      
      public ValueElement getCcEmail() {
        return getOrCreateProperty("CcEmail", "CcEmail", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCcName() {
        return getOrCreateProperty("CcName", "CcName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.CreateEmailScreen.CcRecipientLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.CreateEmailScreen.CcRecipientLV.entry._Select.class);
      }
      
      public pcftest.CreateEmailScreen.CcRecipientLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CreateEmailScreen.CcRecipientLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ABPickerLink extends ClickableActionElement {
        public ABPickerLink(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddressBookPickerPopup click() {
          return clickThis(pcftest.AddressBookPickerPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CcRecipientLV_tb extends PCFElement {
    public CcRecipientLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CreateEmailScreen.CcRecipientLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.CreateEmailScreen.CcRecipientLV_tb.Add.class);
    }
    
    public pcftest.CreateEmailScreen.CcRecipientLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.CreateEmailScreen.CcRecipientLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmailWorksheet_UseTemplateButton extends ClickableActionElement {
    public EmailWorksheet_UseTemplateButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PickEmailTemplatePopup click() {
      return clickThis(pcftest.PickEmailTemplatePopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Language extends SelectElement {
    public Language(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LanguageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LanguageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LanguageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LanguageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoDefaultTemplate extends ClickableActionElement {
    public NoDefaultTemplate(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CreateEmailScreen.NoDefaultTemplate.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CreateEmailScreen.NoDefaultTemplate.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ShowBCCRecipients extends ValueElement {
    public ShowBCCRecipients(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ShowCCRecipients extends ValueElement {
    public ShowCCRecipients(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ToRecipientLV extends PCFElement {
    public ToRecipientLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CreateEmailScreen.ToRecipientLV.ABPickerCellHeader getABPickerCellHeader() {
      return getOrCreateProperty("ABPickerCellHeader", "ABPickerCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CreateEmailScreen.ToRecipientLV.ABPickerCellHeader.class);
    }
    
    public ToEmailHeader getToEmailHeader() {
      return getOrCreateProperty("ToEmailHeader", "ToEmailHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CreateEmailScreen.ToRecipientLV.ToEmailHeader.class);
    }
    
    public ToNameHeader getToNameHeader() {
      return getOrCreateProperty("ToNameHeader", "ToNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CreateEmailScreen.ToRecipientLV.ToNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.CreateEmailScreen.ToRecipientLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CreateEmailScreen.ToRecipientLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.CreateEmailScreen.ToRecipientLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CreateEmailScreen.ToRecipientLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ABPickerCellHeader extends ValueElement {
      public ABPickerCellHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ToEmailHeader extends ValueElement {
      public ToEmailHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ToNameHeader extends ValueElement {
      public ToNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.CreateEmailScreen.ToRecipientLV.entry.ABPickerLink getABPickerLink() {
        return getOrCreateProperty("ABPickerLink", "ABPickerLink", null, pcftest.CreateEmailScreen.ToRecipientLV.entry.ABPickerLink.class);
      }
      
      public ValueElement getToEmail() {
        return getOrCreateProperty("ToEmail", "ToEmail", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getToName() {
        return getOrCreateProperty("ToName", "ToName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.CreateEmailScreen.ToRecipientLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.CreateEmailScreen.ToRecipientLV.entry._Select.class);
      }
      
      public pcftest.CreateEmailScreen.ToRecipientLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CreateEmailScreen.ToRecipientLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ABPickerLink extends ClickableActionElement {
        public ABPickerLink(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddressBookPickerPopup click() {
          return clickThis(pcftest.AddressBookPickerPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ToRecipientLV_tb extends PCFElement {
    public ToRecipientLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CreateEmailScreen.ToRecipientLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.CreateEmailScreen.ToRecipientLV_tb.Add.class);
    }
    
    public pcftest.CreateEmailScreen.ToRecipientLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.CreateEmailScreen.ToRecipientLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ToolbarButton0 extends ClickableActionElement {
    public ToolbarButton0(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ToolbarButton1 extends ClickableActionElement {
    public ToolbarButton1(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class templateEvalErro extends ClickableActionElement {
    public templateEvalErro(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CreateEmailScreen.templateEvalErro.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CreateEmailScreen.templateEvalErro.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/email/CreateEmailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}