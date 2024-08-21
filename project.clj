;; This is the config project
(defproject clojure-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [ring "1.10.0"] 
                 [compojure "1.6.3"] 
                 [ring/ring-json "0.5.1"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler clojure-api.routes/app
          :auto-reload? true} ; Habilitar recarga automática
  :main ^:skip-aot clojure-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
