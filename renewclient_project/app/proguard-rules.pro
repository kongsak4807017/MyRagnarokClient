# Keep Jetpack Compose generated classes
-keep class * implements androidx.compose.runtime.Composable {}

# Keep Hilt generated components
-keep class dagger.hilt.internal.generated.** { *; }
-keep class * extends dagger.hilt.android.internal.lifecycle.HiltWrapper_ActivityRetainedComponentManager_HiltActivityRetainedComponentBuilder {}
