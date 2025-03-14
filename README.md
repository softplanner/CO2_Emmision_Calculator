CO2 Emission Calculator

Table of Contents

Introduction

Features

Installation

Usage

Testing

CO2 Data

Acceptance Criteria

Contributing

License

Clarification on Output Behavior

Introduction

This project is a command-line tool that calculates the CO2-equivalent emissions for a given distance and transportation method. It supports various transportation methods and allows users to specify distances in kilometers (km) or meters (m). The tool outputs the result in kilograms (kg) or grams (g).

Features

Calculate CO2 emissions for various transportation methods.

Supports distances in kilometers (km) and meters (m).

Outputs results in kilograms (kg) or grams (g).

Flexible command-line argument parsing.

Unit tests for all implemented features.

Installation

Prerequisites

Java Development Kit (JDK)

Maven (for dependency management and building the project)

Steps

Clone the repository:

git clone https://github.com/your-username/CO2_Emission_Calculator.git

Navigate to the project directory:

cd CO2_Emission_Calculator

Build the project using Maven:

mvn clean install

Usage

Command-Line Syntax

java -jar target/co2-calculator.jar --transportation-method <method> --distance <distance> --unit-of-distance <unit> [--output <unit>]

Examples

Calculate CO2 emissions for a medium diesel car traveling 15 km:

java -jar target/co2-calculator.jar --transportation-method medium-diesel-car --distance 15 --unit-of-distance km

Output:

Your trip caused 2.6kg of CO2-equivalent.

Calculate CO2 emissions for a train traveling 14500 meters:

java -jar target/co2-calculator.jar --transportation-method train --distance 14500 --unit-of-distance m

Output:

Your trip caused 87g of CO2-equivalent.

Specify output in kilograms:

java -jar target/co2-calculator.jar --transportation-method train --distance 14500 --unit-of-distance m --output kg

Output:

Your trip caused 0.1kg of CO2-equivalent.

Testing

To run unit tests, use the following command:

mvn test

CO2 Data

The following CO2-equivalent values (in grams per passenger per km) are used for calculations:

Transportation Method

CO2e (g/km)

Small Cars



small-diesel-car

142

small-petrol-car

154

small-plugin-hybrid-car

73

small-electric-car

50

Medium Cars



medium-diesel-car

171

medium-petrol-car

192

medium-plugin-hybrid-car

110

medium-electric-car

58

Large Cars



large-diesel-car

209

large-petrol-car

282

large-plugin-hybrid-car

126

large-electric-car

73

Public Transport



bus

27

train

6

Source: BEIS/Defra Greenhouse Gas Conversion Factors 2019

Acceptance Criteria

Functional Requirements

The tool accepts a numeric distance, unit-of-distance (km or m), and transportation method.

Default unit is kilometers (km).

Outputs CO2-equivalent in kilograms (kg) or grams (g).

Supports flexible command-line argument parsing.

Non-Functional Requirements

Unit tests are implemented and mandatory.

Uses Maven for dependency management and building.

Follows best practices for architecture and code style.

Contributing

Contributions are welcome! Please follow these steps:

Fork the repository.

Create a new branch for your feature or bugfix.

Submit a pull request with a detailed description of your changes.

License

This project is licensed under the MIT License. See the LICENSE file for details.

Clarification on Output Behavior

When the distance is provided in meters (m), the tool calculates the CO2 emissions in grams (g) by default.

When the distance is provided in kilometers (km), the tool calculates the CO2 emissions in kilograms (kg) by default.

The --output flag can be used to override the default unit (e.g., force output in kg or g).

Example:

java -jar target/co2-calculator.jar --transportation-method train --distance 14500 --unit-of-distance m

Output:

Your trip caused 87g of CO2-equivalent.

java -jar target/co2-calculator.jar --transportation-method train --distance 14500 --unit-of-distance km

Output:

Your trip caused 87.0kg of CO2-equivalent.

Note: There was a typo with the --output argument in previous examples. Ensure to use --output <unit> correctly when specifying output format.

