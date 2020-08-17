# Description:
#   Tools for Inject Common

load("@google_bazel_common//third_party/bazel_skylib:bzl_library.bzl", "bzl_library")

package(default_visibility = ["//:src"])

exports_files([
    "pom-template.xml",
])

bzl_library(
    name = "maven_bzl",
    srcs = ["maven.bzl"],
    visibility = ["//visibility:private"],
)
