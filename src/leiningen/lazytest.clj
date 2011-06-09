(ns leiningen.lazytest
  (:use [leiningen.compile :only [eval-in-project]]))


(defn lazytest "Runs lazytest watch on paths supplied in :lazytest-path [\"src\" \"test\"]"  [project]
  (eval-in-project
   project      
   `(do        
      (require 'lazytest.watch)       
      (lazytest.watch/start ~(get project :lazytest-path ["src" "test"])))))


