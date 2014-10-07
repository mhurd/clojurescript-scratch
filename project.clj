(defproject clojurescript-scratch "0.1.0-SNAPSHOT"
            :description "Scratch project for ClojureScript experiments"
            :url "http://mhurd.com"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :plugins [[lein-cljsbuild "1.0.3"]]
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [org.clojure/clojurescript "0.0-2356"]
                           [domina "1.0.2"]
                           [compojure "1.2.0"]
                           [ring/ring-jetty-adapter "1.3.1"]]
            :source-paths ["src/clj"]
            :main clojurescript-scratch.server
            :cljsbuild
            {:builds
              [{:source-paths ["src/cljs"],
                :compiler
                              {:optimizations :advanced,
                               :output-dir    "resources/tmp-js",
                               :output-to     "resources/public/cljs/client.js",
                               :pretty-print  true}}]})