(ns plus-one.core
  (:gen-class))

(defn -main
  "(+1)"
  [& args]
  (doall (map (comp println (partial + 1) read-string) (line-seq (java.io.BufferedReader. *in*))))
)
