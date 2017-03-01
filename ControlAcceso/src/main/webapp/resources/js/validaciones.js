/**
 * Desarrollador: Alejandro Estrada
 * Descripcion: Realiza funciones de validaciones
 */

function isNumberKey(evt)
{
   var charCode = (evt.which) ? evt.which : event.keyCode;
   if (charCode > 31 && (charCode < 48 || charCode > 57))
      return false;

   return true;
}