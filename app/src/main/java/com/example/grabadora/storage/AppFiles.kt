package com.example.grabadora.storage

import android.content.Context
import java.io.File

object AppFiles{
    fun audioFile(context: Context): File =
        File(context.filesDir, "grabacion.m4a")
}