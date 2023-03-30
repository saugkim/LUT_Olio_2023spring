자바 개발 키트(Java Development Kit, JDK)는 자바 SE, 자바 EE, 또는 자바 ME 플랫폼 중 하나를 구현한 것으로[2] 솔라리스, 리눅스, 맥 OS X, 또는 윈도우 자바 개발자를 대상으로 오라클에 의해 바이너리 제품으로 제공된다. 자바 플랫폼의 등장 이래 지금까지 가장 널리 사용되는 소프트웨어 개발 키트(SDK)다. 2006년 11월 17일 썬은 GNU 일반 공중 사용 허가서 (GNU)하에 출시될 것이라고 발표했고, 이에 따라 자유 소프트웨어가 되었다. 이는 썬이 2007년 5월 8일 소스 코드를 오픈 JDK에 기부함에 따라 이루어졌다.[3]

오라클 자바 테크놀로지가 제공하는 자바 개발 키트(Java™ Platform, Standard Edition Development Kit (JDK™))는 자바 프로그래밍 언어를 이용한 어플리케이션을 위한 자바 언어 스펙(JLS), 자바 가상 머신 스펙 (JVMS)을 구현하고 있으며, 자바의 표준 에디션을 제공한다. 또한 컴파일러, 디버깅, 테스팅, 모니터링, 문서화작업, 자바 라이브러리 등 자바 프로그래밍 언어를 이용하고 자바 플랫폼에서 운영되는 소프트웨어 개발에 필요한 모든 것들을 포함하고 있다. (예를 들어 가상머신, 컴파일러, 성능 모니터링, 디버거 등등)

오라클이 현재 배포하는 자바 개발 키트는 최신버젼으로 JDK 20, 장기지원버젼으로 JDK 17 (2024년 9월)가 있으며, 무료 사용 및 재배포가 가능한 No-Fee Terms and Conditions (NFTC)[4] 라이선스로 윈도즈와 리눅스 환경으로 x64 바이너리 아키텍쳐를, 맥 OS와 리눅스를 대상으로 aarch64 바이너리 아키텍쳐를 제공한다. 

Java 20 and Java 17 available now
Java 17 LTS is the latest long-term support release for the Java SE platform. JDK 20 and JDK 17 binaries are free to use in production and free to redistribute, at no cost, under the Oracle No-Fee Terms and Conditions.


JDK 구성:

JDK 주요 구성 내용과 그 위치는 다음과 같다.  
https://www.oracle.com/java/technologies/javase/jdk20-readme-downloads.html

1.실행 파일 (bin/ subdirectory)
자바 실행 환경 (Java runtime Environment, JRE) 구현한 것으로, JRE는 자바 가상머신, 클라스 라이브러리, 자바 언어로 작성된 프로그램 작동에 필요한 기타 파일을 포함하고 있으며, 같은 장소에 프로그램 개발에 필요한 모든 툴과 유틸리티도 포함되어 있다. 

2.구성 파일 (conf/ subdirectory)
사용자 구성 옵션을 포함하고 있는 파일들로써, JDK 접근 권한 설정, 보안 알고리즘 변경, 자바 암호화 확장 정책 등을 설정할 수 있다. 

3.C 헤더 파일 (include/ ) 자바 가상머신 디버거인터페이스와 자바네이티브인터페이스(https://ko.wikipedia.org/wiki/%EC%9E%90%EB%B0%94_%EB%84%A4%EC%9D%B4%ED%8B%B0%EB%B8%8C_%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4)의 네이티브 코드를 작성하는데 사용되는 C헤더 파일

4.자바 모듈 (jmods/ )
jlink를 이용하여 사용자 지정 런타임을 만드는데 사용되는 모듈. 

5.저작권 및 라이센스 (legal/ )
각 모듈에 대한 라이센스와 저작권에 대한 내용 제삼자 제공 포함.   

6.추가 라이브러리 (lib/ ) 
JDK에 필요한 추가 클라스 라이브러리와 지원 파일 (외부 사용을 목적으로 하지 않음).

https://docs.oracle.com/en/java/javase/20/docs/specs/man/index.html


JDK 20 내용 :
```
jar - create an archive for classes and resources, and manipulate or restore individual classes or resources from an archive
jarsigner - sign and verify Java Archive (JAR) files
java - launch a Java application
javac - read Java class and interface definitions and compile them into bytecode and class files
javadoc - generate HTML pages of API documentation from Java source files
javap - disassemble one or more class files
jcmd - send diagnostic command requests to a running Java Virtual Machine (JVM)
jconsole - start a graphical console to monitor and manage Java applications
jdb - find and fix bugs in Java platform programs
jdeprscan - static analysis tool that scans a jar file (or some other aggregation of class files) for uses of deprecated API elements
jdeps - launch the Java class dependency analyzer
jfr - parse and print Flight Recorder files
jhsdb - attach to a Java process or launch a postmortem debugger to analyze the content of a core dump from a crashed Java Virtual Machine (JVM)
jinfo - generate Java configuration information for a specified Java process
jlink - assemble and optimize a set of modules and their dependencies into a custom runtime image
jmap - print details of a specified process
jmod - create JMOD files and list the content of existing JMOD files
jpackage - package a self-contained Java application
jps - list the instrumented JVMs on the target system
jrunscript - run a command-line script shell that supports interactive and batch modes
jshell - interactively evaluate declarations, statements, and expressions of the Java programming language in a read-eval-print loop (REPL)
jstack - print Java stack traces of Java threads for a specified Java process
jstat - monitor JVM statistics
jstatd - monitor the creation and termination of instrumented Java HotSpot VMs
jwebserver - launch the Java Simple Web Server
keytool - manage a keystore (database) of cryptographic keys, X.509 certificate chains, and trusted certificates
rmiregistry - create and start a remote object registry on the specified port on the current host
serialver - return the `serialVersionUID` for one or more classes in a form suitable for copying into an evolving class

Windows Only
jabswitch - enable or disable Java Access Bridge
jaccessinspector - examine accessible information about the objects in the Java Virtual Machine using the Java Accessibility Utilities API
jaccesswalker - navigate through the component trees in a particular Java Virtual Machine and present the hierarchy in a tree view
javaw - launch a Java application without a console window
kinit - obtain and cache Kerberos ticket-granting tickets
klist - display the entries in the local credentials cache and key table
ktab - manage the principal names and service keys stored in a local key table
```





The JDK is a development environment for building applications and components using the Java programming language. The JDK includes tools for developing and testing programs written in the Java programming language and running on the Java platform.


 1 "Oracle No-Fee Terms and Conditions License". Oracle Corporation. Retrieved 23 October 2021.
 https://www.oracle.com/downloads/licenses/no-fee-license.html
 
Java 17 LTS is the latest long-term support release for the Java SE platform. JDK 20 and JDK 17 binaries are free to use in production and free to redistribute, at no cost, under the Oracle No-Fee Terms and Conditions.

JDK 20 will receive updates under these terms, until September 2023 when it will be superseded by JDK 21.

JDK 17 will receive updates under these terms, until at least September 2024.

The Java Development Kit (JDK) is a distribution of Java Technology by Oracle Corporation. It implements the Java Language Specification (JLS) and the Java Virtual Machine Specification (JVMS) and provides the Standard Edition (SE) of the Java Application Programming Interface (API). It is derivative of the community driven OpenJDK which Oracle stewards.[5] It provides software for working with Java applications. Examples of included software are the virtual machine, a compiler, performance monitoring tools, a debugger, and other utilities that Oracle considers useful for a Java programmer.

Oracle have released the current version of the software under the Oracle No-Fee Terms and Conditions (NFTC) license. Oracle release binaries for the x86-64 architecture for Windows, macOS, and Linux based operating systems, and for the aarch64 architecture for macOS and Linux. Previous versions have supported the Oracle Solaris operating system and SPARC architecture.

