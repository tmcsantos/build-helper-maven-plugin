File file = new File( basedir, "build.log" )
assert file.exists()

String text = file.getText("utf-8")

assert text.matches('(?ms)(.*?)define property rootlocation = "(.*)/root-location-with-only-at-exec-root"(.*?)')
assert text.contains("Skip getting the root-location in this project because it's not the Execution Root")

return true