(defproject chatter "0.1.0-SNAPSHOT"
  :description "A web app for displaying posted messages"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [compojure "1.6.2"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-core "1.8.2"]
                 [ring/ring-jetty-adapter "1.8.2"]
                 [hiccup "1.0.5"]
                 [clj-http "3.11.0"]
                 [enlive "1.1.6"]]
  :plugins [[lein-ring "0.12.5" :exclusions [org.clojure/clojure]]]
  :ring {:handler chatter.handler/app}
  :profiles {:dev {:dependencies [[ring/ring-mock "0.4.0"]]}}
  )
