//
// Created by fuweiwei on 16/12/22.
//
#include <jni.h>
jstring
Java_com_veer_ndk_MainActivity_getStrFromJNI(JNIEnv *env,jobject thiz)
 {

 return (*env)->NewStringUTF(env, "I`m Veer!");

 }

