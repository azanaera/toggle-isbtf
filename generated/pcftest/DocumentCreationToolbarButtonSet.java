package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentCreationToolbarButtonSet.Cancel;
import pcftest.DocumentCreationToolbarButtonSet.Edit;
import pcftest.DocumentCreationToolbarButtonSet.NewDocumentFromTemplate_CustomUpdate;
import pcftest.DocumentCreationToolbarButtonSet.Update;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/document/DocumentCreationToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentCreationToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "d2ef28be8d635004bc0d0c4ec554b309";
  
  public DocumentCreationToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.DocumentCreationToolbarButtonSet.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.DocumentCreationToolbarButtonSet.Edit.class);
  }
  
  public NewDocumentFromTemplate_CustomUpdate getNewDocumentFromTemplate_CustomUpdate() {
    return getOrCreateProperty("NewDocumentFromTemplate_CustomUpdate", "NewDocumentFromTemplate_CustomUpdate", null, pcftest.DocumentCreationToolbarButtonSet.NewDocumentFromTemplate_CustomUpdate.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.DocumentCreationToolbarButtonSet.Update.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/DocumentCreationToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/DocumentCreationToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/DocumentCreationToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewDocumentFromTemplate_CustomUpdate extends ClickableActionElement {
    public NewDocumentFromTemplate_CustomUpdate(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/DocumentCreationToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}