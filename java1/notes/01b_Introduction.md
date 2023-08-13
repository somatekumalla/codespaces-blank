# Check Git Status
aug13a.txt


## >> git-status-1

```bash
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git status
On branch soma-java-course01
Your branch is ahead of 'origin/soma-java-course01' by 1 commit.
  (use "git push" to publish your local commits)

..

```bash
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git push
To https://github.com/somatekumalla/codespaces-blank.git
 ! [rejected]        soma-java-course01 -> soma-java-course01 (fetch first)
error: failed to push some refs to 'https://github.com/somatekumalla/codespaces-blank.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
..
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git config pull.rebase false
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git status
On branch soma-java-course01
Your branch and 'origin/soma-java-course01' have diverged,
and have 1 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)

..
```

```

```bash
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git pull
Merge made by the 'ort' strategy.
 README.md | 2 ++
 1 file changed, 2 insertions(+)
 create mode 100644 README.md

```



## >> git-status-2
```
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git status
On branch soma-java-course01
Your branch is ahead of 'origin/soma-java-course01' by 2 commits.
..

@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git push
Enumerating objects: 44, done.
Counting objects: 100% (32/32), done.
..

```


### >>> verify git status
```
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git status
On branch soma-java-course01
Your branch is up to date with 'origin/soma-java-course01'.

..
```



### >>> command which mvn 
```
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ mvn --version
Apache Maven 3.9.2 (c9616018c7a021c1c39be70fb2843d6f5f9b8a1c)
Maven home: /usr/local/sdkman/candidates/maven/current
Java version: 17.0.7, vendor: Microsoft, runtime: /usr/local/sdkman/candidates/java/17.0.7-ms
..
```



### >>> command mvn clean
```
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ mvn clean
[INFO] Scanning for projects...
[INFO] 
..
```



### >>> command mvn clean verify
```
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ mvn clean verify
[INFO] Scanning for projects...
[INFO] 
..
```



### >>> VSCode Debug Java link

clicked on ling "Debug Java" in VS Code top right "Run & Debug icon (of a bug)"
VS Code insalled "Debug Java Extension" and ran the application.

See command output below -
```
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:43111 -XX:+ShowCodeDetailsInExceptionMessages -cp /workspaces/codespaces-blank/java1/my-app/target/classes com.soma.app.cli.CourseRetriever 
CourseRetriever started
Please provide an author name as first argument.
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ 
```


### >>> updated launch.json 
```
{
    // Use IntelliSense to learn about possible attributes.
    // Hover to view descriptions of existing attributes.
    // For more information, visit: https://go.microsoft.com/fwlink/?linkid=830387
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "CourseRetriever",
            "request": "launch",
            "mainClass": "com.soma.app.cli.CourseRetriever",
            "args": "sander-mak",
            "projectName": "my-app"
        },
        {}
    ]
}
```


added "args" to launch.json 
```
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  cd /workspaces/codespaces-blank ; /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:37189 -XX:+ShowCodeDetailsInExceptionMessages -cp /workspaces/codespaces-blank/java1/my-app/target/classes com.soma.app.cli.CourseRetriever sander-mak 
CourseRetriever started
Retrieving courses for author sander-mak
```



### >>> maven central
```
maven central is the authoritative source for any java library!!!
adding a dependency is a powerful way to improve your application -
beware of the risks !

use maven central to download packages for java 
SLF4J : Sim p le Logging Facade for Java 

https://search.maven.org
now go to replacement site (after Feb 2023)

https://central.sonatype.com
top left has "maven central repository"

search for "slf4j"

go to "org.slf4j"

look for slf4j-api, use version 1.7.37

<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>2.0.7</version>
</dependency>

```


### >>> VSCode Debug Icon
```
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  cd /workspaces/codespaces-blank ; /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:38741 @/tmp/cp_j3033of5v17mtcht4vcstoh4.argfile com.soma.app.cli.CourseRetriever sander-mak 
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.

SLF4J provides an api to work with logging libraries such as Log4J, JDK Logging etc. We will use a logging library provided by SLF4J called - 
SLF4J Simple Logging 

Update pom.xml dependencies section to add a dependency for "SLF4J simple logging"

<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-simple</artifactId>
    <version>2.0.7</version>
</dependency>
```


### >>> run app 
```
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  cd /workspaces/codespaces-blank ; /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:36149 @/tmp/cp_1bkbkvd4gu0wgrybxm2albpw1.argfile com.soma.app.cli.CourseRetriever sander-mak 
[main] INFO com.soma.app.cli.CourseRetriever - CourseRetriever started
[main] INFO com.soma.app.cli.CourseRetriever - Retrieving courses for author 'sander-mak'

```

### >>> commit changes 
```
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ git log -n 2
commit 1a7c403fa94db7c61381285f6294c9dc56ff1e26 (HEAD -> soma-java-course01)
Author: Soma <somatekumalla@gmail.com>
Date:   Sun Aug 13 14:13:41 2023 +0000

    Added SLF4J logging to CourseRetriever

..
```


```bash
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  cd /workspaces/codespaces-blank ; /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:40327 @/tmp/cp_1bkbkvd4gu0wgrybxm2albpw1.argfile com.soma.app.cli.CourseRetriever sander-mak 
[main] INFO com.soma.app.cli.CourseRetriever - CourseRetriever started
[main] INFO com.soma.app.cli.CourseRetriever - Retrieving courses for author 'sander-mak'

commit changes again

@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ git log -n 2
commit 4c8a29324f6688a5e42a93647704dc8adaea2d8b (HEAD -> soma-java-course01)
Author: Soma <somatekumalla@gmail.com>
Date:   Sun Aug 13 14:20:12 2023 +0000

    Updated pom.xml Added property slf4j.version
	

```
