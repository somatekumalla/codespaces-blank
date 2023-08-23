aug13b_ch03.txt

> Chapter 03

Chapter : Calling an External Web API

>>> High Level View

Client application makes an HTTP Call to Pluralsight.com
HTTP call is made using HttpClient class available in Java

Response is converted to an instance of Java Record
Java Record was introduced in Java 17
Response object -> created with Java Record 

JSON strings are created / consumed using an external library called Jackson
JSON -> Ojbect mapping : Jackson 

Testing -> JUnit 


>>> update code 
- Add class CourseRetrievalService
- Use the new service

Url to get course information -
https://app.pluralsight.com/profile/data/author/sander-mak/all-content


>>> data returned 
parsed JSON string with an online Json parser -
https://jsonformatter.org/json-parser


[
  {
    "title": "Migrating Beyond Java 8",
    "id": "33c16ea6-25e4-451d-8b0a-b4c78b14a3ab",
    "status": "retired",
    "level": "Beginner",
    "duration": "00:54:57",
    "displayDate": "2020-09-03T00:00:00+00:00",
    "contentRating": {
      "averageRating": 0,
      "numberOfRaters": 6
    },
    "authors": [
      {
        "handle": "sander-mak",
        "firstName": "Sander",
        "lastName": "Mak"
      }
    ],
    "type": "course",
    "contentUrl": "/library/courses/migrating-beyond-java-8-webinar",
    "isRetired": true,
    "isNew": false
  },
  ...
  {
    "title": "What’s New in Java 13",
    "id": "e1d5e19c-5eb8-44dc-be43-0e8a4c13c7fc",
    "status": "published",
    "level": "Intermediate",
    "duration": "00:46:06.5094440",
    "displayDate": "2019-08-09T00:00:00+00:00",
    "contentRating": {
      "averageRating": 4.882353,
      "numberOfRaters": 51
    },
    "authors": [
      {
        "handle": "sander-mak",
        "firstName": "Sander",
        "lastName": "Mak"
      }
    ],
    "type": "course",
    "contentUrl": "/library/courses/whats-new-in-java-13",
    "isRetired": false,
    "isNew": false
  }
]

>>> Documentation 
Search for "javadoc 17"
https://docs.oracle.com/en/java/javase/17/docs/api/
Go to "java.net.http" module which contains the HttpClient class documentation.
- java.net.http : Defines the HTTP Client and WebSocket APIs.
- from the javadoc summary info 



>>> Chrome Extension JsonFormatter
Add this extension to Chrome browser to parse JSON 

>>> Class HttpClient 
Module java.net.http, Package java.net.http
Class HttpClient

java.lang.Object
java.net.http.HttpClient

public abstract class HttpClient
extends Object

>>> updated code 
updated CourseRetrievalService.java 

ran the application : Click the "Run and Debug" icon top right

Output -
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:41399 @/tmp/cp_1bkbkvd4gu0wgrybxm2albpw1.argfile com.soma.app.cli.CourseRetriever sander-mak 
[main] INFO com.soma.app.cli.CourseRetriever - CourseRetriever started
[main] INFO com.soma.app.cli.CourseRetriever - Retrieving courses for author 'sander-mak'
[main] INFO com.soma.app.cli.CourseRetriever - Retrieved the following courses [{"title":"Migrating Beyond Java 8","id":"33c16ea6-25e4-451d-8b0a-b4c78b14a3ab","status":"retired","level":"..
":"Intermediate","duration":"00:46:06.5094440","displayDate":"2019-08-09T00:00:00+00:00","contentRating":{"averageRating":4.882353,"numberOfRaters":51},"authors":[{"handle":"sander-mak","firstName":"Sander","lastName":"Mak"}],"type":"course","contentUrl":"/library/courses/whats-new-in-java-13","isRetired":false,"isNew":false}]
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ 

@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ git log -n 1
commit 82c24f3ecafb5f0bfe774a73aab0c53ab81f9df3 (HEAD -> soma-java-course01)
Author: Soma <somatekumalla@gmail.com>
Date:   Sun Aug 13 19:08:29 2023 +0000

    Updated with call to Pluralsight api to receive JSON string containing course information for the author.
	

>>> commit and push
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ git log -n 1
commit 1f075e9b79996abe3df9fe7e534a709ddf5e3c87 (HEAD -> soma-java-course01, origin/soma-java-course01)
Author: Soma <somatekumalla@gmail.com>
Date:   Sun Aug 13 19:26:33 2023 +0000

    Handled errors in the response to the HttpClient send request.
	
>> Introducing a Java Record 

Java Record is meant to model data in Java 

>>> java-record-motivation

```
 Properly writing such a data-carrier class involves a lot of low-value, repetitive, error-prone code: constructors, accessors, equals, hashCode, toString, etc. 
 
 Record class declaration -
 record Point(int x, int y) { }
 
 
```

```java 
class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x() { return x; }
    int y() { return y; }

    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        Point other = (Point) o;
        return other.x == x && other.y == y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }

    public String toString() {
        return String.format("Point[x=%d, y=%d]", x, y);
    }
}
```

>>> Code update 

```
@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $  /usr/bin/env /home/codespace/.vscode-remote/extensions/redhat.java-1.21.0-linux-x64/jre/17.0.7-linux-x86_64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:41001 @/tmp/cp_1bkbkvd4gu0wgrybxm2albpw1.argfile com.soma.app.cli.CourseRetriever sander-mak 
[main] INFO com.soma.app.cli.CourseRetriever - CourseRetriever started
[main] INFO com.soma.app.cli.CourseRetriever - Course : PluralsightCourse[id=id, title=title, duration=08:54:57, contentUrl=https://url, isRetired=false]

@somatekumalla ➜ /workspaces/codespaces-blank (soma-java-course01) $ git log -n 3
commit 17bb527ed043bfc849280b8f28d0bcaee5b743d0 (HEAD -> soma-java-course01, origin/soma-java-course01)
Author: Soma <somatekumalla@gmail.com>
Date:   Mon Aug 14 01:08:08 2023 +0000

    Changed return type for getCoursesFor() method.

commit 37e89c54f7eee59a703177d64ad0e083ff1c68ae
Author: Soma <somatekumalla@gmail.com>
Date:   Mon Aug 14 00:52:39 2023 +0000

    Added java record PluralsightCourse

commit 1f075e9b79996abe3df9fe7e534a709ddf5e3c87
Author: Soma <somatekumalla@gmail.com>
Date:   Sun Aug 13 19:26:33 2023 +0000

    Handled errors in the response to the HttpClient send request.
	
```


>> Jackson JSON Binding 

>>> Search maven central 

search term : "jackson-databind"
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.15.2</version>
</dependency>

search : "jackson-annotation"
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-annotations</artifactId>
    <version>2.15.2</version>
</dependency>

>>> Maven in VS Code 

Open the "MAVEN" node in VS Code 
There will be nodes for -
Lifecycle
Plugins
Dependencies
Favorites
Profiles

Under the "Dependencies" node we have -
junit
org.slf4j:slf4j-api:2.0.7
org.slf4j:slf4j-simple:2.0.7
com.fasterxml.jackson.core:jackson-databind:2.15.2
com.fasterxml.jackson.core:jackson-annotations:2.15.2


>>> git log java record

commit 7a55cc0e690bcf896eaaf26dfbcfe9434ca21cd3
Author: Soma <somatekumalla@gmail.com>
Date:   Mon Aug 14 03:14:10 2023 +0000

    Added filtering of course list returned by course retrieval service.

commit 79ffd30eddb0a75fd38e13db74510fd64e61f993
Author: Soma <somatekumalla@gmail.com>
Date:   Mon Aug 14 03:01:03 2023 +0000

    Updated case 200 in getCoursesFor(..) method

commit 17bb527ed043bfc849280b8f28d0bcaee5b743d0
Author: Soma <somatekumalla@gmail.com>
Date:   Mon Aug 14 01:08:08 2023 +0000

    Changed return type for getCoursesFor() method.

commit 37e89c54f7eee59a703177d64ad0e083ff1c68ae
Author: Soma <somatekumalla@gmail.com>
Date:   Mon Aug 14 00:52:39 2023 +0000

    Added java record PluralsightCourse











