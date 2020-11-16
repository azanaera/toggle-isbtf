package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonToolbarButtonSet.ChooseExisting;
import pcftest.RuleComparisonToolbarButtonSet.ChooseImporting;
import pcftest.RuleComparisonToolbarButtonSet.EditNewMerge;
import pcftest.RuleComparisonToolbarButtonSet.EditNewMerge.Existing;
import pcftest.RuleComparisonToolbarButtonSet.EditNewMerge.Importing;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "babfc87512cf6fab66236811309cbbc2";
  
  public RuleComparisonToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ChooseExisting getChooseExisting() {
    return getOrCreateProperty("ChooseExisting", "ChooseExisting", null, pcftest.RuleComparisonToolbarButtonSet.ChooseExisting.class);
  }
  
  public ChooseImporting getChooseImporting() {
    return getOrCreateProperty("ChooseImporting", "ChooseImporting", null, pcftest.RuleComparisonToolbarButtonSet.ChooseImporting.class);
  }
  
  public EditNewMerge getEditNewMerge() {
    return getOrCreateProperty("EditNewMerge", "EditNewMerge", null, pcftest.RuleComparisonToolbarButtonSet.EditNewMerge.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChooseExisting extends ClickableActionElement {
    public ChooseExisting(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChooseImporting extends ClickableActionElement {
    public ChooseImporting(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditNewMerge extends ClickableActionElement {
    public EditNewMerge(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Existing getExisting() {
      return getOrCreateProperty("Existing", "Existing", null, pcftest.RuleComparisonToolbarButtonSet.EditNewMerge.Existing.class);
    }
    
    public Importing getImporting() {
      return getOrCreateProperty("Importing", "Importing", null, pcftest.RuleComparisonToolbarButtonSet.EditNewMerge.Importing.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleComparisonToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Existing extends ClickableActionElement {
      public Existing(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleComparisonToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Importing extends ClickableActionElement {
      public Importing(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}