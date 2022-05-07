const formulario = document.getElementById ("form1")
// const button = document.getElementById ("")


function getFormvalue(e)

{

  var x=document.getElementById("form1");
  for (var i=0;i<x.length;i++)
  {
      
   if (x.elements[i].value!='Submit')
    {  
        e.preventDefault();

      console.log(x.elements[i].value);
      

     }  
   }
}

formulario.addEventListener("submit",getFormvalue)
