def call(Map map = [:]) { 
  def mapcontents = libraryResource "com/map/${map.name}"    
  writeFile file: "${map.name}", text: mapcontents 
  sh "chmod a+rw ./${map.name}"
} 