plugins {
    id(Plugins.application)
    id(Plugins.kotlin)
}

android {
    namespace = Config.applicationId
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(Dependencies.AndroidCore.core)
    implementation(Dependencies.UIComponents.appCompat)
    implementation(Dependencies.UIComponents.material)
    implementation(Dependencies.UIComponents.constraint)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.4")

    // Navigation Component
    implementation(Dependencies.NavigationComponents.navigationUI)
    implementation(Dependencies.NavigationComponents.navigationFragment)
}