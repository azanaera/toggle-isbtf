package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PickNoteTemplatePopup extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (lob :  LossType) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.PickNoteTemplatePopup, {lob}, 0)
  }
  
  static function createDestination (searchCriteria :  NoteTemplateSearchCriteria) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.PickNoteTemplatePopup, {searchCriteria}, 1)
  }
  
  function pickValueAndCommit (value :  NoteTemplateSearchResults) : void {
    __widgetOf(this, pcf.PickNoteTemplatePopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (lob :  LossType) : pcf.api.Location {
    return __newDestinationForLocation(pcf.PickNoteTemplatePopup, {lob}, 0).push()
  }
  
  static function push (searchCriteria :  NoteTemplateSearchCriteria) : pcf.api.Location {
    return __newDestinationForLocation(pcf.PickNoteTemplatePopup, {searchCriteria}, 1).push()
  }
  
  
}