package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TeamMenuActions.TeamMenuActions_LoadAndVacation;
import pcftest.TeamMenuActions.TeamMenuActions_Preferences;
import pcftest.TeamMenuActions.TeamMenuActions_Statistics;
import pcftest.TeamMenuActions.TeamMenuActions_UserVacation;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/TeamMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamMenuActions extends PCFElement {
  public final static String CHECKSUM = "5ba08f5421488d36dc3f39a2d21b6c98";
  
  public TeamMenuActions(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TeamMenuActions_LoadAndVacation getTeamMenuActions_LoadAndVacation() {
    return getOrCreateProperty("TeamMenuActions_LoadAndVacation", "TeamMenuActions_LoadAndVacation", null, pcftest.TeamMenuActions.TeamMenuActions_LoadAndVacation.class);
  }
  
  public TeamMenuActions_Preferences getTeamMenuActions_Preferences() {
    return getOrCreateProperty("TeamMenuActions_Preferences", "TeamMenuActions_Preferences", null, pcftest.TeamMenuActions.TeamMenuActions_Preferences.class);
  }
  
  public TeamMenuActions_Statistics getTeamMenuActions_Statistics() {
    return getOrCreateProperty("TeamMenuActions_Statistics", "TeamMenuActions_Statistics", null, pcftest.TeamMenuActions.TeamMenuActions_Statistics.class);
  }
  
  public TeamMenuActions_UserVacation getTeamMenuActions_UserVacation() {
    return getOrCreateProperty("TeamMenuActions_UserVacation", "TeamMenuActions_UserVacation", null, pcftest.TeamMenuActions.TeamMenuActions_UserVacation.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamMenuActions_LoadAndVacation extends ClickableActionElement {
    public TeamMenuActions_LoadAndVacation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LoadFactorsPopup click() {
      return clickThis(pcftest.LoadFactorsPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamMenuActions_Preferences extends ClickableActionElement {
    public TeamMenuActions_Preferences(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserPreferencesWorksheet click() {
      return clickThis(pcftest.UserPreferencesWorksheet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamMenuActions_Statistics extends ClickableActionElement {
    public TeamMenuActions_Statistics(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserStatisticsWorksheet click() {
      return clickThis(pcftest.UserStatisticsWorksheet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamMenuActions_UserVacation extends ClickableActionElement {
    public TeamMenuActions_UserVacation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserVacationWorksheet click() {
      return clickThis(pcftest.UserVacationWorksheet.class);
    }
    
    
  }
  
  
}