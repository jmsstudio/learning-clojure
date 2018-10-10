(ns learning-clojure.core)

(defn function1
  "function doc"
  [x, y]
  (println x y "Hello, World!"))

(function1 "Test" "sdf")

(defn teste
  "doc do teste"
  [a]
  (println (concat a " bla")))

(teste "123")

(def lista '(1 2 3))

(map #(+ 1 %) lista)


(defn double-value [val]
  (* val 2))

(double-value 15)

(clojure.repl/doc teste)

(let [first-name "John"
      last-name "Doe"]
  (print first-name last-name))

(for [x (range 10)]
  (str "Number: " x))

