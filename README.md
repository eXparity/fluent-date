Fluent Date [![Build Status](https://travis-ci.org/eXparity/fluent-date.svg?branch=master)](https://travis-ci.org/eXparity/fluent-date)
===========

A library for creating Date instances with a fluent readable syntax

Licensed under [BSD License][].

What is Fluent Date?
-----------------
Fluent Date is an library which supports creation of java Date instances using a simple human readable format e.g. FluentDate.JAN(8,2014) with return a java Date for 8th January 2014

Downloads
---------
You can obtain Fluent Date binaries from [maven central][]. To include your project in:

A maven project

    <dependency>
        <groupId>org.exparity</groupId>
        <artifactId>fluent-date</artifactId>
        <version>1.0.0</version>
    </dependency>

A project which uses ivy for dependency management

    <dependency org="org.exparity" name="fluent-date" rev="1.0.0"/>
            
Binaries
--------
Fluent Date has a single binary, fluent-date.jar, which contains all the fluent date builder. Sources and JavaDoc jars are available.

Usage
-------------

The fluent builders are exposed as static methods on the FluentDate and FluentDateTime classes. For Example

	Date releaseDate = FluentDate.JAN(8,2014);
	Date releaseDateAndTime = FluentDateTime.JAN(8,2014).at(12,0,0);

or after static importing

	Date releaseDate = JAN(8,2014);
	Date releaseDateAndTime = JAN(8,2014).at(12,0,0);

The Javadocs include examples on all methods so you can look there for examples for specific methods

Source
------
The source is structured along the lines of the maven standard folder structure for a jar project.

  * Core classes [src/main/java]
  * Unit tests [src/test/java]

The source includes a pom.xml for building with Maven 

Acknowledgements
----------------
Developers:
  * Stewart Bissett

[BSD License]: http://opensource.org/licenses/BSD-3-Clause
[Maven central]: http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22fluent-date%22
