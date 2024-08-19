plugins {
    id("io.papermc.paperweight.userdev") version "1.7.1"
}

apply(plugin = "io.papermc.paperweight.userdev")

val lombok = "1.18.34"
val annotations = "24.1.0"
val paper = "1.21.1-R0.1-20240818.224341-32"

dependencies {
    compileOnly("org.projectlombok:lombok:${lombok}")
    annotationProcessor("org.projectlombok:lombok:${lombok}")
    compileOnly("org.jetbrains:annotations:${annotations}")

    paperweightDevelopmentBundle("io.papermc.paper:dev-bundle:${paper}")
}