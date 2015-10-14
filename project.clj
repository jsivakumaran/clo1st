(defproject myfirstwebapp "0.1.0-SNAPSHOT"
  :description "A hello world for a Ring based web app"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0-beta1"]
		[ring "0.3.11"]]
  :dev-dependencies [[lein-ring "0.4.5"]]
  :ring {:handler myfirstwebapp.core/app})
