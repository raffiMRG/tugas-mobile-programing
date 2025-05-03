# CATA GANTI NAMA PROJECT

1. buka file `settings.gradle.kts` ganti bagian itu

```bash
...
rootProject.name = "Projectawal_MRaffiGumilang"
include(":app")
```

2. buka file `build.gradle.kts` ganti bagian itu

```bash
...
android {
    namespace = "com.example.projectawal_mraffigumilang"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.projectawal_mraffigumilang"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
...
```

3. buka file values/`strings.xml` ganti bagian itu

```bash
<resources>
    <string name="app_name">Projectawal_MRaffiGumilang</string>
    <string name="sign_in_text">Sign In</string>
</resources>
```

4. Klik Kanan nama project, pilih `refactor` > `rename` projectawal_mraffigumilang

```bash
src
│       ├───androidTest
│       │   └───java
│       │       └───com
│       │           └───example
│       │               └───projectawal_mraffigumilang

```

5. script utama yg ada di dalem com.example.projectawal_mraffigumilang

pastiin sama semua, saran copas namanya jgn di ketik. kalo ada yg kelewat sori :v happy Copas
