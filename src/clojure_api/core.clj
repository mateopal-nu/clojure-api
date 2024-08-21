;; This is the main fo the project
(ns clojure-api.core
  ;; This import the run-jetty function and app function
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [clojure-api.routes :refer [app]]))

;; This is the main function which using run-jetty will set the port of the server and it will run in second plane with join? false
(defn -main
  []
  (run-jetty app {:port 3000 :join? false}))
