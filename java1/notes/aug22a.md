aug22a_javaSe17_steps.txt

## Introduction 

### Login to ACM
Url : https://myacm.acm.org/

Click link "Log In"
User Name : Tekumalla
Magic : xx

Click link "LEARNING". Select "Pluralsight"
Url to Pluralsight : https://app.pluralsight.com/library/

Course : Building an Application Using Java SE 17
by Sander Mak


### GitHub Codespaces

Keep code in Codespaces
Url : https://github.com/features/codespaces

Upper right corner icon. 
	signed in as "somatekumalla"
	click on "Your Repositories"
	click on "codespaces-blank"

Select branch - "soma-java-course01"
You will see a repo with folders - Step2, Step3, .. java1

Click on green colored button "<> Code". 
	Select tab "Codespaces"
	Click "CppDemoJuly2023"
	You will see a message "Signing in .. "
	GitHub Codespaces will open in a new web browser tab.

	
## Execution 

### VS Code : launch.json

See launch.json, configuration with "name" : "CourseRetriever"
{
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

click on icon "Run and Debug" in VS Code
Select "CourseRetriever" from dropdown with label "RUN AND DEBUG"
in VS Code.

TERMINAL tab output -
```
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java @/tmp/cp_6vfkx8xrsmjhoply67dcj284c.argfile com.soma.app.cli.CourseRetriever sander-mak 
[main] INFO com.soma.app.cli.CourseRetriever - CourseRetriever started
[main] INFO com.soma.app.cli.CourseRetriever - Retrieving courses for author 'sander-mak'
[main] INFO com.soma.app.cli.CourseRetriever - Retrieved the following 17 courses [PluralsightCourse[id=ebf4411f-5401-4515-b3bc-272b4451155a,
```

### Execute Unit Tests 

In VS Code click on "Testing" icon on left navbar
Select "PluralsightCourseTest" and click the "triangle" icon with label -
"Run Test"

### Execute Unit Tests with Mavn

cd to folder with pom.xml file 
```
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ pwd
/workspaces/codespaces-blank/java1/my-app
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ ls -lt
total 12
drwxrwxrwx+ 8 codespace codespace 4096 Aug 23 07:04 target
-rw-rw-rw-  1 codespace codespace 3581 Aug 23 07:03 pom.xml
drwxrwxrwx+ 4 codespace codespace 4096 Aug 13 02:47 src
@somatekumalla ➜ /workspaces/codespaces-blank/java1/my-app (soma-java-course01) $ 
```
command : mvn clean test 



## Conclusion 

