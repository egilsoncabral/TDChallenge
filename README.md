# TDChallenge

This is a personal challenge project, whose purpose is to validate a file with phones and identify the appropriate area codes for each.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

To run the project, you will need to clone it to your workspace and have jdk installed at least in version 6 onwards and have the maven for build it. In addition, you will need to create a text file with the phone numbers in the project's root directory with the following pattern:

```
+351960000000
00351960000000
+00112
```

### Executing

To run the program, you will have two options, the first will be through the configuration of running your IDE, informing as the initialization parameter, the name of the phone file, for example:

```
arquivo_telefones.txt
```

the second way, is generating the TDChallenge-0.0.1-SNAPSHOT.jar file in the project's target folder and copying that file to a chosen directory along with the phone file. After doing this run the java as follows:

```
java -jar TDChallenge-0.0.1-SNAPSHOT.jar arquivo_telefones.txt
```

The output of the program will be the number of valid area codes in a sequential way, as in the example below:

```
1:3
55:2
341:5
```

## Running the tests

To run the tests, you can through your IDE send the command to run all the unit tests of the project in the junit tests menu. Anyway, the tests will run automatically when building the project through Maven.

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Egilson Cabral** - [TDChallenge](https://github.com/egilsoncabral/TDChallenge)

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

