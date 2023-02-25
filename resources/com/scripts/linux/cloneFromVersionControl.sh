WORKSPACE=
remoteURL=
branch=



git rev-parse --resolve-git-dir $WORKSPACE.git
git config remote.origin.url $remoteURL
git --version
git fetch --tags --force --progress -- $remoteURL +refs/heads/*:refs/remotes/origin/*
git rev-parse refs/remotes/origin/$branch^{commit}
git config core.sparsecheckout
git checkout -f ed4c1971da709fbb7b37fcb403052ff3d53f2517
git rev-list --no-walk 7906e2cad486ab28eb1355e05abd03cf51d98ce5


