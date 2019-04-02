(ns {{name}}.main
  (:require [ziggurat.init :as init])
  (:gen-class))

(defn start []
  ;; Write your startup logic here
  )

(defn stop []
  ;; Write your shutdown logic here
  )

(defn main-func
  "This is your message processing function."
  [message]
  ;; Return :success if the message was successfully processed.
  ;; Return :skip to skip the message and move to the next.
  ;; Return :retry to queue the message for retrying.
  :success)

(defn -main [& args]
  (init/main start stop {:topic {:handler-fn main-func}}))
