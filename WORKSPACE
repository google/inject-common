load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "google_bazel_common",
    strip_prefix = "bazel-common-f210e2c9e7bde1f0f6596bd7663833c6866715f2",
    urls = ["https://github.com/google/bazel-common/archive/f210e2c9e7bde1f0f6596bd7663833c6866715f2.zip"],
)

load("@google_bazel_common//:workspace_defs.bzl", "google_common_workspace_rules")

google_common_workspace_rules()
