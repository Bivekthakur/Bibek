function validate()
{
    var f =document.getElementById("fnmae").value
    var l =document.getElementById("lnmae").value
    var u =document.getElementById("unmae").value
    var p =document.getElementById("psw").value
    var po =document.getElementById("pc").value
    var mn =document.getElementById("phno").value
    var ei =document.getElementById("em").value

    var refl=/[A-Z]/
    var reu=/\w/
    var repm=/\d/
    var reei=/[a-z]@[a-z]*.com/

    if(!(!refl.test(f))||!(f.length>=8))
    {
        if(!refl.test(f))
        {
            alert("first name should contain only CAPTIAL LETTER")
        }
        if(!(f.length>=8))
        {
         alert("length of the first nmae must be EIGHT")

        }
    }
    if(!(!refl.test(l))||!(l.length>=8))
    {
        if(!refl.test(l))
        {
            alert("Last namae should contain only CAPTIAL LETTERS")
        }
            if(!(l.length>=8))
            {
                alert("Length of the last must be EIGHT")
            }
    }
    if(!reu.test(u))
    {        
        alert("username should not contain spaces or special symbol")
    }
    if(p.length<=8)
    {
        alert("To secure your account password should be EIGHT character in lenth")

    }
    if(!(!repm.test(po))||!(po.length==6))
    {
        if(!repm.test(po))
        {
            alert("pOstal code contains only Digts")

        }
        if(!(po.length==6))
        {
            alert("Length of the postal code must be SIX ")
        }

    }
    if(!reei.test(ei))
    {
        alert("please check out your EMAIL-ID")
    }
    if(!(repm.test(mn))||(mn.length==6))
    {
        if(!repm.test(mn))
        {

          alert("Phone number contain only DIGTS")
        }
       if(!(mn.length==10))
        {
        alert("length of phone number must be TEN")
        }
    }
}
   





