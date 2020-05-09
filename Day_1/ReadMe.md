# Day 1
### Agenda
1. Language, Technology, Platform, Framework
2. Java Platforms
3. JDK, JRE, JVM
4. Explore JDK's Installation Directory
5. Simple Hello Application

#### Language
- Example
    - C, C++, Java, C#, Python, Go etc.
- Tokens
    - Identifiers[ name given to variable/function/class]
    - Keywords[ Reserved words ]
    - Constants/ Literals
    - Operator
    - Punctuators/Separators ( {,},(,),[,],<,>,tab,',",comma, :, space )
```C
#include<stdio.h>
int main( void )
{
    printf("Hello World\n");
    return 0;
}
```
- Language has its syntax and semantics.
    - Consider syntax of C
```C
void print( )
{
    printf("Hello World");
}
```
    - Consider syntax of Python
```python
def print()
    print("Hello World")
```
- It contains data types.
- It has its built in features( pointer, security, support for ML).
- If we want to implement business logic then we should use programming language.
- We can use language to develop application also.
    1. Console User Interface ( CUI ) application.
    2. Graphical User Interface( GUI ) application.
    3. Library application.
#### Technology
- Example
    - ASP.NET, Java etc.
    - It provides features that we can use to develop application.
    - Every language is a technology but every technology can not be a language.
#### Platform
- It can be H/W or S/W environment in which we can execute application.
- Platform can be:
    1. Hardware based platform
        - All operating systems
            - MS Windows( Win-11, Win-10, Win-8)
            - Linux( Centos, Ubuntu, Open Suse, RHEL )
            - Mac OS( Catalina, Mojave, High Siera )
    2. Software only platform
        - MS.NET, Java etc.
        - Java language is both technology as well as platform.
        - MS.NET is a development platform that we can use to develop and deploy different types of application:
            1. CUI application
            2. GUI application( Win forms)
            3. Library application(assembly)
            4. Web application and Web Services
            5. WPF, WCF, WWF application etc.
#### Framework
- Example
    1. AWT, SWING: GUI Frameworks of Java
    2. RMI: Distributed application development framework
    3. Struts: MVC based readymade web application development framework.
    4. Hibernate: It is automatic persitance framework.
    5. JUnit: Testing Framework
- It is a library of reusable classes that we can use to develop application.

### Java Platforms
1. Java SE platform( for standalone )
    - Java Standard Edition Platform
    - It is also called Core Java.
    - We can use to to create CUI,GUI, Library application.
    - Java SE API's are sub set of Java EE API's.
    - To use Java SE platform, we need to install software on machine.
2. Java EE platform( For client-server application)
    - Java Enterprise Edition Platform
    - Java EE is also called JEE / Enterprise java /Advanced Java / Web java.
    - It is used to develop web application and web services.
3. Java ME platform
    - Java Micro Edition Platform
    - It is desgined to develop application for consumer devices.
    - e.g Mobile Phones
4. Java FX platform
    - It is designed to develop rich UI application for internet.

### Software Development Kit
- SDK = Language tools + Documentation + Supporting Libraries + Runtime Environment.
- Java SDK = Java languge tools( bin ) + Java Documentation(java docs ) + Supporting Libraries( rt.jar ) + Runtime Environment( JVM ).
- JDK = Java languge tools( bin ) + Java Documentation(java docs ) + rt.jar  + JVM.
- JDK = Java languge tools( bin ) + Java Documentation(java docs ) + JRE[ rt.jar  + JVM ].





 