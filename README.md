# Home Security System (HSS)

## Introduction

The Home Security System (HSS) is a Java-based project that simulates a home security system using various design
patterns. It provides a framework for monitoring smoke and motion sensors, sending SMS messages in different formats,
and controlling devices such as water sprinklers and alarms.

## Key Features:

- Monitors smoke and motion sensors
- Sends SMS messages in different formats
- Controls devices such as water sprinklers and alarms
- Uses various design patterns:
  - Abstract Factory pattern is used to create different types of devices in a flexible and extensible manner.
  - Strategy pattern is employed to handle different alert strategies, allowing the system to send SMS messages in various formats or through different communication channels.
  - Observer pattern is used to monitor sensors and notify the system when a sensor is triggered.
  - Singleton pattern is used to ensure that only one instance of the logging system is created.
  - Template pattern is applied to define the common structure and workflow of the security system, allowing easy customization for different sensors and devices.
- The project follows a modular package structure to organize classes based on their functionalities and responsibilities.
- The project aims to showcase the application of multiple design patterns in a real-world scenario. It provides a solid foundation for building and expanding upon a home security system while promoting code reusability, maintainability, and flexibility.
- The project is developed using Java and does not include real-time hardware integration or actual security functionalities.
- The project is developed as an educational demonstration of design patterns and is not intended for commercial use.
