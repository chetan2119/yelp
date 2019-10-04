var initialize= function(){
	$("#mainDiv").display="block";
	$.ajax({
        type: "POST",
        contentType: "application/json",
        url: "staticData",
        data: JSON.stringify(""),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
          //setup static data
        },
        error: function (e) {
        	console.log(e);
        }
    });
}

var getData1= function(){
 $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "q1",
        data: JSON.stringify(""),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
          $("#output1").text(data);
        },
        error: function (e) {
        	console.log(e);
        }
    });
}

var getData2= function(){
	$.ajax({
        type: "POST",
        contentType: "application/json",
        url: "q2",
        data: JSON.stringify(""),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
          $("#output2").text(data);
        },
        error: function (e) {
        	console.log(e);
        }
    });
}

var getData3= function(){
	$.ajax({
        type: "POST",
        contentType: "application/json",
        url: "q3",
        data: JSON.stringify(""),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
          $("#output3").text(data);
        },
        error: function (e) {
        	console.log(e);
        }
    });
}