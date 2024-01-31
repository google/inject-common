load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "google_bazel_common",
    sha256 = "82a49fb27c01ad184db948747733159022f9464fc2e62da996fa700594d9ea42",
    strip_prefix = "bazel-common-2a6b6406e12208e02b2060df0631fb30919080f3",
    urls = ["https://github.com/google/bazel-common/archive/2a6b6406e12208e02b2060df0631fb30919080f3.zip"],
)

load("@google_bazel_common//:workspace_defs.bzl", "google_common_workspace_rules")

google_common_workspace_rules()
