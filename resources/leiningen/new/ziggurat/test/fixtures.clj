(ns {{name}}.fixtures
  (:require [mount.core :as mount]
            [ziggurat.config :as config]))

(defn mount-config []
  (-> (mount/only [#'config/config])
      (mount/swap {#'config/config (config/config-from-env "config.test.edn")})
      (mount/start)))

(defn mount-test-config [f]
  (mount-config)
  (f)
  (mount/stop))
