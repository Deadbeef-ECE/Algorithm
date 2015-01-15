/*************************************************************************
	> File Name: solution.c
	> Author: 
	> Mail: 
	> Created Time: Thu Jan 15 13:18:11 2015
 ************************************************************************/

#include<stdio.h>
#include<stdlib.h>

void reverse(char *str){
    printf("Before reverse the str:%s\n", str);
    if(str == NULL){
        printf("Reverse the str with null\n");
        printf("After reverse the str:%s\n", str);
        return;
    }
    int i, len;
    for(i = 0; ; i++){
        if(str[i] == '\0') {
            len = i-1;
            break;
        }
    }
    i = 0;
    while(i < len){
        char tmp = str[i];
        str[i++] = str[len];
        str[len--] = tmp;
    }
    printf("After reverse the str:%s\n", str);
    return;
}


int main (){
    char test1[] = "abcdefgh";
    char test2[] = "!@#$%^&*()";
    char test3[] = "12345667890";
    char test4[] = "abcd1234%^&*";
    char test5[] = "";
    char *test6 = NULL;
    reverse(test1);
    reverse(test2);
    reverse(test3);
    reverse(test4);
    reverse(test5);
    reverse(test6);
    return 0;
}
