(ns leiningen.new.ziggurat
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "ziggurat"))

(defn ziggurat
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' ziggurat project.")
    (->files data
             ["CHANGELOG.md" (render "CHANGELOG.md" data)]
             ["README.md" (render "README.md" data)]
             ["test/{{sanitized}}/main_test.clj" (render "test/main_test.clj" data)]
             ["test/{{sanitized}}/fixtures.clj" (render "test/fixtures.clj" data)]
             [".gitignore" (render ".gitignore" data)]
             ["src/{{sanitized}}/main.clj" (render "src/main.clj" data)]
             ["project.clj" (render "project.clj" data)]
             ["resources/config.test.edn" (render "resources/config.test.edn" data)]
             ["resources/config.edn" (render "resources/config.edn" data)])))