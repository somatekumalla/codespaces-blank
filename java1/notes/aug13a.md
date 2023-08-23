
aug13a.txt


>> git commands 


@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git status
On branch soma-java-course01
Your branch is ahead of 'origin/soma-java-course01' by 1 commit.
  (use "git push" to publish your local commits)

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        target/

nothing added to commit but untracked files present (use "git add" to track)
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git push
To https://github.com/somatekumalla/codespaces-blank.git
 ! [rejected]        soma-java-course01 -> soma-java-course01 (fetch first)
error: failed to push some refs to 'https://github.com/somatekumalla/codespaces-blank.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git pull
remote: Enumerating objects: 4, done.
remote: Counting objects: 100% (4/4), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), 680 bytes | 680.00 KiB/s, done.
From https://github.com/somatekumalla/codespaces-blank
   4094075..e89da17  soma-java-course01 -> origin/soma-java-course01
hint: You have divergent branches and need to specify how to reconcile them.
hint: You can do so by running one of the following commands sometime before
hint: your next pull:
hint: 
hint:   git config pull.rebase false  # merge
hint:   git config pull.rebase true   # rebase
hint:   git config pull.ff only       # fast-forward only
hint: 
hint: You can replace "git config" with "git config --global" to set a default
hint: preference for all repositories. You can also pass --rebase, --no-rebase,
hint: or --ff-only on the command line to override the configured default per
hint: invocation.
fatal: Need to specify how to reconcile divergent branches.
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git config pull.rebase false
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git status
On branch soma-java-course01
Your branch and 'origin/soma-java-course01' have diverged,
and have 1 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        target/

nothing added to commit but untracked files present (use "git add" to track)
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git pull
Merge made by the 'ort' strategy.
 README.md | 2 ++
 1 file changed, 2 insertions(+)
 create mode 100644 README.md
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ 

>> git status 

@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git status
On branch soma-java-course01
Your branch is ahead of 'origin/soma-java-course01' by 2 commits.
  (use "git push" to publish your local commits)

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        target/

nothing added to commit but untracked files present (use "git add" to track)
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git push
Enumerating objects: 44, done.
Counting objects: 100% (32/32), done.
Delta compression using up to 2 threads
Compressing objects: 100% (12/12), done.
Writing objects: 100% (18/18), 1.89 KiB | 645.00 KiB/s, done.
Total 18 (delta 5), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (5/5), completed with 4 local objects.
To https://github.com/somatekumalla/codespaces-blank.git
   e89da17..ff04492  soma-java-course01 -> soma-java-course01
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ 

>>> verify git status

@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ git status
On branch soma-java-course01
Your branch is up to date with 'origin/soma-java-course01'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        target/

nothing added to commit but untracked files present (use "git add" to track)
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ 


>>> command which mvn 

@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ mvn --version
Apache Maven 3.9.2 (c9616018c7a021c1c39be70fb2843d6f5f9b8a1c)
Maven home: /usr/local/sdkman/candidates/maven/current
Java version: 17.0.7, vendor: Microsoft, runtime: /usr/local/sdkman/candidates/java/17.0.7-ms
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-1042-azure", arch: "amd64", family: "unix"
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ which mvn
/usr/local/sdkman/candidates/maven/current/bin/mvn
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ 


>>> command mvn clean

@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ mvn clean
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< com.soma.app:my-app >-------------------------
[INFO] Building my-app 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.1.0/maven-clean-plugin-3.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.1.0/maven-clean-plugin-3.1.0.pom (5.2 kB at 10 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/31/maven-plugins-31.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/31/maven-plugins-31.pom (10 kB at 306 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.1.0/maven-clean-plugin-3.1.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.1.0/maven-clean-plugin-3.1.0.jar (30 kB at 610 kB/s)
[INFO] 
[INFO] --- clean:3.1.0:clean (default-clean) @ my-app ---
[INFO] Deleting /workspaces/codespaces-blank/java1/my-app/target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.996 s
[INFO] Finished at: 2023-08-13T12:49:02Z
[INFO] ------------------------------------------------------------------------
[WARNING] 
[WARNING] Plugin validation issues were detected in 1 plugin(s)
[WARNING] 
[WARNING]  * org.apache.maven.plugins:maven-clean-plugin:3.1.0
[WARNING] 
[WARNING] For more or less details, use 'maven.plugin.validation' property with one of the values (case insensitive): [BRIEF, DEFAULT, VERBOSE]
[WARNING] 
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ 


>>> command mvn clean verify

@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ mvn clean verify
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< com.soma.app:my-app >-------------------------
[INFO] Building my-app 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.1.0:clean (default-clean) @ my-app ---
[INFO] 
[INFO] --- resources:3.0.2:resources (default-resources) @ my-app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /workspaces/codespaces-blank/java1/my-app/src/main/resources
[INFO] 
[INFO] --- compiler:3.10.1:compile (default-compile) @ my-app ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /workspaces/codespaces-blank/java1/my-app/target/classes
[INFO] 
[INFO] --- resources:3.0.2:testResources (default-testResources) @ my-app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /workspaces/codespaces-blank/java1/my-app/src/test/resources
[INFO] 
[INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ my-app ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /workspaces/codespaces-blank/java1/my-app/target/test-classes
[INFO] 
[INFO] --- surefire:2.22.1:test (default-test) @ my-app ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.soma.app.AppTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.071 s - in com.soma.app.AppTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jar:3.0.2:jar (default-jar) @ my-app ---
[INFO] Building jar: /workspaces/codespaces-blank/java1/my-app/target/my-app-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.095 s
[INFO] Finished at: 2023-08-13T12:52:07Z
[INFO] ------------------------------------------------------------------------
[WARNING] 
[WARNING] Plugin validation issues were detected in 5 plugin(s)
[WARNING] 
[WARNING]  * org.apache.maven.plugins:maven-jar-plugin:3.0.2
[WARNING]  * org.apache.maven.plugins:maven-resources-plugin:3.0.2
[WARNING]  * org.apache.maven.plugins:maven-clean-plugin:3.1.0
[WARNING]  * org.apache.maven.plugins:maven-compiler-plugin:3.10.1
[WARNING]  * org.apache.maven.plugins:maven-surefire-plugin:2.22.1
[WARNING] 
[WARNING] For more or less details, use 'maven.plugin.validation' property with one of the values (case insensitive): [BRIEF, DEFAULT, VERBOSE]
[WARNING] 
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ 


>>> VSCode Debug Java link

clicked on ling "Debug Java" in VS Code top right "Run & Debug icon (of a bug)"
VS Code insalled "Debug Java Extension" and ran the application.

See command output below -

@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:43111 -XX:+ShowCodeDetailsInExceptionMessages -cp /workspaces/codespaces-blank/java1/my-app/target/classes com.soma.app.cli.CourseRetriever 
CourseRetriever started
Please provide an author name as first argument.
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ 

>>> updated launch.json 

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

added "args" to launch.json 

@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  cd /workspaces/codespaces-blank ; /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:37189 -XX:+ShowCodeDetailsInExceptionMessages -cp /workspaces/codespaces-blank/java1/my-app/target/classes com.soma.app.cli.CourseRetriever sander-mak 
CourseRetriever started
Retrieving courses for author sander-mak


>>> maven central

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


>>> VSCode Debug Icon

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

>>> run app 

@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  cd /workspaces/codespaces-blank ; /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:36149 @/tmp/cp_1bkbkvd4gu0wgrybxm2albpw1.argfile com.soma.app.cli.CourseRetriever sander-mak 
[main] INFO com.soma.app.cli.CourseRetriever - CourseRetriever started
[main] INFO com.soma.app.cli.CourseRetriever - Retrieving courses for author 'sander-mak'

>>> commit changes 

@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ git log -n 2
commit 1a7c403fa94db7c61381285f6294c9dc56ff1e26 (HEAD -> soma-java-course01)
Author: Soma <somatekumalla@gmail.com>
Date:   Sun Aug 13 14:13:41 2023 +0000

    Added SLF4J logging to CourseRetriever

commit ff044922052eaaa3909cf69d9d024d0da759f068 (origin/soma-java-course01)
Merge: b28af34 e89da17
Author: Soma <somatekumalla@gmail.com>
Date:   Sun Aug 13 12:39:23 2023 +0000


@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  cd /workspaces/codespaces-blank ; /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:40327 @/tmp/cp_1bkbkvd4gu0wgrybxm2albpw1.argfile com.soma.app.cli.CourseRetriever sander-mak 
[main] INFO com.soma.app.cli.CourseRetriever - CourseRetriever started
[main] INFO com.soma.app.cli.CourseRetriever - Retrieving courses for author 'sander-mak'

commit changes again

@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ git log -n 2
commit 4c8a29324f6688a5e42a93647704dc8adaea2d8b (HEAD -> soma-java-course01)
Author: Soma <somatekumalla@gmail.com>
Date:   Sun Aug 13 14:20:12 2023 +0000

    Updated pom.xml Added property slf4j.version
	
	




















