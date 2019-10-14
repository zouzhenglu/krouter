package com.kzl.krouter


fun String.newInstance(): Any? = Class.forName(this).getDeclaredConstructor().newInstance()
