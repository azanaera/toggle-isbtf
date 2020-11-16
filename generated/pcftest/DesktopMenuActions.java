package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DesktopMenuActions.DesktopMenuActions_LoadAndVacation;
import pcftest.DesktopMenuActions.DesktopMenuActions_Preferences;
import pcftest.DesktopMenuActions.DesktopMenuActions_Statistics;
import pcftest.DesktopMenuActions.DesktopMenuActions_UserVacation;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/DesktopMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopMenuActions extends PCFElement {
  public final static String CHECKSUM = "497cb0dd67d37b830cf1fb76c1d6ad54";
  
  public DesktopMenuActions(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DesktopMenuActions_LoadAndVacation getDesktopMenuActions_LoadAndVacation() {
    return getOrCreateProperty("DesktopMenuActions_LoadAndVacation", "DesktopMenuActions_LoadAndVacation", null, pcftest.DesktopMenuActions.DesktopMenuActions_LoadAndVacation.class);
  }
  
  public DesktopMenuActions_Preferences getDesktopMenuActions_Preferences() {
    return getOrCreateProperty("DesktopMenuActions_Preferences", "DesktopMenuActions_Preferences", null, pcftest.DesktopMenuActions.DesktopMenuActions_Preferences.class);
  }
  
  public DesktopMenuActions_Statistics getDesktopMenuActions_Statistics() {
    return getOrCreateProperty("DesktopMenuActions_Statistics", "DesktopMenuActions_Statistics", null, pcftest.DesktopMenuActions.DesktopMenuActions_Statistics.class);
  }
  
  public DesktopMenuActions_UserVacation getDesktopMenuActions_UserVacation() {
    return getOrCreateProperty("DesktopMenuActions_UserVacation", "DesktopMenuActions_UserVacation", null, pcftest.DesktopMenuActions.DesktopMenuActions_UserVacation.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/DesktopMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopMenuActions_LoadAndVacation extends ClickableActionElement {
    public DesktopMenuActions_LoadAndVacation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LoadFactorsPopup click() {
      return clickThis(pcftest.LoadFactorsPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/DesktopMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopMenuActions_Preferences extends ClickableActionElement {
    public DesktopMenuActions_Preferences(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserPreferencesWorksheet click() {
      return clickThis(pcftest.UserPreferencesWorksheet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/DesktopMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopMenuActions_Statistics extends ClickableActionElement {
    public DesktopMenuActions_Statistics(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserStatisticsWorksheet click() {
      return clickThis(pcftest.UserStatisticsWorksheet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/DesktopMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopMenuActions_UserVacation extends ClickableActionElement {
    public DesktopMenuActions_UserVacation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserVacationWorksheet click() {
      return clickThis(pcftest.UserVacationWorksheet.class);
    }
    
    
  }
  
  
}