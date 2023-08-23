- [Introduction](#Introduction)
    - [Getting Started](#getting-started)
    - [Install Maven](#install-maven)
    - [Verify Maven Installed](#verify-maven-is-installed-and-working)
- [Maven in 5  Minutes](#maven-in-5-minutes)
    - [Creating a Project](#creating-a-project)
    - [Creating a Project - Output](#creating-a-project---output)
    - [Directory Structure](#directory-structure)
    - [The POM](#the-pom)
    - [Build](#build)
    - [Run the app](#run-the-app)
- [Update the app](#update-the-app)
    - [Build Updated App](#build-updated-app)
    - [Run Updated App](#run-updated-app)

# Introduction 

aug12a_githubCodespaces.txt

## Getting Started 

### >>> Quickstart for Codespaces 


### >>> Deep dive into Codespaces
https://docs.github.com/en/codespaces/getting-started/deep-dive


### >>>  which vim

```bash
search ubuntu terminal for "vim"
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ which vim
/usr/bin/vim

Check java is available -
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  echo java --version
java --version
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ java --version
openjdk 17.0.7 2023-04-18 LTS
OpenJDK Runtime Environment Microsoft-7626293 (build 17.0.7+7-LTS)
OpenJDK 64-Bit Server VM Microsoft-7626293 (build 17.0.7+7-LTS, mixed mode, sharing)
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ 
```




### >>> install maven 

1) Download Maven binaries
```bash
url : https://maven.apache.org/download.cgi

Copy the link for the “Binary tar.gz archive” file.
https://dlcdn.apache.org/maven/maven-3/3.9.4/binaries/apache-maven-3.9.4-bin.tar.gz

----------
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ wget https://dlcdn.apache.org/maven/maven-3/3.9.4/binaries/apache-maven-3.9.4-bin.tar.gz
--2023-08-13 02:06:05--  https://dlcdn.apache.org/maven/maven-3/3.9.4/binaries/apache-maven-3.9.4-bin.tar.gz
Resolving dlcdn.apache.org (dlcdn.apache.org)... 151.101.2.132, 2a04:4e42::644
Connecting to dlcdn.apache.org (dlcdn.apache.org)|151.101.2.132|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 9336368 (8.9M) [application/x-gzip]
Saving to: ‘apache-maven-3.9.4-bin.tar.gz’

apache-maven-3.9.4-bin.tar.gz                   100%[======================================================================================================>]   8.90M  52.5MB/s    in 0.2s    

2023-08-13 02:06:06 (52.5 MB/s) - ‘apache-maven-3.9.4-bin.tar.gz’ saved [9336368/9336368]
----------
```


### >>> install maven continued

```bash
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ echo tar -xvf apache-maven-3.6.3-bin.tar.gz
tar -xvf apache-maven-3.6.3-bin.tar.gz
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ tar -xvf apache-maven-3.9.4-bin.tar.gz
apache-maven-3.9.4/README.txt
...
lrwxrwxrwx  1 codespace oryx        17 Jun 15 01:52 python -> /usr/local/python
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ 

```


## >> 2) Setting M2

```bash
Step 2: Setting M2_HOME and Path Variables
Add the following lines to the user profile file (.profile).

M2_HOME='/opt/apache-maven-3.6.3'
PATH="$M2_HOME/bin:$PATH"
export PATH
Relaunch the terminal or execute source .profile to apply the changes.

```

### >>> updated PATH

```bash
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ cat .bash_profile 
# bash profile file
M2_HOME='/opt/apache-maven-3.9.4'
PATH="$M2_HOME/bin:$PATH"
export PATH
# added maven to the path

@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ echo Relaunch the terminal or execute source .profile to apply the changes.
Relaunch the terminal or execute source .profile to apply the changes.
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ source .bash_profile 
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ 
```


### >>> Verify maven is installed and working

```bash
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ echo Execute mvn -version command and it should produce the following output.
Execute mvn -version command and it should produce the following output.
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ mvn -version
Apache Maven 3.9.4 (dfbb324ad4a7c8fb0bf182e6d91b0ae20e3d2dd9)
Maven home: /opt/apache-maven-3.9.4
Java version: 17.0.7, vendor: Microsoft, runtime: /usr/local/sdkman/candidates/java/17.0.7-ms
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-1042-azure", arch: "amd64", family: "unix"
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ Execute mvn -version command and it should produce the following output.


@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ which maven
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ which mvn
/opt/apache-maven-3.9.4/bin/mvn
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ 

Note - Maven might have been installed by default in the default image 
I used "which maven" instead of using "which mvn"

```


## >> Maven in 5 minutes 

```
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

```

>>> Maven installation 
verify with "mvn --version" 

### >>> Creating a project 

```bash
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```



### >>> Creating a project - output 

```bash
@somatekumalla ➜ /workspaces/codespaces-blank/java1 (soma-java-course01) $ mvn archetype:generate -DgroupId=com.soma.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
[INFO] Scanning for projects...
Downloading from central: ..
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] >>> archetype:3.2.1:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO] 
[INFO] <<< archetype:3.2.1:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO] 
[INFO] 
[INFO] --- archetype:3.2.1:generate (default-cli) @ standalone-pom ---
..
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-quickstart/1.4/maven-archetype-quickstart-1.4.jar (7.1 kB at 592 kB/s)
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: maven-archetype-quickstart:1.4
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: com.soma.app
[INFO] Parameter: artifactId, Value: my-app
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: com.soma.app
[INFO] Parameter: packageInPathFormat, Value: com/soma/app
[INFO] Parameter: package, Value: com.soma.app
[INFO] Parameter: groupId, Value: com.soma.app
[INFO] Parameter: artifactId, Value: my-app
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Project created from Archetype in dir: /workspaces/codespaces-blank/java1/my-app
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.120 s
[INFO] Finished at: 2023-08-13T02:47:37Z
[INFO] ------------------------------------------------------------------------
@somatekumalla ➜ /workspaces/codespaces-blank/java1 (soma-java-course01) $ 

```


### >>> Directory structure 

```bash
@somatekumalla ➜ /workspaces/codespaces-blank/java1 (soma-java-course01) $ tree .
.
└── my-app
    ├── pom.xml
    └── src
        ├── main
        │   └── java
        │       └── com
        │           └── soma
        │               └── app
        │                   └── App.java
        └── test
            └── java
                └── com
                    └── soma
                        └── app
                            └── AppTest.java

12 directories, 3 files
```


### >>> The POM

```bash
pom.xml 

What did I just do?
You executed the Maven goal archetype:generate, and passed in various parameters to that goal. 

The prefix archetype is the plugin that provides the goal. 

If you are familiar with Ant, you may conceive of this as similar to a task. 

This archetype:generate goal created a simple project based upon a maven-archetype-quickstart archetype. 

Suffice it to say for now that a plugin is a collection of goals with a general common purpose. 

For example the jboss-maven-plugin, whose purpose is "deal with various jboss items".
```


### >>> build 

```bash
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ mvn package
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< com.soma.app:my-app >-------------------------
[INFO] Building my-app 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.0.2/maven-resources-plugin-3.0.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.0.2/maven-resources-plugin-3.0.2.pom (7.1 kB at 22 kB/s)
...
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.soma.app.AppTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.05 s - in com.soma.app.AppTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jar:3.0.2:jar (default-jar) @ my-app ---
...
[INFO] Building jar: /workspaces/codespaces-blank/java1/my-app/target/my-app-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.020 s
[INFO] Finished at: 2023-08-13T03:02:12Z
[INFO] ------------------------------------------------------------------------
```


### >>> Run the app

```shell
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ ls
pom.xml  src  target
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ java -cp target/my-app-1.0-SNAPSHOT.jar com.soma.app.App
Hello World!
```

# Update the app

## build updated app 

- Navigate to /workspaces/codespaces-blank/java1/my-app
- build command : "mvn package" Note : pom.xml must be in this folder
- run the app -

```bash
java -cp target/my-app-1.0-SNAPSHOT.jar com.soma.app.cli.CourseRetriever
Note : main(..) function is in CourseRetriever.java 
```



update pom.xml
build : mvn package 
```bash
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ mvn package
[INFO] Scanning for projects...
..
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
..
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ 

```

## run updated app

```bash
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ ls
pom.xml  src  target
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ java -cp target/my-app-1.0-SNAPSHOT.jar com.soma.app.cli.CourseRetriever
CourseRetriever started
```










