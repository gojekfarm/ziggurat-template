(defproject {{name}} "0.0.1"
  :description "describe me"
  :url "http://example.com/FIXME"
  :uberjar-name "{{name}}.jar"
  :dependencies [[tech.gojek/ziggurat "2.12.0"]
                 [org.apache.logging.log4j/log4j-core "2.7"]
                 [org.apache.logging.log4j/log4j-slf4j-impl "2.7"]
                 [org.clojure/clojure "1.9.0"]]
  :java-source-paths ["src"]
  :jvm-opts ["-server" "-XX:-OmitStackTraceInFastThrow"]
  :main ^:skip-aot {{name}}.main
  :profiles {:uberjar {:aot         :all
                       :main        {{name}}.main
                       :global-vars {*warn-on-reflection* true}}}
  :plugins [])
