cmake_minimum_required(VERSION 3.10)

# Project name and language
project(pointer_full VERSION 1.0.0 LANGUAGES C)

# Set C standard
set(CMAKE_C_STANDARD 11)
set(CMAKE_C_STANDARD_REQUIRED ON)

# Add your source files
add_executable(pointer_final pointer_full.c)
