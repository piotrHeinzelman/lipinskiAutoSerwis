jQuery( document ).ready( 

function(){
    myparent = jQuery('div#Ban');
    mytop = jQuery('div#Banner_OVER');
    setInterval('rotate()',8000);
    }
)

function rotate() {

    myfirst = '';
    mylast = '';

    myfirst = myparent.children().first();
    mylast = myparent.children().last();


    myfirst.css("z-index","0").css("opacity","1");
    mylast.css("opacity","0").css("z-index","10").detach().prependTo(myparent).animate({"opacity":"1"}, 1500 , f2);
    }

function f2(){
    myfirst.css("z-index","0").css("opacity","0");
    mylast="";
    myfirst="";
    }