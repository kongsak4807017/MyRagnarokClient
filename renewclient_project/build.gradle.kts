plugins {
    // Versions defined directly for clarity in this reference project
    id("com.android.application") version "8.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    id("com.google.dagger.hilt.android") version "2.51" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
