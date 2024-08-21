(ns clojure-api.db)

(def db (atom {:users {1 {:id 1 :name "Romeo" :email "romeo@hotmail.com"}
                       2 {:id 2 :name "Anastasia" :email "anastasia1@gmail.com"}}}))