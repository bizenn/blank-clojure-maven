;; -*- mode: clojure; coding: utf-8-unix -*-
(ns org.visha.hello)

(defn hello [& args]
  (apply str "Hello, " args))
