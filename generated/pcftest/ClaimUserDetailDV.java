package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimUserDetailDV.ClaimUserAssignmentsLV_tb;
import pcftest.ClaimUserDetailDV.EditableClaimUserRolesLV_tb;
import pcftest.ClaimUserDetailDV.EditableClaimUserRolesLV_tb.Add;
import pcftest.ClaimUserDetailDV.EditableClaimUserRolesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUserDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimUserDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "3deb8c6890366c90920560ecb7819746";
  
  public ClaimUserDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimUserAssignmentsLV getClaimUserAssignmentsLV() {
    return getOrCreateProperty("ClaimUserAssignmentsLV", "ClaimUserAssignmentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimUserAssignmentsLV.class);
  }
  
  public ClaimUserAssignmentsLV_tb getClaimUserAssignmentsLV_tb() {
    return getOrCreateProperty("ClaimUserAssignmentsLV_tb", "ClaimUserAssignmentsLV_tb", null, pcftest.ClaimUserDetailDV.ClaimUserAssignmentsLV_tb.class);
  }
  
  public EditableClaimUserRolesLV getEditableClaimUserRolesLV() {
    return getOrCreateProperty("EditableClaimUserRolesLV", "EditableClaimUserRolesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableClaimUserRolesLV.class);
  }
  
  public EditableClaimUserRolesLV_tb getEditableClaimUserRolesLV_tb() {
    return getOrCreateProperty("EditableClaimUserRolesLV_tb", "EditableClaimUserRolesLV_tb", null, pcftest.ClaimUserDetailDV.EditableClaimUserRolesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUserDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimUserAssignmentsLV_tb extends PCFElement {
    public ClaimUserAssignmentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUserDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimUserRolesLV_tb extends PCFElement {
    public EditableClaimUserRolesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ClaimUserDetailDV.EditableClaimUserRolesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimUserDetailDV.EditableClaimUserRolesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUserDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimUserDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}