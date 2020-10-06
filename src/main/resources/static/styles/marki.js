jQuery( document ).ready(
    function(){
        go();
    });


function go(){
    jQuery('#marki').animate({ "margin-left" : "-4100px"  }, 96000 , "linear", back);
    }

function back() {
    jQuery('#marki').animate({ "margin-left" : "0"  }, 96000 , "linear", go);
    }

