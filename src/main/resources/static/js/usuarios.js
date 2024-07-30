// Call the dataTables jQuery plugin
$(document).ready(function() {
    fnCargarUsuarios();
    $('#usuarios').DataTable();
});

async function fnCargarUsuarios(){
   const request = await fetch('usuarios', {
      method: 'GET',
      headers: {
         'Accept': 'application/json',
         'Content-Type': 'application/json'
      }
   });
   const usuarios = await request.json();
   let usuariosHtml = ''
   for (let usuario of usuarios){
         usuariosHtml += `
         <tr>
            <td>${usuario.id}</td>
            <td>${usuario.nombre} ${usuario.apellido}</td>
            <td>${usuario.email}</td>
            <td>
               <a href="#" class="btn btn-danger btn-circle btn-sm">
                  <i class="fas fa-trash"></i>
               </a>
            </td>
         </tr>
         `;
   }
   document.querySelector("#usuarios tbody").outerHTML = usuariosHtml;
}