#include <stdio.h>
#include <string.h>

int main() {
  char s[5] = "";
  int x;
  float y;

  fgets(s, sizeof(s), stdin);
  s[strlen(s) - 1] = '\0';
  scanf("%d", &x);
  scanf("%f", &y);

  printf("s = %s\n", s);
  printf("x = %d\n", x);
  printf("y = %f\n", y);
}
