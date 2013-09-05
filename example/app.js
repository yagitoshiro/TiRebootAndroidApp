// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


// open a single window
var win = Ti.UI.createWindow({
	backgroundColor:'white'
});
var label = Ti.UI.createLabel({text:'Reboot', color:'Black'});
win.add(label);

// TODO: write your module tests here
var tirebootandroidapp = require('org.selfkleptomaniac.mod.tirebootandroidapp');
win.addEventListener('click', function(){
  tirebootandroidapp.reboot();
});
win.open();
