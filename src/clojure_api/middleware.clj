(ns clojure-api.middleware
  (:require [ring.middleware.json :as middleware]))

;; Middleware para manejar JSON
(defn wrap-json [handler]
  (middleware/wrap-json-body
   (middleware/wrap-json-response
    handler)))
