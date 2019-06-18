load("@google_bazel_common//testing:test_defs.bzl", "gen_java_tests")

package(default_visibility = ["//:src"])

gen_java_tests(
    name = "tests",
    srcs = glob(["*.java"]),
    javacopts = ["-Xep:BetaApi:OFF"],
    deps = [
        "//java/com/google/common/inject",
        "@google_bazel_common//third_party/java/guava:testlib",
        "@google_bazel_common//third_party/java/jsr330_inject",
        "@google_bazel_common//third_party/java/junit",
    ],
)
