# ITF-log4shell-vulnapp
log4j (CVE-2021-44228) Spring-boot web application with vulnerabilities
## Installation & Usage
```bash
# requierd JDK version is 8 or 7 (openJDK 1.8 or 1.7)
$ git clone https://github.com/Auddn/ITF-log4shell-vulnapp.git
$ cd ITF-log4shell-vulnapp
$ ./gradlew build
$ ./gradlew bootRun
```

If jdk is not installed in your system, follow:

```bash
$ apt-get update
$ apt-get install openjdk-(8 or 7)-jdk
$ vi /etc/environment
```

and add `$JAVA_HOME` in vim

```bash
$JAVA_HOME="/usr/lib/jvm/java-{version of java(8 or 7)}-openjdk-amd64"
```

apply and check the JAVA_HOME environmental variable.

```bash
$ source /etc/environment
$ echo $JAVA_HOME
/usr/lib/jvm/java-{version of java(8 or 7)}-openjdk-amd64
```
