;; -*- mode: clojure; coding: utf-8 -*-
(ns org.visha.hello-test
  (:use [clojure.test]
        [org.visha.hello]))

(deftest hello_test []
  (is (= "Hello, clojure" (hello "clojure"))))

(run-tests)
