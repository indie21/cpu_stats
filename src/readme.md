安装方法

1.安装java:windows上首先要安装java.

2.将整个包拷贝到C盘解压。

2.启动应用：java -jar target/cpu_stats-1.0-SNAPSHOT.jar cando-v4-zhuoyikang.hzv.tenxapp.com 39378 macBookPro

这时候如果报错，应该是sigar没有放到java.library.path，需要把对应平台的sigar lib放到java.library.path，再次启动会成功。

3.设置开机启动.

写个bat文件，里面：java -jar ......
把这个bat放到C:\Users\username\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup中
username需要替换用户名。



