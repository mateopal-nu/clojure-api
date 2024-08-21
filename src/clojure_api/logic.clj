(ns clojure-api.logic
  (:require [clojure-api.db :refer [db]]))

(defn get-users []
  (vals (:users @db)))

(defn get-user [id]
  (let [user (get (:users @db) id)]
     (if user
       user
       {:error "User not found"})))

(defn add-user [user]
  (let [new-id (inc (count(:users @db)))]
    (swap! db assoc-in [:users new-id] (assoc user :id new-id))))
