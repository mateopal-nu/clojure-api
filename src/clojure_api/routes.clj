(ns clojure-api.routes
  (:require [compojure.core :refer [defroutes GET POST]]
            [compojure.route :as route]
            [clojure-api.logic :as logic]
            [clojure-api.middleware :refer [wrap-json]]))

(defroutes app-routes
  (GET "/users" [] (logic/get-users))
  (GET "/users/:id" [id]
    (let [user (logic/get-user (Integer. id))]
      (if user
        (if (contains? user :error)
          {:status 404 :body user}
          {:status 200 :body user})
        {:status 404 :body {:error "User not found"}})))
  (POST "/users" request (logic/add-user (:body request)))
  (route/not-found "Not found"))

(def app
  (wrap-json app-routes))