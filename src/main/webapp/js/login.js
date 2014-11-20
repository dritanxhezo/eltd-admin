var login = $('#loginform');
var recover = $('#recoveridform');
var register = $('#recoverpassform');
var login_recover = $('#loginform, #recoveridform');
var login_register = $('#loginform, #recoverpassform');
var recover_register = $('#recoveridform, #recoverpassform');
var loginbox = $('#loginbox');
var userbox = $('#user');
var animation_speed = 300;

$(document).ready(function(){

    var loc = window.location + '';
    var ee = loc.split('#');

    if(ee[1] == 'recoveridform' && ee[1] != undefined){
        loginbox.css({'height':'183px'});
        $('#loginform, #recoverpassform').css({'z-index':'100','opacity':'0.01'});
        $('#recoveridform').css({'z-index':'200','opacity':'1','display':'block'});
    } else if(ee[1] = 'recoverpassform' && ee[1] != undefined) {
        loginbox.css({'height':'280px'});
        login_recover.css({'z-index':'100','opacity':'0.01'});
        register.css({'z-index':'200','opacity':'1','display':'block'});
    }

	$('.flip-link.to-recover-id').click(function(){
        switch_container(recover,login_register,183);
	});
	$('.flip-link.to-login').click(function(){
        switch_container(login,recover_register,340);
	});
    $('.flip-link.to-recover-pass').click(function(){
        switch_container(register,login_recover,280);
    });

    $('#loginform').submit(function(e){
        var thisForm = $(this); 
        var userinput = $('#username');
        var passinput = $('#password');
		var pininput = $('#pin');
        if(userinput.val() == '' || passinput.val() == '' || pininput.val() == '') {
            highlight_error(userinput);
            highlight_error(passinput);
			highlight_error(pininput);
            //loginbox.effect('shake');
            return false;
        } else {
            //e.preventDefault();
            loginbox.animate({'top':'+=100px','opacity':'0'},250,function(){
                $('.user_name').text(userinput.val());
                userbox.animate({'top':"+=75px",'opacity':'1'},250,function(){
                    setTimeout(function(){
                        thisForm.unbind('submit').submit();
                    },600);
                });
            });
            return true;
        }       
    });

    $('#username, #password, #pin').on('keyup',function(){
        highlight_error($(this));
    }).focus(function(){
        highlight_error($(this));
    }).blur(function(){
        highlight_error($(this));
    });
});

function highlight_error(el) {
    if(el.val() == '') {
        el.parent().addClass('has-error');
    } else {
        el.parent().removeClass('has-error');
    }
}
function switch_container(to_show,to_hide,cwidth) {
    to_hide.css('z-index','100').fadeTo(animation_speed,0.01,function(){
        loginbox.animate({'height':cwidth+'px'},animation_speed,function(){
            to_show.fadeTo(animation_speed,1).css('z-index','200');
        });
    });
}