(ns clj-kondo.impl.overrides
  {:no-doc true})

(defn overrides
  "Overrides var information."
  [idacs]
  (-> idacs
      (assoc-in '[:cljs :defs cljs.core array :var-args-min-arity] 0)
      (assoc-in '[:clj :defs clojure.core def] '{:ns clojure.core
                                                 :name def
                                                 :macro true
                                                 :fixed-arities #{1 2 3}})
      (assoc-in '[:clj :defs clojure.core defn] '{:ns clojure.core
                                                  :name defn
                                                  :macro true
                                                  :var-args-min-arity 2})
      (assoc-in '[:clj :defs clojure.core defn-] '{:ns clojure.core
                                                   :name defn-
                                                   :macro true
                                                   :var-args-min-arity 2})
      (assoc-in '[:clj :defs clojure.core defmacro] '{:ns clojure.core
                                                      :name defmacro
                                                      :macro true
                                                      :var-args-min-arity 2})
      (assoc-in '[:cljc :defs cljs.core :clj def] '{:ns cljs.core
                                                    :name def
                                                    :macro true
                                                    :fixed-arities #{1 2 3}})
      (assoc-in '[:cljc :defs cljs.core :cljs def] '{:ns cljs.core
                                                     :name def
                                                     :macro true
                                                     :fixed-arities #{1 2 3}})
      (assoc-in '[:cljc :defs cljs.core :clj defn ] '{:ns cljs.core
                                                      :name defn
                                                      :macro true
                                                      :var-args-min-arity 2})
      (assoc-in '[:cljc :defs cljs.core :cljs defn] '{:ns cljs.core
                                                      :name defn
                                                      :macro true
                                                      :var-args-min-arity 2})
      (assoc-in '[:cljc :defs cljs.core :clj defn-] '{:ns cljs.core
                                                      :name defn-
                                                      :macro true
                                                      :var-args-min-arity 2})
      (assoc-in '[:cljc :defs cljs.core :cljs defn-] '{:ns cljs.core
                                                       :name defn-
                                                       :macro true
                                                       :var-args-min-arity 2})
      (assoc-in '[:cljc :defs cljs.core :clj defmacro] '{:ns cljs.core
                                                         :name defmacro
                                                         :macro true
                                                         :var-args-min-arity 2})
      (assoc-in '[:cljc :defs cljs.core :cljs defmacro] '{:ns cljs.core
                                                          :name defmacro
                                                          :macro true
                                                          :var-args-min-arity 2})))