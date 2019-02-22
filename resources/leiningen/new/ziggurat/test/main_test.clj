(ns {{name}}.main-test
  (:require [clojure.test :refer :all]
            [{{name}}.fixtures :as fix]))

(use-fixtures :once fix/mount-test-config)

(deftest a-test
  (testing "FIXME"
    (is (= 0 1)
        "FIXME, I fail")))
