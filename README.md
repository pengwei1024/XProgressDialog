# XProgressDialog
a powerful progressDialog widget for android

### screenshot
#### 样式1
![截图](screenshot/s1.png)
#### 样式2
![截图](screenshot/s2.png)
#### 样式3
![截图](screenshot/s3.png)

### Usage
```java
XProgressDialog dialog = new XProgressDialog(this, "正在加载..", XProgressDialog.THEME_CIRCLE_PROGRESS);
dialog.show();
```
#### 三种样式
-  XProgressDialog.THEME_HORIZONTAL_SPOT (默认样式)
-  XProgressDialog.THEME_CIRCLE_PROGRESS
-  XProgressDialog.THEME_HEART_PROGRESS

### Gradle导入
```groovy
compile 'com.apkfuns.xprogressdialog:xprogressdialog:1.2.0'
```

### proguard
```
-keep class com.apkfuns.xprogressdialog.**{*;}
```


### Thanks
* [HeartProgressBar](https://github.com/Geek-1001/HeartProgressBar)
* [spots-dialog](https://github.com/d-max/spots-dialog)

### License
<pre>
Copyright 2015 pengwei1024

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</pre>