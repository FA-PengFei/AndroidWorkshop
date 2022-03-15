//
// Created by Pengfei on 15/3/22.
//

#include <jni.h>
#include <string>
#include <iostream>

extern "C" JNIEXPORT jstring JNICALL Java_n0h4ts_com_piratemap_Second2Fragment_Predict(JNIEnv* env, jobject obj){

    return env->NewStringUTF("a982c6f3a4ef575a30fb69563de644bcb0e16814");

}