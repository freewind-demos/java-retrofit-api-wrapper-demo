Java Retrofit Api Wrapper Demo
=====================

过Annotation的方式声明一些向外请求api的接口。

注意点：
1. 在当前新版本中必须手动添加`GsonConverterFactory`以及相应dependency: https://stackoverflow.com/questions/34315499/unable-to-create-converter-for-java-util-list-retrofit-2-0-0-beta2
2. jdk版本应该在14以上，否则会有`An illegal reflective access operation has occurred`的Warning: https://stackoverflow.com/questions/60915381/retrofit2-maven-project-illegal-reflective-access-warning

Use maven for Java.

Run `Hello.java` in your IDE.