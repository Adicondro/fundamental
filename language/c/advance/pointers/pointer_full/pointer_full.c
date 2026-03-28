#include <stdio.h>
#include <stdlib.h>

int add_func(int a, int b){
  return a + b;
}

int main() {

  // 1. Basic Pointer Usage
  int a_val = 10;
  int *a_ptr = &a_val;
  printf("Basic: %d\n", *a_ptr);

  // 2. Uninitialized Pointer
  int *b_ptr;
  // *b_ptr = 5;  // undefined behavior

  // 3. Pointer Arithmetic
  int c_arr[3] = {1, 2, 3};
  int *c_ptr = c_arr;
  printf("Arithmetic: %d\n", *(c_ptr + 1));

  // 4. Array and Pointer Access
  int d_arr[5] = {0, 1, 2, 3, 4};
  printf("Array: %d %d\n", d_arr[2], *(d_arr + 2));

  // 5. Double Pointer
  int e_val = 20;
  int *e_ptr = &e_val;
  int **e_pptr = &e_ptr;
  printf("Double: %d\n", **e_pptr);

  // 6. Dynamic Allocation
  int *f_ptr = malloc(sizeof(int));
  *f_ptr = 42;
  printf("Malloc: %d\n", *f_ptr);
  free(f_ptr);

  // 7. Dangling Pointer
  int *g_ptr = malloc(sizeof(int));
  free(g_ptr);
  // *g_ptr = 10;  // undefined behavior

  // 8. NULL Pointer
  int *h_ptr = NULL;
  // printf("%d\n", *h_ptr);  // undefined behavior

  // 9. Function Pointer
  int (*i_func_ptr)(int, int) = add_func;
  printf("Function: %d\n", i_func_ptr(2, 3));

  // 10. Pointer to Struct
  struct Node {
    int value;
  };

  struct Node j_node;
  struct Node *j_ptr = &j_node;
  j_ptr->value = 100;
  printf("Struct: %d\n", j_ptr->value);

  // 11. Void Pointer
  int k_val = 5;
  void *k_ptr = &k_val;
  printf("Void: %d\n", *(int *)k_ptr);

  // 12. Const Pointer Variants
  int l_val = 10;
  const int *l_ptr1 = &l_val;

  int m_val = 20;
  int *const m_ptr2 = &m_val;

  // 13. Memory Leak Pattern
  int *n_ptr = malloc(sizeof(int));
  n_ptr = malloc(sizeof(int)); // previous allocation lost

  // 14. Invalid Free
  int o_val = 30;
  // free(&o_val);  // invalid

  // 15. Out of Bounds Access
  int p_arr[3] = {1, 2, 3};
  // printf("%d\n", p_arr[5]);  // undefined behavior
  
  return 0;
}
