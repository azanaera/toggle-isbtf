package perm

uses java.lang.Object
uses javax.annotation.processing.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Incident {
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.IncidentPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.IncidentPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  
}