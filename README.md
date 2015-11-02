Fluent Date [![Build Status](https://travis-ci.org/eXparity/fluent-date.svg?branch=master)](https://travis-ci.org/eXparity/fluent-date) [![Coverage Status](https://coveralls.io/repos/eXparity/fluent-date/badge.png?branch=master)](https://coveralls.io/r/eXparity/fluent-date)
===========

A library for creating Date instances with a fluent readable syntax

Licensed under [BSD License][].

What is Fluent Date?
-----------------
Fluent Date is an library which supports creation of java Date, LocalDate, LocalDateTime, and ZonedDateTime instances using a simple human readable format e.g. FluentDate.JAN(8,2014) would return a java Date for 8th January 2014

Downloads
---------
You can obtain Fluent Date binaries from [maven central][]. To include your project in:

A maven project

    <dependency>
        <groupId>org.exparity</groupId>
        <artifactId>fluent-date</artifactId>
        <version>2.0.0</version>
    </dependency>

Versions 2.x.x onwards require Java 8. If you are using an earlier version of Java 8 then include version

    <dependency>
        <groupId>org.exparity</groupId>
        <artifactId>fluent-date</artifactId>
        <version>1.0.1</version>
    </dependency>
            
Binaries
--------
Fluent Date has a single binary, fluent-date.jar, which contains all the fluent date builder. Sources and JavaDoc jars are available.

Usage
-------------

The fluent builders are exposed as static methods on the FluentDate, FluentDateTime, FluentLocalDate, and FluentLocalDateTime classes. For Example

	Date releaseDate = FluentDate.JAN(8,2014);
	Date releaseDateAndTime = FluentDateTime.JAN(8,2014).at(12,0,0);

or after static importing

	Date releaseDate = JAN(8,2014);
	Date releaseDateAndTime = JAN(8,2014).at(12,0,1);

The equivalent builders for LocalDate, LocalDateTime, and ZonedDateTime are as follows:

	LocalDate releaseDate = FluentLocalDate.JAN(8,2014);
	LocalDateTime releaseDateAndTime = FluentLocalDateTime.JAN(8,2014).at(12,0,1);
	ZonedDateTime releaseDateAndTime = FluentLocalDateTime.JAN(8,2014).at(12,0,1,ZoneId.of("UTC"));	

The Javadocs include examples on all methods so you can look there for examples for specific methods

Source
------
The source is structured along the lines of the maven standard folder structure for a jar project.

  * Core classes [src/main/java]
  * Unit tests [src/test/java]

The source includes a pom.xml for building with Maven 

Release Notes
-------------
Changes 1.0.1 -> 2.0.0
  * Add support for Java 8 Temporal types.
  
Changes 1.0.0 -> 1.0.1
  * Add support for supplying a TimeZone to FluentDateTime.
  * Remove incorrect copyright notices

Acknowledgements
----------------
Developers:
  * Stewart Bissett

[BSD License]: http://opensource.org/licenses/BSD-3-Clause
[Maven central]: http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22fluent-date%22
