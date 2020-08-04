
#Implementation

How is the flexibility, of your implementation, e.g., how you add or remove in future new
types?

This application handles the company's goal to allow their legacy system (USB connection to read data from a database stored on an external hard drisk) to run as is and convert the data to the new system (which accesses the customer data using Rest API over Https connection to an external cloud storage server). Since the old system has to be able to access the new system and but maintain the ability to call the old API, we implemented the Adapter Pattern to handle these conversions. The Main.java file demonstrates the execution and translation and the testing of objects. 


How is the simplicity and understandability of your implementation?

It is a simple implementation where the two given interfaces of the legacy system and new system have the same methods, the legacy system uses the database for it's list of customers. The Adapter (HttpstoUSBAdapter.java) acts as a middleman which takes in the old system and translates to the new Https system by allowing us to use the old API. The Main.java executes and displays the confirmation that the old system, new and Adapter are working correctly at runtime. 

How you avoided duplicated code?

Aside from the necessary similarity needed in the old and new systems, the simple implementation of the Adapter Pattern allows us to avoid duplicate code. 


Github Repo Link: https://github.com/alina-akram/met-cs665-assignment-4-alina-akram


# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

You can find more info about coveralls 

https://coveralls.io/

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


