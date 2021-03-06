package perm

uses java.lang.Object
uses javax.annotation.processing.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Review {
  static function delete (object :  Object) : boolean {
    return com.guidewire._generated.security.ReviewPermKeys.DELETE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static property get create () : boolean {
    return com.guidewire._generated.security.ReviewPermKeys.CREATE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  static property get edit () : boolean {
    return com.guidewire._generated.security.ReviewPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  static property get list () : boolean {
    return com.guidewire._generated.security.ReviewPermKeys.LIST.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  static property get view () : boolean {
    return com.guidewire._generated.security.ReviewPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}