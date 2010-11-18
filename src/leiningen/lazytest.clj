(ns leiningen.lazytest
  (:use [leiningen.compile :only [eval-in-project]]))

(defn lazytest [project]
  (eval-in-project
   project      
   `(do        
      (require 'lazytest.watch)       
      (System/exit (lazytest.watch/start ["src" "test/unit"])))))


