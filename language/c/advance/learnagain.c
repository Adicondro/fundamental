// 1. Introduction to learning C programming
// 2. Basics of printing and main function in C 
// 3. Using Compilers: Clang and GCC
// 4. Basic integer types and typedef usage
// 5. Structures in C explained

#include <stdio.h>
#include <stdint.h>
#include <stdbool.h>

typedef int8_t i8;
typedef int16_t i16;
typedef int32_t i32;
typedef int64_t i64;
typedef uint8_t u8;
typedef uint16_t u16;
typedef uint32_t u32;
typedef uint64_t u64;

typedef i8 b8;
typedef i32 b32;

typedef float f32;
typedef double f64;

typedef struct{
  f32 x;
  f32 y;
} vec2f;

int main(){
  vec2f v = { 
    .y = 1, 
  };

  printf("Vector = < %f, %f >\n", v.x, v.y);

  v = (vec2f){
    .x = 3, .y = 4
  };

  printf("Vector = < %f, %f >\n", v.x, v.y);

  v.y = 12;
  v.x = 0;

  return 0;
}
