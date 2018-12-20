# gradle-dependencies-preloader-plugin

Preload and cache all dependencies in Gradle.

## Usages

```sh
./gradlew :preloadDependencies
```

Caches are storing to `~/.gradle/caches`. You can persist its directory on CI.

## Installation

Build script snippet for plugins DSL for Gradle 2.1 and later:

```groovy
plugins {
  id "jp.s64.gradle.dependencies-preloader" version "0.0.1"
}
```

Build script snippet for use in older Gradle versions or where dynamic configuration is required:

```groovy
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "jp.s64.gradle:dependencies-preloader-plugin:0.0.1"
  }
}

apply plugin: "jp.s64.gradle.dependencies-preloader"
```
