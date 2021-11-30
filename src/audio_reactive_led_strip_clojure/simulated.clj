(ns audio-reactive-led-strip-clojure.simulated)

(defn- random []
  (int (Math/floor (rand 256))))                ;should this be 256?

;The packet encoding scheme is:
;|i|r|g|b|
;where
;i (0 to 255): Index of LED to change (zero-based)
;r (0 to 255): Red value of LED
;g (0 to 255): Green value of LED
;b (0 to 255): Blue value of LED

(defn- make-input []
  {:i (random)
   :r (random)
   :g (random)
   :b (random)})

;;does graphics
;;using clojure2d  https://github.com/Clojure2D/clojure2d
(defn- input->led
  [input])

(defn run-simulated [input]
  (input->led input))




(comment
  (doseq [i (range 10)]
    (run-simulated i))
  )