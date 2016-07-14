$(document).ready(function(){
  var statusUrl = window.location.href.split('?')[1];
  if(statusUrl == "signout"){
      firebase.auth().signOut().then(function() {
        console.log('Signed Out');
      }, function(error) {
        console.error('Sign Out Error', error);
      });
  }

    $("#createAccBtn").click(function(){
        $("#login").fadeOut();
        $("#signUp").fadeIn();
    });

     $("#goBackLogin").click(function(){
        $("#signUp").fadeOut();
        $("#login").fadeIn();
    });


$("#loginBtn").click(function(){
    var email1 = $("#email").val();
   var password2 = $("#password").val();


   firebase.auth().signInWithEmailAndPassword(email1, password2).catch(function(error) {
      // Handle Errors here.
      var errorCode = error.code;
      var errorMessage = error.message;
    });
   
firebase.auth().onAuthStateChanged(function(user) {
  if (user) {
    window.location.href="new.html?"+user.uid;
    console.log(user.uid);
  } else {
    // No user is signed in.
    console.log("error");
  }
});

  });

$("#signUpBtn").click(function(){
    var Username = $("#Username").val();
   var email = $("#Signemail").val();
   var password = $("#signpass").val();

    firebase.auth().createUserWithEmailAndPassword(email, password).catch(function(error) {
  // Handle Errors here.
      var errorCode = error.code;
      var errorMessage = error.message;
      // ...
    }); 


});



//var email = $("#email").val();
//var pass = $("#password").val();
//var Username = $("#Username").val();
//var Signemail = $("#Signemail").val();
//var signpass = $("#signpass").val();

}); 