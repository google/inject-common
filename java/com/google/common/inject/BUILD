load("@google_bazel_common//tools/javadoc:javadoc.bzl", "javadoc_library")
load("//tools:maven.bzl", "POM_VERSION", "pom_file")

package(
    default_visibility = ["//:src"],
)

java_library(
    name = "inject",
    srcs = glob(["*.java"]),
    tags = ["maven_coordinates=com.google.common.inject:inject-common:" + POM_VERSION],
    deps = [
        "@google_bazel_common//third_party/java/error_prone:annotations",
        "@google_bazel_common//third_party/java/jsr305_annotations",
        "@google_bazel_common//third_party/java/jsr330_inject",
    ],
)

pom_file(
    name = "pom",
    artifact_id = "inject-common",
    artifact_name = "Inject Common",
    targets = [":inject"],
)

javadoc_library(
    name = "javadoc",
    srcs = glob(["*.java"]),
    root_packages = ["com.google.common.inject"],
    deps = [":inject"],
)
