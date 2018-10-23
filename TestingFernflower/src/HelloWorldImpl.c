#include <jni.h>
#include "com_company_Main.h"
#include <stdio.h>

JNIEXPORT void JNICALL 
Java_com_company_Main_displayHelloWorld(JNIEnv *env, jobject obj) 
{
    printf("Hello world!\n");
    return;
}
