# Description:
#   Common tools for javax.inject implementations and consumers.

load("@rules_java//java:defs.bzl", "java_library")

package(
    default_visibility = [":src"],
)

package_group(
    name = "src",
    packages = [
        "//",
        "//java/...",
        "//javatests/...",
        "//tools/...",
    ],
)

exports_files(["LICENSE"])

java_library(
    name = "inject_common",
    exports = ["//java/com/google/common/inject"],
)
