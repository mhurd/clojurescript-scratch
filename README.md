# clojurescript-scratch

Notes on running and setting up the project.

## Installing Leiningen
```brew install leiningen```

## REPL
```brew install rlwrap``` fixes dodgy cursor keys for the cljs REPL.

```rlwrap lein trampoline cljsbuild repl-rhino```

## Compile
```lein cljsbuild {auto | once | clean}```
