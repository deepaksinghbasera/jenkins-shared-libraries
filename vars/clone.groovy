def call(string url, String branch){
  echo "Cloning repository..."
  git url: "${url}", branch: "${branch}"
  echo "cloning done"
}
