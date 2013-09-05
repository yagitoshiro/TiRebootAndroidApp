TiRebootAndroidApp
==================

Simple module to reboot your Android app made with Appcelerator Titanium

(1) Add below property to tiapp.xml.
```
  <property name="ti.android.bug2373.skipAlert">true</property>
  <property name="ti.android.bug2373.message"></property>
```
(2) Install this module and call "reboot" method in you JS.
```
  var mod = require('org.selfkleptomaniac.mod.tirebootandroidapp');
  mod.reboot();
```
(3) Step3? There's no step 3.
