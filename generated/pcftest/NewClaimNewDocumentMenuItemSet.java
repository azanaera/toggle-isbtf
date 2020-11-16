package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_Create;
import pcftest.NewClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_IndicateExists;
import pcftest.NewClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_Link;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimNewDocumentMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "27be62eb4d05def621d4580338921504";
  
  public NewClaimNewDocumentMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimNewDocumentMenuItemSet_Create getClaimNewDocumentMenuItemSet_Create() {
    return getOrCreateProperty("ClaimNewDocumentMenuItemSet_Create", "ClaimNewDocumentMenuItemSet_Create", null, pcftest.NewClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_Create.class);
  }
  
  public ClaimNewDocumentMenuItemSet_IndicateExists getClaimNewDocumentMenuItemSet_IndicateExists() {
    return getOrCreateProperty("ClaimNewDocumentMenuItemSet_IndicateExists", "ClaimNewDocumentMenuItemSet_IndicateExists", null, pcftest.NewClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_IndicateExists.class);
  }
  
  public ClaimNewDocumentMenuItemSet_Link getClaimNewDocumentMenuItemSet_Link() {
    return getOrCreateProperty("ClaimNewDocumentMenuItemSet_Link", "ClaimNewDocumentMenuItemSet_Link", null, pcftest.NewClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_Link.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentMenuItemSet_Create extends ClickableActionElement {
    public ClaimNewDocumentMenuItemSet_Create(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimNewDocumentFromTemplateWorksheet click() {
      return clickThis(pcftest.NewClaimNewDocumentFromTemplateWorksheet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentMenuItemSet_IndicateExists extends ClickableActionElement {
    public ClaimNewDocumentMenuItemSet_IndicateExists(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimNewDocumentExistsWorksheet click() {
      return clickThis(pcftest.NewClaimNewDocumentExistsWorksheet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/NewClaimNewDocumentMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentMenuItemSet_Link extends ClickableActionElement {
    public ClaimNewDocumentMenuItemSet_Link(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimNewDocumentLinkedWorksheet click() {
      return clickThis(pcftest.NewClaimNewDocumentLinkedWorksheet.class);
    }
    
    
  }
  
  
}