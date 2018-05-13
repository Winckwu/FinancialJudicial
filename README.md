# Project Description
The project is an Internet platform built to facilitate financial platforms to resolve bad loans through legal means while reducing the time for lawyers to deal with such cases.
Platform users include the Internet financial platform (we are referred to as FJ users), lawyers and system administrators.  
The specific process is:  
(1)	FJ users and lawyers registered to log in and improve personal information submitted to the background administrator for review.  
(2)	After the approval is passed, FJ users can issue legal proceedings, generate a summary table of the cases and submit them to the backstage manager for review. After the backstage manager passes the summary table of the cases, the case can be assigned to the audited lawyer for handling the case.  
(3)	After the case is dispatched to the corresponding lawyer, the case appears on the solicitor's order form page, and the lawyer can view the details of the case and select the designated case for the order.  
(4)	The lawyer handled the case after receiving the order and proceeded with the progress of the case. As the lawyer handles the case, the FJ users and the backstage manager can check the progress of the corresponding case.  
(5)	After the case is over, the Internet finance platform can evaluate the lawyer's service in the case.


## Project steps
### Clone the project to the local
Use the `git clone https://git.oschina.net/jordanxu/speedjustice.git` command to clone the project locally.
### Import project
Open Intellij-idea, click File->Open, open the project's outermost `pom.xml` file, select the file and open it to import the entire project into intellij-idea.
### Configure Quick Start
Click the configuration drop-down box next to the start button, click on the `Edit Configurations`, in the pop-up box that appears, click on the `+` sign in the upper left corner, select `springboot`, click on the `Application` file under the new springboot,
and configure related parameters on the right side: In the Configuration tab on the right side, select `com.speedjustice.WebApplication` in the path of the Main class and `web` in the Use classpath of module, then click the `OK` button. 
  
Complete the above four steps. Click the Run button to run. Successful operation will appear under the console `Started WebApplication in 8.123 seconds (JVM running for 13.46)` similar words, that the boot is successful. Enter `localhost:8088` in the browser to welcome the Demo system.
### Modify properties
Find the application-sample.properties file in the web and adminWeb, and copy it to application-local.properties, according to the local development environment and the actual operation needs, modify the parameter values, and through Intellij IDEA, the specific method is `Edit Configurations-> Configuration `, Add `-Dspring.profiles.active=local` in `VM options`.
### Add files
After modifying the properties, copy the contents of the pdffiles folder and fileNeeded/download.path folder to the appropriate path according to the relevant values in the properties. The project can then be run.


## Using mybatis to connect mysql to generate model and mapper files
### Intellij configuration mybatis quick start
Configure mybatis to generate a model quick start. Click on the configuration drop-down box next to the start button, click on the `Edit Configurations`, in the pop-up box that appears, click on the `+` sign in the upper left corner, select maven, which `working directory` select `MyBatisGenerator` directory, (My directory is C:/Users/wuqi/Desktop/FinancialJudicial.) Fill the `Command line` with `mybatis-generator:generate -e`, then click the `apply`,`OK` button.
### Run the project
Click the `Run button` to generate the corresponding `model` and `mapper` files in the dataLayer's java directory.
## Project hot start issue in intellij
### Problem Description:
  Every time a java file or page file is modified, it needs to be restarted before it can take effect.
### Solution
- Method 1. Click `Run`->` Reload Changed Classes` after each modification.  
- Method 2. The shortcut key starts. Click on `File`->`Settings...`->`KeyMap`->type "Reload Changed Classes" in the search box. After it is found, double-click and select `Add keyboard Shortcut`. Directly on the keyboard, you can press the shortcut key you want to set, then you can automatically import the shortcut key, and then save it. After each time you modify the file, you only need to press the shortcut key to achieve a hot start.
- (Note: The above two methods can only be used in debug mode)
## Deployment error memo
After the web is deployed to tomcat, the access report 404 error is due to the following aspects:

* Need to add the ServletInitializer class to the servlet package in the web.
* Need to add `<artifactId>spring-boot-starter-tomcat</artifactId>` in pom.xml.
* RequestMapping("/") in all controllers needs to be deleted. There will be no problem when starting with springbootapplication, but there will be a 404 error through tomcat deployment.