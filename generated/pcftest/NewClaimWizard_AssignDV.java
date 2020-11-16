package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_AssignDV.CommonAssign;
import pcftest.NewClaimWizard_AssignDV.CommonAssign.CommonAssign_PickerButton;
import pcftest.NewClaimWizard_AssignDV.CommonAssignChoice_Choice;
import pcftest.NewClaimWizard_AssignDV.IndividualAssignChoice_Choice;
import pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV;
import pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.AssigneeHeader;
import pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.ForNameHeader;
import pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV._ListPaging;
import pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.entry;
import pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.entry.Assignee;
import pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.entry.Assignee.Assignee_PickerButton;
import pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.entry._Select;
import pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.entry._ViewDetail;
import pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_AssignDV extends DetailViewElement {
  public final static String CHECKSUM = "de948c3d7ec7330cefe3505ccd9da487";
  
  public NewClaimWizard_AssignDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CommonAssign getCommonAssign() {
    return getOrCreateProperty("CommonAssign", "CommonAssign", null, pcftest.NewClaimWizard_AssignDV.CommonAssign.class);
  }
  
  public CommonAssignChoice_Choice getCommonAssignChoice_Choice() {
    return getOrCreateProperty("CommonAssignChoice_Choice", "CommonAssignChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.NewClaimWizard_AssignDV.CommonAssignChoice_Choice.class);
  }
  
  public ValueElement getIndividualAssign() {
    return getOrCreateProperty("IndividualAssign", "IndividualAssign", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IndividualAssignChoice_Choice getIndividualAssignChoice_Choice() {
    return getOrCreateProperty("IndividualAssignChoice_Choice", "IndividualAssignChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.NewClaimWizard_AssignDV.IndividualAssignChoice_Choice.class);
  }
  
  public NewClaimWizardAssignLV getNewClaimWizardAssignLV() {
    return getOrCreateProperty("NewClaimWizardAssignLV", "NewClaimWizardAssignLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.class);
  }
  
  public NewClaimWizardAssignLV_tb getNewClaimWizardAssignLV_tb() {
    return getOrCreateProperty("NewClaimWizardAssignLV_tb", "NewClaimWizardAssignLV_tb", null, pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/AssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommonAssign extends SelectElement {
    public CommonAssign(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommonAssign_PickerButton getCommonAssign_PickerButton() {
      return getOrCreateProperty("CommonAssign_PickerButton", "CommonAssign_PickerButton", null, pcftest.NewClaimWizard_AssignDV.CommonAssign.CommonAssign_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommonAssign_PickerButton extends ClickableActionElement {
      public CommonAssign_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssigneePickerPopup click() {
        return clickThis(pcftest.AssigneePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommonAssignChoice_Choice extends RadioButtonValueElement {
    public CommonAssignChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IndividualAssignChoice_Choice extends RadioButtonValueElement {
    public IndividualAssignChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizardAssignLV extends PCFElement {
    public NewClaimWizardAssignLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssigneeHeader getAssigneeHeader() {
      return getOrCreateProperty("AssigneeHeader", "AssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.AssigneeHeader.class);
    }
    
    public ForNameHeader getForNameHeader() {
      return getOrCreateProperty("ForNameHeader", "ForNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.ForNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssigneeHeader extends ValueElement {
      public AssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ForNameHeader extends ValueElement {
      public ForNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Assignee getAssignee() {
        return getOrCreateProperty("Assignee", "Assignee", null, pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.entry.Assignee.class);
      }
      
      public ValueElement getForName() {
        return getOrCreateProperty("ForName", "ForName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/AssigneeCell.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Assignee extends SelectElement {
        public Assignee(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Assignee_PickerButton getAssignee_PickerButton() {
          return getOrCreateProperty("Assignee_PickerButton", "Assignee_PickerButton", null, pcftest.NewClaimWizard_AssignDV.NewClaimWizardAssignLV.entry.Assignee.Assignee_PickerButton.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/widgets/AssigneeCell.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Assignee_PickerButton extends ClickableActionElement {
          public Assignee_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public AssigneePickerPopup click() {
            return clickThis(pcftest.AssigneePickerPopup.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizardAssignLV_tb extends PCFElement {
    public NewClaimWizardAssignLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}