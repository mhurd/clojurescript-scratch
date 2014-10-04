(defproject clojurescript-scratch "0.1.0-SNAPSHOT"
            :description "Scratch project for ClojureScript experiments"
            :url "http://mhurd.com"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [org.clojure/clojurescript "0.0-2356"]]
            :plugins [[lein-cljsbuild "1.0.3"]]
            :cljsbuild {
                         :builds [{:source-path "src/cljs"
                                   :compiler    {
                                                  :output-to     "resources/public/js/hello.js"
                                                  :optimizations :whitespace :pretty-print true
                                                  }}]})
