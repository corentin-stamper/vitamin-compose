plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
}

dependencies {
    api(project(":appbars"))
    api(project(":badges"))
    api(project(":buttons"))
    api(project(":checkboxes"))
    api(project(":chips"))
    api(project(":cards"))
    api(project(":dividers"))
    api(project(":fabs"))
    api(project(":foundation:foundation"))
    api(project(":foundation:foundation-icons"))
    api(project(":foundation:foundation-assets"))
    api(project(":menus"))
    api(project(":modals"))
    api(project(":prices"))
    api(project(":progressbars"))
    api(project(":radiobuttons"))
    api(project(":ratings"))
    api(project(":skeletons"))
    api(project(":snackbars"))
    api(project(":switches"))
    api(project(":tabs"))
    api(project(":tags"))
    api(project(":text-inputs"))
    api(project(":quantity-pickers"))
    api(project(":scaffolds"))
}
