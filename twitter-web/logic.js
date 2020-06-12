
function getTweets() {
    var xhttp = new XMLHttpRequest();
    // XMLHttpRequest objects are used to interact with servers, retrieving data from a URL without having to do a full page refresh.
    
    xhttp.onreadystatechange = function() {
    // XMLHttpRequest.onreadystatechange property contains the event handler to be called when the readystatechange event is fired, that is every time the readyState property of the XMLHttpRequest changes.
        if (this.readyState == 4 && this.status == 200) { // these numbers mean everything is all right
            renderTweets(this.responseText);
            // data = this.responseText;
        }
    }

    xhttp.open("GET", "http://localhost:8080/tweets"); // make a GET request to URL 
    // xhttp.open("GET", "http://localhost:8080/tweet/5");
    xhttp.send(); // send the request to server
}

getTweets(); // call getTweets() function


function renderTweets(responseText) {
    console.log(responseText); // test if JSON content shows in console
    tweets = JSON.parse(responseText); // JSON turns responseText into an object, tweets is an array object.    
    console.log(tweets); // test if array object shows in console

    var feed = "";
    for (var i = 0; i < tweets.length; i++) {
        feed += "<div class='tweet'>" +
                    "<img class='image' src='" + tweets[i]['userImageUrl'] + "'>" + 
                    "<p class='username'>" + tweets[i]["username"] + "</p>" + 
                    "<p class='userHandle'>" + tweets[i]["userHandle"] + "</p>" + 
                    "<p class='message'>" + tweets[i]["message"] + "</p>" + 
                "</div>" + "<br>"
    }

    // window.onload = function() { // execute this function when the page is fully loaded, so that js can find element by id.
        document.getElementById("feed").innerHTML = feed;
    // }
}


// call renderTweets() function
// renderTweets('[{"username":"Kaleb Burd","userHandle":"@kburd","userImageUrl":"https://pythonprogramming.net/static/images/finance/python-programming-language.png","message":"Hello Twitter! Goodbye MySpace"},{"username":"Rando Cardician","userHandle":"@seedNull","userImageUrl":"https://upload.wikimedia.org/wikipedia/commons/a/a0/2006_Quarter_Proof.png","message":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sit amet nisi ac metus imperdiet fermentum at ut sem. Morbi. "},{"username":"Donald J. Trump","userHandle":"@realDonaldTrump","userImageUrl":"https://compote.slate.com/images/abd6b1ce-a885-4f81-a682-214877a93edd.jpeg","message":"*censored*"},{"username":"John Smith","userHandle":"@notRussianBot","userImageUrl":"https://cdn.pixabay.com/photo/2017/03/14/21/00/american-flag-2144392__340.png","message":"Who censored Trump???"}]');