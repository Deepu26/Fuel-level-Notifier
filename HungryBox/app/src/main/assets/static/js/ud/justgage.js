$.ajax( 'http://api.thingspeak.com/channels/335418/field/field1/last.json?key=WYACO3T89W0TBNOK', {
  type: 'GET',
  dataType: 'json',
  success: function( resp ) {
    console.log( resp.field1);
    var val = parseInt(resp.field1);
    val = (val/22)*100;
    if (val < 20)
        alert("Fuel level is low(< 20%)");
    var g = new JustGage({
        id: "foo",
        value: val,
        // value: 500,

        min: 0,
        max: 100,
        title: "Fuel Level(%)"
      });
    // return(resp.field1);
  },
  error: function( req, status, err ) {
    console.log( 'something went wrong', status, err );
  }
});

// var g = new JustGage({
//     id: "foo",
//     value: window.val,
//     // value: 500,
//
//     min: 0,
//     max: 1000,
//     title: "Fuel Level"
//   });
