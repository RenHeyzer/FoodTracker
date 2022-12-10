object Versions {
    const val core = "1.9.0"
    const val material = "1.7.0"
    const val constraint = "2.1.4"
    const val appCompat = "1.5.1"
    const val application = "7.3.1"
    const val androidLibrary = "7.3.1"
    const val kotlin = "1.7.20"
    const val coroutines = "1.5.2"
    const val navigation = "2.3.5"
    const val retrofit = "2.9.0"
    const val lifecycles = "2.4.0"
    const val hilt = "2.38.1"
    const val coil = "1.3.2"
    const val gson = "2.9.0"
    const val dagger = "2.40"
}

object Plugins {

    const val application = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlin = "org.jetbrains.kotlin.android"
    const val kotlinJvm = "org.jetbrains.kotlin.jvm"
    const val kapt = "kapt"
    const val hilt = "dagger.hilt.android.plugin"
    const val safeArgs = "androidx.navigation.safeargs.kotlin"
    const val androidExtensions = "kotlin-android-extensions"
}

object Dependencies {

    object AndroidCore {
        const val core = "androidx.core:core-ktx:1.9.0"
    }

    object UIComponents {
        const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    }

    object Coroutines {
        const val kotlinCoroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val kotlinCoroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object NavigationComponents {
        const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    }

    object Gson {
        const val gson = "com.squareup.retrofit2:converter-gson:${Versions.gson}"
    }

    object OkHttp {
        const val bom = "com.squareup.okhttp3:okhttp-bom:4.9.0"
        const val okhttp = "com.squareup.okhttp3:okhttp"
        const val interceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object ViewBindingPropertyDelegate {
        private const val version = "1.5.3"
        const val bindingNoReflection =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:$version"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:4.12.0"
    }

    object Activity {
        const val version = "androidx.activity:activity-ktx:1.4.0"
    }

    object Fragment {
        const val version = "androidx.fragment:fragment-ktx:1.4.1"
    }

    object Lifecycles {
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycles}"
        const val lifecycleViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycles}"
        const val lifecycleLiveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycles}"
    }

    object Hilt {
        const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object Coil {
        const val coil = "io.coil-kt:coil:${Versions.coil}"
        const val coilSvg = "io.coil-kt:coil-svg:${Versions.coil}"
    }

    object Inject {
        const val inject = "javax.inject:javax.inject:1"
    }

    object Dagger2 {
        const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    }
}