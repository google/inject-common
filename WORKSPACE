load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "google_bazel_common",
    sha256 = "7e5584a1527390d55c972c246471cffd4c68b4c234d288f6afb52af8619c4560",
    strip_prefix = "bazel-common-d58641d120c2ad3d0afd77b57fbaa78f3a97d914",
    urls = ["https://github.com/google/bazel-common/archive/d58641d120c2ad3d0afd77b57fbaa78f3a97d914.zip"],
)

load("@google_bazel_common//:workspace_defs.bzl", "google_common_workspace_rules")

google_common_workspace_rules()
