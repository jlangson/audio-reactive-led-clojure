(ns audio-reactive-led-strip-clojure.simulated)

(defn- input []
  (int (Math/floor (rand 256))))                ;TODO should this be 256?

(defn- input->output [input])

(defn- output->led [output])

(defn run-simulated [input]
  (-> input
      input->output
      output->led))

(comment
  ;todo loop this
  (run-simulated input)
 )