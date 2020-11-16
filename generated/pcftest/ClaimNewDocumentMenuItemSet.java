package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_Create;
import pcftest.ClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_IndicateExists;
import pcftest.ClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_Link;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewDocumentMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "ce18a0511c8aac31cb8b5b36887fbab3";
  
  public ClaimNewDocumentMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimNewDocumentMenuItemSet_Create getClaimNewDocumentMenuItemSet_Create() {
    return getOrCreateProperty("ClaimNewDocumentMenuItemSet_Create", "ClaimNewDocumentMenuItemSet_Create", null, pcftest.ClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_Create.class);
  }
  
  public ClaimNewDocumentMenuItemSet_IndicateExists getClaimNewDocumentMenuItemSet_IndicateExists() {
    return getOrCreateProperty("ClaimNewDocumentMenuItemSet_IndicateExists", "ClaimNewDocumentMenuItemSet_IndicateExists", null, pcftest.ClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_IndicateExists.class);
  }
  
  public ClaimNewDocumentMenuItemSet_Link getClaimNewDocumentMenuItemSet_Link() {
    return getOrCreateProperty("ClaimNewDocumentMenuItemSet_Link", "ClaimNewDocumentMenuItemSet_Link", null, pcftest.ClaimNewDocumentMenuItemSet.ClaimNewDocumentMenuItemSet_Link.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentMenuItemSet_Create extends ClickableActionElement {
    public ClaimNewDocumentMenuItemSet_Create(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimNewDocumentFromTemplateWorksheet click() {
      return clickThis(pcftest.ClaimNewDocumentFromTemplateWorksheet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentMenuItemSet_IndicateExists extends ClickableActionElement {
    public ClaimNewDocumentMenuItemSet_IndicateExists(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimNewDocumentExistsWorksheet click() {
      return clickThis(pcftest.ClaimNewDocumentExistsWorksheet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newdocument/ClaimNewDocumentMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentMenuItemSet_Link extends ClickableActionElement {
    public ClaimNewDocumentMenuItemSet_Link(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimNewDocumentLinkedWorksheet click() {
      return clickThis(pcftest.ClaimNewDocumentLinkedWorksheet.class);
    }
    
    
  }
  
  
}