package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CatastropheHeatMapFilterPanelSet.AssignedToGroup;
import pcftest.CatastropheHeatMapFilterPanelSet.AssignedToGroup.GroupPickerMenuIcon;
import pcftest.CatastropheHeatMapFilterPanelSet.AssignedToGroup.GroupSearchMenuIcon;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/CatastropheHeatMapFilterPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheHeatMapFilterPanelSet extends PCFElement {
  public final static String CHECKSUM = "6bcac308617907c4386ba1a8ea267068";
  
  public CatastropheHeatMapFilterPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignedToGroup getAssignedToGroup() {
    return getOrCreateProperty("AssignedToGroup", "AssignedToGroup", null, pcftest.CatastropheHeatMapFilterPanelSet.AssignedToGroup.class);
  }
  
  public SelectElement getClaimStatus() {
    return getOrCreateProperty("ClaimStatus", "ClaimStatus", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getImageToDisplay() {
    return getOrCreateProperty("ImageToDisplay", "ImageToDisplay", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getPolicyLocationFilter() {
    return getOrCreateProperty("PolicyLocationFilter", "PolicyLocationFilter", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getReportedDate() {
    return getOrCreateProperty("ReportedDate", "ReportedDate", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getcatastrophe() {
    return getOrCreateProperty("catastrophe", "catastrophe", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedToGroup extends SelectElement {
    public AssignedToGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupPickerMenuIcon getGroupPickerMenuIcon() {
      return getOrCreateProperty("GroupPickerMenuIcon", "GroupPickerMenuIcon", null, pcftest.CatastropheHeatMapFilterPanelSet.AssignedToGroup.GroupPickerMenuIcon.class);
    }
    
    public GroupSearchMenuIcon getGroupSearchMenuIcon() {
      return getOrCreateProperty("GroupSearchMenuIcon", "GroupSearchMenuIcon", null, pcftest.CatastropheHeatMapFilterPanelSet.AssignedToGroup.GroupSearchMenuIcon.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupPickerMenuIcon extends ClickableActionElement {
      public GroupPickerMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OrganizationGroupTreePopup click() {
        return clickThis(pcftest.OrganizationGroupTreePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/GroupWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupSearchMenuIcon extends ClickableActionElement {
      public GroupSearchMenuIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GroupSearchPopup click() {
        return clickThis(pcftest.GroupSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  
}